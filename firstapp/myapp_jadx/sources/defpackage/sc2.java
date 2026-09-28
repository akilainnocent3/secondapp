package defpackage;

import androidx.compose.material3.internal.ParentSemanticsNodeElement;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.m;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.coroutines.e;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes.dex */
public final class sc2 {
    public static final void a(final w420 w420Var, final op8 op8Var, b1g0 b1g0Var, final d dVar, final Function0 function0, final boolean z, final boolean z2, final op8 op8Var2, a aVar, final int i) {
        int i2;
        boolean z3;
        ytw ytwVar;
        b1g0 b1g0Var2 = b1g0Var;
        b bVarI = aVar.i(-1221877520);
        if ((i & 6) == 0) {
            i2 = (bVarI.M(w420Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarI.A(op8Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? bVarI.M(b1g0Var2) : bVarI.A(b1g0Var2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= bVarI.M(dVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= bVarI.A(function0) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if ((i & 196608) == 0) {
            z3 = z;
            i2 |= bVarI.b(z3) ? 131072 : 65536;
        } else {
            z3 = z;
        }
        if ((1572864 & i) == 0) {
            i2 |= bVarI.b(z2) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= bVarI.b(false) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i2 |= bVarI.A(op8Var2) ? 67108864 : 33554432;
        }
        int i3 = i2;
        if (bVarI.q(i3 & 1, (38347923 & i3) != 38347922)) {
            Object objY = bVarI.y();
            a.C0041a.C0042a c0042a = a.C0041a.a;
            if (objY == c0042a) {
                objY = xvf.i(e.a, bVarI);
                bVarI.r(objY);
            }
            v5b v5bVar = (v5b) objY;
            Object objY2 = bVarI.y();
            if (objY2 == c0042a) {
                objY2 = m.b(Boolean.FALSE);
                bVarI.r(objY2);
            }
            ytw ytwVar2 = (ytw) objY2;
            aiv aivVarC = g75.c(ht.a.a, false);
            int I = bVarI.I();
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, d.a.b);
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
            hlh0.a(bVarI, dVarC, yka.a.d);
            if (b1g0Var.b()) {
                bVarI.N(-1891243071);
                b(w420Var, b1g0Var, function0, v5bVar, z3, ytwVar2, op8Var, bVarI, (i3 & 14) | 196608 | ((i3 >> 3) & 112) | ((i3 >> 6) & 896) | ((i3 << 15) & 3670016));
                ytwVar = ytwVar2;
                bVarI.X(false);
            } else {
                ytwVar = ytwVar2;
                bVarI.N(-1890863476);
                bVarI.X(false);
            }
            b1g0Var2 = b1g0Var;
            c(z2, b1g0Var2, ytwVar, dVar, op8Var2, bVarI, ((i3 >> 18) & 14) | 384 | ((i3 >> 3) & 112) | ((i3 >> 12) & 7168) | (57344 & (i3 << 3)) | ((i3 >> 9) & 458752));
            boolean z4 = true;
            bVarI.X(true);
            if ((i3 & 896) != 256 && ((i3 & 512) == 0 || !bVarI.A(b1g0Var2))) {
                z4 = false;
            }
            Object objY3 = bVarI.y();
            if (z4 || objY3 == c0042a) {
                objY3 = new ec2(b1g0Var2, 0);
                bVarI.r(objY3);
            }
            xvf.c(b1g0Var2, (Function1) objY3, bVarI);
        } else {
            bVarI.G();
        }
        androidx.compose.runtime.e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            final b1g0 b1g0Var3 = b1g0Var2;
            eVarZ.d = new Function2() { // from class: fc2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    sc2.a(w420Var, op8Var, b1g0Var3, dVar, function0, z, z2, op8Var2, (a) obj, qj40.a(i | 1));
                    return Unit.a;
                }
            };
        }
    }

    public static final void b(final w420 w420Var, final b1g0 b1g0Var, final Function0 function0, final v5b v5bVar, final boolean z, final ytw ytwVar, final op8 op8Var, a aVar, final int i) {
        int i2;
        b bVarI = aVar.i(-1413720282);
        if ((i & 6) == 0) {
            i2 = (bVarI.M(w420Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? bVarI.M(b1g0Var) : bVarI.A(b1g0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= bVarI.A(function0) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= bVarI.A(v5bVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= bVarI.b(z) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= bVarI.M(ytwVar) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= bVarI.A(op8Var) ? 1048576 : 524288;
        }
        if (bVarI.q(i2 & 1, (599187 & i2) != 599186)) {
            String strE = pwo.e(R.string.tooltip_description, bVarI);
            boolean zA = ((i2 & 112) == 32 || ((i2 & 64) != 0 && bVarI.A(b1g0Var))) | ((i2 & 896) == 256) | bVarI.A(v5bVar) | ((458752 & i2) == 131072);
            Object objY = bVarI.y();
            if (zA || objY == a.C0041a.a) {
                objY = new Function0() { // from class: gc2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Function0 function1 = function0;
                        if (function1 == null) {
                            b1g0 b1g0Var2 = b1g0Var;
                            if (b1g0Var2.b()) {
                                ej5.c(v5bVar, null, null, new kc2(b1g0Var2, null), 3);
                                ytwVar.setValue(Boolean.FALSE);
                            }
                        } else {
                            function1.invoke();
                        }
                        return Unit.a;
                    }
                };
                bVarI.r(objY);
            }
            u90.a(w420Var, (Function0) objY, new x420(14, z), pp8.b(-1287705660, new mc2(strE, op8Var), bVarI), bVarI, (i2 & 14) | 3072, 0);
        } else {
            bVarI.G();
        }
        androidx.compose.runtime.e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: hc2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    sc2.b(w420Var, b1g0Var, function0, v5bVar, z, ytwVar, op8Var, (a) obj, qj40.a(i | 1));
                    return Unit.a;
                }
            };
        }
    }

    /* JADX WARN: Type inference failed for: r6v5, types: [cc2] */
    public static final void c(final boolean z, final b1g0 b1g0Var, final ytw ytwVar, final d dVar, final op8 op8Var, a aVar, final int i) {
        int i2;
        b bVarI = aVar.i(1873232064);
        if ((i & 6) == 0) {
            i2 = (bVarI.b(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? bVarI.M(b1g0Var) : bVarI.A(b1g0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= bVarI.M(ytwVar) ? 256 : 128;
        }
        int i3 = 0;
        if ((i & 3072) == 0) {
            i2 |= bVarI.b(false) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= bVarI.M(dVar) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= bVarI.A(op8Var) ? 131072 : 65536;
        }
        if (bVarI.q(i2 & 1, (74899 & i2) != 74898)) {
            Object objY = bVarI.y();
            if (objY == a.C0041a.a) {
                objY = xvf.i(e.a, bVarI);
                bVarI.r(objY);
            }
            final v5b v5bVar = (v5b) objY;
            final String strE = pwo.e(R.string.tooltip_label, bVarI);
            d dVarA = z ? wje0.a(wje0.a(dVar, b1g0Var, new oc2(b1g0Var)), b1g0Var, new pc2(b1g0Var)) : dVar;
            if (z) {
                dVarA = dVarA.n(new ParentSemanticsNodeElement(new Function1() { // from class: cc2
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        dc2 dc2Var = new dc2(0, v5bVar, b1g0Var);
                        ohp<Object>[] ohpVarArr = lb80.a;
                        ((pb80) obj).b(ra80.c, new c6(strE, dc2Var));
                        return Unit.a;
                    }
                }));
            }
            if (z) {
                dVarA = androidx.compose.ui.input.key.a.b(androidx.compose.ui.focus.a.a(dVarA, new bc2(i3, v5bVar, b1g0Var)), new rc2(b1g0Var, ytwVar));
            } else {
                ytwVar.setValue(Boolean.FALSE);
            }
            aiv aivVarC = g75.c(ht.a.a, false);
            int I = bVarI.I();
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
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(I))) {
                n30.a(I, bVarI, I, c1350a);
            }
            hlh0.a(bVarI, dVarC, yka.a.d);
            w1i.a((i2 >> 15) & 14, op8Var, bVarI, true);
        } else {
            bVarI.G();
        }
        androidx.compose.runtime.e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: ic2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    sc2.c(z, b1g0Var, ytwVar, dVar, op8Var, (a) obj, qj40.a(i | 1));
                    return Unit.a;
                }
            };
        }
    }
}
