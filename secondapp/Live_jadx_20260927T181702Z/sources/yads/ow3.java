package yads;

import android.webkit.WebView;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class ow3 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f153638b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ qw3 f153639c;

    public ow3(qw3 qw3Var, float f10) {
        this.f153639c = qw3Var;
        this.f153638b = f10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        jx3 jx3Var = this.f153639c.f154647b.f157116e;
        float f10 = this.f153638b;
        jx3Var.f151304a = f10;
        if (jx3Var.f151308e == null) {
            jx3Var.f151308e = nw3.f153242c;
        }
        Iterator it = Collections.unmodifiableCollection(jx3Var.f151308e.f153244b).iterator();
        while (it.hasNext()) {
            ka kaVar = ((wv3) it.next()).f157552e;
            ix3.f150854a.a((WebView) kaVar.f151443b.get(), "setDeviceVolume", Float.valueOf(f10), kaVar.f151442a);
        }
    }
}
