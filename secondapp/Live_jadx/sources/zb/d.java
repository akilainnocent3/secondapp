package zb;

import android.graphics.Bitmap;
import androidx.annotation.Nullable;
import k.h1;
import pc.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public final class d {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @h1
    public static final Bitmap.Config f160967e = Bitmap.Config.RGB_565;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f160968a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f160969b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Bitmap.Config f160970c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f160971d;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f160972a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f160973b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Bitmap.Config f160974c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f160975d;

        public a(int i10) {
            this(i10, i10);
        }

        public d a() {
            return new d(this.f160972a, this.f160973b, this.f160974c, this.f160975d);
        }

        public Bitmap.Config b() {
            return this.f160974c;
        }

        public a c(@Nullable Bitmap.Config config) {
            this.f160974c = config;
            return this;
        }

        public a d(int i10) {
            if (i10 <= 0) {
                throw new IllegalArgumentException("Weight must be > 0");
            }
            this.f160975d = i10;
            return this;
        }

        public a(int i10, int i11) {
            this.f160975d = 1;
            if (i10 <= 0) {
                throw new IllegalArgumentException("Width must be > 0");
            }
            if (i11 <= 0) {
                throw new IllegalArgumentException("Height must be > 0");
            }
            this.f160972a = i10;
            this.f160973b = i11;
        }
    }

    public d(int i10, int i11, Bitmap.Config config, int i12) {
        this.f160970c = (Bitmap.Config) m.f(config, "Config must not be null");
        this.f160968a = i10;
        this.f160969b = i11;
        this.f160971d = i12;
    }

    public Bitmap.Config a() {
        return this.f160970c;
    }

    public int b() {
        return this.f160969b;
    }

    public int c() {
        return this.f160971d;
    }

    public int d() {
        return this.f160968a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof d) {
            d dVar = (d) obj;
            if (this.f160969b == dVar.f160969b && this.f160968a == dVar.f160968a && this.f160971d == dVar.f160971d && this.f160970c == dVar.f160970c) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (((((this.f160968a * 31) + this.f160969b) * 31) + this.f160970c.hashCode()) * 31) + this.f160971d;
    }

    public String toString() {
        return "PreFillSize{width=" + this.f160968a + ", height=" + this.f160969b + ", config=" + this.f160970c + ", weight=" + this.f160971d + fw.b.f85383j;
    }
}
