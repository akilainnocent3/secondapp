package yads;

import android.graphics.drawable.Drawable;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class vj0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final tj0 f156997a = new tj0(ms.u.B(((int) (Runtime.getRuntime().maxMemory() / ((long) 1024))) / 8, androidx.work.e.f20077d));

    public final uj0 a(String str) {
        return (uj0) this.f156997a.get(str);
    }

    public final void a(String str, Drawable drawable, s41 s41Var) {
        this.f156997a.put(str, new uj0(drawable, s41Var));
    }
}
