package d8;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Rect;
import android.os.AsyncTask;
import android.util.Log;
import android.util.SparseBooleanArray;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import k.k;
import k.q0;
import k1.b0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public final class b {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f78583f = 12544;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f78584g = 16;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final float f78585h = 3.0f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final float f78586i = 4.5f;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f78587j = "Palette";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final boolean f78588k = false;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final c f78589l = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<e> f78590a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<d8.c> f78591b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final SparseBooleanArray f78593d = new SparseBooleanArray();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map<d8.c, e> f78592c = new f0.a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public final e f78594e = a();

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class a implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final float f78595a = 0.05f;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final float f78596b = 0.95f;

        @Override // d8.b.c
        public boolean a(int i10, float[] fArr) {
            return (d(fArr) || b(fArr) || c(fArr)) ? false : true;
        }

        public final boolean b(float[] fArr) {
            return fArr[2] <= 0.05f;
        }

        public final boolean c(float[] fArr) {
            float f10 = fArr[0];
            return f10 >= 10.0f && f10 <= 37.0f && fArr[1] <= 0.82f;
        }

        public final boolean d(float[] fArr) {
            return fArr[2] >= 0.95f;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface c {
        boolean a(@k int i10, @NonNull float[] fArr);
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface d {
        void a(@Nullable b bVar);
    }

    public b(List<e> list, List<d8.c> list2) {
        this.f78590a = list;
        this.f78591b = list2;
    }

    @NonNull
    public static C0768b b(@NonNull Bitmap bitmap) {
        return new C0768b(bitmap);
    }

    @NonNull
    public static b c(@NonNull List<e> list) {
        return new C0768b(list).g();
    }

    @Deprecated
    public static b d(Bitmap bitmap) {
        return b(bitmap).g();
    }

    @Deprecated
    public static b e(Bitmap bitmap, int i10) {
        return b(bitmap).i(i10).g();
    }

    @Deprecated
    public static AsyncTask<Bitmap, Void, b> g(Bitmap bitmap, int i10, d dVar) {
        return b(bitmap).i(i10).f(dVar);
    }

    @Deprecated
    public static AsyncTask<Bitmap, Void, b> h(Bitmap bitmap, d dVar) {
        return b(bitmap).f(dVar);
    }

    @NonNull
    public List<d8.c> A() {
        return Collections.unmodifiableList(this.f78591b);
    }

    @k
    public int B(@k int i10) {
        return k(d8.c.f78637z, i10);
    }

    @Nullable
    public e C() {
        return y(d8.c.f78637z);
    }

    public final boolean D(e eVar, d8.c cVar) {
        float[] fArrC = eVar.c();
        return fArrC[1] >= cVar.e() && fArrC[1] <= cVar.c() && fArrC[2] >= cVar.d() && fArrC[2] <= cVar.b() && !this.f78593d.get(eVar.e());
    }

    @Nullable
    public final e a() {
        int size = this.f78590a.size();
        int iD = Integer.MIN_VALUE;
        e eVar = null;
        for (int i10 = 0; i10 < size; i10++) {
            e eVar2 = this.f78590a.get(i10);
            if (eVar2.d() > iD) {
                iD = eVar2.d();
                eVar = eVar2;
            }
        }
        return eVar;
    }

    public void f() {
        int size = this.f78591b.size();
        for (int i10 = 0; i10 < size; i10++) {
            d8.c cVar = this.f78591b.get(i10);
            cVar.k();
            this.f78592c.put(cVar, j(cVar));
        }
        this.f78593d.clear();
    }

    public final float i(e eVar, d8.c cVar) {
        float[] fArrC = eVar.c();
        e eVar2 = this.f78594e;
        return (cVar.g() > 0.0f ? cVar.g() * (1.0f - Math.abs(fArrC[1] - cVar.i())) : 0.0f) + (cVar.a() > 0.0f ? cVar.a() * (1.0f - Math.abs(fArrC[2] - cVar.h())) : 0.0f) + (cVar.f() > 0.0f ? cVar.f() * (eVar.d() / (eVar2 != null ? eVar2.d() : 1)) : 0.0f);
    }

    @Nullable
    public final e j(d8.c cVar) {
        e eVarV = v(cVar);
        if (eVarV != null && cVar.j()) {
            this.f78593d.append(eVarV.e(), true);
        }
        return eVarV;
    }

    @k
    public int k(@NonNull d8.c cVar, @k int i10) {
        e eVarY = y(cVar);
        return eVarY != null ? eVarY.e() : i10;
    }

    @k
    public int l(@k int i10) {
        return k(d8.c.D, i10);
    }

    @Nullable
    public e m() {
        return y(d8.c.D);
    }

    @k
    public int n(@k int i10) {
        return k(d8.c.A, i10);
    }

    @Nullable
    public e o() {
        return y(d8.c.A);
    }

    @k
    public int p(@k int i10) {
        e eVar = this.f78594e;
        return eVar != null ? eVar.e() : i10;
    }

    @Nullable
    public e q() {
        return this.f78594e;
    }

    @k
    public int r(@k int i10) {
        return k(d8.c.B, i10);
    }

    @Nullable
    public e s() {
        return y(d8.c.B);
    }

    @k
    public int t(@k int i10) {
        return k(d8.c.f78636y, i10);
    }

    @Nullable
    public e u() {
        return y(d8.c.f78636y);
    }

    @Nullable
    public final e v(d8.c cVar) {
        int size = this.f78590a.size();
        float f10 = 0.0f;
        e eVar = null;
        for (int i10 = 0; i10 < size; i10++) {
            e eVar2 = this.f78590a.get(i10);
            if (D(eVar2, cVar)) {
                float fI = i(eVar2, cVar);
                if (eVar == null || fI > f10) {
                    eVar = eVar2;
                    f10 = fI;
                }
            }
        }
        return eVar;
    }

    @k
    public int w(@k int i10) {
        return k(d8.c.C, i10);
    }

    @Nullable
    public e x() {
        return y(d8.c.C);
    }

    @Nullable
    public e y(@NonNull d8.c cVar) {
        return this.f78592c.get(cVar);
    }

    @NonNull
    public List<e> z() {
        return Collections.unmodifiableList(this.f78590a);
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f78607a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f78608b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f78609c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f78610d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f78611e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f78612f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f78613g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f78614h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @Nullable
        public float[] f78615i;

        public e(@k int i10, int i11) {
            this.f78607a = Color.red(i10);
            this.f78608b = Color.green(i10);
            this.f78609c = Color.blue(i10);
            this.f78610d = i10;
            this.f78611e = i11;
        }

        public final void a() {
            if (this.f78612f) {
                return;
            }
            int iO = b0.o(-1, this.f78610d, 4.5f);
            int iO2 = b0.o(-1, this.f78610d, 3.0f);
            if (iO != -1 && iO2 != -1) {
                this.f78614h = b0.D(-1, iO);
                this.f78613g = b0.D(-1, iO2);
                this.f78612f = true;
                return;
            }
            int iO3 = b0.o(-16777216, this.f78610d, 4.5f);
            int iO4 = b0.o(-16777216, this.f78610d, 3.0f);
            if (iO3 == -1 || iO4 == -1) {
                this.f78614h = iO != -1 ? b0.D(-1, iO) : b0.D(-16777216, iO3);
                this.f78613g = iO2 != -1 ? b0.D(-1, iO2) : b0.D(-16777216, iO4);
                this.f78612f = true;
            } else {
                this.f78614h = b0.D(-16777216, iO3);
                this.f78613g = b0.D(-16777216, iO4);
                this.f78612f = true;
            }
        }

        @k
        public int b() {
            a();
            return this.f78614h;
        }

        @NonNull
        public float[] c() {
            if (this.f78615i == null) {
                this.f78615i = new float[3];
            }
            b0.e(this.f78607a, this.f78608b, this.f78609c, this.f78615i);
            return this.f78615i;
        }

        public int d() {
            return this.f78611e;
        }

        @k
        public int e() {
            return this.f78610d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && e.class == obj.getClass()) {
                e eVar = (e) obj;
                if (this.f78611e == eVar.f78611e && this.f78610d == eVar.f78610d) {
                    return true;
                }
            }
            return false;
        }

        @k
        public int f() {
            a();
            return this.f78613g;
        }

        public int hashCode() {
            return (this.f78610d * 31) + this.f78611e;
        }

        public String toString() {
            return e.class.getSimpleName() + " [RGB: #" + Integer.toHexString(e()) + fw.b.f85385l + " [HSL: " + Arrays.toString(c()) + fw.b.f85385l + " [Population: " + this.f78611e + fw.b.f85385l + " [Title Text: #" + Integer.toHexString(f()) + fw.b.f85385l + " [Body Text: #" + Integer.toHexString(b()) + fw.b.f85385l;
        }

        public e(int i10, int i11, int i12, int i13) {
            this.f78607a = i10;
            this.f78608b = i11;
            this.f78609c = i12;
            this.f78610d = Color.rgb(i10, i11, i12);
            this.f78611e = i13;
        }

        public e(float[] fArr, int i10) {
            this(b0.a(fArr), i10);
            this.f78615i = fArr;
        }
    }

    /* JADX INFO: renamed from: d8.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class C0768b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        public final List<e> f78597a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public final Bitmap f78598b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final List<d8.c> f78599c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f78600d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f78601e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f78602f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final List<c> f78603g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @Nullable
        public Rect f78604h;

        /* JADX INFO: renamed from: d8.b$b$a */
        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public class a extends AsyncTask<Bitmap, Void, b> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ d f78605a;

            public a(d dVar) {
                this.f78605a = dVar;
            }

            @Override // android.os.AsyncTask
            @Nullable
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public b doInBackground(Bitmap... bitmapArr) {
                try {
                    return C0768b.this.g();
                } catch (Exception e10) {
                    Log.e(b.f78587j, "Exception thrown during async generate", e10);
                    return null;
                }
            }

            @Override // android.os.AsyncTask
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public void onPostExecute(@Nullable b bVar) {
                this.f78605a.a(bVar);
            }
        }

        public C0768b(@NonNull Bitmap bitmap) {
            ArrayList arrayList = new ArrayList();
            this.f78599c = arrayList;
            this.f78600d = 16;
            this.f78601e = b.f78583f;
            this.f78602f = -1;
            ArrayList arrayList2 = new ArrayList();
            this.f78603g = arrayList2;
            if (bitmap == null || bitmap.isRecycled()) {
                throw new IllegalArgumentException("Bitmap is not valid");
            }
            arrayList2.add(b.f78589l);
            this.f78598b = bitmap;
            this.f78597a = null;
            arrayList.add(d8.c.f78636y);
            arrayList.add(d8.c.f78637z);
            arrayList.add(d8.c.A);
            arrayList.add(d8.c.B);
            arrayList.add(d8.c.C);
            arrayList.add(d8.c.D);
        }

        @NonNull
        public C0768b a(c cVar) {
            if (cVar != null) {
                this.f78603g.add(cVar);
            }
            return this;
        }

        @NonNull
        public C0768b b(@NonNull d8.c cVar) {
            if (!this.f78599c.contains(cVar)) {
                this.f78599c.add(cVar);
            }
            return this;
        }

        @NonNull
        public C0768b c() {
            this.f78603g.clear();
            return this;
        }

        @NonNull
        public C0768b d() {
            this.f78604h = null;
            return this;
        }

        @NonNull
        public C0768b e() {
            List<d8.c> list = this.f78599c;
            if (list != null) {
                list.clear();
            }
            return this;
        }

        @NonNull
        public AsyncTask<Bitmap, Void, b> f(@NonNull d dVar) {
            if (dVar != null) {
                return new a(dVar).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, this.f78598b);
            }
            throw new IllegalArgumentException("listener can not be null");
        }

        @NonNull
        public b g() {
            List<e> listD;
            c[] cVarArr;
            Bitmap bitmap = this.f78598b;
            if (bitmap != null) {
                Bitmap bitmapL = l(bitmap);
                Rect rect = this.f78604h;
                if (bitmapL != this.f78598b && rect != null) {
                    double width = ((double) bitmapL.getWidth()) / ((double) this.f78598b.getWidth());
                    rect.left = (int) Math.floor(((double) rect.left) * width);
                    rect.top = (int) Math.floor(((double) rect.top) * width);
                    rect.right = Math.min((int) Math.ceil(((double) rect.right) * width), bitmapL.getWidth());
                    rect.bottom = Math.min((int) Math.ceil(((double) rect.bottom) * width), bitmapL.getHeight());
                }
                int[] iArrH = h(bitmapL);
                int i10 = this.f78600d;
                if (this.f78603g.isEmpty()) {
                    cVarArr = null;
                } else {
                    List<c> list = this.f78603g;
                    cVarArr = (c[]) list.toArray(new c[list.size()]);
                }
                d8.a aVar = new d8.a(iArrH, i10, cVarArr);
                if (bitmapL != this.f78598b) {
                    bitmapL.recycle();
                }
                listD = aVar.d();
            } else {
                listD = this.f78597a;
                if (listD == null) {
                    throw new AssertionError();
                }
            }
            b bVar = new b(listD, this.f78599c);
            bVar.f();
            return bVar;
        }

        public final int[] h(Bitmap bitmap) {
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            int[] iArr = new int[width * height];
            bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
            Rect rect = this.f78604h;
            if (rect == null) {
                return iArr;
            }
            int iWidth = rect.width();
            int iHeight = this.f78604h.height();
            int[] iArr2 = new int[iWidth * iHeight];
            for (int i10 = 0; i10 < iHeight; i10++) {
                Rect rect2 = this.f78604h;
                System.arraycopy(iArr, ((rect2.top + i10) * width) + rect2.left, iArr2, i10 * iWidth, iWidth);
            }
            return iArr2;
        }

        @NonNull
        public C0768b i(int i10) {
            this.f78600d = i10;
            return this;
        }

        @NonNull
        public C0768b j(int i10) {
            this.f78601e = i10;
            this.f78602f = -1;
            return this;
        }

        @NonNull
        @Deprecated
        public C0768b k(int i10) {
            this.f78602f = i10;
            this.f78601e = -1;
            return this;
        }

        public final Bitmap l(Bitmap bitmap) {
            int iMax;
            int i10;
            double dSqrt = -1.0d;
            if (this.f78601e > 0) {
                int width = bitmap.getWidth() * bitmap.getHeight();
                int i11 = this.f78601e;
                if (width > i11) {
                    dSqrt = Math.sqrt(((double) i11) / ((double) width));
                }
            } else if (this.f78602f > 0 && (iMax = Math.max(bitmap.getWidth(), bitmap.getHeight())) > (i10 = this.f78602f)) {
                dSqrt = ((double) i10) / ((double) iMax);
            }
            return dSqrt <= 0.0d ? bitmap : Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(((double) bitmap.getWidth()) * dSqrt), (int) Math.ceil(((double) bitmap.getHeight()) * dSqrt), false);
        }

        @NonNull
        public C0768b m(@q0 int i10, @q0 int i11, @q0 int i12, @q0 int i13) {
            if (this.f78598b != null) {
                if (this.f78604h == null) {
                    this.f78604h = new Rect();
                }
                this.f78604h.set(0, 0, this.f78598b.getWidth(), this.f78598b.getHeight());
                if (!this.f78604h.intersect(i10, i11, i12, i13)) {
                    throw new IllegalArgumentException("The given region must intersect with the Bitmap's dimensions.");
                }
            }
            return this;
        }

        public C0768b(@NonNull List<e> list) {
            this.f78599c = new ArrayList();
            this.f78600d = 16;
            this.f78601e = b.f78583f;
            this.f78602f = -1;
            ArrayList arrayList = new ArrayList();
            this.f78603g = arrayList;
            if (list != null && !list.isEmpty()) {
                arrayList.add(b.f78589l);
                this.f78597a = list;
                this.f78598b = null;
                return;
            }
            throw new IllegalArgumentException("List of Swatches is not valid");
        }
    }
}
