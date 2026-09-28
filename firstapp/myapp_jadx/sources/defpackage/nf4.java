package defpackage;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006¨\u0006\u000b"}, d2 = {"Lnf4;", "", "", "a", "Ljava/lang/String;", "getToken", "()Ljava/lang/String;", "token", "b", "getDeviceId", "deviceId", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class nf4 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @SerializedName("token")
    private final String token;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @SerializedName("deviceId")
    private final String deviceId;

    public nf4(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.token = str;
        this.deviceId = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nf4)) {
            return false;
        }
        nf4 nf4Var = (nf4) obj;
        return Intrinsics.g(this.token, nf4Var.token) && Intrinsics.g(this.deviceId, nf4Var.deviceId);
    }

    public final int hashCode() {
        return this.deviceId.hashCode() + (this.token.hashCode() * 31);
    }

    public final String toString() {
        return tx5.a("BlockDeviceRequest(token=", this.token, ", deviceId=", this.deviceId, ")");
    }
}
