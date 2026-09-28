package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.recaptchabase.InitResult;

/* JADX INFO: loaded from: classes4.dex */
public final class k3l0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iV = tr60.v(parcel);
        while (parcel.dataPosition() < iV) {
            tr60.u(parcel, parcel.readInt());
        }
        tr60.k(parcel, iV);
        return new InitResult();
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new InitResult[i];
    }
}
