package defpackage;

import android.view.View;
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
public final class mq30 {
    public static final void a(final sq30 sq30Var, final Function1<? super rn30, Unit> function1, final Function0<Unit> function0, a aVar, final int i) {
        sq30Var.getClass();
        function1.getClass();
        function0.getClass();
        b bVarI = aVar.i(1216397026);
        int i2 = (bVarI.M(sq30Var) ? 4 : 2) | i | (bVarI.A(function1) ? 32 : 16) | (bVarI.A(function0) ? 256 : 128);
        if (bVarI.q(i2 & 1, (i2 & 147) != 146)) {
            q75.a(j.e(androidx.compose.foundation.a.b(d.a.b, j58.b, zk40.a), 1.0f), ht.a.b, false, pp8.b(2126652600, new gaj() { // from class: gq30
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
                @Override // defpackage.gaj
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    Object bVar;
                    float f;
                    int i3;
                    r75 r75Var = (r75) obj;
                    a aVar2 = (a) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    r75Var.getClass();
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= aVar2.M(r75Var) ? 4 : 2;
                    }
                    if (aVar2.q(iIntValue & 1, (iIntValue & 19) != 18)) {
                        WeakHashMap<View, q8j0> weakHashMap = q8j0.v;
                        float fA = r8j0.c(q8j0.a.a(aVar2).e, aVar2).a();
                        float fD = r8j0.c(q8j0.a.a(aVar2).f, aVar2).d();
                        final float fMin = Math.min((r75Var.e() / 640.0f) * 360.0f, r75Var.d());
                        float fE = r75Var.e() - fA;
                        boolean zC = aVar2.c(fMin) | aVar2.c(fE);
                        Object objY = aVar2.y();
                        a.C0041a.C0042a c0042a = a.C0041a.a;
                        String strA = null;
                        if (zC || objY == c0042a) {
                            try {
                                zi50.a aVar3 = zi50.b;
                                bVar = Float.valueOf(fMin / fE);
                            } catch (Throwable th) {
                                zi50.a aVar4 = zi50.b;
                                bVar = new zi50.b(th);
                            }
                            if (bVar instanceof zi50.b) {
                                bVar = null;
                            }
                            Float f2 = (Float) bVar;
                            if (f2 != null) {
                                f = ((double) f2.floatValue()) < 0.5625d ? fE / 640.0f : fMin / 360.0f;
                            } else {
                                f = 0.0f;
                            }
                            objY = Float.valueOf(f);
                            aVar2.r(objY);
                        }
                        final float fFloatValue = ((Number) objY).floatValue();
                        final sq30 sq30Var2 = sq30Var;
                        nl30 nl30Var = sq30Var2.b;
                        nn30 nn30Var = sq30Var2.c;
                        boolean z = nl30Var instanceof nl30.a;
                        d.a aVar5 = d.a.b;
                        final Function1 function2 = function1;
                        if (z) {
                            aVar2.N(-691265269);
                            ak0.a(j.w(aVar5, fMin), ((nl30.a) sq30Var2.b).a, function2, aVar2, 0);
                            aVar2.H();
                        } else {
                            if (!Intrinsics.g(nl30Var, nl30.b.a)) {
                                throw rg.a(-691267481, aVar2);
                            }
                            aVar2.N(45823912);
                            aVar2.H();
                        }
                        g75.a(androidx.compose.foundation.a.a(j.i(j.g(aVar5, 1.0f), fD + 80.0f), new hfs(kotlin.collections.b.k(new j58(r58.d(4278392612L)), new j58(r58.b(468796))), null, (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits((14 & 4) != 0 ? Float.POSITIVE_INFINITY : 0.0f)) & 4294967295L), (14 & 8) != 0 ? 0 : 2), null, 0.0f, 6), aVar2, 0);
                        dtg0 dtg0VarF = vtg0.f(sq30Var2.a, "NNDScreen", aVar2, 48, 0);
                        gzg0 gzg0VarE = yi0.e(r.d.DEFAULT_DRAG_ANIMATION_DURATION, 0, null, 6);
                        Object objY2 = aVar2.y();
                        if (objY2 == c0042a) {
                            objY2 = new vmq(1);
                            aVar2.r(objY2);
                        }
                        q3c.a(dtg0VarF, null, gzg0VarE, (Function1) objY2, pp8.b(-367201364, new gaj() { // from class: lq30
                            @Override // defpackage.gaj
                            public final Object invoke(Object obj4, Object obj5, Object obj6) {
                                ap30 ap30Var = (ap30) obj4;
                                a aVar6 = (a) obj5;
                                int iIntValue2 = ((Integer) obj6).intValue();
                                ap30Var.getClass();
                                if ((iIntValue2 & 6) == 0) {
                                    iIntValue2 |= aVar6.M(ap30Var) ? 4 : 2;
                                }
                                if (!aVar6.q(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                                    aVar6.G();
                                } else if (ap30Var instanceof ap30.b) {
                                    aVar6.N(-693189457);
                                    zys.d(((ap30.b) ap30Var).a, aVar6, 0);
                                    aVar6.H();
                                } else {
                                    if (!(ap30Var instanceof ap30.a)) {
                                        throw rg.a(-693191091, aVar6);
                                    }
                                    aVar6.N(-13947467);
                                    qp30.e(j.c(j.w(d.a.b, fMin), 1.0f), (ap30.a) ap30Var, fFloatValue, function2, aVar6, (iIntValue2 << 3) & 112);
                                    aVar6.H();
                                }
                                return Unit.a;
                            }
                        }, aVar2), aVar2, 28032, 1);
                        t9j0.a(sq30Var2.d, aVar2, 0);
                        if (Intrinsics.g(nn30Var, nn30.d.a)) {
                            aVar2.N(47133352);
                            aVar2.H();
                        } else if (nn30Var instanceof nn30.b) {
                            aVar2.N(47182022);
                            po30.a((nn30.b) nn30Var, function2, aVar2, 0);
                            aVar2.H();
                        } else {
                            if (Intrinsics.g(nn30Var, oq30.a)) {
                                aVar2.N(-691210036);
                                boolean zM = aVar2.M(function2);
                                Object objY3 = aVar2.y();
                                if (zM || objY3 == c0042a) {
                                    objY3 = new zmq(1, function2);
                                    aVar2.r(objY3);
                                }
                                i3 = 0;
                                bn30.r((Function0) objY3, aVar2, 0);
                                aVar2.H();
                            } else if (Intrinsics.g(nn30Var, pq30.a)) {
                                aVar2.N(47455132);
                                String strC = c.c(jn30.c0.i, new String[0], aVar2);
                                boolean zM2 = aVar2.M(function2);
                                Object objY4 = aVar2.y();
                                if (zM2 || objY4 == c0042a) {
                                    objY4 = new quz(function2, 1);
                                    aVar2.r(objY4);
                                }
                                xo30.d(0, aVar2, strC, (Function0) objY4);
                                aVar2.H();
                            } else if (nn30Var instanceof qq30) {
                                aVar2.N(47669032);
                                aVar2.H();
                            } else if (nn30Var instanceof nn30.f) {
                                aVar2.N(47741603);
                                nn30.f fVar = (nn30.f) nn30Var;
                                UiText uiText = fVar.a;
                                iwg iwgVar = fVar.b;
                                boolean z2 = fVar.c;
                                Function0 function3 = function0;
                                if (z2) {
                                    aVar2.N(-691193171);
                                    if (uiText == null) {
                                        aVar2.N(47932190);
                                    } else {
                                        aVar2.N(-691190461);
                                        strA = uiText.a(aVar2);
                                    }
                                    aVar2.H();
                                    String str = strA;
                                    jn30 jn30Var = jn30.c0;
                                    boolean zM3 = aVar2.M(function2);
                                    Object objY5 = aVar2.y();
                                    if (zM3 || objY5 == c0042a) {
                                        objY5 = new okl(function2, 1);
                                        aVar2.r(objY5);
                                    }
                                    hwg.a(iwgVar, str, jn30Var, function3, (Function0) objY5, aVar2, 384);
                                    aVar2.H();
                                } else {
                                    aVar2.N(-691182177);
                                    boolean zM4 = aVar2.M(function3);
                                    Object objY6 = aVar2.y();
                                    if (zM4 || objY6 == c0042a) {
                                        objY6 = new pkl(function3, 1);
                                        aVar2.r(objY6);
                                    }
                                    aVar2.t((Function0) objY6);
                                    aVar2.H();
                                }
                                aVar2.H();
                            } else if (nn30Var instanceof nn30.a) {
                                aVar2.N(-691177682);
                                nn30.a aVar6 = (nn30.a) nn30Var;
                                String strA2 = aVar6.a.a(aVar2);
                                String strA3 = aVar6.b.a(aVar2);
                                String strA4 = aVar6.c.a(aVar2);
                                boolean zM5 = aVar2.M(function2) | aVar2.M(sq30Var2);
                                Object objY7 = aVar2.y();
                                if (zM5 || objY7 == c0042a) {
                                    objY7 = new qmq(1, sq30Var2, function2);
                                    aVar2.r(objY7);
                                }
                                Function0 function4 = (Function0) objY7;
                                boolean zM6 = aVar2.M(function2) | aVar2.M(sq30Var2);
                                Object objY8 = aVar2.y();
                                if (zM6 || objY8 == c0042a) {
                                    objY8 = new Function0() { // from class: hq30
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            function2.invoke(((nn30.a) sq30Var2.c).e);
                                            return Unit.a;
                                        }
                                    };
                                    aVar2.r(objY8);
                                }
                                j45.a(strA2, strA3, strA4, function4, (Function0) objY8, aVar2, 0);
                                aVar2.H();
                            } else if (Intrinsics.g(nn30Var, nn30.c.a)) {
                                aVar2.N(-691164934);
                                jn30 jn30Var2 = jn30.c0;
                                boolean zM7 = aVar2.M(function2);
                                Object objY9 = aVar2.y();
                                if (zM7 || objY9 == c0042a) {
                                    objY9 = new Function0() { // from class: iq30
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            function2.invoke(new rn30.d(false));
                                            return Unit.a;
                                        }
                                    };
                                    aVar2.r(objY9);
                                }
                                Function0 function5 = (Function0) objY9;
                                boolean zM8 = aVar2.M(function2);
                                Object objY10 = aVar2.y();
                                if (zM8 || objY10 == c0042a) {
                                    objY10 = new bkl(function2, 1);
                                    aVar2.r(objY10);
                                }
                                hit.d(jn30Var2, function5, (Function0) objY10, aVar2, 6);
                                aVar2.H();
                            } else if (Intrinsics.g(nn30Var, nn30.e.a)) {
                                aVar2.N(-691155372);
                                jn30 jn30Var3 = jn30.c0;
                                boolean zM9 = aVar2.M(function2);
                                Object objY11 = aVar2.y();
                                if (zM9 || objY11 == c0042a) {
                                    objY11 = new wmq(function2, 1);
                                    aVar2.r(objY11);
                                }
                                awx.d(jn30Var3, (Function0) objY11, aVar2, 6);
                                aVar2.H();
                            } else {
                                if (!(nn30Var instanceof nn30.g)) {
                                    throw rg.a(-691215924, aVar2);
                                }
                                aVar2.N(-691149594);
                                nn30.g gVar = (nn30.g) nn30Var;
                                String strA5 = gVar.a.a(aVar2);
                                String strA6 = gVar.b.a(aVar2);
                                boolean zM10 = aVar2.M(function2) | aVar2.M(sq30Var2);
                                Object objY12 = aVar2.y();
                                if (zM10 || objY12 == c0042a) {
                                    objY12 = new Function0() { // from class: kq30
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            function2.invoke(((nn30.g) sq30Var2.c).c);
                                            return Unit.a;
                                        }
                                    };
                                    aVar2.r(objY12);
                                }
                                i3 = 0;
                                ot90.c(strA5, strA6, (Function0) objY12, aVar2, 0);
                                aVar2.H();
                            }
                            yf90.a(nn30Var, function2, aVar2, i3);
                        }
                        i3 = 0;
                        yf90.a(nn30Var, function2, aVar2, i3);
                    } else {
                        aVar2.G();
                    }
                    return Unit.a;
                }
            }, bVarI), bVarI, 3126, 4);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(function1, function0, i) { // from class: jq30
                public final /* synthetic */ Function1 b;
                public final /* synthetic */ Function0 c;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    mq30.a(this.a, this.b, this.c, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
