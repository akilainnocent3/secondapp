package defpackage;

import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import androidx.compose.ui.layout.t;
import androidx.compose.ui.layout.y;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class o930 {
    public static final o930 a = new o930();
    public static final i060 b = j060.a;
    public static final float c = 80.0f;
    public static final float d = 80.0f;
    public static final float e = 3.0f;

    public final void a(final ca30 ca30Var, final boolean z, final d dVar, long j, long j2, float f, a aVar, final int i) {
        final long j3;
        final long j4;
        final float f2;
        int i2;
        float f3;
        long j5;
        long j6;
        b bVarI = aVar.i(-1076870256);
        int i3 = i | (bVarI.M(ca30Var) ? 4 : 2) | (bVarI.b(z) ? 32 : 16) | (bVarI.M(dVar) ? 256 : 128) | 74752;
        if (bVarI.q(i3 & 1, (599187 & i3) != 599186)) {
            bVarI.A0();
            if ((i & 1) == 0 || bVarI.h0()) {
                qyd0 qyd0Var = g68.a;
                long j7 = ((d68) bVarI.O(qyd0Var)).G;
                long j8 = ((d68) bVarI.O(qyd0Var)).s;
                i2 = i3 & (-523265);
                f3 = d;
                j5 = j8;
                j6 = j7;
            } else {
                bVarI.G();
                i2 = i3 & (-523265);
                j6 = j;
                j5 = j2;
                f3 = f;
            }
            bVarI.Y();
            b(ca30Var, z, dVar, f3, null, j6, 0.0f, pp8.b(298232649, new n930(z, j5, ca30Var), bVarI), bVarI, (i2 & 896) | (i2 & 14) | 12582912 | (i2 & 112) | 100663296);
            f2 = f3;
            j3 = j6;
            j4 = j5;
        } else {
            bVarI.G();
            j3 = j;
            j4 = j2;
            f2 = f;
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(ca30Var, z, dVar, j3, j4, f2, i) { // from class: g930
                public final /* synthetic */ ca30 b;
                public final /* synthetic */ boolean c;
                public final /* synthetic */ d d;
                public final /* synthetic */ long e;
                public final /* synthetic */ long f;
                public final /* synthetic */ float i;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1572865);
                    this.a.a(this.b, this.c, this.d, this.e, this.f, this.i, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public final void b(final ca30 ca30Var, final boolean z, final d dVar, final float f, qx80 qx80Var, final long j, float f2, final op8 op8Var, a aVar, final int i) {
        final ca30 ca30Var2;
        int i2;
        o930 o930Var;
        final qx80 qx80Var2;
        final float f3;
        int i3;
        qx80 qx80Var3;
        final qx80 qx80Var4;
        b bVarI = aVar.i(-1341144489);
        if ((i & 6) == 0) {
            ca30Var2 = ca30Var;
            i2 = (bVarI.M(ca30Var2) ? 4 : 2) | i;
        } else {
            ca30Var2 = ca30Var;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarI.b(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= bVarI.M(dVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= bVarI.c(f) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= bVarI.e(j) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= bVarI.A(op8Var) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            o930Var = this;
            i2 |= bVarI.M(o930Var) ? 67108864 : 33554432;
        } else {
            o930Var = this;
        }
        if (bVarI.q(i2 & 1, (38347923 & i2) != 38347922)) {
            bVarI.A0();
            if ((i & 1) == 0 || bVarI.h0()) {
                i3 = i2 & (-3727361);
                qx80Var3 = b;
                f3 = e;
            } else {
                bVarI.G();
                i3 = i2 & (-3727361);
                qx80Var3 = qx80Var;
                f3 = f2;
            }
            int i4 = i3;
            bVarI.Y();
            d dVarR = j.r(dVar, 40.0f);
            Object objY = bVarI.y();
            a.C0041a.C0042a c0042a = a.C0041a.a;
            if (objY == c0042a) {
                objY = new h930();
                bVarI.r(objY);
            }
            d dVarC = androidx.compose.ui.draw.a.c(dVarR, (Function1) objY);
            boolean zC = ((i4 & 112) == 32) | ((i4 & 14) == 4) | ((((i4 & 7168) ^ 3072) > 2048 && bVarI.c(f)) || (i4 & 3072) == 2048) | bVarI.c(f3) | bVarI.M(qx80Var3);
            Object objY2 = bVarI.y();
            if (zC || objY2 == c0042a) {
                qx80Var4 = qx80Var3;
                gaj gajVar = new gaj() { // from class: i930
                    @Override // defpackage.gaj
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        final y yVarD0 = ((vhv) obj2).d0(((kxa) obj3).a);
                        int i5 = yVarD0.a;
                        int i6 = yVarD0.b;
                        final ca30 ca30Var3 = ca30Var2;
                        final boolean z2 = z;
                        final float f4 = f;
                        final float f5 = f3;
                        final qx80 qx80Var5 = qx80Var4;
                        return t.z1((t) obj, i5, i6, new Function1() { // from class: k930
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj4) {
                                final ca30 ca30Var4 = ca30Var3;
                                final boolean z3 = z2;
                                final float f6 = f4;
                                final float f7 = f5;
                                final qx80 qx80Var6 = qx80Var5;
                                y.a.J((y.a) obj4, yVarD0, 0, 0, new Function1() { // from class: f930
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj5) {
                                        a7l a7lVar = (a7l) obj5;
                                        ca30 ca30Var5 = ca30Var4;
                                        boolean z4 = ca30Var5.a() > 0.0f || z3;
                                        a7lVar.f((ca30Var5.a() * a7lVar.y0(f6)) - Float.intBitsToFloat((int) (a7lVar.d() & 4294967295L)));
                                        a7lVar.t(z4 ? a7lVar.C1(f7) : 0.0f);
                                        a7lVar.A1(qx80Var6);
                                        a7lVar.l(true);
                                        return Unit.a;
                                    }
                                }, 4);
                                return Unit.a;
                            }
                        });
                    }
                };
                bVarI.r(gajVar);
                objY2 = gajVar;
            } else {
                qx80Var4 = qx80Var3;
            }
            d dVarB = androidx.compose.foundation.a.b(androidx.compose.ui.layout.j.a(dVarC, (gaj) objY2), j, qx80Var4);
            int i5 = ((i4 >> 12) & 7168) | 48;
            aiv aivVarC = g75.c(ht.a.e, false);
            int I = bVarI.I();
            ne00 ne00VarS = bVarI.S();
            d dVarC2 = c.c(bVarI, dVarB);
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
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(I))) {
                n30.a(I, bVarI, I, c1350a);
            }
            hlh0.a(bVarI, dVarC2, yka.a.d);
            op8Var.invoke(androidx.compose.foundation.layout.d.a, bVarI, Integer.valueOf(((i5 >> 6) & 112) | 6));
            bVarI.X(true);
            qx80Var2 = qx80Var4;
        } else {
            bVarI.G();
            qx80Var2 = qx80Var;
            f3 = f2;
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            final o930 o930Var2 = o930Var;
            eVarZ.d = new Function2() { // from class: j930
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    this.a.b(ca30Var, z, dVar, f, qx80Var2, j, f3, op8Var, (a) obj, qj40.a(i | 1));
                    return Unit.a;
                }
            };
        }
    }
}
