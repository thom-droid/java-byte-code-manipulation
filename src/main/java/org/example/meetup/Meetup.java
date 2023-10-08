package org.example.meetup;

public class Meetup {

    int numberOfMaxAttendance;
    int numberOfCurrentAttendees;

    public boolean isFull() {

        if (numberOfCurrentAttendees == 0 || numberOfCurrentAttendees < numberOfMaxAttendance) {
            return false;
        }

        return true;
    }
}
