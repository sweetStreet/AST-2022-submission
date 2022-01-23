package main;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import tests.PasswordManagerAddEntryTest;
import tests.PasswordManagerAddMultipleEntriesTest;
import tests.PasswordManagerAddTagTest;
import tests.PasswordManagerAssignTagToEntryTest;
import tests.PasswordManagerCheckEntryTagsRemovedTest;
import tests.PasswordManagerCheckUsedTagsTest;
import tests.PasswordManagerEditEntryTest;
import tests.PasswordManagerEditTagTest;
import tests.PasswordManagerRemoveEntryTest;
import tests.PasswordManagerRemoveMultipleEntriesTest;
import tests.PasswordManagerRemoveTagTest;
import tests.PasswordManagerRemoveTagsTest;
import tests.PasswordManagerSearchAndRemoveMultipleTagsTest;
import tests.PasswordManagerSearchEntryByCommentTest;
import tests.PasswordManagerSearchEntryByNameTest;
import tests.PasswordManagerSearchEntryByTagListTest;
import tests.PasswordManagerSearchEntryByTagsTest;
import tests.PasswordManagerSearchEntryByUrlTest;
import tests.PasswordManagerSearchEntryByUsernameTest;
import tests.PasswordManagerSearchEntryNegativeTest;
import tests.PasswordManagerSearchMultipleEntriesTest;
import tests.PasswordManagerSearchTagNegativeTest;
import tests.PasswordManagerSearchTagsTest;


@RunWith(Suite.class)
@SuiteClasses({

		PasswordManagerAddEntryTest.class,
		PasswordManagerSearchEntryByNameTest.class,
		PasswordManagerSearchEntryByUsernameTest.class,
		PasswordManagerSearchEntryByUrlTest.class,
		PasswordManagerSearchEntryByTagsTest.class,
		PasswordManagerSearchEntryByCommentTest.class,
		PasswordManagerSearchEntryByTagListTest.class,
		PasswordManagerEditEntryTest.class,

		PasswordManagerSearchTagsTest.class,
		PasswordManagerRemoveTagsTest.class,
		PasswordManagerCheckEntryTagsRemovedTest.class,
		PasswordManagerRemoveEntryTest.class,
		PasswordManagerSearchEntryNegativeTest.class,
		PasswordManagerSearchTagNegativeTest.class,
		PasswordManagerAddTagTest.class,
		PasswordManagerEditTagTest.class,
		PasswordManagerRemoveTagTest.class,

		PasswordManagerAssignTagToEntryTest.class,
		PasswordManagerAddMultipleEntriesTest.class,
		PasswordManagerSearchMultipleEntriesTest.class,
		PasswordManagerCheckUsedTagsTest.class,
		PasswordManagerSearchAndRemoveMultipleTagsTest.class,
		PasswordManagerRemoveMultipleEntriesTest.class
})

public class TestSuite {}
