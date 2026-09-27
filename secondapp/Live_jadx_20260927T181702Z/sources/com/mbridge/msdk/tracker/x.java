package com.mbridge.msdk.tracker;

import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f70462a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f70463b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f70464c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f70465d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f70466e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f70467f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final p f70468g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final d f70469h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final w f70470i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final f f70471j;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class b {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private p f70475d;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private d f70479h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private w f70480i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private f f70481j;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f70472a = 50;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f70473b = 15000;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f70474c = 1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f70476e = 2;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f70477f = 50;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f70478g = 604800000;

        public b a(int i10, p pVar) {
            this.f70474c = i10;
            this.f70475d = pVar;
            return this;
        }

        public b b(int i10) {
            if (i10 <= 0) {
                this.f70472a = 50;
                return this;
            }
            this.f70472a = i10;
            return this;
        }

        public b c(int i10) {
            if (i10 < 0) {
                this.f70473b = 15000;
                return this;
            }
            this.f70473b = i10;
            return this;
        }

        public b d(int i10) {
            if (i10 < 0) {
                this.f70477f = 50;
                return this;
            }
            this.f70477f = i10;
            return this;
        }

        public b e(int i10) {
            if (i10 <= 0) {
                this.f70476e = 2;
                return this;
            }
            this.f70476e = i10;
            return this;
        }

        public b a(int i10) {
            if (i10 < 0) {
                this.f70478g = 604800000;
                return this;
            }
            this.f70478g = i10;
            return this;
        }

        public b a(d dVar) {
            this.f70479h = dVar;
            return this;
        }

        public b a(w wVar) {
            this.f70480i = wVar;
            return this;
        }

        public b a(f fVar) {
            this.f70481j = fVar;
            return this;
        }

        public x a() {
            if (y.b(this.f70479h) && com.mbridge.msdk.tracker.a.f70218a) {
                Log.e("TrackManager", "decorate can not be null");
            }
            if (y.b(this.f70480i) && com.mbridge.msdk.tracker.a.f70218a) {
                Log.e("TrackManager", "responseHandler can not be null");
            }
            if ((y.b(this.f70475d) || y.b(this.f70475d.b())) && com.mbridge.msdk.tracker.a.f70218a) {
                Log.e("TrackManager", "networkStackConfig or stack can not be null");
            }
            return new x(this);
        }
    }

    private x(b bVar) {
        this.f70462a = bVar.f70472a;
        this.f70463b = bVar.f70473b;
        this.f70464c = bVar.f70474c;
        this.f70465d = bVar.f70476e;
        this.f70466e = bVar.f70477f;
        this.f70467f = bVar.f70478g;
        this.f70468g = bVar.f70475d;
        this.f70469h = bVar.f70479h;
        this.f70470i = bVar.f70480i;
        this.f70471j = bVar.f70481j;
    }
}
