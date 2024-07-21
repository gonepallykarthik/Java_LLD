package OOP_LLD.Practice;

import java.util.ArrayList;
import java.util.List;

class ExamRoom {
    public int[] seats;
    public int n;
    public ExamRoom(int N) {
        // Initialize your data structure here.
        this.seats = new int[N];
        this.n = N;
    }

    public int seat() {
        // Insert logic for seating a student.
        if(this.seats.length == 0) {
            // first seat
            this.seats[0] = 1;
            return 0;
        }
        if(this.seats.length == 1) {
            this.seats[n-1] = 1;
        }

        return -1;
    }

    public void leave(int p) {
        // Insert logic for a student leaving their seat.
        this.seats[p] = 0;
    }
}

// Your ExamRoom object will be instantiated and called as such:
// ExamRoom obj = new ExamRoom(n);
// int param_1 = obj.seat();
// obj.leave(p);
