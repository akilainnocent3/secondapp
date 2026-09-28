package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.b;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.zav;
import com.google.android.gms.signin.internal.zak;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class hhk0 implements Runnable {
    public final /* synthetic */ zak a;
    public final /* synthetic */ ihk0 b;

    public hhk0(ihk0 ihk0Var, zak zakVar) {
        this.b = ihk0Var;
        this.a = zakVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        b cVar;
        zak zakVar = this.a;
        ConnectionResult connectionResult = zakVar.b;
        int i = connectionResult.b;
        ihk0 ihk0Var = this.b;
        if (i == 0) {
            zav zavVar = zakVar.c;
            hm20.h(zavVar);
            ConnectionResult connectionResult2 = zavVar.c;
            if (connectionResult2.b != 0) {
                Log.wtf("SignInCoordinator", "Sign-in succeeded with resolve account failure: ".concat(String.valueOf(connectionResult2)), new Exception());
                ihk0Var.k.b(connectionResult2);
                ihk0Var.f.a();
                return;
            }
            ngk0 ngk0Var = ihk0Var.k;
            IBinder iBinder = zavVar.b;
            if (iBinder == null) {
                cVar = null;
            } else {
                int i2 = b.a.a;
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                cVar = iInterfaceQueryLocalInterface instanceof b ? (b) iInterfaceQueryLocalInterface : new c(iBinder, "com.google.android.gms.common.internal.IAccountAccessor");
            }
            Set<Scope> set = ihk0Var.d;
            ngk0Var.getClass();
            if (cVar == null || set == null) {
                Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
                ngk0Var.b(new ConnectionResult(4));
            } else {
                ngk0Var.c = cVar;
                ngk0Var.d = set;
                if (ngk0Var.e) {
                    ngk0Var.a.i(cVar, set);
                }
            }
        } else {
            ihk0Var.k.b(connectionResult);
        }
        ihk0Var.f.a();
    }
}
