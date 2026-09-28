package com.sporty.android.core.model.account.telegram;

import com.appsflyer.internal.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0014\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0012\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010\u0013\u001a\u00020\u0005HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0014"}, d2 = {"Lcom/sporty/android/core/model/account/telegram/TelegramBindingPreCheckBody;", "", "actionType", "", "userId", "", "<init>", "(ILjava/lang/String;)V", "getActionType", "()I", "getUserId", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class TelegramBindingPreCheckBody {
    private final int actionType;
    private final String userId;

    public TelegramBindingPreCheckBody(int i, String str) {
        str.getClass();
        this.actionType = i;
        this.userId = str;
    }

    public static /* synthetic */ TelegramBindingPreCheckBody copy$default(TelegramBindingPreCheckBody telegramBindingPreCheckBody, int i, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = telegramBindingPreCheckBody.actionType;
        }
        if ((i2 & 2) != 0) {
            str = telegramBindingPreCheckBody.userId;
        }
        return telegramBindingPreCheckBody.copy(i, str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getActionType() {
        return this.actionType;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    public final TelegramBindingPreCheckBody copy(int actionType, String userId) {
        userId.getClass();
        return new TelegramBindingPreCheckBody(actionType, userId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TelegramBindingPreCheckBody)) {
            return false;
        }
        TelegramBindingPreCheckBody telegramBindingPreCheckBody = (TelegramBindingPreCheckBody) other;
        return this.actionType == telegramBindingPreCheckBody.actionType && Intrinsics.g(this.userId, telegramBindingPreCheckBody.userId);
    }

    public final int getActionType() {
        return this.actionType;
    }

    public final String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        return this.userId.hashCode() + (Integer.hashCode(this.actionType) * 31);
    }

    public String toString() {
        return h.a(this.actionType, "TelegramBindingPreCheckBody(actionType=", ", userId=", this.userId, ")");
    }
}
