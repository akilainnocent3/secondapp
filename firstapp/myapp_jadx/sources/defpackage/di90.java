package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.zat;
import com.google.android.gms.signin.internal.zai;
import com.google.android.gms.signin.internal.zak;

/* JADX INFO: loaded from: classes4.dex */
public final class di90 extends x3l<cik0> implements xhk0 {
    public final boolean B;
    public final hs7 C;
    public final Bundle D;
    public final Integer E;

    public di90(Context context, Looper looper, hs7 hs7Var, Bundle bundle, x4l.a aVar, x4l.b bVar) {
        super(context, looper, 44, hs7Var, aVar, bVar);
        this.B = true;
        this.C = hs7Var;
        this.D = bundle;
        this.E = hs7Var.h;
    }

    @Override // defpackage.r12, sl0.f
    public final boolean f() {
        return this.B;
    }

    @Override // defpackage.xhk0
    public final void g() {
        j(new r12.d());
    }

    @Override // defpackage.r12, sl0.f
    public final int l() {
        return 12451000;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.xhk0
    public final void o(ihk0 ihk0Var) {
        try {
            Account account = this.C.a;
            if (account == null) {
                account = new Account("<<default account>>", "com.google");
            }
            GoogleSignInAccount googleSignInAccountB = "<<default account>>".equals(account.name) ? k1e0.a(this.c).b() : null;
            Integer num = this.E;
            hm20.h(num);
            zat zatVar = new zat(2, account, num.intValue(), googleSignInAccountB);
            cik0 cik0Var = (cik0) v();
            zai zaiVar = new zai(1, zatVar);
            Parcel parcelObtain = Parcel.obtain();
            parcelObtain.writeInterfaceToken(cik0Var.b);
            int i = ugk0.a;
            parcelObtain.writeInt(1);
            zaiVar.writeToParcel(parcelObtain, 0);
            parcelObtain.writeStrongBinder(ihk0Var);
            Parcel parcelObtain2 = Parcel.obtain();
            try {
                cik0Var.a.transact(12, parcelObtain, parcelObtain2, 0);
                parcelObtain2.readException();
            } finally {
                parcelObtain.recycle();
                parcelObtain2.recycle();
            }
        } catch (RemoteException e) {
            Log.w("SignInClientImpl", "Remote service probably died when signIn is called");
            try {
                ihk0Var.b.post(new hhk0(ihk0Var, new zak(1, new ConnectionResult(8, null), null)));
            } catch (RemoteException unused) {
                Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e);
            }
        }
    }

    @Override // defpackage.r12
    public final IInterface q(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        return iInterfaceQueryLocalInterface instanceof cik0 ? (cik0) iInterfaceQueryLocalInterface : new cik0(iBinder, "com.google.android.gms.signin.internal.ISignInService");
    }

    @Override // defpackage.r12
    public final Bundle t() {
        hs7 hs7Var = this.C;
        boolean zEquals = this.c.getPackageName().equals(hs7Var.e);
        Bundle bundle = this.D;
        if (!zEquals) {
            bundle.putString("com.google.android.gms.signin.internal.realClientPackageName", hs7Var.e);
        }
        return bundle;
    }

    @Override // defpackage.r12
    public final String w() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    @Override // defpackage.r12
    public final String x() {
        return "com.google.android.gms.signin.service.START";
    }
}
