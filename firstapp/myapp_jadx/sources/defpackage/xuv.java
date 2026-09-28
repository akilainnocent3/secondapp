package defpackage;

import android.content.Context;
import android.view.View;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.runtime.m;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import androidx.compose.ui.layout.v;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.sporty.android.common_ui.uitext.UiText;
import com.sportybet.android.gp.tz.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes6.dex */
public final class xuv {
    public static final float a = 24.0f + 8.0f;

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(final lk40 lk40Var, final wtt wttVar, final vxj vxjVar, final ztt zttVar, final Function1 function1, a aVar, final int i) {
        int i2;
        b bVarI = aVar.i(696079700);
        if ((i & 6) == 0) {
            i2 = (bVarI.M(lk40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarI.A(wttVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= bVarI.A(vxjVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= bVarI.A(zttVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= bVarI.A(function1) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if (bVarI.q(i2 & 1, (i2 & 9363) != 9362)) {
            Object[] objArr = new Object[0];
            Object objY = bVarI.y();
            a.C0041a.C0042a c0042a = a.C0041a.a;
            if (objY == c0042a) {
                objY = new r8r(1);
                bVarI.r(objY);
            }
            final ytw ytwVar = (ytw) o350.e(objArr, (Function0) objY, bVarI, 48);
            Object objY2 = bVarI.y();
            if (objY2 == c0042a) {
                objY2 = m.b(0);
                bVarI.r(objY2);
            }
            final ytw ytwVar2 = (ytw) objY2;
            mmd mmdVar = (mmd) bVarI.O(kna.h);
            int iY0 = mmdVar.y0(5.5f);
            float height = ((View) bVarI.O(AndroidCompositionLocals_androidKt.f)).getHeight();
            float f = (lk40Var != null ? lk40Var.d : 0.0f) + iY0;
            boolean z = !((Boolean) ytwVar.getValue()).booleanValue() && (lk40Var != null && (height > 0.0f ? 1 : (height == 0.0f ? 0 : -1)) > 0 && (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1)) >= 0 && (((Number) ytwVar2.getValue()).intValue() == 0 || ((f + ((float) ((Number) ytwVar2.getValue()).intValue())) > height ? 1 : ((f + ((float) ((Number) ytwVar2.getValue()).intValue())) == height ? 0 : -1)) <= 0));
            Boolean boolValueOf = Boolean.valueOf(z);
            int i3 = 57344 & i2;
            boolean zB = (i3 == 16384) | bVarI.b(z);
            Object objY3 = bVarI.y();
            if (zB || objY3 == c0042a) {
                objY3 = new ruv(function1, z, null);
                bVarI.r(objY3);
            }
            xvf.e(bVarI, boolValueOf, (Function2) objY3);
            Object objY4 = bVarI.y();
            if (objY4 == c0042a) {
                objY4 = m.b(Boolean.FALSE);
                bVarI.r(objY4);
            }
            ytw ytwVar3 = (ytw) objY4;
            Boolean boolValueOf2 = Boolean.valueOf(z);
            boolean zB2 = bVarI.b(z) | ((i2 & 112) == 32);
            Object objY5 = bVarI.y();
            if (zB2 || objY5 == c0042a) {
                objY5 = new suv(z, wttVar, ytwVar3, null);
                bVarI.r(objY5);
            }
            xvf.e(bVarI, boolValueOf2, (Function2) objY5);
            Unit unit = Unit.a;
            boolean z2 = i3 == 16384;
            Object objY6 = bVarI.y();
            if (z2 || objY6 == c0042a) {
                objY6 = new puv(function1, 0);
                bVarI.r(objY6);
            }
            xvf.c(unit, (Function1) objY6, bVarI);
            if (!z || lk40Var == null) {
                e eVarZ = bVarI.Z();
                if (eVarZ != null) {
                    eVarZ.d = new quv(lk40Var, wttVar, vxjVar, zttVar, function1, i, 0);
                    return;
                }
                return;
            }
            int iY1 = mmdVar.y0(a);
            int iY2 = mmdVar.y0(8.0f);
            boolean zD = ((i2 & 14) == 4) | bVarI.d(iY0) | bVarI.d(iY1) | bVarI.d(iY2);
            Object objY7 = bVarI.y();
            if (zD || objY7 == c0042a) {
                objY7 = new ih6(lk40Var, iY0, iY1, iY2);
                bVarI.r(objY7);
            }
            ih6 ih6Var = (ih6) objY7;
            boolean zM = bVarI.M(ytwVar) | ((i2 & 7168) == 2048);
            Object objY8 = bVarI.y();
            if (zM || objY8 == c0042a) {
                objY8 = new Function0() { // from class: euv
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        ytwVar.setValue(Boolean.TRUE);
                        zttVar.invoke();
                        return Unit.a;
                    }
                };
                bVarI.r(objY8);
            }
            u90.a(ih6Var, (Function0) objY8, new x420(8, false), pp8.b(-1967479822, new Function2() { // from class: fuv
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    a aVar2 = (a) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                        Object objY9 = aVar2.y();
                        a.C0041a.C0042a c0042a2 = a.C0041a.a;
                        if (objY9 == c0042a2) {
                            objY9 = new wic(ytwVar2, 2);
                            aVar2.r(objY9);
                        }
                        d dVarA = v.a(d.a.b, (Function1) objY9);
                        final ytw ytwVar4 = ytwVar;
                        boolean zM2 = aVar2.M(ytwVar4);
                        final vxj vxjVar2 = vxjVar;
                        boolean zM3 = zM2 | aVar2.M(vxjVar2);
                        Object objY10 = aVar2.y();
                        if (zM3 || objY10 == c0042a2) {
                            objY10 = new Function0() { // from class: huv
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    ytwVar4.setValue(Boolean.TRUE);
                                    vxjVar2.invoke();
                                    return Unit.a;
                                }
                            };
                            aVar2.r(objY10);
                        }
                        Function0 function0 = (Function0) objY10;
                        boolean zM4 = aVar2.M(ytwVar4);
                        final ztt zttVar2 = zttVar;
                        boolean zM5 = zM4 | aVar2.M(zttVar2);
                        Object objY11 = aVar2.y();
                        if (zM5 || objY11 == c0042a2) {
                            objY11 = new Function0() { // from class: iuv
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    ytwVar4.setValue(Boolean.TRUE);
                                    zttVar2.invoke();
                                    return Unit.a;
                                }
                            };
                            aVar2.r(objY11);
                        }
                        fy3.a(3078, aVar2, dVarA, function0, (Function0) objY11);
                    } else {
                        aVar2.G();
                    }
                    return Unit.a;
                }
            }, bVarI), bVarI, 3456, 0);
        } else {
            bVarI.G();
        }
        e eVarZ2 = bVarI.Z();
        if (eVarZ2 != null) {
            eVarZ2.d = new Function2() { // from class: guv
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    xuv.a(lk40Var, wttVar, vxjVar, zttVar, function1, (a) obj, qj40.a(i | 1));
                    return Unit.a;
                }
            };
        }
    }

    public static final void b(cuv cuvVar, v0u v0uVar, az3 az3Var, Function1 function1, a aVar, final int i) {
        final Function1 function2;
        final az3 az3Var2;
        final v0u v0uVar2;
        final cuv cuvVar2;
        b bVarI = aVar.i(960953548);
        int i2 = (bVarI.M(cuvVar) ? 4 : 2) | i | (bVarI.M(v0uVar) ? 32 : 16) | (bVarI.M(az3Var) ? 256 : 128);
        if (bVarI.q(i2 & 1, (i2 & 1171) != 1170)) {
            d dVarG = h.g(androidx.compose.foundation.a.b(d.a.b, ((ast) bVarI.O(cst.e)).m, j060.c(4.0f)), 8.0f, 6.0f);
            i78 i78VarA = g78.a(new kw0.i(4.0f, true, new hw0()), ht.a.m, bVarI, 6);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarG);
            yka.k.getClass();
            tsr.a aVar2 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar2);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, i78VarA, yka.a.f);
            hlh0.a(bVarI, ne00VarS, yka.a.e);
            yka.a.C1350a c1350a = yka.a.g;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            hlh0.a(bVarI, dVarC, yka.a.d);
            e(0, bVarI);
            d(cuvVar, v0uVar, az3Var, function1, bVarI, i2 & 8190);
            cuvVar2 = cuvVar;
            v0uVar2 = v0uVar;
            az3Var2 = az3Var;
            function2 = function1;
            bVarI.X(true);
        } else {
            function2 = function1;
            az3Var2 = az3Var;
            v0uVar2 = v0uVar;
            cuvVar2 = cuvVar;
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(v0uVar2, az3Var2, function2, i) { // from class: luv
                public final /* synthetic */ v0u b;
                public final /* synthetic */ az3 c;
                public final /* synthetic */ Function1 d;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(3073);
                    xuv.b(this.a, this.b, this.c, this.d, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void c(final List list, final v0u v0uVar, final az3 az3Var, a aVar, final int i) {
        e eVarZ;
        Function2<? super a, ? super Integer, Unit> function2;
        list.getClass();
        v0uVar.getClass();
        b bVarI = aVar.i(1505048329);
        int i2 = (bVarI.M(list) ? 4 : 2) | i | (bVarI.M(v0uVar) ? 32 : 16) | (bVarI.M(az3Var) ? 256 : 128);
        if (bVarI.q(i2 & 1, (i2 & 147) != 146)) {
            if (list.isEmpty()) {
                eVarZ = bVarI.Z();
                if (eVarZ == null) {
                    return;
                } else {
                    function2 = new Function2(list, v0uVar, az3Var, i) { // from class: duv
                        public final /* synthetic */ List a;
                        public final /* synthetic */ v0u b;
                        public final /* synthetic */ az3 c;

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            ((Integer) obj2).getClass();
                            int iA = qj40.a(1);
                            xuv.c(this.a, this.b, this.c, (a) obj, iA);
                            return Unit.a;
                        }
                    };
                }
            } else {
                Object objY = bVarI.y();
                a.C0041a.C0042a c0042a = a.C0041a.a;
                if (objY == c0042a) {
                    objY = m.b(Boolean.FALSE);
                    bVarI.r(objY);
                }
                final ytw ytwVar = (ytw) objY;
                kw0.i iVar = new kw0.i(8.0f, true, new hw0());
                boolean z = !((Boolean) ytwVar.getValue()).booleanValue();
                boolean z2 = ((i2 & 14) == 4) | ((i2 & 112) == 32) | ((i2 & 896) == 256);
                Object objY2 = bVarI.y();
                if (z2 || objY2 == c0042a) {
                    objY2 = new Function1() { // from class: juv
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            szr szrVar = (szr) obj;
                            szrVar.getClass();
                            List list2 = list;
                            szrVar.d(list2.size(), null, new vuv(list2), new op8(2039820996, new wuv(list2, v0uVar, az3Var, ytwVar), true));
                            return Unit.a;
                        }
                    };
                    bVarI.r(objY2);
                }
                aur.b(null, null, null, iVar, null, null, z, null, (Function1) objY2, bVarI, 24576, 367);
            }
            eVarZ.d = function2;
        }
        bVarI.G();
        eVarZ = bVarI.Z();
        if (eVarZ != null) {
            function2 = new Function2(list, v0uVar, az3Var, i) { // from class: kuv
                public final /* synthetic */ List a;
                public final /* synthetic */ v0u b;
                public final /* synthetic */ az3 c;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    xuv.c(this.a, this.b, this.c, (a) obj, iA);
                    return Unit.a;
                }
            };
            eVarZ.d = function2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void d(cuv cuvVar, v0u v0uVar, az3 az3Var, final Function1 function1, a aVar, final int i) {
        int i2;
        v0u v0uVar2;
        d dVarR;
        final cuv cuvVar2 = cuvVar;
        final az3 az3Var2 = az3Var;
        b bVarI = aVar.i(2019566224);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? bVarI.M(cuvVar2) : bVarI.A(cuvVar2) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarI.M(v0uVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= bVarI.M(az3Var2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= bVarI.A(function1) ? 2048 : 1024;
        }
        if (bVarI.q(i2 & 1, (i2 & 1171) != 1170)) {
            boolean z = cuvVar2.d == wtv.d && az3Var2 != null;
            Object objY = bVarI.y();
            a.C0041a.C0042a c0042a = a.C0041a.a;
            if (objY == c0042a) {
                objY = m.b(Boolean.FALSE);
                bVarI.r(objY);
            }
            ytw ytwVar = (ytw) objY;
            if (z) {
                if (az3Var2 != null ? Intrinsics.g(az3Var2.a, Boolean.FALSE) : false) {
                    ytwVar.setValue(Boolean.TRUE);
                }
            }
            boolean z2 = z && ((Boolean) ytwVar.getValue()).booleanValue();
            Object objY2 = bVarI.y();
            if (objY2 == c0042a) {
                objY2 = m.b(null);
                bVarI.r(objY2);
            }
            final ytw ytwVar2 = (ytw) objY2;
            d.a aVar2 = d.a.b;
            if (z2) {
                bVarI.N(996698006);
                d dVarR2 = j.r(aVar2, 20.0f);
                Object objY3 = bVarI.y();
                if (objY3 == c0042a) {
                    objY3 = new Function1() { // from class: muv
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            urr urrVar = (urr) obj;
                            urrVar.getClass();
                            ytwVar2.setValue(urrVar.e() ? pk40.b(urrVar.T(0L), kc6.d(urrVar.a())) : null);
                            return Unit.a;
                        }
                    };
                    bVarI.r(objY3);
                }
                dVarR = v.a(dVarR2, (Function1) objY3);
                bVarI.X(false);
            } else {
                bVarI.N(997254766);
                bVarI.X(false);
                dVarR = j.r(aVar2, 20.0f);
            }
            d dVarH = g3w.h(aVar2, "mission_reward_content_row");
            d160 d160VarA = b160.a(new kw0.i(4.0f, true, new hw0()), ht.a.k, bVarI, 54);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarH);
            yka.k.getClass();
            tsr.a aVar3 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            yka.a.b bVar = yka.a.f;
            hlh0.a(bVarI, d160VarA, bVar);
            yka.a.d dVar = yka.a.e;
            hlh0.a(bVarI, ne00VarS, dVar);
            yka.a.C1350a c1350a = yka.a.g;
            int i3 = i2;
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode))) {
                n30.a(iHashCode, bVarI, iHashCode, c1350a);
            }
            yka.a.c cVar = yka.a.d;
            hlh0.a(bVarI, dVarC, cVar);
            mw90.a(cuvVar2.a, "Reward icon", dVarR, null, null, null, null, bVarI, 48, 2040);
            i78 i78VarA = g78.a(kw0.c, ht.a.m, bVarI, 0);
            int iHashCode2 = Long.hashCode(bVarI.T);
            ne00 ne00VarS2 = bVarI.S();
            d dVarC2 = c.c(bVarI, aVar2);
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
            } else {
                bVarI.p();
            }
            hlh0.a(bVarI, i78VarA, bVar);
            hlh0.a(bVarI, ne00VarS2, dVar);
            if (bVarI.S || !Intrinsics.g(bVarI.y(), Integer.valueOf(iHashCode2))) {
                n30.a(iHashCode2, bVarI, iHashCode2, c1350a);
            }
            hlh0.a(bVarI, dVarC2, cVar);
            cuvVar2 = cuvVar;
            UiText uiText = cuvVar2.b;
            qyd0 qyd0Var = AndroidCompositionLocals_androidKt.b;
            String strG = uiText.g((Context) bVarI.O(qyd0Var));
            qyd0 qyd0Var2 = kjb0.a;
            v0uVar2 = v0uVar;
            lkf0.d(strG, null, v0uVar2.a, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ijb0) bVarI.O(qyd0Var2)).n, bVarI, 0, 0, 131066);
            bVarI = bVarI;
            UiText uiText2 = cuvVar2.c;
            if (uiText2 == null) {
                bVarI.N(1031118643);
                bVarI.X(false);
            } else {
                bVarI.N(1031118644);
                lkf0.d(uiText2.g((Context) bVarI.O(qyd0Var)), null, ((lib0) bVarI.O(oib0.a)).o, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, imf0.b(((ijb0) bVarI.O(qyd0Var2)).s, 0L, 0L, t9i.f, null, null, 0L, null, null, null, 0, 0L, null, null, 16777211), bVarI, 0, 0, 131066);
                bVarI = bVarI;
                Unit unit = Unit.a;
                bVarI.X(false);
            }
            bVarI.X(true);
            bVarI.X(true);
            if (!z2 || az3Var == null) {
                az3Var2 = az3Var;
                bVarI.N(998450002);
                bVarI.X(false);
            } else {
                bVarI.N(998170351);
                az3Var2 = az3Var;
                a((lk40) ytwVar2.getValue(), az3Var2.b, az3Var2.c, az3Var2.d, function1, bVarI, (i3 << 3) & 57344);
                bVarI.X(false);
            }
        } else {
            v0uVar2 = v0uVar;
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            final v0u v0uVar3 = v0uVar2;
            eVarZ.d = new Function2() { // from class: nuv
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    xuv.d(cuvVar2, v0uVar3, az3Var2, function1, (a) obj, qj40.a(i | 1));
                    return Unit.a;
                }
            };
        }
    }

    public static final void e(int i, a aVar) {
        b bVar;
        b bVarI = aVar.i(-1707373138);
        if (bVarI.q(i & 1, i != 0)) {
            bVar = bVarI;
            lkf0.d(cb40.a(R.string.page_loyalty__mission_reward, new Object[0], bVarI), null, ((lib0) bVarI.O(oib0.a)).b, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, imf0.b(((ijb0) bVarI.O(kjb0.a)).s, 0L, 0L, t9i.f, null, null, 0L, null, null, null, 0, 0L, null, null, 16777211), bVar, 0, 0, 131066);
        } else {
            bVar = bVarI;
            bVar.G();
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new ouv();
        }
    }
}
