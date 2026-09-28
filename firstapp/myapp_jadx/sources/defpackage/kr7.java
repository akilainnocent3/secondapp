package defpackage;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\r\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0010\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0004\u001a\u0004\b\u000f\u0010\u0006R\u001a\u0010\u0013\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\n\u001a\u0004\b\u0012\u0010\fR\u001a\u0010\u0016\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\n\u001a\u0004\b\u0015\u0010\f¨\u0006\u0017"}, d2 = {"Lkr7;", "", "", "a", "J", "getSessionId", "()J", "sessionId", "", "b", "I", "getRowNumber", "()I", "rowNumber", "c", "getClick", "click", "d", "getEdgeOffset", "edgeOffset", "e", "getStackerColumns", "stackerColumns", "game-stacker_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class kr7 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @SerializedName("sessionId")
    private final long sessionId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @SerializedName("rowNumber")
    private final int rowNumber;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @SerializedName("click")
    private final long click;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @SerializedName("edgeOffset")
    private final int edgeOffset;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @SerializedName("stackerColumns")
    private final int stackerColumns;

    public kr7(int i, int i2, int i3, long j, long j2) {
        this.sessionId = j;
        this.rowNumber = i;
        this.click = j2;
        this.edgeOffset = i2;
        this.stackerColumns = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kr7)) {
            return false;
        }
        kr7 kr7Var = (kr7) obj;
        return this.sessionId == kr7Var.sessionId && this.rowNumber == kr7Var.rowNumber && this.click == kr7Var.click && this.edgeOffset == kr7Var.edgeOffset && this.stackerColumns == kr7Var.stackerColumns;
    }

    public final int hashCode() {
        return Integer.hashCode(this.stackerColumns) + gpp.a(this.edgeOffset, f87.a(gpp.a(this.rowNumber, Long.hashCode(this.sessionId) * 31, 31), this.click, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClickEvent(sessionId=");
        sb.append(this.sessionId);
        sb.append(", rowNumber=");
        sb.append(this.rowNumber);
        sb.append(", click=");
        sb.append(this.click);
        sb.append(", edgeOffset=");
        sb.append(this.edgeOffset);
        sb.append(", stackerColumns=");
        return rr1.b(sb, this.stackerColumns, ')');
    }
}
