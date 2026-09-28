package com.sporty.android.core.model.common;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002B\u001b\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u000e\u0010\r\u001a\u00028\u0000HÆ\u0003¢\u0006\u0002\u0010\bJ\u0010\u0010\u000e\u001a\u0004\u0018\u00018\u0000HÆ\u0003¢\u0006\u0002\u0010\bJ*\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0003\u001a\u00028\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00018\u0000HÆ\u0001¢\u0006\u0002\u0010\u0010J\u0014\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÖ\u0083\u0004J\n\u0010\u0014\u001a\u00020\u0015HÖ\u0081\u0004J\n\u0010\u0016\u001a\u00020\u0017HÖ\u0081\u0004R\u0013\u0010\u0003\u001a\u00028\u0000¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u0015\u0010\u0004\u001a\u0004\u0018\u00018\u0000¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\n\u0010\bR\u0011\u0010\u000b\u001a\u00028\u00008F¢\u0006\u0006\u001a\u0004\b\f\u0010\b¨\u0006\u0018"}, d2 = {"Lcom/sporty/android/core/model/common/DataHolder;", "T", "", "primary", "active", "<init>", "(Ljava/lang/Object;Ljava/lang/Object;)V", "getPrimary", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getActive", "current", "getCurrent", "component1", "component2", "copy", "(Ljava/lang/Object;Ljava/lang/Object;)Lcom/sporty/android/core/model/common/DataHolder;", "equals", "", "other", "hashCode", "", "toString", "", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class DataHolder<T> {
    private final T active;
    private final T primary;

    public /* synthetic */ DataHolder(Object obj, Object obj2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, (i & 2) != 0 ? null : obj2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DataHolder copy$default(DataHolder dataHolder, Object obj, Object obj2, int i, Object obj3) {
        if ((i & 1) != 0) {
            obj = dataHolder.primary;
        }
        if ((i & 2) != 0) {
            obj2 = dataHolder.active;
        }
        return dataHolder.copy(obj, obj2);
    }

    public final T component1() {
        return this.primary;
    }

    public final T component2() {
        return this.active;
    }

    public final DataHolder<T> copy(T primary, T active) {
        return new DataHolder<>(primary, active);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DataHolder)) {
            return false;
        }
        DataHolder dataHolder = (DataHolder) other;
        return Intrinsics.g(this.primary, dataHolder.primary) && Intrinsics.g(this.active, dataHolder.active);
    }

    public final T getActive() {
        return this.active;
    }

    public final T getCurrent() {
        T t = this.active;
        return t == null ? this.primary : t;
    }

    public final T getPrimary() {
        return this.primary;
    }

    public int hashCode() {
        T t = this.primary;
        int iHashCode = (t == null ? 0 : t.hashCode()) * 31;
        T t2 = this.active;
        return iHashCode + (t2 != null ? t2.hashCode() : 0);
    }

    public String toString() {
        return "DataHolder(primary=" + this.primary + ", active=" + this.active + ")";
    }

    public DataHolder(T t, T t2) {
        this.primary = t;
        this.active = t2;
    }
}
