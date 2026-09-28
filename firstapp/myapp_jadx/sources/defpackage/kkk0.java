package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.util.Base64;

/* JADX INFO: loaded from: classes4.dex */
public final class kkk0 extends x3l {
    public final lkk0 B;

    public kkk0(Context context, Looper looper, hs7 hs7Var, lkk0 lkk0Var, kgk0 kgk0Var, kgk0 kgk0Var2) {
        super(context, looper, 68, hs7Var, kgk0Var, kgk0Var2);
        lkk0Var = lkk0Var == null ? lkk0.c : lkk0Var;
        jkk0 jkk0Var = new jkk0();
        jkk0Var.a = Boolean.FALSE;
        jkk0Var.a = Boolean.valueOf(lkk0Var.a);
        jkk0Var.b = lkk0Var.b;
        byte[] bArr = new byte[16];
        tjk0.a.nextBytes(bArr);
        jkk0Var.b = Base64.encodeToString(bArr, 11);
        this.B = new lkk0(jkk0Var);
    }

    @Override // defpackage.r12, sl0.f
    public final int l() {
        return 12800000;
    }

    @Override // defpackage.r12
    public final IInterface q(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
        return iInterfaceQueryLocalInterface instanceof mkk0 ? (mkk0) iInterfaceQueryLocalInterface : new mkk0(iBinder, "com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
    }

    @Override // defpackage.r12
    public final Bundle t() {
        lkk0 lkk0Var = this.B;
        lkk0Var.getClass();
        Bundle bundle = new Bundle();
        bundle.putString("consumer_package", null);
        bundle.putBoolean("force_save_dialog", lkk0Var.a);
        bundle.putString("log_session_id", lkk0Var.b);
        return bundle;
    }

    @Override // defpackage.r12
    public final String w() {
        return "com.google.android.gms.auth.api.credentials.internal.ICredentialsService";
    }

    @Override // defpackage.r12
    public final String x() {
        return "com.google.android.gms.auth.api.credentials.service.START";
    }
}
