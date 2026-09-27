package yads;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
@zv.b0
public final class j80 {

    @oy.l
    public static final i80 Companion = new i80();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final zv.j[] f150962h = {null, null, null, null, new dw.f(e50.f148504a), new dw.f(c40.f147555a), new dw.f(e80.f148565a)};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f150963a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f150964b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f150965c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f150966d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f150967e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List f150968f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f150969g;

    public /* synthetic */ j80(int i10, String str, String str2, String str3, String str4, List list, List list2, List list3) {
        if (64 != (i10 & 64)) {
            dw.g2.b(i10, 64, h80.f149968a.getDescriptor());
        }
        if ((i10 & 1) == 0) {
            this.f150963a = null;
        } else {
            this.f150963a = str;
        }
        if ((i10 & 2) == 0) {
            this.f150964b = null;
        } else {
            this.f150964b = str2;
        }
        if ((i10 & 4) == 0) {
            this.f150965c = null;
        } else {
            this.f150965c = str3;
        }
        if ((i10 & 8) == 0) {
            this.f150966d = null;
        } else {
            this.f150966d = str4;
        }
        if ((i10 & 16) == 0) {
            this.f150967e = null;
        } else {
            this.f150967e = list;
        }
        if ((i10 & 32) == 0) {
            this.f150968f = null;
        } else {
            this.f150968f = list2;
        }
        this.f150969g = list3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j80)) {
            return false;
        }
        j80 j80Var = (j80) obj;
        return kotlin.jvm.internal.m0.g(this.f150963a, j80Var.f150963a) && kotlin.jvm.internal.m0.g(this.f150964b, j80Var.f150964b) && kotlin.jvm.internal.m0.g(this.f150965c, j80Var.f150965c) && kotlin.jvm.internal.m0.g(this.f150966d, j80Var.f150966d) && kotlin.jvm.internal.m0.g(this.f150967e, j80Var.f150967e) && kotlin.jvm.internal.m0.g(this.f150968f, j80Var.f150968f) && kotlin.jvm.internal.m0.g(this.f150969g, j80Var.f150969g);
    }

    public final int hashCode() {
        String str = this.f150963a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f150964b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f150965c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f150966d;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        List list = this.f150967e;
        int iHashCode5 = (iHashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.f150968f;
        return this.f150969g.hashCode() + ((iHashCode5 + (list2 != null ? list2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "DebugPanelRemoteData(pageId=" + this.f150963a + ", latestSdkVersion=" + this.f150964b + ", appAdsTxtUrl=" + this.f150965c + ", appStatus=" + this.f150966d + ", alerts=" + this.f150967e + ", adUnits=" + this.f150968f + ", mediationNetworks=" + this.f150969g + gi.j.f86771d;
    }
}
