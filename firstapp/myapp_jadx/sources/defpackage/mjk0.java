package defpackage;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.internal.zat;

/* JADX INFO: loaded from: classes4.dex */
public final class mjk0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iV = tr60.v(parcel);
        Account account = null;
        int iP = 0;
        int iP2 = 0;
        GoogleSignInAccount googleSignInAccount = null;
        while (parcel.dataPosition() < iV) {
            int i = parcel.readInt();
            char c = (char) i;
            if (c == 1) {
                iP = tr60.p(parcel, i);
            } else if (c == 2) {
                account = (Account) tr60.e(parcel, i, Account.CREATOR);
            } else if (c == 3) {
                iP2 = tr60.p(parcel, i);
            } else if (c != 4) {
                tr60.u(parcel, i);
            } else {
                googleSignInAccount = (GoogleSignInAccount) tr60.e(parcel, i, GoogleSignInAccount.CREATOR);
            }
        }
        tr60.k(parcel, iV);
        return new zat(iP, account, iP2, googleSignInAccount);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zat[i];
    }
}
