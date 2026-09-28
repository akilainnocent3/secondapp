package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;

/* JADX INFO: loaded from: classes4.dex */
public final class f1l0 extends kmk0 {
    public final IBinder g;
    public final /* synthetic */ r12 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1l0(r12 r12Var, int i, IBinder iBinder, Bundle bundle) {
        super(r12Var, i, bundle);
        this.h = r12Var;
        this.g = iBinder;
    }

    @Override // defpackage.kmk0
    public final void c(ConnectionResult connectionResult) {
        r12.b bVar = this.h.p;
        if (bVar != null) {
            bVar.d(connectionResult);
        }
        System.currentTimeMillis();
    }

    @Override // defpackage.kmk0
    public final boolean d() {
        IBinder iBinder = this.g;
        try {
            hm20.h(iBinder);
            String interfaceDescriptor = iBinder.getInterfaceDescriptor();
            r12 r12Var = this.h;
            if (!r12Var.w().equals(interfaceDescriptor)) {
                Log.w("GmsClient", "service descriptor mismatch: " + r12Var.w() + " vs. " + interfaceDescriptor);
                return false;
            }
            IInterface iInterfaceQ = r12Var.q(iBinder);
            if (iInterfaceQ == null || !(r12.B(r12Var, 2, 4, iInterfaceQ) || r12.B(r12Var, 3, 4, iInterfaceQ))) {
                return false;
            }
            r12Var.t = null;
            r12.a aVar = r12Var.o;
            if (aVar == null) {
                return true;
            }
            aVar.a();
            return true;
        } catch (RemoteException unused) {
            Log.w("GmsClient", "service probably died");
            return false;
        }
    }
}
