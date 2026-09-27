package sg.bigo.ads.common.f;

import android.os.SystemClock;

/* JADX INFO: loaded from: classes7.dex */
public final class a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final a f132914e = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    boolean f132915a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    long f132916b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    long f132917c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public InterfaceC1343a f132918d;

    /* JADX INFO: renamed from: sg.bigo.ads.common.f.a$a, reason: collision with other inner class name */
    public interface InterfaceC1343a {
        void a(long j10, long j11);

        void a(boolean z10, long j10, long j11, long j12);
    }

    private a() {
        b();
    }

    public static a a() {
        return f132914e;
    }

    public final void b() {
        this.f132916b = SystemClock.elapsedRealtime();
        this.f132917c = System.currentTimeMillis();
    }

    public final boolean c() {
        return this.f132916b > 0;
    }
}
