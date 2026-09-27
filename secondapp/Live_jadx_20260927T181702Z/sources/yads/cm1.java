package yads;

import android.net.Uri;
import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class cm1 implements xq {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final cm1 f147776d = new cm1(new bm1());

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final wq f147777e = new wq() { // from class: yads.fz3
        @Override // yads.wq
        public final xq fromBundle(Bundle bundle) {
            return cm1.a(bundle);
        }
    };

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Uri f147778b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f147779c;

    public cm1(bm1 bm1Var) {
        this.f147778b = bm1Var.f147268a;
        this.f147779c = bm1Var.f147269b;
    }

    public static cm1 a(Bundle bundle) {
        bm1 bm1Var = new bm1();
        bm1Var.f147268a = (Uri) bundle.getParcelable(Integer.toString(0, 36));
        bm1Var.f147269b = bundle.getString(Integer.toString(1, 36));
        bm1Var.f147270c = bundle.getBundle(Integer.toString(2, 36));
        return new cm1(bm1Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cm1)) {
            return false;
        }
        cm1 cm1Var = (cm1) obj;
        return ib3.a(this.f147778b, cm1Var.f147778b) && ib3.a(this.f147779c, cm1Var.f147779c);
    }

    public final int hashCode() {
        Uri uri = this.f147778b;
        int iHashCode = (uri == null ? 0 : uri.hashCode()) * 31;
        String str = this.f147779c;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }
}
