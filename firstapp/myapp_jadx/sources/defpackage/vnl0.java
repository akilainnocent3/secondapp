package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.accounttransfer.zzo;
import com.google.android.gms.auth.api.accounttransfer.zzs;
import com.google.android.gms.auth.api.accounttransfer.zzu;
import java.util.ArrayList;
import java.util.HashSet;

/* JADX INFO: loaded from: classes4.dex */
public final class vnl0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iV = tr60.v(parcel);
        HashSet hashSet = new HashSet();
        int iP = 0;
        ArrayList arrayListJ = null;
        zzs zzsVar = null;
        int iP2 = 0;
        while (parcel.dataPosition() < iV) {
            int i = parcel.readInt();
            char c = (char) i;
            if (c == 1) {
                iP = tr60.p(parcel, i);
                hashSet.add(1);
            } else if (c == 2) {
                arrayListJ = tr60.j(parcel, i, zzu.CREATOR);
                hashSet.add(2);
            } else if (c == 3) {
                iP2 = tr60.p(parcel, i);
                hashSet.add(3);
            } else if (c != 4) {
                tr60.u(parcel, i);
            } else {
                zzsVar = (zzs) tr60.e(parcel, i, zzs.CREATOR);
                hashSet.add(4);
            }
        }
        if (parcel.dataPosition() == iV) {
            return new zzo(hashSet, iP, arrayListJ, iP2, zzsVar);
        }
        throw new tr60.a(hce0.a(iV, "Overread allowed size end="), parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzo[i];
    }
}
