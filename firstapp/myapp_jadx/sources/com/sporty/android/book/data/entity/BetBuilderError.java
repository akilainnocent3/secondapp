package com.sporty.android.book.data.entity;

import com.twilio.voice.EventKeys;
import defpackage.d830;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0014\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0083\u0004J\n\u0010\u0013\u001a\u00020\u0005HÖ\u0081\u0004J\n\u0010\u0014\u001a\u00020\u0003HÖ\u0081\u0004R\u0015\u0010\u0002\u001a\u00020\u0003X\u0096\u0084\b¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bÊ\u0001\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\u0003\u0010\u0000¨\u0006\u0016"}, d2 = {"Lcom/sporty/android/book/data/entity/BetBuilderError;", "", EventKeys.ERROR_MESSAGE, "", EventKeys.ERROR_CODE, "", "<init>", "(Ljava/lang/String;I)V", "getMessage", "()Ljava/lang/String;", "getCode", "()I", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "Companion", "sportybook", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class BetBuilderError extends Throwable {
    public static final int ODDS_LIMIT_EXCEEDED = 4720;
    public static final int SELECTIONS_LIMIT_EXCEEDED = 4710;
    private final int code;
    private final String message;
    public static final int $stable = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BetBuilderError(String str, int i) {
        super(str);
        str.getClass();
        this.message = str;
        this.code = i;
    }

    public static /* synthetic */ BetBuilderError copy$default(BetBuilderError betBuilderError, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = betBuilderError.message;
        }
        if ((i2 & 2) != 0) {
            i = betBuilderError.code;
        }
        return betBuilderError.copy(str, i);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getCode() {
        return this.code;
    }

    public final BetBuilderError copy(String message, int code) {
        message.getClass();
        return new BetBuilderError(message, code);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BetBuilderError)) {
            return false;
        }
        BetBuilderError betBuilderError = (BetBuilderError) other;
        return Intrinsics.g(this.message, betBuilderError.message) && this.code == betBuilderError.code;
    }

    public final int getCode() {
        return this.code;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.message;
    }

    public int hashCode() {
        return Integer.hashCode(this.code) + (this.message.hashCode() * 31);
    }

    @Override // java.lang.Throwable
    public String toString() {
        return d830.a(this.code, "BetBuilderError(message=", this.message, ", code=", ")");
    }
}
