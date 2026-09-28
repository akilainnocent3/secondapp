package com.sporty.android.core.model.account;

import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.twilio.voice.EventKeys;
import defpackage.d830;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0014\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0012\u001a\u00020\u0005HÖ\u0081\u0004J\n\u0010\u0013\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0014"}, d2 = {"Lcom/sporty/android/core/model/account/BVNStatus;", "", EventKeys.ERROR_MESSAGE, "", AnalyticsParam.EVENT_PARAM_RESULT, "", "<init>", "(Ljava/lang/String;I)V", "getMessage", "()Ljava/lang/String;", "getResult", "()I", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class BVNStatus {
    private final String message;
    private final int result;

    public BVNStatus(String str, int i) {
        str.getClass();
        this.message = str;
        this.result = i;
    }

    public static /* synthetic */ BVNStatus copy$default(BVNStatus bVNStatus, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = bVNStatus.message;
        }
        if ((i2 & 2) != 0) {
            i = bVNStatus.result;
        }
        return bVNStatus.copy(str, i);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getResult() {
        return this.result;
    }

    public final BVNStatus copy(String message, int result) {
        message.getClass();
        return new BVNStatus(message, result);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BVNStatus)) {
            return false;
        }
        BVNStatus bVNStatus = (BVNStatus) other;
        return Intrinsics.g(this.message, bVNStatus.message) && this.result == bVNStatus.result;
    }

    public final String getMessage() {
        return this.message;
    }

    public final int getResult() {
        return this.result;
    }

    public int hashCode() {
        return Integer.hashCode(this.result) + (this.message.hashCode() * 31);
    }

    public String toString() {
        return d830.a(this.result, "BVNStatus(message=", this.message, ", result=", ")");
    }
}
