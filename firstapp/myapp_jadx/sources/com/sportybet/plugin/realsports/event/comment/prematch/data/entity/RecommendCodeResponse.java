package com.sportybet.plugin.realsports.event.comment.prematch.data.entity;

import android.os.Parcel;
import android.os.Parcelable;
import com.appsflyer.internal.p;
import defpackage.m2g;
import defpackage.p200;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u001b\u0010\u000b\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\f\u001a\u00020\rJ\u0014\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0083\u0004J\n\u0010\u0012\u001a\u00020\rHÖ\u0081\u0004J\n\u0010\u0013\u001a\u00020\u0014HÖ\u0081\u0004J\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\rR\"\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\u0006Ê\u0001\u0002\b\u001bÊ\u0001\u0002\b\u001cÊ\u0001\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\u0003\u0010\u0000¨\u0006\u001a"}, d2 = {"Lcom/sportybet/plugin/realsports/event/comment/prematch/data/entity/RecommendCodeResponse;", "Landroid/os/Parcelable;", "recommendBookingCodes", "", "Lcom/sportybet/plugin/realsports/event/comment/prematch/data/entity/RecommendCodeDto;", "<init>", "(Ljava/util/List;)V", "getRecommendBookingCodes", "()Ljava/util/List;", "setRecommendBookingCodes", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "africa-bet-android", "Landroidx/annotation/Keep;", "Lkotlinx/parcelize/Parcelize;", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class RecommendCodeResponse implements Parcelable {
    private List<RecommendCodeDto> recommendBookingCodes;
    public static final Parcelable.Creator<RecommendCodeResponse> CREATOR = new Creator();
    public static final int $stable = 8;

    @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<RecommendCodeResponse> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RecommendCodeResponse createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            parcel.getClass();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i);
                int iA = 0;
                while (iA != i) {
                    iA = p200.a(RecommendCodeDto.CREATOR, parcel, arrayList2, iA, 1);
                }
                arrayList = arrayList2;
            }
            return new RecommendCodeResponse(arrayList);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RecommendCodeResponse[] newArray(int i) {
            return new RecommendCodeResponse[i];
        }
    }

    public RecommendCodeResponse(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? m2g.a : list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RecommendCodeResponse copy$default(RecommendCodeResponse recommendCodeResponse, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = recommendCodeResponse.recommendBookingCodes;
        }
        return recommendCodeResponse.copy(list);
    }

    public final List<RecommendCodeDto> component1() {
        return this.recommendBookingCodes;
    }

    public final RecommendCodeResponse copy(List<RecommendCodeDto> recommendBookingCodes) {
        return new RecommendCodeResponse(recommendBookingCodes);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof RecommendCodeResponse) && Intrinsics.g(this.recommendBookingCodes, ((RecommendCodeResponse) other).recommendBookingCodes);
    }

    public final List<RecommendCodeDto> getRecommendBookingCodes() {
        return this.recommendBookingCodes;
    }

    public int hashCode() {
        List<RecommendCodeDto> list = this.recommendBookingCodes;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public final void setRecommendBookingCodes(List<RecommendCodeDto> list) {
        this.recommendBookingCodes = list;
    }

    public String toString() {
        return p.a("RecommendCodeResponse(recommendBookingCodes=", ")", this.recommendBookingCodes);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.getClass();
        List<RecommendCodeDto> list = this.recommendBookingCodes;
        if (list == null) {
            dest.writeInt(0);
            return;
        }
        dest.writeInt(1);
        dest.writeInt(list.size());
        Iterator<RecommendCodeDto> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(dest, flags);
        }
    }

    public RecommendCodeResponse(List<RecommendCodeDto> list) {
        this.recommendBookingCodes = list;
    }

    public RecommendCodeResponse() {
        this(null, 1, null);
    }
}
