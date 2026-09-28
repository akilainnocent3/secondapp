package defpackage;

import androidx.compose.foundation.layout.HorizontalAlignElement;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class b590 {
    public static final gzg0 a = yi0.e(300, 0, xkf.a, 2);

    public static final void a(final int i, op8 op8Var, a aVar) {
        final op8 op8Var2;
        b bVarI = aVar.i(1033612924);
        if (bVarI.q(i & 1, (i & 19) != 18)) {
            String strA = xae0.a(R.string.m3c_bottom_sheet_drag_handle_description, bVarI);
            HorizontalAlignElement horizontalAlignElement = new HorizontalAlignElement(ht.a.n);
            aiv aivVarC = g75.c(ht.a.a, false);
            int I = bVarI.I();
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, horizontalAlignElement);
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
            op8Var2 = op8Var;
            r0g0.b(i0g0.a(1, 0.0f, bVarI, 390, 2), pp8.b(2059851063, new a590(strA), bVarI), r0g0.d(0, 7, bVarI, false), null, null, false, op8Var2, bVarI, 100663344, 248);
            bVarI.X(true);
        } else {
            op8Var2 = op8Var;
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(i, op8Var2) { // from class: x490
                public final /* synthetic */ op8 a;

                {
                    this.a = op8Var2;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    b590.a(qj40.a(55), this.a, (a) obj);
                    return Unit.a;
                }
            };
        }
    }

    public static final j590 b(boolean z, final Function1 function1, final k590 k590Var, boolean z2, a aVar, int i, int i2) {
        final boolean z3 = (i2 & 1) != 0 ? false : z;
        final boolean z4 = (i2 & 8) != 0 ? false : z2;
        final float f = c55.c;
        final float f2 = c55.d;
        final mmd mmdVar = (mmd) aVar.O(kna.h);
        boolean zM = aVar.M(mmdVar) | aVar.c(f);
        Object objY = aVar.y();
        Object obj = a.C0041a.a;
        if (zM || objY == obj) {
            objY = new Function0() { // from class: u490
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Float.valueOf(mmdVar.C1(f));
                }
            };
            aVar.r(objY);
        }
        final Function0 function0 = (Function0) objY;
        boolean zM2 = aVar.M(mmdVar) | aVar.c(f2);
        Object objY2 = aVar.y();
        if (zM2 || objY2 == obj) {
            objY2 = new Function0() { // from class: v490
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Float.valueOf(mmdVar.C1(f2));
                }
            };
            aVar.r(objY2);
        }
        final Function0 function2 = (Function0) objY2;
        Object[] objArr = {Boolean.valueOf(z3), function1, Boolean.valueOf(z4)};
        uv60 uv60Var = new uv60(new Function1() { // from class: f590
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return new j590(z3, function0, function2, (k590) obj2, function1, z4);
            }
        }, new e590());
        boolean z5 = true;
        boolean zM3 = ((((i & 14) ^ 6) > 4 && aVar.b(z3)) || (i & 6) == 4) | aVar.M(function0) | aVar.M(function2) | ((((i & 896) ^ 384) > 256 && aVar.d(k590Var.ordinal())) || (i & 384) == 256) | ((((i & 112) ^ 48) > 32 && aVar.M(function1)) || (i & 48) == 32);
        if ((((i & 7168) ^ 3072) <= 2048 || !aVar.b(z4)) && (i & 3072) != 2048) {
            z5 = false;
        }
        boolean z6 = zM3 | z5;
        Object objY3 = aVar.y();
        if (z6 || objY3 == obj) {
            final boolean z7 = z4;
            Object obj2 = new Function0() { // from class: w490
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return new j590(z3, function0, function2, k590Var, function1, z7);
                }
            };
            aVar.r(obj2);
            objY3 = obj2;
        }
        return (j590) o350.c(objArr, uv60Var, (Function0) objY3, aVar, 0);
    }
}
