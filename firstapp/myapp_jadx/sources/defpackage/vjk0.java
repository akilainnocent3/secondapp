package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.SignInAccount;

/* JADX INFO: loaded from: classes4.dex */
public final class vjk0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iV = tr60.v(parcel);
        String strF = "";
        GoogleSignInAccount googleSignInAccount = null;
        String strF2 = "";
        while (parcel.dataPosition() < iV) {
            int i = parcel.readInt();
            char c = (char) i;
            if (c == 4) {
                strF = tr60.f(parcel, i);
            } else if (c == 7) {
                googleSignInAccount = (GoogleSignInAccount) tr60.e(parcel, i, GoogleSignInAccount.CREATOR);
            } else if (c != '\b') {
                tr60.u(parcel, i);
            } else {
                strF2 = tr60.f(parcel, i);
            }
        }
        tr60.k(parcel, iV);
        return new SignInAccount(strF, googleSignInAccount, strF2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new SignInAccount[i];
    }
}
