package v3;

import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.util.SparseArray;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final SparseArray<b> f139949b = new SparseArray<>();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PorterDuffColorFilter[] f139950a = new PorterDuffColorFilter[256];

    public b(int i10, int i11, int i12) {
        for (int i13 = 0; i13 <= 255; i13++) {
            this.f139950a[i13] = new PorterDuffColorFilter(Color.argb(i13, i10, i11, i12), PorterDuff.Mode.SRC_ATOP);
        }
    }

    public static b a(int i10) {
        int iRed = Color.red(i10);
        int iGreen = Color.green(i10);
        int iBlue = Color.blue(i10);
        int iRgb = Color.rgb(iRed, iGreen, iBlue);
        SparseArray<b> sparseArray = f139949b;
        b bVar = sparseArray.get(iRgb);
        if (bVar != null) {
            return bVar;
        }
        b bVar2 = new b(iRed, iGreen, iBlue);
        sparseArray.put(iRgb, bVar2);
        return bVar2;
    }

    public ColorFilter b(float f10) {
        if (f10 < 0.0f || f10 > 1.0d) {
            return null;
        }
        return this.f139950a[(int) (f10 * 255.0f)];
    }
}
