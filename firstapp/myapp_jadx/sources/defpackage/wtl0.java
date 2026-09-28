package defpackage;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.accounttransfer.DeviceMetaData;
import com.google.android.gms.auth.api.accounttransfer.zzw;
import java.util.HashSet;

/* JADX INFO: loaded from: classes4.dex */
public final class wtl0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iV = tr60.v(parcel);
        HashSet hashSet = new HashSet();
        int iP = 0;
        String strF = null;
        byte[] bArrC = null;
        PendingIntent pendingIntent = null;
        DeviceMetaData deviceMetaData = null;
        int iP2 = 0;
        while (parcel.dataPosition() < iV) {
            int i = parcel.readInt();
            switch ((char) i) {
                case 1:
                    iP = tr60.p(parcel, i);
                    hashSet.add(1);
                    break;
                case 2:
                    strF = tr60.f(parcel, i);
                    hashSet.add(2);
                    break;
                case 3:
                    iP2 = tr60.p(parcel, i);
                    hashSet.add(3);
                    break;
                case 4:
                    bArrC = tr60.c(parcel, i);
                    hashSet.add(4);
                    break;
                case 5:
                    pendingIntent = (PendingIntent) tr60.e(parcel, i, PendingIntent.CREATOR);
                    hashSet.add(5);
                    break;
                case 6:
                    deviceMetaData = (DeviceMetaData) tr60.e(parcel, i, DeviceMetaData.CREATOR);
                    hashSet.add(6);
                    break;
                default:
                    tr60.u(parcel, i);
                    break;
            }
        }
        if (parcel.dataPosition() == iV) {
            return new zzw(hashSet, iP, strF, iP2, bArrC, pendingIntent, deviceMetaData);
        }
        throw new tr60.a(hce0.a(iV, "Overread allowed size end="), parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzw[i];
    }
}
