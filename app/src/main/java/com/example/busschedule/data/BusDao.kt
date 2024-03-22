package com.example.busschedule.data

import androidx.room.Dao
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

@Dao
interface BusDao {

    //Get all bus stops and times
    @Query("SELECT * from Schedule ORDER BY arrival_time ASC")
    fun getAllItems(): Flow<List<BusSchedule>>

    //Get all times of a bus stop
    @Query("SELECT * from Schedule WHERE stop_name = :stopName ORDER BY arrival_time ASC ")
    fun getItem(stopName: String): Flow<List<BusSchedule>>

}