package com.sporty.android.book.domain.entity;

import defpackage.rg2;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0006HÆ\u0003J\u0010\u0010\u0014\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0010J4\u0010\u0015\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010\u0016J\u0014\u0010\u0017\u001a\u00020\b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0019\u001a\u00020\u001aHÖ\u0081\u0004J\n\u0010\u001b\u001a\u00020\u001cHÖ\u0081\u0004R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010Ê\u0001\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\u0003\u0010\u0002¨\u0006\u001d"}, d2 = {"Lcom/sporty/android/book/domain/entity/BetBuilderDataWSelections;", "", "selections", "", "Lcom/sporty/android/book/domain/entity/Selection;", "betBuilderData", "Lcom/sporty/android/book/domain/entity/BetBuilderData;", "pushChanges", "", "<init>", "(Ljava/util/List;Lcom/sporty/android/book/domain/entity/BetBuilderData;Ljava/lang/Boolean;)V", "getSelections", "()Ljava/util/List;", "getBetBuilderData", "()Lcom/sporty/android/book/domain/entity/BetBuilderData;", "getPushChanges", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "component3", "copy", "(Ljava/util/List;Lcom/sporty/android/book/domain/entity/BetBuilderData;Ljava/lang/Boolean;)Lcom/sporty/android/book/domain/entity/BetBuilderDataWSelections;", "equals", "other", "hashCode", "", "toString", "", "sportybook", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class BetBuilderDataWSelections {
    public static final int $stable = 0;
    private final BetBuilderData betBuilderData;
    private final Boolean pushChanges;
    private final List<Selection> selections;

    public BetBuilderDataWSelections(List<Selection> list, BetBuilderData betBuilderData, Boolean bool) {
        list.getClass();
        betBuilderData.getClass();
        this.selections = list;
        this.betBuilderData = betBuilderData;
        this.pushChanges = bool;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BetBuilderDataWSelections copy$default(BetBuilderDataWSelections betBuilderDataWSelections, List list, BetBuilderData betBuilderData, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            list = betBuilderDataWSelections.selections;
        }
        if ((i & 2) != 0) {
            betBuilderData = betBuilderDataWSelections.betBuilderData;
        }
        if ((i & 4) != 0) {
            bool = betBuilderDataWSelections.pushChanges;
        }
        return betBuilderDataWSelections.copy(list, betBuilderData, bool);
    }

    public final List<Selection> component1() {
        return this.selections;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final BetBuilderData getBetBuilderData() {
        return this.betBuilderData;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Boolean getPushChanges() {
        return this.pushChanges;
    }

    public final BetBuilderDataWSelections copy(List<Selection> selections, BetBuilderData betBuilderData, Boolean pushChanges) {
        selections.getClass();
        betBuilderData.getClass();
        return new BetBuilderDataWSelections(selections, betBuilderData, pushChanges);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BetBuilderDataWSelections)) {
            return false;
        }
        BetBuilderDataWSelections betBuilderDataWSelections = (BetBuilderDataWSelections) other;
        return Intrinsics.g(this.selections, betBuilderDataWSelections.selections) && Intrinsics.g(this.betBuilderData, betBuilderDataWSelections.betBuilderData) && Intrinsics.g(this.pushChanges, betBuilderDataWSelections.pushChanges);
    }

    public final BetBuilderData getBetBuilderData() {
        return this.betBuilderData;
    }

    public final Boolean getPushChanges() {
        return this.pushChanges;
    }

    public final List<Selection> getSelections() {
        return this.selections;
    }

    public int hashCode() {
        int iHashCode = (this.betBuilderData.hashCode() + (this.selections.hashCode() * 31)) * 31;
        Boolean bool = this.pushChanges;
        return iHashCode + (bool == null ? 0 : bool.hashCode());
    }

    public String toString() {
        List<Selection> list = this.selections;
        BetBuilderData betBuilderData = this.betBuilderData;
        Boolean bool = this.pushChanges;
        StringBuilder sb = new StringBuilder("BetBuilderDataWSelections(selections=");
        sb.append(list);
        sb.append(", betBuilderData=");
        sb.append(betBuilderData);
        sb.append(", pushChanges=");
        return rg2.a(sb, bool, ")");
    }
}
