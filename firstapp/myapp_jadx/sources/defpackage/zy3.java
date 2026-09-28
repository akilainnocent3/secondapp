package defpackage;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001R\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005R \u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000b¨\u0006\r"}, d2 = {"Lzy3;", "", "", "a", "I", "()I", "pickAmount", "", "Lzw3;", "b", "Ljava/util/List;", "()Ljava/util/List;", "themes", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class zy3 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @SerializedName("pickAmount")
    private final int pickAmount;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @SerializedName("themes")
    private final List<zw3> themes;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getPickAmount() {
        return this.pickAmount;
    }

    public final List<zw3> b() {
        return this.themes;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zy3)) {
            return false;
        }
        zy3 zy3Var = (zy3) obj;
        return this.pickAmount == zy3Var.pickAmount && Intrinsics.g(this.themes, zy3Var.themes);
    }

    public final int hashCode() {
        return this.themes.hashCode() + (Integer.hashCode(this.pickAmount) * 31);
    }

    public final String toString() {
        return "BetslipThemesResponse(pickAmount=" + this.pickAmount + ", themes=" + this.themes + ")";
    }
}
