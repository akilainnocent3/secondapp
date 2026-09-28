package com.sporty.android.core.model.config.bo;

import com.appsflyer.internal.p;
import com.sporty.android.core.model.config.bo.ext.BOConfigIdExtKt;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\t\u001a\u0004\u0018\u0001H\n\"\u0006\b\u0000\u0010\n\u0018\u00012\u0006\u0010\u000b\u001a\u00020\fH\u0086\b¢\u0006\u0002\u0010\rJ\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000f\u001a\u00020\fJ\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\u0011\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0014\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0015\u001a\u00020\u0016HÖ\u0081\u0004J\n\u0010\u0017\u001a\u00020\u0018HÖ\u0081\u0004R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0019"}, d2 = {"Lcom/sporty/android/core/model/config/bo/BOConfigValueBundle;", "", "boConfigValueWrappers", "", "Lcom/sporty/android/core/model/config/bo/BOConfigValueWrapper;", "<init>", "(Ljava/util/List;)V", "getBoConfigValueWrappers", "()Ljava/util/List;", "getConfigValue", "T", "parameter", "Lcom/sporty/android/core/model/config/bo/BOConfigId;", "(Lcom/sporty/android/core/model/config/bo/BOConfigId;)Ljava/lang/Object;", "getResponse", "matcher", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class BOConfigValueBundle {
    private final List<BOConfigValueWrapper> boConfigValueWrappers;

    public BOConfigValueBundle(List<BOConfigValueWrapper> list) {
        list.getClass();
        this.boConfigValueWrappers = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BOConfigValueBundle copy$default(BOConfigValueBundle bOConfigValueBundle, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = bOConfigValueBundle.boConfigValueWrappers;
        }
        return bOConfigValueBundle.copy(list);
    }

    public final List<BOConfigValueWrapper> component1() {
        return this.boConfigValueWrappers;
    }

    public final BOConfigValueBundle copy(List<BOConfigValueWrapper> boConfigValueWrappers) {
        boConfigValueWrappers.getClass();
        return new BOConfigValueBundle(boConfigValueWrappers);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof BOConfigValueBundle) && Intrinsics.g(this.boConfigValueWrappers, ((BOConfigValueBundle) other).boConfigValueWrappers);
    }

    public final List<BOConfigValueWrapper> getBoConfigValueWrappers() {
        return this.boConfigValueWrappers;
    }

    public final <T> T getConfigValue(BOConfigId parameter) {
        parameter.getClass();
        BOConfigValueWrapper response = getResponse(parameter);
        if (response != null) {
            response.getConfigValue();
        }
        Intrinsics.m();
        throw null;
    }

    public final BOConfigValueWrapper getResponse(BOConfigId matcher) {
        Object next;
        matcher.getClass();
        Iterator<T> it = this.boConfigValueWrappers.iterator();
        while (it.hasNext()) {
            next = it.next();
            if (BOConfigIdExtKt.isMatch((BOConfigValueWrapper) next, matcher)) {
                return (BOConfigValueWrapper) next;
            }
        }
        next = null;
        return (BOConfigValueWrapper) next;
    }

    public int hashCode() {
        return this.boConfigValueWrappers.hashCode();
    }

    public String toString() {
        return p.a("BOConfigValueBundle(boConfigValueWrappers=", ")", this.boConfigValueWrappers);
    }
}
