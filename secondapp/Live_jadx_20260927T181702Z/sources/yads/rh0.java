package yads;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class rh0 implements bo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f154962a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gi0 f154963b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f154964c;

    public rh0(String str, gi0 gi0Var, ArrayList arrayList) {
        this.f154962a = str;
        this.f154963b = gi0Var;
        this.f154964c = arrayList;
    }

    @Override // yads.m0
    public final String a() {
        return this.f154962a;
    }

    @Override // yads.bo
    public final List b() {
        return this.f154964c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rh0)) {
            return false;
        }
        rh0 rh0Var = (rh0) obj;
        return kotlin.jvm.internal.m0.g(this.f154962a, rh0Var.f154962a) && kotlin.jvm.internal.m0.g(this.f154963b, rh0Var.f154963b) && kotlin.jvm.internal.m0.g(this.f154964c, rh0Var.f154964c);
    }

    public final int hashCode() {
        return this.f154964c.hashCode() + ((this.f154963b.hashCode() + (this.f154962a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "DivKitAdtuneAction(actionType=" + this.f154962a + ", design=" + this.f154963b + ", trackingUrls=" + this.f154964c + gi.j.f86771d;
    }
}
