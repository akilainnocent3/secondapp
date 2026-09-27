package yads;

import android.os.Bundle;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class le2 implements xq {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final le2 f151953c = new le2(new cw0().a());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dw0 f151954b;

    static {
        new wq() { // from class: yads.q54
            @Override // yads.wq
            public final xq fromBundle(Bundle bundle) {
                return le2.a(bundle);
            }
        };
    }

    public le2(dw0 dw0Var) {
        this.f151954b = dw0Var;
    }

    public static le2 a(Bundle bundle) {
        ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList(Integer.toString(0, 36));
        if (integerArrayList == null) {
            return f151953c;
        }
        cw0 cw0Var = new cw0();
        for (int i10 = 0; i10 < integerArrayList.size(); i10++) {
            cw0Var.a(integerArrayList.get(i10).intValue());
        }
        return new le2(cw0Var.a());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof le2) {
            return this.f151954b.equals(((le2) obj).f151954b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f151954b.hashCode();
    }
}
