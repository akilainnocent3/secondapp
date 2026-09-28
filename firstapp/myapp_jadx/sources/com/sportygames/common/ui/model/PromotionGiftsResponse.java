package com.sportygames.common.ui.model;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.gpp;
import defpackage.p200;
import defpackage.rr1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0011\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J9\u0010\u0015\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0006HÆ\u0001J\u0006\u0010\u0016\u001a\u00020\u0006J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u0006HÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\u0016\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u0006R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000e¨\u0006#"}, d2 = {"Lcom/sportygames/common/ui/model/PromotionGiftsResponse;", "Landroid/os/Parcelable;", "entityList", "", "Lcom/sportygames/common/ui/model/GiftItem;", "pageNo", "", "pageSize", "totalNum", "<init>", "(Ljava/util/List;III)V", "getEntityList", "()Ljava/util/List;", "getPageNo", "()I", "getPageSize", "getTotalNum", "component1", "component2", "component3", "component4", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "common-ui_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PromotionGiftsResponse implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<PromotionGiftsResponse> CREATOR = new a();
    private final List<GiftItem> entityList;
    private final int pageNo;
    private final int pageSize;
    private final int totalNum;

    public static final class a implements Parcelable.Creator<PromotionGiftsResponse> {
        @Override // android.os.Parcelable.Creator
        public final PromotionGiftsResponse createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            parcel.getClass();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i);
                int iA = 0;
                while (iA != i) {
                    iA = p200.a(GiftItem.CREATOR, parcel, arrayList2, iA, 1);
                }
                arrayList = arrayList2;
            }
            return new PromotionGiftsResponse(arrayList, parcel.readInt(), parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final PromotionGiftsResponse[] newArray(int i) {
            return new PromotionGiftsResponse[i];
        }
    }

    public PromotionGiftsResponse(List<GiftItem> list, int i, int i2, int i3) {
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
        List<GiftItem> list = this.entityList;
        return Integer.hashCode(this.totalNum) + gpp.a(this.pageSize, gpp.a(this.pageNo, (list == null ? 0 : list.hashCode()) * 31, 31), 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("PromotionGiftsResponse(entityList=");
        sb.append(this.entityList);
        sb.append(", pageNo=");
        sb.append(this.pageNo);
        sb.append(", pageSize=");
        sb.append(this.pageSize);
        sb.append(", totalNum=");
        return rr1.b(sb, this.totalNum, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.getClass();
        List<GiftItem> list = this.entityList;
        if (list == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(list.size());
            Iterator<GiftItem> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(dest, flags);
            }
        }
        dest.writeInt(this.pageNo);
        dest.writeInt(this.pageSize);
        dest.writeInt(this.totalNum);
    }
}
