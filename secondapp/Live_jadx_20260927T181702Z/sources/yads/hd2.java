package yads;

import android.graphics.SurfaceTexture;
import android.view.Surface;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class hd2 extends Surface {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static int f150067e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static boolean f150068f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f150069b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final gd2 f150070c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f150071d;

    public hd2(gd2 gd2Var, SurfaceTexture surfaceTexture, boolean z10) {
        super(surfaceTexture);
        this.f150070c = gd2Var;
        this.f150069b = z10;
    }

    @Override // android.view.Surface
    public final void release() {
        super.release();
        synchronized (this.f150070c) {
            try {
                if (!this.f150071d) {
                    gd2 gd2Var = this.f150070c;
                    gd2Var.f149559c.getClass();
                    gd2Var.f149559c.sendEmptyMessage(2);
                    this.f150071d = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
