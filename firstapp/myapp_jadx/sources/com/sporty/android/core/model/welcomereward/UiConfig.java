package com.sporty.android.core.model.welcomereward;

import com.google.gson.annotations.SerializedName;
import defpackage.ai50;
import defpackage.cwz;
import defpackage.m2g;
import defpackage.mtg0;
import defpackage.nng;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\b\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00030\bHÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003JK\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\b2\b\b\u0002\u0010\t\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\u001d\u001a\u00020\u00032\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001f\u001a\u00020 HÖ\u0081\u0004J\n\u0010!\u001a\u00020\"HÖ\u0081\u0004R%\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0002¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR%\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR%\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR%\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR+\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\b8\u0006X\u0087\u0004\u0092\u0002\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R%\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u000e\u0012\b\b\u000f\u0012\u0004\b\b(\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\rÊ\u0001\u0002\b$¨\u0006#"}, d2 = {"Lcom/sporty/android/core/model/welcomereward/UiConfig;", "", "depositIconEnabled", "", "depositFloatingIconGameLobbyEnabled", "depositFloatingIconIvLobbyEnabled", "depositFloatingIconAzMenuEnabled", "popupAfterRegistrationEnabled", "", "storyEnabled", "<init>", "(ZZZZLjava/util/List;Z)V", "getDepositIconEnabled", "()Z", "Lcom/google/gson/annotations/SerializedName;", "value", "getDepositFloatingIconGameLobbyEnabled", "getDepositFloatingIconIvLobbyEnabled", "getDepositFloatingIconAzMenuEnabled", "getPopupAfterRegistrationEnabled", "()Ljava/util/List;", "getStoryEnabled", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toString", "", "model", "Landroidx/annotation/Keep;"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class UiConfig {

    @SerializedName("depositFloatingIconAzMenuEnabled")
    private final boolean depositFloatingIconAzMenuEnabled;

    @SerializedName("depositFloatingIconGameLobbyEnabled")
    private final boolean depositFloatingIconGameLobbyEnabled;

    @SerializedName("depositFloatingIconIvLobbyEnabled")
    private final boolean depositFloatingIconIvLobbyEnabled;

    @SerializedName("depositIconEnabled")
    private final boolean depositIconEnabled;

    @SerializedName("popupAfterRegistrationEnabled")
    private final List<Boolean> popupAfterRegistrationEnabled;

    @SerializedName("storyEnabled")
    private final boolean storyEnabled;

    public UiConfig(boolean z, boolean z2, boolean z3, boolean z4, List list, boolean z5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? false : z3, (i & 8) != 0 ? false : z4, (i & 16) != 0 ? m2g.a : list, (i & 32) != 0 ? false : z5);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UiConfig copy$default(UiConfig uiConfig, boolean z, boolean z2, boolean z3, boolean z4, List list, boolean z5, int i, Object obj) {
        if ((i & 1) != 0) {
            z = uiConfig.depositIconEnabled;
        }
        if ((i & 2) != 0) {
            z2 = uiConfig.depositFloatingIconGameLobbyEnabled;
        }
        if ((i & 4) != 0) {
            z3 = uiConfig.depositFloatingIconIvLobbyEnabled;
        }
        if ((i & 8) != 0) {
            z4 = uiConfig.depositFloatingIconAzMenuEnabled;
        }
        if ((i & 16) != 0) {
            list = uiConfig.popupAfterRegistrationEnabled;
        }
        if ((i & 32) != 0) {
            z5 = uiConfig.storyEnabled;
        }
        List list2 = list;
        boolean z6 = z5;
        return uiConfig.copy(z, z2, z3, z4, list2, z6);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getDepositIconEnabled() {
        return this.depositIconEnabled;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getDepositFloatingIconGameLobbyEnabled() {
        return this.depositFloatingIconGameLobbyEnabled;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getDepositFloatingIconIvLobbyEnabled() {
        return this.depositFloatingIconIvLobbyEnabled;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getDepositFloatingIconAzMenuEnabled() {
        return this.depositFloatingIconAzMenuEnabled;
    }

    public final List<Boolean> component5() {
        return this.popupAfterRegistrationEnabled;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getStoryEnabled() {
        return this.storyEnabled;
    }

    public final UiConfig copy(boolean depositIconEnabled, boolean depositFloatingIconGameLobbyEnabled, boolean depositFloatingIconIvLobbyEnabled, boolean depositFloatingIconAzMenuEnabled, List<Boolean> popupAfterRegistrationEnabled, boolean storyEnabled) {
        popupAfterRegistrationEnabled.getClass();
        return new UiConfig(depositIconEnabled, depositFloatingIconGameLobbyEnabled, depositFloatingIconIvLobbyEnabled, depositFloatingIconAzMenuEnabled, popupAfterRegistrationEnabled, storyEnabled);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UiConfig)) {
            return false;
        }
        UiConfig uiConfig = (UiConfig) other;
        return this.depositIconEnabled == uiConfig.depositIconEnabled && this.depositFloatingIconGameLobbyEnabled == uiConfig.depositFloatingIconGameLobbyEnabled && this.depositFloatingIconIvLobbyEnabled == uiConfig.depositFloatingIconIvLobbyEnabled && this.depositFloatingIconAzMenuEnabled == uiConfig.depositFloatingIconAzMenuEnabled && Intrinsics.g(this.popupAfterRegistrationEnabled, uiConfig.popupAfterRegistrationEnabled) && this.storyEnabled == uiConfig.storyEnabled;
    }

    public final boolean getDepositFloatingIconAzMenuEnabled() {
        return this.depositFloatingIconAzMenuEnabled;
    }

    public final boolean getDepositFloatingIconGameLobbyEnabled() {
        return this.depositFloatingIconGameLobbyEnabled;
    }

    public final boolean getDepositFloatingIconIvLobbyEnabled() {
        return this.depositFloatingIconIvLobbyEnabled;
    }

    public final boolean getDepositIconEnabled() {
        return this.depositIconEnabled;
    }

    public final List<Boolean> getPopupAfterRegistrationEnabled() {
        return this.popupAfterRegistrationEnabled;
    }

    public final boolean getStoryEnabled() {
        return this.storyEnabled;
    }

    public int hashCode() {
        return Boolean.hashCode(this.storyEnabled) + ai50.a(mtg0.a(mtg0.a(mtg0.a(Boolean.hashCode(this.depositIconEnabled) * 31, 31, this.depositFloatingIconGameLobbyEnabled), 31, this.depositFloatingIconIvLobbyEnabled), 31, this.depositFloatingIconAzMenuEnabled), 31, this.popupAfterRegistrationEnabled);
    }

    public String toString() {
        boolean z = this.depositIconEnabled;
        boolean z2 = this.depositFloatingIconGameLobbyEnabled;
        boolean z3 = this.depositFloatingIconIvLobbyEnabled;
        boolean z4 = this.depositFloatingIconAzMenuEnabled;
        List<Boolean> list = this.popupAfterRegistrationEnabled;
        boolean z5 = this.storyEnabled;
        StringBuilder sbA = cwz.a("UiConfig(depositIconEnabled=", ", depositFloatingIconGameLobbyEnabled=", ", depositFloatingIconIvLobbyEnabled=", z, z2);
        nng.a(", depositFloatingIconAzMenuEnabled=", ", popupAfterRegistrationEnabled=", sbA, z3, z4);
        sbA.append(list);
        sbA.append(", storyEnabled=");
        sbA.append(z5);
        sbA.append(")");
        return sbA.toString();
    }

    public UiConfig() {
        this(false, false, false, false, null, false, 63, null);
    }

    public UiConfig(boolean z, boolean z2, boolean z3, boolean z4, List<Boolean> list, boolean z5) {
        list.getClass();
        this.depositIconEnabled = z;
        this.depositFloatingIconGameLobbyEnabled = z2;
        this.depositFloatingIconIvLobbyEnabled = z3;
        this.depositFloatingIconAzMenuEnabled = z4;
        this.popupAfterRegistrationEnabled = list;
        this.storyEnabled = z5;
    }
}
