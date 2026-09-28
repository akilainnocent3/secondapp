package defpackage;

import com.google.gson.annotations.SerializedName;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\f\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u000e\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\t\u001a\u0004\b\u0003\u0010\u000bR\u001a\u0010\u0010\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0004\u001a\u0004\b\u000f\u0010\u0006R \u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\r\u0010\u0015¨\u0006\u0017"}, d2 = {"Lyod0;", "", "", "a", "J", "b", "()J", AnalyticsParam.EVENT_PARAM_ID, "", "I", "d", "()I", "rowsCount", "c", "columnsCount", "getExpiresAt", "expiresAt", "", "Lapd0;", "e", "Ljava/util/List;", "()Ljava/util/List;", "rows", "game-stacker_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class yod0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @SerializedName(AnalyticsParam.EVENT_PARAM_ID)
    private final long id;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @SerializedName("rowsCount")
    private final int rowsCount;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @SerializedName("columnsCount")
    private final int columnsCount;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @SerializedName("expiresAt")
    private final long expiresAt;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @SerializedName("rows")
    private final List<apd0> rows;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getColumnsCount() {
        return this.columnsCount;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final long getId() {
        return this.id;
    }

    public final List<apd0> c() {
        return this.rows;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getRowsCount() {
        return this.rowsCount;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yod0)) {
            return false;
        }
        yod0 yod0Var = (yod0) obj;
        return this.id == yod0Var.id && this.rowsCount == yod0Var.rowsCount && this.columnsCount == yod0Var.columnsCount && this.expiresAt == yod0Var.expiresAt && Intrinsics.g(this.rows, yod0Var.rows);
    }

    public final int hashCode() {
        return this.rows.hashCode() + f87.a(gpp.a(this.columnsCount, gpp.a(this.rowsCount, Long.hashCode(this.id) * 31, 31), 31), this.expiresAt, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StackerRoundStart(id=");
        sb.append(this.id);
        sb.append(", rowsCount=");
        sb.append(this.rowsCount);
        sb.append(", columnsCount=");
        sb.append(this.columnsCount);
        sb.append(", expiresAt=");
        sb.append(this.expiresAt);
        sb.append(", rows=");
        return o8i.a(sb, this.rows, ')');
    }
}
