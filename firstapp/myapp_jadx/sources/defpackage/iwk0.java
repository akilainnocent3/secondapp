package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.recaptchabase.ExecuteResult;

/* JADX INFO: loaded from: classes4.dex */
public final class iwk0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iV = tr60.v(parcel);
        String strF = null;
        while (parcel.dataPosition() < iV) {
            int i = parcel.readInt();
            if (((char) i) != 1) {
                tr60.u(parcel, i);
            } else {
                strF = tr60.f(parcel, i);
            }
        }
        tr60.k(parcel, iV);
        ExecuteResult executeResult = new ExecuteResult();
        executeResult.a = strF;
        return executeResult;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new ExecuteResult[i];
    }
}
