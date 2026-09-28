package defpackage;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001R\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\u0007\u0010\u0005¨\u0006\t"}, d2 = {"Lhld0;", "", "", "a", "I", "()I", "resultLeft", "b", "resultWidth", "game-stacker_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class hld0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @SerializedName("resultLeft")
    private final int resultLeft;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @SerializedName("resultWidth")
    private final int resultWidth;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getResultLeft() {
        return this.resultLeft;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getResultWidth() {
        return this.resultWidth;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hld0)) {
            return false;
        }
        hld0 hld0Var = (hld0) obj;
        return this.resultLeft == hld0Var.resultLeft && this.resultWidth == hld0Var.resultWidth;
    }

    public final int hashCode() {
        return Integer.hashCode(this.resultWidth) + (Integer.hashCode(this.resultLeft) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StackedRow(resultLeft=");
        sb.append(this.resultLeft);
        sb.append(", resultWidth=");
        return rr1.b(sb, this.resultWidth, ')');
    }
}
