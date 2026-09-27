package androidx.leanback.widget;

import android.graphics.drawable.Drawable;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public interface g1 {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f12539a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f12540b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Drawable[] f12541c;

        public a(long j10) {
            this.f12539a = j10;
        }

        public Drawable a() {
            return this.f12541c[this.f12540b];
        }

        public Drawable[] b() {
            return this.f12541c;
        }

        public long c() {
            return this.f12539a;
        }

        public int d() {
            return this.f12540b;
        }

        public void e() {
            int i10 = this.f12540b;
            g(i10 < this.f12541c.length + (-1) ? i10 + 1 : 0);
        }

        public void f(Drawable[] drawableArr) {
            this.f12541c = drawableArr;
            if (this.f12540b > drawableArr.length - 1) {
                this.f12540b = drawableArr.length - 1;
            }
        }

        public void g(int i10) {
            this.f12540b = i10;
        }
    }

    a[] a();
}
