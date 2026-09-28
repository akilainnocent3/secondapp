package defpackage;

import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import androidx.compose.ui.layout.f;
import androidx.compose.ui.layout.i;
import androidx.compose.ui.layout.k0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class ju1 {
    public static final f a = new f(null);
    public static final k0 b = new k0(null);

    public static final void a(d dVar, final long j, long j2, a aVar, final int i, final int i2) {
        int i3;
        final long j3;
        long jB;
        b bVarI = aVar.i(1428256508);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = i | (bVarI.M(dVar) ? 4 : 2);
        } else {
            i3 = i;
        }
        int i5 = i3 | (bVarI.e(j) ? 32 : 16) | 3200;
        if (bVarI.q(i5 & 1, (i5 & 1171) != 1170)) {
            bVarI.A0();
            int i6 = i & 1;
            d.a aVar2 = d.a.b;
            if (i6 == 0 || bVarI.h0()) {
                if (i4 != 0) {
                    dVar = aVar2;
                }
                jB = g68.b(j, bVarI);
            } else {
                bVarI.G();
                jB = j2;
            }
            bVarI.Y();
            float f = lu1.b;
            bVarI.N(-1050955529);
            qx80 qx80VarB = xy80.b(lu1.a, bVarI);
            bVarI.X(false);
            d dVarN = androidx.compose.foundation.a.b(j.a(dVar, f, f), j, qx80VarB).n(aVar2);
            d160 d160VarA = b160.a(kw0.e, ht.a.k, bVarI, 54);
            int I = bVarI.I();
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarN);
            yka.k.getClass();
            tsr.a aVar3 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, d160VarA, yka.a.f);
            hlh0.a(bVarI, ne00VarS, yka.a.e);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(I))) {
                n30.a(I, bVarI, I, c1350a);
            }
            hlh0.a(bVarI, dVarC, yka.a.d);
            bVarI.N(1346141834);
            bVarI.X(false);
            bVarI.X(true);
            j3 = jB;
        } else {
            bVarI.G();
            j3 = j2;
        }
        final d dVar2 = dVar;
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: cu1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    ju1.a(dVar2, j, j3, (a) obj, qj40.a(i | 1), i2);
                    return Unit.a;
                }
            };
        }
    }

    public static final void b(op8 op8Var, d dVar, op8 op8Var2, a aVar, final int i, final int i2) {
        d dVar2;
        int i3;
        final op8 op8Var3;
        final op8 op8Var4;
        b bVarI = aVar.i(-1693825945);
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 = i | 48;
            dVar2 = dVar;
        } else {
            dVar2 = dVar;
            i3 = i | (bVarI.M(dVar2) ? 32 : 16);
        }
        if (bVarI.q(i3 & 1, (i3 & 147) != 146)) {
            d.a aVar2 = d.a.b;
            if (i4 != 0) {
                dVar2 = aVar2;
            }
            Object objY = bVarI.y();
            if (objY == a.C0041a.a) {
                objY = iu1.a;
                bVarI.r(objY);
            }
            aiv aivVar = (aiv) objY;
            int I = bVarI.I();
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVar2);
            yka.k.getClass();
            tsr.a aVar3 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            yka.a.b bVar = yka.a.f;
            hlh0.a(bVarI, aivVar, bVar);
            yka.a.d dVar3 = yka.a.e;
            hlh0.a(bVarI, ne00VarS, dVar3);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(I))) {
                n30.a(I, bVarI, I, c1350a);
            }
            yka.a.c cVar = yka.a.d;
            hlh0.a(bVarI, dVarC, cVar);
            d dVarB = i.b(aVar2, "anchor");
            aiv aivVarC = g75.c(ht.a.e, false);
            int I2 = bVarI.I();
            ne00 ne00VarS2 = bVarI.S();
            d dVarC2 = c.c(bVarI, dVarB);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, aivVarC, bVar);
            hlh0.a(bVarI, ne00VarS2, dVar3);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(I2))) {
                n30.a(I2, bVarI, I2, c1350a);
            }
            hlh0.a(bVarI, dVarC2, cVar);
            androidx.compose.foundation.layout.d dVar4 = androidx.compose.foundation.layout.d.a;
            op8Var4 = op8Var2;
            op8Var4.invoke(dVar4, bVarI, 54);
            bVarI.X(true);
            d dVarB2 = i.b(aVar2, "badge");
            aiv aivVarC2 = g75.c(ht.a.a, false);
            int I3 = bVarI.I();
            ne00 ne00VarS3 = bVarI.S();
            d dVarC3 = c.c(bVarI, dVarB2);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, aivVarC2, bVar);
            hlh0.a(bVarI, ne00VarS3, dVar3);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(I3))) {
                n30.a(I3, bVarI, I3, c1350a);
            }
            hlh0.a(bVarI, dVarC3, cVar);
            op8Var3 = op8Var;
            op8Var3.invoke(dVar4, bVarI, 54);
            bVarI.X(true);
            bVarI.X(true);
        } else {
            op8Var3 = op8Var;
            op8Var4 = op8Var2;
            bVarI.G();
        }
        final d dVar5 = dVar2;
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(dVar5, op8Var4, i, i2) { // from class: bu1
                public final /* synthetic */ d b;
                public final /* synthetic */ op8 c;
                public final /* synthetic */ int d;

                {
                    this.d = i2;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(391);
                    ju1.b(this.a, this.b, this.c, (a) obj, iA, this.d);
                    return Unit.a;
                }
            };
        }
    }
}
