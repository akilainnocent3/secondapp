package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class wt5 {
    public final LinkedHashSet a;
    public final ArrayList b;
    public final ArrayList c;
    public final ArrayList d;
    public final ArrayList e;
    public final g8e0 f;
    public final pnh0 g;
    public final HashMap h;
    public final l8e0 i;
    public final l8e0 j;

    public wt5(LinkedHashSet linkedHashSet, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, g8e0 g8e0Var, pnh0 pnh0Var, HashMap map, l8e0 l8e0Var, l8e0 l8e0Var2) {
        l8e0Var.getClass();
        this.a = linkedHashSet;
        this.b = arrayList;
        this.c = arrayList2;
        this.d = arrayList3;
        this.e = arrayList4;
        this.f = g8e0Var;
        this.g = pnh0Var;
        this.h = map;
        this.i = l8e0Var;
        this.j = l8e0Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wt5)) {
            return false;
        }
        wt5 wt5Var = (wt5) obj;
        return this.a.equals(wt5Var.a) && this.b.equals(wt5Var.b) && this.c.equals(wt5Var.c) && this.d.equals(wt5Var.d) && this.e.equals(wt5Var.e) && Intrinsics.g(this.f, wt5Var.f) && Intrinsics.g(this.g, wt5Var.g) && this.h.equals(wt5Var.h) && Intrinsics.g(this.i, wt5Var.i) && Intrinsics.g(this.j, wt5Var.j);
    }

    public final int hashCode() {
        int iA = vt5.a(this.e, vt5.a(this.d, vt5.a(this.c, vt5.a(this.b, this.a.hashCode() * 31, 31), 31), 31), 31);
        g8e0 g8e0Var = this.f;
        int iHashCode = (iA + (g8e0Var == null ? 0 : g8e0Var.hashCode())) * 31;
        pnh0 pnh0Var = this.g;
        int iHashCode2 = (this.i.hashCode() + ((this.h.hashCode() + ((iHashCode + (pnh0Var == null ? 0 : pnh0Var.hashCode())) * 31)) * 31)) * 31;
        l8e0 l8e0Var = this.j;
        return iHashCode2 + (l8e0Var != null ? l8e0Var.hashCode() : 0);
    }

    public final String toString() {
        return "CalculatedUseCaseInfo(appUseCases=" + this.a + ", cameraUseCases=" + this.b + ", cameraUseCasesToAttach=" + this.c + ", cameraUseCasesToKeep=" + this.d + ", cameraUseCasesToDetach=" + this.e + ", streamSharing=" + this.f + ", placeholderForExtensions=" + this.g + ", useCaseConfigs=" + this.h + ", primaryStreamSpecResult=" + this.i + ", secondaryStreamSpecResult=" + this.j + ')';
    }
}
