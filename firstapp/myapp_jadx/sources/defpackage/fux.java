package defpackage;

import android.view.View;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.d;
import androidx.recyclerview.widget.r;
import com.sportygames.newcms.c;
import java.util.WeakHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class fux {
    public static final void a(final ebx ebxVar, final Function1<? super z8x, Unit> function1, final Function0<Unit> function0, a aVar, final int i) {
        ebxVar.getClass();
        function1.getClass();
        function0.getClass();
        b bVarI = aVar.i(1623404667);
        int i2 = (bVarI.M(ebxVar) ? 4 : 2) | i | (bVarI.A(function1) ? 32 : 16) | (bVarI.A(function0) ? 256 : 128);
        if (bVarI.q(i2 & 1, (i2 & 147) != 146)) {
            q75.a(j.e(androidx.compose.foundation.a.b(d.a.b, j58.b, zk40.a), 1.0f), ht.a.b, false, pp8.b(1738156625, new gaj() { // from class: utx
                @Override // defpackage.gaj
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    Object bVar;
                    float f;
                    r75 r75Var = (r75) obj;
                    a aVar2 = (a) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    r75Var.getClass();
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= aVar2.M(r75Var) ? 4 : 2;
                    }
                    int i3 = 1;
                    int i4 = 0;
                    if (aVar2.q(iIntValue & 1, (iIntValue & 19) != 18)) {
                        WeakHashMap<View, q8j0> weakHashMap = q8j0.v;
                        float fA = r8j0.c(q8j0.a.a(aVar2).e, aVar2).a();
                        final float fMin = Math.min((r75Var.e() / 640.0f) * 360.0f, r75Var.d());
                        float fE = r75Var.e() - fA;
                        boolean zC = aVar2.c(fMin) | aVar2.c(fE);
                        Object objY = aVar2.y();
                        a.C0041a.C0042a c0042a = a.C0041a.a;
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
                        final ebx ebxVar2 = ebxVar;
                        x6x x6xVar = ebxVar2.b;
                        v8x v8xVar = ebxVar2.c;
                        boolean z = x6xVar instanceof x6x.a;
                        final Function1 function2 = function1;
                        if (z) {
                            aVar2.N(-373745980);
                            bk0.a(j.w(d.a.b, fMin), ((x6x.a) ebxVar2.b).a, function2, aVar2, 0);
                            aVar2.H();
                        } else {
                            if (!Intrinsics.g(x6xVar, x6x.b.a)) {
                                throw rg.a(-373748222, aVar2);
                            }
                            aVar2.N(1298988271);
                            aVar2.H();
                        }
                        dtg0 dtg0VarF = vtg0.f(ebxVar2.a, "NNDScreen", aVar2, 48, 0);
                        gzg0 gzg0VarE = yi0.e(r.d.DEFAULT_DRAG_ANIMATION_DURATION, 0, null, 6);
                        Object objY2 = aVar2.y();
                        if (objY2 == c0042a) {
                            objY2 = new ztx();
                            aVar2.r(objY2);
                        }
                        q3c.a(dtg0VarF, null, gzg0VarE, (Function1) objY2, pp8.b(919542402, new gaj() { // from class: bux
                            @Override // defpackage.gaj
                            public final Object invoke(Object obj4, Object obj5, Object obj6) {
                                gax gaxVar = (gax) obj4;
                                a aVar5 = (a) obj5;
                                int iIntValue2 = ((Integer) obj6).intValue();
                                gaxVar.getClass();
                                if ((iIntValue2 & 6) == 0) {
                                    iIntValue2 |= aVar5.M(gaxVar) ? 4 : 2;
                                }
                                if (!aVar5.q(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                                    aVar5.G();
                                } else if (gaxVar instanceof gax.b) {
                                    aVar5.N(-1083011547);
                                    zys.d(((gax.b) gaxVar).a, aVar5, 0);
                                    aVar5.H();
                                } else {
                                    if (!(gaxVar instanceof gax.a)) {
                                        throw rg.a(-1083013204, aVar5);
                                    }
                                    aVar5.N(786470840);
                                    d dVarC = j.c(j.w(d.a.b, fMin), 1.0f);
                                    ktx.e(fFloatValue, (iIntValue2 << 3) & 112, (gax.a) gaxVar, aVar5, dVarC, function2);
                                    aVar5.H();
                                }
                                return Unit.a;
                            }
                        }, aVar2), aVar2, 28032, 1);
                        t9j0.a(ebxVar2.d, aVar2, 0);
                        if (Intrinsics.g(v8xVar, v8x.d.a)) {
                            aVar2.N(1299920751);
                            aVar2.H();
                        } else if (v8xVar instanceof v8x.b) {
                            aVar2.N(1299970444);
                            s9x.a((v8x.b) v8xVar, function2, aVar2, 0);
                            aVar2.H();
                        } else if (Intrinsics.g(v8xVar, abx.a)) {
                            aVar2.N(-373702777);
                            boolean zM = aVar2.M(function2);
                            Object objY3 = aVar2.y();
                            if (zM || objY3 == c0042a) {
                                objY3 = new o76(function2, 1);
                                aVar2.r(objY3);
                            }
                            n8x.q((Function0) objY3, aVar2, 0);
                            aVar2.H();
                        } else if (Intrinsics.g(v8xVar, bbx.a)) {
                            aVar2.N(-373698519);
                            String strC = c.c(shj.v0.o, new String[0], aVar2);
                            boolean zM2 = aVar2.M(function2);
                            Object objY4 = aVar2.y();
                            if (zM2 || objY4 == c0042a) {
                                objY4 = new cux(function2, 0);
                                aVar2.r(objY4);
                            }
                            eax.e(0, aVar2, strC, (Function0) objY4);
                            aVar2.H();
                        } else if (v8xVar instanceof cbx) {
                            aVar2.N(1300441551);
                            aVar2.H();
                        } else if (v8xVar instanceof v8x.f) {
                            aVar2.N(1300513595);
                            v8x.f fVar = (v8x.f) v8xVar;
                            String str = fVar.a;
                            iwg iwgVar = fVar.b;
                            boolean z2 = fVar.c;
                            Function0 function3 = function0;
                            if (z2) {
                                aVar2.N(-373686507);
                                shj shjVar = shj.v0;
                                boolean zM3 = aVar2.M(function2);
                                Object objY5 = aVar2.y();
                                if (zM3 || objY5 == c0042a) {
                                    objY5 = new dux(function2, 0);
                                    aVar2.r(objY5);
                                }
                                hwg.a(iwgVar, str, shjVar, function3, (Function0) objY5, aVar2, 384);
                                aVar2.H();
                            } else {
                                aVar2.N(-373677032);
                                boolean zM4 = aVar2.M(function3);
                                Object objY6 = aVar2.y();
                                if (zM4 || objY6 == c0042a) {
                                    objY6 = new eux(function3, 0);
                                    aVar2.r(objY6);
                                }
                                aVar2.t((Function0) objY6);
                                aVar2.H();
                            }
                            aVar2.H();
                        } else if (v8xVar instanceof v8x.a) {
                            aVar2.N(-373672541);
                            v8x.a aVar5 = (v8x.a) v8xVar;
                            String str2 = aVar5.a;
                            String str3 = aVar5.b;
                            String str4 = aVar5.c;
                            boolean zM5 = aVar2.M(function2) | aVar2.M(ebxVar2);
                            Object objY7 = aVar2.y();
                            if (zM5 || objY7 == c0042a) {
                                objY7 = new Function0() { // from class: vtx
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        function2.invoke(((v8x.a) ebxVar2.c).d);
                                        return Unit.a;
                                    }
                                };
                                aVar2.r(objY7);
                            }
                            Function0 function4 = (Function0) objY7;
                            boolean zM6 = aVar2.M(function2) | aVar2.M(ebxVar2);
                            Object objY8 = aVar2.y();
                            if (zM6 || objY8 == c0042a) {
                                objY8 = new Function0() { // from class: wtx
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        function2.invoke(((v8x.a) ebxVar2.c).e);
                                        return Unit.a;
                                    }
                                };
                                aVar2.r(objY8);
                            }
                            j45.a(str2, str3, str4, function4, (Function0) objY8, aVar2, 0);
                            aVar2.H();
                        } else if (Intrinsics.g(v8xVar, v8x.c.a)) {
                            aVar2.N(-373661445);
                            shj shjVar2 = shj.v0;
                            boolean zM7 = aVar2.M(function2);
                            Object objY9 = aVar2.y();
                            if (zM7 || objY9 == c0042a) {
                                objY9 = new xtx(function2, i4);
                                aVar2.r(objY9);
                            }
                            Function0 function5 = (Function0) objY9;
                            boolean zM8 = aVar2.M(function2);
                            Object objY10 = aVar2.y();
                            if (zM8 || objY10 == c0042a) {
                                objY10 = new cea(function2, 1);
                                aVar2.r(objY10);
                            }
                            hit.d(shjVar2, function5, (Function0) objY10, aVar2, 6);
                            aVar2.H();
                        } else if (Intrinsics.g(v8xVar, v8x.e.a)) {
                            aVar2.N(-373653654);
                            boolean zM9 = aVar2.M(function2);
                            Object objY11 = aVar2.y();
                            if (zM9 || objY11 == c0042a) {
                                objY11 = new l76(function2, i3);
                                aVar2.r(objY11);
                            }
                            oax.d((Function0) objY11, aVar2, 0);
                            aVar2.H();
                        } else {
                            if (!(v8xVar instanceof v8x.g)) {
                                throw rg.a(-373709053, aVar2);
                            }
                            aVar2.N(-373649977);
                            v8x.g gVar = (v8x.g) v8xVar;
                            String str5 = gVar.a;
                            String str6 = gVar.b;
                            boolean zM10 = aVar2.M(function2) | aVar2.M(ebxVar2);
                            Object objY12 = aVar2.y();
                            if (zM10 || objY12 == c0042a) {
                                objY12 = new aux(0, function2, ebxVar2);
                                aVar2.r(objY12);
                            }
                            ot90.c(str5, str6, (Function0) objY12, aVar2, 0);
                            aVar2.H();
                        }
                        ag90.a(v8xVar, function2, aVar2, 0);
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
            eVarZ.d = new Function2(function1, function0, i) { // from class: ytx
                public final /* synthetic */ Function1 b;
                public final /* synthetic */ Function0 c;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    fux.a(this.a, this.b, this.c, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
