package com.unity3d.ads.injection;

import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.x;
import ns.d;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class EntryKey {

    @l
    private final d<?> instanceClass;

    @l
    private final String named;

    public EntryKey(@l String named, @l d<?> instanceClass) {
        m0.p(named, "named");
        m0.p(instanceClass, "instanceClass");
        this.named = named;
        this.instanceClass = instanceClass;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ EntryKey copy$default(EntryKey entryKey, String str, d dVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = entryKey.named;
        }
        if ((i10 & 2) != 0) {
            dVar = entryKey.instanceClass;
        }
        return entryKey.copy(str, dVar);
    }

    @l
    public final String component1() {
        return this.named;
    }

    @l
    public final d<?> component2() {
        return this.instanceClass;
    }

    @l
    public final EntryKey copy(@l String named, @l d<?> instanceClass) {
        m0.p(named, "named");
        m0.p(instanceClass, "instanceClass");
        return new EntryKey(named, instanceClass);
    }

    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EntryKey)) {
            return false;
        }
        EntryKey entryKey = (EntryKey) obj;
        return m0.g(this.named, entryKey.named) && m0.g(this.instanceClass, entryKey.instanceClass);
    }

    @l
    public final d<?> getInstanceClass() {
        return this.instanceClass;
    }

    @l
    public final String getNamed() {
        return this.named;
    }

    public int hashCode() {
        return (this.named.hashCode() * 31) + this.instanceClass.hashCode();
    }

    @l
    public String toString() {
        return "EntryKey(named=" + this.named + ", instanceClass=" + this.instanceClass + ')';
    }

    public /* synthetic */ EntryKey(String str, d dVar, int i10, x xVar) {
        this((i10 & 1) != 0 ? "" : str, dVar);
    }
}
