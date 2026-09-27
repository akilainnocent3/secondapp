package sl;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final a f135428p = new C1387a().a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f135429a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f135430b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f135431c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c f135432d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final d f135433e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f135434f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f135435g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f135436h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f135437i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f135438j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final long f135439k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final b f135440l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f135441m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final long f135442n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final String f135443o;

    /* JADX INFO: renamed from: sl.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class C1387a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f135444a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f135445b = "";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f135446c = "";

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public c f135447d = c.UNKNOWN;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public d f135448e = d.UNKNOWN_OS;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public String f135449f = "";

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public String f135450g = "";

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f135451h = 0;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f135452i = 0;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public String f135453j = "";

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public long f135454k = 0;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public b f135455l = b.UNKNOWN_EVENT;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public String f135456m = "";

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public long f135457n = 0;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public String f135458o = "";

        public a a() {
            return new a(this.f135444a, this.f135445b, this.f135446c, this.f135447d, this.f135448e, this.f135449f, this.f135450g, this.f135451h, this.f135452i, this.f135453j, this.f135454k, this.f135455l, this.f135456m, this.f135457n, this.f135458o);
        }

        public C1387a b(String str) {
            this.f135456m = str;
            return this;
        }

        public C1387a c(long j10) {
            this.f135454k = j10;
            return this;
        }

        public C1387a d(long j10) {
            this.f135457n = j10;
            return this;
        }

        public C1387a e(String str) {
            this.f135450g = str;
            return this;
        }

        public C1387a f(String str) {
            this.f135458o = str;
            return this;
        }

        public C1387a g(b bVar) {
            this.f135455l = bVar;
            return this;
        }

        public C1387a h(String str) {
            this.f135446c = str;
            return this;
        }

        public C1387a i(String str) {
            this.f135445b = str;
            return this;
        }

        public C1387a j(c cVar) {
            this.f135447d = cVar;
            return this;
        }

        public C1387a k(String str) {
            this.f135449f = str;
            return this;
        }

        public C1387a l(int i10) {
            this.f135451h = i10;
            return this;
        }

        public C1387a m(long j10) {
            this.f135444a = j10;
            return this;
        }

        public C1387a n(d dVar) {
            this.f135448e = dVar;
            return this;
        }

        public C1387a o(String str) {
            this.f135453j = str;
            return this;
        }

        public C1387a p(int i10) {
            this.f135452i = i10;
            return this;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public enum b implements xk.c {
        UNKNOWN_EVENT(0),
        MESSAGE_DELIVERED(1),
        MESSAGE_OPEN(2);


        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f135463b;

        b(int i10) {
            this.f135463b = i10;
        }

        @Override // xk.c
        public int getNumber() {
            return this.f135463b;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public enum c implements xk.c {
        UNKNOWN(0),
        DATA_MESSAGE(1),
        TOPIC(2),
        DISPLAY_NOTIFICATION(3);


        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f135469b;

        c(int i10) {
            this.f135469b = i10;
        }

        @Override // xk.c
        public int getNumber() {
            return this.f135469b;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public enum d implements xk.c {
        UNKNOWN_OS(0),
        ANDROID(1),
        IOS(2),
        WEB(3);


        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f135475b;

        d(int i10) {
            this.f135475b = i10;
        }

        @Override // xk.c
        public int getNumber() {
            return this.f135475b;
        }
    }

    public a(long j10, String str, String str2, c cVar, d dVar, String str3, String str4, int i10, int i11, String str5, long j11, b bVar, String str6, long j12, String str7) {
        this.f135429a = j10;
        this.f135430b = str;
        this.f135431c = str2;
        this.f135432d = cVar;
        this.f135433e = dVar;
        this.f135434f = str3;
        this.f135435g = str4;
        this.f135436h = i10;
        this.f135437i = i11;
        this.f135438j = str5;
        this.f135439k = j11;
        this.f135440l = bVar;
        this.f135441m = str6;
        this.f135442n = j12;
        this.f135443o = str7;
    }

    public static a f() {
        return f135428p;
    }

    public static C1387a q() {
        return new C1387a();
    }

    @xk.d(tag = 13)
    public String a() {
        return this.f135441m;
    }

    @xk.d(tag = 11)
    public long b() {
        return this.f135439k;
    }

    @xk.d(tag = 14)
    public long c() {
        return this.f135442n;
    }

    @xk.d(tag = 7)
    public String d() {
        return this.f135435g;
    }

    @xk.d(tag = 15)
    public String e() {
        return this.f135443o;
    }

    @xk.d(tag = 12)
    public b g() {
        return this.f135440l;
    }

    @xk.d(tag = 3)
    public String h() {
        return this.f135431c;
    }

    @xk.d(tag = 2)
    public String i() {
        return this.f135430b;
    }

    @xk.d(tag = 4)
    public c j() {
        return this.f135432d;
    }

    @xk.d(tag = 6)
    public String k() {
        return this.f135434f;
    }

    @xk.d(tag = 8)
    public int l() {
        return this.f135436h;
    }

    @xk.d(tag = 1)
    public long m() {
        return this.f135429a;
    }

    @xk.d(tag = 5)
    public d n() {
        return this.f135433e;
    }

    @xk.d(tag = 10)
    public String o() {
        return this.f135438j;
    }

    @xk.d(tag = 9)
    public int p() {
        return this.f135437i;
    }
}
