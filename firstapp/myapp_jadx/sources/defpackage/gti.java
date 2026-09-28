package defpackage;

import android.content.Context;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.runtime.e;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: loaded from: classes6.dex */
public final class gti {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(iti itiVar, a aVar, final int i) {
        final iti itiVar2;
        iti itiVar3;
        float f;
        boolean z;
        b bVarI = aVar.i(-660949227);
        int i2 = i | 2;
        if (bVarI.q(i2 & 1, (i2 & 3) != 2)) {
            bVarI.A0();
            if ((i & 1) == 0 || bVarI.h0()) {
                w8i0 w8i0VarA = zdt.a(bVarI);
                if (w8i0VarA == null) {
                    ib5.a("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                }
                itiVar3 = (iti) p8i0.a(jq40.a(iti.class), w8i0VarA, null, cll.a(w8i0VarA, bVarI), w8i0VarA instanceof iel ? ((iel) w8i0VarA).getDefaultViewModelCreationExtras() : cyb.a.b, bVarI);
            } else {
                bVarI.G();
                itiVar3 = itiVar;
            }
            bVarI.Y();
            final Context context = (Context) bVarI.O(AndroidCompositionLocals_androidKt.b);
            final ytw ytwVarC = wyh.c(itiVar3.c, bVarI, 0, 7);
            ytw ytwVarC2 = wyh.c(itiVar3.d, bVarI, 0, 7);
            boolean z2 = itiVar3.e;
            d.a aVar2 = d.a.b;
            d dVarE = j.e(aVar2, 1.0f);
            i78 i78VarA = g78.a(kw0.c, ht.a.m, bVarI, 0);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarE);
            yka.k.getClass();
            tsr.a aVar3 = yka.a.b;
            bVarI.D();
            if (bVarI.S) {
                bVarI.F(aVar3);
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
            d dVarF = h.f(aVar2, 16.0f);
            qyd0 qyd0Var = kjb0.a;
            imf0 imf0Var = ((ijb0) bVarI.O(qyd0Var)).o;
            qyd0 qyd0Var2 = oib0.a;
            final iti itiVar4 = itiVar3;
            lkf0.d("Back navigation is enabled in this debug flow. In production, the force update screen cannot be dismissed.", dVarF, ((lib0) bVarI.O(qyd0Var2)).b, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, imf0Var, bVarI, 48, 0, 131064);
            bVarI = bVarI;
            d dVarH = h.h(j.g(aVar2, 1.0f), 16.0f, 0.0f, 2);
            boolean zA = bVarI.A(itiVar4) | bVarI.A(context);
            Object objY = bVarI.y();
            a.C0041a.C0042a c0042a = a.C0041a.a;
            if (zA || objY == c0042a) {
                objY = new Function0() { // from class: bti
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Context context2 = context;
                        context2.getClass();
                        itiVar4.a.b(context2);
                        return Unit.a;
                    }
                };
                bVarI.r(objY);
            }
            xya.b(dVarH, false, null, null, null, 0.0f, null, (Function0) objY, a39.b, bVarI, 100663302, WebSocketProtocol.PAYLOAD_SHORT);
            d dVarH2 = h.h(hib0.a(aVar2, 8.0f, bVarI, aVar2, 1.0f), 16.0f, 0.0f, 2);
            boolean z3 = z2 && !((Boolean) ytwVarC.getValue()).booleanValue();
            boolean zA2 = bVarI.A(itiVar4) | bVarI.A(context);
            Object objY2 = bVarI.y();
            if (zA2 || objY2 == c0042a) {
                objY2 = new cti(0, itiVar4, context);
                bVarI.r(objY2);
            }
            xya.b(dVarH2, z3, null, null, null, 0.0f, null, (Function0) objY2, pp8.b(243392812, new gaj() { // from class: dti
                @Override // defpackage.gaj
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    a aVar4 = (a) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    ((e160) obj).getClass();
                    if (aVar4.q(iIntValue & 1, (iIntValue & 17) != 16)) {
                        final twd0 twd0Var = ytwVarC;
                        ck5.a(0.0f, pp8.b(298953858, new Function2() { // from class: fti
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj4, Object obj5) {
                                a aVar5 = (a) obj4;
                                int iIntValue2 = ((Integer) obj5).intValue();
                                if (!aVar5.q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                    aVar5.G();
                                } else if (((Boolean) twd0Var.getValue()).booleanValue()) {
                                    aVar5.N(-1627745072);
                                    q330.a(j.r(d.a.b, 20.0f), 0L, 2.0f, 0L, 0, 0.0f, aVar5, 390, 58);
                                    aVar5.H();
                                } else {
                                    aVar5.N(-1627536349);
                                    lkf0.d("Launch Force Update (Real APK)", null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, aVar5, 6, 0, 262142);
                                    aVar5.H();
                                }
                                return Unit.a;
                            }
                        }, aVar4), null, null, aVar4, 48, 13);
                    } else {
                        aVar4.G();
                    }
                    return Unit.a;
                }
            }, bVarI), bVarI, 100663302, 124);
            if (z2) {
                f = 16.0f;
                z = false;
                bVarI.N(886463415);
                bVarI.X(false);
            } else {
                bVarI.N(886160390);
                f = 16.0f;
                lkf0.d("Real APK download is only available on production environment.", h.g(aVar2, 16.0f, 4.0f), ((lib0) bVarI.O(qyd0Var2)).b, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ijb0) bVarI.O(qyd0Var)).o, bVarI, 54, 0, 131064);
                bVarI = bVarI;
                z = false;
                bVarI.X(false);
            }
            String str = (String) ytwVarC2.getValue();
            if (str == null) {
                bVarI.N(886492182);
                bVarI.X(z);
            } else {
                bVarI.N(886492183);
                b bVar = bVarI;
                lkf0.d(str, h.f(aVar2, f), j58.g, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, bVar, 432, 0, 262136);
                bVarI = bVar;
                Unit unit = Unit.a;
                bVarI.X(false);
            }
            bVarI.X(true);
            itiVar2 = itiVar4;
        } else {
            bVarI.G();
            itiVar2 = itiVar;
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(i) { // from class: eti
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    gti.a(this.a, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
