package defpackage;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.identity.zzem;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class d0l0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iV = tr60.v(parcel);
        String strF = "";
        ArrayList<String> arrayListH = null;
        PendingIntent pendingIntent = null;
        while (parcel.dataPosition() < iV) {
            int i = parcel.readInt();
            char c = (char) i;
            if (c == 1) {
                arrayListH = tr60.h(parcel, i);
            } else if (c == 2) {
                pendingIntent = (PendingIntent) tr60.e(parcel, i, PendingIntent.CREATOR);
            } else if (c != 3) {
                tr60.u(parcel, i);
            } else {
                strF = tr60.f(parcel, i);
            }
        }
        tr60.k(parcel, iV);
        return new zzem(arrayListH, pendingIntent, strF);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzem[i];
    }
}
