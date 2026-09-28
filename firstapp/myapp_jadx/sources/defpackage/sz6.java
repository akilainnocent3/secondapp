package defpackage;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0081\b\u0018\u00002\u00020\u0001R\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0003\u0010\u0005R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\u0007\u0010\u0005¨\u0006\t"}, d2 = {"Lsz6;", "", "", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "title", "b", "typeDisplay", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class sz6 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @SerializedName("title")
    private final String title;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @SerializedName("typeDisplay")
    private final String typeDisplay;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getTypeDisplay() {
        return this.typeDisplay;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sz6)) {
            return false;
        }
        sz6 sz6Var = (sz6) obj;
        return Intrinsics.g(this.title, sz6Var.title) && Intrinsics.g(this.typeDisplay, sz6Var.typeDisplay);
    }

    public final int hashCode() {
        return this.typeDisplay.hashCode() + (this.title.hashCode() * 31);
    }

    public final String toString() {
        return tx5.a("ChallengeContentDto(title=", this.title, ", typeDisplay=", this.typeDisplay, ")");
    }
}
