package sg.bigo.ads.common.w;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.util.ArrayMap;
import android.util.SparseBooleanArray;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import k.k;
import k.t0;

/* JADX INFO: loaded from: classes7.dex */
@t0(api = 19)
public final class c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final b f133696b = new b() { // from class: sg.bigo.ads.common.w.c.1
        @Override // sg.bigo.ads.common.w.c.b
        public final boolean a(float[] fArr) {
            float f10 = fArr[2];
            if (f10 < 0.95f && f10 > 0.05f) {
                float f11 = fArr[1];
                if ((f11 > 0.1f || f10 < 0.55f) && ((f11 > 0.5f || f10 < 0.75f) && (f11 > 0.2f || f10 < 0.7f))) {
                    float f12 = fArr[0];
                    if (f12 < 10.0f || f12 > 37.0f || f11 > 0.82f) {
                        return true;
                    }
                }
            }
            return false;
        }
    };

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List<C1362c> f133698c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List<d> f133699d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final SparseBooleanArray f133701f = new SparseBooleanArray();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Map<d, C1362c> f133700e = new ArrayMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    final C1362c f133697a = b();

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        final Bitmap f133702a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final List<d> f133703b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f133704c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f133705d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f133706e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final List<b> f133707f;

        public a(@NonNull Bitmap bitmap) {
            ArrayList arrayList = new ArrayList();
            this.f133703b = arrayList;
            this.f133704c = 16;
            this.f133705d = d8.b.f78583f;
            this.f133706e = -1;
            ArrayList arrayList2 = new ArrayList();
            this.f133707f = arrayList2;
            if (bitmap == null || bitmap.isRecycled()) {
                throw new IllegalArgumentException("Bitmap is not valid");
            }
            arrayList2.add(c.f133696b);
            this.f133702a = bitmap;
            arrayList.add(d.f133714a);
        }
    }

    public interface b {
        boolean a(@NonNull float[] fArr);
    }

    /* JADX INFO: renamed from: sg.bigo.ads.common.w.c$c, reason: collision with other inner class name */
    public static final class C1362c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final int f133708a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int f133709b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f133710c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f133711d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final int f133712e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @Nullable
        private float[] f133713f;

        public C1362c(@k int i10, int i11) {
            this.f133710c = Color.red(i10);
            this.f133711d = Color.green(i10);
            this.f133712e = Color.blue(i10);
            this.f133708a = i10;
            this.f133709b = i11;
        }

        @NonNull
        public final float[] a() {
            if (this.f133713f == null) {
                this.f133713f = new float[3];
            }
            sg.bigo.ads.common.w.b.a(this.f133710c, this.f133711d, this.f133712e, this.f133713f);
            return this.f133713f;
        }
    }

    public c(List<C1362c> list, List<d> list2) {
        this.f133698c = list;
        this.f133699d = list2;
    }

    @NonNull
    public static a a(@NonNull Bitmap bitmap) {
        return new a(bitmap);
    }

    @Nullable
    private C1362c b() {
        int size = this.f133698c.size();
        int i10 = Integer.MIN_VALUE;
        C1362c c1362c = null;
        for (int i11 = 0; i11 < size; i11++) {
            C1362c c1362c2 = this.f133698c.get(i11);
            int i12 = c1362c2.f133709b;
            if (i12 > i10) {
                c1362c = c1362c2;
                i10 = i12;
            }
        }
        return c1362c;
    }

    /* JADX WARN: Code duplicated, block: B:52:0x00e7  */
    public final void a() {
        float f10;
        float fAbs;
        int size = this.f133699d.size();
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            d dVar = this.f133699d.get(i11);
            int length = dVar.f133717d.length;
            float f11 = 0.0f;
            float f12 = 0.0f;
            for (int i12 = i10; i12 < length; i12++) {
                float f13 = dVar.f133717d[i12];
                if (f13 > 0.0f) {
                    f12 += f13;
                }
            }
            if (f12 != 0.0f) {
                int length2 = dVar.f133717d.length;
                for (int i13 = i10; i13 < length2; i13++) {
                    float[] fArr = dVar.f133717d;
                    float f14 = fArr[i13];
                    if (f14 > 0.0f) {
                        fArr[i13] = f14 / f12;
                    }
                }
            }
            Map<d, C1362c> map = this.f133700e;
            int size2 = this.f133698c.size();
            C1362c c1362c = null;
            int i14 = i10;
            float f15 = 0.0f;
            while (i14 < size2) {
                C1362c c1362c2 = this.f133698c.get(i14);
                float[] fArrA = c1362c2.a();
                float f16 = fArrA[1];
                float[] fArr2 = dVar.f133715b;
                if (f16 < fArr2[i10] || f16 > fArr2[2]) {
                    f10 = f11;
                } else {
                    float f17 = fArrA[2];
                    float[] fArr3 = dVar.f133716c;
                    if (f17 < fArr3[i10] || f17 > fArr3[2] || this.f133701f.get(c1362c2.f133708a)) {
                        f10 = f11;
                    } else {
                        float[] fArrA2 = c1362c2.a();
                        C1362c c1362c3 = this.f133697a;
                        int i15 = c1362c3 != null ? c1362c3.f133709b : 1;
                        float f18 = dVar.f133717d[i10];
                        float fAbs2 = f18 > f11 ? f18 * (1.0f - Math.abs(fArrA2[1] - dVar.f133715b[1])) : f11;
                        float f19 = dVar.f133717d[1];
                        if (f19 > f11) {
                            f10 = f11;
                            fAbs = f19 * (1.0f - Math.abs(fArrA2[2] - dVar.f133716c[1]));
                        } else {
                            f10 = f11;
                            fAbs = f10;
                        }
                        float f20 = dVar.f133717d[2];
                        float f21 = fAbs2 + fAbs + (f20 > f10 ? f20 * (c1362c2.f133709b / i15) : f10);
                        if (c1362c == null || f21 > f15) {
                            c1362c = c1362c2;
                            f15 = f21;
                        }
                    }
                }
                i14++;
                f11 = f10;
                i10 = 0;
            }
            if (c1362c != null && dVar.f133718e) {
                this.f133701f.append(c1362c.f133708a, true);
            }
            map.put(dVar, c1362c);
            i11++;
            i10 = 0;
        }
        this.f133701f.clear();
    }
}
