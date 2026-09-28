package defpackage;

import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import androidx.compose.ui.draw.BlockInnerShadowElement;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes8.dex */
public final class pnd0 {

    @c0d(c = "com.sportygames.stacker.presentation.ui.component.StackerKt$FallingStacker$1$1", f = "Stacker.kt", l = {137}, m = "invokeSuspend", v = 1)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ wd0<Float, ij0> b;
        public final /* synthetic */ float c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(wd0<Float, ij0> wd0Var, float f, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.b = wd0Var;
            this.c = f;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new a(this.b, this.c, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                Float f = new Float(this.c);
                gzg0 gzg0VarE = yi0.e(300, 0, xkf.d, 2);
                this.a = 1;
                if (wd0.a(this.b, f, gzg0VarE, null, null, this, 12) == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            return Unit.a;
        }
    }

    public static final void a(final float f, final int i, final uf4 uf4Var, androidx.compose.runtime.a aVar, final d dVar) {
        int i2;
        dVar.getClass();
        b bVarI = aVar.i(-1690523883);
        if ((i & 6) == 0) {
            i2 = (bVarI.M(dVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarI.d(uf4Var.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= bVarI.c(f) ? 256 : 128;
        }
        if (bVarI.q(i2 & 1, (i2 & 147) != 146)) {
            Object objY = bVarI.y();
            androidx.compose.runtime.a.C0041a.C0042a c0042a = androidx.compose.runtime.a.C0041a.a;
            if (objY == c0042a) {
                objY = ee0.a(0.0f);
                bVarI.r(objY);
            }
            wd0 wd0Var = (wd0) objY;
            float fC1 = ((mmd) bVarI.O(kna.h)).C1(f);
            Unit unit = Unit.a;
            boolean zA = bVarI.A(wd0Var) | bVarI.c(fC1);
            Object objY2 = bVarI.y();
            if (zA || objY2 == c0042a) {
                objY2 = new a(wd0Var, fC1, null);
                bVarI.r(objY2);
            }
            xvf.e(bVarI, unit, (Function2) objY2);
            d dVarI = j.i(dVar, f);
            boolean zA2 = bVarI.A(wd0Var);
            Object objY3 = bVarI.y();
            if (zA2 || objY3 == c0042a) {
                objY3 = new xps(wd0Var, 1);
                bVarI.r(objY3);
            }
            d dVarA = androidx.compose.ui.graphics.a.a(dVarI, (Function1) objY3);
            aiv aivVarC = g75.c(ht.a.a, false);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarA);
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
            int i3 = i2 >> 3;
            b(f, (i3 & 112) | (i3 & 14) | 384, uf4Var, bVarI, j.e(d.a.b, 1.0f));
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: ond0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(i | 1);
                    pnd0.a(f, iA, uf4Var, (a) obj, dVar);
                    return Unit.a;
                }
            };
        }
    }

    public static final void b(final float f, final int i, final uf4 uf4Var, androidx.compose.runtime.a aVar, d dVar) {
        int i2;
        final d dVar2 = dVar;
        dVar2.getClass();
        b bVarI = aVar.i(492819728);
        if ((i & 6) == 0) {
            i2 = (bVarI.d(uf4Var.ordinal()) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarI.c(f) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= bVarI.M(dVar2) ? 256 : 128;
        }
        if (bVarI.q(i2 & 1, (i2 & 147) != 146)) {
            int iOrdinal = uf4Var.ordinal();
            if (iOrdinal == 0) {
                bVarI.N(1153361446);
                int i3 = i2 >> 3;
                dVar2 = dVar;
                c(f, dVar2, j58.j, j58.g, 2.0f, j58.f, 1.0f, 0, bVarI, (i3 & 14) | 115043712 | (i3 & 112));
                bVarI.X(false);
            } else if (iOrdinal == 1) {
                bVarI.N(1153373995);
                int i4 = i2 >> 3;
                dVar2 = dVar;
                c(f, dVar2, r58.d(4294944000L), j58.g, 1.0f, j58.f, 1.0f, 0, bVarI, (i4 & 14) | 115043712 | (i4 & 112));
                bVarI.X(false);
            } else if (iOrdinal == 2) {
                bVarI.N(1153386126);
                int i5 = i2 >> 3;
                dVar2 = dVar;
                c(f, dVar2, j58.j, r58.d(4294944000L), 1.0f, j58.f, 1.0f, 0, bVarI, (i5 & 14) | 115043712 | (i5 & 112));
                bVarI.X(false);
            } else if (iOrdinal != 3) {
                bVarI.N(1153410785);
                d dVarI = j.i(androidx.compose.foundation.a.b(dVar2, j58.l, zk40.a), f);
                aiv aivVarC = g75.c(ht.a.e, false);
                int iHashCode = Long.hashCode(bVarI.T);
                ne00 ne00VarS = bVarI.S();
                d dVarC = c.c(bVarI, dVarI);
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
                bVarI.X(true);
                bVarI.X(false);
            } else {
                bVarI.N(1153398797);
                int i6 = i2 >> 3;
                c(f, dVar2, r58.d(4294944000L), j58.g, 1.0f, j58.f, 0.3f, 0, bVarI, (i6 & 14) | 115043712 | (i6 & 112));
                bVarI.X(false);
                dVar2 = dVar;
            }
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: nnd0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(i | 1);
                    pnd0.b(f, iA, uf4Var, (a) obj, dVar2);
                    return Unit.a;
                }
            };
        }
    }

