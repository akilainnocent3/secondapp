package ms;

import dr.a3;
import dr.l1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class l extends j implements g<Integer>, r<Integer> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @oy.l
    public static final a f115146f = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @oy.l
    public static final l f115147g = new l(1, 0);

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.x xVar) {
            this();
        }

        @oy.l
        public final l a() {
            return l.f115147g;
        }

        public a() {
        }
    }

    public l(int i10, int i11) {
        super(i10, i11, 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ms.g
    public /* bridge */ /* synthetic */ boolean a(Comparable comparable) {
        return l(((Number) comparable).intValue());
    }

    @Override // ms.j
    public boolean equals(@oy.m Object obj) {
        if (!(obj instanceof l)) {
            return false;
        }
        if (isEmpty() && ((l) obj).isEmpty()) {
            return true;
        }
        l lVar = (l) obj;
        return f() == lVar.f() && g() == lVar.g();
    }

    @Override // ms.j
    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (f() * 31) + g();
    }

    @Override // ms.j, ms.g
    public boolean isEmpty() {
        return f() > g();
    }

    public boolean l(int i10) {
        return f() <= i10 && i10 <= g();
    }

    @Override // ms.r
    @oy.l
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public Integer e() {
        if (g() != Integer.MAX_VALUE) {
            return Integer.valueOf(g() + 1);
        }
        throw new IllegalStateException("Cannot return the exclusive upper bound of a range that includes MAX_VALUE.");
    }

    @Override // ms.g
    @oy.l
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public Integer d() {
        return Integer.valueOf(g());
    }

    @Override // ms.g
    @oy.l
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public Integer m() {
        return Integer.valueOf(f());
    }

    @Override // ms.j
    @oy.l
    public String toString() {
        return f() + ".." + g();
    }

    @l1(version = "1.9")
    @a3(markerClass = {dr.v.class})
    @dr.o(message = "Can throw an exception when it's impossible to represent the value with Int type, for example, when the range includes MAX_VALUE. It's recommended to use 'endInclusive' property that doesn't throw.")
    public static /* synthetic */ void p() {
    }
}
