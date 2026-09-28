package defpackage;

import android.content.Context;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.UiText;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class soj0 {
    public static final void a(final xkj0 xkj0Var, final wg8 wg8Var, final il8 il8Var, final Function1 function1, final Function1 function2, final Function1 function3, final Function1 function4, final op8 op8Var, a aVar, final int i) {
        int i2;
        Function1 function5;
        Function1 function6;
        String str;
        function1.getClass();
        function2.getClass();
        function3.getClass();
        function4.getClass();
        b bVarI = aVar.i(-2052357472);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? bVarI.M(xkj0Var) : bVarI.A(xkj0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? bVarI.M(wg8Var) : bVarI.A(wg8Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? bVarI.M(il8Var) : bVarI.A(il8Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            function5 = function1;
            i2 |= bVarI.A(function5) ? 2048 : 1024;
        } else {
            function5 = function1;
        }
        if ((i & 24576) == 0) {
            i2 |= bVarI.A(function2) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            function6 = function3;
            i2 |= bVarI.A(function6) ? 131072 : 65536;
        } else {
            function6 = function3;
        }
        if ((1572864 & i) == 0) {
            i2 |= bVarI.A(function4) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= bVarI.A(op8Var) ? 8388608 : 4194304;
        }
        int i3 = i2;
        if (bVarI.q(i3 & 1, (4793491 & i3) != 4793490)) {
            Context context = (Context) bVarI.O(AndroidCompositionLocals_androidKt.b);
            Unit unit = Unit.a;
            int i4 = i3 & 14;
            boolean z = ((i3 & 57344) == 16384) | (i4 == 4 || ((i3 & 8) != 0 && bVarI.A(xkj0Var)));
            Object objY = bVarI.y();
            a.C0041a.C0042a c0042a = a.C0041a.a;
            if (z || objY == c0042a) {
                str = null;
                objY = new roj0(xkj0Var, function2, null);
                bVarI.r(objY);
            } else {
                str = null;
            }
            xvf.e(bVarI, unit, (Function2) objY);
            String str2 = str;
            o900.a(xkj0Var, wg8Var, function5, function6, pp8.b(126207051, new y670(op8Var), bVarI), bVarI, 24584 | i4 | (i3 & 112) | ((i3 >> 3) & 896) | ((i3 >> 6) & 7168));
            final vnj0 vnj0Var = il8Var.a;
            if (vnj0Var == null) {
                bVarI.N(1373999575);
                bVarI.X(false);
            } else {
                bVarI.N(1373999576);
                if (vnj0Var instanceof vnj0.a) {
                    bVarI.N(1527459821);
                    vnj0.a aVar2 = (vnj0.a) vnj0Var;
                    UiText uiTextD = aVar2.d();
                    String strG = uiTextD != null ? uiTextD.g(context) : str2;
                    String strG2 = aVar2.a().g(context);
                    vnj0.a.d dVarB = aVar2.b();
                    String string = dVarB != null ? dVarB.a.e(context).toString() : str2;
                    ResourceUiText resourceUiTextC = aVar2.c();
                    resourceUiTextC.getClass();
                    String string2 = resourceUiTextC.e(context).toString();
                    int i5 = i3 & 3670016;
                    boolean zA = (i5 == 1048576) | bVarI.A(vnj0Var);
                    Object objY2 = bVarI.y();
                    if (zA || objY2 == c0042a) {
                        objY2 = new Function0() { // from class: ooj0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                function4.invoke(new hl8.c((vnj0.a) vnj0Var));
                                return Unit.a;
                            }
                        };
                        bVarI.r(objY2);
                    }
                    Function0 function0 = (Function0) objY2;
                    boolean zA2 = bVarI.A(vnj0Var) | (i5 == 1048576);
                    Object objY3 = bVarI.y();
                    if (zA2 || objY3 == c0042a) {
                        objY3 = new Function0() { // from class: poj0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                vnj0.a.d dVarB2 = ((vnj0.a) vnj0Var).b();
                                if (dVarB2 != null) {
                                    function4.invoke(new hl8.a(dVarB2));
                                }
                                return Unit.a;
                            }
                        };
                        bVarI.r(objY3);
                    }
                    ga2.a(strG, strG2, string2, function0, string, (Function0) objY3, bVarI, 0, 0);
                    bVarI.X(false);
                } else {
                    if (!(vnj0Var instanceof vnj0.b)) {
                        throw igf0.a(bVarI, -366371260, false);
                    }
                    bVarI.N(1528562057);
                    String strG3 = ((vnj0.b) vnj0Var).a.g(context);
                    boolean z2 = (i3 & 3670016) == 1048576;
                    Object objY4 = bVarI.y();
                    if (z2 || objY4 == c0042a) {
                        objY4 = new jcb(function4, 1);
                        bVarI.r(objY4);
                    }
                    k2l.a(R.drawable.ic_icon_tierlimit, 0, bVarI, strG3, (Function0) objY4);
                    bVarI.X(false);
                }
                bVarI.X(false);
            }
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: qoj0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    soj0.a(xkj0Var, wg8Var, il8Var, function1, function2, function3, function4, op8Var, (a) obj, qj40.a(i | 1));
                    return Unit.a;
                }
            };
        }
    }
}
