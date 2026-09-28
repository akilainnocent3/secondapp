package defpackage;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import okhttp3.internal.http.HttpStatusCodesKt;

/* JADX INFO: loaded from: classes4.dex */
public abstract class blk0 extends xjk0 implements clk0 {
    public blk0() {
        super("com.google.android.gms.auth.api.signin.internal.ISignInCallbacks");
    }

    @Override // defpackage.xjk0
    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case HttpStatusCodesKt.HTTP_SWITCHING_PROTOCOLS /* 101 */:
                ikk0.b(parcel);
                bl0.a();
                return false;
            case HttpStatusCodesKt.HTTP_PROCESSING /* 102 */:
                Status status = (Status) ikk0.a(parcel, Status.CREATOR);
                ikk0.b(parcel);
                K(status);
                break;
            case HttpStatusCodesKt.HTTP_EARLY_HINTS /* 103 */:
                Status status2 = (Status) ikk0.a(parcel, Status.CREATOR);
                ikk0.b(parcel);
                P(status2);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
