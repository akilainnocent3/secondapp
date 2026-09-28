package com.sporty.android.platform.features.newotp.agent;

import android.content.Context;
import android.content.Intent;
import androidx.fragment.app.Fragment;
import com.sporty.android.platform.features.newotp.util.OtpData;
import com.sporty.android.platform.features.newotp.util.OtpModule;
import defpackage.ee;
import defpackage.py1;
import defpackage.qe;
import defpackage.tnu;
import defpackage.ud;
import defpackage.vd;
import defpackage.vxo;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final class b {

    /* JADX INFO: Add missing generic type declarations: [DATA] */
    public static final class a<DATA> extends vd<OtpModule<DATA>, DATA> {
        @Override // defpackage.vd
        public final Intent a(Object obj, Context context) {
            OtpModule otpModule = (OtpModule) obj;
            otpModule.getClass();
            int i = OTPAgentActivity.b;
            return OTPAgentActivity.a.a(context, otpModule);
        }

        @Override // defpackage.vd
        public final Object c(Intent intent, int i) {
            OtpData otpData;
            if (i != -1 || intent == null || (otpData = (OtpData) vxo.a(intent, "key - otp data", OtpData.class)) == null) {
                return null;
            }
            return otpData;
        }
    }

    public static final ee a(py1 py1Var, final Function1 function1) {
        return py1Var.registerForActivityResult(new com.sporty.android.platform.features.newotp.agent.a(), new ud() { // from class: day
            @Override // defpackage.ud
            public final void a(Object obj) {
                OtpData otpData = (OtpData) obj;
                if (otpData != null) {
                    function1.invoke(otpData);
                }
            }
        });
    }

    public static final <DATA extends OtpData> ee<OtpModule<DATA>> b(Fragment fragment, final Function1<? super DATA, Unit> function1) {
        ee<OtpModule<DATA>> eeVarRegisterForActivityResult = fragment.registerForActivityResult(new a(), new ud() { // from class: cay
            @Override // defpackage.ud
            public final void a(Object obj) {
                OtpData otpData = (OtpData) obj;
                if (otpData != null) {
                    function1.invoke(otpData);
                }
            }
        });
        eeVarRegisterForActivityResult.getClass();
        return eeVarRegisterForActivityResult;
    }

    public static final tnu c(final Function1 function1, androidx.compose.runtime.a aVar) {
        function1.getClass();
        c cVar = new c();
        boolean zM = aVar.M(function1);
        Object objY = aVar.y();
        if (zM || objY == androidx.compose.runtime.a.C0041a.a) {
            objY = new Function1() { // from class: eay
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    OtpData otpData = (OtpData) obj;
                    if (otpData != null) {
                        function1.invoke(otpData);
                    }
                    return Unit.a;
                }
            };
            aVar.r(objY);
        }
        return qe.a(cVar, (Function1) objY, aVar);
    }
}
