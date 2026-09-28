package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.u2f.api.common.ErrorCode;

/* JADX INFO: loaded from: classes4.dex */
public final class evk0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int i = parcel.readInt();
        for (ErrorCode errorCode : ErrorCode.values()) {
            if (i == errorCode.a) {
                return errorCode;
            }
        }
        return ErrorCode.OTHER_ERROR;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new ErrorCode[i];
    }
}
