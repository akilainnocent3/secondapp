package defpackage;

import android.graphics.Bitmap;
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

/* JADX INFO: loaded from: classes.dex */
public final class tz9 {
    public static final op8 a = new op8(886842935, new sz9(0), false);

    public static final void a(final ply plyVar, final ht htVar, final op8 op8Var, a aVar, final int i) {
        int i2;
        b bVarI = aVar.i(-1090171650);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? bVarI.M(plyVar) : bVarI.A(plyVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarI.M(htVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= bVarI.A(op8Var) ? 256 : 128;
        }
        boolean z = false;
        if (bVarI.q(i2 & 1, (i2 & 147) != 146)) {
            boolean z2 = (i2 & 112) == 32;
            if ((i2 & 14) == 4 || ((i2 & 8) != 0 && bVarI.M(plyVar))) {
                z = true;
            }
            boolean z3 = z2 | z;
            Object objY = bVarI.y();
            if (z3 || objY == a.C0041a.a) {
                objY = new ncl(htVar, plyVar);
                bVarI.r(objY);
            }
            u90.a((ncl) objY, null, new x420(false, true, true, l380.a, false), op8Var, bVarI, ((i2 << 3) & 7168) | 384, 2);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: xa0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(i | 1);
                    tz9.a(plyVar, htVar, op8Var, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void b(final ply plyVar, final boolean z, final lg50 lg50Var, final boolean z2, long j, final float f, final d dVar, a aVar, final int i) {
        int i2;
        long j2;
        int i3;
        long j3;
        final boolean z3;
        b bVarI = aVar.i(-466280168);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? bVarI.M(plyVar) : bVarI.A(plyVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarI.b(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= bVarI.d(lg50Var.ordinal()) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= bVarI.b(z2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= 8192;
        }
        if ((1572864 & i) == 0) {
            i2 |= bVarI.M(dVar) ? 1048576 : 524288;
        }
        if (bVarI.q(i2 & 1, (533651 & i2) != 533650)) {
            bVarI.A0();
            if ((i & 1) == 0 || bVarI.h0()) {
                i3 = i2 & (-57345);
                j3 = 9205357640488583168L;
            } else {
                bVarI.G();
                i3 = i2 & (-57345);
                j3 = j;
            }
            bVarI.Y();
            if (z) {
                ob80<q880> ob80Var = r880.a;
                z3 = (lg50Var == lg50.a && !z2) || (lg50Var == lg50.b && z2);
            } else {
                ob80<q880> ob80Var2 = r880.a;
                z3 = (lg50Var != lg50.a || z2) && !(lg50Var == lg50.b && z2);
            }
            m54 m54Var = z3 ? z1.b : z1.a;
            int i4 = i3 & 14;
            boolean zB = ((i3 & 112) == 32) | (i4 == 4 || ((i3 & 8) != 0 && bVarI.A(plyVar))) | bVarI.b(z3);
            Object objY = bVarI.y();
            if (zB || objY == a.C0041a.a) {
                objY = new Function1() { // from class: ya0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        pb80 pb80Var = (pb80) obj;
                        long jA = plyVar.a();
                        pb80Var.b(r880.a, new q880(z ? lcl.b : lcl.c, jA, z3 ? p880.a : p880.c, (9223372034707292159L & jA) != 9205357640488583168L));
                        return Unit.a;
                    }
                };
                bVarI.r(objY);
            }
            long j4 = j3;
            m54 m54Var2 = m54Var;
            j2 = j4;
            a(plyVar, m54Var2, pp8.b(1365123137, new eb0((z6i0) bVarI.O(kna.s), j2, z3, xa80.b(dVar, false, (Function1) objY), plyVar), bVarI), bVarI, i4 | 384);
        } else {
            bVarI.G();
            j2 = j;
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            final long j5 = j2;
            eVarZ.d = new Function2() { // from class: za0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    tz9.b(plyVar, z, lg50Var, z2, j5, f, dVar, (a) obj, qj40.a(i | 1));
                    return Unit.a;
                }
            };
        }
    }

    public static final void c(final int i, a aVar, final d dVar, final Function0 function0, final boolean z) {
        int i2;
        b bVarI = aVar.i(2111672474);
        if ((i & 6) == 0) {
            i2 = (bVarI.M(dVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | (bVarI.A(function0) ? 32 : 16) | (bVarI.b(z) ? 256 : 128);
        if (bVarI.q(i3 & 1, (i3 & 147) != 146)) {
            ob80<q880> ob80Var = r880.a;
            ty0.a(bVarI, c.a(j.t(dVar, 25.0f, 25.0f), gnn.a, new hb0(z, function0)));
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: ab0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    tz9.c(qj40.a(i | 1), (a) obj, dVar, function0, z);
                    return Unit.a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0029  */
    public static final c8n d(mr5 mr5Var, float f) {
        int iCeil = ((int) Math.ceil(f)) * 2;
        t70 t70VarA = mcl.a;
        h40 h40VarA = mcl.b;
        qc6 qc6Var = mcl.c;
        if (t70VarA != null) {
            Bitmap bitmap = t70VarA.a;
            if (h40VarA == null || iCeil > bitmap.getWidth() || iCeil > bitmap.getHeight()) {
                t70VarA = e8n.a(iCeil, iCeil, 1, 24);
                mcl.a = t70VarA;
                h40VarA = i40.a(t70VarA);
                mcl.b = h40VarA;
            }
        } else {
            t70VarA = e8n.a(iCeil, iCeil, 1, 24);
            mcl.a = t70VarA;
            h40VarA = i40.a(t70VarA);
            mcl.b = h40VarA;
        }
        t70 t70Var = t70VarA;
        h40 h40Var = h40VarA;
        Bitmap bitmap2 = t70Var.a;
        if (qc6Var == null) {
            qc6Var = new qc6();
            mcl.c = qc6Var;
        }
        qc6 qc6Var2 = qc6Var;
        qc6.a aVar = qc6Var2.a;
        asr layoutDirection = mr5Var.a.getLayoutDirection();
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(bitmap2.getWidth())) << 32) | (((long) Float.floatToRawIntBits(bitmap2.getHeight())) & 4294967295L);
        mmd mmdVar = aVar.a;
        asr asrVar = aVar.b;
        lc6 lc6Var = aVar.c;
        long j = aVar.d;
        aVar.a = mr5Var;
        aVar.b = layoutDirection;
        aVar.c = h40Var;
        aVar.d = jFloatToRawIntBits;
        h40Var.p();
        tcf.m0(qc6Var2, j58.b, 0L, qc6Var2.d(), 0.0f, null, 0, 58);
        tcf.m0(qc6Var2, r58.d(4278190080L), 0L, (((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(f)) & 4294967295L), 0.0f, null, 0, 120);
        tcf.n0(qc6Var2, r58.d(4278190080L), f, (((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(f)) & 4294967295L), 0.0f, null, 120);
        h40Var.f();
        aVar.a = mmdVar;
        aVar.b = asrVar;
        aVar.c = lc6Var;
        aVar.d = j;
        return t70Var;
    }
}
