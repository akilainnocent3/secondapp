package defpackage;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0081\b\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\r\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lysz;", "", "", "a", "Z", "getPreview", "()Z", "preview", "", "b", "Ljava/lang/String;", "getType", "()Ljava/lang/String;", "type", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class ysz {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @SerializedName("preview")
    private final boolean preview;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @SerializedName("type")
    private final String type = "PLACING_WAGER";

    public ysz(boolean z) {
        this.preview = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ysz)) {
            return false;
        }
        ysz yszVar = (ysz) obj;
        return this.preview == yszVar.preview && Intrinsics.g(this.type, yszVar.type);
    }

    public final int hashCode() {
        return this.type.hashCode() + (Boolean.hashCode(this.preview) * 31);
    }

    public final String toString() {
        return "ParticipateBettingStreakMissionBody(preview=" + this.preview + ", type=" + this.type + ")";
    }
}
