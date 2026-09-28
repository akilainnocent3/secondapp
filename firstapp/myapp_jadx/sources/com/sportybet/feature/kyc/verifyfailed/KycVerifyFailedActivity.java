package com.sportybet.feature.kyc.verifyfailed;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.compose.runtime.a;
import com.sporty.android.core.model.patron.KycSource;
import com.sportybet.feature.kyc.verifyfailed.KycVerifyFailedActivity;
import defpackage.azm;
import defpackage.bb40;
import defpackage.ful;
import defpackage.lsp;
import defpackage.op8;
import defpackage.pwx;
import defpackage.rdd0;
import defpackage.zn8;
import defpackage.zux;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001\u0007B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/sportybet/feature/kyc/verifyfailed/KycVerifyFailedActivity;", "Lpy1;", "Lbb40;", "Lzux;", "Lpwx;", "<init>", "()V", "a", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class KycVerifyFailedActivity extends ful implements bb40, zux, pwx {
    public static final /* synthetic */ int e = 0;
    public azm b;
    public lsp c;
    public rdd0 d;

    public static final class a {
        public static Intent a(Context context, String str, String str2, KycSource kycSource) {
            context.getClass();
            kycSource.getClass();
            Intent intentPutExtra = new Intent(context, (Class<?>) KycVerifyFailedActivity.class).putExtra("reject_title", str).putExtra("reject_reason", str2).putExtra("source", kycSource.getValue());
            intentPutExtra.getClass();
            return intentPutExtra;
        }
    }

    @Override // defpackage.py1, defpackage.r1k, defpackage.hrl, androidx.fragment.app.e, defpackage.rn8, defpackage.yn8, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        final String stringExtra = getIntent().getStringExtra("reject_title");
        if (stringExtra == null) {
            stringExtra = "";
        }
        String stringExtra2 = getIntent().getStringExtra("reject_reason");
        final String str = stringExtra2 != null ? stringExtra2 : "";
        final KycSource kycSourceFromValue = KycSource.INSTANCE.fromValue(getIntent().getStringExtra("source"));
        if (kycSourceFromValue == null) {
            kycSourceFromValue = KycSource.VERIFY;
        }
        zn8.a(this, new op8(-491975832, new Function2() { // from class: kup
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int i = KycVerifyFailedActivity.e;
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    final String str2 = stringExtra;
                    final String str3 = str;
                    final KycVerifyFailedActivity kycVerifyFailedActivity = this;
                    final KycSource kycSource = kycSourceFromValue;
                    o0z.a(null, null, null, null, null, pp8.b(324527511, new Function2() { // from class: lup
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj3, Object obj4) {
                            a aVar2 = (a) obj3;
                            int iIntValue2 = ((Integer) obj4).intValue();
                            int i2 = KycVerifyFailedActivity.e;
                            if (aVar2.q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                final KycVerifyFailedActivity kycVerifyFailedActivity2 = kycVerifyFailedActivity;
                                boolean zA = aVar2.A(kycVerifyFailedActivity2);
                                Object objY = aVar2.y();
                                a.C0041a.C0042a c0042a = a.C0041a.a;
                                if (zA || objY == c0042a) {
                                    objY = new Function0() { // from class: mup
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            int i3 = KycVerifyFailedActivity.e;
                                            KycVerifyFailedActivity kycVerifyFailedActivity3 = kycVerifyFailedActivity2;
                                            rdd0 rdd0Var = kycVerifyFailedActivity3.d;
                                            if (rdd0Var == null) {
                                                Intrinsics.n("sportyTrackingUseCase");
                                                throw null;
                                            }
                                            rdd0Var.a(osp.j.a, k00.d);
                                            kycVerifyFailedActivity3.finish();
                                            return Unit.a;
                                        }
                                    };
                                    aVar2.r(objY);
                                }
                                Function0 function0 = (Function0) objY;
                                boolean zA2 = aVar2.A(kycVerifyFailedActivity2);
                                Object objY2 = aVar2.y();
                                if (zA2 || objY2 == c0042a) {
                                    objY2 = new Function0() { // from class: nup
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            KycVerifyFailedActivity kycVerifyFailedActivity3 = kycVerifyFailedActivity2;
                                            azm azmVar = kycVerifyFailedActivity3.b;
                                            if (azmVar == null) {
                                                Intrinsics.n("router");
                                                throw null;
                                            }
                                            azmVar.d(wae.HOME);
                                            kycVerifyFailedActivity3.finish();
                                            return Unit.a;
                                        }
                                    };
                                    aVar2.r(objY2);
                                }
                                Function0 function1 = (Function0) objY2;
                                boolean zA3 = aVar2.A(kycVerifyFailedActivity2);
                                final KycSource kycSource2 = kycSource;
                                boolean zD = zA3 | aVar2.d(kycSource2.ordinal());
                                Object objY3 = aVar2.y();
                                if (zD || objY3 == c0042a) {
                                    objY3 = new Function0() { // from class: oup
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            int i3 = KycVerifyFailedActivity.e;
                                            KycVerifyFailedActivity kycVerifyFailedActivity3 = kycVerifyFailedActivity2;
                                            rdd0 rdd0Var = kycVerifyFailedActivity3.d;
                                            if (rdd0Var == null) {
                                                Intrinsics.n("sportyTrackingUseCase");
                                                throw null;
                                            }
                                            rdd0Var.a(osp.k.a, k00.d);
                                            lsp lspVar = kycVerifyFailedActivity3.c;
                                            if (lspVar == null) {
                                                Intrinsics.n("kycEntryNavigator");
                                                throw null;
                                            }
                                            Intent intentB = lspVar.b(kycVerifyFailedActivity3, kycSource2, null);
                                            if (intentB != null) {
                                                kycVerifyFailedActivity3.finish();
                                                kycVerifyFailedActivity3.startActivity(intentB);
                                            }
                                            return Unit.a;
                                        }
                                    };
                                    aVar2.r(objY3);
                                }
                                vup.a(str2, str3, function0, function1, (Function0) objY3, aVar2, 0);
                            } else {
                                aVar2.G();
                            }
                            return Unit.a;
                        }
                    }, aVar), aVar, 196608);
                } else {
                    aVar.G();
                }
                return Unit.a;
            }
        }, true));
    }
}
