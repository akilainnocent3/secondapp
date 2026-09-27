package yads;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class o83 implements xq {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final o83 f153401c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p51 f153402b;

    static {
        m51 m51Var = p51.f153747c;
        f153401c = new o83(sm2.f155489f);
        new wq() { // from class: yads.e74
            @Override // yads.wq
            public final xq fromBundle(Bundle bundle) {
                return o83.a(bundle);
            }
        };
    }

    public o83(p51 p51Var) {
        this.f153402b = p51.a((Collection) p51Var);
    }

    public final boolean a(int i10) {
        for (int i11 = 0; i11 < this.f153402b.size(); i11++) {
            n83 n83Var = (n83) this.f153402b.get(i11);
            if (n83Var.b() && n83Var.a() == i10) {
                return true;
            }
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || o83.class != obj.getClass()) {
            return false;
        }
        return this.f153402b.equals(((o83) obj).f153402b);
    }

    public final int hashCode() {
        return this.f153402b.hashCode();
    }

    public static o83 a(Bundle bundle) {
        sm2 sm2VarA;
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(Integer.toString(0, 36));
        if (parcelableArrayList == null) {
            m51 m51Var = p51.f153747c;
            sm2VarA = sm2.f155489f;
        } else {
            sm2VarA = yq.a(n83.f152931g, parcelableArrayList);
        }
        return new o83(sm2VarA);
    }
}