    public static final void c(final float f, final d dVar, final long j, final long j2, final float f2, final long j3, float f3, int i, androidx.compose.runtime.a aVar, final int i2) {
        int i3;
        d dVar2;
        int i4;
        int i5;
        boolean z;
        final float f4 = f3;
        b bVarI = aVar.i(2119935078);
        if ((i2 & 6) == 0) {
            i3 = (bVarI.c(f) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            dVar2 = dVar;
            i3 |= bVarI.M(dVar2) ? 32 : 16;
        } else {
            dVar2 = dVar;
        }
        if ((i2 & 384) == 0) {
            i3 |= bVarI.e(j) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= bVarI.e(j2) ? 2048 : 1024;
        }
        int i6 = i3;
        if ((i2 & 24576) == 0) {
            i4 = i6 | (bVarI.c(6.0f) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192);
        } else {
            i4 = i6;
        }
        if ((i2 & 196608) == 0) {
            i4 |= bVarI.c(f2) ? 131072 : 65536;
        }
        if ((i2 & 1572864) == 0) {
            i4 |= bVarI.e(j3) ? 1048576 : 524288;
        }
        if ((i2 & 12582912) == 0) {
            i4 |= bVarI.c(20.0f) ? 8388608 : 4194304;
        }
        if ((100663296 & i2) == 0) {
            i4 |= bVarI.c(f4) ? 67108864 : 33554432;
        }
        int i7 = i4 | 805306368;
        if (bVarI.q(i7 & 1, (i7 & 306783379) != 306783378)) {
            d dVarB = androidx.compose.foundation.a.b(ls7.a(j.i(androidx.compose.ui.graphics.a.c(dVar2, 0.0f, 0.0f, f4, 0.0f, 0.0f, 0.0f, 0L, null, 524283), f), j060.c(6.0f)), j, zk40.a);
            if ((29360128 & i7) == 8388608) {
                f4 = f4;
                z = true;
            } else {
                f4 = f4;
                z = false;
            }
            boolean z2 = ((i7 & 14) == 4) | z | ((1879048192 & i7) == 536870912) | ((i7 & 7168) == 2048) | ((i7 & 234881024) == 67108864);
            Object objY = bVarI.y();
            if (z2 || objY == androidx.compose.runtime.a.C0041a.a) {
                objY = new Function1() { // from class: lnd0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        qln qlnVar = (qln) obj;
                        qlnVar.getClass();
                        qlnVar.C0(20.0f);
                        qlnVar.r1(qlnVar.C1(f) / 6.0f);
                        qlnVar.j1((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L));
                        qlnVar.m(j2);
                        qlnVar.b(f4);
                        return Unit.a;
                    }
                };
                bVarI.r(objY);
            }
            g75.a(d35.a(dVarB.n(new BlockInnerShadowElement((Function1) objY)), f2, j3, j060.c(6.0f)), bVarI, 0);
            i5 = 6;
        } else {
            bVarI.G();
            i5 = i;
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            final int i8 = i5;
            eVarZ.d = new Function2() { // from class: mnd0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    pnd0.c(f, dVar, j, j2, f2, j3, f4, i8, (a) obj, qj40.a(i2 | 1));
                    return Unit.a;
                }
            };
        }
    }
}
