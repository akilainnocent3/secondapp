package defpackage;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001R\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\u0007\u0010\u0005R \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r¨\u0006\u000f"}, d2 = {"Lnkr;", "", "", "a", "Z", "()Z", "pushEnable", "b", "showOffEnable", "", "Lbjr;", "c", "Ljava/util/List;", "()Ljava/util/List;", "tournamentInfos", "luckynumber"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class nkr {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @SerializedName("pushEnable")
    private final boolean pushEnable;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @SerializedName("showOffEnable")
    private final boolean showOffEnable;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @SerializedName("tournamentInfos")
    private final List<bjr> tournamentInfos;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getPushEnable() {
        return this.pushEnable;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getShowOffEnable() {
        return this.showOffEnable;
    }

    public final List<bjr> c() {
        return this.tournamentInfos;
    }
}
