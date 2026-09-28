package com.sporty.android.platform.features.newotp.model;

import com.sporty.android.platform.features.newotp.otpselector.OtpSelection;
import defpackage.uf00;
import defpackage.yvz;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\nJ@\u0010\r\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001a\u0010\nR\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001b\u0010\nR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u001c\u0010\n¨\u0006\u001d"}, d2 = {"Lcom/sporty/android/platform/features/newotp/model/OtpSelectionGroup;", "", "Luf00;", "Lcom/sporty/android/platform/features/newotp/otpselector/OtpSelection;", "selections", "prioritizedSelections", "availableSelections", "<init>", "(Luf00;Luf00;Luf00;)V", "component1", "()Luf00;", "component2", "component3", "copy", "(Luf00;Luf00;Luf00;)Lcom/sporty/android/platform/features/newotp/model/OtpSelectionGroup;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Luf00;", "getSelections", "getPrioritizedSelections", "getAvailableSelections", "sportyplatform"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class OtpSelectionGroup {
    public static final int $stable = 0;
    private final uf00<OtpSelection> availableSelections;
    private final uf00<OtpSelection> prioritizedSelections;
    private final uf00<OtpSelection> selections;

    /* JADX WARN: Multi-variable type inference failed */
    public OtpSelectionGroup(uf00<? extends OtpSelection> uf00Var, uf00<? extends OtpSelection> uf00Var2, uf00<? extends OtpSelection> uf00Var3) {
        uf00Var.getClass();
        uf00Var2.getClass();
        uf00Var3.getClass();
        this.selections = uf00Var;
        this.prioritizedSelections = uf00Var2;
        this.availableSelections = uf00Var3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ OtpSelectionGroup copy$default(OtpSelectionGroup otpSelectionGroup, uf00 uf00Var, uf00 uf00Var2, uf00 uf00Var3, int i, Object obj) {
        if ((i & 1) != 0) {
            uf00Var = otpSelectionGroup.selections;
        }
        if ((i & 2) != 0) {
            uf00Var2 = otpSelectionGroup.prioritizedSelections;
        }
        if ((i & 4) != 0) {
            uf00Var3 = otpSelectionGroup.availableSelections;
        }
        return otpSelectionGroup.copy(uf00Var, uf00Var2, uf00Var3);
    }

    public final uf00<OtpSelection> component1() {
        return this.selections;
    }

    public final uf00<OtpSelection> component2() {
        return this.prioritizedSelections;
    }

    public final uf00<OtpSelection> component3() {
        return this.availableSelections;
    }

    public final OtpSelectionGroup copy(uf00<? extends OtpSelection> selections, uf00<? extends OtpSelection> prioritizedSelections, uf00<? extends OtpSelection> availableSelections) {
        selections.getClass();
        prioritizedSelections.getClass();
        availableSelections.getClass();
        return new OtpSelectionGroup(selections, prioritizedSelections, availableSelections);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OtpSelectionGroup)) {
            return false;
        }
        OtpSelectionGroup otpSelectionGroup = (OtpSelectionGroup) other;
        return Intrinsics.g(this.selections, otpSelectionGroup.selections) && Intrinsics.g(this.prioritizedSelections, otpSelectionGroup.prioritizedSelections) && Intrinsics.g(this.availableSelections, otpSelectionGroup.availableSelections);
    }

    public final uf00<OtpSelection> getAvailableSelections() {
        return this.availableSelections;
    }

    public final uf00<OtpSelection> getPrioritizedSelections() {
        return this.prioritizedSelections;
    }

    public final uf00<OtpSelection> getSelections() {
        return this.selections;
    }

    public int hashCode() {
        return this.availableSelections.hashCode() + yvz.a(this.prioritizedSelections, this.selections.hashCode() * 31, 31);
    }

    public String toString() {
        return "OtpSelectionGroup(selections=" + this.selections + ", prioritizedSelections=" + this.prioritizedSelections + ", availableSelections=" + this.availableSelections + ")";
    }
}
