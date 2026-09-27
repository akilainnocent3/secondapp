package com.ironsource;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public interface I9 extends Kb<Integer, Integer> {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @oy.l
        public static final a f59249a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f59250b = 2201;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f59251c = 2203;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f59252d = 2005;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f59253e = 2210;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final int f59254f = 2006;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final int f59255g = 2204;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final int f59256h = 2507;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final int f59257i = 2211;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final int f59258j = 2212;

        private a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @oy.l
        public static final b f59259a = new b();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f59260b = 2002;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f59261c = 2003;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f59262d = 2200;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f59263e = 2503;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final int f59264f = 2504;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final int f59265g = 2300;

        private b() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class c implements I9 {
        @Override // com.ironsource.Kb
        public /* bridge */ /* synthetic */ Integer a(Integer num) {
            return a(num.intValue());
        }

        @oy.l
        public Integer a(int i10) throws IllegalArgumentException {
            int i11;
            if (i10 == 206) {
                i11 = b.f59263e;
            } else if (i10 == 207) {
                i11 = b.f59264f;
            } else if (i10 == 401) {
                i11 = 2201;
            } else if (i10 == 410) {
                i11 = a.f59257i;
            } else if (i10 != 411) {
                switch (i10) {
                    case 101:
                        i11 = d.f59267b;
                        break;
                    case 102:
                        i11 = d.f59268c;
                        break;
                    case 103:
                        i11 = d.f59273h;
                        break;
                    case 104:
                        i11 = d.f59269d;
                        break;
                    case 105:
                        i11 = d.f59270e;
                        break;
                    default:
                        switch (i10) {
                            case 109:
                                i11 = 88002;
                                break;
                            case 110:
                                i11 = 83004;
                                break;
                            case 111:
                                i11 = d.f59274i;
                                break;
                            case 112:
                                i11 = d.f59275j;
                                break;
                            default:
                                switch (i10) {
                                    case 201:
                                        i11 = 2002;
                                        break;
                                    case 202:
                                        i11 = 2003;
                                        break;
                                    case 203:
                                        i11 = 2200;
                                        break;
                                    case 204:
                                        i11 = b.f59265g;
                                        break;
                                    default:
                                        switch (i10) {
                                            case 403:
                                                i11 = a.f59251c;
                                                break;
                                            case 404:
                                                i11 = 2005;
                                                break;
                                            case 405:
                                                i11 = a.f59253e;
                                                break;
                                            case 406:
                                                i11 = 2006;
                                                break;
                                            case 407:
                                                i11 = a.f59255g;
                                                break;
                                            case 408:
                                                i11 = a.f59256h;
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
                i11 = a.f59258j;
            }
            return Integer.valueOf(i11);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @oy.l
        public static final d f59266a = new d();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f59267b = 82500;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f59268c = 82510;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f59269d = 82300;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f59270e = 82002;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final int f59271f = 83004;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final int f59272g = 88002;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final int f59273h = 82301;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final int f59274i = 82302;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final int f59275j = 82076;

        private d() {
        }
    }
}
