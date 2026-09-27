package androidx.media3.session;

import android.os.HandlerThread;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ij implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ HandlerThread f15405b;

    @Override // java.lang.Runnable
    public final void run() {
        this.f15405b.quit();
    }
}
