package yads;

import java.util.ArrayList;
import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class b13 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Comparator f147005h = new Comparator() { // from class: yads.sx3
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return b13.a((a13) obj, (a13) obj2);
        }
    };

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Comparator f147006i = new Comparator() { // from class: yads.tx3
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return Float.compare(((a13) obj).f146618c, ((a13) obj2).f146618c);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f147007a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f147011e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f147012f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f147013g;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a13[] f147009c = new a13[5];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f147008b = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f147010d = -1;

    public b13(int i10) {
        this.f147007a = i10;
    }

    public static /* synthetic */ int a(a13 a13Var, a13 a13Var2) {
        return a13Var.f146616a - a13Var2.f146616a;
    }
}
