package sg.bigo.ads.ad.interstitial.e.a;

import androidx.annotation.NonNull;
import sg.bigo.ads.ad.interstitial.d;
import sg.bigo.ads.common.utils.r;

/* JADX INFO: loaded from: classes7.dex */
public abstract class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final int f131710b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final int f131711c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected final int f131712d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected final int f131713e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected final int f131714f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected final int f131715g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected final int f131716h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected final int f131717i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    protected final int f131718j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    protected final a f131719k = new a(this, 0);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    protected final int f131720l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    protected final int f131721m;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f131722a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f131723b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f131724c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f131725d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f131726e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f131727f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f131728g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final int f131729h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final int f131730i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final int f131731j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final int f131732k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final int f131733l;

        /* JADX WARN: Code duplicated, block: B:14:0x005d  */
        /* JADX WARN: Code duplicated, block: B:17:0x006f A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:18:0x0071  */
        /* JADX WARN: Code duplicated, block: B:20:0x0079  */
        /* JADX WARN: Code duplicated, block: B:22:0x0081  */
        private a(@NonNull b bVar) {
            int iE;
            int iG;
            int i10 = d.f131503b;
            int iH = bVar.h();
            if (iH != 2) {
                if (iH != 3) {
                    this.f131722a = false;
                    this.f131723b = -1;
                    this.f131724c = sg.bigo.ads.common.w.b.a(i10, 0.15f);
                    this.f131725d = i10;
                    this.f131727f = i10;
                } else {
                    this.f131722a = true;
                    this.f131723b = sg.bigo.ads.common.w.b.a(-16777216, 0.3f);
                }
                this.f131726e = sg.bigo.ads.common.w.b.a(this.f131727f, 128);
                iE = bVar.e();
                if (iE != 2 || iE == 4) {
                    this.f131728g = 0;
                    this.f131729h = 0;
                } else {
                    this.f131728g = this.f131723b;
                    this.f131729h = this.f131724c;
                }
                this.f131730i = -1;
                this.f131731j = sg.bigo.ads.common.w.b.a(i10, 0.15f);
                iG = bVar.g();
                if (iG != 2) {
                    this.f131732k = -14972829;
                    this.f131733l = 0;
                } else if (iG != 3) {
                    this.f131732k = -16736769;
                    this.f131733l = 0;
                } else {
                    this.f131732k = 872415231;
                    this.f131733l = -1;
                }
            }
            this.f131722a = false;
            this.f131723b = -16777216;
            this.f131724c = sg.bigo.ads.common.w.b.a(-1, 0.15f);
            this.f131725d = -1;
            this.f131727f = -1;
            this.f131726e = sg.bigo.ads.common.w.b.a(this.f131727f, 128);
            iE = bVar.e();
            if (iE != 2) {
                this.f131728g = 0;
                this.f131729h = 0;
            } else {
                this.f131728g = 0;
                this.f131729h = 0;
            }
            this.f131730i = -1;
            this.f131731j = sg.bigo.ads.common.w.b.a(i10, 0.15f);
            iG = bVar.g();
            if (iG != 2) {
                this.f131732k = -14972829;
                this.f131733l = 0;
            } else if (iG != 3) {
                this.f131732k = -16736769;
                this.f131733l = 0;
            } else {
                this.f131732k = 872415231;
                this.f131733l = -1;
            }
        }

        public /* synthetic */ a(b bVar, byte b10) {
            this(bVar);
        }
    }

    public b(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20) {
        this.f131710b = i10;
        this.f131711c = i11;
        this.f131712d = i12;
        this.f131713e = i13;
        this.f131714f = i14;
        this.f131715g = i15;
        this.f131716h = i16;
        this.f131717i = i17;
        this.f131718j = i18;
        this.f131720l = i19;
        this.f131721m = i20;
    }

    public static int a(b bVar) {
        if (bVar == null) {
            return 0;
        }
        if (bVar.a()) {
            return 1;
        }
        int iE = bVar.e();
        int i10 = 3;
        if (iE == 3 || iE == 4) {
            return 2;
        }
        if (iE != 5) {
            i10 = 6;
            if (iE != 6) {
                return 4;
            }
        }
        return i10;
    }

    public int b() {
        return 9;
    }

    @NonNull
    public final a c() {
        return this.f131719k;
    }

    public final int d() {
        int i10 = this.f131710b;
        if (i10 == 0 || i10 == 1 || i10 == 2 || i10 == 3) {
            return i10;
        }
        return 0;
    }

    public int e() {
        int i10 = this.f131711c;
        if (i10 == 1 || i10 == 2 || i10 == 3 || i10 == 4) {
            return i10;
        }
        return 1;
    }

    public int f() {
        int i10 = this.f131711c;
        if (i10 == 1 || i10 == 2 || i10 == 3 || i10 == 4 || i10 == 5) {
            return i10;
        }
        return 1;
    }

    public final int g() {
        int i10 = this.f131712d;
        if (i10 == 1 || i10 == 2 || i10 == 3) {
            return i10;
        }
        return 1;
    }

    public final int h() {
        int i10 = this.f131713e;
        if (i10 == 1 || i10 == 2 || i10 == 3) {
            return i10;
        }
        return 1;
    }

    public final int i() {
        return Math.max(1, this.f131714f);
    }

    public final long j() {
        return r.f133428a.a(Math.min(99, Math.max(0, this.f131715g)));
    }

    public final long k() {
        int i10 = this.f131716h;
        return i10 < 0 ? r.f133428a.a(0) : r.f133428a.a(i10);
    }

    public final int l() {
        int i10 = this.f131717i;
        if (i10 == 1 || i10 == 2 || i10 == 3) {
            return i10;
        }
        return 3;
    }

    public final int m() {
        int i10 = this.f131720l;
        if (i10 < 0 || i10 > 4) {
            return 0;
        }
        return i10;
    }

    public final int n() {
        return Math.max(1, this.f131721m);
    }

    public final int o() {
        int i10 = this.f131718j;
        if (i10 < 0) {
            return -1;
        }
        return i10;
    }

    public static boolean b(b bVar) {
        return bVar == null || bVar.d() == 0;
    }

    public boolean a() {
        return false;
    }
}
