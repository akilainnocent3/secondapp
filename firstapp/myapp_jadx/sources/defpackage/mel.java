package defpackage;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0081\b\u0018\u00002\u00020\u0001R\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005¨\u0006\u0007"}, d2 = {"Lmel;", "", "", "a", "Z", "()Z", "hasUsed", "gift"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class mel {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @SerializedName("hasUsed")
    private final boolean hasUsed;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getHasUsed() {
        return this.hasUsed;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mel) && this.hasUsed == ((mel) obj).hasUsed;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.hasUsed);
    }

    public final String toString() {
        return b6c.a("HasUsedGiftDto(hasUsed=", ")", this.hasUsed);
    }
}
