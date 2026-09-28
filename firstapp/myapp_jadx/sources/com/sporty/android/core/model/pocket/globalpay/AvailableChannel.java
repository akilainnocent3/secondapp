package com.sporty.android.core.model.pocket.globalpay;

import com.appsflyer.internal.p;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\u000b\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0014\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u000f\u001a\u00020\u0010HÖ\u0081\u0004J\n\u0010\u0011\u001a\u00020\u0012HÖ\u0081\u0004R \u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\u0006¨\u0006\u0013"}, d2 = {"Lcom/sporty/android/core/model/pocket/globalpay/AvailableChannel;", "", "types", "", "Lcom/sporty/android/core/model/pocket/globalpay/TypeData;", "<init>", "(Ljava/util/List;)V", "getTypes", "()Ljava/util/List;", "setTypes", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class AvailableChannel {
    private List<TypeData> types;

    public AvailableChannel(List<TypeData> list) {
        list.getClass();
        this.types = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AvailableChannel copy$default(AvailableChannel availableChannel, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = availableChannel.types;
        }
        return availableChannel.copy(list);
    }

    public final List<TypeData> component1() {
        return this.types;
    }

    public final AvailableChannel copy(List<TypeData> types) {
        types.getClass();
        return new AvailableChannel(types);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof AvailableChannel) && Intrinsics.g(this.types, ((AvailableChannel) other).types);
    }

    public final List<TypeData> getTypes() {
        return this.types;
    }

    public int hashCode() {
        return this.types.hashCode();
    }

    public final void setTypes(List<TypeData> list) {
        list.getClass();
        this.types = list;
    }

    public String toString() {
        return p.a("AvailableChannel(types=", ")", this.types);
    }
}
