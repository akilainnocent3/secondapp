package com.sporty.android.core.model.realsports.liabilitycheck;

import com.google.gson.annotations.SerializedName;
import defpackage.x03;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\b\u0087\b\u0018\u00002\u00020\u0001BK\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0010J\u0011\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\bHÆ\u0003J\u0010\u0010!\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u001aJ\u0010\u0010\"\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u001aJ\u0010\u0010#\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u001aJ\\\u0010$\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0002\u0010%J\u0014\u0010&\u001a\u00020\n2\b\u0010'\u001a\u0004\u0018\u00010(HÖ\u0083\u0004J\n\u0010)\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010*\u001a\u00020\bHÖ\u0081\u0004R)\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0016X\u0097\u0004\u0092\u0002\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0014¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0018\u0010\t\u001a\u0004\u0018\u00010\nX\u0096\u0004¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b\u0019\u0010\u001aR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\nX\u0096\u0004¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b\u001c\u0010\u001aR)\u0010\f\u001a\u0004\u0018\u00010\n8\u0016X\u0097\u0004\u0092\u0002\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u001d¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b\f\u0010\u001aÊ\u0001\u0002\b,¨\u0006+"}, d2 = {"Lcom/sporty/android/core/model/realsports/liabilitycheck/LiabilityCheckResultResponse;", "Lcom/sporty/android/core/model/realsports/liabilitycheck/LiabilityCheckResultDto;", "typeId", "", "rejectedSelections", "", "Lcom/sporty/android/core/model/realsports/liabilitycheck/LiabilityCheckDto;", "bookingCode", "", "allSelectionsAreFootball", "", "allowMultiMaker", "isSmartRemixAvailable", "<init>", "(Ljava/lang/Integer;Ljava/util/List;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "getTypeId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "Lcom/google/gson/annotations/SerializedName;", "value", "type", "getRejectedSelections", "()Ljava/util/List;", "getBookingCode", "()Ljava/lang/String;", "getAllSelectionsAreFootball", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getAllowMultiMaker", "smartRemixAvailable", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/Integer;Ljava/util/List;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/sporty/android/core/model/realsports/liabilitycheck/LiabilityCheckResultResponse;", "equals", "other", "", "hashCode", "toString", "model", "Landroidx/annotation/Keep;"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class LiabilityCheckResultResponse implements LiabilityCheckResultDto {
    private final Boolean allSelectionsAreFootball;
    private final Boolean allowMultiMaker;
    private final String bookingCode;

    @SerializedName("smartRemixAvailable")
    private final Boolean isSmartRemixAvailable;
    private final List<LiabilityCheckDto> rejectedSelections;

    @SerializedName("type")
    private final Integer typeId;

    public LiabilityCheckResultResponse(Integer num, List<LiabilityCheckDto> list, String str, Boolean bool, Boolean bool2, Boolean bool3) {
        this.typeId = num;
        this.rejectedSelections = list;
        this.bookingCode = str;
        this.allSelectionsAreFootball = bool;
        this.allowMultiMaker = bool2;
        this.isSmartRemixAvailable = bool3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LiabilityCheckResultResponse copy$default(LiabilityCheckResultResponse liabilityCheckResultResponse, Integer num, List list, String str, Boolean bool, Boolean bool2, Boolean bool3, int i, Object obj) {
        if ((i & 1) != 0) {
            num = liabilityCheckResultResponse.typeId;
        }
        if ((i & 2) != 0) {
            list = liabilityCheckResultResponse.rejectedSelections;
        }
        if ((i & 4) != 0) {
            str = liabilityCheckResultResponse.bookingCode;
        }
        if ((i & 8) != 0) {
            bool = liabilityCheckResultResponse.allSelectionsAreFootball;
        }
        if ((i & 16) != 0) {
            bool2 = liabilityCheckResultResponse.allowMultiMaker;
        }
        if ((i & 32) != 0) {
            bool3 = liabilityCheckResultResponse.isSmartRemixAvailable;
        }
        Boolean bool4 = bool2;
        Boolean bool5 = bool3;
        return liabilityCheckResultResponse.copy(num, list, str, bool, bool4, bool5);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Integer getTypeId() {
        return this.typeId;
    }

    public final List<LiabilityCheckDto> component2() {
        return this.rejectedSelections;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getBookingCode() {
        return this.bookingCode;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Boolean getAllSelectionsAreFootball() {
        return this.allSelectionsAreFootball;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Boolean getAllowMultiMaker() {
        return this.allowMultiMaker;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Boolean getIsSmartRemixAvailable() {
        return this.isSmartRemixAvailable;
    }

    public final LiabilityCheckResultResponse copy(Integer typeId, List<LiabilityCheckDto> rejectedSelections, String bookingCode, Boolean allSelectionsAreFootball, Boolean allowMultiMaker, Boolean isSmartRemixAvailable) {
        return new LiabilityCheckResultResponse(typeId, rejectedSelections, bookingCode, allSelectionsAreFootball, allowMultiMaker, isSmartRemixAvailable);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LiabilityCheckResultResponse)) {
            return false;
        }
        LiabilityCheckResultResponse liabilityCheckResultResponse = (LiabilityCheckResultResponse) other;
        return Intrinsics.g(this.typeId, liabilityCheckResultResponse.typeId) && Intrinsics.g(this.rejectedSelections, liabilityCheckResultResponse.rejectedSelections) && Intrinsics.g(this.bookingCode, liabilityCheckResultResponse.bookingCode) && Intrinsics.g(this.allSelectionsAreFootball, liabilityCheckResultResponse.allSelectionsAreFootball) && Intrinsics.g(this.allowMultiMaker, liabilityCheckResultResponse.allowMultiMaker) && Intrinsics.g(this.isSmartRemixAvailable, liabilityCheckResultResponse.isSmartRemixAvailable);
    }

    @Override // com.sporty.android.core.model.realsports.liabilitycheck.LiabilityCheckResultDto
    public Boolean getAllSelectionsAreFootball() {
        return this.allSelectionsAreFootball;
    }

    @Override // com.sporty.android.core.model.realsports.liabilitycheck.LiabilityCheckResultDto
    public Boolean getAllowMultiMaker() {
        return this.allowMultiMaker;
    }

    @Override // com.sporty.android.core.model.realsports.liabilitycheck.LiabilityCheckResultDto
    public String getBookingCode() {
        return this.bookingCode;
    }

    @Override // com.sporty.android.core.model.realsports.liabilitycheck.LiabilityCheckResultDto
    public List<LiabilityCheckDto> getRejectedSelections() {
        return this.rejectedSelections;
    }

    @Override // com.sporty.android.core.model.realsports.liabilitycheck.LiabilityCheckResultDto
    public Integer getTypeId() {
        return this.typeId;
    }

    public int hashCode() {
        Integer num = this.typeId;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        List<LiabilityCheckDto> list = this.rejectedSelections;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.bookingCode;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.allSelectionsAreFootball;
        int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.allowMultiMaker;
        int iHashCode5 = (iHashCode4 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.isSmartRemixAvailable;
        return iHashCode5 + (bool3 != null ? bool3.hashCode() : 0);
    }

    @Override // com.sporty.android.core.model.realsports.liabilitycheck.LiabilityCheckResultDto
    public Boolean isSmartRemixAvailable() {
        return this.isSmartRemixAvailable;
    }

    public String toString() {
        Integer num = this.typeId;
        List<LiabilityCheckDto> list = this.rejectedSelections;
        String str = this.bookingCode;
        Boolean bool = this.allSelectionsAreFootball;
        Boolean bool2 = this.allowMultiMaker;
        Boolean bool3 = this.isSmartRemixAvailable;
        StringBuilder sb = new StringBuilder("LiabilityCheckResultResponse(typeId=");
        sb.append(num);
        sb.append(", rejectedSelections=");
        sb.append(list);
        sb.append(", bookingCode=");
        x03.a(sb, str, ", allSelectionsAreFootball=", bool, ", allowMultiMaker=");
        sb.append(bool2);
        sb.append(", isSmartRemixAvailable=");
        sb.append(bool3);
        sb.append(")");
        return sb.toString();
    }

    public /* synthetic */ LiabilityCheckResultResponse(Integer num, List list, String str, Boolean bool, Boolean bool2, Boolean bool3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(num, list, str, bool, bool2, (i & 32) != 0 ? null : bool3);
    }
}
