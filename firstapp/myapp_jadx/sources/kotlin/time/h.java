package kotlin.time;

/* JADX INFO: loaded from: classes8.dex */
public final class h implements i {
    public static final h a = new h();
    public static final long b = System.nanoTime();

    public static long b() {
        return System.nanoTime() - b;
    }

    @Override // kotlin.time.i
    public final TimeMark a() {
        return new i.a.C0776a(b());
    }

    public final String toString() {
        return "TimeSource(System.nanoTime())";
    }
}
