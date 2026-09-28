package com.sportygames.commons.models;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.b7f;
import defpackage.gpp;
import defpackage.p200;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J7\u0010\u0015\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0006HÆ\u0001J\u0006\u0010\u0016\u001a\u00020\u0006J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u0006HÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\u0016\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u0006R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000e¨\u0006#"}, d2 = {"Lcom/sportygames/commons/models/PromotionGiftsResponse;", "Landroid/os/Parcelable;", "entityList", "", "Lcom/sportygames/commons/models/GiftItem;", "pageNo", "", "pageSize", "totalNum", "<init>", "(Ljava/util/List;III)V", "getEntityList", "()Ljava/util/List;", "getPageNo", "()I", "getPageSize", "getTotalNum", "component1", "component2", "component3", "component4", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PromotionGiftsResponse implements Parcelable {
    private final List<GiftItem> entityList;
    private final int pageNo;
    private final int pageSize;
    private final int totalNum;
    public static final Parcelable.Creator<PromotionGiftsResponse> CREATOR = new Creator();
    public static final int $stable = 8;

    @kotlin.Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<PromotionGiftsResponse> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PromotionGiftsResponse createFromParcel(Parcel parcel) {
            parcel.getClass();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iA = 0;
            while (iA != i) {
                iA = p200.a(GiftItem.CREATOR, parcel, arrayList, iA, 1);
            }
            return new PromotionGiftsResponse(arrayList, parcel.readInt(), parcel.readInt(), parcel.readInt());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PromotionGiftsResponse[] newArray(int i) {
            return new PromotionGiftsResponse[i];
        }
    }

    public PromotionGiftsResponse(List<GiftItem> list, int i, int i2, int i3) {
        list.getClass();
        this.entityList = list;
        this.pageNo = i;
        this.pageSize = i2;
        this.totalNum = i3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PromotionGiftsResponse copy$default(PromotionGiftsResponse promotionGiftsResponse, List list, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            list = promotionGiftsResponse.entityList;
        }
        if ((i4 & 2) != 0) {
            i = promotionGiftsResponse.pageNo;
        }
        if ((i4 & 4) != 0) {
            i2 = promotionGiftsResponse.pageSize;
        }
        if ((i4 & 8) != 0) {
            i3 = promotionGiftsResponse.totalNum;
        }
        return promotionGiftsResponse.copy(list, i, i2, i3);
    }

    public final List<GiftItem> component1() {
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

    public final PromotionGiftsResponse copy(List<GiftItem> entityList, int pageNo, int pageSize, int totalNum) {
        entityList.getClass();
        return new PromotionGiftsResponse(entityList, pageNo, pageSize, totalNum);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PromotionGiftsResponse)) {
            return false;
        }
        PromotionGiftsResponse promotionGiftsResponse = (PromotionGiftsResponse) other;
        return Intrinsics.g(this.entityList, promotionGiftsResponse.entityList) && this.pageNo == promotionGiftsResponse.pageNo && this.pageSize == promotionGiftsResponse.pageSize && this.totalNum == promotionGiftsResponse.totalNum;
    }

    public final List<GiftItem> getEntityList() {
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
        return Integer.hashCode(this.totalNum) + gpp.a(this.pageSize, gpp.a(this.pageNo, this.entityList.hashCode() * 31, 31), 31);
    }

    public String toString() {
        List<GiftItem> list = this.entityList;
        int i = this.pageNo;
        int i2 = this.pageSize;
        int i3 = this.totalNum;
        StringBuilder sb = new StringBuilder("PromotionGiftsResponse(entityList=");
        sb.append(list);
        sb.append(", pageNo=");
        sb.append(i);
        sb.append(", pageSize=");
        return b7f.a(sb, i2, ", totalNum=", i3, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.getClass();
        List<GiftItem> list = this.entityList;
        dest.writeInt(list.size());
        Iterator<GiftItem> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(dest, flags);
        }
        dest.writeInt(this.pageNo);
        dest.writeInt(this.pageSize);
        dest.writeInt(this.totalNum);
    }
}
