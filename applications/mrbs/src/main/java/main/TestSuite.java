package main;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import tests.*;

@RunWith(Suite.class)
@SuiteClasses({

	AddBuildingTest.class,
	AddRoomTest.class,
	CheckBuildingRoomTest.class,
	AddEntryTest.class,
	CheckEntryTest.class,
//	SearchEntryTest.class,

	AddLongNameBuildingNegativeTest.class,
	AddLongNameRoomNegativeTest.class,
	SearchEntryNegativeTest.class,
//	AddConflictualEntryNegativeTest.class,
	RemoveEntryTest.class,
	AddMultipleEntriesSameRoomSameDayTest.class,
	AddMultipleEntriesSameRoomDifferentDaysTest.class,
	SearchMultipleEntriesTest.class,
	RemoveRoomTest.class,
	AddMultipleRoomsTest.class,
	CheckMultipleBuildingRoomsTest.class,
	AddMultipleEntriesDifferentRoomsSameDayTest.class,
	AddMultipleEntriesDifferentRoomsDifferentDaysTest.class,
	CheckMultipleEntriesTest.class,
	RemoveMultipleEntriesTest.class,
	RemoveMultipleRoomsTest.class,
	AddAndRemoveSerialEntryTest.class,
	RemoveBuildingTest.class

})

public class TestSuite {}
