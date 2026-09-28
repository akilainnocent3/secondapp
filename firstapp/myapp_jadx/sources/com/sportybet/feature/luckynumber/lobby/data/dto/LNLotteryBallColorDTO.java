package com.sportybet.feature.luckynumber.lobby.data.dto;

import com.sporty.android.core.model.tracking.AnalyticsParam;
import defpackage.ai50;
import defpackage.ng1;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J3\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0001J\u0014\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0016\u001a\u00020\u0006HÖ\u0081\u0004J\n\u0010\u0017\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rÊ\u0001\u0002\b\u0019Ê\u0001\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\u0003\u0010\u0002¨\u0006\u0018"}, d2 = {"Lcom/sportybet/feature/luckynumber/lobby/data/dto/LNLotteryBallColorDTO;", "", AnalyticsParam.EVENT_PARAM_ID, "", "numbers", "", "", "marketOutcomeIds", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V", "getId", "()Ljava/lang/String;", "getNumbers", "()Ljava/util/List;", "getMarketOutcomeIds", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "luckynumber", "Landroidx/annotation/Keep;", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class LNLotteryBallColorDTO {
    public static final int $stable = 0;
    private final String id;
    private final List<String> marketOutcomeIds;
    private final List<Integer> numbers;

    public LNLotteryBallColorDTO(String str, List<Integer> list, List<String> list2) {
        str.getClass();
        list.getClass();
        list2.getClass();
        this.id = str;
        this.numbers = list;
        this.marketOutcomeIds = list2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LNLotteryBallColorDTO copy$default(LNLotteryBallColorDTO lNLotteryBallColorDTO, String str, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = lNLotteryBallColorDTO.id;
        }
        if ((i & 2) != 0) {
            list = lNLotteryBallColorDTO.numbers;
        }
        if ((i & 4) != 0) {
            list2 = lNLotteryBallColorDTO.marketOutcomeIds;
        }
        return lNLotteryBallColorDTO.copy(str, list, list2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    public final List<Integer> component2() {
        return this.numbers;
    }

    public final List<String> component3() {
        return this.marketOutcomeIds;
    }

    public final LNLotteryBallColorDTO copy(String id, List<Integer> numbers, List<String> marketOutcomeIds) {
        id.getClass();
        numbers.getClass();
        marketOutcomeIds.getClass();
        return new LNLotteryBallColorDTO(id, numbers, marketOutcomeIds);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LNLotteryBallColorDTO)) {
            return false;
        }
        LNLotteryBallColorDTO lNLotteryBallColorDTO = (LNLotteryBallColorDTO) other;
        return Intrinsics.g(this.id, lNLotteryBallColorDTO.id) && Intrinsics.g(this.numbers, lNLotteryBallColorDTO.numbers) && Intrinsics.g(this.marketOutcomeIds, lNLotteryBallColorDTO.marketOutcomeIds);
    }

    public final String getId() {
        return this.id;
    }

    public final List<String> getMarketOutcomeIds() {
        return this.marketOutcomeIds;
    }

    public final List<Integer> getNumbers() {
        return this.numbers;
    }

    public int hashCode() {
        return this.marketOutcomeIds.hashCode() + ai50.a(this.id.hashCode() * 31, 31, this.numbers);
    }

    public String toString() {
        String str = this.id;
        List<Integer> list = this.numbers;
        List<String> list2 = this.marketOutcomeIds;
        StringBuilder sb = new StringBuilder("LNLotteryBallColorDTO(id=");
        sb.append(str);
        sb.append(", numbers=");
        sb.append(list);
        sb.append(", marketOutcomeIds=");
        return ng1.a(sb, list2, ")");
    }
}
