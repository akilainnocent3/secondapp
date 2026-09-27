package bj;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
@yi.b
@i
public abstract class v {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final v f21738b = new a("EXPLICIT", 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final v f21739c = new v("REPLACED", 1) { // from class: bj.v.b
        {
            a aVar = null;
        }

        @Override // bj.v
        public boolean g() {
            return false;
        }
    };

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final v f21740d = new v("COLLECTED", 2) { // from class: bj.v.c
        {
            a aVar = null;
        }

        @Override // bj.v
        public boolean g() {
            return true;
        }
    };

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final v f21741e = new v("EXPIRED", 3) { // from class: bj.v.d
        {
            a aVar = null;
        }

        @Override // bj.v
        public boolean g() {
            return true;
        }
    };

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final v f21742f = new v("SIZE", 4) { // from class: bj.v.e
        {
            a aVar = null;
        }

        @Override // bj.v
        public boolean g() {
            return true;
        }
    };

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ v[] f21743g = d();

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public final enum a extends v {
        public a(String $enum$name, int $enum$ordinal) {
            super($enum$name, $enum$ordinal, null);
        }

        @Override // bj.v
        public boolean g() {
            return false;
        }
    }

    public v(String $enum$name, int $enum$ordinal) {
        super($enum$name, $enum$ordinal);
    }

    public static /* synthetic */ v[] d() {
        return new v[]{f21738b, f21739c, f21740d, f21741e, f21742f};
    }

    public static v valueOf(String name) {
        return (v) Enum.valueOf(v.class, name);
    }

    public static v[] values() {
        return (v[]) f21743g.clone();
    }

    public abstract boolean g();

    public /* synthetic */ v(String str, int i10, a aVar) {
        this(str, i10);
    }
}
