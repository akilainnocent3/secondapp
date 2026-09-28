package defpackage;

import android.view.View;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.d;
import androidx.recyclerview.widget.r;
import com.sportygames.newcms.c;
import com.sportygames.newcms.uitext.UiText;
import java.util.WeakHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class yf60 {
    public static final void a(final eg60 eg60Var, final Function1<? super vc60, Unit> function1, final Function0<Unit> function0, a aVar, int i) {
        eg60Var.getClass();
        function1.getClass();
        function0.getClass();
        b bVarI = aVar.i(1829128241);
        int i2 = (bVarI.M(eg60Var) ? 4 : 2) | i | (bVarI.A(function1) ? 32 : 16) | (bVarI.A(function0) ? 256 : 128);
        if (bVarI.q(i2 & 1, (i2 & 147) != 146)) {
            WeakHashMap<View, q8j0> weakHashMap = q8j0.v;
            final float fA = r8j0.c(q8j0.a.a(bVarI).e, bVarI).a();
            dc60.a.a(j.e(d.a.b, 1.0f), pp8.b(1280828538, new Function2() { // from class: rf60
                /* JADX WARN: Type inference fix 'apply assigned field type' failed
                java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                 */
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    String str;
                    a aVar2 = (a) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    int i3 = 1;
                    if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                        final eg60 eg60Var2 = eg60Var;
                        se60 se60Var = eg60Var2.a;
                        rc60 rc60Var = eg60Var2.b;
                        dtg0 dtg0VarF = vtg0.f(se60Var, "SBScreen", aVar2, 48, 0);
                        gzg0 gzg0VarE = yi0.e(r.d.DEFAULT_DRAG_ANIMATION_DURATION, 0, null, 6);
                        Object objY = aVar2.y();
                        a.C0041a.C0042a c0042a = a.C0041a.a;
                        if (objY == c0042a) {
                            objY = new vf60();
                            aVar2.r(objY);
                        }
                        final Function1 function2 = function1;
                        q3c.a(dtg0VarF, null, gzg0VarE, (Function1) objY, pp8.b(-1675086168, new p1y(function2, i3), aVar2), aVar2, 28032, 1);
                        if (Intrinsics.g(rc60Var, rc60.c.a)) {
                            aVar2.N(674129030);
                            aVar2.H();
                        } else if (Intrinsics.g(rc60Var, ag60.a)) {
                            aVar2.N(674179777);
                            boolean zM = aVar2.M(function2);
                            Object objY2 = aVar2.y();
                            if (zM || objY2 == c0042a) {
                                objY2 = new pja(function2, 2);
                                aVar2.r(objY2);
                            }
                            aa60.r((Function0) objY2, aVar2, 0);
                            aVar2.H();
                        } else if (Intrinsics.g(rc60Var, bg60.a)) {
                            aVar2.N(674358368);
                            String strC = c.c(ma60.B0.r, new String[0], aVar2);
                            boolean zM2 = aVar2.M(function2);
                            Object objY3 = aVar2.y();
                            if (zM2 || objY3 == c0042a) {
                                objY3 = new Function0() { // from class: xf60
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        function2.invoke(vc60.f.a);
                                        return Unit.a;
                                    }
                                };
                                aVar2.r(objY3);
                            }
                            pe60.d(0, aVar2, strC, (Function0) objY3);
                            aVar2.H();
                        } else if (rc60Var instanceof cg60) {
                            aVar2.N(674566502);
                            aVar2.H();
                        } else if (rc60Var instanceof rc60.e) {
                            aVar2.N(674639011);
                            rc60.e eVar = (rc60.e) rc60Var;
                            UiText uiText = eVar.a;
                            iwg iwgVar = eVar.b;
                            boolean z = eVar.c;
                            Function0 function3 = function0;
                            if (z) {
                                aVar2.N(-1779349331);
                                if (uiText == null) {
                                    aVar2.N(674829660);
                                    aVar2.H();
                                    str = null;
                                } else {
                                    aVar2.N(-1779346619);
                                    String strA = uiText.a(aVar2);
                                    aVar2.H();
                                    str = strA;
                                }
                                ma60 ma60Var = ma60.B0;
                                boolean zM3 = aVar2.M(function2);
                                Object objY4 = aVar2.y();
                                if (zM3 || objY4 == c0042a) {
                                    objY4 = new sf60(0, function2);
                                    aVar2.r(objY4);
                                }
                                hwg.a(iwgVar, str, ma60Var, function3, (Function0) objY4, aVar2, 384);
                                aVar2.H();
                            } else {
                                aVar2.N(-1779338399);
                                boolean zM4 = aVar2.M(function3);
                                Object objY5 = aVar2.y();
                                if (zM4 || objY5 == c0042a) {
                                    objY5 = new n0p(function3, 1);
                                    aVar2.r(objY5);
                                }
                                aVar2.t((Function0) objY5);
                                aVar2.H();
                            }
                            aVar2.H();
                        } else if (rc60Var instanceof rc60.a) {
                            aVar2.N(-1779333904);
                            rc60.a aVar3 = (rc60.a) rc60Var;
                            String strA2 = aVar3.a.a(aVar2);
                            String strA3 = aVar3.b.a(aVar2);
                            String strA4 = aVar3.c.a(aVar2);
                            boolean zM5 = aVar2.M(function2) | aVar2.M(eg60Var2);
                            Object objY6 = aVar2.y();
                            if (zM5 || objY6 == c0042a) {
                                objY6 = new Function0() { // from class: tf60
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        function2.invoke(((rc60.a) eg60Var2.b).d);
                                        return Unit.a;
                                    }
                                };
                                aVar2.r(objY6);
                            }
                            Function0 function4 = (Function0) objY6;
                            boolean zM6 = aVar2.M(function2) | aVar2.M(eg60Var2);
                            Object objY7 = aVar2.y();
                            if (zM6 || objY7 == c0042a) {
                                objY7 = new Function0() { // from class: uf60
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        function2.invoke(((rc60.a) eg60Var2.b).e);
                                        return Unit.a;
                                    }
                                };
                                aVar2.r(objY7);
                            }
                            j45.a(strA2, strA3, strA4, function4, (Function0) objY7, aVar2, 0);
                            aVar2.H();
                        } else if (Intrinsics.g(rc60Var, rc60.b.a)) {
                            aVar2.N(-1779321164);
                            ma60 ma60Var2 = ma60.B0;
                            boolean zM7 = aVar2.M(function2);
                            Object objY8 = aVar2.y();
                            if (zM7 || objY8 == c0042a) {
                                objY8 = new aht(1, function2);
                                aVar2.r(objY8);
                            }
                            Function0 function5 = (Function0) objY8;
                            boolean zM8 = aVar2.M(function2);
                            Object objY9 = aVar2.y();
                            if (zM8 || objY9 == c0042a) {
                                objY9 = new bht(function2, 1);
                                aVar2.r(objY9);
                            }
                            hit.d(ma60Var2, function5, (Function0) objY9, aVar2, 6);
                            aVar2.H();
                        } else if (Intrinsics.g(rc60Var, rc60.d.a)) {
                            aVar2.N(-1779311852);
                            ma60 ma60Var3 = ma60.B0;
                            boolean zM9 = aVar2.M(function2);
                            Object objY10 = aVar2.y();
                            if (zM9 || objY10 == c0042a) {
                                objY10 = new Function0() { // from class: wf60
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        function2.invoke(vc60.f.a);
                                        return Unit.a;
                                    }
                                };
                                aVar2.r(objY10);
                            }
                            awx.d(ma60Var3, (Function0) objY10, aVar2, 6);
                            aVar2.H();
                        } else if (rc60Var instanceof rc60.f) {
                            aVar2.N(-1779306168);
                            rc60.f fVar = (rc60.f) rc60Var;
                            String strA5 = fVar.a.a(aVar2);
                            String strA6 = fVar.b.a(aVar2);
                            boolean zM10 = aVar2.M(function2) | aVar2.M(eg60Var2);
                            Object objY11 = aVar2.y();
                            if (zM10 || objY11 == c0042a) {
                                objY11 = new f61(1, eg60Var2, function2);
                                aVar2.r(objY11);
                            }
                            ot90.c(strA5, strA6, (Function0) objY11, aVar2, 0);
                            aVar2.H();
                        } else if (rc60Var instanceof r760) {
                            aVar2.N(676350118);
                            aVar2.H();
                        } else {
                            if (!(rc60Var instanceof fa60)) {
                                throw rg.a(-1779368949, aVar2);
                            }
                            aVar2.N(676386822);
                            aVar2.H();
                        }
                        float f = fA + 36.0f;
                        d.a aVar4 = d.a.b;
                        d dVarE = j.e(h.j(aVar4, 0.0f, 0.0f, 0.0f, f, 7), 1.0f);
                        rc60 rc60Var2 = eg60Var2.b;
                        boolean zM11 = aVar2.M(function2);
                        Object objY12 = aVar2.y();
                        if (zM11 || objY12 == c0042a) {
                            objY12 = new zxe(function2, 1);
                            aVar2.r(objY12);
                        }
                        Function1 function6 = (Function1) objY12;
                        boolean zM12 = aVar2.M(function2);
                        Object objY13 = aVar2.y();
                        if (zM12 || objY13 == c0042a) {
                            objY13 = new aye(function2, 1);
                            aVar2.r(objY13);
                        }
                        jx2.b(dVarE, rc60Var2, function6, (Function0) objY13, aVar2, 0);
                        ja1.a(j.e(h.j(aVar4, 0.0f, 0.0f, 0.0f, f, 7), 1.0f), rc60Var, function2, aVar2, 0);
                        zf90.a(rc60Var, function2, aVar2, 0);
                    } else {
                        aVar2.G();
                    }
                    return Unit.a;
                }
            }, bVarI), bVarI, 438);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new cht(eg60Var, function1, function0, i);
        }
    }
}
