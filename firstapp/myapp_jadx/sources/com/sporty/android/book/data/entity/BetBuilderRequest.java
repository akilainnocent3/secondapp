package com.sporty.android.book.data.entity;

import com.sporty.android.book.domain.entity.BetBuilderSelection;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import defpackage.ai50;
import defpackage.mh2;
import java.math.BigDecimal;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u000b\u001a\u00020\u0003HÂ\u0003J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÂ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\bHÂ\u0003J/\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0014\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0012\u001a\u00020\u0013HÖ\u0081\u0004J\n\u0010\u0014\u001a\u00020\u0003HÖ\u0081\u0004R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u0004¢\u0006\u0002\n\u0000Ê\u0001\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\u0003\u0010\u0000¨\u0006\u0015"}, d2 = {"Lcom/sporty/android/book/data/entity/BetBuilderRequest;", "", AnalyticsParam.EVENT_PARAM_PAGE_VIEW_EVENT_ID, "", "selections", "", "Lcom/sporty/android/book/domain/entity/BetBuilderSelection;", "odds", "Ljava/math/BigDecimal;", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/math/BigDecimal;)V", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "sportybook", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class BetBuilderRequest {
    public static final int $stable = 8;
    private final String eventId;
    private final BigDecimal odds;
    private final List<BetBuilderSelection> selections;

    public BetBuilderRequest(String str, List<BetBuilderSelection> list, BigDecimal bigDecimal) {
        str.getClass();
        list.getClass();
        this.eventId = str;
        this.selections = list;
        this.odds = bigDecimal;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    private final String getEventId() {
        return this.eventId;
    }

    private final List<BetBuilderSelection> component2() {
        return this.selections;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    private final BigDecimal getOdds() {
        return this.odds;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BetBuilderRequest copy$default(BetBuilderRequest betBuilderRequest, String str, List list, BigDecimal bigDecimal, int i, Object obj) {
        if ((i & 1) != 0) {
            str = betBuilderRequest.eventId;
        }
        if ((i & 2) != 0) {
            list = betBuilderRequest.selections;
        }
        if ((i & 4) != 0) {
            bigDecimal = betBuilderRequest.odds;
        }
        return betBuilderRequest.copy(str, list, bigDecimal);
    }

    public final BetBuilderRequest copy(String eventId, List<BetBuilderSelection> selections, BigDecimal odds) {
        eventId.getClass();
        selections.getClass();
        return new BetBuilderRequest(eventId, selections, odds);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BetBuilderRequest)) {
            return false;
        }
        BetBuilderRequest betBuilderRequest = (BetBuilderRequest) other;
        return Intrinsics.g(this.eventId, betBuilderRequest.eventId) && Intrinsics.g(this.selections, betBuilderRequest.selections) && Intrinsics.g(this.odds, betBuilderRequest.odds);
    }

    public int hashCode() {
        int iA = ai50.a(this.eventId.hashCode() * 31, 31, this.selections);
        BigDecimal bigDecimal = this.odds;
        return iA + (bigDecimal == null ? 0 : bigDecimal.hashCode());
    }

    public String toString() {
        String str = this.eventId;
        List<BetBuilderSelection> list = this.selections;
        BigDecimal bigDecimal = this.odds;
        StringBuilder sb = new StringBuilder("BetBuilderRequest(eventId=");
        sb.append(str);
        sb.append(", selections=");
        sb.append(list);
        sb.append(", odds=");
        return mh2.a(")", sb, bigDecimal);
    }
}
