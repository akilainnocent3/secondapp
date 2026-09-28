package com.sporty.android.platform.features.security.newdevicelogin.loginalert;

import android.content.Context;
import androidx.compose.runtime.a;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.sporty.android.platform.features.security.newdevicelogin.loginalert.c;
import com.sporty.android.platform.features.security.newdevicelogin.loginalert.g;
import com.sportybet.android.gp.tz.R;
import defpackage.aht;
import defpackage.bht;
import defpackage.cb40;
import defpackage.chp;
import defpackage.cht;
import defpackage.cys;
import defpackage.ej5;
import defpackage.ku90;
import defpackage.nzj;
import defpackage.o8i0;
import defpackage.saj;
import defpackage.uhc;
import defpackage.x5a0;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class c {

    public static final /* synthetic */ class a extends saj implements Function1<com.sporty.android.platform.features.security.newdevicelogin.loginalert.a, Unit> {
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(com.sporty.android.platform.features.security.newdevicelogin.loginalert.a aVar) {
            com.sporty.android.platform.features.security.newdevicelogin.loginalert.a aVar2 = aVar;
            aVar2.getClass();
            g gVar = (g) this.receiver;
            gVar.getClass();
            if (aVar2.equals(com.sporty.android.platform.features.security.newdevicelogin.loginalert.a.b.a)) {
                ej5.c(o8i0.d(gVar), null, null, new f(gVar, null), 3);
            } else if (aVar2.equals(com.sporty.android.platform.features.security.newdevicelogin.loginalert.a.C0209a.a)) {
                ej5.c(o8i0.d(gVar), null, null, new e(gVar, null), 3);
            } else {
                if (!aVar2.equals(com.sporty.android.platform.features.security.newdevicelogin.loginalert.a.c.a)) {
                    uhc.a();
                    return null;
                }
                ku90<b> ku90Var = gVar.f;
                ku90Var.a.a(b.a.a);
            }
            return Unit.a;
        }
    }

    public static final void a(final String str, g gVar, androidx.compose.runtime.a aVar, final int i) {
        final g gVar2;
        gVar.getClass();
        androidx.compose.runtime.b bVarI = aVar.i(1835900446);
        int i2 = (bVarI.M(str) ? 4 : 2) | i | (bVarI.A(gVar) ? 32 : 16);
        if (bVarI.q(i2 & 1, (i2 & 19) != 18)) {
            d dVar = (d) ((x5a0) gVar.e).getValue();
            boolean z = (i2 & 112) == 32 || bVarI.A(gVar);
            Object objY = bVarI.y();
            if (z || objY == androidx.compose.runtime.a.C0041a.a) {
                gVar2 = gVar;
                a aVar2 = new a(1, gVar2, g.class, "handleAction", "handleAction(Lcom/sporty/android/platform/features/security/newdevicelogin/loginalert/LoginAlertAction;)V", 0);
                bVarI.r(aVar2);
                objY = aVar2;
            } else {
                gVar2 = gVar;
            }
            b(str, dVar, (Function1) ((chp) objY), bVarI, i2 & 14);
        } else {
            gVar2 = gVar;
            bVarI.G();
        }
        androidx.compose.runtime.e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(str, gVar2, i) { // from class: ygt
                public final /* synthetic */ String a;
                public final /* synthetic */ g b;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(65);
                    c.a(this.a, this.b, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void b(String str, d dVar, final Function1<? super com.sporty.android.platform.features.security.newdevicelogin.loginalert.a, Unit> function1, androidx.compose.runtime.a aVar, int i) {
        boolean z;
        dVar.getClass();
        function1.getClass();
        androidx.compose.runtime.b bVarI = aVar.i(1279446431);
        int i2 = i | (bVarI.M(str) ? 4 : 2) | (bVarI.M(dVar) ? 32 : 16) | (bVarI.A(function1) ? 256 : 128);
        if (bVarI.q(i2 & 1, (i2 & 147) != 146)) {
            boolean z2 = dVar instanceof d.a;
            androidx.compose.runtime.a.C0041a.C0042a c0042a = androidx.compose.runtime.a.C0041a.a;
            if (z2) {
                bVarI.N(-1845933660);
                String strG = ((d.a) dVar).a.g((Context) bVarI.O(AndroidCompositionLocals_androidKt.b));
                z = (i2 & 896) == 256;
                Object objY = bVarI.y();
                if (z || objY == c0042a) {
                    objY = new Function0() { // from class: zgt
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            function1.invoke(com.sporty.android.platform.features.security.newdevicelogin.loginalert.a.c.a);
                            return Unit.a;
                        }
                    };
                    bVarI.r(objY);
                }
                nzj.b(null, "", strG, null, null, null, null, null, null, null, null, null, (Function0) objY, null, bVarI, 48, 0, 12281);
                bVarI = bVarI;
                bVarI.X(false);
            } else if (dVar.equals(d.c.a)) {
                bVarI.N(-1845648708);
                cys.a(null, bVarI, 0);
                bVarI.X(false);
            } else if (dVar.equals(d.C0211d.a)) {
                bVarI.N(-1845538813);
                String strA = cb40.a(R.string.account_protection__account_protection, new Object[0], bVarI);
                String strA2 = cb40.a(R.string.account_protection__yes_it_is_me, new Object[0], bVarI);
                String strA3 = cb40.a(R.string.account_protection__no_it_is_not_me, new Object[0], bVarI);
                int i3 = i2 & 896;
                boolean z3 = i3 == 256;
                Object objY2 = bVarI.y();
                if (z3 || objY2 == c0042a) {
                    objY2 = new aht(0, function1);
                    bVarI.r(objY2);
                }
                Function0 function0 = (Function0) objY2;
                z = i3 == 256;
                Object objY3 = bVarI.y();
                if (z || objY3 == c0042a) {
                    objY3 = new bht(function1, 0);
                    bVarI.r(objY3);
                }
                nzj.d(strA, str, null, null, strA2, strA3, null, null, null, null, null, function0, (Function0) objY3, null, bVarI, (i2 << 3) & 112, 0, 20380);
                bVarI.X(false);
            } else {
                bVarI.N(1187417859);
                bVarI.X(false);
            }
        } else {
            bVarI.G();
        }
        androidx.compose.runtime.e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new cht(str, dVar, function1, i);
        }
    }
}
