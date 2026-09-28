package defpackage;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.RectF;
import com.sportybet.android.gp.tz.R;
import java.security.SecureRandom;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes8.dex */
public final class bsh0 {
    public static final int[] a = {R.drawable.sg_ball_0, R.drawable.sg_ball_1, R.drawable.sg_ball_2, R.drawable.sg_ball_3};
    public static final int[] b = {R.drawable.sg_target_red_0, R.drawable.sg_target_red_1, R.drawable.sg_target_red_1, R.drawable.sg_target_red_2, R.drawable.sg_target_red_2, R.drawable.sg_target_red_3, R.drawable.sg_target_red_3, R.drawable.sg_target_red_4, R.drawable.sg_target_red_4, R.drawable.sg_target_transparent};
    public static final int[] c = {R.drawable.sg_target_silver_0, R.drawable.sg_target_silver_1, R.drawable.sg_target_silver_1, R.drawable.sg_target_silver_2, R.drawable.sg_target_silver_2, R.drawable.sg_target_silver_3, R.drawable.sg_target_silver_3, R.drawable.sg_target_silver_4, R.drawable.sg_target_silver_4, R.drawable.sg_target_transparent};
    public static final int[] d = {R.drawable.sg_target_gold_0, R.drawable.sg_target_gold_1, R.drawable.sg_target_gold_1, R.drawable.sg_target_gold_2, R.drawable.sg_target_gold_2, R.drawable.sg_target_gold_3, R.drawable.sg_target_gold_3, R.drawable.sg_target_gold_4, R.drawable.sg_target_gold_4, R.drawable.sg_target_transparent};
    public static final int[] e = {R.drawable.sg_goalkeeper_0, R.drawable.sg_goalkeeper_1};
    public static final RectF[] f = {new RectF(0.11f, 0.27f, 0.89f, 0.95f), new RectF(0.36f, 0.1f, 0.64f, 0.27f)};
    public static final RectF[] g = {new RectF(0.0f, 0.0f, 0.03f, 1.0f), new RectF(0.0f, 0.0f, 1.0f, 0.04f), new RectF(0.97f, 0.0f, 1.0f, 1.0f)};
    public static final int[] h = {R.drawable.sg_coin_1, R.drawable.sg_coin_1, R.drawable.sg_coin_2, R.drawable.sg_coin_3};
    public static final int[] i = {R.drawable.sg_coin_3, R.drawable.sg_coin_3, R.drawable.sg_coin_1, R.drawable.sg_coin_2};

    public static float a(float f2, float f3, float f4, float f5) {
        float f6 = f4 - f2;
        float f7 = f5 - f3;
        if (f6 == 0.0f && f7 == 0.0f) {
            return 0.0f;
        }
        if (f6 == 0.0f) {
            return f7 < 0.0f ? 90.0f : 270.0f;
        }
        if (f7 == 0.0f) {
            return f6 < 0.0f ? 0.0f : 180.0f;
        }
        float fAtan = (float) (Math.atan(Math.abs(f6) / Math.abs(f7)) * 57.29577951308232d);
        if (f6 < 0.0f && f7 < 0.0f) {
            return 90.0f - fAtan;
        }
        if (f6 <= 0.0f || f7 >= 0.0f) {
            return (f6 >= 0.0f || f7 <= 0.0f) ? 270.0f - fAtan : 360.0f - fAtan;
        }
        return fAtan + 90.0f;
    }

    public static RectF b(float f2, float f3, float f4, float f5) {
        float f6 = f2 - (f4 * 0.5f);
        float f7 = f3 - (0.5f * f5);
        return new RectF(f6, f7, f4 + f6, f5 + f7);
    }

    public static soc c(SecureRandom secureRandom, long j, int i2, float f2, float f3, float f4, float f5, float f6, float f7) {
        float fNextInt = (secureRandom.nextInt(2) * 0.2f) + 1.0f;
        long j2 = ((long) i2) + j;
        return new soc(j2, j2 + 700, f2, f3, f4 * fNextInt, f5, f6 * fNextInt, f7);
    }

