package io.kaitai.struct.format

import scala.collection.mutable

/**
  * Top-level abstract container for all ClassSpecs. Used for recursive
  * loading of imports. Real-life implementation depend on file handling
  * (which at least differ between JVM vs JS), and thus implementations
  * are platform-dependent.
  */
abstract class ClassSpecs extends mutable.HashMap[String, ClassSpec] {
  def importRelative(name: List[String]): Option[ClassSpec]
  def importAbsolute(name: List[String]): Option[ClassSpec]
}