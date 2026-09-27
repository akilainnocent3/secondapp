package wb;

import android.graphics.Bitmap;
import com.ironsource.C4235d4;
import k.h1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class c implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f142636a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h<a, Bitmap> f142637b = new h<>();

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @h1
    public static class a implements n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b f142638a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f142639b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f142640c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Bitmap.Config f142641d;

        public a(b bVar) {
            this.f142638a = bVar;
        }

        @Override // wb.n
        public void a() {
            this.f142638a.c(this);
        }

        public void b(int i10, int i11, Bitmap.Config config) {
            this.f142639b = i10;
            this.f142640c = i11;
            this.f142641d = config;
        }

        public boolean equals(Object obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (this.f142639b == aVar.f142639b && this.f142640c == aVar.f142640c && this.f142641d == aVar.f142641d) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            int i10 = ((this.f142639b * 31) + this.f142640c) * 31;
            Bitmap.Config config = this.f142641d;
            return i10 + (config != null ? config.hashCode() : 0);
        }

        public String toString() {
            return c.f(this.f142639b, this.f142640c, this.f142641d);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @h1
    public static class b extends d<a> {
        @Override // wb.d
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public a a() {
            return new a(this);
        }

        public a e(int i10, int i11, Bitmap.Config config) {
            a aVarB = b();
            aVarB.b(i10, i11, config);
            return aVarB;
        }
    }

    public static String f(int i10, int i11, Bitmap.Config config) {
        return C4235d4.j.f61460d + i10 + "x" + i11 + "], " + config;
    }

    public static String g(Bitmap bitmap) {
        return f(bitmap.getWidth(), bitmap.getHeight(), bitmap.getConfig());
    }

    @Override // wb.m
    public String a(int i10, int i11, Bitmap.Config config) {
        return f(i10, i11, config);
    }

    @Override // wb.m
    public int b(Bitmap bitmap) {
        return pc.o.i(bitmap);
    }

    @Override // wb.m
    public String c(Bitmap bitmap) {
        return g(bitmap);
    }

    @Override // wb.m
    public void d(Bitmap bitmap) {
        this.f142637b.d(this.f142636a.e(bitmap.getWidth(), bitmap.getHeight(), bitmap.getConfig()), bitmap);
    }

    @Override // wb.m
    public Bitmap e(int i10, int i11, Bitmap.Config config) {
        return this.f142637b.a(this.f142636a.e(i10, i11, config));
    }

    @Override // wb.m
    public Bitmap removeLast() {
        return this.f142637b.f();
    }

    public String toString() {
        return "AttributeStrategy:\n  " + this.f142637b;
    }
}
