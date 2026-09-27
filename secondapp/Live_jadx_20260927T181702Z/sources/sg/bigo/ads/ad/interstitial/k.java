package sg.bigo.ads.ad.interstitial;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.os.SystemClock;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.File;
import sg.bigo.ads.api.AdError;
import sg.bigo.ads.api.InterstitialAd;
import sg.bigo.ads.api.core.b;

/* JADX INFO: loaded from: classes7.dex */
public abstract class k<U extends sg.bigo.ads.api.core.b> extends sg.bigo.ads.ad.d<InterstitialAd, U> implements InterstitialAd {
    protected Rect A;
    private long B;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @Nullable
    protected b f132010z;

    public interface a<T extends k> {
        T getAdInstance(@NonNull sg.bigo.ads.api.core.f fVar);
    }

    public interface b {
        void E();

        void b(String str);
    }

    public k(@NonNull sg.bigo.ads.api.core.f fVar) {
        super(fVar);
    }

    public int A() {
        if (B()) {
            return this.f130935b.f132775b.c();
        }
        return 0;
    }

    public abstract boolean B();

    @k.i
    public final void C() {
        v();
        l();
        this.B = SystemClock.elapsedRealtime();
        sg.bigo.ads.core.d.b.a(this.f130935b.f132774a, this);
    }

    public abstract Class<? extends sg.bigo.ads.controller.e.b<?>> D();

    @k.i
    public void a(int i10, int i11) {
        m();
    }

    public void b(@NonNull Activity activity) {
    }

    public abstract void b(@NonNull sg.bigo.ads.api.b.d.a<InterstitialAd> aVar);

    @Override // sg.bigo.ads.ad.d, sg.bigo.ads.ad.c
    public void destroyInMainThread() {
        super.destroyInMainThread();
        this.f132010z = null;
    }

    @k.i
    public final void e(String str) {
        a(2003, str);
    }

    @Override // sg.bigo.ads.api.InterstitialAd
    public void show() {
        a((Activity) null, true);
    }

    public final void a(int i10, long j10) {
        sg.bigo.ads.core.d.b.a(this.f130935b.f132774a, i10, this.B > 0 ? SystemClock.elapsedRealtime() - this.B : 0L, j10, this);
    }

    @Override // sg.bigo.ads.api.InterstitialAd
    public void show(@Nullable Activity activity) {
        a(activity, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v5, types: [android.app.Activity] */
    private void a(@Nullable Activity activity, boolean z10) {
        sg.bigo.ads.api.a.h hVar;
        a(activity == 0, z10);
        if (activity != 0) {
            b(activity);
        }
        sg.bigo.ads.core.d.b.a(f());
        if (isExpired()) {
            b(2000, 1, "The ad is expired.");
            return;
        }
        if (this.f130942i) {
            b(2000, 1, "The ad is destroyed.");
            return;
        }
        if (p()) {
            a(2003, "This ad cannot be shown repeatedly");
            return;
        }
        try {
            U uF = f();
            if (uF instanceof sg.bigo.ads.api.core.n) {
                sg.bigo.ads.api.core.n nVar = (sg.bigo.ads.api.core.n) uF;
                if (nVar.aR()) {
                    File file = new File(nVar.b(this.f130935b.f132778e));
                    if (!file.exists() && !new File(file.getParentFile(), sg.bigo.ads.common.utils.f.c(file.getName())).exists()) {
                        sg.bigo.ads.core.d.b.a(uF, new AdError(2010, "resource clear."));
                    }
                }
            }
        } catch (Exception unused) {
        }
        if (activity != 0) {
            a(1);
        }
        if (activity == 0 && (hVar = sg.bigo.ads.api.a.i.f132716a) != null && hVar.n().a(16)) {
            activity = sg.bigo.ads.common.f.b.b();
            a(2);
        }
        if (activity == 0) {
            activity = this.f130935b.f132778e;
        }
        int iA = this.Y.a();
        this.Z = iA;
        sg.bigo.ads.api.b.a aVar = this.f132738aa;
        if (aVar != null) {
            aVar.g(iA);
        }
        a(activity);
    }

    public void a(Context context) {
        if (sg.bigo.ads.controller.landing.e.a(context, D(), this, f() != null && f().ar())) {
            return;
        }
        a(2004, "This ad cannot be open");
    }

    public final void a(b bVar) {
        this.f132010z = bVar;
    }

    @Override // sg.bigo.ads.ad.c, sg.bigo.ads.api.b.d
    public final void a(@NonNull sg.bigo.ads.api.b.d.a<InterstitialAd> aVar) {
        super.a(aVar);
        b(aVar);
    }
}
