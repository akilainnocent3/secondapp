package com.sporty.android.core.model.pocket.common;

import defpackage.n36;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0013\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010\u0014\u001a\u00020\u0015HÖ\u0081\u0004R\u0017\u0010\u0002\u001a\u00020\u0003¢\u0006\u000e\n\u0000\u0012\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\u00020\u0003¢\u0006\u000e\n\u0000\u0012\u0004\b\u000b\u0010\b\u001a\u0004\b\f\u0010\nÊ\u0001\u0002\b\u0017¨\u0006\u0016"}, d2 = {"Lcom/sporty/android/core/model/pocket/common/SetBankAssetAsDefaultRequest;", "", "type", "", "action", "<init>", "(II)V", "getType$annotations", "()V", "getType", "()I", "getAction$annotations", "getAction", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "model", "Landroidx/annotation/Keep;"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class SetBankAssetAsDefaultRequest {
    private final int action;
    private final int type;

    public SetBankAssetAsDefaultRequest(int i, int i2) {
        this.type = i;
        this.action = i2;
    }

    public static /* synthetic */ SetBankAssetAsDefaultRequest copy$default(SetBankAssetAsDefaultRequest setBankAssetAsDefaultRequest, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = setBankAssetAsDefaultRequest.type;
        }
        if ((i3 & 2) != 0) {
            i2 = setBankAssetAsDefaultRequest.action;
        }
        return setBankAssetAsDefaultRequest.copy(i, i2);
    }

    public static /* synthetic */ void getAction$annotations() {
    }

    public static /* synthetic */ void getType$annotations() {
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getAction() {
        return this.action;
    }

    public final SetBankAssetAsDefaultRequest copy(int type, int action) {
        return new SetBankAssetAsDefaultRequest(type, action);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SetBankAssetAsDefaultRequest)) {
            return false;
        }
        SetBankAssetAsDefaultRequest setBankAssetAsDefaultRequest = (SetBankAssetAsDefaultRequest) other;
        return this.type == setBankAssetAsDefaultRequest.type && this.action == setBankAssetAsDefaultRequest.action;
    }

    public final int getAction() {
        return this.action;
    }

    public final int getType() {
        return this.type;
    }

    public int hashCode() {
        return Integer.hashCode(this.action) + (Integer.hashCode(this.type) * 31);
    }

    public String toString() {
        return n36.a("SetBankAssetAsDefaultRequest(type=", this.type, this.action, ", action=", ")");
    }
}
