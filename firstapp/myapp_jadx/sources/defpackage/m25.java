package defpackage;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0081\b\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006R\u001a\u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0004\u001a\u0004\b\f\u0010\u0006R \u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0003\u0010\u0012¨\u0006\u0014"}, d2 = {"Lm25;", "", "", "a", "I", "getPageSize", "()I", "pageSize", "b", "getPageNo", "pageNo", "c", "getTotalNum", "totalNum", "", "La25;", "d", "Ljava/util/List;", "()Ljava/util/List;", "entityList", "gift"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class m25 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @SerializedName("pageSize")
    private final int pageSize;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @SerializedName("pageNo")
    private final int pageNo;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @SerializedName("totalNum")
    private final int totalNum;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @SerializedName("entityList")
    private final List<a25> entityList;

    public final List<a25> a() {
        return this.entityList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m25)) {
            return false;
        }
        m25 m25Var = (m25) obj;
        return this.pageSize == m25Var.pageSize && this.pageNo == m25Var.pageNo && this.totalNum == m25Var.totalNum && Intrinsics.g(this.entityList, m25Var.entityList);
    }

    public final int hashCode() {
        return this.entityList.hashCode() + gpp.a(this.totalNum, gpp.a(this.pageNo, Integer.hashCode(this.pageSize) * 31, 31), 31);
    }

    public final String toString() {
        int i = this.pageSize;
        int i2 = this.pageNo;
        return at6.b(dy5.a("BoostGiftsResponseDto(pageSize=", i, i2, ", pageNo=", ", totalNum="), this.totalNum, ", entityList=", this.entityList, ")");
    }
}
