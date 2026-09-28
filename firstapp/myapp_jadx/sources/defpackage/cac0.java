package defpackage;

import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.runtime.m;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import androidx.compose.ui.layout.v;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class cac0 {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(d dVar, final boolean z, final fpc0 fpc0Var, float f, boolean z2, float f2, final op8 op8Var, final op8 op8Var2, a aVar, final int i, final int i2) {
        final d dVar2;
        int i3;
        final float f3;
        final boolean z3;
        final float f4;
        b bVarI = aVar.i(-1725784387);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            dVar2 = dVar;
        } else {
            dVar2 = dVar;
            i3 = i | (bVarI.M(dVar2) ? 4 : 2);
        }
        int i5 = i3 | (bVarI.b(z) ? 32 : 16) | 224256;
        if (bVarI.q(i5 & 1, (4793491 & i5) != 4793490)) {
            d.a aVar2 = d.a.b;
            if (i4 != 0) {
                dVar2 = aVar2;
            }
            Object objY = bVarI.y();
            a.C0041a.C0042a c0042a = a.C0041a.a;
            if (objY == c0042a) {
                objY = m.b(null);
                bVarI.r(objY);
            }
            final ytw ytwVar = (ytw) objY;
            mmd mmdVar = (mmd) bVarI.O(kna.h);
            Object objY2 = bVarI.y();
            if (objY2 == c0042a) {
                objY2 = new Function1() { // from class: x9c0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        urr urrVar = (urr) obj;
                        urrVar.getClass();
                        ytwVar.setValue(eb9.b(urrVar));
                        return Unit.a;
                    }
                };
                bVarI.r(objY2);
            }
            op8Var2.invoke(dVar2.n(v.a(aVar2, (Function1) objY2)), bVarI, 48);
            lk40 lk40Var = (lk40) ytwVar.getValue();
            final float f5 = 8.0f;
            final float f6 = 256.0f;
            if (!z || lk40Var == null) {
                e eVarZ = bVarI.Z();
                if (eVarZ != null) {
                    eVarZ.d = new Function2(z, fpc0Var, f5, f6, op8Var, op8Var2, i, i2) { // from class: y9c0
                        public final /* synthetic */ boolean b;
                        public final /* synthetic */ fpc0 c;
                        public final /* synthetic */ float d;
                        public final /* synthetic */ float e;
                        public final /* synthetic */ op8 f;
                        public final /* synthetic */ op8 i;
                        public final /* synthetic */ int v;

                        {
                            this.v = i2;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iA = qj40.a(14156161);
                            cac0.a(this.a, this.b, this.c, this.d, true, this.e, this.f, this.i, (a) obj, iA, this.v);
                            return Unit.a;
                        }
                    };
                    return;
                }
                return;
            }
            u90.a(new bac0(mmdVar, lk40Var, fpc0Var, 8.0f), null, new x420(8, true), pp8.b(943803231, new Function2() { // from class: z9c0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    a aVar3 = (a) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (aVar3.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                        d dVarW = j.w(d.a.b, f6);
                        aiv aivVarC = g75.c(ht.a.a, false);
                        int iHashCode = Long.hashCode(aVar3.m());
                        ne00 ne00VarO = aVar3.o();
                        d dVarC = c.c(aVar3, dVarW);
                        yka.k.getClass();
                        tsr.a aVar4 = yka.a.b;
                        if (aVar3.k() == null) {
                            l2a.b();
                            throw null;
                        }
                        aVar3.D();
                        if (aVar3.g()) {
                            aVar3.F(aVar4);
                        } else {
                            aVar3.p();
                        }
                        hlh0.a(aVar3, aivVarC, yka.a.f);
                        hlh0.a(aVar3, ne00VarO, yka.a.e);
                        yka.a.C1350a c1350a = yka.a.g;
                        if (aVar3.g() || !Intrinsics.g(aVar3.y(), Integer.valueOf(iHashCode))) {
                            j3c.a(iHashCode, aVar3, iHashCode, c1350a);
                        }
                        hlh0.a(aVar3, dVarC, yka.a.d);
                        fc0.a(0, op8Var, aVar3);
                    } else {
                        aVar3.G();
                    }
                    return Unit.a;
                }
            }, bVarI), bVarI, 3456, 2);
            z3 = true;
            f3 = 8.0f;
            f4 = 256.0f;
        } else {
            bVarI.G();
            f3 = f;
            z3 = z2;
            f4 = f2;
        }
        e eVarZ2 = bVarI.Z();
        if (eVarZ2 != null) {
            eVarZ2.d = new Function2(z, fpc0Var, f3, z3, f4, op8Var, op8Var2, i, i2) { // from class: aac0
                public final /* synthetic */ boolean b;
                public final /* synthetic */ fpc0 c;
                public final /* synthetic */ float d;
                public final /* synthetic */ boolean e;
                public final /* synthetic */ float f;
                public final /* synthetic */ op8 i;
                public final /* synthetic */ op8 v;
                public final /* synthetic */ int w;

                {
                    this.w = i2;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(14156161);
                    cac0.a(this.a, this.b, this.c, this.d, this.e, this.f, this.i, this.v, (a) obj, iA, this.w);
                    return Unit.a;
                }
            };
        }
    }
}
