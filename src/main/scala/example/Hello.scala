package example

import lift.arithmetic._
import opencl.generator.{get_group_id, get_local_id}

object LiftSample extends App {
  val grpId = get_group_id(0,new RangeAdd(0,131072,1))
  val e = ceil(grpId)
  val min_e = e.min
  Console.println(min_e, Cst(0))
}

