package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.WorkSource;
import com.google.android.gms.internal.identity.ClientIdentity;
import com.google.android.gms.location.CurrentLocationRequest;

/* JADX INFO: loaded from: classes4.dex */
public final class jal0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iV = tr60.v(parcel);
        WorkSource workSource = new WorkSource();
        ClientIdentity clientIdentity = null;
        int iP = 0;
        boolean zL = false;
        int iP2 = 0;
        long jR = Long.MAX_VALUE;
        long jR2 = Long.MAX_VALUE;
        int iP3 = 102;
        while (parcel.dataPosition() < iV) {
            int i = parcel.readInt();
            switch ((char) i) {
                case 1:
                    jR = tr60.r(parcel, i);
                    break;
                case 2:
                    iP = tr60.p(parcel, i);
                    break;
                case 3:
                    iP3 = tr60.p(parcel, i);
                    break;
                case 4:
                    jR2 = tr60.r(parcel, i);
                    break;
                case 5:
                    zL = tr60.l(parcel, i);
                    break;
                case 6:
                    workSource = (WorkSource) tr60.e(parcel, i, WorkSource.CREATOR);
                    break;
                case 7:
                    iP2 = tr60.p(parcel, i);
                    break;
                case '\b':
                default:
                    tr60.u(parcel, i);
                    break;
                case '\t':
                    clientIdentity = (ClientIdentity) tr60.e(parcel, i, ClientIdentity.CREATOR);
                    break;
            }
        }
        tr60.k(parcel, iV);
        return new CurrentLocationRequest(jR, iP, iP3, jR2, zL, iP2, workSource, clientIdentity);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new CurrentLocationRequest[i];
    }
}
