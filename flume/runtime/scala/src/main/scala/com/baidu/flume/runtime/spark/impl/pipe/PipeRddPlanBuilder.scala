/***************************************************************************
 *
 * Copyright (c) 2017 Baidu, Inc. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 **************************************************************************/

package com.baidu.flume.runtime.spark.impl.pipe

import baidu.flume.PhysicalPlan.{PbJob, PbSparkTask}
import com.baidu.flume.runtime.spark.RddPlanBuilder
import org.apache.spark.rdd.RDD
import org.apache.spark.{SparkContext, TaskContext}

/**
  * A [[RddPlanBuilder]] that builds Pipe-based Rdd plans
  *
  * Note: PipeRddPlanBuilder is considered removed but kept for future improvement.
  * @author Wang, Cong(bigflow-opensource@baidu.com)
  */
class PipeRddPlanBuilder extends RddPlanBuilder {
  type CacheRddMap = RddPlanBuilder.CacheRddMap

  override def build(context: SparkContext, pbJob: PbJob, cacheRdds: CacheRddMap)
      : Option[RDD[(Array[Byte], Array[Byte])]] = {
    None
  }
}

