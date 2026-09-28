package com.sportybet.feature.loyalty.impl.notifications.presentation.mission;

import android.content.Context;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.common_ui.uitext.UiText;
import com.sportybet.android.gp.tz.R;
import com.sportybet.feature.loyalty.impl.notifications.presentation.mission.b;
import com.sportybet.feature.loyalty.impl.notifications.presentation.mission.c;
import com.sportybet.feature.loyalty.impl.notifications.presentation.mission.d;
import defpackage.cb40;
import defpackage.dif;
import defpackage.fst;
import defpackage.gaj;
import defpackage.h55;
import defpackage.igf0;
import defpackage.iyf0;
import defpackage.jib0;
import defpackage.m65;
import defpackage.pp8;
import defpackage.umz;
import defpackage.vch0;
import defpackage.z45;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class c {
    public static final void a(final d.a aVar, final b bVar, final Function0<Unit> function0, androidx.compose.runtime.a aVar2, final int i) {
        androidx.compose.runtime.b bVarI = aVar2.i(1732822183);
        int i2 = (bVarI.M(aVar) ? 4 : 2) | i | (bVarI.M(bVar) ? 32 : 16) | (bVarI.A(function0) ? 256 : 128);
        if (bVarI.q(i2 & 1, (i2 & 147) != 146)) {
            boolean z = aVar instanceof d.a.C0390a;
            androidx.compose.runtime.a.C0041a.C0042a c0042a = androidx.compose.runtime.a.C0041a.a;
            if (z) {
                bVarI.N(1294021413);
                d.a.C0390a c0390a = (d.a.C0390a) aVar;
                int i3 = i2 & 112;
                int i4 = i2 & 896;
                boolean z2 = ((i2 & 14) == 4) | (i3 == 32) | (i4 == 256);
                Object objY = bVarI.y();
                if (z2 || objY == c0042a) {
                    objY = new Function0() { // from class: iwt
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            bVar.c(aVar);
                            function0.invoke();
                            return Unit.a;
                        }
                    };
                    bVarI.r(objY);
                }
                Function0 function1 = (Function0) objY;
                boolean z3 = (i3 == 32) | (i4 == 256);
                Object objY2 = bVarI.y();
                if (z3 || objY2 == c0042a) {
                    objY2 = new dif(1, bVar, function0);
                    bVarI.r(objY2);
                }
                h.b(null, c0390a, function1, (Function0) objY2, bVarI, (i2 << 3) & 112);
                bVarI.X(false);
            } else {
                if (!(aVar instanceof d.a.b)) {
                    throw igf0.a(bVarI, -1205185549, false);
                }
                bVarI.N(1294477206);
                d.a.b bVar2 = (d.a.b) aVar;
                ResourceUiText title = bVar2.getTitle();
                UiText uiTextE = aVar.e();
                ResourceUiText resourceUiTextC = bVar2.c();
                resourceUiTextC.getClass();
                String strG = resourceUiTextC.g((Context) bVarI.O(AndroidCompositionLocals_androidKt.b));
                ResourceUiText resourceUiTextA = bVar2.a();
                int i5 = i2 & 112;
                int i6 = i2 & 896;
                boolean z4 = (i5 == 32) | (i6 == 256);
                Object objY3 = bVarI.y();
                if (z4 || objY3 == c0042a) {
                    objY3 = new Function0() { // from class: jwt
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            bVar.a();
                            function0.invoke();
                            return Unit.a;
                        }
                    };
                    bVarI.r(objY3);
                }
                Function0 function2 = (Function0) objY3;
                boolean z5 = ((i2 & 14) == 4) | (i5 == 32) | (i6 == 256);
                Object objY4 = bVarI.y();
                if (z5 || objY4 == c0042a) {
                    objY4 = new Function0() { // from class: kwt
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            bVar.c(aVar);
                            function0.invoke();
                            return Unit.a;
                        }
                    };
                    bVarI.r(objY4);
                }
                fst.a(null, title, uiTextE, strG, resourceUiTextA, function2, (Function0) objY4, null, null, bVarI, 0, 385);
                bVarI.X(false);
            }
        } else {
            bVarI.G();
        }
        androidx.compose.runtime.e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(bVar, function0, i) { // from class: lwt
                public final /* synthetic */ b b;
                public final /* synthetic */ Function0 c;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    c.a(this.a, this.b, this.c, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final void b(final d.b bVar, final b bVar2, final Function0<Unit> function0, androidx.compose.runtime.a aVar, final int i) {
        androidx.compose.runtime.b bVarI = aVar.i(1203961419);
        int i2 = (bVarI.M(bVar) ? 4 : 2) | i | (bVarI.M(bVar2) ? 32 : 16) | (bVarI.A(function0) ? 256 : 128);
        if (bVarI.q(i2 & 1, (i2 & 147) != 146)) {
            String strA = cb40.a(R.string.gift__mission_complete_casino_reward_amount_currency, new Object[]{bVar.b(), bVar.d()}, bVarI);
            StringUiText stringUiText = vch0.a;
            StringUiText stringUiText2 = new StringUiText(strA);
            z45.b bVar3 = z45.b.a;
            iyf0 iyf0Var = iyf0.a;
            m65 m65VarA = m65.a.a(0.0f, 0.0f, 0.0f, 0.0f, bVarI, 15);
            h55 h55VarA = h55.a.a(null, new umz(0.0f, 0.0f, 0.0f, 0.0f), null, null, bVarI, 13);
            boolean z = ((i2 & 112) == 32) | ((i2 & 896) == 256);
            Object objY = bVarI.y();
            if (z || objY == androidx.compose.runtime.a.C0041a.a) {
                objY = new Function0() { // from class: mwt
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        bVar2.a();
                        function0.invoke();
                        return Unit.a;
                    }
                };
                bVarI.r(objY);
            }
            jib0.d(null, stringUiText2, null, 0L, 0L, 0L, iyf0Var, null, bVar3, m65VarA, h55VarA, null, (Function0) objY, null, null, null, pp8.b(-305595543, new gaj() { // from class: nwt
                @Override // defpackage.gaj
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    a aVar2 = (a) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    ((j78) obj).getClass();
                    if (aVar2.q(iIntValue & 1, (iIntValue & 17) != 16)) {
                        final d.b bVar4 = bVar;
                        if (bVar4 instanceof d.b.a) {
                            aVar2.N(1333955036);
                            androidx.compose.ui.d dVarG = j.g(androidx.compose.ui.d.a.b, 1.0f);
                            umz umzVarA = h.a(2, ((cjb0) aVar2.O(ejb0.a)).g, 0.0f);
                            ArrayList arrayList = ((d.b.a) bVar4).d;
                            final b bVar5 = bVar2;
                            boolean zA = aVar2.A(bVar5) | aVar2.M(bVar4);
                            final Function0 function1 = function0;
                            boolean zM = zA | aVar2.M(function1);
                            Object objY2 = aVar2.y();
                            if (zM || objY2 == a.C0041a.a) {
                                objY2 = new Function2() { // from class: pwt
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj4, Object obj5) {
                                        int iIntValue2 = ((Integer) obj4).intValue();
                                        jmh0 jmh0Var = (jmh0) obj5;
                                        jmh0Var.getClass();
                                        bVar5.b(iIntValue2, jmh0Var, ((d.b.a) bVar4).c);
                                        function1.invoke();
                                        return Unit.a;
                                    }
                                };
                                aVar2.r(objY2);
                            }
                            imh0.a(dVarG, umzVarA, arrayList, (Function2) objY2, aVar2, 6, 0);
                            aVar2.H();
                        } else {
                            if (!(bVar4 instanceof d.b.C0393b)) {
                                throw rg.a(-1619539654, aVar2);
                            }
                            aVar2.N(1334430545);
                            q330.a(null, ((lib0) aVar2.O(oib0.a)).R, 0.0f, 0L, 0, 0.0f, aVar2, 0, 61);
                            aVar2.H();
                        }
                    } else {
                        aVar2.G();
                    }
                    return Unit.a;
                }
            }, bVarI), bVarI, 102236160, 1572864, 59581);
            bVarI = bVarI;
        } else {
            bVarI.G();
        }
        androidx.compose.runtime.e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(bVar2, function0, i) { // from class: owt
                public final /* synthetic */ b b;
                public final /* synthetic */ Function0 c;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    c.b(this.a, this.b, this.c, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
