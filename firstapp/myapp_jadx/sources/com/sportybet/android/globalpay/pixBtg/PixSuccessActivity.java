package com.sportybet.android.globalpay.pixBtg;

import android.content.Intent;
import android.os.Bundle;
import androidx.compose.runtime.a;
import com.sportybet.android.globalpay.pixBtg.PixSuccessActivity;
import defpackage.aqg0;
import defpackage.bb40;
import defpackage.ga00;
import defpackage.o7d;
import defpackage.op8;
import defpackage.psm;
import defpackage.pwx;
import defpackage.sh8;
import defpackage.uzl;
import defpackage.wae;
import defpackage.zn8;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/sportybet/android/globalpay/pixBtg/PixSuccessActivity;", "Lfq0;", "Lbb40;", "Lpwx;", "<init>", "()V", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class PixSuccessActivity extends uzl implements bb40, pwx {
    public static final /* synthetic */ int e = 0;
    public psm d;

    @Override // defpackage.uzl, androidx.fragment.app.e, defpackage.rn8, defpackage.yn8, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (intent != null) {
            ga00 ga00Var = ga00.DEPOSIT;
            final int intExtra = intent.getIntExtra("SUCCESS_ACTION", 1);
            String stringExtra = intent.getStringExtra("pix_account_value");
            final String str = stringExtra == null ? "" : stringExtra;
            String stringExtra2 = intent.getStringExtra("pix_trade_id");
            final String str2 = stringExtra2 == null ? "" : stringExtra2;
            String stringExtra3 = intent.getStringExtra("pix_amount");
            final String str3 = stringExtra3 == null ? "" : stringExtra3;
            zn8.a(this, new op8(-58860077, new Function2() { // from class: rf10
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    a aVar = (a) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    int i = PixSuccessActivity.e;
                    if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                        ga00 ga00Var2 = ga00.DEPOSIT;
                        final int i2 = intExtra;
                        String str4 = str3;
                        final PixSuccessActivity pixSuccessActivity = this;
                        String str5 = str;
                        String str6 = str2;
                        a.C0041a.C0042a c0042a = a.C0041a.a;
                        if (i2 == 1) {
                            aVar.N(-1153795488);
                            psm psmVar = pixSuccessActivity.d;
                            if (psmVar == null) {
                                Intrinsics.n("countryManager");
                                throw null;
                            }
                            String strF = psmVar.f();
                            boolean zA = aVar.A(pixSuccessActivity);
                            Object objY = aVar.y();
                            if (zA || objY == c0042a) {
                                uf10 uf10Var = new uf10(0, pixSuccessActivity, PixSuccessActivity.class, "goToHome", "goToHome()V", 0);
                                aVar.r(uf10Var);
                                objY = uf10Var;
                            }
                            Function0 function0 = (Function0) ((chp) objY);
                            boolean zA2 = aVar.A(pixSuccessActivity) | aVar.d(i2);
                            Object objY2 = aVar.y();
                            if (zA2 || objY2 == c0042a) {
                                objY2 = new Function0() { // from class: sf10
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        int i3 = PixSuccessActivity.e;
                                        pixSuccessActivity.u1(i2);
                                        return Unit.a;
                                    }
                                };
                                aVar.r(objY2);
                            }
                            bg10.b(str4, strF, str5, str6, function0, (Function0) objY2, aVar, 0);
                            aVar.H();
                        } else if (i2 == 2) {
                            aVar.N(-1153220748);
                            psm psmVar2 = pixSuccessActivity.d;
                            if (psmVar2 == null) {
                                Intrinsics.n("countryManager");
                                throw null;
                            }
                            String strF2 = psmVar2.f();
                            boolean zA3 = aVar.A(pixSuccessActivity);
                            Object objY3 = aVar.y();
                            if (zA3 || objY3 == c0042a) {
                                vf10 vf10Var = new vf10(0, pixSuccessActivity, PixSuccessActivity.class, "goToHome", "goToHome()V", 0);
                                aVar.r(vf10Var);
                                objY3 = vf10Var;
                            }
                            Function0 function1 = (Function0) ((chp) objY3);
                            boolean zA4 = aVar.A(pixSuccessActivity) | aVar.d(i2);
                            Object objY4 = aVar.y();
                            if (zA4 || objY4 == c0042a) {
                                objY4 = new Function0() { // from class: tf10
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        int i3 = PixSuccessActivity.e;
                                        pixSuccessActivity.u1(i2);
                                        return Unit.a;
                                    }
                                };
                                aVar.r(objY4);
                            }
                            bg10.d(str4, strF2, str5, str6, function1, (Function0) objY4, aVar, 0);
                            aVar.H();
                        } else {
                            aVar.N(-1152684913);
                            aVar.H();
                        }
                    } else {
                        aVar.G();
                    }
                    return Unit.a;
                }
            }, true));
        }
    }

    @Override // androidx.fragment.app.e, android.app.Activity
    public final void onPause() {
        super.onPause();
        getWindow().setFlags(8192, 8192);
    }

    @Override // androidx.fragment.app.e, android.app.Activity
    public final void onResume() {
        super.onResume();
        getWindow().clearFlags(8192);
    }

    public final void u1(int i) {
        Bundle bundle = new Bundle();
        ga00 ga00Var = ga00.DEPOSIT;
        if (i == 1) {
            bundle.putInt("key_param_tx_category", aqg0.e.c.a);
        } else if (i == 2) {
            bundle.putInt("key_param_tx_category", aqg0.j.c.a);
        }
        sh8.c().c(o7d.a(wae.ME_TRANSACTIONS), bundle);
        finish();
    }
}
