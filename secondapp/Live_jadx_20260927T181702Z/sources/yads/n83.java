package yads;

import android.os.Bundle;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class n83 implements xq {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final wq f152931g = new wq() { // from class: yads.l64
        @Override // yads.wq
        public final xq fromBundle(Bundle bundle) {
            return n83.a(bundle);
        }
    };

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f152932b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h73 f152933c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f152934d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int[] f152935e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean[] f152936f;

    public n83(h73 h73Var, boolean z10, int[] iArr, boolean[] zArr) {
        int i10 = h73Var.f149961b;
        this.f152932b = i10;
        boolean z11 = false;
        ni.a(i10 == iArr.length && i10 == zArr.length);
        this.f152933c = h73Var;
        if (z10 && i10 > 1) {
            z11 = true;
        }
        this.f152934d = z11;
        this.f152935e = (int[]) iArr.clone();
        this.f152936f = (boolean[]) zArr.clone();
    }

    public final int a() {
        return this.f152933c.f149963d;
    }

    public final boolean b() {
        for (boolean z10 : this.f152936f) {
            if (z10) {
                return true;
            }
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && n83.class == obj.getClass()) {
            n83 n83Var = (n83) obj;
            if (this.f152934d == n83Var.f152934d && this.f152933c.equals(n83Var.f152933c) && Arrays.equals(this.f152935e, n83Var.f152935e) && Arrays.equals(this.f152936f, n83Var.f152936f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f152936f) + ((Arrays.hashCode(this.f152935e) + (((this.f152933c.hashCode() * 31) + (this.f152934d ? 1 : 0)) * 31)) * 31);
    }

    public static n83 a(Bundle bundle) {
        wq wqVar = h73.f149960g;
        Bundle bundle2 = bundle.getBundle(Integer.toString(0, 36));
        bundle2.getClass();
        h73 h73Var = (h73) wqVar.fromBundle(bundle2);
        int[] intArray = bundle.getIntArray(Integer.toString(1, 36));
        int[] iArr = new int[h73Var.f149961b];
        if (intArray == null) {
            intArray = iArr;
        }
        boolean[] booleanArray = bundle.getBooleanArray(Integer.toString(3, 36));
        boolean[] zArr = new boolean[h73Var.f149961b];
        if (booleanArray == null) {
            booleanArray = zArr;
        }
        return new n83(h73Var, bundle.getBoolean(Integer.toString(4, 36), false), intArray, booleanArray);
    }
}
