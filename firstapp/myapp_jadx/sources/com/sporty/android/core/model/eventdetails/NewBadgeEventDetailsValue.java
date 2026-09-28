package com.sporty.android.core.model.eventdetails;

import com.google.gson.annotations.SerializedName;
import defpackage.cwz;
import defpackage.lng;
import defpackage.mtg0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J1\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\u0019\u001a\u00020\u00032\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001b\u001a\u00020\u001cHÖ\u0081\u0004J\n\u0010\u001d\u001a\u00020\u001eHÖ\u0081\u0004R%\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR%\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\nR%\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\nR%\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u0013¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\n¨\u0006\u001f"}, d2 = {"Lcom/sporty/android/core/model/eventdetails/NewBadgeEventDetailsValue;", "", "betBuilderTabNewBadgeVisibility", "", "notesOnBetNewBadgeVisibility", "preMatchDetailCodeListNewBadgeVisibility", "sportyJokerNewBadgeVisibility", "<init>", "(ZZZZ)V", "getBetBuilderTabNewBadgeVisibility", "()Z", "Lcom/google/gson/annotations/SerializedName;", "value", "pcbb", "getNotesOnBetNewBadgeVisibility", "notes_on_bet", "getPreMatchDetailCodeListNewBadgeVisibility", "pre_match_detail_code_list", "getSportyJokerNewBadgeVisibility", "sporty_joker", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class NewBadgeEventDetailsValue {

    @SerializedName("pcbb")
    private final boolean betBuilderTabNewBadgeVisibility;

    @SerializedName("notes_on_bet")
    private final boolean notesOnBetNewBadgeVisibility;

    @SerializedName("pre_match_detail_code_list")
    private final boolean preMatchDetailCodeListNewBadgeVisibility;

    @SerializedName("sporty_joker")
    private final boolean sportyJokerNewBadgeVisibility;

    public /* synthetic */ NewBadgeEventDetailsValue(boolean z, boolean z2, boolean z3, boolean z4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? false : z3, (i & 8) != 0 ? false : z4);
    }

    public static /* synthetic */ NewBadgeEventDetailsValue copy$default(NewBadgeEventDetailsValue newBadgeEventDetailsValue, boolean z, boolean z2, boolean z3, boolean z4, int i, Object obj) {
        if ((i & 1) != 0) {
            z = newBadgeEventDetailsValue.betBuilderTabNewBadgeVisibility;
        }
        if ((i & 2) != 0) {
            z2 = newBadgeEventDetailsValue.notesOnBetNewBadgeVisibility;
        }
        if ((i & 4) != 0) {
            z3 = newBadgeEventDetailsValue.preMatchDetailCodeListNewBadgeVisibility;
        }
        if ((i & 8) != 0) {
            z4 = newBadgeEventDetailsValue.sportyJokerNewBadgeVisibility;
        }
        return newBadgeEventDetailsValue.copy(z, z2, z3, z4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getBetBuilderTabNewBadgeVisibility() {
        return this.betBuilderTabNewBadgeVisibility;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getNotesOnBetNewBadgeVisibility() {
        return this.notesOnBetNewBadgeVisibility;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getPreMatchDetailCodeListNewBadgeVisibility() {
        return this.preMatchDetailCodeListNewBadgeVisibility;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getSportyJokerNewBadgeVisibility() {
        return this.sportyJokerNewBadgeVisibility;
    }

    public final NewBadgeEventDetailsValue copy(boolean betBuilderTabNewBadgeVisibility, boolean notesOnBetNewBadgeVisibility, boolean preMatchDetailCodeListNewBadgeVisibility, boolean sportyJokerNewBadgeVisibility) {
        return new NewBadgeEventDetailsValue(betBuilderTabNewBadgeVisibility, notesOnBetNewBadgeVisibility, preMatchDetailCodeListNewBadgeVisibility, sportyJokerNewBadgeVisibility);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NewBadgeEventDetailsValue)) {
            return false;
        }
        NewBadgeEventDetailsValue newBadgeEventDetailsValue = (NewBadgeEventDetailsValue) other;
        return this.betBuilderTabNewBadgeVisibility == newBadgeEventDetailsValue.betBuilderTabNewBadgeVisibility && this.notesOnBetNewBadgeVisibility == newBadgeEventDetailsValue.notesOnBetNewBadgeVisibility && this.preMatchDetailCodeListNewBadgeVisibility == newBadgeEventDetailsValue.preMatchDetailCodeListNewBadgeVisibility && this.sportyJokerNewBadgeVisibility == newBadgeEventDetailsValue.sportyJokerNewBadgeVisibility;
    }

    public final boolean getBetBuilderTabNewBadgeVisibility() {
        return this.betBuilderTabNewBadgeVisibility;
    }

    public final boolean getNotesOnBetNewBadgeVisibility() {
        return this.notesOnBetNewBadgeVisibility;
    }

    public final boolean getPreMatchDetailCodeListNewBadgeVisibility() {
        return this.preMatchDetailCodeListNewBadgeVisibility;
    }

    public final boolean getSportyJokerNewBadgeVisibility() {
        return this.sportyJokerNewBadgeVisibility;
    }

    public int hashCode() {
        return Boolean.hashCode(this.sportyJokerNewBadgeVisibility) + mtg0.a(mtg0.a(Boolean.hashCode(this.betBuilderTabNewBadgeVisibility) * 31, 31, this.notesOnBetNewBadgeVisibility), 31, this.preMatchDetailCodeListNewBadgeVisibility);
    }

    public String toString() {
        boolean z = this.betBuilderTabNewBadgeVisibility;
        boolean z2 = this.notesOnBetNewBadgeVisibility;
        return lng.a(", sportyJokerNewBadgeVisibility=", ")", cwz.a("NewBadgeEventDetailsValue(betBuilderTabNewBadgeVisibility=", ", notesOnBetNewBadgeVisibility=", ", preMatchDetailCodeListNewBadgeVisibility=", z, z2), this.preMatchDetailCodeListNewBadgeVisibility, this.sportyJokerNewBadgeVisibility);
    }

    public NewBadgeEventDetailsValue(boolean z, boolean z2, boolean z3, boolean z4) {
        this.betBuilderTabNewBadgeVisibility = z;
        this.notesOnBetNewBadgeVisibility = z2;
        this.preMatchDetailCodeListNewBadgeVisibility = z3;
        this.sportyJokerNewBadgeVisibility = z4;
    }

    public NewBadgeEventDetailsValue() {
        this(false, false, false, false, 15, null);
    }
}
