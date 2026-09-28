package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.identity.zzek;

/* JADX INFO: loaded from: classes4.dex */
public final class b0l0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iV = tr60.v(parcel);
        int iP = -1;
        int iP2 = 0;
        short s = 0;
        int iP3 = 0;
        long jR = 0;
        float fN = 0.0f;
        double d = 0.0d;
        double d2 = 0.0d;
        String strF = null;
        while (parcel.dataPosition() < iV) {
            int i = parcel.readInt();
            switch ((char) i) {
                case 1:
                    strF = tr60.f(parcel, i);
                    break;
                case 2:
                    jR = tr60.r(parcel, i);
                    break;
                case 3:
                    tr60.x(parcel, i, 4);
                    s = (short) parcel.readInt();
                    break;
                case 4:
                    tr60.x(parcel, i, 8);
                    d = parcel.readDouble();
                    break;
                case 5:
                    tr60.x(parcel, i, 8);
                    d2 = parcel.readDouble();
                    break;
                case 6:
                    fN = tr60.n(parcel, i);
                    break;
                case 7:
                    iP2 = tr60.p(parcel, i);
                    break;
                case '\b':
                    iP3 = tr60.p(parcel, i);
                    break;
                case '\t':
                    iP = tr60.p(parcel, i);
                    break;
                default:
                    tr60.u(parcel, i);
                    break;
            }
        }
        tr60.k(parcel, iV);
        return new zzek(strF, iP2, s, d, d2, fN, jR, iP3, iP);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzek[i];
    }
}
