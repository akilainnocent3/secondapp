package com.sporty.android.core.model.orders;

import com.google.gson.annotations.SerializedName;
import defpackage.nve;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B=\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\rJ\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\rJ\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0011\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0003JD\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010\u001bJ\u0014\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001f\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010 \u001a\u00020\u0006HÖ\u0081\u0004R)\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0002¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR)\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0004¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\u0011\u0010\rR'\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004\u0092\u0002\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R-\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0006X\u0087\u0004\u0092\u0002\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006!"}, d2 = {"Lcom/sporty/android/core/model/orders/BetHistoryOrderList;", "", "pageNo", "", "pageSize", "lastId", "", "entityList", "", "Lcom/sporty/android/core/model/orders/BetHistoryOrder;", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;)V", "getPageNo", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "Lcom/google/gson/annotations/SerializedName;", "value", "getPageSize", "getLastId", "()Ljava/lang/String;", "getEntityList", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;)Lcom/sporty/android/core/model/orders/BetHistoryOrderList;", "equals", "", "other", "hashCode", "toString", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class BetHistoryOrderList {

    @SerializedName("entityList")
    private final List<BetHistoryOrder> entityList;

    @SerializedName("lastId")
    private final String lastId;

    @SerializedName("pageNo")
    private final Integer pageNo;

    @SerializedName("pageSize")
    private final Integer pageSize;

    public /* synthetic */ BetHistoryOrderList(Integer num, Integer num2, String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : num2, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BetHistoryOrderList copy$default(BetHistoryOrderList betHistoryOrderList, Integer num, Integer num2, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            num = betHistoryOrderList.pageNo;
        }
        if ((i & 2) != 0) {
            num2 = betHistoryOrderList.pageSize;
        }
        if ((i & 4) != 0) {
            str = betHistoryOrderList.lastId;
        }
        if ((i & 8) != 0) {
            list = betHistoryOrderList.entityList;
        }
        return betHistoryOrderList.copy(num, num2, str, list);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Integer getPageNo() {
        return this.pageNo;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Integer getPageSize() {
        return this.pageSize;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getLastId() {
        return this.lastId;
    }

    public final List<BetHistoryOrder> component4() {
        return this.entityList;
    }

    public final BetHistoryOrderList copy(Integer pageNo, Integer pageSize, String lastId, List<BetHistoryOrder> entityList) {
        return new BetHistoryOrderList(pageNo, pageSize, lastId, entityList);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BetHistoryOrderList)) {
            return false;
        }
        BetHistoryOrderList betHistoryOrderList = (BetHistoryOrderList) other;
        return Intrinsics.g(this.pageNo, betHistoryOrderList.pageNo) && Intrinsics.g(this.pageSize, betHistoryOrderList.pageSize) && Intrinsics.g(this.lastId, betHistoryOrderList.lastId) && Intrinsics.g(this.entityList, betHistoryOrderList.entityList);
    }

    public final List<BetHistoryOrder> getEntityList() {
        return this.entityList;
    }

    public final String getLastId() {
        return this.lastId;
    }

    public final Integer getPageNo() {
        return this.pageNo;
    }

    public final Integer getPageSize() {
        return this.pageSize;
    }

    public int hashCode() {
        Integer num = this.pageNo;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.pageSize;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.lastId;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        List<BetHistoryOrder> list = this.entityList;
        return iHashCode3 + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        Integer num = this.pageNo;
        Integer num2 = this.pageSize;
        String str = this.lastId;
        List<BetHistoryOrder> list = this.entityList;
        StringBuilder sb = new StringBuilder("BetHistoryOrderList(pageNo=");
        sb.append(num);
        sb.append(", pageSize=");
        sb.append(num2);
        sb.append(", lastId=");
        return nve.a(str, ", entityList=", ")", sb, list);
    }

    public BetHistoryOrderList(Integer num, Integer num2, String str, List<BetHistoryOrder> list) {
        this.pageNo = num;
        this.pageSize = num2;
        this.lastId = str;
        this.entityList = list;
    }

    public BetHistoryOrderList() {
        this(null, null, null, null, 15, null);
    }
}
