package defpackage;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import androidx.appcompat.widget.AppCompatImageView;
import java.util.HashMap;
import kotlin.Pair;
import kotlin.ranges.c;
import kotlin.ranges.f;

/* JADX INFO: loaded from: classes7.dex */
public final class a6h {
    public o8j a;
    public int b;
    public int c;
    public int d;
    public HashMap<Integer, Pair<Integer, Integer>> e;
    public AppCompatImageView f;

    public static Bitmap a(Bitmap bitmap, float f) {
        Matrix matrix = new Matrix();
        matrix.postRotate(f);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
        bitmapCreateBitmap.getClass();
        return bitmapCreateBitmap;
    }

    /* JADX WARN: Code duplicated, block: B:144:0x02a4 A[LOOP:5: B:120:0x0249->B:144:0x02a4, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:145:0x02aa  */
    /* JADX WARN: Code duplicated, block: B:171:0x02ae A[EDGE_INSN: B:171:0x02ae->B:146:0x02ae BREAK  A[LOOP:5: B:120:0x0249->B:144:0x02a4], SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    public final boolean b(boolean z, Rect rect, Rect rect2, Bitmap bitmap, boolean z2, Pair<Float, Float> pair, Pair<Integer, Integer> pair2, int i) {
        int i2;
        float f;
        Pair<Integer, Integer> pair3;
        Pair pair4;
        Integer num;
        int i3;
        Integer num2;
        Integer num3;
        if (Rect.intersects(rect, rect2)) {
            if (!z2) {
                int iIntValue = pair2.a.intValue();
                int iIntValue2 = pair2.b.intValue();
                HashMap<Integer, Pair<Integer, Integer>> map = this.e;
                int i4 = rect2.left;
                int i5 = rect.left;
                if (i4 <= i5) {
                    i4 = i5;
                }
                int i6 = rect2.right;
                int i7 = rect.right;
                if (i6 >= i7) {
                    i6 = i7;
                }
                int i8 = rect.top;
                int i9 = rect2.top;
                if (i8 < i9) {
                    i8 = i9;
                }
                int i10 = rect2.bottom;
                int i11 = rect.bottom;
                if (i10 > i11) {
                    i10 = i11;
                }
                int i12 = z ? this.b : 1;
                float width = bitmap.getWidth() / pair.a.floatValue();
                float height = bitmap.getHeight() / pair.b.floatValue();
                while (i8 < i10) {
                    int i13 = i8 - i;
                    if (map.containsKey(Integer.valueOf(i13))) {
                        c cVarL = f.l(i12, f.n(i4, i6));
                        int i14 = cVarL.a;
                        int i15 = cVarL.b;
                        int i16 = cVarL.c;
                        if ((i16 > 0 && i14 <= i15) || (i16 < 0 && i15 <= i14)) {
                            while (true) {
                                if (map.containsKey(Integer.valueOf(i13)) && (pair3 = map.get(Integer.valueOf(i13))) != null) {
                                    i2 = i12;
                                    Integer num4 = pair3.a;
                                    if (num4 != null) {
                                        int iIntValue3 = num4.intValue();
                                        Integer num5 = pair3.b;
                                        if (num5 != null) {
                                            int iIntValue4 = num5.intValue();
                                            if (iIntValue3 <= i14 && i14 <= iIntValue4) {
                                                int i17 = (int) ((i14 - iIntValue) * width);
                                                int i18 = (int) ((i8 - iIntValue2) * height);
                                                if (i17 >= 0) {
                                                    f = width;
                                                    if (i17 < bitmap.getWidth() && i18 >= 0 && i18 < bitmap.getHeight() && bitmap.getPixel(i17, i18) != 0) {
                                                        return true;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    if (i14 != i15) {
                                        break;
                                    }
                                    i14 += i16;
                                    i12 = i2;
                                    width = f;
                                } else {
                                    i2 = i12;
                                }
                                f = width;
                                if (i14 != i15) {
                                    break;
                                    break;
                                }
                                i14 += i16;
                                i12 = i2;
                                width = f;
                            }
                        } else {
                            i2 = i12;
                            f = width;
                        }
                    } else {
                        i2 = i12;
                        f = width;
                    }
                    i8++;
                    i12 = i2;
                    width = f;
                }
                return false;
            }
            int iIntValue5 = pair2.a.intValue();
            int iIntValue6 = pair2.b.intValue();
            AppCompatImageView appCompatImageView = this.f;
            if (appCompatImageView != null) {
                int i19 = rect2.left;
                int i20 = rect.left;
                if (i19 <= i20) {
                    i19 = i20;
                }
                int i21 = rect2.right;
                int i22 = rect.right;
                if (i21 >= i22) {
                    i21 = i22;
                }
                int i23 = rect.top;
                int i24 = rect2.top;
                if (i23 < i24) {
                    i23 = i24;
                }
                int i25 = rect2.bottom;
                int i26 = rect.bottom;
                if (i25 > i26) {
                    i25 = i26;
                }
                HashMap map2 = new HashMap();
                Drawable drawable = appCompatImageView.getDrawable();
                drawable.getClass();
                Bitmap bitmapA = a(zdf.a(drawable), appCompatImageView.getRotation());
                float width2 = bitmapA.getWidth() / (appCompatImageView.getRight() - appCompatImageView.getLeft());
                float height2 = bitmapA.getHeight() / (appCompatImageView.getBottom() - appCompatImageView.getTop());
                for (int i27 = i23; i27 < i25; i27++) {
                    int i28 = i19;
                    while (i28 < i21) {
                        int x = (int) ((i28 - ((int) appCompatImageView.getX())) * width2);
                        AppCompatImageView appCompatImageView2 = appCompatImageView;
                        int y = (int) ((i27 - ((int) appCompatImageView2.getY())) * height2);
                        int i29 = iIntValue6;
                        if (x < 0 || x >= bitmapA.getWidth() || y < 0 || y >= bitmapA.getHeight() || bitmapA.getPixel(x, y) == 0) {
                            i3 = i28;
                        } else if (map2.containsKey(Integer.valueOf(i27))) {
                            Pair pair5 = (Pair) map2.get(Integer.valueOf(i27));
                            Integer numValueOf = pair5 != null ? (Integer) pair5.a : null;
                            Integer num6 = pair5 != null ? (Integer) pair5.b : null;
                            if (pair5 != null && (num3 = (Integer) pair5.a) != null && i28 < num3.intValue()) {
                                numValueOf = Integer.valueOf(i28);
                            }
                            Integer numValueOf2 = (pair5 == null || (num2 = (Integer) pair5.b) == null || i28 <= num2.intValue()) ? num6 : Integer.valueOf(i28);
                            i3 = i28;
                            map2.put(Integer.valueOf(i27), new Pair(numValueOf, numValueOf2));
                        } else {
                            i3 = i28;
                            map2.put(Integer.valueOf(i27), new Pair(Integer.valueOf(i3), Integer.valueOf(i3)));
                        }
                        i28 = i3 + 1;
                        appCompatImageView = appCompatImageView2;
                        iIntValue6 = i29;
                    }
                }
                int i30 = iIntValue6;
                float width3 = bitmap.getWidth() / pair.a.floatValue();
                float height3 = bitmap.getHeight() / pair.b.floatValue();
                while (i23 < i25) {
                    if (map2.containsKey(Integer.valueOf(i23))) {
                        for (int i31 = i19; i31 < i21; i31++) {
                            if (map2.containsKey(Integer.valueOf(i23)) && (pair4 = (Pair) map2.get(Integer.valueOf(i23))) != null && (num = (Integer) pair4.a) != null) {
                                int iIntValue7 = num.intValue();
                                Integer num7 = (Integer) pair4.b;
                                if (num7 != null) {
                                    int iIntValue8 = num7.intValue();
                                    if (iIntValue7 <= i31 && i31 <= iIntValue8) {
                                        int i32 = (int) ((i31 - iIntValue5) * width3);
                                        int i33 = (int) ((i23 - i30) * height3);
                                        if (i32 >= 0 && i32 < bitmap.getWidth() && i33 >= 0 && i33 < bitmap.getHeight() && bitmap.getPixel(i32, i33) != 0) {
                                            map2.clear();
                                            return true;
                                        }
                                    }
                                } else {
                                    continue;
                                }
                            }
                        }
                    }
                    i23++;
                }
                map2.clear();
                return false;
            }
        }
        return false;
    }
}
