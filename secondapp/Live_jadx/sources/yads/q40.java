package yads;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class q40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f154255a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f154256b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f154257c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f154258d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f154259e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p40 f154260f;

    public q40(String str, String str2, ArrayList arrayList, String str3, String str4, p40 p40Var) {
        this.f154255a = str;
        this.f154256b = str2;
        this.f154257c = arrayList;
        this.f154258d = str3;
        this.f154259e = str4;
        this.f154260f = p40Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q40)) {
            return false;
        }
        q40 q40Var = (q40) obj;
        return kotlin.jvm.internal.m0.g(this.f154255a, q40Var.f154255a) && kotlin.jvm.internal.m0.g(this.f154256b, q40Var.f154256b) && kotlin.jvm.internal.m0.g(this.f154257c, q40Var.f154257c) && kotlin.jvm.internal.m0.g(this.f154258d, q40Var.f154258d) && kotlin.jvm.internal.m0.g(this.f154259e, q40Var.f154259e) && kotlin.jvm.internal.m0.g(this.f154260f, q40Var.f154260f);
    }

    public final int hashCode() {
        String str = this.f154255a;
        int iA = eb.a(this.f154257c, k4.a(this.f154256b, (str == null ? 0 : str.hashCode()) * 31, 31), 31);
        String str2 = this.f154258d;
        int iHashCode = (iA + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f154259e;
        return this.f154260f.hashCode() + ((iHashCode + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "DebugPanelAdUnitMediationAdapterData(logoUrl=" + this.f154255a + ", adapterName=" + this.f154256b + ", parameters=" + this.f154257c + ", adUnitId=" + this.f154258d + ", networkAdUnitIdName=" + this.f154259e + ", type=" + this.f154260f + gi.j.f86771d;
    }
}
