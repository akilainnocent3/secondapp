package com.sporty.android.sportytv.data;

import defpackage.aya;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00028\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\b\u001a\u00028\u0000HÆ\u0003¢\u0006\u0002\u0010\u0006J\u001e\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0003\u001a\u00028\u0000HÆ\u0001¢\u0006\u0002\u0010\nJ\u0014\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0002HÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0013\u0010\u0003\u001a\u00028\u0000¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0003\u0010\u0006Ê\u0001\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\u0003\u0010\u0002¨\u0006\u0012"}, d2 = {"Lcom/sporty/android/sportytv/data/SportyTvDataStoreData;", "T", "", "isTrue", "<init>", "(Ljava/lang/Object;)V", "()Ljava/lang/Object;", "Ljava/lang/Object;", "component1", "copy", "(Ljava/lang/Object;)Lcom/sporty/android/sportytv/data/SportyTvDataStoreData;", "equals", "", "other", "hashCode", "", "toString", "", "sportyMedia", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class SportyTvDataStoreData<T> {
    public static final int $stable = 0;
    private final T isTrue;

    public SportyTvDataStoreData(T t) {
        this.isTrue = t;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SportyTvDataStoreData copy$default(SportyTvDataStoreData sportyTvDataStoreData, Object obj, int i, Object obj2) {
        if ((i & 1) != 0) {
            obj = sportyTvDataStoreData.isTrue;
        }
        return sportyTvDataStoreData.copy(obj);
    }

    public final T component1() {
        return this.isTrue;
    }

    public final SportyTvDataStoreData<T> copy(T isTrue) {
        return new SportyTvDataStoreData<>(isTrue);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof SportyTvDataStoreData) && Intrinsics.g(this.isTrue, ((SportyTvDataStoreData) other).isTrue);
    }

    public int hashCode() {
        T t = this.isTrue;
        if (t == null) {
            return 0;
        }
        return t.hashCode();
    }

    public final T isTrue() {
        return this.isTrue;
    }

    public String toString() {
        return aya.b(this.isTrue, "SportyTvDataStoreData(isTrue=", ")");
    }
}
