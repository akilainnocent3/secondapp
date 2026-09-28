package com.sporty.android.core.model.pocket.withdraw.bvn;

import com.twilio.voice.EventKeys;
import defpackage.dy5;
import defpackage.gpp;
import defpackage.uf80;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0006HÆ\u0003J)\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0014\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001a\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010\u001b\u001a\u00020\u0006HÖ\u0081\u0004R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\n\"\u0004\b\u000e\u0010\fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u001c"}, d2 = {"Lcom/sporty/android/core/model/pocket/withdraw/bvn/BvnData;", "", "bvnState", "", "bizCode", EventKeys.ERROR_MESSAGE, "", "<init>", "(IILjava/lang/String;)V", "getBvnState", "()I", "setBvnState", "(I)V", "getBizCode", "setBizCode", "getMessage", "()Ljava/lang/String;", "setMessage", "(Ljava/lang/String;)V", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class BvnData {
    private int bizCode;
    private int bvnState;
    private String message;

    public BvnData(int i, int i2, String str) {
        this.bvnState = i;
        this.bizCode = i2;
        this.message = str;
    }

    public static /* synthetic */ BvnData copy$default(BvnData bvnData, int i, int i2, String str, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = bvnData.bvnState;
        }
        if ((i3 & 2) != 0) {
            i2 = bvnData.bizCode;
        }
        if ((i3 & 4) != 0) {
            str = bvnData.message;
        }
        return bvnData.copy(i, i2, str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getBvnState() {
        return this.bvnState;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getBizCode() {
        return this.bizCode;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    public final BvnData copy(int bvnState, int bizCode, String message) {
        return new BvnData(bvnState, bizCode, message);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BvnData)) {
            return false;
        }
        BvnData bvnData = (BvnData) other;
        return this.bvnState == bvnData.bvnState && this.bizCode == bvnData.bizCode && Intrinsics.g(this.message, bvnData.message);
    }

    public final int getBizCode() {
        return this.bizCode;
    }

    public final int getBvnState() {
        return this.bvnState;
    }

    public final String getMessage() {
        return this.message;
    }

    public int hashCode() {
        int iA = gpp.a(this.bizCode, Integer.hashCode(this.bvnState) * 31, 31);
        String str = this.message;
        return iA + (str == null ? 0 : str.hashCode());
    }

    public final void setBizCode(int i) {
        this.bizCode = i;
    }

    public final void setBvnState(int i) {
        this.bvnState = i;
    }

    public final void setMessage(String str) {
        this.message = str;
    }

    public String toString() {
        int i = this.bvnState;
        int i2 = this.bizCode;
        return uf80.a(dy5.a("BvnData(bvnState=", i, i2, ", bizCode=", ", message="), this.message, ")");
    }
}
