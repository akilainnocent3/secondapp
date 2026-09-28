package defpackage;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001R\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005¨\u0006\u0007"}, d2 = {"Lsxb;", "", "", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "otpToken", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class sxb {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @SerializedName("token")
    private final String otpToken;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getOtpToken() {
        return this.otpToken;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sxb) && Intrinsics.g(this.otpToken, ((sxb) obj).otpToken);
    }

    public final int hashCode() {
        return this.otpToken.hashCode();
    }

    public final String toString() {
        return tug.a("CreateDeviceLogoutOtpSessionResponse(otpToken=", this.otpToken, ")");
    }
}
