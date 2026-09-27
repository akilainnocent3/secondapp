package yads;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class ji0 implements ag0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v9 f151107a;

    public ji0(v9 v9Var) {
        this.f151107a = v9Var;
    }

    @Override // yads.ag0
    public final boolean a(Context context) {
        String str = this.f151107a.f156832k;
        eg0[] eg0VarArr = eg0.f148690b;
        return kotlin.jvm.internal.m0.g("divkit", str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ji0) && kotlin.jvm.internal.m0.g(this.f151107a, ((ji0) obj).f151107a);
    }

    public final int hashCode() {
        return this.f151107a.hashCode();
    }

    public final String toString() {
        return "DivKitDesignConstraint(adResponse=" + this.f151107a + gi.j.f86771d;
    }
}
