package defpackage;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.identity.zzeg;
import com.google.android.gms.internal.identity.zzei;

/* JADX INFO: loaded from: classes4.dex */
public final class a0l0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iV = tr60.v(parcel);
        zzeg zzegVar = null;
        IBinder iBinderO = null;
        IBinder iBinderO2 = null;
        PendingIntent pendingIntent = null;
        IBinder iBinderO3 = null;
        String strF = null;
        int iP = 1;
        while (parcel.dataPosition() < iV) {
            int i = parcel.readInt();
            switch ((char) i) {
                case 1:
                    iP = tr60.p(parcel, i);
                    break;
                case 2:
                    zzegVar = (zzeg) tr60.e(parcel, i, zzeg.CREATOR);
                    break;
                case 3:
                    iBinderO = tr60.o(parcel, i);
                    break;
                case 4:
                    pendingIntent = (PendingIntent) tr60.e(parcel, i, PendingIntent.CREATOR);
                    break;
                case 5:
                    iBinderO2 = tr60.o(parcel, i);
                    break;
                case 6:
                    iBinderO3 = tr60.o(parcel, i);
                    break;
                case 7:
                default:
                    tr60.u(parcel, i);
                    break;
                case '\b':
                    strF = tr60.f(parcel, i);
                    break;
            }
        }
        tr60.k(parcel, iV);
        return new zzei(iP, zzegVar, iBinderO, iBinderO2, pendingIntent, iBinderO3, strF);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzei[i];
    }
}
