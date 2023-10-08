package org.example.meetup;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class MeetupTest {

    @Test
    public void isFullTest() {
        Meetup meetup = new Meetup();
        meetup.numberOfMaxAttendance = 100;
        meetup.numberOfCurrentAttendees = 10;

        Assert.assertFalse(meetup.isFull());
    }

}