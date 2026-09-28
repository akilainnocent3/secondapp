package defpackage;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: loaded from: classes4.dex */
public interface eym extends IInterface {

    public static abstract class a extends hrk0 implements eym {
        public static eym b(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            return iInterfaceQueryLocalInterface instanceof eym ? (eym) iInterfaceQueryLocalInterface : new csk0(iBinder, "com.google.android.gms.dynamic.IObjectWrapper");
        }
    }
}