    public static BitmapFactory.Options d(Resources resources, int i2) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        try {
            BitmapFactory.decodeResource(resources, i2, options);
        } catch (OutOfMemoryError unused) {
        }
        return options;
    }

    public static int e(SecureRandom secureRandom, int i2, int i3) {
        int i4 = i3 - i2;
        return i2 + (i4 >= 10 ? secureRandom.nextInt(i4 / 10) * 10 : 0);
    }

    public static a f(float f2, float f3, float f4, float f5, float f6, float f7) {
        float fSqrt = (float) Math.sqrt(Math.pow(f3 - f6, 2.0d) + Math.pow(f2 - f5, 2.0d));
        float f8 = f7 + f4;
        if (fSqrt <= f8) {
            return new a(f2 < f5 ? (f2 + f4) - ((f8 - fSqrt) * 0.5f) : hxa.a(f8, fSqrt, 0.5f, f2 - f4), f3 < f6 ? (f3 + f4) - ((f8 - fSqrt) * 0.5f) : hxa.a(f8, fSqrt, 0.5f, f3 - f4), true);
        }
        return new a();
    }

    public static a g(bwf bwfVar, bwf bwfVar2) {
        for (RectF rectF : bwfVar.c()) {
            for (RectF rectF2 : bwfVar2.c()) {
                a aVarF = f(rectF.centerX(), rectF.centerY(), rectF.width() * 0.5f, rectF2.centerX(), rectF2.centerY(), 0.5f * rectF2.width());
                if (aVarF.c) {
                    return aVarF;
                }
            }
        }
        return new a();
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002f A[PHI: r7
      0x002f: PHI (r7v12 float) = (r7v2 float), (r7v3 float) binds: [B:9:0x002d, B:12:0x0035] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:17:0x003f A[PHI: r7
      0x003f: PHI (r7v11 float) = (r7v4 float), (r7v5 float) binds: [B:16:0x003d, B:19:0x0045] A[DONT_GENERATE, DONT_INLINE]] */
    public static a h(awf awfVar, bwf bwfVar) {
        float f2;
        float f3;
        if (awfVar != null && bwfVar != null) {
            for (RectF rectF : awfVar.c()) {
                for (RectF rectF2 : bwfVar.c()) {
                    float fCenterX = rectF2.centerX();
                    float fCenterY = rectF2.centerY();
                    float fWidth = rectF2.width() * 0.5f;
                    float f4 = rectF.left;
                    if (fCenterX < f4) {
                        f2 = f4;
                    } else {
                        f4 = rectF.right;
                        if (fCenterX > f4) {
                            f2 = f4;
                        } else {
                            f2 = fCenterX;
                        }
                    }
                    float f5 = rectF.top;
                    if (fCenterY < f5) {
                        f3 = f5;
                    } else {
                        f5 = rectF.bottom;
                        if (fCenterY > f5) {
                            f3 = f5;
                        } else {
                            f3 = fCenterY;
                        }
                    }
                    a aVar = f(f2, f3, 0.0f, fCenterX, fCenterY, fWidth).c ? new a(f2, f3, true) : new a();
                    if (aVar.c) {
                        return aVar;
                    }
                }
            }
        }
        return new a();
    }

    public static Bitmap i(Resources resources, int i2, int i3, int i4, BitmapFactory.Options options) {
        int i5;
        if (options == null) {
            options = d(resources, i2);
        }
        BitmapFactory.Options optionsD = d(resources, i2);
        int i6 = optionsD.outHeight;
        int i7 = optionsD.outWidth;
        if (i6 > i4 || i7 > i3) {
            int i8 = i6 / 2;
            int i9 = i7 / 2;
            i5 = 1;
            while (i8 / i5 >= i4 && i9 / i5 >= i3) {
                i5 *= 2;
            }
        } else {
            i5 = 1;
        }
        options.inSampleSize = i5;
        options.inJustDecodeBounds = false;
        return Bitmap.createScaledBitmap(BitmapFactory.decodeResource(resources, i2, options), i3, i4, true);
    }

    public static Bitmap[] j(Resources resources, int[] iArr, int i2, int i3, BitmapFactory.Options options) {
        ArrayList arrayList = new ArrayList();
        for (int i4 : iArr) {
            arrayList.add(i(resources, i4, i2, i3, options));
        }
        return (Bitmap[]) arrayList.toArray(new Bitmap[0]);
    }

    public static class a {
        public final float a;
        public final float b;
        public final boolean c;

        public a(float f, float f2, boolean z) {
            this.a = f;
            this.b = f2;
            this.c = z;
        }

        public a() {
            this(0.0f, 0.0f, false);
        }
    }
}
