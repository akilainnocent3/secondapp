package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.SleepClassifyEvent;

/* JADX INFO: loaded from: classes4.dex */
public final class jpk0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iV = tr60.v(parcel);
        int iP = 0;
        int iP2 = 0;
        int iP3 = 0;
        int iP4 = 0;
        int iP5 = 0;
        int iP6 = 0;
        int iP7 = 0;
        boolean zL = false;
        int iP8 = 0;
        while (parcel.dataPosition() < iV) {
            int i = parcel.readInt();
            switch ((char) i) {
                case 1:
                    iP = tr60.p(parcel, i);
                    break;
                case 2:
                    iP2 = tr60.p(parcel, i);
                    break;
                case 3:
                    iP3 = tr60.p(parcel, i);
                    break;
                case 4:
                    iP4 = tr60.p(parcel, i);
                    break;
                case 5:
                    iP5 = tr60.p(parcel, i);
                    break;
                case 6:
                    iP6 = tr60.p(parcel, i);
                    break;
                case 7:
                    iP7 = tr60.p(parcel, i);
                    break;
                case '\b':
                    zL = tr60.l(parcel, i);
                    break;
                case '\t':
                    iP8 = tr60.p(parcel, i);
                    break;
                default:
                    tr60.u(parcel, i);
                    break;
            }
        }
        tr60.k(parcel, iV);
        return new SleepClassifyEvent(iP, iP2, iP3, iP4, iP5, iP6, iP7, zL, iP8);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new SleepClassifyEvent[i];
    }
}
