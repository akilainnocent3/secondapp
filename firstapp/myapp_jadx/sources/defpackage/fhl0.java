package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.common.Feature;

/* JADX INFO: loaded from: classes4.dex */
public final class fhl0 extends x3l {
    @Override // defpackage.r12
    public final boolean A() {
        return false;
    }

    @Override // defpackage.r12, sl0.f
    public final int l() {
        return 17895000;
    }

    @Override // defpackage.r12
    public final /* bridge */ /* synthetic */ IInterface q(IBinder iBinder) {
        iBinder.getClass();
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.recaptchabase.internal.IRecaptchaBaseService");
        return iInterfaceQueryLocalInterface instanceof k1l0 ? (k1l0) iInterfaceQueryLocalInterface : new k1l0(iBinder);
    }

    @Override // defpackage.r12
    public final Feature[] s() {
        Feature[] featureArr = yyk0.c;
        featureArr.getClass();
        return featureArr;
    }

    @Override // defpackage.r12
    public final String w() {
        return "com.google.android.gms.recaptchabase.internal.IRecaptchaBaseService";
    }

    @Override // defpackage.r12
    public final String x() {
        return "com.google.android.gms.recaptchabase.service.START";
    }

    @Override // defpackage.r12
    public final boolean y() {
        return true;
    }
}
