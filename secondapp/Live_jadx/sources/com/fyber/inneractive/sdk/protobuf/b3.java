package com.fyber.inneractive.sdk.protobuf;

import com.ironsource.C4235d4;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class b3 implements Map.Entry, Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Comparable f47439a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f47440b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e3 f47441c;

    public b3(e3 e3Var, Map.Entry entry) {
        Comparable comparable = (Comparable) entry.getKey();
        Object value = entry.getValue();
        this.f47441c = e3Var;
        this.f47439a = comparable;
        this.f47440b = value;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f47439a.compareTo(((b3) obj).f47439a);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        boolean zEquals;
        boolean zEquals2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Comparable comparable = this.f47439a;
        Object key = entry.getKey();
        if (comparable == null) {
            zEquals = key == null;
        } else {
            zEquals = comparable.equals(key);
        }
        if (zEquals) {
            Object obj2 = this.f47440b;
            Object value = entry.getValue();
            if (obj2 == null) {
                zEquals2 = value == null;
            } else {
                zEquals2 = obj2.equals(value);
            }
            if (zEquals2) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f47439a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f47440b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.f47439a;
        int iHashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f47440b;
        return iHashCode ^ (obj != null ? obj.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.f47441c.a();
        Object obj2 = this.f47440b;
        this.f47440b = obj;
        return obj2;
    }

    public final String toString() {
        return this.f47439a + C4235d4.j.f61456b + this.f47440b;
    }

    public b3(e3 e3Var, Comparable comparable, Object obj) {
        this.f47441c = e3Var;
        this.f47439a = comparable;
        this.f47440b = obj;
    }
}
