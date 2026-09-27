package sg.bigo.ads.common.utils;

import android.os.SystemClock;

/* JADX INFO: loaded from: classes7.dex */
public class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final r f133428a = new r() { // from class: sg.bigo.ads.common.utils.r.1
        @Override // sg.bigo.ads.common.utils.r
        public final long a(int i10) {
            return ((long) i10) * 1000;
        }
    };

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final r f133429b = new r() { // from class: sg.bigo.ads.common.utils.r.2
        @Override // sg.bigo.ads.common.utils.r
        public final long a(int i10) {
            return ((long) i10) * 60000;
        }
    };

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final r f133430c = new r() { // from class: sg.bigo.ads.common.utils.r.3
        @Override // sg.bigo.ads.common.utils.r
        public final long a(int i10) {
            return ((long) i10) * 3600000;
        }
    };

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final r f133431d = new r() { // from class: sg.bigo.ads.common.utils.r.4
        @Override // sg.bigo.ads.common.utils.r
        public final long a(int i10) {
            return ((long) i10) * 86400000;
        }
    };

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static a f133432e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static long f133433f = 1619452800;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f133434a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f133435b = SystemClock.elapsedRealtime();

        public a(long j10) {
            this.f133434a = j10;
        }

        public final long a() {
            return this.f133434a + (SystemClock.elapsedRealtime() - this.f133435b);
        }
    }

    private r() {
    }

    public static long a() {
        long jCurrentTimeMillis = System.currentTimeMillis() - sg.bigo.ads.common.x.a.e();
        if (jCurrentTimeMillis > 0) {
            return jCurrentTimeMillis;
        }
        sg.bigo.ads.common.x.a.f();
        return System.currentTimeMillis();
    }

    public static long b() {
        a aVar = f133432e;
        return aVar == null ? System.currentTimeMillis() : aVar.a();
    }

    public /* synthetic */ r(byte b10) {
        this();
    }

    public long a(int i10) {
        return i10;
    }

    public static void a(long j10) {
        if (j10 < f133433f) {
            return;
        }
        a aVar = new a(j10 * 1000);
        if (f133432e == null) {
            f133432e = aVar;
        } else if (aVar.a() > f133432e.a()) {
            f133432e = aVar;
        }
    }
}
