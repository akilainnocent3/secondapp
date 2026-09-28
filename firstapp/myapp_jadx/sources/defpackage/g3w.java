package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.compose.foundation.layout.h;
import androidx.compose.runtime.a;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.util.WeakHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final class g3w {
    public static final d a(d dVar, boolean z, gaj<? super d, ? super a, ? super Integer, ? extends d> gajVar, gaj<? super d, ? super a, ? super Integer, ? extends d> gajVar2, a aVar, int i, int i2) {
        dVar.getClass();
        if ((i2 & 4) != 0) {
            gajVar2 = new z2w();
        }
        if (z) {
            aVar.N(2012563645);
            d dVarInvoke = gajVar.invoke(dVar, aVar, Integer.valueOf((i & 14) | ((i >> 3) & 112)));
            aVar.H();
            return dVarInvoke;
        }
        aVar.N(2012598396);
        d dVarInvoke2 = gajVar2.invoke(dVar, aVar, Integer.valueOf((i & 14) | ((i >> 6) & 112)));
        aVar.H();
        return dVarInvoke2;
    }

    public static final d b(d dVar, boolean z, gaj<? super d, ? super a, ? super Integer, ? extends d> gajVar, a aVar, int i) {
        dVar.getClass();
        if (!z) {
            aVar.N(-1281989279);
            aVar.H();
            return dVar;
        }
        aVar.N(-1282034291);
        d dVarN = dVar.n(gajVar.invoke(d.a.b, aVar, Integer.valueOf(((i >> 3) & 112) | 6)));
        aVar.H();
        return dVarN;
    }

    public static d c(d dVar) {
        dVar.getClass();
        return c.a(dVar, gnn.a, new a3w());
    }

    public static final d d(d dVar) {
        dVar.getClass();
        return bz60.a(dVar, 1.0f, -1.0f);
    }

    public static final d e(d dVar, final int i, final j58 j58Var, int i2) {
        dVar.getClass();
        if ((i2 & 2) != 0) {
            j58Var = null;
        }
        return c.a(dVar, gnn.a, new gaj() { // from class: w2w
            @Override // defpackage.gaj
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                d dVar2 = (d) obj;
                a aVar = (a) obj2;
                e3w.a((Integer) obj3, dVar2, aVar, -1965527159);
                final Context context = (Context) aVar.O(AndroidCompositionLocals_androidKt.b);
                boolean zA = aVar.A(context);
                final int i3 = i;
                boolean zD = zA | aVar.d(i3);
                final j58 j58Var2 = j58Var;
                boolean zM = zD | aVar.M(j58Var2);
                Object objY = aVar.y();
                if (zM || objY == a.C0041a.a) {
                    objY = new Function1() { // from class: x2w
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj4) {
                            tcf tcfVar = (tcf) obj4;
                            tcfVar.getClass();
                            Drawable drawableA = gr0.a(context, i3);
                            if (drawableA != null) {
                                drawableA.mutate();
                                j58 j58Var3 = j58Var2;
                                if (j58Var3 != null) {
                                    drawableA.setTint(r58.l(j58Var3.a));
                                }
                                drawableA.setBounds(0, 0, (int) Float.intBitsToFloat((int) (tcfVar.d() >> 32)), (int) Float.intBitsToFloat((int) (tcfVar.d() & 4294967295L)));
                                drawableA.draw(i40.c(tcfVar.F1().a()));
                            }
                            return Unit.a;
                        }
                    };
                    aVar.r(objY);
                }
                d dVarA = androidx.compose.ui.draw.a.a(dVar2, (Function1) objY);
                aVar.H();
                return dVarA;
            }
        });
    }

    public static final d f(d dVar, final boolean z, final Function0<Unit> function0) {
        dVar.getClass();
        function0.getClass();
        return c.a(dVar, gnn.a, new gaj() { // from class: y2w
            @Override // defpackage.gaj
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                d dVar2 = (d) obj;
                a aVar = (a) obj2;
                ((Integer) obj3).getClass();
                dVar2.getClass();
                aVar.N(506067758);
                Object objY = aVar.y();
                if (objY == a.C0041a.a) {
                    objY = pr7.a(aVar);
                }
                d dVarN = dVar2.n(androidx.compose.foundation.d.a(dVar2, (psw) objY, null, z, null, function0));
                aVar.H();
                return dVarN;
            }
        });
    }

    public static final d h(d dVar, String str) {
        dVar.getClass();
        str.getClass();
        return androidx.compose.ui.platform.d.a(dVar, "com.sportybet.android:id/" + str);
    }

    public static d i(d dVar, final Function0 function0) {
        final xt50 xt50VarB = ut50.b(0.0f, 2, j58.m, true);
        final qsw qswVar = new qsw();
        dVar.getClass();
        xt50VarB.getClass();
        function0.getClass();
        return c.a(dVar, gnn.a, new gaj() { // from class: d3w
            @Override // defpackage.gaj
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                d dVar2 = (d) obj;
                a aVar = (a) obj2;
                ((Integer) obj3).getClass();
                dVar2.getClass();
                aVar.N(1910433007);
                Object objY = aVar.y();
                if (objY == a.C0041a.a) {
                    objY = qswVar;
                    aVar.r(objY);
                }
                d dVarN = dVar2.n(androidx.compose.foundation.d.b(dVar2, (psw) objY, xt50VarB, true, null, function0, 24));
                aVar.H();
                return dVarN;
            }
        });
    }

    public static d j(d dVar, int i) {
        final boolean z = (i & 1) != 0;
        final boolean z2 = (i & 2) != 0;
        dVar.getClass();
        return c.a(dVar, gnn.a, new gaj() { // from class: b3w
            @Override // defpackage.gaj
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                d dVar2 = (d) obj;
                a aVar = (a) obj2;
                e3w.a((Integer) obj3, dVar2, aVar, 1691042573);
                WeakHashMap<View, q8j0> weakHashMap = q8j0.v;
                dnn dnnVarC = r8j0.c(q8j0.a.a(aVar).g, aVar);
                d dVarJ = h.j(dVar2, 0.0f, z ? dnnVarC.d() + 0.0f : 0.0f, 0.0f, z2 ? 0.0f + dnnVarC.a() : 0.0f, 5);
                aVar.H();
                return dVarJ;
            }
        });
    }

    public static final d k(d dVar, boolean z) {
        dVar.getClass();
        return !z ? dVar.n(dw.a(dVar, 0.0f)) : dVar;
    }
}
