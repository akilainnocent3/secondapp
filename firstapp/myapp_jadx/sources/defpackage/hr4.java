package defpackage;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\r\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lhr4;", "", "", "a", "I", "getCampaignTierId", "()I", "campaignTierId", "", "b", "Ljava/lang/String;", "getSelectedGame", "()Ljava/lang/String;", "selectedGame", "common_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class hr4 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @SerializedName("campaignTierId")
    private final int campaignTierId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @SerializedName("selectedGame")
    private final String selectedGame;

    public hr4(int i, String str) {
        str.getClass();
        this.campaignTierId = i;
        this.selectedGame = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hr4)) {
            return false;
        }
        hr4 hr4Var = (hr4) obj;
        return this.campaignTierId == hr4Var.campaignTierId && Intrinsics.g(this.selectedGame, hr4Var.selectedGame);
    }

    public final int hashCode() {
        return this.selectedGame.hashCode() + (Integer.hashCode(this.campaignTierId) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BonusGameSelection(campaignTierId=");
        sb.append(this.campaignTierId);
        sb.append(", selectedGame=");
        return j26.a(sb, this.selectedGame, ')');
    }
}
