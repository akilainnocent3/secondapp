package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class yle0 {
    public static final void a(final cme0 cme0Var, final d dVar, final boolean z, boolean z2, boolean z3, Function1 function1, op8 op8Var, a aVar, final int i) {
        final op8 op8Var2;
        final boolean z4;
        final boolean z5;
        final Function1 function2;
        op8 op8Var3 = qg9.a;
        b bVarI = aVar.i(-741495334);
        int i2 = i | (bVarI.A(cme0Var) ? 4 : 2) | (bVarI.M(dVar) ? 256 : 128) | 1794048;
        if (bVarI.q(i2 & 1, (4793491 & i2) != 4793490)) {
            Object objY = bVarI.y();
            a.C0041a.C0042a c0042a = a.C0041a.a;
            if (objY == c0042a) {
                objY = new tle0();
                bVarI.r(objY);
            }
            Function1 function3 = (Function1) objY;
            i20<dme0> i20Var = cme0Var.a;
            i20<dme0> i20Var2 = cme0Var.a;
            i3z i3zVar = i3z.b;
            boolean z6 = ((dme0) ((x5a0) i20Var.h).getValue()) == dme0.c;
            bVarI.N(-869685853);
            bVarI.X(false);
            d dVarB = androidx.compose.foundation.gestures.a.b(dVar, i20Var, i3zVar, z6, null, 24);
            aiv aivVarC = g75.c(ht.a.a, true);
            int I = bVarI.I();
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarB);
            yka.k.getClass();
            tsr.a aVar2 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar2);
            } else {
                bVarI.p();
            }
            yka.a.b bVar = yka.a.f;
            hlh0.a(bVarI, aivVarC, bVar);
            yka.a.d dVar2 = yka.a.e;
            hlh0.a(bVarI, ne00VarS, dVar2);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(I))) {
                n30.a(I, bVarI, I, c1350a);
            }
            yka.a.c cVar = yka.a.d;
            hlh0.a(bVarI, dVarC, cVar);
            d dVarF = androidx.compose.foundation.layout.d.a.f(d.a.b);
            kw0.j jVar = kw0.a;
            n54.b bVar2 = ht.a.j;
            d160 d160VarA = b160.a(jVar, bVar2, bVarI, 0);
            int I2 = bVarI.I();
            ne00 ne00VarS2 = bVarI.S();
            d dVarC2 = c.c(bVarI, dVarF);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar2);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, d160VarA, bVar);
            hlh0.a(bVarI, ne00VarS2, dVar2);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(I2))) {
                n30.a(I2, bVarI, I2, c1350a);
            }
            hlh0.a(bVarI, dVarC2, cVar);
            f160 f160Var = f160.a;
            op8Var3.invoke(f160Var, bVarI, 54);
            bVarI.X(true);
            boolean zA = bVarI.A(cme0Var);
            Object objY2 = bVarI.y();
            if (zA || objY2 == c0042a) {
                objY2 = new Function2() { // from class: ule0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        final jxo jxoVar = (jxo) obj;
                        final boolean z7 = z;
                        return new Pair(androidx.compose.foundation.gestures.a.a(new Function1() { // from class: wle0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj3) {
                                p9f p9fVar = (p9f) obj3;
                                float f = (int) (jxoVar.a >> 32);
                                p9fVar.a(dme0.c, 0.0f);
                                if (z7) {
                                    p9fVar.a(dme0.a, f);
                                }
                                p9fVar.a(dme0.b, -f);
                                return Unit.a;
                            }
                        }), (dme0) cme0Var.a.i.getValue());
                    }
                };
                bVarI.r(objY2);
            }
            d dVarA = androidx.compose.material3.internal.b.a(i20Var2, (Function2) objY2);
            d160 d160VarA2 = b160.a(jVar, bVar2, bVarI, 0);
            int I3 = bVarI.I();
            ne00 ne00VarS3 = bVarI.S();
            d dVarC3 = c.c(bVarI, dVarA);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar2);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, d160VarA2, bVar);
            hlh0.a(bVarI, ne00VarS3, dVar2);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(I3))) {
                n30.a(I3, bVarI, I3, c1350a);
            }
            hlh0.a(bVarI, dVarC3, cVar);
            op8Var2 = op8Var;
            op8Var2.invoke(f160Var, bVarI, 54);
            bVarI.X(true);
            bVarI.X(true);
            dme0 dme0Var = (dme0) ((x5a0) i20Var2.h).getValue();
            boolean zA2 = bVarI.A(cme0Var);
            Object objY3 = bVarI.y();
            if (zA2 || objY3 == c0042a) {
                function2 = function3;
                objY3 = new xle0(cme0Var, function2, null);
                bVarI.r(objY3);
            } else {
                function2 = function3;
            }
            xvf.g(dme0Var, function2, (Function2) objY3, bVarI);
            z4 = true;
            z5 = true;
        } else {
            op8Var2 = op8Var;
            bVarI.G();
            z4 = z2;
            z5 = z3;
            function2 = function1;
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(dVar, z, z4, z5, function2, op8Var2, i) { // from class: vle0
                public final /* synthetic */ d b;
                public final /* synthetic */ boolean c;
                public final /* synthetic */ boolean d;
                public final /* synthetic */ boolean e;
                public final /* synthetic */ Function1 f;
                public final /* synthetic */ op8 i;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(12586041);
                    yle0.a(this.a, this.b, this.c, this.d, this.e, this.f, this.i, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
