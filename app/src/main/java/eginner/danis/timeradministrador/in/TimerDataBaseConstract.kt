package eginner.danis.timeradministrador.`in`

import android.database.sqlite.SQLiteDatabase
import android.provider.BaseColumns

object TimerDataBaseConstract {
    object ActivityEntry:BaseColumns{
        const val TABLE_NAME = "activity"
        const val ACTIVITY_ID = "activity_id"
        const val ACTIVITY_NAME = "activitity_name"
        const val ACTIVITY_DESCRIPTION = "activity_description"
        const val ACTIVITY_TIME = "activity_time"

        const val SQL_CREATE_ENTRIES: String = "CREATE TABLE $TABLE_NAME (" +
                "$ACTIVITY_ID INTEGER PRIMARY KEY," +
                "$ACTIVITY_NAME TEXT NOT NULL," +
                "$ACTIVITY_DESCRIPTION TEXT NOT NULL," +
                "$ACTIVITY_TIME INTEGER NOT NULL)"

        const val DROPTABLE = "DROP TABLE IF EXIST $TABLE_NAME"
    }

    fun CreateEntries(db:SQLiteDatabase?) = db?.execSQL(ActivityEntry.SQL_CREATE_ENTRIES)
    fun DropAllTables(db:SQLiteDatabase?) = db?.execSQL(ActivityEntry.DROPTABLE)

}