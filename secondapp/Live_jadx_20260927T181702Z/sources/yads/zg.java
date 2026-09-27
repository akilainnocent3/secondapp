package yads;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class zg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sh1 f158802a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dw2 f158803b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f158804c;

    public /* synthetic */ zg(Context context) {
        sh1 sh1Var = new sh1();
        Object obj = dw2.f148384j;
        this(context, sh1Var, cw2.a());
    }

    public final boolean a() {
        sh1 sh1Var = this.f158802a;
        Context context = this.f158804c;
        sh1Var.getClass();
        Boolean bool = (Boolean) sh1.a(context, th1.f155906i.f155909b);
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    public final boolean b() {
        nt2 nt2VarA = this.f158803b.a(this.f158804c);
        boolean z10 = nt2VarA != null && nt2VarA.f153181q0;
        sh1 sh1Var = this.f158802a;
        Context context = this.f158804c;
        sh1Var.getClass();
        Boolean bool = (Boolean) sh1.a(context, th1.f155905h.f155909b);
        return a() && !z10 && (bool != null ? bool.booleanValue() : true);
    }

    public final boolean c() {
        nt2 nt2VarA = this.f158803b.a(this.f158804c);
        return a() && (nt2VarA != null && nt2VarA.I);
    }

    public zg(Context context, sh1 sh1Var, dw2 dw2Var) {
        this.f158802a = sh1Var;
        this.f158803b = dw2Var;
        this.f158804c = uz.a(context);
    }
}
