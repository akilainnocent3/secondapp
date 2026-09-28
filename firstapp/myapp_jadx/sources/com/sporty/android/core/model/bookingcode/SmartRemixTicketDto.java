package com.sporty.android.core.model.bookingcode;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ\u0011\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J,\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0013J\u0014\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0017\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010\u0018\u001a\u00020\u0019HÖ\u0081\u0004R)\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u0002¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR-\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006X\u0087\u0004\u0092\u0002\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fÊ\u0001\u0002\b\u001b¨\u0006\u001a"}, d2 = {"Lcom/sporty/android/core/model/bookingcode/SmartRemixTicketDto;", "", "orderType", "", "selections", "", "Lcom/sporty/android/core/model/bookingcode/SmartRemixTicketSelectionDto;", "<init>", "(Ljava/lang/Integer;Ljava/util/List;)V", "getOrderType", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "Lcom/google/gson/annotations/SerializedName;", "value", "getSelections", "()Ljava/util/List;", "component1", "component2", "copy", "(Ljava/lang/Integer;Ljava/util/List;)Lcom/sporty/android/core/model/bookingcode/SmartRemixTicketDto;", "equals", "", "other", "hashCode", "toString", "", "model", "Landroidx/annotation/Keep;"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class SmartRemixTicketDto {

    @SerializedName("orderType")
    private final Integer orderType;

    @SerializedName("selections")
    private final List<SmartRemixTicketSelectionDto> selections;

    public /* synthetic */ SmartRemixTicketDto(Integer num, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SmartRemixTicketDto copy$default(SmartRemixTicketDto smartRemixTicketDto, Integer num, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            num = smartRemixTicketDto.orderType;
        }
        if ((i & 2) != 0) {
            list = smartRemixTicketDto.selections;
        }
        return smartRemixTicketDto.copy(num, list);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Integer getOrderType() {
        return this.orderType;
    }

    public final List<SmartRemixTicketSelectionDto> component2() {
        return this.selections;
    }

    public final SmartRemixTicketDto copy(Integer orderType, List<SmartRemixTicketSelectionDto> selections) {
        return new SmartRemixTicketDto(orderType, selections);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SmartRemixTicketDto)) {
            return false;
        }
        SmartRemixTicketDto smartRemixTicketDto = (SmartRemixTicketDto) other;
        return Intrinsics.g(this.orderType, smartRemixTicketDto.orderType) && Intrinsics.g(this.selections, smartRemixTicketDto.selections);
    }

    public final Integer getOrderType() {
        return this.orderType;
    }

    public final List<SmartRemixTicketSelectionDto> getSelections() {
        return this.selections;
    }

    public int hashCode() {
        Integer num = this.orderType;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        List<SmartRemixTicketSelectionDto> list = this.selections;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        return "SmartRemixTicketDto(orderType=" + this.orderType + ", selections=" + this.selections + ")";
    }

    public SmartRemixTicketDto(Integer num, List<SmartRemixTicketSelectionDto> list) {
        this.orderType = num;
        this.selections = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SmartRemixTicketDto() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
