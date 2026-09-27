package yads;

import android.content.Context;
import android.view.Display;
import android.view.Surface;
import android.view.WindowManager;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class uh3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kv0 f156432a = new kv0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qh3 f156433b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final th3 f156434c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f156435d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Surface f156436e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f156437f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f156438g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f156439h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f156440i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f156441j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f156442k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f156443l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f156444m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f156445n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f156446o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f156447p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f156448q;

    public uh3(Context context) {
        qh3 qh3VarA = a(context);
        this.f156433b = qh3VarA;
        this.f156434c = qh3VarA != null ? th3.a() : null;
        this.f156442k = -9223372036854775807L;
        this.f156443l = -9223372036854775807L;
        this.f156437f = -1.0f;
        this.f156440i = 1.0f;
        this.f156441j = 0;
    }

    public static qh3 a(Context context) {
        if (context == null) {
            return null;
        }
        Context applicationContext = context.getApplicationContext();
        sh3 sh3VarA = ib3.f150516a >= 17 ? sh3.a(applicationContext) : null;
        if (sh3VarA != null) {
            return sh3VarA;
        }
        WindowManager windowManager = (WindowManager) applicationContext.getSystemService("window");
        if (windowManager != null) {
            return new rh3(windowManager);
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0077  */
    public final void b() {
        float f10;
        float f11;
        if (ib3.f150516a < 30 || this.f156436e == null) {
            return;
        }
        if (this.f156432a.f151719a.a()) {
            kv0 kv0Var = this.f156432a;
            if (kv0Var.f151719a.a()) {
                jv0 jv0Var = kv0Var.f151719a;
                long j10 = jv0Var.f151274e;
                f10 = (float) (1.0E9d / (j10 != 0 ? jv0Var.f151275f / j10 : 0L));
            } else {
                f10 = -1.0f;
            }
        } else {
            f10 = this.f156437f;
        }
        float f12 = this.f156438g;
        if (f10 == f12) {
            return;
        }
        if (f10 != -1.0f && f12 != -1.0f) {
            if (this.f156432a.f151719a.a()) {
                kv0 kv0Var2 = this.f156432a;
                if ((kv0Var2.f151719a.a() ? kv0Var2.f151719a.f151275f : -9223372036854775807L) >= 5000000000L) {
                    f11 = 0.02f;
                } else {
                    f11 = 1.0f;
                }
            } else {
                f11 = 1.0f;
            }
            if (Math.abs(f10 - this.f156438g) < f11) {
                return;
            }
        } else if (f10 == -1.0f && this.f156432a.f151723e < 30) {
            return;
        }
        this.f156438g = f10;
        a(false);
    }

    public final void a() {
        this.f156435d = true;
        this.f156444m = 0L;
        this.f156447p = -1L;
        this.f156445n = -1L;
        if (this.f156433b != null) {
            th3 th3Var = this.f156434c;
            th3Var.getClass();
            th3Var.f155919c.sendEmptyMessage(1);
            this.f156433b.a(new ph3() { // from class: yads.yb4
                @Override // yads.ph3
                public final void a(Display display) {
                    this.f158222a.a(display);
                }
            });
        }
        a(false);
    }

    public final void a(Display display) {
        if (display != null) {
            long refreshRate = (long) (1.0E9d / ((double) display.getRefreshRate()));
            this.f156442k = refreshRate;
            this.f156443l = (refreshRate * 80) / 100;
        } else {
            ih1.d("VideoFrameReleaseHelper", "Unable to query display refresh rate");
            this.f156442k = -9223372036854775807L;
            this.f156443l = -9223372036854775807L;
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0021  */
    public final void a(boolean z10) {
        Surface surface;
        float f10;
        if (ib3.f150516a < 30 || (surface = this.f156436e) == null || this.f156441j == Integer.MIN_VALUE) {
            return;
        }
        if (this.f156435d) {
            float f11 = this.f156438g;
            if (f11 != -1.0f) {
                f10 = f11 * this.f156440i;
            } else {
                f10 = 0.0f;
            }
        } else {
            f10 = 0.0f;
        }
        if (z10 || this.f156439h != f10) {
            this.f156439h = f10;
            oh3.a(surface, f10);
        }
    }
}
