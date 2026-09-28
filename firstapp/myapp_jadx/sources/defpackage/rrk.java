package defpackage;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u000b\b\u0081\b\u0018\u00002\u00020\u0001R \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0004\u0010\u0006R\u001a\u0010\r\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0010\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\n\u001a\u0004\b\u000f\u0010\fR\u001a\u0010\u0012\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\n\u001a\u0004\b\t\u0010\f¨\u0006\u0013"}, d2 = {"Lrrk;", "", "", "Lxjk;", "a", "Ljava/util/List;", "()Ljava/util/List;", "entityList", "", "b", "I", "getPageNo", "()I", "pageNo", "c", "getPageSize", "pageSize", "d", "totalNum", "gift"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class rrk {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @SerializedName("entityList")
    private final List<xjk> entityList;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @SerializedName("pageNo")
    private final int pageNo;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @SerializedName("pageSize")
    private final int pageSize;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @SerializedName("totalNum")
    private final int totalNum;

    public final List<xjk> a() {
        return this.entityList;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getTotalNum() {
        return this.totalNum;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rrk)) {
            return false;
        }
        rrk rrkVar = (rrk) obj;
        return Intrinsics.g(this.entityList, rrkVar.entityList) && this.pageNo == rrkVar.pageNo && this.pageSize == rrkVar.pageSize && this.totalNum == rrkVar.totalNum;
    }

    public final int hashCode() {
        return Integer.hashCode(this.totalNum) + gpp.a(this.pageSize, gpp.a(this.pageNo, this.entityList.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        List<xjk> list = this.entityList;
        int i = this.pageNo;
        int i2 = this.pageSize;
        int i3 = this.totalNum;
        StringBuilder sb = new StringBuilder("GiftResponseDto(entityList=");
        sb.append(list);
        sb.append(", pageNo=");
        sb.append(i);
        sb.append(", pageSize=");
        return b7f.a(sb, i2, ", totalNum=", i3, ")");
    }
}
