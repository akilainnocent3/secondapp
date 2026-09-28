package com.sporty.android.core.model.realsports.liabilitycheck;

import java.util.Collection;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0003J)\u0010\u000e\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0001J\u0014\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0012\u001a\u00020\u0013HÖ\u0081\u0004J\n\u0010\u0014\u001a\u00020\u0015HÖ\u0081\u0004R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nÊ\u0001\u0002\b\u0017¨\u0006\u0016"}, d2 = {"Lcom/sporty/android/core/model/realsports/liabilitycheck/LiabilityCheckRequest;", "", "selections", "", "Lcom/sporty/android/core/model/realsports/liabilitycheck/LiabilityCheckDto;", "liabilityCheckProcessors", "Lcom/sporty/android/core/model/realsports/liabilitycheck/LiabilityCheckProcessor;", "<init>", "(Ljava/util/Collection;Ljava/util/Collection;)V", "getSelections", "()Ljava/util/Collection;", "getLiabilityCheckProcessors", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "model", "Landroidx/annotation/Keep;"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class LiabilityCheckRequest {
    private final Collection<LiabilityCheckProcessor> liabilityCheckProcessors;
    private final Collection<LiabilityCheckDto> selections;

    /* JADX WARN: Multi-variable type inference failed */
    public LiabilityCheckRequest(Collection<LiabilityCheckDto> collection, Collection<? extends LiabilityCheckProcessor> collection2) {
        collection.getClass();
        collection2.getClass();
        this.selections = collection;
        this.liabilityCheckProcessors = collection2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LiabilityCheckRequest copy$default(LiabilityCheckRequest liabilityCheckRequest, Collection collection, Collection collection2, int i, Object obj) {
        if ((i & 1) != 0) {
            collection = liabilityCheckRequest.selections;
        }
        if ((i & 2) != 0) {
            collection2 = liabilityCheckRequest.liabilityCheckProcessors;
        }
        return liabilityCheckRequest.copy(collection, collection2);
    }

    public final Collection<LiabilityCheckDto> component1() {
        return this.selections;
    }

    public final Collection<LiabilityCheckProcessor> component2() {
        return this.liabilityCheckProcessors;
    }

    public final LiabilityCheckRequest copy(Collection<LiabilityCheckDto> selections, Collection<? extends LiabilityCheckProcessor> liabilityCheckProcessors) {
        selections.getClass();
        liabilityCheckProcessors.getClass();
        return new LiabilityCheckRequest(selections, liabilityCheckProcessors);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LiabilityCheckRequest)) {
            return false;
        }
        LiabilityCheckRequest liabilityCheckRequest = (LiabilityCheckRequest) other;
        return Intrinsics.g(this.selections, liabilityCheckRequest.selections) && Intrinsics.g(this.liabilityCheckProcessors, liabilityCheckRequest.liabilityCheckProcessors);
    }

    public final Collection<LiabilityCheckProcessor> getLiabilityCheckProcessors() {
        return this.liabilityCheckProcessors;
    }

    public final Collection<LiabilityCheckDto> getSelections() {
        return this.selections;
    }

    public int hashCode() {
        return this.liabilityCheckProcessors.hashCode() + (this.selections.hashCode() * 31);
    }

    public String toString() {
        return "LiabilityCheckRequest(selections=" + this.selections + ", liabilityCheckProcessors=" + this.liabilityCheckProcessors + ")";
    }

    public /* synthetic */ LiabilityCheckRequest(Collection collection, Collection collection2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(collection, (i & 2) != 0 ? LiabilityCheckProcessor.getEntries() : collection2);
    }
}
