package defpackage;

import android.os.Bundle;
import android.os.Parcel;

/* JADX INFO: loaded from: classes4.dex */
public abstract class xvk0 extends ntk0 implements zvk0 {
    @Override // defpackage.ntk0
    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        Bundle bundle = (Bundle) ptk0.a(parcel, Bundle.CREATOR);
        ptk0.d(parcel);
        ((qvk0) this).O(bundle);
        parcel2.writeNoException();
        return true;
    }
}
