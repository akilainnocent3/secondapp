package defpackage;

import android.content.res.Configuration;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.runtime.m;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.sportybet.android.gp.tz.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class mt1 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v29 */
    public static final void a(final double d, final String str, final vq5 vq5Var, a aVar, final int i) {
        int i2;
        e eVarZ;
        Function2<? super a, ? super Integer, Unit> function2;
        Object aVar2;
        Object objA;
        Object objA2;
        Object objA3;
        str.getClass();
        b bVarI = aVar.i(-1509067185);
        int i3 = i & 6;
        d.a aVar3 = d.a.b;
        if (i3 == 0) {
            i2 = (bVarI.M(aVar3) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarI.f(d) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= bVarI.M(str) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= bVarI.A(vq5Var) ? 2048 : 1024;
        }
        ?? r8 = 0;
        boolean z = false;
        if (bVarI.q(i2 & 1, (i2 & 1171) != 1170)) {
            if (str.equals("ROUND_WAITING") || str.equals("ROUND_PRE_START")) {
                bVarI.N(-1197516743);
                g75.a(androidx.compose.foundation.a.b(j.e(aVar3, 1.0f), vq5Var != null ? vq5Var.q2 : r58.d(4284855778L), zk40.a), bVarI, 0);
                bVarI.X(false);
                eVarZ = bVarI.Z();
                if (eVarZ == null) {
                    return;
                } else {
                    function2 = new Function2() { // from class: at1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            mt1.a(d, str, vq5Var, (a) obj, qj40.a(i | 1));
                            return Unit.a;
                        }
                    };
                }
            } else {
                bVarI.N(-1199225773);
                bVarI.X(false);
                if (d <= 1.5d) {
                    aVar2 = new ps1.b(r58.d(4284855778L));
                } else if (d <= 4.9d) {
                    aVar2 = new ps1.a(kotlin.collections.b.k(new j58(r58.d(4289034639L)), new j58(r58.d(4293502309L))));
                } else if (d <= 9.9d) {
                    aVar2 = new ps1.a(kotlin.collections.b.k(new j58(r58.d(4279440424L)), new j58(r58.d(4281869893L)), new j58(r58.d(4288694583L))));
                } else if (d <= 18.9d) {
                    aVar2 = new ps1.a(kotlin.collections.b.k(new j58(r58.d(4278196788L)), new j58(r58.d(4278664041L))));
                } else {
                    aVar2 = d > 18.9d ? new ps1.a(kotlin.collections.b.k(new j58(r58.d(4278457120L)), new j58(r58.d(4278855234L)))) : new ps1.b(r58.d(4284855778L));
                }
                dtg0 dtg0VarF = vtg0.f(aVar2, "BackgroundTransition", bVarI, 48, 0);
                ytw ytwVar = dtg0VarF.d;
                o oVar = dtg0VarF.a;
                gzg0 gzg0VarE = yi0.e(3000, 0, xkf.d, 2);
                x5a0 x5a0Var = (x5a0) ytwVar;
                ps1 ps1Var = (ps1) x5a0Var.getValue();
                bVarI.N(-1963638448);
                long j = qs1.a(ps1Var).get(0).a;
                bVarI.X(false);
                h68 h68VarF = j58.f(j);
                boolean zM = bVarI.M(h68VarF);
                Object objY = bVarI.y();
                a.C0041a.C0042a c0042a = a.C0041a.a;
                if (zM || objY == c0042a) {
                    objY = (f0h0) e78.a.invoke(h68VarF);
                    bVarI.r(objY);
                }
                f0h0 f0h0Var = (f0h0) objY;
                if (dtg0VarF.i()) {
                    objA = o6c.a(bVarI, 1666853325, false, oVar);
                } else {
                    bVarI.N(1666599280);
                    boolean zM2 = bVarI.M(dtg0VarF);
                    objA = bVarI.y();
                    if (zM2 || objA == c0042a) {
                        c5a0.e.getClass();
                        c5a0 c5a0VarA = c5a0.a.a();
                        Function1<Object, Unit> function1E = c5a0VarA != null ? c5a0VarA.e() : null;
                        c5a0 c5a0VarB = c5a0.a.b(c5a0VarA);
                        try {
                            Object objV = oVar.V();
                            c5a0.a.e(c5a0VarA, c5a0VarB, function1E);
                            bVarI.r(objV);
                            objA = objV;
                            z = false;
                        } catch (Throwable th) {
                            c5a0.a.e(c5a0VarA, c5a0VarB, function1E);
                            throw th;
                        }
                    }
                    bVarI.X(z);
                    r8 = z;
                }
                bVarI.N(-1963638448);
                j58 j58Var = qs1.a((ps1) objA).get(r8);
                long j2 = j58Var.a;
                bVarI.X(r8);
                boolean zM3 = bVarI.M(dtg0VarF);
                Object objY2 = bVarI.y();
                if (zM3 || objY2 == c0042a) {
                    objY2 = a6a0.b(new ct1(dtg0VarF));
                    bVarI.r(objY2);
                }
                ps1 ps1Var2 = (ps1) ((twd0) objY2).getValue();
                bVarI.N(-1963638448);
                j58 j58Var2 = qs1.a(ps1Var2).get(0);
                long j3 = j58Var2.a;
                bVarI.X(false);
                boolean zM4 = bVarI.M(dtg0VarF);
                Object objY3 = bVarI.y();
                if (zM4 || objY3 == c0042a) {
                    objY3 = a6a0.b(new dt1(dtg0VarF));
                    bVarI.r(objY3);
                }
                ((dtg0.b) ((twd0) objY3).getValue()).getClass();
                bVarI.N(1140855625);
                bVarI.X(false);
                dtg0.d dVarD = vtg0.d(dtg0VarF, j58Var, j58Var2, gzg0VarE, f0h0Var, bVarI, 196608);
                ps1 ps1Var3 = (ps1) x5a0Var.getValue();
                bVarI.N(521425263);
                long j4 = qs1.a(ps1Var3).get(1).a;
                bVarI.X(false);
                h68 h68VarF2 = j58.f(j4);
                boolean zM5 = bVarI.M(h68VarF2);
                Object objY4 = bVarI.y();
                if (zM5 || objY4 == c0042a) {
                    objY4 = (f0h0) e78.a.invoke(h68VarF2);
                    bVarI.r(objY4);
                }
                f0h0 f0h0Var2 = (f0h0) objY4;
                if (dtg0VarF.i()) {
                    objA2 = o6c.a(bVarI, 1666853325, false, oVar);
                } else {
                    bVarI.N(1666599280);
                    boolean zM6 = bVarI.M(dtg0VarF);
                    objA2 = bVarI.y();
                    if (zM6 || objA2 == c0042a) {
                        c5a0.e.getClass();
                        c5a0 c5a0VarA2 = c5a0.a.a();
                        Function1<Object, Unit> function1E2 = c5a0VarA2 != null ? c5a0VarA2.e() : null;
                        c5a0 c5a0VarB2 = c5a0.a.b(c5a0VarA2);
                        try {
                            Object objV2 = oVar.V();
                            c5a0.a.e(c5a0VarA2, c5a0VarB2, function1E2);
                            bVarI.r(objV2);
                            objA2 = objV2;
                        } catch (Throwable th2) {
                            c5a0.a.e(c5a0VarA2, c5a0VarB2, function1E2);
                            throw th2;
                        }
                    }
                    bVarI.X(false);
                }
                bVarI.N(521425263);
                j58 j58Var3 = qs1.a((ps1) objA2).get(1);
                long j5 = j58Var3.a;
                bVarI.X(false);
                boolean zM7 = bVarI.M(dtg0VarF);
                Object objY5 = bVarI.y();
                if (zM7 || objY5 == c0042a) {
                    objY5 = a6a0.b(new et1(dtg0VarF));
                    bVarI.r(objY5);
                }
                ps1 ps1Var4 = (ps1) ((twd0) objY5).getValue();
                bVarI.N(521425263);
                j58 j58Var4 = qs1.a(ps1Var4).get(1);
                long j6 = j58Var4.a;
                bVarI.X(false);
                boolean zM8 = bVarI.M(dtg0VarF);
                Object objY6 = bVarI.y();
                if (zM8 || objY6 == c0042a) {
                    objY6 = a6a0.b(new ft1(dtg0VarF));
                    bVarI.r(objY6);
                }
                ((dtg0.b) ((twd0) objY6).getValue()).getClass();
                bVarI.N(-669047960);
                bVarI.X(false);
                dtg0.d dVarD2 = vtg0.d(dtg0VarF, j58Var3, j58Var4, gzg0VarE, f0h0Var2, bVarI, 196608);
                ps1 ps1Var5 = (ps1) x5a0Var.getValue();
                bVarI.N(-1288478322);
                long j7 = qs1.a(ps1Var5).get(2).a;
                bVarI.X(false);
                h68 h68VarF3 = j58.f(j7);
                boolean zM9 = bVarI.M(h68VarF3);
                Object objY7 = bVarI.y();
                if (zM9 || objY7 == c0042a) {
                    objY7 = (f0h0) e78.a.invoke(h68VarF3);
                    bVarI.r(objY7);
                }
                f0h0 f0h0Var3 = (f0h0) objY7;
                if (dtg0VarF.i()) {
                    objA3 = o6c.a(bVarI, 1666853325, false, oVar);
                } else {
                    bVarI.N(1666599280);
                    boolean zM10 = bVarI.M(dtg0VarF);
                    objA3 = bVarI.y();
                    if (zM10 || objA3 == c0042a) {
                        c5a0.e.getClass();
                        c5a0 c5a0VarA3 = c5a0.a.a();
                        Function1<Object, Unit> function1E3 = c5a0VarA3 != null ? c5a0VarA3.e() : null;
                        c5a0 c5a0VarB3 = c5a0.a.b(c5a0VarA3);
                        try {
                            Object objV3 = oVar.V();
                            c5a0.a.e(c5a0VarA3, c5a0VarB3, function1E3);
                            bVarI.r(objV3);
                            objA3 = objV3;
                        } catch (Throwable th3) {
                            c5a0.a.e(c5a0VarA3, c5a0VarB3, function1E3);
                            throw th3;
                        }
                    }
                    bVarI.X(false);
                }
                bVarI.N(-1288478322);
                j58 j58Var5 = qs1.a((ps1) objA3).get(2);
                long j8 = j58Var5.a;
                bVarI.X(false);
                boolean zM11 = bVarI.M(dtg0VarF);
                Object objY8 = bVarI.y();
                if (zM11 || objY8 == c0042a) {
                    objY8 = a6a0.b(new gt1(dtg0VarF));
                    bVarI.r(objY8);
                }
                ps1 ps1Var6 = (ps1) ((twd0) objY8).getValue();
                bVarI.N(-1288478322);
                j58 j58Var6 = qs1.a(ps1Var6).get(2);
                long j9 = j58Var6.a;
                bVarI.X(false);
                boolean zM12 = bVarI.M(dtg0VarF);
                Object objY9 = bVarI.y();
                if (zM12 || objY9 == c0042a) {
                    objY9 = a6a0.b(new ht1(dtg0VarF));
                    bVarI.r(objY9);
                }
                ((dtg0.b) ((twd0) objY9).getValue()).getClass();
                bVarI.N(1816015751);
                bVarI.X(false);
                dtg0.d dVarD3 = vtg0.d(dtg0VarF, j58Var5, j58Var6, gzg0VarE, f0h0Var3, bVarI, 196608);
                j58 j58Var7 = (j58) dVarD.getValue();
                long j10 = j58Var7.a;
                j58 j58Var8 = (j58) dVarD2.getValue();
                long j11 = j58Var8.a;
                j58 j58Var9 = (j58) dVarD3.getValue();
                long j12 = j58Var9.a;
                List listK = kotlin.collections.b.k(j58Var7, j58Var8, j58Var9);
                float f = (14 & 4) != 0 ? Float.POSITIVE_INFINITY : 0.0f;
                g75.a(androidx.compose.foundation.a.a(j.e(aVar3, 1.0f), new hfs(listK, null, (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(f)) & 4294967295L), (14 & 8) != 0 ? 0 : 2), null, 0.0f, 6), bVarI, 0);
            }
            eVarZ.d = function2;
        }
        bVarI.G();
        eVarZ = bVarI.Z();
        if (eVarZ != null) {
            function2 = new Function2() { // from class: bt1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    mt1.a(d, str, vq5Var, (a) obj, qj40.a(i | 1));
                    return Unit.a;
                }
            };
            eVarZ.d = function2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:77:0x0164 A[PHI: r28
      0x0164: PHI (r28v1 inj) = (r28v0 inj), (r28v4 inj), (r28v4 inj), (r28v4 inj), (r28v4 inj) binds: [B:87:0x018a, B:84:0x017e, B:82:0x0174, B:80:0x016a, B:75:0x015a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Failed to calculate best type for var: r12v2 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r12v2 ??, new type: androidx.compose.runtime.b
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r12v2 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r12v2 ??, new type: androidx.compose.runtime.b
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r12v3 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r12v3 ??, new type: androidx.compose.runtime.b
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:681)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r12v3 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r12v3 ??, new type: androidx.compose.runtime.b
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r12v3 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r12v3 ??, new type: androidx.compose.runtime.b
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:678)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r12v3 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r12v3 ??, new type: androidx.compose.runtime.b
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r12v5 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r12v5 ??, new type: androidx.compose.runtime.b
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:681)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r12v5 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r12v5 ??, new type: androidx.compose.runtime.b
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r12v5 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r12v5 ??, new type: androidx.compose.runtime.b
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:678)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r12v5 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r12v5 ??, new type: androidx.compose.runtime.b
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r12v6 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r12v6 ??, new type: androidx.compose.runtime.b
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:681)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r12v6 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r12v6 ??, new type: androidx.compose.runtime.b
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:678)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r4v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v1 ??, new type: androidx.compose.runtime.b
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r4v2 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v2 ??, new type: androidx.compose.runtime.b
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:681)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r4v2 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v2 ??, new type: androidx.compose.runtime.b
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r4v28 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v28 ??, new type: androidx.compose.runtime.b
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:681)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r4v28 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v28 ??, new type: androidx.compose.runtime.b
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r4v28 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v28 ??, new type: androidx.compose.runtime.b
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:678)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r4v28 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v28 ??, new type: androidx.compose.runtime.b
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r4v29 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v29 ??, new type: androidx.compose.runtime.b
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:681)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r4v29 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v29 ??, new type: androidx.compose.runtime.b
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r4v29 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v29 ??, new type: androidx.compose.runtime.b
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:678)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r4v29 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v29 ??, new type: androidx.compose.runtime.b
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r4v30 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v30 ??, new type: androidx.compose.runtime.b
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:681)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r4v30 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v30 ??, new type: androidx.compose.runtime.b
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r4v30 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v30 ??, new type: androidx.compose.runtime.b
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:678)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r4v30 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v30 ??, new type: androidx.compose.runtime.b
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r4v32 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v32 ??, new type: androidx.compose.runtime.b
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:681)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r4v32 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v32 ??, new type: androidx.compose.runtime.b
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r4v32 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v32 ??, new type: androidx.compose.runtime.b
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:678)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r4v32 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v32 ??, new type: androidx.compose.runtime.b
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r4v34 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v34 ??, new type: androidx.compose.runtime.b
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:681)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r4v34 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v34 ??, new type: androidx.compose.runtime.b
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r4v34 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v34 ??, new type: androidx.compose.runtime.b
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:678)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r4v34 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v34 ??, new type: androidx.compose.runtime.b
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r4v35 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v35 ??, new type: androidx.compose.runtime.b
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:681)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r4v35 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v35 ??, new type: androidx.compose.runtime.b
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r4v35 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v35 ??, new type: androidx.compose.runtime.b
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:678)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r4v35 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v35 ??, new type: androidx.compose.runtime.b
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r4v42 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v42 ??, new type: androidx.compose.runtime.b
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:681)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r4v42 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v42 ??, new type: androidx.compose.runtime.b
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:678)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r4v43 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v43 ??, new type: androidx.compose.runtime.b
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:681)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r4v43 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v43 ??, new type: androidx.compose.runtime.b
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:678)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r4v44 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v44 ??, new type: androidx.compose.runtime.b
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:681)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r4v44 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v44 ??, new type: androidx.compose.runtime.b
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:678)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r4v45 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v45 ??, new type: androidx.compose.runtime.b
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:681)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r4v45 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v45 ??, new type: androidx.compose.runtime.b
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:678)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r4v46 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v46 ??, new type: androidx.compose.runtime.b
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:681)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r4v46 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v46 ??, new type: androidx.compose.runtime.b
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:678)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r4v47 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v47 ??, new type: androidx.compose.runtime.b
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:681)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r4v47 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v47 ??, new type: androidx.compose.runtime.b
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:678)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r8v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r8v0 ??, new type: androidx.compose.runtime.b
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r4v2 androidx.compose.runtime.b, new type: androidx.compose.runtime.b
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyWithWiderIgnSame(TypeUpdate.java:73)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.applyResolvedVars(TypeSearch.java:100)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:76)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.runMultiVariableSearch(FixTypesVisitor.java:119)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    public static final void b(final double d, String str, final goj gojVar, final int i, final mz1 mz1Var, a aVar, final int i2) {
        b bVar;
        inj injVar;
        j58 j58Var;
        Object it1Var;
        vq5 vq5Var;
        ytw ytwVar;
        ytw ytwVar2;
        ytw ytwVar3;
        inj injVar2;
        v1b v1bVar;
        Object lt1Var;
        ytw ytwVar4;
        Object obj;
        ytw ytwVar5;
        ytw ytwVar6;
        ytw ytwVar7;
        inj injVar3;
        b bVar2;
        g7f g7fVar;
        ytw ytwVar8;
        js1 js1Var;
        b bVar3;
        Object obj2;
        b bVar4;
        b bVar5;
        String str2 = str;
        str2.getClass();
        gojVar.getClass();
        ytw<j58> ytwVar9 = gojVar.N;
        a aVarI = aVar.i(-801775256);
        int i3 = i2 | (aVarI.f(d) ? 32 : 16) | (aVarI.M(str2) ? 256 : 128) | (aVarI.A(gojVar) ? 2048 : 1024) | (aVarI.d(i) ? 16384 : 8192) | (aVarI.A(mz1Var) ? 131072 : 65536);
        if (aVarI.q(i3 & 1, (74899 & i3) != 74898)) {
            float density = ((mmd) aVarI.O(kna.h)).getDensity();
            Configuration configuration = (Configuration) aVarI.O(AndroidCompositionLocals_androidKt.a);
            int i4 = configuration.screenWidthDp;
            float f = i4 * density;
            boolean zC = ((57344 & i3) == 16384) | aVarI.c(f) | aVarI.d(i4);
            Object objY = aVarI.y();
            a.C0041a.C0042a c0042a = a.C0041a.a;
            if (zC || objY == c0042a) {
                objY = gb80.a(i, f);
                aVarI.r(objY);
            }
            js1 js1Var2 = (js1) objY;
            inj injVarB = jnj.b(d);
            int i5 = i3 & 896;
            boolean z = i5 == 256;
            Object objY2 = aVarI.y();
            if (z || objY2 == c0042a) {
                aVarI.r(injVarB);
                objY2 = injVarB;
            }
            inj injVar4 = (inj) objY2;
            Object objY3 = aVarI.y();
            if (objY3 == c0042a) {
                objY3 = m.b(Boolean.FALSE);
                aVarI.r(objY3);
            }
            ytw ytwVar10 = (ytw) objY3;
            Object objY4 = aVarI.y();
            if (objY4 == c0042a) {
                objY4 = m.b(Boolean.TRUE);
                aVarI.r(objY4);
            }
            ytw ytwVar11 = (ytw) objY4;
            Object objY5 = aVarI.y();
            if (objY5 == c0042a) {
                objY5 = m.b(Boolean.FALSE);
                aVarI.r(objY5);
            }
            ytw ytwVar12 = (ytw) objY5;
            Object objY6 = aVarI.y();
            if (objY6 == c0042a) {
                objY6 = m.b(Boolean.FALSE);
                aVarI.r(objY6);
            }
            ytw ytwVar13 = (ytw) objY6;
            Object objY7 = aVarI.y();
            if (objY7 == c0042a) {
                objY7 = m.b(Boolean.FALSE);
                aVarI.r(objY7);
            }
            ytw ytwVar14 = (ytw) objY7;
            Object objY8 = aVarI.y();
            if (objY8 == c0042a) {
                objY8 = m.b(Boolean.FALSE);
                aVarI.r(objY8);
            }
            ytw ytwVar15 = (ytw) objY8;
            vq5 vq5Var2 = mz1Var instanceof vq5 ? (vq5) mz1Var : null;
            int iOrdinal = injVarB.ordinal();
            if (iOrdinal != 0) {
                injVar = injVarB;
                if (iOrdinal != 1) {
                    if (iOrdinal != 2) {
                        if (iOrdinal != 3) {
                            if (iOrdinal != 4) {
                                uhc.a();
                                return;
                            } else if (vq5Var2 != null) {
                                j58Var = new j58(vq5Var2.p2);
                            } else {
                                j58Var = null;
                            }
                        } else if (vq5Var2 != null) {
                            j58Var = new j58(vq5Var2.o2);
                        } else {
                            j58Var = null;
                        }
                    } else if (vq5Var2 != null) {
                        j58Var = new j58(vq5Var2.n2);
                    } else {
                        j58Var = null;
                    }
                } else if (vq5Var2 != null) {
                    j58Var = new j58(vq5Var2.m2);
                } else {
                    j58Var = null;
                }
            } else {
                injVar = injVarB;
                if (vq5Var2 != null) {
                    j58Var = new j58(vq5Var2.l2);
                } else {
                    j58Var = null;
                }
            }
            twd0 twd0VarA = hw90.a(j58Var != null ? j58Var.a : r58.d(4284855778L), yi0.e(3000, 0, xkf.d, 2), "HeaderColorAnimation", aVarI, 384, 8);
            if (str2.equals("ROUND_ONGOING") || str2.equals("ROUND_END_WAIT")) {
                j58 j58Var2 = (j58) twd0VarA.getValue();
                long j = j58Var2.a;
                ((x5a0) ytwVar9).setValue(j58Var2);
            } else {
                ((x5a0) ytwVar9).setValue(new j58(vq5Var2 != null ? vq5Var2.q2 : r58.d(4284855778L)));
            }
            boolean z2 = i5 == 256;
            Object objY9 = aVarI.y();
            if (z2 || objY9 == c0042a) {
                vq5Var = vq5Var2;
                ytwVar = ytwVar12;
                ytwVar2 = ytwVar13;
                ytwVar3 = ytwVar14;
                it1Var = new it1(str2, ytwVar, ytwVar2, ytwVar3, ytwVar15, null);
                aVarI.r(it1Var);
            } else {
                vq5Var = vq5Var2;
                it1Var = objY9;
                ytwVar = ytwVar12;
                ytwVar2 = ytwVar13;
                ytwVar3 = ytwVar14;
            }
            xvf.e(aVarI, str2, (Function2) it1Var);
            boolean zD = aVarI.d(injVar.ordinal());
            Object objY10 = aVarI.y();
            if (zD || objY10 == c0042a) {
                injVar2 = injVar;
                v1bVar = null;
                objY10 = new jt1(injVar2, ytwVar10, null);
                aVarI.r(objY10);
            } else {
                injVar2 = injVar;
                v1bVar = null;
            }
            xvf.e(aVarI, injVar2, (Function2) objY10);
            boolean z3 = i5 == 256;
            Object objY11 = aVarI.y();
            if (z3 || objY11 == c0042a) {
                objY11 = new kt1(v1bVar, ytwVar11, str2);
                aVarI.r(objY11);
            }
            xvf.e(aVarI, str2, (Function2) objY11);
            boolean zD2 = (i5 == 256) | aVarI.d(injVar2.ordinal()) | aVarI.d(injVar4.ordinal()) | ((i3 & 112) == 32);
            Object objY12 = aVarI.y();
            if (zD2 || objY12 == c0042a) {
                inj injVar5 = injVar2;
                ytw ytwVar16 = ytwVar;
                ytwVar4 = ytwVar2;
                obj = "ROUND_END_WAIT";
                a aVar2 = aVarI;
                ytw ytwVar17 = ytwVar3;
                lt1Var = new lt1(str2, injVar5, injVar4, d, ytwVar16, ytwVar17, ytwVar4, ytwVar10, ytwVar15, null);
                ytwVar5 = ytwVar16;
                ytwVar6 = ytwVar17;
                ytwVar7 = ytwVar15;
                injVar3 = injVar5;
                aVar2.r(lt1Var);
                bVar2 = aVar2;
            } else {
                injVar3 = injVar2;
                lt1Var = objY12;
                ytwVar5 = ytwVar;
                ytwVar6 = ytwVar3;
                ytwVar7 = ytwVar15;
                ytwVar4 = ytwVar2;
                bVar2 = aVarI;
                obj = "ROUND_END_WAIT";
            }
            xvf.g(injVar3, str2, (Function2) lt1Var, bVar2);
            op5 op5Var = op5.a;
            String strC = op5.c(op5Var, "cloud1_png:sg_game_name", pwo.e(R.string.cr_cloud_1_url, bVar2));
            String strC2 = op5.c(op5Var, "cloud2_png:sg_game_name", pwo.e(R.string.cr_cloud_2_url, bVar2));
            String strC3 = op5.c(op5Var, "cloud3_png:sg_game_name", pwo.e(R.string.cr_cloud_3_url, bVar2));
            String strC4 = op5.c(op5Var, "cloud4_png:sg_game_name", pwo.e(R.string.cr_cloud_4_url, bVar2));
            String strC5 = op5.c(op5Var, "sun_png:sg_game_name", pwo.e(R.string.cr_sun_url, bVar2));
            String strC6 = op5.c(op5Var, "northern_lights_png:sg_game_name", pwo.e(R.string.cr_northern_lights_url, bVar2));
            String strC7 = op5.c(op5Var, "moon_png:sg_game_name", pwo.e(R.string.cr_moon_url, bVar2));
            String strC8 = op5.c(op5Var, "stars_png:sg_game_name", pwo.e(R.string.cr_stars_url, bVar2));
            float f2 = configuration.screenWidthDp;
            float f3 = 0.3f * f2;
            g7f g7fVar2 = new g7f(f3);
            g7f g7fVar3 = new g7f(80.0f);
            if (g7fVar2.compareTo(g7fVar3) < 0) {
                g7fVar2 = g7fVar3;
            }
            g7f g7fVar4 = new g7f(160.0f);
            if (g7fVar2.compareTo(g7fVar4) > 0) {
                g7fVar2 = g7fVar4;
            }
            g7f g7fVar5 = new g7f(0.8f * f2);
            g7f g7fVar6 = new g7f(200.0f);
            if (g7fVar5.compareTo(g7fVar6) < 0) {
                g7fVar5 = g7fVar6;
            }
            g7f g7fVar7 = new g7f(350.0f);
            if (g7fVar5.compareTo(g7fVar7) > 0) {
                g7fVar5 = g7fVar7;
            }
            g7f g7fVar8 = new g7f(f3);
            g7f g7fVar9 = new g7f(80.0f);
            if (g7fVar8.compareTo(g7fVar9) < 0) {
                g7fVar8 = g7fVar9;
            }
            g7f g7fVar10 = new g7f(140.0f);
            if (g7fVar8.compareTo(g7fVar10) > 0) {
                g7fVar8 = g7fVar10;
            }
            g7f g7fVar11 = new g7f(0.6f * f2);
            g7f g7fVar12 = new g7f(200.0f);
            if (g7fVar11.compareTo(g7fVar12) < 0) {
                g7fVar11 = g7fVar12;
            }
            g7f g7fVar13 = new g7f(350.0f);
            if (g7fVar11.compareTo(g7fVar13) > 0) {
                g7fVar11 = g7fVar13;
            }
            d dVarE = j.e(d.a.b, 1.0f);
            inj injVar6 = injVar3;
            aiv aivVarC = g75.c(ht.a.a, false);
            int iHashCode = Long.hashCode(bVar2.T);
            ne00 ne00VarS = bVar2.S();
            d dVarC = c.c(bVar2, dVarE);
            yka.k.getClass();
            g7f g7fVar14 = g7fVar11;
            tsr.a aVar3 = yka.a.b;
            bVar2.D();
            g7f g7fVar15 = g7fVar2;
            if (bVar2.S) {
                bVar2.F(aVar3);
            } else {
                bVar2.p();
            }
            hlh0.a(bVar2, aivVarC, yka.a.f);
            hlh0.a(bVar2, ne00VarS, yka.a.e);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVar2.S || !Intrinsics.g(bVar2.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVar2, iHashCode, c1350a);
            }
            hlh0.a(bVar2, dVarC, yka.a.d);
            g7f g7fVar16 = g7fVar8;
            g7f g7fVar17 = g7fVar5;
            b bVar6 = bVar2;
            a(d, str, vq5Var, bVar6, i3 & 1022);
            str2 = str;
            if (str2.equals("ROUND_ONGOING") || str2.equals(obj)) {
                bVar6.N(1034169836);
                if (((Boolean) ytwVar11.getValue()).booleanValue()) {
                    bVar6.N(1034148074);
                    js1Var = js1Var2;
                    g7fVar = g7fVar16;
                    ytwVar8 = ytwVar4;
                    m7w.a(6000, js1Var.D, 0.0f, 0.0f, g7fVar14.a, str2.equals(obj), kotlin.collections.b.k(strC3, strC2, strC4, strC), bVar6, 6);
                    bVar3 = bVar6;
                } else {
                    g7fVar = g7fVar16;
                    ytwVar8 = ytwVar4;
                    js1Var = r2;
                    bVar6.N(1025504096);
                    bVar3 = bVar6;
                }
                bVar3.X(r0);
                if (((Boolean) ytwVar5.getValue()).booleanValue()) {
                    bVar3.N(1034547292);
                    float f4 = js1Var.C;
                    boolean zEquals = str2.equals(obj);
                    Object objY13 = bVar3.y();
                    obj2 = c0042a;
                    if (objY13 == obj2) {
                        objY13 = new ws1(ytwVar5, r0);
                        bVar3.r(objY13);
                    }
                    r7w.a(strC5, 12000, f4, 0.0f, g7fVar15.a, injVar6, zEquals, 0.0f, (Function0) objY13, bVar3, 100663344);
                } else {
                    obj2 = c0042a;
                    bVar3.N(1025504096);
                }
                bVar3.X(r0);
                if (((Boolean) ytwVar8.getValue()).booleanValue()) {
                    bVar3.N(1035001845);
                    boolean zEquals2 = str2.equals(obj);
                    Object objY14 = bVar3.y();
                    if (objY14 == obj2) {
                        final ytw ytwVar18 = ytwVar8;
                        objY14 = new Function0() { // from class: xs1
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                ytwVar18.setValue(Boolean.FALSE);
                                return Unit.a;
                            }
                        };
                        bVar3.r(objY14);
                    }
                    r7w.a(strC6, 4000, 0.0f, 0.0f, g7fVar17.a, injVar6, zEquals2, 0.0f, (Function0) objY14, bVar3, 100663728);
                } else {
                    bVar3.N(1025504096);
                }
                bVar3.X(r0);
                if (((Boolean) ytwVar6.getValue()).booleanValue()) {
                    bVar3.N(1035452430);
                    boolean zEquals3 = str2.equals(obj);
                    Object objY15 = bVar3.y();
                    if (objY15 == obj2) {
                        objY15 = new ys1(ytwVar6, 0);
                        bVar3.r(objY15);
                    }
                    r7w.a(strC7, 36000, 0.0f, 0.0f, g7fVar.a, injVar6, zEquals3, 0.0f, (Function0) objY15, bVar3, 100663728);
                } else {
                    bVar3.N(1025504096);
                }
                bVar3.X(r0);
                if (((Boolean) ytwVar7.getValue()).booleanValue()) {
                    bVar3.N(1035876262);
                    b bVar7 = bVar3;
                    y7w.a(js1Var.E, 0.0f, 0.0f, str2.equals(obj), strC8, bVar7, 6);
                    bVar4 = bVar7;
                } else {
                    bVar3.N(1025504096);
                    bVar4 = bVar3;
                }
                bVar4.X(r0);
                bVar4.X(r0);
                bVar5 = bVar4;
            } else {
                bVar6.N(1025504096);
                bVar6.X(false);
                bVar5 = bVar6;
            }
            bVar5.X(true);
            bVar = bVar5;
        } else {
            a aVar4 = aVarI;
            aVar4.G();
            bVar = aVar4;
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            final String str3 = str2;
            eVarZ.d = new Function2(d, str3, gojVar, i, mz1Var, i2) { // from class: zs1
                public final /* synthetic */ double a;
                public final /* synthetic */ String b;
                public final /* synthetic */ goj c;
                public final /* synthetic */ int d;
                public final /* synthetic */ mz1 e;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj3, Object obj4) {
                    ((Integer) obj4).getClass();
                    int iA = qj40.a(7);
                    mt1.b(this.a, this.b, this.c, this.d, this.e, (a) obj3, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void c(ytw<Boolean> ytwVar, boolean z) {
        ytwVar.setValue(Boolean.valueOf(z));
    }

    public static final void d(ytw<Boolean> ytwVar, boolean z) {
        ytwVar.setValue(Boolean.valueOf(z));
    }

    public static final void e(ytw<Boolean> ytwVar, boolean z) {
        ytwVar.setValue(Boolean.valueOf(z));
    }
}
