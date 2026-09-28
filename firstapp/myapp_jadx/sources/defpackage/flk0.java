package defpackage;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenRequest;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class flk0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iV = tr60.v(parcel);
        int iP = 0;
        PendingIntent pendingIntent = null;
        String strF = null;
        String strF2 = null;
        ArrayList<String> arrayListH = null;
        String strF3 = null;
        while (parcel.dataPosition() < iV) {
            int i = parcel.readInt();
            switch ((char) i) {
                case 1:
                    pendingIntent = (PendingIntent) tr60.e(parcel, i, PendingIntent.CREATOR);
                    break;
                case 2:
                    strF = tr60.f(parcel, i);
                    break;
                case 3:
                    strF2 = tr60.f(parcel, i);
                    break;
                case 4:
                    arrayListH = tr60.h(parcel, i);
                    break;
                case 5:
                    strF3 = tr60.f(parcel, i);
                    break;
                case 6:
                    iP = tr60.p(parcel, i);
                    break;
                default:
                    tr60.u(parcel, i);
                    break;
            }
        }
        tr60.k(parcel, iV);
        return new SaveAccountLinkingTokenRequest(pendingIntent, strF, strF2, arrayListH, strF3, iP);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new SaveAccountLinkingTokenRequest[i];
    }
}
