package com.sporty.android.core.model.remixbet;

import com.google.gson.annotations.SerializedName;
import defpackage.ew7;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0012J\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0015J\u0011\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0003JD\u0010\u001e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0001¢\u0006\u0002\u0010\u001fJ\u0014\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010#\u001a\u00020\u0005HÖ\u0081\u0004J\n\u0010$\u001a\u00020\u0003HÖ\u0081\u0004R'\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0002¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR)\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u0092\u0002\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0004¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012R)\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u0092\u0002\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0006¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0014\u0010\u0015R-\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0006X\u0087\u0004\u0092\u0002\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0019¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018Ê\u0001\u0002\b&¨\u0006%"}, d2 = {"Lcom/sporty/android/core/model/remixbet/RemixBetPageDto;", "", "shareCode", "", "foldsAmount", "", "totalOdds", "", "picks", "", "Lcom/sporty/android/core/model/remixbet/RemixPickDto;", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Double;Ljava/util/List;)V", "getShareCode", "()Ljava/lang/String;", "Lcom/google/gson/annotations/SerializedName;", "value", "getFoldsAmount", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getTotalOdds", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getPicks", "()Ljava/util/List;", "shareCodeDetail", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Double;Ljava/util/List;)Lcom/sporty/android/core/model/remixbet/RemixBetPageDto;", "equals", "", "other", "hashCode", "toString", "model", "Landroidx/annotation/Keep;"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class RemixBetPageDto {

    @SerializedName("foldsAmount")
    private final Integer foldsAmount;

    @SerializedName("shareCodeDetail")
    private final List<RemixPickDto> picks;

    @SerializedName("shareCode")
    private final String shareCode;

    @SerializedName("totalOdds")
    private final Double totalOdds;

    public RemixBetPageDto(String str, Integer num, Double d, List<RemixPickDto> list) {
        this.shareCode = str;
        this.foldsAmount = num;
        this.totalOdds = d;
        this.picks = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RemixBetPageDto copy$default(RemixBetPageDto remixBetPageDto, String str, Integer num, Double d, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = remixBetPageDto.shareCode;
        }
        if ((i & 2) != 0) {
            num = remixBetPageDto.foldsAmount;
        }
        if ((i & 4) != 0) {
            d = remixBetPageDto.totalOdds;
        }
        if ((i & 8) != 0) {
            list = remixBetPageDto.picks;
        }
        return remixBetPageDto.copy(str, num, d, list);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getShareCode() {
        return this.shareCode;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Integer getFoldsAmount() {
        return this.foldsAmount;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Double getTotalOdds() {
        return this.totalOdds;
    }

    public final List<RemixPickDto> component4() {
        return this.picks;
    }

    public final RemixBetPageDto copy(String shareCode, Integer foldsAmount, Double totalOdds, List<RemixPickDto> picks) {
        return new RemixBetPageDto(shareCode, foldsAmount, totalOdds, picks);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RemixBetPageDto)) {
            return false;
        }
        RemixBetPageDto remixBetPageDto = (RemixBetPageDto) other;
        return Intrinsics.g(this.shareCode, remixBetPageDto.shareCode) && Intrinsics.g(this.foldsAmount, remixBetPageDto.foldsAmount) && Intrinsics.g(this.totalOdds, remixBetPageDto.totalOdds) && Intrinsics.g(this.picks, remixBetPageDto.picks);
    }

    public final Integer getFoldsAmount() {
        return this.foldsAmount;
    }

    public final List<RemixPickDto> getPicks() {
        return this.picks;
    }

    public final String getShareCode() {
        return this.shareCode;
    }

    public final Double getTotalOdds() {
        return this.totalOdds;
    }

    public int hashCode() {
        String str = this.shareCode;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.foldsAmount;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Double d = this.totalOdds;
        int iHashCode3 = (iHashCode2 + (d == null ? 0 : d.hashCode())) * 31;
        List<RemixPickDto> list = this.picks;
        return iHashCode3 + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        String str = this.shareCode;
        Integer num = this.foldsAmount;
        Double d = this.totalOdds;
        List<RemixPickDto> list = this.picks;
        StringBuilder sbA = ew7.a(num, "RemixBetPageDto(shareCode=", str, ", foldsAmount=", ", totalOdds=");
        sbA.append(d);
        sbA.append(", picks=");
        sbA.append(list);
        sbA.append(")");
        return sbA.toString();
    }
}
