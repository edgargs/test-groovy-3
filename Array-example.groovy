def avg = [1,2,3,4,5,6].average()
println avg

//avg = ["Edgar","Carmen","Juan","Belen"].average()
avg = ["Edgar","Carmen","Juan","Belen"].average {it.size()}
//avg = ["Edgar","Carmen","Juan","Belen"].average(String::size)
println avg

arrayS = [1,2,3,4,5,6].shuffled()
println arrayS