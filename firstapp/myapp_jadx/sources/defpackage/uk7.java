package defpackage;

import androidx.compose.foundation.layout.h;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.runtime.m;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.d;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes.dex */
public final class uk7 {
    public static final umz a;

    static {
        h.a(2, 8.0f, 0.0f);
        a = h.a(2, 8.0f, 0.0f);
        h.a(2, 8.0f, 0.0f);
    }

    public static final void a(final op8 op8Var, final imf0 imf0Var, final long j, final long j2, final long j3, final float f, final tmz tmzVar, a aVar, final int i) {
        b bVarI = aVar.i(-2070754602);
        int i2 = i | (bVarI.A(op8Var) ? 4 : 2) | (bVarI.M(imf0Var) ? 32 : 16) | (bVarI.e(j) ? 256 : 128) | (bVarI.A(null) ? 2048 : 1024) | (bVarI.A(null) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192) | (bVarI.A(null) ? 131072 : 65536) | (bVarI.e(j2) ? 1048576 : 524288) | (bVarI.e(j3) ? 8388608 : 4194304) | (bVarI.c(f) ? 67108864 : 33554432) | (bVarI.M(tmzVar) ? 536870912 : 268435456);
        if (bVarI.q(i2 & 1, (306783379 & i2) != 306783378)) {
            hna.b(new j730[]{tp0.a(j, iza.a), lkf0.a.a(imf0Var)}, pp8.b(-668234218, new sk7(f, tmzVar, j2, op8Var, j3), bVarI), bVarI, 56);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(imf0Var, j, j2, j3, f, tmzVar, i) { // from class: pk7
                public final /* synthetic */ imf0 b;
                public final /* synthetic */ long c;
                public final /* synthetic */ long d;
                public final /* synthetic */ long e;
                public final /* synthetic */ float f;
                public final /* synthetic */ tmz i;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    uk7.a(this.a, this.b, this.c, this.d, this.e, this.f, this.i, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void b(final boolean z, final Function0 function0, final op8 op8Var, d dVar, boolean z2, qx80 qx80Var, d780 d780Var, g780 g780Var, l35 l35Var, a aVar, final int i, final int i2, final int i3) {
        int i4;
        op8 op8Var2;
        final qx80 qx80VarB;
        final d780 d780VarC;
        l35 l35VarA;
        int i5;
        b bVar;
        final d dVar2;
        final boolean z3;
        final l35 l35Var2;
        final g780 g780Var2;
        int i6;
        int i7;
        g780 g780Var3;
        qx80 qx80Var2;
        d780 d780Var2;
        l35 l35Var3;
        boolean z4;
        d dVar3;
        b bVarI = aVar.i(-1385473344);
        int i8 = 2;
        if ((i & 6) == 0) {
            i4 = (bVarI.b(z) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i & 48) == 0) {
            i4 |= bVarI.A(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            op8Var2 = op8Var;
            i4 |= bVarI.A(op8Var2) ? 256 : 128;
        } else {
            op8Var2 = op8Var;
        }
        int i9 = i4 | 1797120;
        if ((i & 12582912) == 0) {
            if ((i3 & 128) == 0) {
                qx80VarB = qx80Var;
                int i10 = bVarI.M(qx80VarB) ? 8388608 : 4194304;
                i9 |= i10;
            } else {
                qx80VarB = qx80Var;
            }
            i9 |= i10;
        } else {
            qx80VarB = qx80Var;
        }
        if ((100663296 & i) == 0) {
            if ((i3 & 256) == 0) {
                d780VarC = d780Var;
                int i11 = bVarI.M(d780VarC) ? 67108864 : 33554432;
                i9 |= i11;
            } else {
                d780VarC = d780Var;
            }
            i9 |= i11;
        } else {
            d780VarC = d780Var;
        }
        if ((805306368 & i) == 0) {
            i9 |= 268435456;
        }
        if ((i2 & 6) == 0) {
            if ((i3 & 1024) == 0) {
                l35VarA = l35Var;
                if (bVarI.M(l35VarA)) {
                    i8 = 4;
                }
            } else {
                l35VarA = l35Var;
            }
            i5 = i2 | i8;
        } else {
            l35VarA = l35Var;
            i5 = i2;
        }
        int i12 = i5 | 48;
        if (bVarI.q(i9 & 1, ((306783379 & i9) == 306783378 && (i12 & 19) == 18) ? false : true)) {
            bVarI.A0();
            if ((i & 1) == 0 || bVarI.h0()) {
                if ((i3 & 128) != 0) {
                    float f = cmh.a;
                    qx80VarB = xy80.b(dmh.a, bVarI);
                    i9 &= -29360129;
                }
                if ((i3 & 256) != 0) {
                    float f2 = cmh.a;
                    d780VarC = cmh.c((d68) bVarI.O(g68.a));
                    i9 &= -234881025;
                }
                float f3 = cmh.a;
                g780 g780Var4 = new g780(dmh.j, dmh.d);
                i6 = i9 & (-1879048193);
                if ((i3 & 1024) != 0) {
                    bVar = bVarI;
                    l35VarA = cmh.a(z, 0L, 0L, bVarI, 252);
                    i7 = 48;
                } else {
                    bVar = bVarI;
                    i7 = i12;
                }
                g780Var3 = g780Var4;
                qx80Var2 = qx80VarB;
                d780Var2 = d780VarC;
                l35Var3 = l35VarA;
                i12 = i7;
                z4 = true;
                dVar3 = d.a.b;
            } else {
                bVarI.G();
                if ((i3 & 128) != 0) {
                    i9 &= -29360129;
                }
                if ((i3 & 256) != 0) {
                    i9 &= -234881025;
                }
                i6 = i9 & (-1879048193);
                dVar3 = dVar;
                z4 = z2;
                g780Var3 = g780Var;
                if ((i3 & 1024) != 0) {
                    i12 = 48;
                    qx80Var2 = qx80VarB;
                    d780Var2 = d780VarC;
                    l35Var3 = l35VarA;
                    bVar = bVarI;
                } else {
                    bVar = bVarI;
                    qx80Var2 = qx80VarB;
                    d780Var2 = d780VarC;
                    l35Var3 = l35VarA;
                }
            }
            bVar.Y();
            int i13 = i6 << 3;
            int i14 = i6 << 6;
            c(z, dVar3, function0, z4, op8Var2, gah0.a(dmh.m, bVar), qx80Var2, d780Var2, g780Var3, l35Var3, cmh.a, a, bVar, (i6 & 14) | 12582912 | ((i6 >> 6) & 112) | (i13 & 896) | ((i6 >> 3) & 7168) | (57344 & i14) | (i13 & 3670016) | (234881024 & i14) | (1879048192 & i14), ((i6 >> 24) & 14) | 27648 | ((i12 << 6) & 896) | 196608);
            dVar2 = dVar3;
            z3 = z4;
            qx80VarB = qx80Var2;
            d780VarC = d780Var2;
            g780Var2 = g780Var3;
            l35Var2 = l35Var3;
        } else {
            bVar = bVarI;
            bVar.G();
            dVar2 = dVar;
            z3 = z2;
            l35Var2 = l35VarA;
            g780Var2 = g780Var;
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: mk7
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    uk7.b(z, function0, op8Var, dVar2, z3, qx80VarB, d780VarC, g780Var2, l35Var2, (a) obj, qj40.a(i | 1), qj40.a(i2), i3);
                    return Unit.a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:160:0x0225  */
    public static final void c(final boolean z, final d dVar, final Function0 function0, final boolean z2, final op8 op8Var, final imf0 imf0Var, final qx80 qx80Var, final d780 d780Var, final g780 g780Var, final l35 l35Var, final float f, final tmz tmzVar, a aVar, final int i, final int i2) {
        int i3;
        int i4;
        boolean z3;
        long j;
        float f2;
        wd0 wd0Var;
        boolean z4;
        aj0 aj0Var;
        b bVarI = aVar.i(1786844928);
        if ((i & 6) == 0) {
            i3 = (bVarI.b(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= bVarI.M(dVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= bVarI.A(function0) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= bVarI.b(z2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= bVarI.A(op8Var) ? 16384 : 8192;
        }
        if ((i & 196608) == 0) {
            i3 |= bVarI.M(imf0Var) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i3 |= bVarI.A(null) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i3 |= bVarI.A(null) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i3 |= bVarI.A(null) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i3 |= bVarI.M(qx80Var) ? 536870912 : 268435456;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (bVarI.M(d780Var) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= bVarI.M(g780Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= bVarI.M(l35Var) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= bVarI.c(f) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i4 |= bVarI.M(tmzVar) ? 16384 : 8192;
        }
        if ((i2 & 196608) == 0) {
            i4 |= bVarI.M(null) ? 131072 : 65536;
        }
        int i5 = i3;
        boolean z5 = true;
        if (bVarI.q(i5 & 1, ((306783379 & i3) == 306783378 && (i4 & 74899) == 74898) ? false : true)) {
            bVarI.N(73215547);
            Object objY = bVarI.y();
            a.C0041a.C0042a c0042a = a.C0041a.a;
            if (objY == c0042a) {
                objY = rzk.a(bVarI);
            }
            psw pswVar = (psw) objY;
            bVarI.X(false);
            Object objY2 = bVarI.y();
            if (objY2 == c0042a) {
                z3 = false;
                objY2 = new nk7(0);
                bVarI.r(objY2);
            } else {
                z3 = false;
            }
            d dVarB = xa80.b(dVar, z3, (Function1) objY2);
            if (z2) {
                j = !z ? d780Var.a : d780Var.i;
            } else {
                j = z ? d780Var.j : d780Var.e;
            }
            long j2 = j;
            if (g780Var == null) {
                bVarI.N(73531126);
                bVarI.X(false);
                pswVar = pswVar;
                aj0Var = null;
            } else {
                bVarI.N(-828912021);
                int i6 = ((i5 >> 9) & 14) | ((i4 << 3) & 896);
                Object objY3 = bVarI.y();
                if (objY3 == c0042a) {
                    objY3 = new SnapshotStateList();
                    bVarI.r(objY3);
                }
                SnapshotStateList snapshotStateList = (SnapshotStateList) objY3;
                Object objY4 = bVarI.y();
                if (objY4 == c0042a) {
                    objY4 = m.b(null);
                    bVarI.r(objY4);
                }
                ytw ytwVar = (ytw) objY4;
                boolean zM = bVarI.M(pswVar);
                Object objY5 = bVarI.y();
                if (zM || objY5 == c0042a) {
                    objY5 = new e780(pswVar, snapshotStateList, null);
                    bVarI.r(objY5);
                }
                xvf.e(bVarI, pswVar, (Function2) objY5);
                xxo xxoVar = (xxo) CollectionsKt.d0(snapshotStateList);
                if (!z2 || (xxoVar instanceof mp20.b)) {
                    f2 = 0.0f;
                } else if (xxoVar instanceof vkm) {
                    f2 = g780Var.a;
                } else if (!(xxoVar instanceof c4i) && (xxoVar instanceof i9f.b)) {
                    f2 = g780Var.b;
                } else {
                    f2 = 0.0f;
                }
                Object objY6 = bVarI.y();
                if (objY6 == c0042a) {
                    objY6 = new wd0(new g7f(f2), gjs.d, null, 12);
                    bVarI.r(objY6);
                }
                wd0 wd0Var2 = (wd0) objY6;
                g7f g7fVar = new g7f(f2);
                boolean zA = bVarI.A(wd0Var2) | bVarI.c(f2);
                if ((((i6 & 14) ^ 6) <= 4 || !bVarI.b(z2)) && (i6 & 6) != 4) {
                    z5 = false;
                }
                boolean zA2 = zA | z5 | bVarI.A(xxoVar);
                Object objY7 = bVarI.y();
                if (zA2 || objY7 == c0042a) {
                    wd0Var = wd0Var2;
                    z4 = false;
                    f780 f780Var = new f780(wd0Var, f2, z2, xxoVar, ytwVar, null);
                    bVarI.r(f780Var);
                    objY7 = f780Var;
                } else {
                    wd0Var = wd0Var2;
                    z4 = false;
                }
                xvf.e(bVarI, g7fVar, (Function2) objY7);
                aj0Var = wd0Var.c;
                bVarI.X(z4);
            }
            ihe0.b(z, function0, dVarB, z2, qx80Var, j2, aj0Var != null ? ((g7f) ((x5a0) aj0Var.b).getValue()).a : 0.0f, l35Var, pswVar, pp8.b(-990050154, new tk7(d780Var, z2, z, op8Var, imf0Var, f, tmzVar), bVarI), bVarI, (i5 & 14) | ((i5 >> 3) & 112) | (i5 & 7168) | ((i5 >> 15) & 57344) | ((i4 << 21) & 1879048192), 192);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: ok7
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(i | 1);
                    int iA2 = qj40.a(i2);
                    uk7.c(z, dVar, function0, z2, op8Var, imf0Var, qx80Var, d780Var, g780Var, l35Var, f, tmzVar, (a) obj, iA, iA2);
                    return Unit.a;
                }
            };
        }
    }
}
