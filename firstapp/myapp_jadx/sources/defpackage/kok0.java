package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.fido2.api.common.zzai;

/* JADX INFO: loaded from: classes4.dex */
public final class kok0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iV = tr60.v(parcel);
        while (true) {
            byte[][] bArr = null;
            while (true) {
                if (parcel.dataPosition() >= iV) {
                    tr60.k(parcel, iV);
                    return new zzai(bArr);
                }
                int i = parcel.readInt();
                if (((char) i) != 1) {
                    tr60.u(parcel, i);
                } else {
                    int iT = tr60.t(parcel, i);
                    int iDataPosition = parcel.dataPosition();
                    if (iT == 0) {
                        break;
                    }
                    int i2 = parcel.readInt();
                    byte[][] bArr2 = new byte[i2][];
                    for (int i3 = 0; i3 < i2; i3++) {
                        bArr2[i3] = parcel.createByteArray();
                    }
                    parcel.setDataPosition(iDataPosition + iT);
                    bArr = bArr2;
                }
            }
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzai[i];
    }
}
