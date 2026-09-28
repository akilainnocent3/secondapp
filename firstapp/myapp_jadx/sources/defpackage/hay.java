package defpackage;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import com.sporty.android.platform.features.newotp.util.OtpData;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final class hay implements qxi {
    public final /* synthetic */ Function1 a;

    public hay(Function1 function1) {
        this.a = function1;
    }

    @Override // defpackage.qxi
    public final void a(String str, Bundle bundle) {
        Parcelable parcelable;
        bundle.getClass();
        if (Build.VERSION.SDK_INT >= 33) {
            parcelable = (Parcelable) bundle.getParcelable("key - otp data", OtpData.class);
        } else {
            Parcelable parcelable2 = bundle.getParcelable("key - otp data");
            if (!(parcelable2 instanceof OtpData)) {
                parcelable2 = null;
            }
            parcelable = (OtpData) parcelable2;
        }
        OtpData otpData = (OtpData) parcelable;
        if (otpData != null) {
            this.a.invoke(otpData);
        }
    }
}
