package yads;

import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class mo3 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Comparator f152592c = new Comparator() { // from class: yads.d64
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return Integer.compare(((mo3) obj).f152593a.f153104b, ((mo3) obj2).f152593a.f153104b);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final no3 f152593a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f152594b;

    public mo3(no3 no3Var, int i10) {
        this.f152593a = no3Var;
        this.f152594b = i10;
    }
}
