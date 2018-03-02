// Part 1 about the 3n+1 conjecture
//=================================

object CW6a {

//(1) Complete the collatz function below. It should
//    recursively calculate the number of steps needed 
//    until the collatz series reaches the number 1.
//    If needed, you can use an auxiliary function that
//    performs the recursion. The function should expect
//    arguments in the range of 1 to 1 Million.

  //for a function that just recursively gets the next step until its equal to one:

def collatz(n: Long, t: Long =1) : Long = {
  if(n == 1) t else if(n%2 == 1) collatz(3*n+1, t+1) else collatz(n/2, t+1)
} //the expression



//(2)  Complete the collatz-bound function below. It should
//     calculate how many steps are needed for each number 
//     from 1 up to a bound and then calculate the maximum number of
//     steps and the corresponding number that needs that many 
//     steps. Again, you should expect bounds in the range of 1
//     up to 1 Million. The first component of the pair is
//     the maximum number of steps and the second is the 
//     corresponding number.

def collatz_max(bnd: Long) : (Long, Long) = {
  val collatzList = (1 to bnd.toInt).toList.map(n => collatz(n))
  val maxC = collatzList.max
  (maxC, collatzList.indexOf(maxC)+1)
}

}