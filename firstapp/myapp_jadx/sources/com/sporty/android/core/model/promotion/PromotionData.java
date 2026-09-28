package com.sporty.android.core.model.promotion;

import com.google.gson.annotations.SerializedName;
import defpackage.at6;
import defpackage.dy5;
import defpackage.gpp;
import defpackage.m2g;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J7\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001J\u0014\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001b\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010\u001c\u001a\u00020\u001dHÖ\u0081\u0004R%\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0002¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR%\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR%\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR+\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006X\u0087\u0004\u0092\u0002\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001e"}, d2 = {"Lcom/sporty/android/core/model/promotion/PromotionData;", "", "pageSize", "", "pageNo", "totalNum", "entityList", "", "Lcom/sporty/android/core/model/promotion/ActivityItem;", "<init>", "(IIILjava/util/List;)V", "getPageSize", "()I", "Lcom/google/gson/annotations/SerializedName;", "value", "getPageNo", "getTotalNum", "getEntityList", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class PromotionData {

    @SerializedName("entityList")
    private final List<ActivityItem> entityList;

    @SerializedName("pageNo")
    private final int pageNo;

    @SerializedName("pageSize")
    private final int pageSize;

    @SerializedName("totalNum")
    private final int totalNum;

    public PromotionData(int i, int i2, int i3, List<ActivityItem> list) {
        list.getClass();
        this.pageSize = i;
        this.pageNo = i2;
        this.totalNum = i3;
        this.entityList = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PromotionData copy$default(PromotionData promotionData, int i, int i2, int i3, List list, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = promotionData.pageSize;
        }
        if ((i4 & 2) != 0) {
            i2 = promotionData.pageNo;
        }
        if ((i4 & 4) != 0) {
            i3 = promotionData.totalNum;
        }
        if ((i4 & 8) != 0) {
            list = promotionData.entityList;
        }
        return promotionData.copy(i, i2, i3, list);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getPageSize() {
        return this.pageSize;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getPageNo() {
        return this.pageNo;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getTotalNum() {
        return this.totalNum;
    }

    public final List<ActivityItem> component4() {
        return this.entityList;
    }

    public final PromotionData copy(int pageSize, int pageNo, int totalNum, List<ActivityItem> entityList) {
        entityList.getClass();
        return new PromotionData(pageSize, pageNo, totalNum, entityList);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PromotionData)) {
            return false;
        }
        PromotionData promotionData = (PromotionData) other;
        return this.pageSize == promotionData.pageSize && this.pageNo == promotionData.pageNo && this.totalNum == promotionData.totalNum && Intrinsics.g(this.entityList, promotionData.entityList);
    }

    public final List<ActivityItem> getEntityList() {
        return this.entityList;
    }

    public final int getPageNo() {
        return this.pageNo;
    }

    public final int getPageSize() {
        return this.pageSize;
    }

    public final int getTotalNum() {
        return this.totalNum;
    }

    public int hashCode() {
        return this.entityList.hashCode() + gpp.a(this.totalNum, gpp.a(this.pageNo, Integer.hashCode(this.pageSize) * 31, 31), 31);
    }

    public String toString() {
        int i = this.pageSize;
        int i2 = this.pageNo;
        return at6.b(dy5.a("PromotionData(pageSize=", i, i2, ", pageNo=", ", totalNum="), this.totalNum, ", entityList=", this.entityList, ")");
    }

    public PromotionData(int i, int i2, int i3, List list, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, i3, (i4 & 8) != 0 ? m2g.a : list);
    }
}
