package com.sporty.android.core.model.pageable;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B3\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\b¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0002\u0010\fJ\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0002\u0010\fJ\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0002\u0010\fJ\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\bHÆ\u0003JH\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\bHÆ\u0001¢\u0006\u0002\u0010\u0017J\u0014\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÖ\u0083\u0004J\n\u0010\u001b\u001a\u00020\u0004HÖ\u0081\u0004J\n\u0010\u001c\u001a\u00020\u001dHÖ\u0081\u0004R\u0015\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000e\u0010\fR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000f\u0010\fR\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001e"}, d2 = {"Lcom/sporty/android/core/model/pageable/Pageable;", "T", "", "pageSize", "", "pageNo", "totalNum", "entityList", "", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;)V", "getPageSize", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getPageNo", "getTotalNum", "getEntityList", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;)Lcom/sporty/android/core/model/pageable/Pageable;", "equals", "", "other", "hashCode", "toString", "", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class Pageable<T> {
    private final List<T> entityList;
    private final Integer pageNo;
    private final Integer pageSize;
    private final Integer totalNum;

    /* JADX WARN: Multi-variable type inference failed */
    public Pageable(Integer num, Integer num2, Integer num3, List<? extends T> list) {
        list.getClass();
        this.pageSize = num;
        this.pageNo = num2;
        this.totalNum = num3;
        this.entityList = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Pageable copy$default(Pageable pageable, Integer num, Integer num2, Integer num3, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            num = pageable.pageSize;
        }
        if ((i & 2) != 0) {
            num2 = pageable.pageNo;
        }
        if ((i & 4) != 0) {
            num3 = pageable.totalNum;
        }
        if ((i & 8) != 0) {
            list = pageable.entityList;
        }
        return pageable.copy(num, num2, num3, list);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Integer getPageSize() {
        return this.pageSize;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Integer getPageNo() {
        return this.pageNo;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Integer getTotalNum() {
        return this.totalNum;
    }

    public final List<T> component4() {
        return this.entityList;
    }

    public final Pageable<T> copy(Integer pageSize, Integer pageNo, Integer totalNum, List<? extends T> entityList) {
        entityList.getClass();
        return new Pageable<>(pageSize, pageNo, totalNum, entityList);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Pageable)) {
            return false;
        }
        Pageable pageable = (Pageable) other;
        return Intrinsics.g(this.pageSize, pageable.pageSize) && Intrinsics.g(this.pageNo, pageable.pageNo) && Intrinsics.g(this.totalNum, pageable.totalNum) && Intrinsics.g(this.entityList, pageable.entityList);
    }

    public final List<T> getEntityList() {
        return this.entityList;
    }

    public final Integer getPageNo() {
        return this.pageNo;
    }

    public final Integer getPageSize() {
        return this.pageSize;
    }

    public final Integer getTotalNum() {
        return this.totalNum;
    }

    public int hashCode() {
        Integer num = this.pageSize;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.pageNo;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.totalNum;
        return this.entityList.hashCode() + ((iHashCode2 + (num3 != null ? num3.hashCode() : 0)) * 31);
    }

    public String toString() {
        return "Pageable(pageSize=" + this.pageSize + ", pageNo=" + this.pageNo + ", totalNum=" + this.totalNum + ", entityList=" + this.entityList + ")";
    }
}
