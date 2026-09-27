package com.ironsource;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public interface X2 extends Kb<Integer, Integer> {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @oy.l
        public static final a f60287a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f60288b = 3009;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f60289c = 3008;

        private a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @oy.l
        public static final b f60290a = new b();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f60291b = 3002;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f60292c = 3005;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f60293d = 3300;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f60294e = 3503;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final int f60295f = 3504;

        private b() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class c implements X2 {
        @Override // com.ironsource.Kb
        public /* bridge */ /* synthetic */ Integer a(Integer num) {
            return a(num.intValue());
        }

        @oy.l
        public Integer a(int i10) throws IllegalArgumentException {
            int i11;
            if (i10 == 206) {
                i11 = b.f60294e;
            } else if (i10 == 207) {
                i11 = b.f60295f;
            } else if (i10 == 405) {
                i11 = 3009;
            } else if (i10 != 406) {
                switch (i10) {
                    case 101:
                        i11 = 83500;
                        break;
                    case 102:
                        i11 = 83510;
                        break;
                    case 103:
                        i11 = d.f60303h;
                        break;
                    case 104:
                        i11 = 83300;
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
                                break;
                            case 112:
                                i11 = 3305;
                                break;
                            default:
                                switch (i10) {
                                    case 201:
                                        i11 = 3002;
                                        break;
                                    case 202:
                                        i11 = 3005;
                                        break;
                                    case 203:
                                        i11 = 3300;
                                        break;
                                    default:
                                        throw new IllegalArgumentException("Unknown event code: " + i10);
                                }
                                break;
                        }
                    case 105:
                        i11 = 83302;
                        break;
                }
            } else {
                i11 = 3008;
            }
            return Integer.valueOf(i11);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @oy.l
        public static final d f60296a = new d();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f60297b = 83500;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f60298c = 83510;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f60299d = 83300;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f60300e = 83302;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final int f60301f = 83004;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final int f60302g = 88002;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final int f60303h = 83301;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final int f60304i = 83302;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final int f60305j = 3305;

        private d() {
        }
    }
}
