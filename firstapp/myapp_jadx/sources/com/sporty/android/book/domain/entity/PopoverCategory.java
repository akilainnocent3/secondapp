package com.sporty.android.book.domain.entity;

import defpackage.gmf0;
import defpackage.mq0;
import defpackage.ux5;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0014\u0010\u0012\u001a\u00020\u00062\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0014\u001a\u00020\u0015HÖ\u0081\u0004J\n\u0010\u0016\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rÊ\u0001\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\u0003\u0010\u0002¨\u0006\u0017"}, d2 = {"Lcom/sporty/android/book/domain/entity/PopoverCategory;", "", "key", "", "name", "value", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Z)V", "getKey", "()Ljava/lang/String;", "getName", "getValue", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "sportybook", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class PopoverCategory {
    public static final int $stable = 0;
    private final String key;
    private final String name;
    private final boolean value;

    public PopoverCategory(String str, String str2, boolean z) {
        str.getClass();
        str2.getClass();
        this.key = str;
        this.name = str2;
        this.value = z;
    }

    public static /* synthetic */ PopoverCategory copy$default(PopoverCategory popoverCategory, String str, String str2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = popoverCategory.key;
        }
        if ((i & 2) != 0) {
            str2 = popoverCategory.name;
        }
        if ((i & 4) != 0) {
            z = popoverCategory.value;
        }
        return popoverCategory.copy(str, str2, z);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getKey() {
        return this.key;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getValue() {
        return this.value;
    }

    public final PopoverCategory copy(String key, String name, boolean value) {
        key.getClass();
        name.getClass();
        return new PopoverCategory(key, name, value);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PopoverCategory)) {
            return false;
        }
        PopoverCategory popoverCategory = (PopoverCategory) other;
        return Intrinsics.g(this.key, popoverCategory.key) && Intrinsics.g(this.name, popoverCategory.name) && this.value == popoverCategory.value;
    }

    public final String getKey() {
        return this.key;
    }

    public final String getName() {
        return this.name;
    }

    public final boolean getValue() {
        return this.value;
    }

    public int hashCode() {
        return Boolean.hashCode(this.value) + gmf0.a(this.key.hashCode() * 31, 31, this.name);
    }

    public String toString() {
        String str = this.key;
        String str2 = this.name;
        return mq0.a(ux5.a("PopoverCategory(key=", str, ", name=", str2, ", value="), this.value, ")");
    }
}
