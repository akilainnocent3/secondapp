package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.u2f.api.common.ChannelIdValue;
import com.google.android.gms.fido.u2f.api.common.RegisterRequest;
import com.google.android.gms.fido.u2f.api.common.RegisterRequestParams;
import com.google.android.gms.fido.u2f.api.common.RegisteredKey;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class n5l0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iV = tr60.v(parcel);
        Integer numQ = null;
        Double dM = null;
        Uri uri = null;
        ArrayList arrayListJ = null;
        ArrayList arrayListJ2 = null;
        ChannelIdValue channelIdValue = null;
        String strF = null;
        while (parcel.dataPosition() < iV) {
            int i = parcel.readInt();
            switch ((char) i) {
                case 2:
                    numQ = tr60.q(parcel, i);
                    break;
                case 3:
                    dM = tr60.m(parcel, i);
                    break;
                case 4:
                    uri = (Uri) tr60.e(parcel, i, Uri.CREATOR);
                    break;
                case 5:
                    arrayListJ = tr60.j(parcel, i, RegisterRequest.CREATOR);
                    break;
                case 6:
                    arrayListJ2 = tr60.j(parcel, i, RegisteredKey.CREATOR);
                    break;
                case 7:
                    channelIdValue = (ChannelIdValue) tr60.e(parcel, i, ChannelIdValue.CREATOR);
                    break;
                case '\b':
                    strF = tr60.f(parcel, i);
                    break;
                default:
                    tr60.u(parcel, i);
                    break;
            }
        }
        tr60.k(parcel, iV);
        return new RegisterRequestParams(numQ, dM, uri, arrayListJ, arrayListJ2, channelIdValue, strF);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new RegisterRequestParams[i];
    }
}
