package io.ticofab.approaches

import io.ticofab.Item

/**
  * jobs-processing-approaches
  * Created by fabiotiriticco on 26/02/2017.
  */
trait Worker {
  def work(item: Item)
}
