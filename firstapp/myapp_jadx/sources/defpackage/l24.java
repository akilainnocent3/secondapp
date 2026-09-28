package defpackage;

import androidx.window.layout.oKr.TEFcJcMqR;
import com.google.gson.annotations.SerializedName;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\b\u0081\b\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006R\u001a\u0010\u000f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000eR\u001a\u0010\u0013\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0011\u001a\u0004\b\b\u0010\u0012R\u001a\u0010\u0018\u001a\u00020\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017R\u001a\u0010\u0019\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0004\u001a\u0004\b\u0003\u0010\u0006¨\u0006\u001a"}, d2 = {"Ll24;", "", "", "a", "Ljava/lang/String;", "f", "()Ljava/lang/String;", "type", "b", "d", AnalyticsParam.EVENT_STATUS, "", "c", "J", "()J", "endTime", "", "D", "()D", "current", "", "e", "I", "()I", "target", "currency", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class l24 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @SerializedName("type")
    private final String type;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @SerializedName(AnalyticsParam.EVENT_STATUS)
    private final String status;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @SerializedName("endTime")
    private final long endTime;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @SerializedName("current")
    private final double current;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @SerializedName("target")
    private final int target;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @SerializedName("currency")
    private final String currency;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final double getCurrent() {
        return this.current;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final long getEndTime() {
        return this.endTime;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final int getTarget() {
        return this.target;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l24)) {
            return false;
        }
        l24 l24Var = (l24) obj;
        return Intrinsics.g(this.type, l24Var.type) && Intrinsics.g(this.status, l24Var.status) && this.endTime == l24Var.endTime && Double.compare(this.current, l24Var.current) == 0 && this.target == l24Var.target && Intrinsics.g(this.currency, l24Var.currency);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getType() {
        return this.type;
    }

    public final int hashCode() {
        return this.currency.hashCode() + gpp.a(this.target, nrg0.a(f87.a(gmf0.a(this.type.hashCode() * 31, 31, this.status), this.endTime, 31), 31, this.current), 31);
    }

    public final String toString() {
        String str = this.type;
        String str2 = this.status;
        long j = this.endTime;
        double d = this.current;
        int i = this.target;
        String str3 = this.currency;
        StringBuilder sbA = ux5.a(TEFcJcMqR.msUcX, str, ", status=", str2, ", endTime=");
        sbA.append(j);
        hib0.b(d, ", current=", ", target=", sbA);
        sbA.append(i);
        sbA.append(", currency=");
        sbA.append(str3);
        sbA.append(")");
        return sbA.toString();
    }
}
