package defpackage;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001R\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\u0007\u0010\u0005¨\u0006\t"}, d2 = {"Lub90;", "", "", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "countryCode", "b", "link", "injection"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class ub90 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @SerializedName("country_code")
    private final String countryCode = "";

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @SerializedName("link")
    private final String link = "";

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getCountryCode() {
        return this.countryCode;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getLink() {
        return this.link;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ub90)) {
            return false;
        }
        ub90 ub90Var = (ub90) obj;
        return Intrinsics.g(this.countryCode, ub90Var.countryCode) && Intrinsics.g(this.link, ub90Var.link);
    }

    public final int hashCode() {
        return this.link.hashCode() + (this.countryCode.hashCode() * 31);
    }

    public final String toString() {
        return tx5.a("ShutDownCountry(countryCode=", this.countryCode, ", link=", this.link, ")");
    }
}
