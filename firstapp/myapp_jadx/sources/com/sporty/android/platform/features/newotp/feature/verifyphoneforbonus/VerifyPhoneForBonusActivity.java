package com.sporty.android.platform.features.newotp.feature.verifyphoneforbonus;

import android.os.Bundle;
import com.sporty.android.core.model.security.otp.TradingOTPResult;
import com.sporty.android.platform.features.newotp.feature.verifyphoneforbonus.VerifyPhoneForBonusActivity;
import com.sporty.android.platform.features.newotp.util.OTPResult;
import com.sporty.android.platform.features.newotp.util.OtpData;
import com.sporty.android.platform.features.newotp.util.OtpModule;
import com.sporty.android.platform.features.newotp.util.OtpViewModelClasses;
import defpackage.a1i0;
import defpackage.azm;
import defpackage.bb40;
import defpackage.cyb;
import defpackage.d7m;
import defpackage.e1i0;
import defpackage.ee;
import defpackage.i1i0;
import defpackage.jq40;
import defpackage.m0i0;
import defpackage.p0i0;
import defpackage.pwx;
import defpackage.q8i0;
import defpackage.qlr;
import defpackage.r8i0;
import defpackage.rlf;
import defpackage.s0i0;
import defpackage.v8i0;
import defpackage.x0i0;
import defpackage.zux;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005B\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/sporty/android/platform/features/newotp/feature/verifyphoneforbonus/VerifyPhoneForBonusActivity;", "Lpy1;", "Lzux;", "Lpwx;", "Lrlf;", "Lbb40;", "<init>", "()V", "sportyplatform"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class VerifyPhoneForBonusActivity extends d7m implements zux, pwx, rlf, bb40 {
    public static final /* synthetic */ int e = 0;
    public azm c;
    public final q8i0 b = new q8i0(jq40.a(p0i0.class), new b(), new a(), new c());
    public final ee<OtpModule<OtpData.VerifyPrimaryPhone>> d = com.sporty.android.platform.features.newotp.agent.b.a(this, new Function1() { // from class: h0i0
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            OtpData.VerifyPrimaryPhone verifyPrimaryPhone = (OtpData.VerifyPrimaryPhone) obj;
            int i = VerifyPhoneForBonusActivity.e;
            verifyPrimaryPhone.getClass();
            OTPResult<TradingOTPResult> oTPResult = verifyPrimaryPhone.e;
            boolean z = oTPResult instanceof OTPResult.Success;
            VerifyPhoneForBonusActivity verifyPhoneForBonusActivity = this.a;
            if (z) {
                ej5.c(ebs.a(verifyPhoneForBonusActivity.getLifecycle()), null, null, new j0i0(verifyPhoneForBonusActivity, null), 3);
            } else {
                if (!(oTPResult instanceof OTPResult.Failed) && !Intrinsics.g(oTPResult, OTPResult.NoResult.a)) {
                    uhc.a();
                    return null;
                }
                verifyPhoneForBonusActivity.finish();
            }
            return Unit.a;
        }
    });

    public static final class a extends qlr implements Function0<r8i0.c> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            return VerifyPhoneForBonusActivity.this.getDefaultViewModelProviderFactory();
        }
    }

    public static final class b extends qlr implements Function0<v8i0> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return VerifyPhoneForBonusActivity.this.getViewModelStore();
        }
    }

    public static final class c extends qlr implements Function0<cyb> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final cyb invoke() {
            return VerifyPhoneForBonusActivity.this.getDefaultViewModelCreationExtras();
        }
    }

    @Override // defpackage.py1, defpackage.r1k, defpackage.hrl, androidx.fragment.app.e, defpackage.rn8, defpackage.yn8, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        p0i0 p0i0Var = (p0i0) this.b.getValue();
        com.sporty.android.platform.features.newotp.util.a aVar = p0i0Var.a;
        String strP = p0i0Var.b.P();
        String phoneNumber = p0i0Var.c.getPhoneNumber();
        phoneNumber.getClass();
        aVar.getClass();
        strP.getClass();
        this.d.b(new OtpModule(new OtpData.VerifyPrimaryPhone(strP, phoneNumber, 20), new OtpViewModelClasses(m0i0.class, a1i0.class, i1i0.class, x0i0.class, e1i0.class, s0i0.class)));
    }
}
