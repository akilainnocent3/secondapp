package defpackage;

import com.google.gson.annotations.SerializedName;
import com.sporty.android.core.model.loyalty.MissionV2Data;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0005\u001a\u0004\b\n\u0010\u0007R \u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0005\u001a\u0004\b\u0004\u0010\u0007R\"\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0005\u001a\u0004\b\u000f\u0010\u0007¨\u0006\u0011"}, d2 = {"Lxxt;", "", "", "Lj230;", "a", "Ljava/util/List;", "c", "()Ljava/util/List;", "rewards", "Lcom/sporty/android/core/model/loyalty/MissionV2Data;", "b", "missions", "Lzrt;", "challenges", "Lzw3;", "d", "themes", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class xxt {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @SerializedName("rewards")
    private final List<j230> rewards;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @SerializedName("missions")
    private final List<MissionV2Data> missions;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @SerializedName("challenges")
    private final List<zrt> challenges;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @SerializedName("themes")
    private final List<zw3> themes;

    public final List<zrt> a() {
        return this.challenges;
    }

    public final List<MissionV2Data> b() {
        return this.missions;
    }

    public final List<j230> c() {
        return this.rewards;
    }

    public final List<zw3> d() {
        return this.themes;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xxt)) {
            return false;
        }
        xxt xxtVar = (xxt) obj;
        return Intrinsics.g(this.rewards, xxtVar.rewards) && Intrinsics.g(this.missions, xxtVar.missions) && Intrinsics.g(this.challenges, xxtVar.challenges) && Intrinsics.g(this.themes, xxtVar.themes);
    }

    public final int hashCode() {
        int iA = ai50.a(ai50.a(this.rewards.hashCode() * 31, 31, this.missions), 31, this.challenges);
        List<zw3> list = this.themes;
        return iA + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        List<j230> list = this.rewards;
        List<MissionV2Data> list2 = this.missions;
        return v9d.a(", themes=", ")", hfb0.a("LoyaltyPublicOverviewV2Response(rewards=", ", missions=", ", challenges=", list, list2), this.challenges, this.themes);
    }
}
