package com.sporty.android.core.model.realsports;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0014\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0012\u001a\u00020\u0013HÖ\u0081\u0004J\n\u0010\u0014\u001a\u00020\u0015HÖ\u0081\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bÊ\u0001\u0002\b\u0017¨\u0006\u0016"}, d2 = {"Lcom/sporty/android/core/model/realsports/BetTypeConfigResponse;", "", "flexi", "Lcom/sporty/android/core/model/realsports/BetTypeConfigFlexiBetDto;", "anywin", "Lcom/sporty/android/core/model/realsports/BetTypeConfigAnyWinDto;", "<init>", "(Lcom/sporty/android/core/model/realsports/BetTypeConfigFlexiBetDto;Lcom/sporty/android/core/model/realsports/BetTypeConfigAnyWinDto;)V", "getFlexi", "()Lcom/sporty/android/core/model/realsports/BetTypeConfigFlexiBetDto;", "getAnywin", "()Lcom/sporty/android/core/model/realsports/BetTypeConfigAnyWinDto;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "model", "Landroidx/annotation/Keep;"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class BetTypeConfigResponse {
    private final BetTypeConfigAnyWinDto anywin;
    private final BetTypeConfigFlexiBetDto flexi;

    public BetTypeConfigResponse(BetTypeConfigFlexiBetDto betTypeConfigFlexiBetDto, BetTypeConfigAnyWinDto betTypeConfigAnyWinDto) {
        this.flexi = betTypeConfigFlexiBetDto;
        this.anywin = betTypeConfigAnyWinDto;
    }

    public static /* synthetic */ BetTypeConfigResponse copy$default(BetTypeConfigResponse betTypeConfigResponse, BetTypeConfigFlexiBetDto betTypeConfigFlexiBetDto, BetTypeConfigAnyWinDto betTypeConfigAnyWinDto, int i, Object obj) {
        if ((i & 1) != 0) {
            betTypeConfigFlexiBetDto = betTypeConfigResponse.flexi;
        }
        if ((i & 2) != 0) {
            betTypeConfigAnyWinDto = betTypeConfigResponse.anywin;
        }
        return betTypeConfigResponse.copy(betTypeConfigFlexiBetDto, betTypeConfigAnyWinDto);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final BetTypeConfigFlexiBetDto getFlexi() {
        return this.flexi;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final BetTypeConfigAnyWinDto getAnywin() {
        return this.anywin;
    }

    public final BetTypeConfigResponse copy(BetTypeConfigFlexiBetDto flexi, BetTypeConfigAnyWinDto anywin) {
        return new BetTypeConfigResponse(flexi, anywin);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BetTypeConfigResponse)) {
            return false;
        }
        BetTypeConfigResponse betTypeConfigResponse = (BetTypeConfigResponse) other;
        return Intrinsics.g(this.flexi, betTypeConfigResponse.flexi) && Intrinsics.g(this.anywin, betTypeConfigResponse.anywin);
    }

    public final BetTypeConfigAnyWinDto getAnywin() {
        return this.anywin;
    }

    public final BetTypeConfigFlexiBetDto getFlexi() {
        return this.flexi;
    }

    public int hashCode() {
        BetTypeConfigFlexiBetDto betTypeConfigFlexiBetDto = this.flexi;
        int iHashCode = (betTypeConfigFlexiBetDto == null ? 0 : betTypeConfigFlexiBetDto.hashCode()) * 31;
        BetTypeConfigAnyWinDto betTypeConfigAnyWinDto = this.anywin;
        return iHashCode + (betTypeConfigAnyWinDto != null ? betTypeConfigAnyWinDto.hashCode() : 0);
    }

    public String toString() {
        return "BetTypeConfigResponse(flexi=" + this.flexi + ", anywin=" + this.anywin + ")";
    }
}
