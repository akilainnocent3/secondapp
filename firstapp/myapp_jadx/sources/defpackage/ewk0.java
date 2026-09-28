package defpackage;

import android.os.Bundle;
import android.os.Parcel;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ewk0 extends ntk0 implements zwk0 {
    @Override // defpackage.ntk0
    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            if (i != 2) {
                return false;
            }
            int iIdentityHashCode = System.identityHashCode(((k0l0) this).a);
            parcel2.writeNoException();
            parcel2.writeInt(iIdentityHashCode);
            return true;
        }
        String string = parcel.readString();
        String string2 = parcel.readString();
        Bundle bundle = (Bundle) ptk0.a(parcel, Bundle.CREATOR);
        long j = parcel.readLong();
        ptk0.d(parcel);
        ((k0l0) this).D(j, bundle, string, string2);
        parcel2.writeNoException();
        return true;
    }
}
