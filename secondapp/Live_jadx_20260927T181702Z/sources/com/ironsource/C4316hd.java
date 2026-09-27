package com.ironsource;

/* JADX INFO: renamed from: com.ironsource.hd, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public class C4316hd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f61952a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f61953b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f61954c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private EnumC4387ld f61955d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f61956e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f61957f;

    /* JADX INFO: renamed from: com.ironsource.hd$a */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f61958a = true;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f61959b = false;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f61960c = false;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private EnumC4387ld f61961d = null;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f61962e = 0;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f61963f = 0;

        public a a(boolean z10) {
            this.f61958a = z10;
            return this;
        }

        public a a(boolean z10, EnumC4387ld enumC4387ld, int i10) {
            this.f61959b = z10;
            if (enumC4387ld == null) {
                enumC4387ld = EnumC4387ld.PER_DAY;
            }
            this.f61961d = enumC4387ld;
            this.f61962e = i10;
            return this;
        }

        public a a(boolean z10, int i10) {
            this.f61960c = z10;
            this.f61963f = i10;
            return this;
        }

        public C4316hd a() {
            return new C4316hd(this.f61958a, this.f61959b, this.f61960c, this.f61961d, this.f61962e, this.f61963f);
        }
    }

    public EnumC4387ld a() {
        return this.f61955d;
    }

    public int b() {
        return this.f61956e;
    }

    public int c() {
        return this.f61957f;
    }

    public boolean d() {
        return this.f61953b;
    }

    public boolean e() {
        return this.f61952a;
    }

    public boolean f() {
        return this.f61954c;
    }

    private C4316hd(boolean z10, boolean z11, boolean z12, EnumC4387ld enumC4387ld, int i10, int i11) {
        this.f61952a = z10;
        this.f61953b = z11;
        this.f61954c = z12;
        this.f61955d = enumC4387ld;
        this.f61956e = i10;
        this.f61957f = i11;
    }
}
