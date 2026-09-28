package com.sporty.android.core.model.pocket.common;

import defpackage.dy5;
import defpackage.gpp;
import defpackage.ng1;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006HÆ\u0003J-\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006HÆ\u0001J\u0014\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0018\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010\u0019\u001a\u00020\u001aHÖ\u0081\u0004R\u0017\u0010\u0002\u001a\u00020\u0003¢\u0006\u000e\n\u0000\u0012\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0004\u001a\u00020\u0003¢\u0006\u000e\n\u0000\u0012\u0004\b\r\u0010\n\u001a\u0004\b\u000e\u0010\fR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010Ê\u0001\u0002\b\u001c¨\u0006\u001b"}, d2 = {"Lcom/sporty/android/core/model/pocket/common/SetBankAssetIdOrderRequest;", "", "type", "", "action", "assetIdOrder", "", "<init>", "(IILjava/util/List;)V", "getType$annotations", "()V", "getType", "()I", "getAction$annotations", "getAction", "getAssetIdOrder", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "model", "Landroidx/annotation/Keep;"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class SetBankAssetIdOrderRequest {
    private final int action;
    private final List<Integer> assetIdOrder;
    private final int type;

    public SetBankAssetIdOrderRequest(int i, int i2, List<Integer> list) {
        list.getClass();
        this.type = i;
        this.action = i2;
        this.assetIdOrder = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SetBankAssetIdOrderRequest copy$default(SetBankAssetIdOrderRequest setBankAssetIdOrderRequest, int i, int i2, List list, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = setBankAssetIdOrderRequest.type;
        }
        if ((i3 & 2) != 0) {
            i2 = setBankAssetIdOrderRequest.action;
        }
        if ((i3 & 4) != 0) {
            list = setBankAssetIdOrderRequest.assetIdOrder;
        }
        return setBankAssetIdOrderRequest.copy(i, i2, list);
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

    public final List<Integer> component3() {
        return this.assetIdOrder;
    }

    public final SetBankAssetIdOrderRequest copy(int type, int action, List<Integer> assetIdOrder) {
        assetIdOrder.getClass();
        return new SetBankAssetIdOrderRequest(type, action, assetIdOrder);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SetBankAssetIdOrderRequest)) {
            return false;
        }
        SetBankAssetIdOrderRequest setBankAssetIdOrderRequest = (SetBankAssetIdOrderRequest) other;
        return this.type == setBankAssetIdOrderRequest.type && this.action == setBankAssetIdOrderRequest.action && Intrinsics.g(this.assetIdOrder, setBankAssetIdOrderRequest.assetIdOrder);
    }

    public final int getAction() {
        return this.action;
    }

    public final List<Integer> getAssetIdOrder() {
        return this.assetIdOrder;
    }

    public final int getType() {
        return this.type;
    }

    public int hashCode() {
        return this.assetIdOrder.hashCode() + gpp.a(this.action, Integer.hashCode(this.type) * 31, 31);
    }

    public String toString() {
        int i = this.type;
        int i2 = this.action;
        return ng1.a(dy5.a("SetBankAssetIdOrderRequest(type=", i, i2, ", action=", ", assetIdOrder="), this.assetIdOrder, ")");
    }
}
