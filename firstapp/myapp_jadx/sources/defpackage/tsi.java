package defpackage;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\r\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\"\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Ltsi;", "", "", "a", "Ljava/lang/String;", "getToken", "()Ljava/lang/String;", "token", "", "b", "Z", "getLogoutAllDevices", "()Z", "logoutAllDevices", "", "c", "Ljava/util/List;", "getDeviceIds", "()Ljava/util/List;", "deviceIds", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class tsi {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @SerializedName("token")
    private final String token;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @SerializedName("logoutAllDevices")
    private final boolean logoutAllDevices;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @SerializedName("deviceIds")
    private final List<String> deviceIds;

    public tsi(String str) {
        str.getClass();
        this.token = str;
        this.logoutAllDevices = true;
        this.deviceIds = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tsi)) {
            return false;
        }
        tsi tsiVar = (tsi) obj;
        return Intrinsics.g(this.token, tsiVar.token) && this.logoutAllDevices == tsiVar.logoutAllDevices && Intrinsics.g(this.deviceIds, tsiVar.deviceIds);
    }

    public final int hashCode() {
        int iA = mtg0.a(this.token.hashCode() * 31, 31, this.logoutAllDevices);
        List<String> list = this.deviceIds;
        return iA + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        String str = this.token;
        boolean z = this.logoutAllDevices;
        return ng1.a(z620.a("ForceLogoutDeviceRequest(token=", str, ", logoutAllDevices=", ", deviceIds=", z), this.deviceIds, ")");
    }
}
