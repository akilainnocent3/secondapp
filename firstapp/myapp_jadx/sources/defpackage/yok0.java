package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.common.Transport;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialDescriptor;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class yok0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iV = tr60.v(parcel);
        String strF = null;
        byte[] bArrC = null;
        ArrayList arrayListJ = null;
        while (parcel.dataPosition() < iV) {
            int i = parcel.readInt();
            char c = (char) i;
            if (c == 2) {
                strF = tr60.f(parcel, i);
            } else if (c == 3) {
                bArrC = tr60.c(parcel, i);
            } else if (c != 4) {
                tr60.u(parcel, i);
            } else {
                arrayListJ = tr60.j(parcel, i, Transport.CREATOR);
            }
        }
        tr60.k(parcel, iV);
        return new PublicKeyCredentialDescriptor(strF, bArrC, arrayListJ);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new PublicKeyCredentialDescriptor[i];
    }
}
