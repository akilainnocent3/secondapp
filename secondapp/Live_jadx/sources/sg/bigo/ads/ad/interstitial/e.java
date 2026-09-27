package sg.bigo.ads.ad.interstitial;

/* JADX INFO: loaded from: classes7.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    boolean f131702a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    a f131703b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private sg.bigo.ads.common.utils.n f131704c;

    public interface a {
        boolean a(Runnable runnable);
    }

    public final void a() {
        this.f131702a = true;
        sg.bigo.ads.common.utils.n nVar = this.f131704c;
        if (nVar != null) {
            nVar.b();
        }
    }

    @k.i
    public void b() {
        sg.bigo.ads.common.utils.n nVar;
        if (this.f131702a || (nVar = this.f131704c) == null || nVar.f133417i) {
            return;
        }
        nVar.c();
    }

    @k.i
    public void c() {
        sg.bigo.ads.common.utils.n nVar;
        if (this.f131702a || (nVar = this.f131704c) == null || nVar.f133417i) {
            return;
        }
        nVar.d();
    }

    public final void a(int i10, final Runnable runnable) {
        sg.bigo.ads.common.utils.n nVar = this.f131704c;
        if (nVar != null) {
            nVar.b();
        }
        this.f131702a = false;
        sg.bigo.ads.common.utils.n nVar2 = new sg.bigo.ads.common.utils.n(((long) i10) * 1000) { // from class: sg.bigo.ads.ad.interstitial.e.1
            @Override // sg.bigo.ads.common.utils.n
            public final void a() {
                Runnable runnable2;
                e eVar = e.this;
                if (eVar.f131702a || (runnable2 = runnable) == null) {
                    return;
                }
                a aVar = eVar.f131703b;
                if (aVar != null) {
                    aVar.a(runnable2);
                } else {
                    runnable2.run();
                }
            }

            @Override // sg.bigo.ads.common.utils.n
            public final void a(long j10) {
            }
        };
        this.f131704c = nVar2;
        nVar2.c();
    }
}
