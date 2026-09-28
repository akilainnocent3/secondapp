package com.sporty.android.platform.features.account.register.presentation;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Pair;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import com.sporty.android.platform.features.account.register.presentation.RegistrationSuccessfulActivity;
import com.sportybet.android.gp.tz.R;
import defpackage.az40;
import defpackage.azm;
import defpackage.bb40;
import defpackage.cyb;
import defpackage.cz40;
import defpackage.dag;
import defpackage.ej5;
import defpackage.is40;
import defpackage.jq40;
import defpackage.js40;
import defpackage.jvd0;
import defpackage.k00;
import defpackage.k9j;
import defpackage.l1m;
import defpackage.op8;
import defpackage.pwx;
import defpackage.q8i0;
import defpackage.qlr;
import defpackage.r8i0;
import defpackage.rlf;
import defpackage.saj;
import defpackage.ts40;
import defpackage.v8i0;
import defpackage.wae;
import defpackage.wwd0;
import defpackage.zi50;
import defpackage.zn8;
import defpackage.zux;
import defpackage.zy40;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ua.naiksoftware.stomp.StompClient;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006:\u0001\tB\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lcom/sporty/android/platform/features/account/register/presentation/RegistrationSuccessfulActivity;", "Lpy1;", "Lzux;", "Lpwx;", "Lbb40;", "Lrlf;", "Lk9j;", "<init>", "()V", "a", "sportyplatform"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class RegistrationSuccessfulActivity extends l1m implements zux, pwx, bb40, rlf, k9j {
    public static final a d = new a();
    public final q8i0 b = new q8i0(jq40.a(az40.class), new j(), new i(), new k());
    public azm c;

    public static final class a {
        public static void a(Context context, js40 js40Var, boolean z, boolean z2) {
            Boolean bool = Boolean.FALSE;
            context.getClass();
            js40Var.getClass();
            Intent intent = new Intent(context, (Class<?>) RegistrationSuccessfulActivity.class);
            intent.putExtra("show_welcome_bonus_button", bool);
            intent.putExtra("reg_success_variant", js40Var.name());
            intent.putExtra("report_campaign_conversion", z);
            intent.putExtra("is_facial_recognition_deferred", z2);
            context.startActivity(intent);
        }
    }

    public static final /* synthetic */ class b extends saj implements Function2<Boolean, dag, Unit> {
        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Boolean bool, dag dagVar) {
            boolean zBooleanValue = bool.booleanValue();
            dag dagVar2 = dagVar;
            dagVar2.getClass();
            RegistrationSuccessfulActivity registrationSuccessfulActivity = (RegistrationSuccessfulActivity) this.receiver;
            a aVar = RegistrationSuccessfulActivity.d;
            registrationSuccessfulActivity.A1(zBooleanValue, dagVar2);
            return Unit.a;
        }
    }

    public static final /* synthetic */ class c extends saj implements Function0<Unit> {
        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            RegistrationSuccessfulActivity registrationSuccessfulActivity = (RegistrationSuccessfulActivity) this.receiver;
            a aVar = RegistrationSuccessfulActivity.d;
            azm azmVar = registrationSuccessfulActivity.c;
            if (azmVar != null) {
                azmVar.d(wae.VERIFY_PHONE_NUMBER_TO_CLAIM_BONUS);
                return Unit.a;
            }
            Intrinsics.n("router");
            throw null;
        }
    }

    public static final /* synthetic */ class d extends saj implements Function0<Unit> {
        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            RegistrationSuccessfulActivity registrationSuccessfulActivity = (RegistrationSuccessfulActivity) this.receiver;
            a aVar = RegistrationSuccessfulActivity.d;
            azm azmVar = registrationSuccessfulActivity.c;
            if (azmVar != null) {
                azmVar.k(wae.LOYALTY, new Pair[]{new Pair("tab", "mission")}, null);
                return Unit.a;
            }
            Intrinsics.n("router");
            throw null;
        }
    }

    public static final /* synthetic */ class e extends saj implements Function0<Unit> {
        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            RegistrationSuccessfulActivity registrationSuccessfulActivity = (RegistrationSuccessfulActivity) this.receiver;
            a aVar = RegistrationSuccessfulActivity.d;
            azm azmVar = registrationSuccessfulActivity.c;
            if (azmVar != null) {
                azmVar.d(wae.LOYALTY);
                return Unit.a;
            }
            Intrinsics.n("router");
            throw null;
        }
    }

    public static final /* synthetic */ class f extends saj implements Function0<Unit> {
        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            ((RegistrationSuccessfulActivity) this.receiver).finish();
            return Unit.a;
        }
    }

    public static final /* synthetic */ class g extends saj implements Function0<Unit> {
        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            RegistrationSuccessfulActivity registrationSuccessfulActivity = (RegistrationSuccessfulActivity) this.receiver;
            a aVar = RegistrationSuccessfulActivity.d;
            azm azmVar = registrationSuccessfulActivity.c;
            if (azmVar != null) {
                azmVar.d(wae.VERIFY_PHONE_NUMBER_TO_CLAIM_BONUS);
                return Unit.a;
            }
            Intrinsics.n("router");
            throw null;
        }
    }

    public static final /* synthetic */ class h extends saj implements Function0<Unit> {
        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            ((RegistrationSuccessfulActivity) this.receiver).finish();
            return Unit.a;
        }
    }

    public static final class i extends qlr implements Function0<r8i0.c> {
        public i() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            return RegistrationSuccessfulActivity.this.getDefaultViewModelProviderFactory();
        }
    }

    public static final class j extends qlr implements Function0<v8i0> {
        public j() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return RegistrationSuccessfulActivity.this.getViewModelStore();
        }
    }

    public static final class k extends qlr implements Function0<cyb> {
        public k() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final cyb invoke() {
            return RegistrationSuccessfulActivity.this.getDefaultViewModelCreationExtras();
        }
    }

    public final void A1(boolean z, dag dagVar) {
        az40 az40VarZ1 = z1();
        if (((zy40) az40VarZ1.z.a.getValue()).l) {
            ej5.c(az40VarZ1.e, null, null, new cz40(az40VarZ1, null), 3);
        }
        azm azmVar = this.c;
        if (azmVar == null) {
            Intrinsics.n("router");
            throw null;
        }
        wae waeVar = wae.DEPOSIT;
        Bundle bundle = new Bundle();
        bundle.putSerializable("EXTRA_ENTRANCE", dagVar);
        azmVar.e(waeVar, bundle);
        String str = z ? "click" : StompClient.DEFAULT_ACK;
        az40 az40VarZ2 = z1();
        ts40.q qVar = new ts40.q(str);
        k00 k00Var = k00.d;
        az40VarZ2.A1(qVar, k00Var);
        az40 az40VarZ3 = z1();
        ts40.c cVar = new ts40.c(str);
        k00 k00Var2 = k00.c;
        az40VarZ3.B1(cVar, k00Var2);
        z1().A1(ts40.g.a, k00.a, k00Var2, k00.b);
        z1().A1(new ts40.b(0), k00Var);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0031  */
    @Override // defpackage.py1, defpackage.r1k, defpackage.hrl, androidx.fragment.app.e, defpackage.rn8, defpackage.yn8, android.app.Activity
    public final void onCreate(Bundle bundle) {
        js40 js40Var;
        az40 az40Var;
        is40 is40Var;
        Object value;
        Object bVar;
        super.onCreate(bundle);
        String stringExtra = getIntent().getStringExtra("reg_success_variant");
        if (stringExtra != null) {
            d.getClass();
            try {
                zi50.a aVar = zi50.b;
                bVar = js40.valueOf(stringExtra);
            } catch (Throwable th) {
                zi50.a aVar2 = zi50.b;
                bVar = new zi50.b(th);
            }
            Object obj = js40.CURRENT;
            if (bVar instanceof zi50.b) {
                bVar = obj;
            }
            js40Var = (js40) bVar;
            if (js40Var == null) {
                js40Var = js40.CURRENT;
            }
        } else {
            js40Var = js40.CURRENT;
        }
        js40 js40Var2 = js40Var;
        boolean z = false;
        boolean booleanExtra = getIntent().getBooleanExtra("report_campaign_conversion", false);
        boolean booleanExtra2 = getIntent().getBooleanExtra("is_facial_recognition_deferred", false);
        az40 az40VarZ1 = z1();
        wwd0 wwd0Var = az40VarZ1.y;
        while (true) {
            Object value2 = wwd0Var.getValue();
            az40Var = az40VarZ1;
            zy40 zy40Var = (zy40) value2;
            if (az40.b.a[js40Var2.ordinal()] == 1) {
                is40Var = new is40(R.string.page_login__registration_complete, R.string.page_login__register_success_loyalty_banner_body);
            } else {
                is40Var = booleanExtra2 ? new is40(12) : new is40(15);
            }
            wwd0 wwd0Var2 = wwd0Var;
            boolean z2 = booleanExtra2;
            if (wwd0Var2.g(value2, zy40.a(zy40Var, js40Var2, null, null, false, false, false, false, false, 0, null, booleanExtra, is40Var, 2046))) {
                break;
            }
            wwd0Var = wwd0Var2;
            az40VarZ1 = az40Var;
            z = false;
            booleanExtra2 = z2;
        }
        az40Var.y1();
        az40 az40VarZ2 = z1();
        ts40.d dVar = new ts40.d(0);
        k00 k00Var = k00.d;
        az40VarZ2.A1(dVar, k00Var);
        z1().B1(new ts40.x(null), k00Var);
        az40 az40VarZ3 = z1();
        boolean booleanExtra3 = getIntent().getBooleanExtra("show_welcome_bonus_button", false);
        wwd0 wwd0Var3 = az40VarZ3.y;
        do {
            value = wwd0Var3.getValue();
        } while (!wwd0Var3.g(value, zy40.a((zy40) value, null, null, null, false, false, false, false, booleanExtra3, 0, null, false, null, 7935)));
        zn8.a(this, new op8(1052297199, new Function2() { // from class: ux40
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                a aVar3 = (a) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                RegistrationSuccessfulActivity.a aVar4 = RegistrationSuccessfulActivity.d;
                int i2 = 2;
                if (aVar3.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    d dVarE = j.e(d.a.b, 1.0f);
                    aiv aivVarC = g75.c(ht.a.a, false);
                    int iHashCode = Long.hashCode(aVar3.m());
                    ne00 ne00VarO = aVar3.o();
                    d dVarC = c.c(aVar3, dVarE);
                    yka.k.getClass();
                    tsr.a aVar5 = yka.a.b;
                    if (aVar3.k() == null) {
                        l2a.b();
                        throw null;
                    }
                    aVar3.D();
                    if (aVar3.g()) {
                        aVar3.F(aVar5);
                    } else {
                        aVar3.p();
                    }
                    hlh0.a(aVar3, aivVarC, yka.a.f);
                    hlh0.a(aVar3, ne00VarO, yka.a.e);
                    yka.a.C1350a c1350a = yka.a.g;
                    if (aVar3.g() || !Intrinsics.g(aVar3.y(), Integer.valueOf(iHashCode))) {
                        j3c.a(iHashCode, aVar3, iHashCode, c1350a);
                    }
                    hlh0.a(aVar3, dVarC, yka.a.d);
                    RegistrationSuccessfulActivity registrationSuccessfulActivity = this.a;
                    boolean zW = registrationSuccessfulActivity.getCountryManager().W();
                    a.C0041a.C0042a c0042a = a.C0041a.a;
                    if (zW) {
                        aVar3.N(-31005016);
                        az40 az40VarZ4 = registrationSuccessfulActivity.z1();
                        boolean zA = aVar3.A(registrationSuccessfulActivity);
                        Object objY = aVar3.y();
                        if (zA || objY == c0042a) {
                            RegistrationSuccessfulActivity.b bVar2 = new RegistrationSuccessfulActivity.b(2, registrationSuccessfulActivity, RegistrationSuccessfulActivity.class, "openDeposit", "openDeposit(ZLcom/sporty/android/common_analytics/sportytracking/model/EntranceDeposit;)V", 0);
                            aVar3.r(bVar2);
                            objY = bVar2;
                        }
                        Function2 function2 = (Function2) ((chp) objY);
                        boolean zA2 = aVar3.A(registrationSuccessfulActivity);
                        Object objY2 = aVar3.y();
                        if (zA2 || objY2 == c0042a) {
                            RegistrationSuccessfulActivity.c cVar = new RegistrationSuccessfulActivity.c(0, registrationSuccessfulActivity, RegistrationSuccessfulActivity.class, "openPhoneVerificationToClaimBonus", "openPhoneVerificationToClaimBonus()V", 0);
                            aVar3.r(cVar);
                            objY2 = cVar;
                        }
                        Function0 function0 = (Function0) ((chp) objY2);
                        boolean zA3 = aVar3.A(registrationSuccessfulActivity);
                        Object objY3 = aVar3.y();
                        if (zA3 || objY3 == c0042a) {
                            RegistrationSuccessfulActivity.d dVar2 = new RegistrationSuccessfulActivity.d(0, registrationSuccessfulActivity, RegistrationSuccessfulActivity.class, "openLoyaltyMissions", "openLoyaltyMissions()V", 0);
                            aVar3.r(dVar2);
                            objY3 = dVar2;
                        }
                        Function0 function1 = (Function0) ((chp) objY3);
                        boolean zA4 = aVar3.A(registrationSuccessfulActivity);
                        Object objY4 = aVar3.y();
                        if (zA4 || objY4 == c0042a) {
                            RegistrationSuccessfulActivity.e eVar = new RegistrationSuccessfulActivity.e(0, registrationSuccessfulActivity, RegistrationSuccessfulActivity.class, "openLoyalty", "openLoyalty()V", 0);
                            aVar3.r(eVar);
                            objY4 = eVar;
                        }
                        Function0 function3 = (Function0) ((chp) objY4);
                        boolean zA5 = aVar3.A(registrationSuccessfulActivity);
                        Object objY5 = aVar3.y();
                        if (zA5 || objY5 == c0042a) {
                            RegistrationSuccessfulActivity.f fVar = new RegistrationSuccessfulActivity.f(0, registrationSuccessfulActivity, RegistrationSuccessfulActivity.class, "finish", "finish()V", 0);
                            aVar3.r(fVar);
                            objY5 = fVar;
                        }
                        o85.a(az40VarZ4, function2, function0, function1, function3, (Function0) ((chp) objY5), null, aVar3, 8);
                        aVar3 = aVar3;
                        aVar3.H();
                    } else {
                        aVar3.N(-30550308);
                        az40 az40VarZ5 = registrationSuccessfulActivity.z1();
                        boolean zA6 = aVar3.A(registrationSuccessfulActivity);
                        Object objY6 = aVar3.y();
                        if (zA6 || objY6 == c0042a) {
                            objY6 = new axr(registrationSuccessfulActivity, i2);
                            aVar3.r(objY6);
                        }
                        Function1 function4 = (Function1) objY6;
                        boolean zA7 = aVar3.A(registrationSuccessfulActivity);
                        Object objY7 = aVar3.y();
                        if (zA7 || objY7 == c0042a) {
                            RegistrationSuccessfulActivity.g gVar = new RegistrationSuccessfulActivity.g(0, registrationSuccessfulActivity, RegistrationSuccessfulActivity.class, "openPhoneVerificationToClaimBonus", "openPhoneVerificationToClaimBonus()V", 0);
                            aVar3.r(gVar);
                            objY7 = gVar;
                        }
                        Function0 function5 = (Function0) ((chp) objY7);
                        boolean zA8 = aVar3.A(registrationSuccessfulActivity);
                        Object objY8 = aVar3.y();
                        if (zA8 || objY8 == c0042a) {
                            RegistrationSuccessfulActivity.h hVar = new RegistrationSuccessfulActivity.h(0, registrationSuccessfulActivity, RegistrationSuccessfulActivity.class, "finish", "finish()V", 0);
                            aVar3.r(hVar);
                            objY8 = hVar;
                        }
                        ifd.a(az40VarZ5, function4, null, function5, null, (Function0) ((chp) objY8), aVar3, 8, 20);
                        aVar3.H();
                    }
                    aVar3.s();
                } else {
                    aVar3.G();
                }
                return Unit.a;
            }
        }, true));
    }

    @Override // defpackage.py1, androidx.fragment.app.e, android.app.Activity
    public final void onPause() {
        super.onPause();
        jvd0 jvd0Var = z1().v;
        if (jvd0Var != null) {
            jvd0Var.cancel((CancellationException) null);
        }
    }

    @Override // defpackage.py1, androidx.fragment.app.e, android.app.Activity
    public final void onResume() {
        super.onResume();
        z1().C1();
    }

    public final az40 z1() {
        return (az40) this.b.getValue();
    }
}
