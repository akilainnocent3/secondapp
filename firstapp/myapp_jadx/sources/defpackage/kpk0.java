package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialDescriptor;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRequestOptions;
import com.google.android.gms.fido.fido2.api.common.TokenBinding;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class kpk0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iV = tr60.v(parcel);
        byte[] bArrC = null;
        Double dM = null;
        String strF = null;
        ArrayList arrayListJ = null;
        Integer numQ = null;
        TokenBinding tokenBinding = null;
        String strF2 = null;
        AuthenticationExtensions authenticationExtensions = null;
        Long lS = null;
        while (parcel.dataPosition() < iV) {
            int i = parcel.readInt();
            switch ((char) i) {
                case 2:
                    bArrC = tr60.c(parcel, i);
                    break;
                case 3:
                    dM = tr60.m(parcel, i);
                    break;
                case 4:
                    strF = tr60.f(parcel, i);
                    break;
                case 5:
                    arrayListJ = tr60.j(parcel, i, PublicKeyCredentialDescriptor.CREATOR);
                    break;
                case 6:
                    numQ = tr60.q(parcel, i);
                    break;
                case 7:
                    tokenBinding = (TokenBinding) tr60.e(parcel, i, TokenBinding.CREATOR);
                    break;
                case '\b':
                    strF2 = tr60.f(parcel, i);
                    break;
                case '\t':
                    authenticationExtensions = (AuthenticationExtensions) tr60.e(parcel, i, AuthenticationExtensions.CREATOR);
                    break;
                case '\n':
                    lS = tr60.s(parcel, i);
                    break;
                default:
                    tr60.u(parcel, i);
                    break;
            }
        }
        tr60.k(parcel, iV);
        return new PublicKeyCredentialRequestOptions(bArrC, dM, strF, arrayListJ, numQ, tokenBinding, strF2, authenticationExtensions, lS);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new PublicKeyCredentialRequestOptions[i];
    }
}
