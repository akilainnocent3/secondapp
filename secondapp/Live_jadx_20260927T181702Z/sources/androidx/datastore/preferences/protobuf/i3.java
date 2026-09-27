package androidx.datastore.preferences.protobuf;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public enum i3 implements t1.c {
    NULL_VALUE(0),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f10041e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final t1.d<i3> f10042f = new t1.d<i3>() { // from class: androidx.datastore.preferences.protobuf.i3.a
        @Override // androidx.datastore.preferences.protobuf.t1.d
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public i3 findValueByNumber(int number) {
            return i3.a(number);
        }
    };

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f10044b;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class b implements t1.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final t1.e f10045a = new b();

        @Override // androidx.datastore.preferences.protobuf.t1.e
        public boolean isInRange(int number) {
            return i3.a(number) != null;
        }
    }

    i3(int value) {
        this.f10044b = value;
    }

    public static i3 a(int value) {
        if (value != 0) {
            return null;
        }
        return NULL_VALUE;
    }

    public static t1.d<i3> d() {
        return f10042f;
    }

    public static t1.e g() {
        return b.f10045a;
    }

    @Deprecated
    public static i3 h(int value) {
        return a(value);
    }

    @Override // androidx.datastore.preferences.protobuf.t1.c
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f10044b;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
