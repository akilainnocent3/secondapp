package yads;

import java.io.UnsupportedEncodingException;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class h43 extends po2 {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Object f149931s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public up2 f149932t;

    public h43(String str, up2 up2Var, tp2 tp2Var) {
        super(0, str, tp2Var);
        this.f149931s = new Object();
        this.f149932t = up2Var;
    }

    @Override // yads.po2
    public final void a() {
        super.a();
        synchronized (this.f149931s) {
            this.f149932t = null;
        }
    }

    @Override // yads.po2
    public final void a(Object obj) {
        up2 up2Var;
        String str = (String) obj;
        synchronized (this.f149931s) {
            up2Var = this.f149932t;
        }
        if (up2Var != null) {
            up2Var.a(str);
        }
    }

    @Override // yads.po2
    public final vp2 a(e82 e82Var) {
        String str;
        try {
            str = new String(e82Var.f148572b, v11.a(e82Var.f148573c));
        } catch (UnsupportedEncodingException unused) {
            str = new String(e82Var.f148572b);
        }
        return new vp2(str, v11.a(e82Var));
    }
}
