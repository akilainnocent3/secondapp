package yads;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class gu0 implements m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f149782a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f149783b;

    public gu0(String str, ArrayList arrayList) {
        this.f149782a = str;
        this.f149783b = arrayList;
    }

    @Override // yads.m0
    public final String a() {
        return this.f149782a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gu0)) {
            return false;
        }
        gu0 gu0Var = (gu0) obj;
        return kotlin.jvm.internal.m0.g(this.f149782a, gu0Var.f149782a) && kotlin.jvm.internal.m0.g(this.f149783b, gu0Var.f149783b);
    }

    public final int hashCode() {
        return this.f149783b.hashCode() + (this.f149782a.hashCode() * 31);
    }

    public final String toString() {
        return "FeedbackAction(actionType=" + this.f149782a + ", items=" + this.f149783b + gi.j.f86771d;
    }
}
