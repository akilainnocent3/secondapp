package defpackage;

import android.content.Context;
import android.content.Intent;
import androidx.activity.result.ActivityResult;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.e;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.sporty.android.core.model.patron.UserCertConstants;
import com.sportybet.plugin.realsports.search.widget.searchprematchpanel.SEfl.gvQvkPPtA;
import com.twilio.voice.EventGroupType;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.b;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class h7h {
    public static final List<Pair<String, String>> a = b.k(new Pair("12345678909", "Approved"), new Pair("11144477735", "Rejected"), new Pair(gvQvkPPtA.RLxJ, "Approved (Gustavo)"), new Pair("38050907813", "Score 11"), new Pair("32237697817", "Score >=50"), new Pair("45611359876", "Score -90"), new Pair("40673862810", "Score -40"), new Pair("22066643807", "Score 0"));
    public static final List<String> b = b.k(EventGroupType.REGISTRATION_EVENT_GROUP, "withdraw", "7-days-login", "bank-account", "password-reset", "self-exclusion");

    /* JADX INFO: loaded from: classes6.dex */
    public static final /* synthetic */ class a extends saj implements Function0<Unit> {
        public final /* synthetic */ tnu<Intent, ActivityResult> a;
        public final /* synthetic */ Context b;
        public final /* synthetic */ ytw<String> c;
        public final /* synthetic */ ytw<String> d;
        public final /* synthetic */ ytw<String> e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(tnu<Intent, ActivityResult> tnuVar, Context context, ytw<String> ytwVar, ytw<String> ytwVar2, ytw<String> ytwVar3) {
            super(0, Intrinsics.a.class, "launch", "FacialRecognitionDebugScreen$launch(Landroidx/activity/compose/ManagedActivityResultLauncher;Landroid/content/Context;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;)V", 0);
            this.a = tnuVar;
            this.b = context;
            this.c = ytwVar;
            this.d = ytwVar2;
            this.e = ytwVar3;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            Intent intent = new Intent();
            intent.setClassName(this.b.getPackageName(), "com.sportybet.feature.facialrecognition.presentation.FacialRecognitionActivity");
            intent.putExtra("data_enable_default_action_bar", false);
            intent.putExtra("cpf", this.c.getValue());
            intent.putExtra(UserCertConstants.CONFIRM_NAME_USAGE, this.d.getValue());
            this.e.setValue("");
            this.a.b(intent);
            return Unit.a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:43:0x029d  */
    /* JADX WARN: Code duplicated, block: B:46:0x02c1  */
    /* JADX WARN: Code duplicated, block: B:48:0x0333  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.a.C0041a.C0042a c0042a;
        boolean zA;
        Object objY;
        ytw ytwVar;
        androidx.compose.runtime.b bVarI = aVar.i(1967221573);
        int i2 = 0;
        if (bVarI.q(i & 1, i != 0)) {
            Context context = (Context) bVarI.O(AndroidCompositionLocals_androidKt.b);
            Object[] objArr = new Object[0];
            Object objY2 = bVarI.y();
            androidx.compose.runtime.a.C0041a.C0042a c0042a2 = androidx.compose.runtime.a.C0041a.a;
            if (objY2 == c0042a2) {
                objY2 = new v6h();
                bVarI.r(objY2);
            }
            final ytw ytwVar2 = (ytw) o350.e(objArr, (Function0) objY2, bVarI, 48);
            Object[] objArr2 = new Object[0];
            Object objY3 = bVarI.y();
            if (objY3 == c0042a2) {
                objY3 = new y6h();
                bVarI.r(objY3);
            }
            final ytw ytwVar3 = (ytw) o350.e(objArr2, (Function0) objY3, bVarI, 48);
            Object[] objArr3 = new Object[0];
            Object objY4 = bVarI.y();
            if (objY4 == c0042a2) {
                objY4 = new z6h();
                bVarI.r(objY4);
            }
            ytw ytwVar4 = (ytw) o350.e(objArr3, (Function0) objY4, bVarI, 48);
            ce ceVar = new ce();
            boolean zM = bVarI.M(ytwVar4);
            Object objY5 = bVarI.y();
            if (zM || objY5 == c0042a2) {
                objY5 = new a7h(ytwVar4, i2);
                bVarI.r(objY5);
            }
            tnu tnuVarA = qe.a(ceVar, (Function1) objY5, bVarI);
            d.a aVar2 = d.a.b;
            d dVarF = h.f(j.g(aVar2, 1.0f), 16.0f);
            i78 i78VarA = g78.a(new kw0.i(12.0f, true, new hw0()), ht.a.m, bVarI, 6);
            int iHashCode = Long.hashCode(bVarI.T);
            ne00 ne00VarS = bVarI.S();
            d dVarC = c.c(bVarI, dVarF);
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
            qyd0 qyd0Var = kjb0.a;
            lkf0.d("Facial Recognition Test", null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ijb0) bVarI.O(qyd0Var)).i, bVarI, 6, 0, 131070);
            d dVarG = j.g(aVar2, 1.0f);
            String str = (String) ytwVar2.getValue();
            boolean zM2 = bVarI.M(ytwVar2);
            Object objY6 = bVarI.y();
            if (zM2) {
                c0042a = c0042a2;
            } else {
                c0042a = c0042a2;
                if (objY6 == c0042a) {
                }
                androidx.compose.runtime.a.C0041a.C0042a c0042a3 = c0042a;
                hhf0.a(str, (Function1) objY6, dVarG, false, null, o19.a, null, null, null, null, true, 0, 0, null, null, bVarI, 1573248, 12582912, 8257464);
                lkf0.d("Quick-fill CPF:", null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ijb0) bVarI.O(qyd0Var)).o, bVarI, 6, 0, 131070);
                y1i.b(null, new kw0.i(8.0f, true, new hw0()), null, null, 0, 0, pp8.b(2093257482, new gaj() { // from class: c7h
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // defpackage.gaj
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        a aVar4 = (a) obj2;
                        int iIntValue = ((Integer) obj3).intValue();
                        ((o2i) obj).getClass();
                        if (aVar4.q(iIntValue & 1, (iIntValue & 17) != 16)) {
                            Iterator<T> it = h7h.a.iterator();
                            while (it.hasNext()) {
                                Pair pair = (Pair) it.next();
                                final String str2 = (String) pair.a;
                                final String str3 = (String) pair.b;
                                final ytw ytwVar5 = ytwVar2;
                                boolean zG = Intrinsics.g((String) ytwVar5.getValue(), str2);
                                boolean zM3 = aVar4.M(ytwVar5) | aVar4.M(str2);
                                Object objY7 = aVar4.y();
                                if (zM3 || objY7 == a.C0041a.a) {
                                    objY7 = new Function0() { // from class: w6h
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            ytwVar5.setValue(str2);
                                            return Unit.a;
                                        }
                                    };
                                    aVar4.r(objY7);
                                }
                                uk7.b(zG, (Function0) objY7, pp8.b(1148343300, new Function2() { // from class: x6h
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj4, Object obj5) {
                                        a aVar5 = (a) obj4;
                                        int iIntValue2 = ((Integer) obj5).intValue();
                                        if (aVar5.q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                            lkf0.d(str3, null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ijb0) aVar5.O(kjb0.a)).o, aVar5, 0, 0, 131070);
                                        } else {
                                            aVar5.G();
                                        }
                                        return Unit.a;
                                    }
                                }, aVar4), null, false, null, null, null, null, aVar4, 384, 0, 4088);
                            }
                        } else {
                            aVar4.G();
                        }
                        return Unit.a;
                    }
                }, bVarI), bVarI, 1572912, 61);
                ute.b(null, 0.0f, 0L, bVarI, 0, 7);
                lkf0.d("Usage:", null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ijb0) bVarI.O(qyd0Var)).o, bVarI, 6, 0, 131070);
                y1i.b(null, new kw0.i(8.0f, true, new hw0()), null, null, 0, 0, pp8.b(-812223437, new gaj() { // from class: d7h
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // defpackage.gaj
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        a aVar4 = (a) obj2;
                        int iIntValue = ((Integer) obj3).intValue();
                        ((o2i) obj).getClass();
                        if (aVar4.q(iIntValue & 1, (iIntValue & 17) != 16)) {
                            for (final String str2 : h7h.b) {
                                final ytw ytwVar5 = ytwVar3;
                                boolean zG = Intrinsics.g((String) ytwVar5.getValue(), str2);
                                boolean zM3 = aVar4.M(ytwVar5) | aVar4.M(str2);
                                Object objY7 = aVar4.y();
                                if (zM3 || objY7 == a.C0041a.a) {
                                    objY7 = new Function0() { // from class: f7h
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            ytwVar5.setValue(str2);
                                            return Unit.a;
                                        }
                                    };
                                    aVar4.r(objY7);
                                }
                                uk7.b(zG, (Function0) objY7, pp8.b(-280658730, new Function2() { // from class: g7h
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj4, Object obj5) {
                                        a aVar5 = (a) obj4;
                                        int iIntValue2 = ((Integer) obj5).intValue();
                                        if (aVar5.q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                            lkf0.d(str2, null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ijb0) aVar5.O(kjb0.a)).o, aVar5, 0, 0, 131070);
                                        } else {
                                            aVar5.G();
                                        }
                                        return Unit.a;
                                    }
                                }, aVar4), null, false, null, null, null, null, aVar4, 384, 0, 4088);
                            }
                        } else {
                            aVar4.G();
                        }
                        return Unit.a;
                    }
                }, bVarI), bVarI, 1572912, 61);
                bVarI = bVarI;
                ute.b(null, 0.0f, 0L, bVarI, 0, 7);
                zA = bVarI.A(context) | bVarI.M(ytwVar2) | bVarI.M(ytwVar3) | bVarI.M(ytwVar4) | bVarI.A(tnuVarA);
                objY = bVarI.y();
                if (!zA || objY == c0042a3) {
                    a aVar4 = new a(tnuVarA, context, ytwVar2, ytwVar3, ytwVar4);
                    ytwVar = ytwVar4;
                    bVarI.r(aVar4);
                    objY = aVar4;
                } else {
                    ytwVar = ytwVar4;
                }
                kku.b(6, bVarI, "Launch Facial Recognition", (Function0) ((chp) objY));
                if (((String) ytwVar.getValue()).length() > 0) {
                    bVarI.N(246530681);
                    ute.b(null, 0.0f, 0L, bVarI, 0, 7);
                    lkf0.d("Result:", null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ijb0) bVarI.O(qyd0Var)).j, bVarI, 6, 0, 131070);
                    lkf0.d((String) ytwVar.getValue(), null, ((lib0) bVarI.O(oib0.a)).b, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ijb0) bVarI.O(qyd0Var)).o, bVarI, 0, 0, 131066);
                    bVarI = bVarI;
                    bVarI.X(false);
                } else {
                    bVarI.N(246863187);
                    bVarI.X(false);
                }
                bVarI.X(true);
            }
            objY6 = new b7h(ytwVar2, 0);
            bVarI.r(objY6);
            androidx.compose.runtime.a.C0041a.C0042a c0042a4 = c0042a;
            hhf0.a(str, (Function1) objY6, dVarG, false, null, o19.a, null, null, null, null, true, 0, 0, null, null, bVarI, 1573248, 12582912, 8257464);
            lkf0.d("Quick-fill CPF:", null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ijb0) bVarI.O(qyd0Var)).o, bVarI, 6, 0, 131070);
            y1i.b(null, new kw0.i(8.0f, true, new hw0()), null, null, 0, 0, pp8.b(2093257482, new gaj() { // from class: c7h
                /* JADX WARN: Multi-variable type inference failed */
                @Override // defpackage.gaj
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    a aVar5 = (a) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    ((o2i) obj).getClass();
                    if (aVar5.q(iIntValue & 1, (iIntValue & 17) != 16)) {
                        Iterator<T> it = h7h.a.iterator();
                        while (it.hasNext()) {
                            Pair pair = (Pair) it.next();
                            final String str2 = (String) pair.a;
                            final String str3 = (String) pair.b;
                            final ytw ytwVar5 = ytwVar2;
                            boolean zG = Intrinsics.g((String) ytwVar5.getValue(), str2);
                            boolean zM3 = aVar5.M(ytwVar5) | aVar5.M(str2);
                            Object objY7 = aVar5.y();
                            if (zM3 || objY7 == a.C0041a.a) {
                                objY7 = new Function0() { // from class: w6h
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        ytwVar5.setValue(str2);
                                        return Unit.a;
                                    }
                                };
                                aVar5.r(objY7);
                            }
                            uk7.b(zG, (Function0) objY7, pp8.b(1148343300, new Function2() { // from class: x6h
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj4, Object obj5) {
                                    a aVar6 = (a) obj4;
                                    int iIntValue2 = ((Integer) obj5).intValue();
                                    if (aVar6.q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                        lkf0.d(str3, null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ijb0) aVar6.O(kjb0.a)).o, aVar6, 0, 0, 131070);
                                    } else {
                                        aVar6.G();
                                    }
                                    return Unit.a;
                                }
                            }, aVar5), null, false, null, null, null, null, aVar5, 384, 0, 4088);
                        }
                    } else {
                        aVar5.G();
                    }
                    return Unit.a;
                }
            }, bVarI), bVarI, 1572912, 61);
            ute.b(null, 0.0f, 0L, bVarI, 0, 7);
            lkf0.d("Usage:", null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ijb0) bVarI.O(qyd0Var)).o, bVarI, 6, 0, 131070);
            y1i.b(null, new kw0.i(8.0f, true, new hw0()), null, null, 0, 0, pp8.b(-812223437, new gaj() { // from class: d7h
                /* JADX WARN: Multi-variable type inference failed */
                @Override // defpackage.gaj
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    a aVar5 = (a) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    ((o2i) obj).getClass();
                    if (aVar5.q(iIntValue & 1, (iIntValue & 17) != 16)) {
                        for (final String str2 : h7h.b) {
                            final ytw ytwVar5 = ytwVar3;
                            boolean zG = Intrinsics.g((String) ytwVar5.getValue(), str2);
                            boolean zM3 = aVar5.M(ytwVar5) | aVar5.M(str2);
                            Object objY7 = aVar5.y();
                            if (zM3 || objY7 == a.C0041a.a) {
                                objY7 = new Function0() { // from class: f7h
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        ytwVar5.setValue(str2);
                                        return Unit.a;
                                    }
                                };
                                aVar5.r(objY7);
                            }
                            uk7.b(zG, (Function0) objY7, pp8.b(-280658730, new Function2() { // from class: g7h
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj4, Object obj5) {
                                    a aVar6 = (a) obj4;
                                    int iIntValue2 = ((Integer) obj5).intValue();
                                    if (aVar6.q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                        lkf0.d(str2, null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ijb0) aVar6.O(kjb0.a)).o, aVar6, 0, 0, 131070);
                                    } else {
                                        aVar6.G();
                                    }
                                    return Unit.a;
                                }
                            }, aVar5), null, false, null, null, null, null, aVar5, 384, 0, 4088);
                        }
                    } else {
                        aVar5.G();
                    }
                    return Unit.a;
                }
            }, bVarI), bVarI, 1572912, 61);
            bVarI = bVarI;
            ute.b(null, 0.0f, 0L, bVarI, 0, 7);
            zA = bVarI.A(context) | bVarI.M(ytwVar2) | bVarI.M(ytwVar3) | bVarI.M(ytwVar4) | bVarI.A(tnuVarA);
            objY = bVarI.y();
            if (zA) {
                a aVar5 = new a(tnuVarA, context, ytwVar2, ytwVar3, ytwVar4);
                ytwVar = ytwVar4;
                bVarI.r(aVar5);
                objY = aVar5;
            } else {
                a aVar6 = new a(tnuVarA, context, ytwVar2, ytwVar3, ytwVar4);
                ytwVar = ytwVar4;
                bVarI.r(aVar6);
                objY = aVar6;
            }
            kku.b(6, bVarI, "Launch Facial Recognition", (Function0) ((chp) objY));
            if (((String) ytwVar.getValue()).length() > 0) {
                bVarI.N(246530681);
                ute.b(null, 0.0f, 0L, bVarI, 0, 7);
                lkf0.d("Result:", null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ijb0) bVarI.O(qyd0Var)).j, bVarI, 6, 0, 131070);
                lkf0.d((String) ytwVar.getValue(), null, ((lib0) bVarI.O(oib0.a)).b, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((ijb0) bVarI.O(qyd0Var)).o, bVarI, 0, 0, 131066);
                bVarI = bVarI;
                bVarI.X(false);
            } else {
                bVarI.N(246863187);
                bVarI.X(false);
            }
            bVarI.X(true);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new e7h();
        }
    }
}
