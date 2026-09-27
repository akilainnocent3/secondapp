package yads;

import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public abstract class ql2 implements xq {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final wq f154502b = new wq() { // from class: yads.e94
        @Override // yads.wq
        public final xq fromBundle(Bundle bundle) {
            return ql2.a(bundle);
        }
    };

    public static ql2 a(Bundle bundle) {
        int i10 = bundle.getInt(Integer.toString(0, 36), -1);
        if (i10 == 0) {
            return (ql2) v01.f156698e.fromBundle(bundle);
        }
        if (i10 == 1) {
            return (ql2) ec2.f148648d.fromBundle(bundle);
        }
        if (i10 == 2) {
            return (ql2) k33.f151374e.fromBundle(bundle);
        }
        if (i10 == 3) {
            return (ql2) e63.f148534e.fromBundle(bundle);
        }
        throw new IllegalArgumentException(mg2.a("Unknown RatingType: ", i10));
    }
}
