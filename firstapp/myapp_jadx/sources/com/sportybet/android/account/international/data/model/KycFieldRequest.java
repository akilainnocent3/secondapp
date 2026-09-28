package com.sportybet.android.account.international.data.model;

import defpackage.m2g;
import defpackage.pe4;
import defpackage.q8a0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.b;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u000e0\r2\u0006\u0010\u000f\u001a\u00020\u0010J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0014\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0017\u001a\u00020\u0010HÖ\u0081\u0004J\n\u0010\u0018\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bÊ\u0001\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\u0003\u0010\u0000¨\u0006\u0019"}, d2 = {"Lcom/sportybet/android/account/international/data/model/KycFieldRequest;", "", "requirementId", "", "data", "Lcom/sportybet/android/account/international/data/model/KycFieldRequestData;", "<init>", "(Ljava/lang/String;Lcom/sportybet/android/account/international/data/model/KycFieldRequestData;)V", "getRequirementId", "()Ljava/lang/String;", "getData", "()Lcom/sportybet/android/account/international/data/model/KycFieldRequestData;", "toFormUrlEncodedMap", "", "Lkotlin/Pair;", "index", "", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "africa-bet-android", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class KycFieldRequest {
    public static final int $stable = 8;
    private final KycFieldRequestData data;
    private final String requirementId;

    public KycFieldRequest(String str, KycFieldRequestData kycFieldRequestData) {
        str.getClass();
        kycFieldRequestData.getClass();
        this.requirementId = str;
        this.data = kycFieldRequestData;
    }

    public static /* synthetic */ KycFieldRequest copy$default(KycFieldRequest kycFieldRequest, String str, KycFieldRequestData kycFieldRequestData, int i, Object obj) {
        if ((i & 1) != 0) {
            str = kycFieldRequest.requirementId;
        }
        if ((i & 2) != 0) {
            kycFieldRequestData = kycFieldRequest.data;
        }
        return kycFieldRequest.copy(str, kycFieldRequestData);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getRequirementId() {
        return this.requirementId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final KycFieldRequestData getData() {
        return this.data;
    }

    public final KycFieldRequest copy(String requirementId, KycFieldRequestData data) {
        requirementId.getClass();
        data.getClass();
        return new KycFieldRequest(requirementId, data);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof KycFieldRequest)) {
            return false;
        }
        KycFieldRequest kycFieldRequest = (KycFieldRequest) other;
        return Intrinsics.g(this.requirementId, kycFieldRequest.requirementId) && Intrinsics.g(this.data, kycFieldRequest.data);
    }

    public final KycFieldRequestData getData() {
        return this.data;
    }

    public final String getRequirementId() {
        return this.requirementId;
    }

    public int hashCode() {
        return this.data.hashCode() + (this.requirementId.hashCode() * 31);
    }

    public final List<Pair<String, String>> toFormUrlEncodedMap(int index) {
        if (this.data.isEmpty()) {
            return m2g.a;
        }
        q8a0 q8a0Var = new q8a0();
        ArrayList arrayList = (ArrayList) q8a0Var.a;
        arrayList.add(new Pair(pe4.b(index, "kyc[", "].requirementId"), this.requirementId));
        q8a0Var.a(this.data.toFormUrlEncodedMap(index).toArray(new Pair[0]));
        return b.k(arrayList.toArray(new Pair[arrayList.size()]));
    }

    public String toString() {
        return "KycFieldRequest(requirementId=" + this.requirementId + ", data=" + this.data + ")";
    }
}
