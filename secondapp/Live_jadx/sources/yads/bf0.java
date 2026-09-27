package yads;

import android.os.Bundle;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class bf0 implements xq {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final wq f147158e = new wq() { // from class: yads.xx3
        @Override // yads.wq
        public final xq fromBundle(Bundle bundle) {
            return bf0.a(bundle);
        }
    };

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f147159b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int[] f147160c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f147161d;

    public bf0(int i10, int i11, int[] iArr) {
        this.f147159b = i10;
        int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
        this.f147160c = iArrCopyOf;
        this.f147161d = i11;
        Arrays.sort(iArrCopyOf);
    }

    public static bf0 a(Bundle bundle) {
        int i10 = bundle.getInt(Integer.toString(0, 36), -1);
        int[] intArray = bundle.getIntArray(Integer.toString(1, 36));
        int i11 = bundle.getInt(Integer.toString(2, 36), -1);
        if (i10 < 0 || i11 < 0) {
            throw new IllegalArgumentException();
        }
        intArray.getClass();
        return new bf0(i10, i11, intArray);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && bf0.class == obj.getClass()) {
            bf0 bf0Var = (bf0) obj;
            if (this.f147159b == bf0Var.f147159b && Arrays.equals(this.f147160c, bf0Var.f147160c) && this.f147161d == bf0Var.f147161d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((Arrays.hashCode(this.f147160c) + (this.f147159b * 31)) * 31) + this.f147161d;
    }
}
