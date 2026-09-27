package yads;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public abstract class fy0 extends h11 {
    public final i12 A;
    public final dy0 B;
    public by0 C;
    public by0 D;
    public qy0 E;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final gy0 f149295y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final ly0 f149296z;

    public /* synthetic */ fy0(Context context, d4 d4Var, lu2 lu2Var, gy0 gy0Var, w5 w5Var, ly0 ly0Var, i12 i12Var) {
        this(context, d4Var, lu2Var, gy0Var, w5Var, ly0Var, i12Var, new dy0(lu2Var));
    }

    public abstract by0 a(cy0 cy0Var);

    @Override // yads.zn
    public final void a(l4 l4Var) {
        this.f149295y.a(l4Var);
    }

    @Override // yads.zn
    public final void d() {
        if (tb.a((mu) this)) {
            return;
        }
        Context context = this.f158920a;
        by0[] by0VarArr = {this.D, this.C};
        for (int i10 = 0; i10 < 2; i10++) {
            by0 by0Var = by0VarArr[i10];
            if (by0Var != null) {
                by0Var.a(context);
            }
        }
        super.d();
    }

    @Override // yads.zn
    public final void i() {
        this.f149295y.a(h9.f149985h);
    }

    @Override // yads.zn
    public final void j() {
        qy0 qy0Var = this.E;
        if (qy0Var != null) {
            this.f149295y.a(qy0Var);
        } else {
            this.f149295y.a(h9.f149979b);
        }
    }

    public fy0(Context context, d4 d4Var, lu2 lu2Var, gy0 gy0Var, w5 w5Var, ly0 ly0Var, i12 i12Var, dy0 dy0Var) {
        super(context, d4Var, lu2Var, w5Var);
        this.f149295y = gy0Var;
        this.f149296z = ly0Var;
        this.A = i12Var;
        this.B = dy0Var;
        a(ma.f152386a.a());
    }

    @Override // yads.up2
    public void a(v9 v9Var) {
        cy0 uv2Var;
        synchronized (this) {
            this.f158921b.a(v5.f156760s);
            this.f158941v = v9Var;
        }
        this.A.f150382d = v9Var;
        dy0 dy0Var = this.B;
        dy0Var.getClass();
        hq1 hq1Var = v9Var.f156838q;
        if (hq1Var != null) {
            uv2Var = new fp1(v9Var, hq1Var);
        } else {
            uv2Var = new uv2(dy0Var.f148407a);
        }
        by0 by0VarA = a(uv2Var);
        this.D = this.C;
        this.C = by0VarA;
        this.E = this.f149296z.a(v9Var, this.f158922c, by0VarA);
        Context contextA = j1.a();
        if (contextA != null) {
            boolean z10 = ad1.f146762a;
        }
        if (contextA == null) {
            contextA = this.f158920a;
        }
        by0VarA.a(contextA, v9Var);
    }
}
