package defpackage;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001R\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\u0007\u0010\u0005R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0004\u001a\u0004\b\t\u0010\u0005¨\u0006\u000b"}, d2 = {"Lkw3;", "", "", "a", "Z", "()Z", "newThemeAvailable", "b", "newThemeMissionAvailable", "c", "themeMissionOngoing", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class kw3 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @SerializedName("newThemeAvailable")
    private final boolean newThemeAvailable;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @SerializedName("newThemeMissionAvailable")
    private final boolean newThemeMissionAvailable;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @SerializedName("themeMissionOngoing")
    private final boolean themeMissionOngoing;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getNewThemeAvailable() {
        return this.newThemeAvailable;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getNewThemeMissionAvailable() {
        return this.newThemeMissionAvailable;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getThemeMissionOngoing() {
        return this.themeMissionOngoing;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kw3)) {
            return false;
        }
        kw3 kw3Var = (kw3) obj;
        return this.newThemeAvailable == kw3Var.newThemeAvailable && this.newThemeMissionAvailable == kw3Var.newThemeMissionAvailable && this.themeMissionOngoing == kw3Var.themeMissionOngoing;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.themeMissionOngoing) + mtg0.a(Boolean.hashCode(this.newThemeAvailable) * 31, 31, this.newThemeMissionAvailable);
    }

    public final String toString() {
        boolean z = this.newThemeAvailable;
        boolean z2 = this.newThemeMissionAvailable;
        return mq0.a(cwz.a("BetslipThemeAvailabilityResponse(newThemeAvailable=", ", newThemeMissionAvailable=", ", themeMissionOngoing=", z, z2), this.themeMissionOngoing, ")");
    }
}
