package com.sporty.android.core.model.patron;

import defpackage.d5d;
import defpackage.gpp;
import defpackage.zk1;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0006HÆ\u0003JA\u0010\u0018\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u0006HÆ\u0001J\u0014\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001c\u001a\u00020\u0006HÖ\u0081\u0004J\n\u0010\u001d\u001a\u00020\u001eHÖ\u0081\u0004R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0011\u0010\t\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000f¨\u0006\u001f"}, d2 = {"Lcom/sporty/android/core/model/patron/DevicesResponse;", "", "entityList", "", "Lcom/sporty/android/core/model/patron/DeviceModel;", "pageNo", "", "pageSize", "totalNum", "totalPages", "<init>", "(Ljava/util/List;IIII)V", "getEntityList", "()Ljava/util/List;", "getPageNo", "()I", "getPageSize", "getTotalNum", "getTotalPages", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class DevicesResponse {
    private final List<DeviceModel> entityList;
    private final int pageNo;
    private final int pageSize;
    private final int totalNum;
    private final int totalPages;

    public DevicesResponse(List<DeviceModel> list, int i, int i2, int i3, int i4) {
        list.getClass();
        this.entityList = list;
        this.pageNo = i;
        this.pageSize = i2;
        this.totalNum = i3;
        this.totalPages = i4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DevicesResponse copy$default(DevicesResponse devicesResponse, List list, int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            list = devicesResponse.entityList;
        }
        if ((i5 & 2) != 0) {
            i = devicesResponse.pageNo;
        }
        if ((i5 & 4) != 0) {
            i2 = devicesResponse.pageSize;
        }
        if ((i5 & 8) != 0) {
            i3 = devicesResponse.totalNum;
        }
        if ((i5 & 16) != 0) {
            i4 = devicesResponse.totalPages;
        }
        int i6 = i4;
        int i7 = i2;
        return devicesResponse.copy(list, i, i7, i3, i6);
    }

    public final List<DeviceModel> component1() {
        return this.entityList;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getPageNo() {
        return this.pageNo;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getPageSize() {
        return this.pageSize;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getTotalNum() {
        return this.totalNum;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getTotalPages() {
        return this.totalPages;
    }

    public final DevicesResponse copy(List<DeviceModel> entityList, int pageNo, int pageSize, int totalNum, int totalPages) {
        entityList.getClass();
        return new DevicesResponse(entityList, pageNo, pageSize, totalNum, totalPages);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DevicesResponse)) {
            return false;
        }
        DevicesResponse devicesResponse = (DevicesResponse) other;
        return Intrinsics.g(this.entityList, devicesResponse.entityList) && this.pageNo == devicesResponse.pageNo && this.pageSize == devicesResponse.pageSize && this.totalNum == devicesResponse.totalNum && this.totalPages == devicesResponse.totalPages;
    }

    public final List<DeviceModel> getEntityList() {
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

    public final int getTotalPages() {
        return this.totalPages;
    }

    public int hashCode() {
        return Integer.hashCode(this.totalPages) + gpp.a(this.totalNum, gpp.a(this.pageSize, gpp.a(this.pageNo, this.entityList.hashCode() * 31, 31), 31), 31);
    }

    public String toString() {
        List<DeviceModel> list = this.entityList;
        int i = this.pageNo;
        int i2 = this.pageSize;
        int i3 = this.totalNum;
        int i4 = this.totalPages;
        StringBuilder sb = new StringBuilder("DevicesResponse(entityList=");
        sb.append(list);
        sb.append(", pageNo=");
        sb.append(i);
        sb.append(", pageSize=");
        d5d.a(sb, i2, ", totalNum=", i3, ", totalPages=");
        return zk1.a(i4, ")", sb);
    }
}
