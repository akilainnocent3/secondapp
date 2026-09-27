package androidx.datastore.preferences.protobuf;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public enum j4 implements t1.c {
    SYNTAX_PROTO2(0),
    SYNTAX_PROTO3(1),
    SYNTAX_EDITIONS(2),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f10066g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f10067h = 1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f10068i = 2;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final t1.d<j4> f10069j = new t1.d<j4>() { // from class: androidx.datastore.preferences.protobuf.j4.a
        @Override // androidx.datastore.preferences.protobuf.t1.d
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public j4 findValueByNumber(int number) {
            return j4.a(number);
        }
    };

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f10071b;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class b implements t1.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final t1.e f10072a = new b();

        @Override // androidx.datastore.preferences.protobuf.t1.e
        public boolean isInRange(int number) {
            return j4.a(number) != null;
        }
    }

    j4(int value) {
        this.f10071b = value;
    }

    public static j4 a(int value) {
        if (value == 0) {
            return SYNTAX_PROTO2;
        }
        if (value == 1) {
            return SYNTAX_PROTO3;
        }
        if (value != 2) {
            return null;
        }
        return SYNTAX_EDITIONS;
    }

    public static t1.d<j4> d() {
        return f10069j;
    }

    public static t1.e g() {
        return b.f10072a;
    }

    @Deprecated
    public static j4 h(int value) {
        return a(value);
    }

    @Override // androidx.datastore.preferences.protobuf.t1.c
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f10071b;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
