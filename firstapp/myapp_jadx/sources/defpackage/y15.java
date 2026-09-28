package defpackage;

import com.appsflyer.internal.p;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001R \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0004\u0010\u0006¨\u0006\b"}, d2 = {"Ly15;", "", "", "Lcv0;", "a", "Ljava/util/List;", "()Ljava/util/List;", "appliedList", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class y15 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @SerializedName("appliedList")
    private final List<cv0> appliedList;

    public final List<cv0> a() {
        return this.appliedList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y15) && Intrinsics.g(this.appliedList, ((y15) obj).appliedList);
    }

    public final int hashCode() {
        return this.appliedList.hashCode();
    }

    public final String toString() {
        return p.a("BoostEffectiveScopeResponse(appliedList=", ")", this.appliedList);
    }
}
