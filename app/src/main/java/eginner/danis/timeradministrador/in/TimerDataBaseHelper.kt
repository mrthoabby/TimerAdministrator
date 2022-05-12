package eginner.danis.timeradministrador.`in`

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import eginner.danis.timeradministrador.Helpers.DATABASE_NAME
import eginner.danis.timeradministrador.Helpers.DATABASE_VERSION
import java.util.*

class TimerDataBaseHelper (context: Context?,
                           name:String = DATABASE_NAME,
                           factory:SQLiteDatabase.CursorFactory? = null,
                           version:Int = DATABASE_VERSION) : SQLiteOpenHelper(context,name,factory,version){
    override fun onCreate(database: SQLiteDatabase?) {
        TimerDataBaseConstract.CreateEntries(database)
    }

    override fun onUpgrade(database: SQLiteDatabase?, p1: Int, p2: Int) {
        TimerDataBaseConstract.DropAllTables(database)
        onCreate(database)
    }


}