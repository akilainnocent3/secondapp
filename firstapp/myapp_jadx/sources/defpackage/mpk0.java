package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.SleepSegmentEvent;

/* JADX INFO: loaded from: classes4.dex */
public final class mpk0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iV = tr60.v(parcel);
        int iP = 0;
        int iP2 = 0;
        int iP3 = 0;
        long jR = 0;
        long jR2 = 0;
        while (parcel.dataPosition() < iV) {
            int i = parcel.readInt();
            char c = (char) i;
            if (c == 1) {
                jR = tr60.r(parcel, i);
            } else if (c == 2) {
                jR2 = tr60.r(parcel, i);
            } else if (c == 3) {
                iP = tr60.p(parcel, i);
            } else if (c == 4) {
                iP2 = tr60.p(parcel, i);
            } else if (c != 5) {
                tr60.u(parcel, i);
            } else {
                iP3 = tr60.p(parcel, i);
            }
        }
        tr60.k(parcel, iV);
        return new SleepSegmentEvent(iP, iP2, iP3, jR, jR2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new SleepSegmentEvent[i];
    }
}
