package eginner.danis.timeradministrador.`in`

import eginner.danis.timeradministrador.Entities.Activity
import eginner.danis.timeradministrador.`in`.TimerDataBaseConstract.ActivityEntry
import eginner.danis.timeradministrador.`in`.TimerDataBaseHelper

class TimerDataManager {
    fun GetAllActivitys(dbHelper:TimerDataBaseHelper):Array<Activity>{
        val database = dbHelper.readableDatabase
        val activitysCursor = database.rawQuery("SELECT * FROM ${ActivityEntry.TABLE_NAME}",null)
        val indexColumName = activitysCursor.getColumnIndex(ActivityEntry.ACTIVITY_NAME)
        val indexColumnDescription = activitysCursor.getColumnIndex(ActivityEntry.ACTIVITY_DESCRIPTION)
        val indexColumnTime = activitysCursor.getColumnIndex(ActivityEntry.ACTIVITY_TIME)
        var activitysArray = arrayOf<Activity>()
        while (activitysCursor.moveToNext()){
            activitysArray += Activity(
                activitysCursor.getString(indexColumName),
                activitysCursor.getString(indexColumnDescription),
                activitysCursor.getInt(indexColumnTime))
        }
        activitysCursor.close()
        return  activitysArray
    }
}