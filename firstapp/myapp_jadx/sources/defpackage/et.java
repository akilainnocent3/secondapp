package defpackage;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001R\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005R\u001a\u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0005R\u001a\u0010\r\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u000b\u001a\u0004\b\u0007\u0010\f¨\u0006\u000e"}, d2 = {"Let;", "", "", "a", "I", "()I", "activeCodes", "b", "c", "emptyCodes", "", "Z", "()Z", "canEditUsername", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class et {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @SerializedName("activeCodes")
    private final int activeCodes = 0;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @SerializedName("emptyCodes")
    private final int emptyCodes = 0;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @SerializedName("canEditUsername")
    private final boolean canEditUsername = true;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getActiveCodes() {
        return this.activeCodes;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getCanEditUsername() {
        return this.canEditUsername;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getEmptyCodes() {
        return this.emptyCodes;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof et)) {
            return false;
        }
        et etVar = (et) obj;
        return this.activeCodes == etVar.activeCodes && this.emptyCodes == etVar.emptyCodes && this.canEditUsername == etVar.canEditUsername;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.canEditUsername) + gpp.a(this.emptyCodes, Integer.hashCode(this.activeCodes) * 31, 31);
    }

    public final String toString() {
        int i = this.activeCodes;
        int i2 = this.emptyCodes;
        return mq0.a(dy5.a("AliasCodeState(activeCodes=", i, i2, ", emptyCodes=", ", canEditUsername="), this.canEditUsername, ")");
    }
}
