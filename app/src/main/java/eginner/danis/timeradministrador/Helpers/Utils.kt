package eginner.danis.timeradministrador.Helpers

const val DATABASE_NAME = "administrator_time_danis"
const val DATABASE_VERSION = 1


enum class RangesTime{
    FIVE,
    TEEN,
    FIVETEEN,
    TWENTY,
    THREERTEEN,
    FOURTEEN,
}

enum class IntervalsTime(){
    FIVE,
    TEEN,
    FIVETEEN,
    TWENTY,
}

object Utils{
    fun getTime(time: RangesTime):Int = when(time){
            RangesTime.FIVE -> 5
            RangesTime.TEEN -> 10
            RangesTime.FIVETEEN -> 15
            RangesTime.TWENTY -> 20
            RangesTime.THREERTEEN -> 30
            RangesTime.FOURTEEN -> 40
    }

    fun getInterval(time: IntervalsTime):Int = when(time){
        IntervalsTime.FIVE -> 5
        IntervalsTime.TEEN -> 10
        IntervalsTime.FIVETEEN -> 15
        IntervalsTime.TWENTY -> 20
    }


}
