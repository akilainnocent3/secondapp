package defpackage;

import androidx.compose.foundation.text.contextmenu.modifier.c;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class i1b {
    /* JADX WARN: Type inference failed for: r2v3, types: [aif0] */
    public static final void a(final iif0 iif0Var, final op8 op8Var, a aVar, final int i) {
        int i2;
        b bVarI = aVar.i(2080741862);
        if ((i & 6) == 0) {
            i2 = (bVarI.A(iif0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarI.A(op8Var) ? 32 : 16;
        }
        if (bVarI.q(i2 & 1, (i2 & 19) != 18)) {
            bVarI.N(-1881943916);
            yi10.b(!iif0Var.g() ? d.a.b : c.a(androidx.compose.foundation.text.contextmenu.modifier.a.a(new bif0(iif0Var, null)), iif0Var.z, new cif0(iif0Var, null), new dif0(iif0Var, null), new Function1() { // from class: aif0
                /* JADX WARN: Code duplicated, block: B:40:0x011f  */
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    urr urrVar;
                    lk40 lk40Var;
                    char c;
                    float fIntBitsToFloat;
                    urr urrVarC;
                    urr urrVarC2;
                    urr urrVarC3;
                    urr urrVarC4;
                    urr urrVar2 = (urr) obj;
                    iif0 iif0Var2 = iif0Var;
                    n6s n6sVar = iif0Var2.d;
                    lk40 lk40Var2 = lk40.e;
                    if (n6sVar == null) {
                        urrVar = null;
                        lk40Var = lk40Var2;
                    } else {
                        if (n6sVar.p) {
                            n6sVar = null;
                        }
                        if (n6sVar != null) {
                            mly mlyVar = iif0Var2.b;
                            long j = iif0Var2.j().b;
                            int i3 = ulf0.c;
                            int iB = mlyVar.b((int) (j >> 32));
                            int iB2 = iif0Var2.b.b((int) (iif0Var2.j().b & 4294967295L));
                            n6s n6sVar2 = iif0Var2.d;
                            long jI0 = 0;
                            long jI1 = (n6sVar2 == null || (urrVarC4 = n6sVar2.c()) == null) ? 0L : urrVarC4.i0(iif0Var2.h(true));
                            n6s n6sVar3 = iif0Var2.d;
                            if (n6sVar3 != null && (urrVarC3 = n6sVar3.c()) != null) {
                                jI0 = urrVarC3.i0(iif0Var2.h(false));
                            }
                            n6s n6sVar4 = iif0Var2.d;
                            float fIntBitsToFloat2 = 0.0f;
                            if (n6sVar4 == null || (urrVarC2 = n6sVar4.c()) == null) {
                                c = ' ';
                                urrVar = null;
                                fIntBitsToFloat = 0.0f;
                            } else {
                                urrVar = null;
                                vkf0 vkf0VarD = n6sVar.d();
                                c = ' ';
                                fIntBitsToFloat = Float.intBitsToFloat((int) (urrVarC2.i0((((long) Float.floatToRawIntBits(vkf0VarD != null ? vkf0VarD.a.c(iB).b : 0.0f)) & 4294967295L) | (((long) Float.floatToRawIntBits(0.0f)) << 32)) & 4294967295L));
                            }
                            n6s n6sVar5 = iif0Var2.d;
                            if (n6sVar5 != null && (urrVarC = n6sVar5.c()) != null) {
                                vkf0 vkf0VarD2 = n6sVar.d();
                                fIntBitsToFloat2 = Float.intBitsToFloat((int) (urrVarC.i0((((long) Float.floatToRawIntBits(0.0f)) << c) | (((long) Float.floatToRawIntBits(vkf0VarD2 != null ? vkf0VarD2.a.c(iB2).b : 0.0f)) & 4294967295L)) & 4294967295L));
                            }
                            int i4 = (int) (jI1 >> c);
                            int i5 = (int) (jI0 >> c);
                            lk40Var = new lk40(Math.min(Float.intBitsToFloat(i4), Float.intBitsToFloat(i5)), Math.min(fIntBitsToFloat, fIntBitsToFloat2), Math.max(Float.intBitsToFloat(i4), Float.intBitsToFloat(i5)), (n6sVar.a.g.getDensity() * 25.0f) + Math.max(Float.intBitsToFloat((int) (jI1 & 4294967295L)), Float.intBitsToFloat((int) (jI0 & 4294967295L))));
                        } else {
                            urrVar = null;
                            lk40Var = lk40Var2;
                        }
                    }
                    n6s n6sVar6 = iif0Var2.d;
                    urr urrVarC5 = n6sVar6 != null ? n6sVar6.c() : urrVar;
                    if (urrVarC5 != null) {
                        return (urrVarC5.e() && urrVar2.e()) ? pk40.b(urrVar2.M(eb9.c(urrVarC5), lk40Var.e()), lk40Var.d()) : lk40Var2;
                    }
                    zkn.d("Required value was null.");
                    fkd.a();
                    return urrVar;
                }
            }), op8Var, bVarI, i2 & 112);
            bVarI.X(false);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: h1b
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(i | 1);
                    i1b.a(iif0Var, op8Var, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
