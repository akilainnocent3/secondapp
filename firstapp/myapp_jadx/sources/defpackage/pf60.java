package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.d;
import androidx.compose.ui.layout.f0;
import androidx.compose.ui.layout.t;
import androidx.compose.ui.layout.y;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class pf60 {
    public static final void a(final d dVar, final op8 op8Var, a aVar, final int i) {
        int i2;
        b bVarI = aVar.i(520826409);
        if ((i & 6) == 0) {
            i2 = (bVarI.M(dVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarI.A(op8Var) ? 32 : 16;
        }
        if (bVarI.q(i2 & 1, (i2 & 19) != 18)) {
            boolean z = (i2 & 112) == 32;
            Object objY = bVarI.y();
            if (z || objY == a.C0041a.a) {
                objY = new Function2() { // from class: lf60
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        rce0 rce0Var = (rce0) obj;
                        rce0Var.getClass();
                        final y yVarD0 = ((vhv) CollectionsKt.T(rce0Var.K("content", op8Var))).d0(oxa.b(0, 0, 0, 15));
                        int i3 = kxa.i(((kxa) obj2).a);
                        float f = yVarD0.a;
                        final float f2 = f > 0.0f ? i3 / f : 1.0f;
                        return t.z1(rce0Var, i3, ycv.b(yVarD0.b * f2), new Function1() { // from class: nf60
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj3) {
                                y.a aVar2 = (y.a) obj3;
                                aVar2.getClass();
                                final float f3 = f2;
                                y.a.J(aVar2, yVarD0, 0, 0, new Function1() { // from class: of60
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj4) {
                                        a7l a7lVar = (a7l) obj4;
                                        a7lVar.getClass();
                                        float f4 = f3;
                                        a7lVar.k(f4);
                                        a7lVar.v(f4);
                                        a7lVar.z0(n09.a(0.0f, 0.0f));
                                        return Unit.a;
                                    }
                                }, 4);
                                return Unit.a;
                            }
                        });
                    }
                };
                bVarI.r(objY);
            }
            f0.a(dVar, (Function2) objY, bVarI, i2 & 14, 0);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: mf60
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(i | 1);
                    pf60.a(dVar, op8Var, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
