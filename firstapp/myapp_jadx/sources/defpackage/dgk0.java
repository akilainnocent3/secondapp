package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class dgk0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iV = tr60.v(parcel);
        String strF = null;
        String strF2 = null;
        String strF3 = null;
        String strF4 = null;
        Uri uri = null;
        String strF5 = null;
        String strF6 = null;
        ArrayList arrayListJ = null;
        String strF7 = null;
        String strF8 = null;
        long jR = 0;
        int iP = 0;
        while (parcel.dataPosition() < iV) {
            int i = parcel.readInt();
            switch ((char) i) {
                case 1:
                    iP = tr60.p(parcel, i);
                    break;
                case 2:
                    strF = tr60.f(parcel, i);
                    break;
                case 3:
                    strF2 = tr60.f(parcel, i);
                    break;
                case 4:
                    strF3 = tr60.f(parcel, i);
                    break;
                case 5:
                    strF4 = tr60.f(parcel, i);
                    break;
                case 6:
                    uri = (Uri) tr60.e(parcel, i, Uri.CREATOR);
                    break;
                case 7:
                    strF5 = tr60.f(parcel, i);
                    break;
                case '\b':
                    jR = tr60.r(parcel, i);
                    break;
                case '\t':
                    strF6 = tr60.f(parcel, i);
                    break;
                case '\n':
                    arrayListJ = tr60.j(parcel, i, Scope.CREATOR);
                    break;
                case 11:
                    strF7 = tr60.f(parcel, i);
                    break;
                case '\f':
                    strF8 = tr60.f(parcel, i);
                    break;
                default:
                    tr60.u(parcel, i);
                    break;
            }
        }
        tr60.k(parcel, iV);
        return new GoogleSignInAccount(iP, strF, strF2, strF3, strF4, uri, strF5, jR, strF6, arrayListJ, strF7, strF8);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new GoogleSignInAccount[i];
    }
}
