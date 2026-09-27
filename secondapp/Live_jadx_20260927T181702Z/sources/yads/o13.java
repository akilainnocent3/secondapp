package yads;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class o13 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f153306a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f153307b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f153308c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f153309d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final dm f153310e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final g13 f153311f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f153312g;

    public o13(String str, String str2, String str3, String str4, dm dmVar, g13 g13Var, ArrayList arrayList) {
        this.f153306a = str;
        this.f153307b = str2;
        this.f153308c = str3;
        this.f153309d = str4;
        this.f153310e = dmVar;
        this.f153311f = g13Var;
        this.f153312g = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o13)) {
            return false;
        }
        o13 o13Var = (o13) obj;
        return kotlin.jvm.internal.m0.g(this.f153306a, o13Var.f153306a) && kotlin.jvm.internal.m0.g(this.f153307b, o13Var.f153307b) && kotlin.jvm.internal.m0.g(this.f153308c, o13Var.f153308c) && kotlin.jvm.internal.m0.g(this.f153309d, o13Var.f153309d) && kotlin.jvm.internal.m0.g(this.f153310e, o13Var.f153310e) && kotlin.jvm.internal.m0.g(this.f153311f, o13Var.f153311f) && kotlin.jvm.internal.m0.g(this.f153312g, o13Var.f153312g);
    }

    public final int hashCode() {
        String str = this.f153306a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f153307b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f153308c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f153309d;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        dm dmVar = this.f153310e;
        int iHashCode5 = (iHashCode4 + (dmVar == null ? 0 : dmVar.hashCode())) * 31;
        g13 g13Var = this.f153311f;
        int iHashCode6 = (iHashCode5 + (g13Var == null ? 0 : g13Var.hashCode())) * 31;
        List list = this.f153312g;
        return iHashCode6 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return "SmartCenterSettings(colorWizButton=" + this.f153306a + ", colorWizButtonText=" + this.f153307b + ", colorWizBack=" + this.f153308c + ", colorWizBackRight=" + this.f153309d + ", backgroundColors=" + this.f153310e + ", smartCenter=" + this.f153311f + ", smartCenters=" + this.f153312g + gi.j.f86771d;
    }
}
