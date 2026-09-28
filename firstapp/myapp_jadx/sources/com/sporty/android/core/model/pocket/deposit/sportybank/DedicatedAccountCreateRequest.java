package com.sporty.android.core.model.pocket.deposit.sportybank;

import defpackage.nf;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J%\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0014\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0013\u001a\u00020\u0006HÖ\u0081\u0004J\n\u0010\u0014\u001a\u00020\u0003HÖ\u0081\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fÊ\u0001\u0002\b\u0016¨\u0006\u0015"}, d2 = {"Lcom/sporty/android/core/model/pocket/deposit/sportybank/DedicatedAccountCreateRequest;", "", "bvn", "", "bankIds", "", "", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "getBvn", "()Ljava/lang/String;", "getBankIds", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "model", "Landroidx/annotation/Keep;"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class DedicatedAccountCreateRequest {
    private final List<Integer> bankIds;
    private final String bvn;

    public DedicatedAccountCreateRequest(String str, List<Integer> list) {
        list.getClass();
        this.bvn = str;
        this.bankIds = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DedicatedAccountCreateRequest copy$default(DedicatedAccountCreateRequest dedicatedAccountCreateRequest, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = dedicatedAccountCreateRequest.bvn;
        }
        if ((i & 2) != 0) {
            list = dedicatedAccountCreateRequest.bankIds;
        }
        return dedicatedAccountCreateRequest.copy(str, list);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getBvn() {
        return this.bvn;
    }

    public final List<Integer> component2() {
        return this.bankIds;
    }

    public final DedicatedAccountCreateRequest copy(String bvn, List<Integer> bankIds) {
        bankIds.getClass();
        return new DedicatedAccountCreateRequest(bvn, bankIds);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DedicatedAccountCreateRequest)) {
            return false;
        }
        DedicatedAccountCreateRequest dedicatedAccountCreateRequest = (DedicatedAccountCreateRequest) other;
        return Intrinsics.g(this.bvn, dedicatedAccountCreateRequest.bvn) && Intrinsics.g(this.bankIds, dedicatedAccountCreateRequest.bankIds);
    }

    public final List<Integer> getBankIds() {
        return this.bankIds;
    }

    public final String getBvn() {
        return this.bvn;
    }

    public int hashCode() {
        String str = this.bvn;
        return this.bankIds.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public String toString() {
        return nf.b("DedicatedAccountCreateRequest(bvn=", this.bvn, ", bankIds=", ")", this.bankIds);
    }

    public /* synthetic */ DedicatedAccountCreateRequest(String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, list);
    }
}
