package defpackage;

import com.appsflyer.internal.b0;
import com.google.gson.annotations.SerializedName;
import com.sporty.android.book.domain.entity.Category;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\r\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u000f\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\n\u001a\u0004\b\u000e\u0010\fR\u001a\u0010\u0010\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\n\u001a\u0004\b\u0003\u0010\fR\u001a\u0010\u0015\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u001a\u0010\u0016\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0013\u001a\u0004\b\t\u0010\u0014¨\u0006\u0017"}, d2 = {"Lzw3;", "", "", "a", "J", "c", "()J", AnalyticsParam.EVENT_PARAM_ID, "", "b", "Ljava/lang/String;", "f", "()Ljava/lang/String;", AnalyticsParam.EVENT_PATH, "d", "name", Category.CATEGORY_ID, "", "e", "Z", "()Z", "owned", "current", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class zw3 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @SerializedName(AnalyticsParam.EVENT_PARAM_ID)
    private final long id;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @SerializedName(AnalyticsParam.EVENT_PATH)
    private final String path;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @SerializedName("name")
    private final String name;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @SerializedName(Category.CATEGORY_ID)
    private final String category;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @SerializedName("owned")
    private final boolean owned;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @SerializedName("current")
    private final boolean current;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getCategory() {
        return this.category;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getCurrent() {
        return this.current;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final long getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getOwned() {
        return this.owned;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zw3)) {
            return false;
        }
        zw3 zw3Var = (zw3) obj;
        return this.id == zw3Var.id && Intrinsics.g(this.path, zw3Var.path) && Intrinsics.g(this.name, zw3Var.name) && Intrinsics.g(this.category, zw3Var.category) && this.owned == zw3Var.owned && this.current == zw3Var.current;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getPath() {
        return this.path;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.current) + mtg0.a(gmf0.a(gmf0.a(gmf0.a(Long.hashCode(this.id) * 31, 31, this.path), 31, this.name), 31, this.category), 31, this.owned);
    }

    public final String toString() {
        long j = this.id;
        String str = this.path;
        String str2 = this.name;
        String str3 = this.category;
        boolean z = this.owned;
        boolean z2 = this.current;
        StringBuilder sbA = b0.a(j, "BetslipThemeDto(id=", ", path=", str);
        hxa.c(sbA, ", name=", str2, ", category=", str3);
        u8.a(", owned=", ", current=", sbA, z, z2);
        sbA.append(")");
        return sbA.toString();
    }
}
