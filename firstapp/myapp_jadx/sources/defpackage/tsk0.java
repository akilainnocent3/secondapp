package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.text.TextUtils;
import com.sporty.android.core.model.pocket.withdraw.partner.RX.oAudzpbdOhCI;

/* JADX INFO: loaded from: classes4.dex */
public final class tsk0 extends x3l {
    public final Bundle B;

    public tsk0(Context context, Looper looper, hs7 hs7Var, t41 t41Var, kgk0 kgk0Var, kgk0 kgk0Var2) {
        super(context, looper, 16, hs7Var, kgk0Var, kgk0Var2);
        if (t41Var != null) {
            throw null;
        }
        this.B = new Bundle();
    }

    @Override // defpackage.r12
    public final boolean A() {
        return true;
    }

    @Override // defpackage.r12, sl0.f
    public final boolean f() {
        hs7 hs7Var = this.y;
        Account account = hs7Var.a;
        if (TextUtils.isEmpty(account != null ? account.name : null)) {
            return false;
        }
        if (((xfk0) hs7Var.d.get(s41.a)) == null) {
            return !hs7Var.b.isEmpty();
        }
        throw null;
    }

    @Override // defpackage.r12, sl0.f
    public final int l() {
        return 12451000;
    }

    @Override // defpackage.r12
    public final /* synthetic */ IInterface q(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.internal.IAuthService");
        return iInterfaceQueryLocalInterface instanceof etk0 ? (etk0) iInterfaceQueryLocalInterface : new etk0(iBinder);
    }

    @Override // defpackage.r12
    public final Bundle t() {
        return this.B;
    }

    @Override // defpackage.r12
    public final String x() {
        return "com.google.android.gms.auth.service.START";
    }

    @Override // defpackage.r12
    public final String w() {
        return oAudzpbdOhCI.lNxlRVSnXoOJjS;
    }
}
