package com.sportybet.plugin.realsports.data;

import com.sportybet.plugin.realsports.betslip.Selection;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0014\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0012\u001a\u00020\u0013HÖ\u0081\u0004J\n\u0010\u0014\u001a\u00020\u0015HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bÊ\u0001\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\u0003\u0010\u0000¨\u0006\u0016"}, d2 = {"Lcom/sportybet/plugin/realsports/data/SliderOutcomeData;", "", "outcome", "Lcom/sportybet/plugin/realsports/data/Outcome;", "selection", "Lcom/sportybet/plugin/realsports/betslip/Selection;", "<init>", "(Lcom/sportybet/plugin/realsports/data/Outcome;Lcom/sportybet/plugin/realsports/betslip/Selection;)V", "getOutcome", "()Lcom/sportybet/plugin/realsports/data/Outcome;", "getSelection", "()Lcom/sportybet/plugin/realsports/betslip/Selection;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "africa-bet-android", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class SliderOutcomeData {
    public static final int $stable = 8;
    private final Outcome outcome;
    private final Selection selection;

    public SliderOutcomeData(Outcome outcome, Selection selection) {
        outcome.getClass();
        selection.getClass();
        this.outcome = outcome;
        this.selection = selection;
    }

    public static /* synthetic */ SliderOutcomeData copy$default(SliderOutcomeData sliderOutcomeData, Outcome outcome, Selection selection, int i, Object obj) {
        if ((i & 1) != 0) {
            outcome = sliderOutcomeData.outcome;
        }
        if ((i & 2) != 0) {
            selection = sliderOutcomeData.selection;
        }
        return sliderOutcomeData.copy(outcome, selection);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Outcome getOutcome() {
        return this.outcome;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Selection getSelection() {
        return this.selection;
    }

    public final SliderOutcomeData copy(Outcome outcome, Selection selection) {
        outcome.getClass();
        selection.getClass();
        return new SliderOutcomeData(outcome, selection);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SliderOutcomeData)) {
            return false;
        }
        SliderOutcomeData sliderOutcomeData = (SliderOutcomeData) other;
        return Intrinsics.g(this.outcome, sliderOutcomeData.outcome) && Intrinsics.g(this.selection, sliderOutcomeData.selection);
    }

    public final Outcome getOutcome() {
        return this.outcome;
    }

    public final Selection getSelection() {
        return this.selection;
    }

    public int hashCode() {
        return this.selection.hashCode() + (this.outcome.hashCode() * 31);
    }

    public String toString() {
        return "SliderOutcomeData(outcome=" + this.outcome + ", selection=" + this.selection + ")";
    }
}
