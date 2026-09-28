package defpackage;

import com.appsflyer.internal.m;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006R\u001a\u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0004\u001a\u0004\b\f\u0010\u0006¨\u0006\u000e"}, d2 = {"Lwzh0;", "", "", "a", "Ljava/lang/String;", "getOtpCode", "()Ljava/lang/String;", "otpCode", "b", "getOtpToken", "otpToken", "c", "getToken", "token", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class wzh0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @SerializedName("otpCode")
    private final String otpCode;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @SerializedName("otpToken")
    private final String otpToken;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @SerializedName("token")
    private final String token;

    public wzh0(String str, String str2, String str3) {
        m.a(str, str2, str3);
        this.otpCode = str;
        this.otpToken = str2;
        this.token = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wzh0)) {
            return false;
        }
        wzh0 wzh0Var = (wzh0) obj;
        return Intrinsics.g(this.otpCode, wzh0Var.otpCode) && Intrinsics.g(this.otpToken, wzh0Var.otpToken) && Intrinsics.g(this.token, wzh0Var.token);
    }

    public final int hashCode() {
        return this.token.hashCode() + gmf0.a(this.otpCode.hashCode() * 31, 31, this.otpToken);
    }

    public final String toString() {
        String str = this.otpCode;
        String str2 = this.otpToken;
        return uf80.a(ux5.a("VerifyDeviceLogoutOtpRequest(otpCode=", str, ", otpToken=", str2, ", token="), this.token, ")");
    }
}
