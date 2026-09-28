package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class npf0 {
    public final msw<a> a;
    public long b;
    public long c;
    public long d;

    public final class a {
        public long a;
    }

    public npf0() {
        msw mswVar = hwo.a;
        this.a = new msw<>();
        this.b = 0L;
        this.c = 0L;
    }

    public static void a(a aVar, long j, long j2, long j3) {
        long j4 = aVar.a;
        if (j3 - j4 >= 0 || j4 == Long.MIN_VALUE) {
            aVar.a = j3;
            throw null;
        }
    }
}
