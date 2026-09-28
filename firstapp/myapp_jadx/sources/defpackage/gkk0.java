package defpackage;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.identity.AuthorizationResult;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class gkk0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iV = tr60.v(parcel);
        String strF = null;
        String strF2 = null;
        String strF3 = null;
        ArrayList<String> arrayListH = null;
        GoogleSignInAccount googleSignInAccount = null;
        PendingIntent pendingIntent = null;
        while (parcel.dataPosition() < iV) {
            int i = parcel.readInt();
            switch ((char) i) {
                case 1:
                    strF = tr60.f(parcel, i);
                    break;
                case 2:
                    strF2 = tr60.f(parcel, i);
                    break;
                case 3:
                    strF3 = tr60.f(parcel, i);
                    break;
                case 4:
                    arrayListH = tr60.h(parcel, i);
                    break;
                case 5:
                    googleSignInAccount = (GoogleSignInAccount) tr60.e(parcel, i, GoogleSignInAccount.CREATOR);
                    break;
                case 6:
                    pendingIntent = (PendingIntent) tr60.e(parcel, i, PendingIntent.CREATOR);
                    break;
                default:
                    tr60.u(parcel, i);
                    break;
            }
        }
        tr60.k(parcel, iV);
        return new AuthorizationResult(strF, strF2, strF3, arrayListH, googleSignInAccount, pendingIntent);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new AuthorizationResult[i];
    }
}
