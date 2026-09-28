package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.accounttransfer.zzs;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class osl0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iV = tr60.v(parcel);
        ArrayList<String> arrayListH = null;
        ArrayList<String> arrayListH2 = null;
        ArrayList<String> arrayListH3 = null;
        ArrayList<String> arrayListH4 = null;
        ArrayList<String> arrayListH5 = null;
        int iP = 0;
        while (parcel.dataPosition() < iV) {
            int i = parcel.readInt();
            switch ((char) i) {
                case 1:
                    iP = tr60.p(parcel, i);
                    break;
                case 2:
                    arrayListH = tr60.h(parcel, i);
                    break;
                case 3:
                    arrayListH2 = tr60.h(parcel, i);
                    break;
                case 4:
                    arrayListH3 = tr60.h(parcel, i);
                    break;
                case 5:
                    arrayListH4 = tr60.h(parcel, i);
                    break;
                case 6:
                    arrayListH5 = tr60.h(parcel, i);
                    break;
                default:
                    tr60.u(parcel, i);
                    break;
            }
        }
        tr60.k(parcel, iV);
        return new zzs(iP, arrayListH, arrayListH2, arrayListH3, arrayListH4, arrayListH5);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzs[i];
    }
}
