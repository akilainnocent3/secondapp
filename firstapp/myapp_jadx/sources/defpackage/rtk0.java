package defpackage;

import android.os.Bundle;
import android.os.Parcel;

/* JADX INFO: loaded from: classes4.dex */
public final class rtk0 extends mtk0 implements vtk0 {
    @Override // defpackage.vtk0
    public final Bundle F(Bundle bundle) {
        Parcel parcelB = b();
        ptk0.b(parcelB, bundle);
        Parcel parcelA = a(parcelB, 1);
        Bundle bundle2 = (Bundle) ptk0.a(parcelA, Bundle.CREATOR);
        parcelA.recycle();
        return bundle2;
    }
}
