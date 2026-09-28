package defpackage;

import com.google.gson.annotations.SerializedName;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001R\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\u0007\u0010\u0005¨\u0006\t"}, d2 = {"Lbjr;", "", "", "a", "Ljava/lang/String;", "()Ljava/lang/String;", AnalyticsParam.EVENT_PARAM_ID, "b", "name", "luckynumber"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class bjr {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @SerializedName(AnalyticsParam.EVENT_PARAM_ID)
    private final String id;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @SerializedName("name")
    private final String name;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getName() {
        return this.name;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bjr)) {
            return false;
        }
        bjr bjrVar = (bjr) obj;
        return Intrinsics.g(this.id, bjrVar.id) && Intrinsics.g(this.name, bjrVar.name);
    }

    public final int hashCode() {
        return this.name.hashCode() + (this.id.hashCode() * 31);
    }

    public final String toString() {
        return tx5.a("LNTournamentInfoDTO(id=", this.id, ", name=", this.name, ")");
    }
}
