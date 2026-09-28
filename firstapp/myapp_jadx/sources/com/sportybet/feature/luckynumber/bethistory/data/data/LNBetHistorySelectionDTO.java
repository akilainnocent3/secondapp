package com.sportybet.feature.luckynumber.bethistory.data.data;

import defpackage.tx5;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004J\n\u0010\u0012\u001a\u00020\u0003HÖ\u0081\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bÊ\u0001\u0002\b\u0014Ê\u0001\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\u0003\u0010\u0002¨\u0006\u0013"}, d2 = {"Lcom/sportybet/feature/luckynumber/bethistory/data/data/LNBetHistorySelectionDTO;", "", "lotteryId", "", "lotteryTitle", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getLotteryId", "()Ljava/lang/String;", "getLotteryTitle", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "luckynumber", "Landroidx/annotation/Keep;", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class LNBetHistorySelectionDTO {
    public static final int $stable = 0;
    private final String lotteryId;
    private final String lotteryTitle;

    public /* synthetic */ LNBetHistorySelectionDTO(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }

    public static /* synthetic */ LNBetHistorySelectionDTO copy$default(LNBetHistorySelectionDTO lNBetHistorySelectionDTO, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = lNBetHistorySelectionDTO.lotteryId;
        }
        if ((i & 2) != 0) {
            str2 = lNBetHistorySelectionDTO.lotteryTitle;
        }
        return lNBetHistorySelectionDTO.copy(str, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getLotteryId() {
        return this.lotteryId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getLotteryTitle() {
        return this.lotteryTitle;
    }

    public final LNBetHistorySelectionDTO copy(String lotteryId, String lotteryTitle) {
        return new LNBetHistorySelectionDTO(lotteryId, lotteryTitle);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LNBetHistorySelectionDTO)) {
            return false;
        }
        LNBetHistorySelectionDTO lNBetHistorySelectionDTO = (LNBetHistorySelectionDTO) other;
        return Intrinsics.g(this.lotteryId, lNBetHistorySelectionDTO.lotteryId) && Intrinsics.g(this.lotteryTitle, lNBetHistorySelectionDTO.lotteryTitle);
    }

    public final String getLotteryId() {
        return this.lotteryId;
    }

    public final String getLotteryTitle() {
        return this.lotteryTitle;
    }

    public int hashCode() {
        String str = this.lotteryId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.lotteryTitle;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return tx5.a("LNBetHistorySelectionDTO(lotteryId=", this.lotteryId, ", lotteryTitle=", this.lotteryTitle, ")");
    }

    public LNBetHistorySelectionDTO(String str, String str2) {
        this.lotteryId = str;
        this.lotteryTitle = str2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public LNBetHistorySelectionDTO() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
