package defpackage;

import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.f;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes.dex */
public final class g1b {
    public static final v0b a;

    public static final class a implements gaj<j78, androidx.compose.runtime.a, Integer, Unit> {
        public final /* synthetic */ Function1<a1b, Unit> a;
        public final /* synthetic */ v0b b;

        /* JADX WARN: Multi-variable type inference failed */
        public a(Function1<? super a1b, Unit> function1, v0b v0bVar) {
            this.a = function1;
            this.b = v0bVar;
        }

        @Override // defpackage.gaj
        public final Unit invoke(j78 j78Var, androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.runtime.a aVar2 = aVar;
            int iIntValue = num.intValue();
            if (aVar2.q(iIntValue & 1, (iIntValue & 17) != 16)) {
                Object objY = aVar2.y();
                if (objY == androidx.compose.runtime.a.C0041a.a) {
                    objY = new a1b();
                    aVar2.r(objY);
                }
                a1b a1bVar = (a1b) objY;
                a1bVar.a.clear();
                this.a.invoke(a1bVar);
                a1bVar.a(this.b, aVar2, 0);
            } else {
                aVar2.G();
            }
            return Unit.a;
        }
    }

    static {
        l380 l380Var = l380.a;
        chf chfVar = u90.a;
        l380 l380Var2 = l380.a;
        l380 l380Var3 = l380.a;
        long j = j58.f;
        long j2 = j58.b;
        a = new v0b(j, j2, j2, j58.c(0.38f, j2), j58.c(0.38f, j2));
    }

