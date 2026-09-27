package wb;

import android.graphics.Bitmap;
import androidx.annotation.Nullable;
import com.ironsource.C4235d4;
import java.util.NavigableMap;
import k.h1;
import k.t0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
@t0(19)
public final class r implements m {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f142690d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f142691a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h<a, Bitmap> f142692b = new h<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final NavigableMap<Integer, Integer> f142693c = new o();

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @h1
    public static final class a implements n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b f142694a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f142695b;

        public a(b bVar) {
            this.f142694a = bVar;
        }

        @Override // wb.n
        public void a() {
            this.f142694a.c(this);
        }

        public void b(int i10) {
            this.f142695b = i10;
        }

        public boolean equals(Object obj) {
            return (obj instanceof a) && this.f142695b == ((a) obj).f142695b;
        }

        public int hashCode() {
            return this.f142695b;
        }

        public String toString() {
            return r.g(this.f142695b);
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

        public a e(int i10) {
            a aVar = (a) super.b();
            aVar.b(i10);
            return aVar;
        }
    }

    public static String g(int i10) {
        return C4235d4.j.f61460d + i10 + C4235d4.j.f61462e;
    }

    private static String h(Bitmap bitmap) {
        return g(pc.o.i(bitmap));
    }

    @Override // wb.m
    public String a(int i10, int i11, Bitmap.Config config) {
        return g(pc.o.h(i10, i11, config));
    }

    @Override // wb.m
    public int b(Bitmap bitmap) {
        return pc.o.i(bitmap);
    }

    @Override // wb.m
    public String c(Bitmap bitmap) {
        return h(bitmap);
    }

    @Override // wb.m
    public void d(Bitmap bitmap) {
        a aVarE = this.f142691a.e(pc.o.i(bitmap));
        this.f142692b.d(aVarE, bitmap);
        Integer num = this.f142693c.get(Integer.valueOf(aVarE.f142695b));
        this.f142693c.put(Integer.valueOf(aVarE.f142695b), Integer.valueOf(num != null ? 1 + num.intValue() : 1));
    }

    @Override // wb.m
    @Nullable
    public Bitmap e(int i10, int i11, Bitmap.Config config) {
        int iH = pc.o.h(i10, i11, config);
        a aVarE = this.f142691a.e(iH);
        Integer numCeilingKey = this.f142693c.ceilingKey(Integer.valueOf(iH));
        if (numCeilingKey != null && numCeilingKey.intValue() != iH && numCeilingKey.intValue() <= iH * 8) {
            this.f142691a.c(aVarE);
            aVarE = this.f142691a.e(numCeilingKey.intValue());
        }
        Bitmap bitmapA = this.f142692b.a(aVarE);
        if (bitmapA != null) {
            bitmapA.reconfigure(i10, i11, config);
            f(numCeilingKey);
        }
        return bitmapA;
    }

    public final void f(Integer num) {
        Integer num2 = this.f142693c.get(num);
        if (num2.intValue() == 1) {
            this.f142693c.remove(num);
        } else {
            this.f142693c.put(num, Integer.valueOf(num2.intValue() - 1));
        }
    }

    @Override // wb.m
    @Nullable
    public Bitmap removeLast() {
        Bitmap bitmapF = this.f142692b.f();
        if (bitmapF != null) {
            f(Integer.valueOf(pc.o.i(bitmapF)));
        }
        return bitmapF;
    }

    public String toString() {
        return "SizeStrategy:\n  " + this.f142692b + "\n  SortedSizes" + this.f142693c;
    }
}
