package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.util.Log;
import com.google.android.gms.common.internal.ConnectionTelemetryConfiguration;
import com.google.android.gms.common.internal.RootTelemetryConfiguration;
import com.google.android.gms.common.internal.zzk;

/* JADX INFO: loaded from: classes4.dex */
public abstract class bnk0 extends hrk0 {
    @Override // defpackage.hrk0
    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            int i2 = parcel.readInt();
            IBinder strongBinder = parcel.readStrongBinder();
            Bundle bundle = (Bundle) kuk0.a(parcel, Bundle.CREATOR);
            kuk0.b(parcel);
            rwk0 rwk0Var = (rwk0) this;
            hm20.i(rwk0Var.a, "onPostInitComplete can be called only once per call to getRemoteService");
            r12 r12Var = rwk0Var.a;
            int i3 = rwk0Var.b;
            r12Var.getClass();
            f1l0 f1l0Var = new f1l0(r12Var, i2, strongBinder, bundle);
            ask0 ask0Var = r12Var.f;
            ask0Var.sendMessage(ask0Var.obtainMessage(1, i3, -1, f1l0Var));
            rwk0Var.a = null;
        } else if (i == 2) {
            parcel.readInt();
            kuk0.b(parcel);
            Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
        } else {
            if (i != 3) {
                return false;
            }
            int i4 = parcel.readInt();
            IBinder strongBinder2 = parcel.readStrongBinder();
            zzk zzkVar = (zzk) kuk0.a(parcel, zzk.CREATOR);
            kuk0.b(parcel);
            rwk0 rwk0Var2 = (rwk0) this;
            r12 r12Var2 = rwk0Var2.a;
            hm20.i(r12Var2, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
            hm20.h(zzkVar);
            r12Var2.v = zzkVar;
            if (r12Var2.A()) {
                ConnectionTelemetryConfiguration connectionTelemetryConfiguration = zzkVar.d;
                gw50 gw50VarA = gw50.a();
                RootTelemetryConfiguration rootTelemetryConfiguration = connectionTelemetryConfiguration == null ? null : connectionTelemetryConfiguration.a;
                synchronized (gw50VarA) {
                    try {
                        if (rootTelemetryConfiguration == null) {
                            rootTelemetryConfiguration = gw50.c;
                        } else {
                            RootTelemetryConfiguration rootTelemetryConfiguration2 = gw50VarA.a;
                            if (rootTelemetryConfiguration2 == null || rootTelemetryConfiguration2.a < rootTelemetryConfiguration.a) {
                            }
                        }
                        gw50VarA.a = rootTelemetryConfiguration;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            Bundle bundle2 = zzkVar.a;
            hm20.i(rwk0Var2.a, "onPostInitComplete can be called only once per call to getRemoteService");
            r12 r12Var3 = rwk0Var2.a;
            int i5 = rwk0Var2.b;
            r12Var3.getClass();
            f1l0 f1l0Var2 = new f1l0(r12Var3, i4, strongBinder2, bundle2);
            ask0 ask0Var2 = r12Var3.f;
            ask0Var2.sendMessage(ask0Var2.obtainMessage(1, i5, -1, f1l0Var2));
            rwk0Var2.a = null;
        }
        parcel2.writeNoException();
        return true;
    }
}
