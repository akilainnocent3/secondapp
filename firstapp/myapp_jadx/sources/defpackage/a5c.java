package defpackage;

import com.google.gson.annotations.SerializedName;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\r\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\n\u001a\u0004\b\u0003\u0010\fR \u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\t\u0010\u0012R \u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00140\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0011\u001a\u0004\b\u0015\u0010\u0012R\u001a\u0010\u0019\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0004\u001a\u0004\b\u0018\u0010\u0006R\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u001a8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0017\u0010\u001d¨\u0006\u001f"}, d2 = {"La5c;", "", "", "a", "J", "d", "()J", "sessionId", "", "b", "I", "c", "()I", "rowsCount", "columnsCount", "", "Lapd0;", "Ljava/util/List;", "()Ljava/util/List;", "rows", "Lhld0;", "e", "stackedRows", "f", "getExpiresAt", "expiresAt", "", "g", "Ljava/lang/Double;", "()Ljava/lang/Double;", "totalReward", "game-stacker_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class a5c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @SerializedName(AnalyticsParam.EVENT_PARAM_ID)
    private final long sessionId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @SerializedName("rowsCount")
    private final int rowsCount;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @SerializedName("columnsCount")
    private final int columnsCount;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @SerializedName("rows")
    private final List<apd0> rows;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @SerializedName("stackedRows")
    private final List<hld0> stackedRows;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @SerializedName("expiresAt")
    private final long expiresAt;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @SerializedName("totalReward")
    private final Double totalReward;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getColumnsCount() {
        return this.columnsCount;
    }

    public final List<apd0> b() {
        return this.rows;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getRowsCount() {
        return this.rowsCount;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final long getSessionId() {
        return this.sessionId;
    }

    public final List<hld0> e() {
        return this.stackedRows;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a5c)) {
            return false;
        }
        a5c a5cVar = (a5c) obj;
        return this.sessionId == a5cVar.sessionId && this.rowsCount == a5cVar.rowsCount && this.columnsCount == a5cVar.columnsCount && Intrinsics.g(this.rows, a5cVar.rows) && Intrinsics.g(this.stackedRows, a5cVar.stackedRows) && this.expiresAt == a5cVar.expiresAt && Intrinsics.g(this.totalReward, a5cVar.totalReward);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final Double getTotalReward() {
        return this.totalReward;
    }

    public final int hashCode() {
        int iA = f87.a(ai50.a(ai50.a(gpp.a(this.columnsCount, gpp.a(this.rowsCount, Long.hashCode(this.sessionId) * 31, 31), 31), 31, this.rows), 31, this.stackedRows), this.expiresAt, 31);
        Double d = this.totalReward;
        return iA + (d == null ? 0 : d.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CurrentGameConfiguration(sessionId=");
        sb.append(this.sessionId);
        sb.append(", rowsCount=");
        sb.append(this.rowsCount);
        sb.append(", columnsCount=");
        sb.append(this.columnsCount);
        sb.append(", rows=");
        sb.append(this.rows);
        sb.append(", stackedRows=");
        sb.append(this.stackedRows);
        sb.append(", expiresAt=");
        sb.append(this.expiresAt);
        sb.append(", totalReward=");
        return itu.a(sb, this.totalReward, ')');
    }
}
