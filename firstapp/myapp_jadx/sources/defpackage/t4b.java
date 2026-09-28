package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.collections.b;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes.dex */
public final class t4b extends tkd implements ya80 {
    public wsg0 F;
    public ijf0 G;
    public n6s H;
    public boolean I;
    public boolean J;
    public boolean K;
    public mly L;
    public iif0 M;
    public bcn N;
    public b5i O;

    public static void s2(n6s n6sVar, String str, boolean z, boolean z2) {
        if (z || !z2) {
            return;
        }
        dkf0 dkf0Var = n6sVar.e;
        l6s l6sVar = n6sVar.v;
        if (dkf0Var == null) {
            int length = str.length();
            l6sVar.invoke(new ijf0(str, vlf0.a(length, length), 4));
        } else {
            ijf0 ijf0VarA = n6sVar.d.a(b.k(new pld(), new ba8(str, 1)));
            dkf0Var.a(null, ijf0VarA);
            l6sVar.invoke(ijf0VarA);
        }
    }

    @Override // defpackage.ya80
    public final void G0(final pb80 pb80Var) {
        boolean z = this.K;
        nk0 nk0Var = this.G.a;
        ohp<Object>[] ohpVarArr = lb80.a;
        ob80<nk0> ob80Var = hb80.D;
        ohp<Object>[] ohpVarArr2 = lb80.a;
        ohp<Object> ohpVar = ohpVarArr2[17];
        pb80Var.b(ob80Var, nk0Var);
        nk0 nk0Var2 = this.F.a;
        ob80<nk0> ob80Var2 = hb80.E;
        ohp<Object> ohpVar2 = ohpVarArr2[18];
        pb80Var.b(ob80Var2, nk0Var2);
        long j = this.G.b;
        ob80<ulf0> ob80Var3 = hb80.F;
        ohp<Object> ohpVar3 = ohpVarArr2[19];
        pb80Var.b(ob80Var3, new ulf0(j));
        ob80<kza> ob80Var4 = hb80.r;
        ohp<Object> ohpVar4 = ohpVarArr2[9];
        pb80Var.b(ob80Var4, kza.a.a);
        int i = 1;
        pb80Var.b(ra80.g, new c6(null, new y07(this, 1)));
        if (!this.J) {
            pb80Var.b(hb80.i, Unit.a);
        }
        if (z) {
            pb80Var.b(hb80.J, Unit.a);
        }
        int i2 = 0;
        boolean z2 = this.J && !this.I;
        ob80<Boolean> ob80Var5 = hb80.M;
        ohp<Object> ohpVar5 = ohpVarArr2[25];
        pb80Var.b(ob80Var5, Boolean.valueOf(z2));
        lb80.a(pb80Var, new oy1(this, 1));
        if (z2) {
            pb80Var.b(ra80.j, new c6(null, new q4b(this, 0)));
            pb80Var.b(ra80.n, new c6(null, new Function1() { // from class: r4b
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    nk0 nk0Var3 = (nk0) obj;
                    t4b t4bVar = this.a;
                    boolean z3 = false;
                    if (!t4bVar.I && t4bVar.J) {
                        dkf0 dkf0Var = t4bVar.H.e;
                        if (dkf0Var != null) {
                            List<? extends mof> listK = b.k(new eoh(), new ba8(nk0Var3, 1));
                            n6s n6sVar = t4bVar.H;
                            osf osfVar = n6sVar.d;
                            l6s l6sVar = n6sVar.v;
                            ijf0 ijf0VarA = osfVar.a(listK);
                            dkf0Var.a(null, ijf0VarA);
                            l6sVar.invoke(ijf0VarA);
                        } else {
                            ijf0 ijf0Var = t4bVar.G;
                            String str = ijf0Var.a.b;
                            long j2 = ijf0Var.b;
                            int i3 = ulf0.c;
                            String string = StringsKt.e0(str, (int) (j2 >> 32), (int) (j2 & 4294967295L), nk0Var3).toString();
                            int length = nk0Var3.b.length() + ((int) (t4bVar.G.b >> 32));
                            t4bVar.H.v.invoke(new ijf0(string, vlf0.a(length, length), 4));
                        }
                        z3 = true;
                    }
                    return Boolean.valueOf(z3);
                }
            }));
        }
        pb80Var.b(ra80.i, new c6(null, new s4b(this, i2)));
        int i3 = this.N.e;
        wy1 wy1Var = new wy1(this, 1);
        pb80Var.b(hb80.G, new acn(i3));
        pb80Var.b(ra80.o, new c6(null, wy1Var));
        pb80Var.b(ra80.b, new c6(null, new xy1(this, 1)));
        pb80Var.b(ra80.c, new c6(null, new Function0() { // from class: n4b
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                this.a.M.e(true);
                return Boolean.TRUE;
            }
        }));
        if (!ulf0.c(this.G.b) && !z) {
            pb80Var.b(ra80.p, new c6(null, new v07(this, i)));
            if (this.J && !this.I) {
                pb80Var.b(ra80.q, new c6(null, new w07(this, 1)));
            }
        }
        if (!this.J || this.I) {
            return;
        }
        pb80Var.b(ra80.r, new c6(null, new p4b(this, i2)));
    }

    @Override // defpackage.ya80
    public final boolean Y1() {
        return true;
    }
}
