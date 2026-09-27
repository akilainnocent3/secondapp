package yads;

import android.app.KeyguardManager;
import android.content.Context;
import android.webkit.WebView;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class lx3 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final lx3 f152212d = new lx3();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public WeakReference f152213a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f152214b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f152215c = false;

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(boolean z10, boolean z11) {
        if ((z11 || z10) == (this.f152215c || this.f152214b)) {
            return;
        }
        Iterator it = Collections.unmodifiableCollection(nw3.f153242c.f153243a).iterator();
        while (it.hasNext()) {
            ka kaVar = ((wv3) it.next()).f157552e;
            boolean z12 = z11 || z10;
            if (kaVar.f151443b.get() != 0) {
                ix3.f150854a.a((WebView) kaVar.f151443b.get(), "setDeviceLockState", z12 ? "locked" : "unlocked");
            }
        }
    }

    public final void a() {
        KeyguardManager keyguardManager;
        Context context = (Context) this.f152213a.get();
        if (context == null || (keyguardManager = (KeyguardManager) context.getSystemService("keyguard")) == null) {
            return;
        }
        boolean zIsDeviceLocked = keyguardManager.isDeviceLocked();
        a(this.f152214b, zIsDeviceLocked);
        this.f152215c = zIsDeviceLocked;
    }
}
