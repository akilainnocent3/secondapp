package defpackage;

import android.view.View;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.m;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.util.UUID;
import kotlin.Unit;
import kotlin.coroutines.e;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes.dex */
public final class d2w {
    public static final void a(final Function0 function0, final long j, final w1w w1wVar, final wd0 wd0Var, final op8 op8Var, a aVar, final int i) {
        int i2;
        long j2;
        w1w w1wVar2;
        Object obj;
        asr asrVar;
        int i3;
        Object obj2;
        int i4;
        Object obj3;
        b bVarI = aVar.i(766784632);
        if ((i & 6) == 0) {
            i2 = (bVarI.A(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            j2 = j;
            i2 |= bVarI.e(j2) ? 32 : 16;
        } else {
            j2 = j;
        }
        if ((i & 384) == 0) {
            w1wVar2 = w1wVar;
            i2 |= bVarI.M(w1wVar2) ? 256 : 128;
        } else {
            w1wVar2 = w1wVar;
        }
        if ((i & 3072) == 0) {
            i2 |= (i & 4096) == 0 ? bVarI.M(wd0Var) : bVarI.A(wd0Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= bVarI.A(op8Var) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if (bVarI.q(i2 & 1, (i2 & 9363) != 9362)) {
            View view = (View) bVarI.O(AndroidCompositionLocals_androidKt.f);
            mmd mmdVar = (mmd) bVarI.O(kna.h);
            asr asrVar2 = (asr) bVarI.O(kna.n);
            b.C0043b c0043bJ = bVarI.J();
            ytw ytwVarC = m.c(op8Var, bVarI);
            Object[] objArr = new Object[0];
            Object objY = bVarI.y();
            a.C0041a.C0042a c0042a = a.C0041a.a;
            if (objY == c0042a) {
                npm npmVar = new npm(1);
                bVarI.r(npmVar);
                obj = npmVar;
            } else {
                obj = objY;
            }
            UUID uuid = (UUID) o350.e(objArr, (Function0) obj, bVarI, 48);
            Object objY2 = bVarI.y();
            Object obj4 = objY2;
            if (objY2 == c0042a) {
                v5b v5bVarI = xvf.i(e.a, bVarI);
                bVarI.r(v5bVarI);
                obj4 = v5bVarI;
            }
            v5b v5bVar = (v5b) obj4;
            boolean zM = bVarI.M(view) | bVarI.M(mmdVar);
            Object objY3 = bVarI.y();
            if (zM || objY3 == c0042a) {
                asrVar = asrVar2;
                i3 = 1;
                k0w k0wVar = new k0w(function0, w1wVar2, j2, view, asrVar, mmdVar, uuid, wd0Var, v5bVar);
                op8 op8Var2 = new op8(-1051373467, new b2w(ytwVarC), true);
                j0w j0wVar = k0wVar.v;
                j0wVar.setParentCompositionContext(c0043bJ);
                ((x5a0) j0wVar.y).setValue(op8Var2);
                j0wVar.z = true;
                j0wVar.d();
                bVarI.r(k0wVar);
                obj2 = k0wVar;
            } else {
                asrVar = asrVar2;
                i3 = 1;
                obj2 = objY3;
            }
            final k0w k0wVar2 = (k0w) obj2;
            boolean zA = bVarI.A(k0wVar2);
            Object objY4 = bVarI.y();
            if (zA || objY4 == c0042a) {
                i4 = 0;
                x1w x1wVar = new x1w(k0wVar2, i4);
                bVarI.r(x1wVar);
                obj3 = x1wVar;
            } else {
                i4 = 0;
                obj3 = objY4;
            }
            xvf.c(k0wVar2, (Function1) obj3, bVarI);
            int i5 = i2;
            int i6 = (bVarI.A(k0wVar2) ? 1 : 0) | ((i5 & 14) == 4 ? i3 : i4) | ((i5 & 896) == 256 ? i3 : i4) | ((i5 & 112) == 32 ? i3 : i4) | (bVarI.d(asrVar.ordinal()) ? 1 : 0);
            Object objY5 = bVarI.y();
            Object obj5 = objY5;
            if (i6 != 0 || objY5 == c0042a) {
                final asr asrVar3 = asrVar;
                Function0 function1 = new Function0() { // from class: y1w
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        k0wVar2.d(function0, w1wVar, j, asrVar3);
                        return Unit.a;
                    }
                };
                bVarI.r(function1);
                obj5 = function1;
            }
            bVarI.t((Function0) obj5);
        } else {
            bVarI.G();
        }
        androidx.compose.runtime.e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: z1w
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj6, Object obj7) {
                    ((Integer) obj7).getClass();
                    d2w.a(function0, j, w1wVar, wd0Var, op8Var, (a) obj6, qj40.a(i | 1));
                    return Unit.a;
                }
            };
        }
    }

    public static final boolean b(long j) {
        if (nbh0.a(j, j58.l)) {
            return false;
        }
        h68 h68VarF = j58.f(j);
        if (!w58.a(h68VarF.b, 12884901888L)) {
            vkn.a("The specified color must be encoded in an RGB color space. The supplied color space is " + ((Object) w58.b(h68VarF.b)));
        }
        js50 js50Var = ((ws50) h68VarF).p;
        float fA = (float) ((js50Var.a(j58.e(j)) * 0.0722d) + (js50Var.a(j58.g(j)) * 0.7152d) + (js50Var.a(j58.h(j)) * 0.2126d));
        if (fA < 0.0f) {
            fA = 0.0f;
        }
        if (fA > 1.0f) {
            fA = 1.0f;
        }
        return ((double) fA) <= 0.5d;
    }
}
