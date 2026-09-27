package yads;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import io.appmetrica.analytics.AppMetrica;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class wg implements dh {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final long f157366g = TimeUnit.SECONDS.toMillis(30);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ug f157367a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fh f157368b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f157371e;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Handler f157369c = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final rg f157370d = new rg();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f157372f = new Object();

    public wg(ug ugVar, fh fhVar) {
        this.f157367a = ugVar;
        this.f157368b = fhVar;
    }

    public final void a() {
        boolean z10 = ad1.f146762a;
        ug ugVar = this.f157367a;
        synchronized (ugVar.f156415a) {
            ugVar.f156416b.clear();
            dr.w2 w2Var = dr.w2.f79517a;
        }
    }

    public final void b() {
        final vg vgVar = new vg(this);
        this.f157369c.postDelayed(new Runnable() { // from class: yads.hd4
            @Override // java.lang.Runnable
            public final void run() {
                wg.a(vgVar);
            }
        }, f157366g);
    }

    public final void c() {
        synchronized (this.f157372f) {
            this.f157369c.removeCallbacksAndMessages(null);
            this.f157371e = false;
            dr.w2 w2Var = dr.w2.f79517a;
        }
    }

    public static final void a(ds.a aVar) {
        aVar.invoke();
    }

    public final void a(Context context) {
        boolean z10;
        synchronized (this.f157372f) {
            try {
                if (this.f157371e) {
                    z10 = false;
                } else {
                    z10 = true;
                    this.f157371e = true;
                }
                dr.w2 w2Var = dr.w2.f79517a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (z10) {
            boolean z11 = ad1.f146762a;
            b();
            this.f157368b.getClass();
            try {
                AppMetrica.requestStartupParams(context, new hh(this), ih.f150630a);
            } catch (Throwable unused) {
                boolean z12 = ad1.f146762a;
                ch chVar = ch.f147731b;
                c();
                this.f157370d.f154947a.getClass();
                String str = (String) sg.f155411a.get(chVar);
                if (str == null) {
                    str = "Unknown";
                }
                rg.a(str);
                a();
            }
        }
    }
}
