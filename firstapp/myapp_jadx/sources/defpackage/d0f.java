package defpackage;

import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.runtime.m;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes5.dex */
public final class d0f {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(final d dVar, final j0f j0fVar, final i0f i0fVar, final owo owoVar, final Function1 function1, final Function1 function2, final Function0 function0, a aVar, final int i) {
        int i2;
        int i3;
        int i4;
        j0fVar.getClass();
        l2f l2fVar = j0fVar.b;
        int i5 = j0fVar.a;
        i0fVar.getClass();
        function1.getClass();
        function2.getClass();
        function0.getClass();
        b bVarI = aVar.i(-738811477);
        if ((i & 6) == 0) {
            i2 = (bVarI.M(dVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? bVarI.M(j0fVar) : bVarI.A(j0fVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? bVarI.M(i0fVar) : bVarI.A(i0fVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= bVarI.M(owoVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= bVarI.A(function1) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= bVarI.A(function2) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= bVarI.A(function0) ? 1048576 : 524288;
        }
        if (bVarI.q(i2 & 1, (599187 & i2) != 599186)) {
            boolean zD = bVarI.d(i5);
            Object objY = bVarI.y();
            a.C0041a.C0042a c0042a = a.C0041a.a;
            if (zD || objY == c0042a) {
                objY = m.b(Boolean.FALSE);
                bVarI.r(objY);
            }
            final ytw ytwVar = (ytw) objY;
            boolean zD2 = bVarI.d(i5);
            Object objY2 = bVarI.y();
            if (zD2 || objY2 == c0042a) {
                objY2 = m.b(Boolean.FALSE);
                bVarI.r(objY2);
            }
            final ytw ytwVar2 = (ytw) objY2;
            aiv aivVarC = g75.c(ht.a.a, false);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVar);
            yka.k.getClass();
            tsr.a aVar2 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar2);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, aivVarC, yka.a.f);
            hlh0.a(bVarI, ne00VarS, yka.a.e);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            hlh0.a(bVarI, dVarC, yka.a.d);
            d.a aVar3 = d.a.b;
            d dVarE = j.e(aVar3, 1.0f);
            w2f w2fVar = j0fVar.c;
            d2f d2fVar = l2fVar.b;
            int i6 = 458752 & i2;
            boolean z = i6 == 131072;
            Object objY3 = bVarI.y();
            if (z || objY3 == c0042a) {
                objY3 = new wze(function2, 0);
                bVarI.r(objY3);
            }
            Function0 function3 = (Function0) objY3;
            boolean zM = bVarI.M(ytwVar);
            Object objY4 = bVarI.y();
            if (zM || objY4 == c0042a) {
                objY4 = new Function0() { // from class: xze
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        ytwVar.setValue(Boolean.TRUE);
                        return Unit.a;
                    }
                };
                bVarI.r(objY4);
            }
            int i7 = i2 & 896;
            int i8 = i2;
            t2f.a(dVarE, w2fVar, i0fVar, d2fVar, function3, (Function0) objY4, bVarI, 6 | i7);
            if (owoVar == null) {
                bVarI.N(728766987);
                bVarI.X(false);
                i3 = i6;
                i4 = 131072;
            } else {
                bVarI.N(728766988);
                i3 = i6;
                boolean z2 = (i3 == 131072) | ((i8 & 57344) == 16384);
                Object objY5 = bVarI.y();
                if (z2 || objY5 == c0042a) {
                    objY5 = new Function1() { // from class: yze
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            d2f d2fVar2 = (d2f) obj;
                            d2fVar2.getClass();
                            function1.invoke(d2fVar2);
                            function2.invoke("https://s.sporty.net/cms/Laliga_penalty_Click_6083677df3.mp3");
                            return Unit.a;
                        }
                    };
                    bVarI.r(objY5);
                }
                i4 = 131072;
                k2f.b(null, l2fVar, i0fVar, owoVar, (Function1) objY5, bVarI, i7);
                bVarI = bVarI;
                Unit unit = Unit.a;
                bVarI.X(false);
            }
            f3f f3fVar = j0fVar.d;
            final f3f f3fVar2 = (f3fVar == null || !((Boolean) ytwVar.getValue()).booleanValue()) ? null : f3fVar;
            if (f3fVar2 == null) {
                bVarI.N(729239489);
                bVarI.X(false);
            } else {
                bVarI.N(729239490);
                d dVarE2 = j.e(aVar3, 1.0f);
                Object objY6 = bVarI.y();
                if (objY6 == c0042a) {
                    objY6 = new zze();
                    bVarI.r(objY6);
                }
                d dVarH = g3w.h(xa80.b(dVarE2, false, (Function1) objY6), f3fVar2.a);
                boolean zD3 = bVarI.d(f3fVar2.ordinal()) | (i3 == i4);
                Object objY7 = bVarI.y();
                if (zD3 || objY7 == c0042a) {
                    objY7 = new Function0() { // from class: a0f
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            function2.invoke(f3fVar2 == f3f.GOAL ? "https://s.sporty.net/cms/Laliga_penalty_Goal_2d1661a455.mp3" : "https://s.sporty.net/cms/Laliga_penalty_NO_goal_c5652fcf1c.mp3");
                            return Unit.a;
                        }
                    };
                    bVarI.r(objY7);
                }
                Function0 function4 = (Function0) objY7;
                boolean zM2 = bVarI.M(ytwVar2) | ((i8 & 3670016) == 1048576);
                Object objY8 = bVarI.y();
                if (zM2 || objY8 == c0042a) {
                    objY8 = new Function0() { // from class: b0f
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            ytw ytwVar3 = ytwVar2;
                            if (!((Boolean) ytwVar3.getValue()).booleanValue()) {
                                ytwVar3.setValue(Boolean.TRUE);
                                function0.invoke();
                            }
                            return Unit.a;
                        }
                    };
                    bVarI.r(objY8);
                }
                e3f.a(dVarH, f3fVar2, function4, (Function0) objY8, bVarI, 0);
                Unit unit2 = Unit.a;
                bVarI.X(false);
            }
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: c0f
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    d0f.a(dVar, j0fVar, i0fVar, owoVar, function1, function2, function0, (a) obj, qj40.a(i | 1));
                    return Unit.a;
                }
            };
        }
    }
}
