package u4;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@x4.m1
public final class j5 extends Exception {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f138583b;

    public j5(String str) {
        this(str, -9223372036854775807L);
    }

    public static j5 a(Exception exc) {
        return b(exc, -9223372036854775807L);
    }

    public static j5 b(Exception exc, long j10) {
        return exc instanceof j5 ? (j5) exc : new j5(exc, j10);
    }

    public static String c(long j10) {
        if (j10 == -9223372036854775807L) {
            return " @UNSET";
        }
        return jv.l0.f100827a + j10;
    }

    public j5(String str, long j10) {
        super(str + c(j10));
        this.f138583b = j10;
    }

    public j5(String str, Throwable th2) {
        this(str, th2, -9223372036854775807L);
    }

    public j5(String str, Throwable th2, long j10) {
        super(str + c(j10), th2);
        this.f138583b = j10;
    }

    public j5(Throwable th2) {
        this(th2, -9223372036854775807L);
    }

    public j5(Throwable th2, long j10) {
        super(c(j10), th2);
        this.f138583b = j10;
    }
}
