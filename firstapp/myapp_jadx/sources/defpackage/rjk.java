package defpackage;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0004\u001a\u0004\b\b\u0010\u0006R \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\f\u001a\u0004\b\u0003\u0010\r¨\u0006\u000f"}, d2 = {"Lrjk;", "", "", "a", "D", "b", "()D", "totalAmount", "c", "utilisedAmount", "", "", "Ljava/util/List;", "()Ljava/util/List;", "applicableGames", "common_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class rjk {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @SerializedName("totalAmount")
    private final double totalAmount;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @SerializedName("utilisedAmount")
    private final double utilisedAmount;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @SerializedName("applicableGames")
    private final List<String> applicableGames;

    public final List<String> a() {
        return this.applicableGames;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final double getTotalAmount() {
        return this.totalAmount;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final double getUtilisedAmount() {
        return this.utilisedAmount;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rjk)) {
            return false;
        }
        rjk rjkVar = (rjk) obj;
        return Double.compare(this.totalAmount, rjkVar.totalAmount) == 0 && Double.compare(this.utilisedAmount, rjkVar.utilisedAmount) == 0 && Intrinsics.g(this.applicableGames, rjkVar.applicableGames);
    }

    public final int hashCode() {
        return this.applicableGames.hashCode() + nrg0.a(Double.hashCode(this.totalAmount) * 31, 31, this.utilisedAmount);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GiftDetails(totalAmount=");
        sb.append(this.totalAmount);
        sb.append(", utilisedAmount=");
        sb.append(this.utilisedAmount);
        sb.append(", applicableGames=");
        return o8i.a(sb, this.applicableGames, ')');
    }
}
