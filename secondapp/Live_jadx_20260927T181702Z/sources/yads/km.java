package yads;

import android.content.Context;
import android.view.ViewGroup;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class km extends rm2 {
    public final tc1 C;
    public final jm D;
    public final lh3 E;
    public final mm F;
    public final lm G;
    public final i12 H;
    public final ri0 I;
    public um J;
    public um K;

    public km(Context context, tc1 tc1Var, jm jmVar, w5 w5Var, lh3 lh3Var, mm mmVar, lm lmVar, i12 i12Var, ri0 ri0Var) {
        super(context, tc1Var, w5Var);
        this.C = tc1Var;
        this.D = jmVar;
        this.E = lh3Var;
        this.F = mmVar;
        this.G = lmVar;
        this.H = i12Var;
        this.I = ri0Var;
        a(tc1Var);
        jmVar.a(i12Var);
    }

    public static void a(tc1 tc1Var) {
        tc1Var.setHorizontalScrollBarEnabled(false);
        tc1Var.setVerticalScrollBarEnabled(false);
        tc1Var.setVisibility(8);
        tc1Var.setBackgroundColor(0);
    }

    @Override // yads.rm2, yads.zn
    public final void c() {
        super.c();
        jm jmVar = this.D;
        jmVar.f151151c = null;
        jmVar.f151150b.a(null);
        mk3.a(this.C, true);
        this.C.setVisibility(8);
        kl3.a((ViewGroup) this.C);
    }

    @Override // yads.zn
    public final void d() {
        um[] umVarArr = {this.J, this.K};
        for (int i10 = 0; i10 < 2; i10++) {
            um umVar = umVarArr[i10];
            if (umVar != null) {
                umVar.a(this.f158920a);
            }
        }
        super.d();
    }

    @Override // yads.zn
    public final void l() {
        super.l();
        um umVar = this.J;
        if (umVar != this.K) {
            um umVar2 = new um[]{umVar}[0];
            if (umVar2 != null) {
                umVar2.a(this.f158920a);
            }
            this.J = this.K;
        }
        a03 a03Var = this.f158922c.f148056d.f147002a;
        if (zz2.f159114d != (a03Var != null ? a03Var.b() : null) || this.C.getLayoutParams() == null) {
            return;
        }
        this.C.getLayoutParams().height = -2;
    }

    public final tc1 r() {
        return this.C;
    }

    @Override // yads.up2
    public final void a(Object obj) {
        vm rv2Var;
        v9 v9Var = (v9) obj;
        synchronized (this) {
            this.f158921b.a(v5.f156760s);
            this.f158941v = v9Var;
        }
        this.H.f150382d = v9Var;
        lm lmVar = this.G;
        lmVar.getClass();
        hq1 hq1Var = v9Var.f156838q;
        if (hq1Var != null) {
            rv2Var = new ap1(v9Var, hq1Var);
        } else {
            rv2Var = new rv2(lmVar.f152048a);
        }
        um umVarA = rv2Var.a(this);
        this.K = umVarA;
        umVarA.a(this.f158920a, v9Var);
    }
}
