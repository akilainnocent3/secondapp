package yads;

import android.graphics.Bitmap;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class d41 implements up2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f148068a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k41 f148069b;

    public d41(k41 k41Var, String str) {
        this.f148069b = k41Var;
        this.f148068a = str;
    }

    @Override // yads.up2
    public final void a(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        k41 k41Var = this.f148069b;
        String str = this.f148068a;
        ((t82) k41Var.f151385b).a(str, bitmap);
        g41 g41Var = (g41) k41Var.f151386c.remove(str);
        if (g41Var != null) {
            g41Var.f149387b = bitmap;
            k41Var.f151387d.put(str, g41Var);
            if (k41Var.f151389f == null) {
                f41 f41Var = new f41(k41Var);
                k41Var.f151389f = f41Var;
                k41Var.f151388e.postDelayed(f41Var, 100);
            }
        }
    }
}
