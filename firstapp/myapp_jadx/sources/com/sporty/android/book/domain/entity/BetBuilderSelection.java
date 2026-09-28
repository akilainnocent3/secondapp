package com.sporty.android.book.domain.entity;

import com.sporty.android.core.model.tracking.AnalyticsParam;
import defpackage.gmf0;
import defpackage.uf80;
import defpackage.ux5;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\b\u001a\u00020\u0003HÂ\u0003J\t\u0010\t\u001a\u00020\u0003HÂ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÂ\u0003J)\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u000f\u001a\u00020\u0010HÖ\u0081\u0004J\n\u0010\u0011\u001a\u00020\u0003HÖ\u0081\u0004R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000Ê\u0001\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\u0003\u0010\u0002¨\u0006\u0012"}, d2 = {"Lcom/sporty/android/book/domain/entity/BetBuilderSelection;", "", AnalyticsParam.EVENT_PARAM_ID, "", "odds", "probability", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "sportybook", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class BetBuilderSelection {
    public static final int $stable = 0;
    private final String id;
    private final String odds;
    private final String probability;

    public BetBuilderSelection(String str, String str2, String str3) {
        str.getClass();
        str2.getClass();
        this.id = str;
        this.odds = str2;
        this.probability = str3;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    private final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    private final String getOdds() {
        return this.odds;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    private final String getProbability() {
        return this.probability;
    }

    public static /* synthetic */ BetBuilderSelection copy$default(BetBuilderSelection betBuilderSelection, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = betBuilderSelection.id;
        }
        if ((i & 2) != 0) {
            str2 = betBuilderSelection.odds;
        }
        if ((i & 4) != 0) {
            str3 = betBuilderSelection.probability;
        }
        return betBuilderSelection.copy(str, str2, str3);
    }

    public final BetBuilderSelection copy(String id, String odds, String probability) {
        id.getClass();
        odds.getClass();
        return new BetBuilderSelection(id, odds, probability);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BetBuilderSelection)) {
            return false;
        }
        BetBuilderSelection betBuilderSelection = (BetBuilderSelection) other;
        return Intrinsics.g(this.id, betBuilderSelection.id) && Intrinsics.g(this.odds, betBuilderSelection.odds) && Intrinsics.g(this.probability, betBuilderSelection.probability);
    }

    public int hashCode() {
        int iA = gmf0.a(this.id.hashCode() * 31, 31, this.odds);
        String str = this.probability;
        return iA + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        String str = this.id;
        String str2 = this.odds;
        return uf80.a(ux5.a("BetBuilderSelection(id=", str, ", odds=", str2, ", probability="), this.probability, ")");
    }
}
