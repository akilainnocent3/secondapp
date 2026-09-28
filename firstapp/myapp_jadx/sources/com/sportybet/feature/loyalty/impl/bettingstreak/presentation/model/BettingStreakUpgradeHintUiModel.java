package com.sportybet.feature.loyalty.impl.bettingstreak.presentation.model;

import com.twilio.voice.EventKeys;
import defpackage.tx5;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004J\n\u0010\u0012\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bÊ\u0001\u0002\b\u0014Ê\u0001\u0002\b\u0015¨\u0006\u0013"}, d2 = {"Lcom/sportybet/feature/loyalty/impl/bettingstreak/presentation/model/BettingStreakUpgradeHintUiModel;", "", "title", "", EventKeys.ERROR_MESSAGE, "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "getMessage", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "impl", "Landroidx/annotation/Keep;", "Landroidx/compose/runtime/Immutable;"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class BettingStreakUpgradeHintUiModel {
    public static final int $stable = 0;
    private final String message;
    private final String title;

    public /* synthetic */ BettingStreakUpgradeHintUiModel(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2);
    }

    public static /* synthetic */ BettingStreakUpgradeHintUiModel copy$default(BettingStreakUpgradeHintUiModel bettingStreakUpgradeHintUiModel, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = bettingStreakUpgradeHintUiModel.title;
        }
        if ((i & 2) != 0) {
            str2 = bettingStreakUpgradeHintUiModel.message;
        }
        return bettingStreakUpgradeHintUiModel.copy(str, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    public final BettingStreakUpgradeHintUiModel copy(String title, String message) {
        title.getClass();
        message.getClass();
        return new BettingStreakUpgradeHintUiModel(title, message);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BettingStreakUpgradeHintUiModel)) {
            return false;
        }
        BettingStreakUpgradeHintUiModel bettingStreakUpgradeHintUiModel = (BettingStreakUpgradeHintUiModel) other;
        return Intrinsics.g(this.title, bettingStreakUpgradeHintUiModel.title) && Intrinsics.g(this.message, bettingStreakUpgradeHintUiModel.message);
    }

    public final String getMessage() {
        return this.message;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.message.hashCode() + (this.title.hashCode() * 31);
    }

    public String toString() {
        return tx5.a("BettingStreakUpgradeHintUiModel(title=", this.title, ", message=", this.message, ")");
    }

    public BettingStreakUpgradeHintUiModel(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.title = str;
        this.message = str2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BettingStreakUpgradeHintUiModel() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
