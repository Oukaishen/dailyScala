object ForLoopTest{
	def main(args: Array[String]){

		println("Hey this is to")
		for(iter <- 1 to 5){
			println("Iter is " + iter)
		}

		println()
		println("Hey this is until")
		for( var iter1 <- 1 until 5){
			println("Iter is " + iter1)
		}
	}
}