package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.accounttransfer.zzu;
import com.google.android.gms.auth.api.accounttransfer.zzw;
import java.util.HashSet;

/* JADX INFO: loaded from: classes4.dex */
public final class gtl0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iV = tr60.v(parcel);
        HashSet hashSet = new HashSet();
        int iP = 0;
        zzw zzwVar = null;
        String strF = null;
        String strF2 = null;
        String strF3 = null;
        while (parcel.dataPosition() < iV) {
            int i = parcel.readInt();
            char c = (char) i;
            if (c == 1) {
                iP = tr60.p(parcel, i);
                hashSet.add(1);
            } else if (c == 2) {
                zzwVar = (zzw) tr60.e(parcel, i, zzw.CREATOR);
                hashSet.add(2);
            } else if (c == 3) {
                strF = tr60.f(parcel, i);
                hashSet.add(3);
            } else if (c == 4) {
                strF2 = tr60.f(parcel, i);
                hashSet.add(4);
            } else if (c != 5) {
                tr60.u(parcel, i);
            } else {
                strF3 = tr60.f(parcel, i);
                hashSet.add(5);
            }
        }
        if (parcel.dataPosition() == iV) {
            return new zzu(hashSet, iP, zzwVar, strF, strF2, strF3);
        }
        throw new tr60.a(hce0.a(iV, "Overread allowed size end="), parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzu[i];
    }
}
