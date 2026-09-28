package androidx.compose.animation;

import androidx.compose.ui.layout.y;
import defpackage.b75;
import defpackage.biv;
import defpackage.bxz;
import defpackage.g730;
import defpackage.gly;
import defpackage.hb5;
import defpackage.i5f0;
import defpackage.kc6;
import defpackage.kni0;
import defpackage.l3w;
import defpackage.lk40;
import defpackage.n290;
import defpackage.o290;
import defpackage.ov0;
import defpackage.oxa;
import defpackage.p290;
import defpackage.p2g;
import defpackage.pk40;
import defpackage.pkd;
import defpackage.q290;
import defpackage.qcf;
import defpackage.qlr;
import defpackage.r290;
import defpackage.urr;
import defpackage.v6l;
import defpackage.vhv;
import defpackage.wgx;
import defpackage.wkn;
import defpackage.wsr;
import defpackage.wu90;
import defpackage.x5a0;
import defpackage.y290;
import defpackage.y6l;
import defpackage.ykn;
import defpackage.ytw;
import defpackage.yw90;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class j extends androidx.compose.ui.d.c implements androidx.compose.ui.layout.b, qcf, l3w, b75 {
    public boolean D;
    public k E;
    public v6l F;
    public final wu90 G;

    public static final class a extends qlr implements Function1<y.a, Unit> {
        public final /* synthetic */ y a;
        public final /* synthetic */ j b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(j jVar, y yVar) {
            super(1);
            this.a = yVar;
            this.b = jVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(y.a aVar) {
            urr urrVarF1;
            long j;
            y.a aVar2 = aVar;
            aVar2.s(this.a, 0, 0, 0.0f);
            j jVar = this.b;
            y290 y290VarG = jVar.E.g();
            k kVar = jVar.E;
            y290VarG.i();
            if (y290VarG.b() && kVar.d().a() && (urrVarF1 = aVar2.f1()) != null) {
                long jD = kc6.d(urrVarF1.a());
                n nVar = kVar.g().b;
                urr urrVar = kVar.g().b.v;
                if (urrVar == null) {
                    hb5.a("Error: Uninitialized LayoutCoordinates. Please make sure when using the SharedTransitionScope composable function, the modifier passed to the child content is being used, or use SharedTransitionLayout instead.");
                    return null;
                }
                long jG = nVar.a.g(urrVar, urrVarF1);
                n nVar2 = kVar.g().b;
                urr urrVar2 = kVar.g().b.v;
                if (urrVar2 == null) {
                    hb5.a("Error: Uninitialized LayoutCoordinates. Please make sure when using the SharedTransitionScope composable function, the modifier passed to the child content is being used, or use SharedTransitionLayout instead.");
                    return null;
                }
                long jV = urr.V(urrVar2, urrVarF1, 2);
                i5f0 i5f0VarC = y290VarG.c();
                if (i5f0VarC == null) {
                    i5f0VarC = new i5f0(jD, gly.e(jG, jV), jV);
                }
                ytw ytwVar = i5f0VarC.b;
                ytw ytwVar2 = i5f0VarC.d;
                ytw ytwVar3 = i5f0VarC.a;
                ytw ytwVar4 = i5f0VarC.c;
                if (gly.c(((gly) ((x5a0) ytwVar4).getValue()).a, jV) && yw90.a(((yw90) ((x5a0) ytwVar3).getValue()).a, jD) && !y290VarG.j) {
                    j = jG;
                } else {
                    ((x5a0) ytwVar3).setValue(new yw90(jD));
                    ((x5a0) ytwVar4).setValue(new gly(jV));
                    if (y290VarG.j) {
                        ((x5a0) ytwVar).setValue(new gly(gly.e(gly.e(jG, jV), gly.e(((gly) ((x5a0) ytwVar2).getValue()).a, ((gly) ((x5a0) ytwVar).getValue()).a))));
                    }
                    if (y290VarG.a() == null) {
                        lk40 lk40VarG = y290VarG.g();
                        j = jG;
                        if (lk40VarG == null) {
                            lk40VarG = pk40.b(j, jD);
                        }
                        ((x5a0) y290VarG.e).setValue(lk40VarG);
                    } else {
                        j = jG;
                    }
                }
                ((x5a0) ytwVar2).setValue(new gly(gly.e(j, jV)));
                if (y290VarG.b()) {
                    ((x5a0) y290VarG.d).setValue(i5f0VarC);
                }
                y290VarG.j = false;
            }
            return Unit.a;
        }
    }

    public j(k kVar) {
        this.E = kVar;
        this.F = (v6l) ((x5a0) kVar.A).getValue();
        g730<k> g730Var = r290.a;
        wu90 wu90Var = new wu90(g730Var);
        wu90Var.p(g730Var, kVar);
        this.G = wu90Var;
    }

    @Override // defpackage.qcf
    public final void A(wsr wsrVar) {
        bxz bxzVarA;
        k kVar = this.E;
        if (!kVar.g().b() || this.E.g().a() == null) {
            bxzVarA = null;
        } else {
            l.a aVar = (l.a) ((x5a0) this.E.i).getValue();
            l.d dVar = (l.d) ((x5a0) this.E.v).getValue();
            lk40 lk40VarA = this.E.g().a();
            lk40VarA.getClass();
            bxzVarA = aVar.a(dVar, lk40VarA, wsrVar.getLayoutDirection(), pkd.f(this).N);
        }
        kVar.w = bxzVarA;
        v6l v6lVar = (v6l) ((x5a0) this.E.A).getValue();
        if (v6lVar == null) {
            StringBuilder sb = new StringBuilder("Error: Layer is null when accessed for shared bounds/element : ");
            sb.append((Object) this.E.g().a);
            boolean zA = this.E.d().a();
            boolean z = this.C;
            sb.append(",target: ");
            sb.append(zA);
            sb.append(", is attached: ");
            sb.append(z);
            throw new IllegalArgumentException(sb.toString().toString());
        }
        q290 q290Var = new q290(wsrVar);
        long jD = wsrVar.d();
        wsrVar.L((((long) ((int) Float.intBitsToFloat((int) (jD >> 32)))) << 32) | (((long) ((int) Float.intBitsToFloat((int) (jD & 4294967295L)))) & 4294967295L), v6lVar, q290Var);
        k kVar2 = this.E;
        if (!kVar2.g().b() || (!kVar2.i() && kVar2.h())) {
            y6l.a(wsrVar, v6lVar);
        }
    }

    @Override // androidx.compose.ui.layout.b
    public final biv H1(ov0 ov0Var, vhv vhvVar, long j) {
        if (this.E.g().b()) {
            lk40 lk40VarB = this.E.d().b();
            if (lk40VarB == null) {
                y290 y290VarG = this.E.g();
                if (y290VarG.b()) {
                    y290VarG.i();
                    if (y290VarG.a() == null) {
                        ((x5a0) y290VarG.e).setValue(y290VarG.g());
                    }
                    lk40VarB = y290VarG.a();
                } else {
                    lk40VarB = null;
                }
            }
            if (lk40VarB != null) {
                long jC = kc6.c(lk40VarB.d());
                int i = (int) (jC >> 32);
                int i2 = (int) (jC & 4294967295L);
                if (i == Integer.MAX_VALUE || i2 == Integer.MAX_VALUE) {
                    StringBuilder sb = new StringBuilder("Error: Infinite width/height is invalid. animated bounds: ");
                    sb.append(this.E.d().b());
                    wgx.a(sb, ", current bounds: ", this.E.g().a());
                    return null;
                }
                if (i < 0) {
                    i = 0;
                }
                if (i2 < 0) {
                    i2 = 0;
                }
                if (!((i2 >= 0) & (i >= 0))) {
                    ykn.a("width and height must be >= 0");
                }
                j = oxa.h(i, i, i2, i2);
            }
        }
        y yVarD0 = vhvVar.d0(j);
        this.D = true;
        boolean zB = this.E.g().b();
        k kVar = this.E;
        if (!zB) {
            ((x5a0) kVar.g().e).setValue(null);
            return androidx.compose.ui.layout.t.z1(ov0Var, yVarD0.a, yVarD0.b, new n290(yVarD0));
        }
        if (!kVar.g().b.i()) {
            return androidx.compose.ui.layout.t.z1(ov0Var, yVarD0.a, yVarD0.b, new o290(this, yVarD0));
        }
        long jA = ((l.b) ((x5a0) this.E.e).getValue()).a(this.E.g().b.a.e(pkd.e(this)).a(), (((long) yVarD0.a) << 32) | (((long) yVarD0.b) & 4294967295L));
        return androidx.compose.ui.layout.t.z1(ov0Var, (int) (jA >> 32), (int) (jA & 4294967295L), new p290(this, yVarD0));
    }

    @Override // androidx.compose.ui.layout.b, defpackage.psr
    public final biv e(androidx.compose.ui.layout.t tVar, vhv vhvVar, long j) {
        y yVarD0 = vhvVar.d0(j);
        return androidx.compose.ui.layout.t.z1(tVar, yVarD0.a, yVarD0.b, new a(this, yVarD0));
    }

    @Override // androidx.compose.ui.d.c
    public final void h2() {
        r2();
    }

    @Override // androidx.compose.ui.d.c
    public final void i2() {
        q2(null);
        k kVar = this.E;
        kVar.y = null;
        kVar.z = null;
        this.D = false;
    }

    @Override // androidx.compose.ui.d.c
    public final void j2() {
        v6l v6lVar = this.F;
        if (v6lVar != null) {
            pkd.g(this).getGraphicsContext().a(v6lVar);
        }
        q2(pkd.g(this).getGraphicsContext().c());
    }

    @Override // androidx.compose.ui.layout.b
    public final boolean m1() {
        return this.E.g().b() && this.E.g().b.i();
    }

    @Override // defpackage.l3w
    public final kni0 o0() {
        return this.G;
    }

    public final urr p2() {
        urr urrVar = this.E.g().b.i;
        if (urrVar != null) {
            return urrVar;
        }
        Intrinsics.n("root");
        throw null;
    }

    public final void q2(v6l v6lVar) {
        if (v6lVar == null) {
            v6l v6lVar2 = this.F;
            if (v6lVar2 != null) {
                pkd.g(this).getGraphicsContext().a(v6lVar2);
            }
        } else {
            ((x5a0) this.E.A).setValue(v6lVar);
        }
        this.F = v6lVar;
    }

    public final void r2() {
        g730<k> g730Var = r290.a;
        k kVar = this.E;
        p2g p2gVar = p2g.b;
        wu90 wu90Var = this.G;
        if (wu90Var == p2gVar) {
            wkn.a("In order to provide locals you must override providedValues: ModifierLocalMap");
        }
        if (!wu90Var.g(g730Var)) {
            wkn.a("Any provided key must be initially provided in the overridden providedValues: ModifierLocalMap property. Key " + g730Var + " was not found.");
        }
        wu90Var.p(g730Var, kVar);
        this.E.y = (k) g(g730Var);
        q2(pkd.g(this).getGraphicsContext().c());
        this.D = false;
        this.E.z = this;
    }

    @Override // defpackage.b75
    public final lk40 x1() {
        if (this.C && this.D) {
            return pk40.b(urr.V(p2(), pkd.e(this), 6), kc6.d(pkd.e(this).c));
        }
        return null;
    }
}