    public static final void a(final v0b v0bVar, final d dVar, final op8 op8Var, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        b bVarI = aVar.i(621449936);
        if ((i & 6) == 0) {
            i2 = (bVarI.M(v0bVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarI.M(dVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= bVarI.A(op8Var) ? 256 : 128;
        }
        int i3 = i2;
        if (bVarI.q(i3 & 1, (i3 & 147) != 146)) {
            n54.b bVar = b1b.a;
            d dVarC = op70.c(h.h(f.c(androidx.compose.foundation.a.b(lx80.d(dVar, 3.0f, j060.c(4.0f), false, 0L, 0L, 28), v0bVar.a, zk40.a), pzo.b), 0.0f, b1b.d, 1), op70.a(bVarI), 14);
            int i4 = (i3 << 3) & 7168;
            i78 i78VarA = g78.a(kw0.c, ht.a.m, bVarI, 0);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC2 = c.c(bVarI, dVarC);
            yka.k.getClass();
            tsr.a aVar2 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar2);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, i78VarA, yka.a.f);
            hlh0.a(bVarI, ne00VarS, yka.a.e);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            hlh0.a(bVarI, dVarC2, yka.a.d);
            op8Var.invoke(l78.a, bVarI, Integer.valueOf(((i4 >> 6) & 112) | 6));
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: f1b
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(i | 1);
                    g1b.a(v0bVar, dVar, op8Var, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void b(d dVar, v0b v0bVar, final Function1<? super a1b, Unit> function1, androidx.compose.runtime.a aVar, final int i, final int i2) {
        int i3;
        int i4;
        b bVarI = aVar.i(-1430784946);
        int i5 = i2 & 1;
        if (i5 != 0) {
            i3 = i | 6;
        } else {
            i3 = (bVarI.M(dVar) ? 4 : 2) | i;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i4 = i3 | 48;
        } else {
            i4 = i3 | (bVarI.M(v0bVar) ? 32 : 16);
        }
        int i7 = i4 | (bVarI.A(function1) ? 256 : 128);
        if (bVarI.q(i7 & 1, (i7 & 147) != 146)) {
            if (i5 != 0) {
                dVar = d.a.b;
            }
            if (i6 != 0) {
                v0bVar = a;
            }
            a(v0bVar, dVar, pp8.b(860259975, new a(function1, v0bVar), bVarI), bVarI, ((i7 << 3) & 112) | ((i7 >> 3) & 14) | 384);
        } else {
            bVarI.G();
        }
        final d dVar2 = dVar;
        final v0b v0bVar2 = v0bVar;
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(v0bVar2, function1, i, i2) { // from class: e1b
                public final /* synthetic */ v0b b;
                public final /* synthetic */ Function1 c;
                public final /* synthetic */ int d;

                {
                    this.d = i2;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    g1b.b(this.a, this.b, this.c, (a) obj, iA, this.d);
                    return Unit.a;
                }
            };
        }
    }

    public static final void c(final String str, final v0b v0bVar, final d dVar, final gaj gajVar, final Function0 function0, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        d dVar2;
        b bVarI = aVar.i(-1027365588);
        if ((i & 6) == 0) {
            i2 = (bVarI.M(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarI.b(true) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= bVarI.M(v0bVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            dVar2 = dVar;
            i2 |= bVarI.M(dVar2) ? 2048 : 1024;
        } else {
            dVar2 = dVar;
        }
        if ((i & 24576) == 0) {
            i2 |= bVarI.A(gajVar) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= bVarI.A(function0) ? 131072 : 65536;
        }
        if (bVarI.q(i2 & 1, (74899 & i2) != 74898)) {
            n54.b bVar = b1b.a;
            float f = b1b.c;
            kw0.i iVar = new kw0.i(f, true, new hw0());
            boolean z = ((i2 & 112) == 32) | ((458752 & i2) == 131072);
            Object objY = bVarI.y();
            if (z || objY == androidx.compose.runtime.a.C0041a.a) {
                objY = new c1b(function0, 0);
                bVarI.r(objY);
            }
            d dVarH = h.h(j.u(j.g(androidx.compose.foundation.d.d(dVar2, true, str, null, (Function0) objY, 12), 1.0f), 112.0f, 48.0f, 280.0f, 48.0f), f, 0.0f, 2);
            d160 d160VarA = b160.a(iVar, bVar, bVarI, 54);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarH);
            yka.k.getClass();
            tsr.a aVar2 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar2);
            } else {
                bVarI.p();
            }
            yka.a.b bVar2 = yka.a.f;
            hlh0.a(bVarI, d160VarA, bVar2);
            yka.a.d dVar3 = yka.a.e;
            hlh0.a(bVarI, ne00VarS, dVar3);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            yka.a.c cVar = yka.a.d;
            hlh0.a(bVarI, dVarC, cVar);
            if (gajVar == null) {
                bVarI.N(-1483499797);
                bVarI.X(false);
            } else {
                bVarI.N(-1483499796);
                float f2 = b1b.e;
                d dVarP = j.p(d.a.b, f2, 0.0f, f2, f2, 2);
                aiv aivVarC = g75.c(ht.a.a, false);
                int iHashCode2 = Long.hashCode(bVarI.T);
                ne00 ne00VarS2 = bVarI.S();
                d dVarC2 = c.c(bVarI, dVarP);
                bVarI.D();
                if (bVarI.S) {
                    bVarI.F(aVar2);
                } else {
                    bVarI.p();
                }
                hlh0.a(bVarI, aivVarC, bVar2);
                hlh0.a(bVarI, ne00VarS2, dVar3);
                if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode2))) {
                    n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
                }
                hlh0.a(bVarI, dVarC2, cVar);
                gajVar.invoke(new j58(v0bVar.c), bVarI, 0);
                bVarI.X(true);
                Unit unit = Unit.a;
                bVarI.X(false);
            }
            qb2.b(str, new LayoutWeightElement(1.0f, true), new imf0(v0bVar.b, b1b.h, b1b.i, null, null, b1b.k, null, null, b1b.b, b1b.j, null, null, 16613240), null, 0, false, 1, 0, null, bVarI, (i2 & 14) | 1572864, 952);
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: d1b
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    g1b.c(str, v0bVar, dVar, gajVar, function0, (a) obj, qj40.a(i | 1));
                    return Unit.a;
                }
            };
        }
    }
}
