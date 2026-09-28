package defpackage;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001R\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005R\u001a\u0010\f\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0004\u001a\u0004\b\b\u0010\u0005¨\u0006\u000e"}, d2 = {"Lb4g;", "", "", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "countryCode", "", "b", "Z", "c", "()Z", "isEnabled", "enabledFromVersion", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class b4g {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @SerializedName("country_code")
    private final String countryCode;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @SerializedName("is_enabled")
    private final boolean isEnabled;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @SerializedName("enabled_from_version")
    private final String enabledFromVersion;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getCountryCode() {
        return this.countryCode;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getEnabledFromVersion() {
        return this.enabledFromVersion;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getIsEnabled() {
        return this.isEnabled;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b4g)) {
            return false;
        }
        b4g b4gVar = (b4g) obj;
        return Intrinsics.g(this.countryCode, b4gVar.countryCode) && this.isEnabled == b4gVar.isEnabled && Intrinsics.g(this.enabledFromVersion, b4gVar.enabledFromVersion);
    }

    public final int hashCode() {
        int iA = mtg0.a(this.countryCode.hashCode() * 31, 31, this.isEnabled);
        String str = this.enabledFromVersion;
        return iA + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        String str = this.countryCode;
        boolean z = this.isEnabled;
        return uf80.a(z620.a("EnabledCountry(countryCode=", str, ", isEnabled=", ", enabledFromVersion=", z), this.enabledFromVersion, ")");
    }
}
