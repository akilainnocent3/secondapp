package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.identity.SignInCredential;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredential;

/* JADX INFO: loaded from: classes4.dex */
public final class mlk0 implements Parcelable.Creator {
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
        String strF7 = null;
        PublicKeyCredential publicKeyCredential = null;
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
                    strF4 = tr60.f(parcel, i);
                    break;
                case 5:
                    uri = (Uri) tr60.e(parcel, i, Uri.CREATOR);
                    break;
                case 6:
                    strF5 = tr60.f(parcel, i);
                    break;
                case 7:
                    strF6 = tr60.f(parcel, i);
                    break;
                case '\b':
                    strF7 = tr60.f(parcel, i);
                    break;
                case '\t':
                    publicKeyCredential = (PublicKeyCredential) tr60.e(parcel, i, PublicKeyCredential.CREATOR);
                    break;
                default:
                    tr60.u(parcel, i);
                    break;
            }
        }
        tr60.k(parcel, iV);
        return new SignInCredential(strF, strF2, strF3, strF4, uri, strF5, strF6, strF7, publicKeyCredential);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new SignInCredential[i];
    }
}
