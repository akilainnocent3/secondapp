package com.ironsource;

/* JADX INFO: renamed from: com.ironsource.ae, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public interface InterfaceC4191ae extends Kb<Integer, Integer> {

    /* JADX INFO: renamed from: com.ironsource.ae$a */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @oy.l
        public static final a f61025a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f61026b = 1201;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f61027c = 1202;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f61028d = 1005;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f61029e = 1206;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final int f61030f = 1006;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final int f61031g = 1203;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final int f61032h = 1507;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final int f61033i = 1010;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final int f61034j = 1210;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final int f61035k = 1211;

        private a() {
        }
    }

    /* JADX INFO: renamed from: com.ironsource.ae$b */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @oy.l
        public static final b f61036a = new b();

        private b() {
        }
    }

    /* JADX INFO: renamed from: com.ironsource.ae$c */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @oy.l
        public static final c f61037a = new c();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f61038b = 1001;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f61039c = 1002;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f61040d = 1200;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f61041e = 1301;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final int f61042f = 1503;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final int f61043g = 1504;

        private c() {
        }
    }

    /* JADX INFO: renamed from: com.ironsource.ae$d */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class d implements InterfaceC4191ae {
        @Override // com.ironsource.Kb
        public /* bridge */ /* synthetic */ Integer a(Integer num) {
            return a(num.intValue());
        }

        @oy.l
        public Integer a(int i10) throws IllegalArgumentException {
            int i11;
            if (i10 == 206) {
                i11 = c.f61042f;
            } else if (i10 == 207) {
                i11 = c.f61043g;
            } else if (i10 != 401) {
                switch (i10) {
                    case 101:
                        i11 = e.f61045b;
                        break;
                    case 102:
                        i11 = e.f61046c;
                        break;
                    case 103:
                        i11 = e.f61047d;
                        break;
                    case 104:
                        i11 = e.f61048e;
                        break;
                    case 105:
                        i11 = e.f61049f;
                        break;
                    default:
                        switch (i10) {
                            case 109:
                                i11 = 88002;
                                break;
                            case 110:
                                i11 = e.f61051h;
                                break;
                            case 111:
                                i11 = e.f61052i;
                                break;
                            case 112:
                                i11 = e.f61053j;
                                break;
                            default:
                                switch (i10) {
                                    case 201:
                                        i11 = 1001;
                                        break;
                                    case 202:
                                        i11 = 1002;
                                        break;
                                    case 203:
                                        i11 = 1200;
                                        break;
                                    case 204:
                                        i11 = c.f61041e;
                                        break;
                                    default:
                                        switch (i10) {
                                            case 403:
                                                i11 = a.f61027c;
                                                break;
                                            case 404:
                                                i11 = 1005;
                                                break;
                                            case 405:
                                                i11 = a.f61029e;
                                                break;
                                            case 406:
                                                i11 = 1006;
                                                break;
                                            case 407:
                                                i11 = a.f61031g;
                                                break;
                                            case 408:
                                                i11 = a.f61032h;
                                                break;
                                            case 409:
                                                i11 = 1010;
                                                break;
                                            case 410:
                                                i11 = a.f61034j;
                                                break;
                                            case 411:
                                                i11 = a.f61035k;
                                                break;
                                            default:
                                                throw new IllegalArgumentException("Unknown event code: " + i10);
                                        }
                                        break;
                                }
                                break;
                        }
                        break;
                }
            } else {
                i11 = a.f61026b;
            }
            return Integer.valueOf(i11);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.ae$e */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @oy.l
        public static final e f61044a = new e();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f61045b = 81500;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f61046c = 81510;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f61047d = 81301;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f61048e = 81300;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final int f61049f = 81002;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final int f61050g = 88002;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final int f61051h = 83003;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final int f61052i = 81302;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final int f61053j = 81077;

        private e() {
        }
    }
}
