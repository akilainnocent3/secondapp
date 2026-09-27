package kotlin.jvm.internal;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
@dr.l1(version = "1.7")
public class d0 extends h0 implements Serializable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Class f102720c;

    public d0(Class cls) {
        super(1);
        this.f102720c = cls;
    }

    @Override // kotlin.jvm.internal.h0
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof d0) {
            return this.f102720c.equals(((d0) obj).f102720c);
        }
        return false;
    }

    @Override // kotlin.jvm.internal.h0
    public int hashCode() {
        return this.f102720c.hashCode();
    }

    @Override // kotlin.jvm.internal.h0
    public String toString() {
        return "fun interface " + this.f102720c.getName();
    }

    @Override // kotlin.jvm.internal.h0, kotlin.jvm.internal.r
    public ns.i getReflected() {
        throw new UnsupportedOperationException("Functional interface constructor does not support reflection");
    }
}
