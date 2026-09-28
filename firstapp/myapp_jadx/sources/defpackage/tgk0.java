package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.moduleinstall.internal.ApiFeatureRequest;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class tgk0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iV = tr60.v(parcel);
        ArrayList arrayListJ = null;
        String strF = null;
        boolean zL = false;
        String strF2 = null;
        while (parcel.dataPosition() < iV) {
            int i = parcel.readInt();
            char c = (char) i;
            if (c == 1) {
                arrayListJ = tr60.j(parcel, i, Feature.CREATOR);
            } else if (c == 2) {
                zL = tr60.l(parcel, i);
            } else if (c == 3) {
                strF2 = tr60.f(parcel, i);
            } else if (c != 4) {
                tr60.u(parcel, i);
            } else {
                strF = tr60.f(parcel, i);
            }
        }
        tr60.k(parcel, iV);
        return new ApiFeatureRequest(arrayListJ, zL, strF2, strF);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new ApiFeatureRequest[i];
    }
}
