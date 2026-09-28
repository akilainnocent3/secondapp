import org.soccerarena.auth.Lease;
public class LeaseTest {
    static void eq(long expected,long actual) { if(expected!=actual)throw new AssertionError(expected+" != "+actual); }
    public static void main(String[] args) throws Exception {
        long server=1700000000000L;
        eq(61000,Lease.deadline(true,server,server+86400000,1000,2000,60));
        eq(6000,Lease.deadline(true,server,server+5000,1000,2000,60));
        eq(0,Lease.deadline(false,server,server+5000,1000,2000,60));
        eq(0,Lease.deadline(true,server,server,1000,2000,60));
        eq(0,Lease.deadline(true,server,server-1,1000,2000,60));
        eq(0,Lease.deadline(true,server,server+500,1000,2000,60));
        eq(0,Lease.deadline(true,server,server+5000,2000,1000,60));
        eq(0,Lease.deadline(true,server,server+5000,1000,2000,0));
        eq(31000,Lease.deadline(true,server,server+86400000,1000,2000,30));
        eq(61000,Lease.deadline(true,server,server+86400000,1000,2000,Integer.MAX_VALUE));
        if(Lease.valid(6000,6000)||Lease.valid(0,1)||!Lease.valid(6000,5999))throw new AssertionError("Deadline boundary");
        eq(100,Lease.serverTime("1970-01-01T00:00:00.1Z"));
        eq(123,Lease.serverTime("1970-01-01T00:00:00.123456+00:00"));
        eq(0,Lease.serverTime("1970-01-01T03:00:00+03:00"));
        try { Lease.serverTime("2026-02-31T00:00:00Z"); throw new AssertionError("Invalid date accepted"); } catch(java.text.ParseException expected) {}
        System.out.println("PASS: 15 lease/deadline, denial, latency, timestamp and boundary checks");
    }
}
