package sg.bigo.ads.core.player.a;

/* JADX INFO: loaded from: classes7.dex */
public class i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    a f135193b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    volatile boolean f135195d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public sg.bigo.ads.common.h.a f135196e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f135192a = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final Object f135194c = new Object();

    public final int a(byte[] bArr, long j10) throws j {
        if (j10 < 0) {
            sg.bigo.ads.common.t.a.a(0, "ProxyCache", "buffer or offset or length is wrong");
            return 0;
        }
        int i10 = 0;
        while (!this.f135193b.c() && this.f135193b.a() < 8192 + j10 && !this.f135195d) {
            i10++;
            synchronized (this.f135192a) {
                try {
                    sg.bigo.ads.common.t.a.a(0, 3, "ProxyCache", "wait for downloading. thread=" + Thread.currentThread().getName() + ",url=" + this.f135196e.f133058b + ",count=" + i10);
                    this.f135192a.wait(1000L);
                } catch (InterruptedException e10) {
                    sg.bigo.ads.common.t.a.a(0, "ProxyCache", "Waiting source data is interrupted!" + e10.toString());
                }
            }
            if (i10 >= 15) {
                sg.bigo.ads.common.t.a.a(0, "ProxyCache", "wait for downloading more than 15s.");
                throw new j("Error reading source " + i10 + " times");
            }
        }
        int iA = this.f135193b.a(bArr, j10);
        if (iA <= 0) {
            sg.bigo.ads.common.t.a.a(0, 3, "ProxyCache", "read end, size = ".concat(String.valueOf(iA)));
        }
        return iA;
    }
}
