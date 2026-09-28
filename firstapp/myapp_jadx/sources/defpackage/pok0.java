package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorSelectionCriteria;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialDescriptor;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialParameters;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRpEntity;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialUserEntity;
import com.google.android.gms.fido.fido2.api.common.TokenBinding;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class pok0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iV = tr60.v(parcel);
        PublicKeyCredentialRpEntity publicKeyCredentialRpEntity = null;
        PublicKeyCredentialUserEntity publicKeyCredentialUserEntity = null;
        byte[] bArrC = null;
        ArrayList arrayListJ = null;
        Double dM = null;
        ArrayList arrayListJ2 = null;
        AuthenticatorSelectionCriteria authenticatorSelectionCriteria = null;
        Integer numQ = null;
        TokenBinding tokenBinding = null;
        String strF = null;
        AuthenticationExtensions authenticationExtensions = null;
        while (parcel.dataPosition() < iV) {
            int i = parcel.readInt();
            switch ((char) i) {
                case 2:
                    publicKeyCredentialRpEntity = (PublicKeyCredentialRpEntity) tr60.e(parcel, i, PublicKeyCredentialRpEntity.CREATOR);
                    break;
                case 3:
                    publicKeyCredentialUserEntity = (PublicKeyCredentialUserEntity) tr60.e(parcel, i, PublicKeyCredentialUserEntity.CREATOR);
                    break;
                case 4:
                    bArrC = tr60.c(parcel, i);
                    break;
                case 5:
                    arrayListJ = tr60.j(parcel, i, PublicKeyCredentialParameters.CREATOR);
                    break;
                case 6:
                    dM = tr60.m(parcel, i);
                    break;
                case 7:
                    arrayListJ2 = tr60.j(parcel, i, PublicKeyCredentialDescriptor.CREATOR);
                    break;
                case '\b':
                    authenticatorSelectionCriteria = (AuthenticatorSelectionCriteria) tr60.e(parcel, i, AuthenticatorSelectionCriteria.CREATOR);
                    break;
                case '\t':
                    numQ = tr60.q(parcel, i);
                    break;
                case '\n':
                    tokenBinding = (TokenBinding) tr60.e(parcel, i, TokenBinding.CREATOR);
                    break;
                case 11:
                    strF = tr60.f(parcel, i);
                    break;
                case '\f':
                    authenticationExtensions = (AuthenticationExtensions) tr60.e(parcel, i, AuthenticationExtensions.CREATOR);
                    break;
                default:
                    tr60.u(parcel, i);
                    break;
            }
        }
        tr60.k(parcel, iV);
        return new PublicKeyCredentialCreationOptions(publicKeyCredentialRpEntity, publicKeyCredentialUserEntity, bArrC, arrayListJ, dM, arrayListJ2, authenticatorSelectionCriteria, numQ, tokenBinding, strF, authenticationExtensions);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new PublicKeyCredentialCreationOptions[i];
    }
}
