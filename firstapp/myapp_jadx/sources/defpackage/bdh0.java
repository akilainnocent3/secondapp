package defpackage;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006¨\u0006\u000b"}, d2 = {"Lbdh0;", "", "", "a", "Ljava/lang/String;", "getPassword", "()Ljava/lang/String;", "password", "b", "getDeviceId", "deviceId", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class bdh0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @SerializedName("password")
    private final String password;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @SerializedName("deviceId")
    private final String deviceId;

    public bdh0(String str, String str2) {
        str2.getClass();
        this.password = str;
        this.deviceId = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bdh0)) {
            return false;
        }
        bdh0 bdh0Var = (bdh0) obj;
        return Intrinsics.g(this.password, bdh0Var.password) && Intrinsics.g(this.deviceId, bdh0Var.deviceId);
    }

    public final int hashCode() {
        return this.deviceId.hashCode() + (this.password.hashCode() * 31);
    }

    public final String toString() {
        return tx5.a("UnBlockDeviceRequest(password=", this.password, ", deviceId=", this.deviceId, ")");
    }
}
