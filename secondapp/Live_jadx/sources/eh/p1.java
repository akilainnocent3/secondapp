package eh;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class p1 extends Exception {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f81160b;

    public p1(String str) {
        this(str, -9223372036854775807L);
    }

    public static p1 a(Exception exc) {
        return b(exc, -9223372036854775807L);
    }

    public static p1 b(Exception exc, long j10) {
        return exc instanceof p1 ? (p1) exc : new p1(exc, j10);
    }

    public p1(String str, long j10) {
        super(str);
        this.f81160b = j10;
    }

    public p1(String str, Throwable th2) {
        this(str, th2, -9223372036854775807L);
    }

    public p1(String str, Throwable th2, long j10) {
        super(str, th2);
        this.f81160b = j10;
    }

    public p1(Throwable th2) {
        this(th2, -9223372036854775807L);
    }

    public p1(Throwable th2, long j10) {
        super(th2);
        this.f81160b = j10;
    }
}
