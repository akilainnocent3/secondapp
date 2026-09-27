package yads;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class rc implements bo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f154861a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f154862b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f154863c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f154864d;

    public rc(String str, String str2, String str3, ArrayList arrayList) {
        this.f154861a = str;
        this.f154862b = str2;
        this.f154863c = str3;
        this.f154864d = arrayList;
    }

    @Override // yads.m0
    public final String a() {
        return this.f154861a;
    }

    @Override // yads.bo
    public final List b() {
        return this.f154864d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rc)) {
            return false;
        }
        rc rcVar = (rc) obj;
        return kotlin.jvm.internal.m0.g(this.f154861a, rcVar.f154861a) && kotlin.jvm.internal.m0.g(this.f154862b, rcVar.f154862b) && kotlin.jvm.internal.m0.g(this.f154863c, rcVar.f154863c) && kotlin.jvm.internal.m0.g(this.f154864d, rcVar.f154864d);
    }

    public final int hashCode() {
        return this.f154864d.hashCode() + k4.a(this.f154863c, k4.a(this.f154862b, this.f154861a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        return "AdtuneAction(actionType=" + this.f154861a + ", adtuneUrl=" + this.f154862b + ", optOutUrl=" + this.f154863c + ", trackingUrls=" + this.f154864d + gi.j.f86771d;
    }
}
