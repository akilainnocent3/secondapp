package yads;

import android.os.Bundle;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class o73 implements xq {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final wq f153380d = new wq() { // from class: yads.c74
        @Override // yads.wq
        public final xq fromBundle(Bundle bundle) {
            return o73.a(bundle);
        }
    };

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h73 f153381b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p51 f153382c;

    public o73(h73 h73Var, List list) {
        if (!list.isEmpty() && (((Integer) Collections.min(list)).intValue() < 0 || ((Integer) Collections.max(list)).intValue() >= h73Var.f149961b)) {
            throw new IndexOutOfBoundsException();
        }
        this.f153381b = h73Var;
        this.f153382c = p51.a((Collection) list);
    }

    public static o73 a(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle(Integer.toString(0, 36));
        bundle2.getClass();
        h73 h73Var = (h73) h73.f149960g.fromBundle(bundle2);
        int[] intArray = bundle.getIntArray(Integer.toString(1, 36));
        intArray.getClass();
        return new o73(h73Var, intArray.length == 0 ? Collections.EMPTY_LIST : new sd1(0, intArray.length, intArray));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && o73.class == obj.getClass()) {
            o73 o73Var = (o73) obj;
            if (this.f153381b.equals(o73Var.f153381b) && this.f153382c.equals(o73Var.f153382c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f153382c.hashCode() * 31) + this.f153381b.hashCode();
    }
}
