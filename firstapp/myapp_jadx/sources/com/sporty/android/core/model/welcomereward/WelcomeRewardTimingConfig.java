package com.sporty.android.core.model.welcomereward;

import defpackage.ae80;
import defpackage.ce80;
import defpackage.dy5;
import defpackage.fma;
import defpackage.gpp;
import defpackage.pd80;
import defpackage.php;
import defpackage.zk1;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes4.dex */
@ae80
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u0000 '2\u00020\u0001:\u0002('B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007B3\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0006\u0010\u000bJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0016J.\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0016J\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u0016R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010#\u001a\u0004\b%\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010#\u001a\u0004\b&\u0010\u0016¨\u0006)"}, d2 = {"Lcom/sporty/android/core/model/welcomereward/WelcomeRewardTimingConfig;", "", "", "autoOpenMinutes", "hideAfterClickMinutes", "hideWithoutClickMinutes", "<init>", "(III)V", "seen0", "Lce80;", "serializationConstructorMarker", "(IIIILce80;)V", "self", "Lfma;", "output", "Lpd80;", "serialDesc", "", "write$Self$model", "(Lcom/sporty/android/core/model/welcomereward/WelcomeRewardTimingConfig;Lfma;Lpd80;)V", "write$Self", "component1", "()I", "component2", "component3", "copy", "(III)Lcom/sporty/android/core/model/welcomereward/WelcomeRewardTimingConfig;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getAutoOpenMinutes", "getHideAfterClickMinutes", "getHideWithoutClickMinutes", "Companion", "$serializer", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class WelcomeRewardTimingConfig {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final int autoOpenMinutes;
    private final int hideAfterClickMinutes;
    private final int hideWithoutClickMinutes;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/sporty/android/core/model/welcomereward/WelcomeRewardTimingConfig$Companion;", "", "<init>", "()V", "Lphp;", "Lcom/sporty/android/core/model/welcomereward/WelcomeRewardTimingConfig;", "serializer", "()Lphp;", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final php<WelcomeRewardTimingConfig> serializer() {
            return WelcomeRewardTimingConfig$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ WelcomeRewardTimingConfig(int i, int i2, int i3, int i4, ce80 ce80Var) {
        if ((i & 1) == 0) {
            this.autoOpenMinutes = 1440;
        } else {
            this.autoOpenMinutes = i2;
        }
        if ((i & 2) == 0) {
            this.hideAfterClickMinutes = 1440;
        } else {
            this.hideAfterClickMinutes = i3;
        }
        if ((i & 4) == 0) {
            this.hideWithoutClickMinutes = 2880;
        } else {
            this.hideWithoutClickMinutes = i4;
        }
    }

    public static /* synthetic */ WelcomeRewardTimingConfig copy$default(WelcomeRewardTimingConfig welcomeRewardTimingConfig, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = welcomeRewardTimingConfig.autoOpenMinutes;
        }
        if ((i4 & 2) != 0) {
            i2 = welcomeRewardTimingConfig.hideAfterClickMinutes;
        }
        if ((i4 & 4) != 0) {
            i3 = welcomeRewardTimingConfig.hideWithoutClickMinutes;
        }
        return welcomeRewardTimingConfig.copy(i, i2, i3);
    }

    public static final /* synthetic */ void write$Self$model(WelcomeRewardTimingConfig self, fma output, pd80 serialDesc) {
        if (output.a(serialDesc) || self.autoOpenMinutes != 1440) {
            output.A(0, self.autoOpenMinutes, serialDesc);
        }
        if (output.a(serialDesc) || self.hideAfterClickMinutes != 1440) {
            output.A(1, self.hideAfterClickMinutes, serialDesc);
        }
        if (!output.a(serialDesc) && self.hideWithoutClickMinutes == 2880) {
            return;
        }
        output.A(2, self.hideWithoutClickMinutes, serialDesc);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getAutoOpenMinutes() {
        return this.autoOpenMinutes;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getHideAfterClickMinutes() {
        return this.hideAfterClickMinutes;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getHideWithoutClickMinutes() {
        return this.hideWithoutClickMinutes;
    }

    public final WelcomeRewardTimingConfig copy(int autoOpenMinutes, int hideAfterClickMinutes, int hideWithoutClickMinutes) {
        return new WelcomeRewardTimingConfig(autoOpenMinutes, hideAfterClickMinutes, hideWithoutClickMinutes);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WelcomeRewardTimingConfig)) {
            return false;
        }
        WelcomeRewardTimingConfig welcomeRewardTimingConfig = (WelcomeRewardTimingConfig) other;
        return this.autoOpenMinutes == welcomeRewardTimingConfig.autoOpenMinutes && this.hideAfterClickMinutes == welcomeRewardTimingConfig.hideAfterClickMinutes && this.hideWithoutClickMinutes == welcomeRewardTimingConfig.hideWithoutClickMinutes;
    }

    public final int getAutoOpenMinutes() {
        return this.autoOpenMinutes;
    }

    public final int getHideAfterClickMinutes() {
        return this.hideAfterClickMinutes;
    }

    public final int getHideWithoutClickMinutes() {
        return this.hideWithoutClickMinutes;
    }

    public int hashCode() {
        return Integer.hashCode(this.hideWithoutClickMinutes) + gpp.a(this.hideAfterClickMinutes, Integer.hashCode(this.autoOpenMinutes) * 31, 31);
    }

    public String toString() {
        return zk1.a(this.hideWithoutClickMinutes, ")", dy5.a("WelcomeRewardTimingConfig(autoOpenMinutes=", this.autoOpenMinutes, this.hideAfterClickMinutes, ", hideAfterClickMinutes=", ", hideWithoutClickMinutes="));
    }

    public WelcomeRewardTimingConfig(int i, int i2, int i3) {
        this.autoOpenMinutes = i;
        this.hideAfterClickMinutes = i2;
        this.hideWithoutClickMinutes = i3;
    }

    public WelcomeRewardTimingConfig() {
        this(0, 0, 0, 7, (DefaultConstructorMarker) null);
    }

    public /* synthetic */ WelcomeRewardTimingConfig(int i, int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? 1440 : i, (i4 & 2) != 0 ? 1440 : i2, (i4 & 4) != 0 ? 2880 : i3);
    }
}
