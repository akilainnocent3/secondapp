package defpackage;

import androidx.compose.animation.f;
import androidx.compose.foundation.layout.g;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.limits.reached.Cw.rarBonoqWB;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes2.dex */
public final class k2f {
    public static final void a(final d dVar, final i0f i0fVar, final boolean z, final boolean z2, final float f, float f2, final Function0 function0, a aVar, final int i) {
        b bVar;
        final float f3;
        final float f4;
        boolean z3;
        b bVarI = aVar.i(-881101279);
        int i2 = i | (bVarI.M(dVar) ? 4 : 2) | (bVarI.M(i0fVar) ? 32 : 16) | (bVarI.b(z) ? 256 : 128) | (bVarI.b(z2) ? 2048 : 1024) | (bVarI.c(f) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192) | 196608 | (bVarI.A(function0) ? 1048576 : 524288);
        if (bVarI.q(i2 & 1, (i2 & 599187) != 599186)) {
            d dVarR = j.r(dVar, i0fVar.j);
            aiv aivVarC = g75.c(ht.a.e, false);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarR);
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
            if (z) {
                bVarI.N(81373444);
                h9n.a(erz.a(R.drawable.don_kick_point_lock, 0, bVarI), null, j.r(aVar3, i0fVar.j), null, null, 0.0f, null, bVarI, 48, 120);
                bVar = bVarI;
                bVar.X(false);
                z3 = true;
                f4 = 2.0f;
            } else {
                bVarI.N(81662519);
                final long j = ((lib0) bVarI.O(oib0.a)).u;
                final float f5 = z2 ? 2.0f * f : 2.0f;
                final float f6 = z2 ? 4.0f * f : 0.0f;
                h9n.a(erz.a(R.drawable.don_kick_point, 0, bVarI), "Kick point", androidx.compose.foundation.d.d(ls7.a(j.r(aVar3, i0fVar.i), j060.a), z2, null, null, function0, 14), null, null, 0.0f, null, bVarI, 48, 120);
                bVar = bVarI;
                d dVarE = j.e(aVar3, 1.0f);
                boolean zC = bVar.c(f5) | ((i2 & 112) == 32) | bVar.c(f6) | bVar.e(j);
                Object objY = bVar.y();
                if (zC || objY == a.C0041a.a) {
                    f4 = 2.0f;
                    Function1 function1 = new Function1() { // from class: g2f
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            tcf tcfVar;
                            long j2;
                            tcf tcfVar2 = (tcf) obj;
                            tcfVar2.getClass();
                            float fC1 = tcfVar2.C1(f5);
                            float fC2 = tcfVar2.C1(f4) + (tcfVar2.C1(i0fVar.i) / 2.0f);
                            float f7 = fC1 / 2.0f;
                            float f8 = fC2 + f7;
                            float f9 = f7 + f8;
                            float fC3 = tcfVar2.C1(f6);
                            long j3 = j;
                            if (fC3 > 0.0f) {
                                float f10 = f9 + fC3;
                                vu30 vu30VarG = ya5.a.g(new Pair[]{new Pair(Float.valueOf(f9 / f10), new j58(j3)), new Pair(Float.valueOf(1.0f), new j58(j58.c(0.0f, j3)))}, tcfVar2.R1(), f10, 8);
                                float f11 = f9 + (fC3 / 2.0f);
                                yae0 yae0Var = new yae0(fC3, 0.0f, 0, 0, null, 30);
                                j2 = j3;
                                tcfVar = tcfVar2;
                                tcf.F(tcfVar, vu30VarG, f11, 0L, yae0Var, 108);
                            } else {
                                tcfVar = tcfVar2;
                                j2 = j3;
                            }
                            if (fC1 > 0.0f) {
                                tcf.n0(tcfVar, j2, f8, 0L, 0.0f, new yae0(fC1, 0.0f, 0, 0, null, 30), 108);
                            }
                            return Unit.a;
                        }
                    };
                    bVar.r(function1);
                    objY = function1;
                } else {
                    f4 = 2.0f;
                }
                rxo.b(dVarE, (Function1) objY, bVar, 6);
                bVar.X(false);
                z3 = true;
            }
            bVar.X(z3);
            f3 = f4;
        } else {
            bVar = bVarI;
            bVar.G();
            f3 = f2;
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(i0fVar, z, z2, f, f3, function0, i) { // from class: h2f
                public final /* synthetic */ i0f b;
                public final /* synthetic */ boolean c;
                public final /* synthetic */ boolean d;
                public final /* synthetic */ float e;
                public final /* synthetic */ float f;
                public final /* synthetic */ Function0 i;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    k2f.a(this.a, this.b, this.c, this.d, this.e, this.f, this.i, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void b(d dVar, final l2f l2fVar, final i0f i0fVar, final owo owoVar, final Function1 function1, a aVar, final int i) {
        final d dVar2;
        b bVar;
        float fFloatValue;
        i0fVar.getClass();
        owoVar.getClass();
        function1.getClass();
        b bVarI = aVar.i(-155016935);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? bVarI.M(l2fVar) : bVarI.A(l2fVar) ? 32 : 16;
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
        if (bVarI.q(i2 & 1, (i2 & 9363) != 9362)) {
            final d2f d2fVar = l2fVar.b;
            final boolean z = l2fVar.c;
            if (z) {
                bVarI.N(-1019253161);
                bVar = bVarI;
                fFloatValue = ((Number) kgn.a(kgn.b(rarBonoqWB.aUzuRWL, bVarI, 0), 1.0f, 0.0f, yi0.a(yi0.e(400, 0, xkf.d, 2), l850.b, 0L, 4), "kickPointBlinkProgress", bVarI, 29112, 0).getValue()).floatValue();
                bVar.X(false);
            } else {
                bVar = bVarI;
                bVar.N(-1018706569);
                bVar.X(false);
                fFloatValue = 1.0f;
            }
            final float f = fFloatValue;
            final int iY0 = ((mmd) bVar.O(kna.h)).y0(i0fVar.j) / 2;
            t9g t9gVarF = f.f(null, 3);
            owg owgVarG = f.g(null, 3);
            op8 op8VarB = pp8.b(-263570623, new gaj() { // from class: i2f
                @Override // defpackage.gaj
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    float f2;
                    float f3;
                    a aVar2 = (a) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    ((jh0) obj).getClass();
                    if (aVar2.q(iIntValue & 1, (iIntValue & 17) != 16)) {
                        d.a aVar3 = d.a.b;
                        d dVarE = j.e(aVar3, 1.0f);
                        aiv aivVarC = g75.c(ht.a.a, false);
                        int iHashCode = Long.hashCode(aVar2.m());
                        ne00 ne00VarO = aVar2.o();
                        d dVarC = c.c(aVar2, dVarE);
                        yka.k.getClass();
                        tsr.a aVar4 = yka.a.b;
                        if (aVar2.k() == null) {
                            l2a.b();
                            throw null;
                        }
                        aVar2.D();
                        if (aVar2.g()) {
                            aVar2.F(aVar4);
                        } else {
                            aVar2.p();
                        }
                        hlh0.a(aVar2, aivVarC, yka.a.f);
                        hlh0.a(aVar2, ne00VarO, yka.a.e);
                        yka.a.C1350a c1350a = yka.a.g;
                        if (aVar2.g() || !Intrinsics.g(aVar2.y(), Integer.valueOf(iHashCode))) {
                            j3c.a(iHashCode, aVar2, iHashCode, c1350a);
                        }
                        hlh0.a(aVar2, dVarC, yka.a.d);
                        aVar2.N(1253556822);
                        for (final d2f d2fVar2 : d2f.c) {
                            owo owoVar2 = owoVar;
                            int i3 = owoVar2.a;
                            float fD = owoVar2.d();
                            int iOrdinal = d2fVar2.ordinal();
                            if (iOrdinal == 0 || iOrdinal == 1) {
                                f2 = 0.14714715f;
                            } else if (iOrdinal == 2) {
                                f2 = 0.5045045f;
                            } else {
                                if (iOrdinal != 3 && iOrdinal != 4) {
                                    uhc.a();
                                    return null;
                                }
                                f2 = 0.8558559f;
                            }
                            final int iB = ycv.b(fD * f2) + i3;
                            int i4 = owoVar2.b;
                            float fB = owoVar2.b();
                            int iOrdinal2 = d2fVar2.ordinal();
                            if (iOrdinal2 == 0) {
                                f3 = 0.84117645f;
                            } else if (iOrdinal2 == 1 || iOrdinal2 == 2 || iOrdinal2 == 3) {
                                f3 = 0.2f;
                            } else {
                                if (iOrdinal2 != 4) {
                                    uhc.a();
                                    return null;
                                }
                                f3 = 0.84117645f;
                            }
                            final int iB2 = ycv.b(fB * f3) + i4;
                            boolean zD = aVar2.d(iB);
                            final int i5 = iY0;
                            boolean zD2 = zD | aVar2.d(i5) | aVar2.d(iB2);
                            Object objY = aVar2.y();
                            a.C0041a.C0042a c0042a = a.C0041a.a;
                            if (zD2 || objY == c0042a) {
                                objY = new Function1() { // from class: e2f
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj4) {
                                        ((mmd) obj4).getClass();
                                        int i6 = iB;
                                        int i7 = i5;
                                        return new iwo((((long) (iB2 - i7)) & 4294967295L) | (((long) (i6 - i7)) << 32));
                                    }
                                };
                                aVar2.r(objY);
                            }
                            d dVarB = g.b(aVar3, (Function1) objY);
                            boolean z2 = d2fVar == d2fVar2;
                            final Function1 function2 = function1;
                            boolean zM = aVar2.M(function2) | aVar2.d(d2fVar2.ordinal());
                            Object objY2 = aVar2.y();
                            if (zM || objY2 == c0042a) {
                                objY2 = new Function0() { // from class: f2f
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        function2.invoke(d2fVar2);
                                        return Unit.a;
                                    }
                                };
                                aVar2.r(objY2);
                            }
                            k2f.a(dVarB, i0fVar, z2, z, f, 0.0f, (Function0) objY2, aVar2, 0);
                        }
                        aVar2.H();
                        aVar2.s();
                    } else {
                        aVar2.G();
                    }
                    return Unit.a;
                }
            }, bVar);
            bVarI = bVar;
            hh0.e(z, null, t9gVarF, owgVarG, null, op8VarB, bVarI, 200064, 18);
            dVar2 = d.a.b;
        } else {
            bVarI.G();
            dVar2 = dVar;
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: j2f
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    k2f.b(dVar2, l2fVar, i0fVar, owoVar, function1, (a) obj, qj40.a(i | 1));
                    return Unit.a;
                }
            };
        }
    }
}
