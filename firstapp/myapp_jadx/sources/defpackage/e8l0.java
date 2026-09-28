package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.ActivityTransitionEvent;
import com.google.android.gms.location.ActivityTransitionResult;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class e8l0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iV = tr60.v(parcel);
        ArrayList arrayListJ = null;
        Bundle bundleB = null;
        while (parcel.dataPosition() < iV) {
            int i = parcel.readInt();
            char c = (char) i;
            if (c == 1) {
                arrayListJ = tr60.j(parcel, i, ActivityTransitionEvent.CREATOR);
            } else if (c != 2) {
                tr60.u(parcel, i);
            } else {
                bundleB = tr60.b(parcel, i);
            }
        }
        tr60.k(parcel, iV);
        return new ActivityTransitionResult(arrayListJ, bundleB);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new ActivityTransitionResult[i];
    }
}
