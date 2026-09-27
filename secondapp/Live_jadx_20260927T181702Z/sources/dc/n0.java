package dc;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.Build;
import android.util.Log;
import androidx.annotation.NonNull;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import k.h1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public final class n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f78766a = "TransformationUtils";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f78767b = 6;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f78769d = 7;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Paint f78771f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Set<String> f78772g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Lock f78773h;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Paint f78768c = new Paint(6);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Paint f78770e = new Paint(7);

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class a implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f78774a;

        public a(int i10) {
            this.f78774a = i10;
        }

        @Override // dc.n0.c
        public void a(Canvas canvas, Paint paint, RectF rectF) {
            int i10 = this.f78774a;
            canvas.drawRoundRect(rectF, i10, i10, paint);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class b implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ float f78775a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ float f78776b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ float f78777c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ float f78778d;

        public b(float f10, float f11, float f12, float f13) {
            this.f78775a = f10;
            this.f78776b = f11;
            this.f78777c = f12;
            this.f78778d = f13;
        }

        @Override // dc.n0.c
        public void a(Canvas canvas, Paint paint, RectF rectF) {
            Path path = new Path();
            float f10 = this.f78775a;
            float f11 = this.f78776b;
            float f12 = this.f78777c;
            float f13 = this.f78778d;
            path.addRoundRect(rectF, new float[]{f10, f10, f11, f11, f12, f12, f13, f13}, Path.Direction.CW);
            canvas.drawPath(path, paint);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface c {
        void a(Canvas canvas, Paint paint, RectF rectF);
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class d implements Lock {
        @Override // java.util.concurrent.locks.Lock
        @NonNull
        public Condition newCondition() {
            throw new UnsupportedOperationException("Should not be called");
        }

        @Override // java.util.concurrent.locks.Lock
        public boolean tryLock() {
            return true;
        }

        @Override // java.util.concurrent.locks.Lock
        public boolean tryLock(long j10, @NonNull TimeUnit timeUnit) throws InterruptedException {
            return true;
        }

        @Override // java.util.concurrent.locks.Lock
        public void lock() {
        }

        @Override // java.util.concurrent.locks.Lock
        public void lockInterruptibly() throws InterruptedException {
        }

        @Override // java.util.concurrent.locks.Lock
        public void unlock() {
        }
    }

    static {
        HashSet hashSet = new HashSet(Arrays.asList("XT1085", "XT1092", "XT1093", "XT1094", "XT1095", "XT1096", "XT1097", "XT1098", "XT1031", "XT1028", "XT937C", "XT1032", "XT1008", "XT1033", "XT1035", "XT1034", "XT939G", "XT1039", "XT1040", "XT1042", "XT1045", "XT1063", "XT1064", "XT1068", "XT1069", "XT1072", "XT1077", "XT1078", "XT1079"));
        f78772g = hashSet;
        f78773h = hashSet.contains(Build.MODEL) ? new ReentrantLock() : new d();
        Paint paint = new Paint(7);
        f78771f = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
    }

    public static void a(@NonNull Bitmap bitmap, @NonNull Bitmap bitmap2, Matrix matrix) {
        f78773h.lock();
        try {
            Canvas canvas = new Canvas(bitmap2);
            canvas.drawBitmap(bitmap, matrix, f78768c);
            e(canvas);
        } finally {
            f78773h.unlock();
        }
    }

    public static Bitmap b(@NonNull wb.e eVar, @NonNull Bitmap bitmap, int i10, int i11) {
        float width;
        float height;
        if (bitmap.getWidth() == i10 && bitmap.getHeight() == i11) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        float width2 = 0.0f;
        if (bitmap.getWidth() * i11 > bitmap.getHeight() * i10) {
            width = i11 / bitmap.getHeight();
            width2 = (i10 - (bitmap.getWidth() * width)) * 0.5f;
            height = 0.0f;
        } else {
            width = i10 / bitmap.getWidth();
            height = (i11 - (bitmap.getHeight() * width)) * 0.5f;
        }
        matrix.setScale(width, width);
        matrix.postTranslate((int) (width2 + 0.5f), (int) (height + 0.5f));
        Bitmap bitmapE = eVar.e(i10, i11, k(bitmap));
        t(bitmap, bitmapE);
        a(bitmap, bitmapE, matrix);
        return bitmapE;
    }

    public static Bitmap c(@NonNull wb.e eVar, @NonNull Bitmap bitmap, int i10, int i11) {
        if (bitmap.getWidth() > i10 || bitmap.getHeight() > i11) {
            if (Log.isLoggable(f78766a, 2)) {
                Log.v(f78766a, "requested target size too big for input, fit centering instead");
            }
            return f(eVar, bitmap, i10, i11);
        }
        if (Log.isLoggable(f78766a, 2)) {
            Log.v(f78766a, "requested target size larger or equal to input, returning input");
        }
        return bitmap;
    }

    public static Bitmap d(@NonNull wb.e eVar, @NonNull Bitmap bitmap, int i10, int i11) {
        int iMin = Math.min(i10, i11);
        float f10 = iMin;
        float f11 = f10 / 2.0f;
        float width = bitmap.getWidth();
        float height = bitmap.getHeight();
        float fMax = Math.max(f10 / width, f10 / height);
        float f12 = width * fMax;
        float f13 = fMax * height;
        float f14 = (f10 - f12) / 2.0f;
        float f15 = (f10 - f13) / 2.0f;
        RectF rectF = new RectF(f14, f15, f12 + f14, f13 + f15);
        Bitmap bitmapG = g(eVar, bitmap);
        Bitmap bitmapE = eVar.e(iMin, iMin, h(bitmap));
        bitmapE.setHasAlpha(true);
        Lock lock = f78773h;
        lock.lock();
        try {
            Canvas canvas = new Canvas(bitmapE);
            canvas.drawCircle(f11, f11, f11, f78770e);
            canvas.drawBitmap(bitmapG, (Rect) null, rectF, f78771f);
            e(canvas);
            lock.unlock();
            if (!bitmapG.equals(bitmap)) {
                eVar.d(bitmapG);
            }
            return bitmapE;
        } catch (Throwable th2) {
            f78773h.unlock();
            throw th2;
        }
    }

    public static void e(Canvas canvas) {
        canvas.setBitmap(null);
    }

    public static Bitmap f(@NonNull wb.e eVar, @NonNull Bitmap bitmap, int i10, int i11) {
        if (bitmap.getWidth() != i10 || bitmap.getHeight() != i11) {
            float fMin = Math.min(i10 / bitmap.getWidth(), i11 / bitmap.getHeight());
            int iRound = Math.round(bitmap.getWidth() * fMin);
            int iRound2 = Math.round(bitmap.getHeight() * fMin);
            if (bitmap.getWidth() != iRound || bitmap.getHeight() != iRound2) {
                Bitmap bitmapE = eVar.e((int) (bitmap.getWidth() * fMin), (int) (bitmap.getHeight() * fMin), k(bitmap));
                t(bitmap, bitmapE);
                if (Log.isLoggable(f78766a, 2)) {
                    Log.v(f78766a, "request: " + i10 + "x" + i11);
                    Log.v(f78766a, "toFit:   " + bitmap.getWidth() + "x" + bitmap.getHeight());
                    Log.v(f78766a, "toReuse: " + bitmapE.getWidth() + "x" + bitmapE.getHeight());
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("minPct:   ");
                    sb2.append(fMin);
                    Log.v(f78766a, sb2.toString());
                }
                Matrix matrix = new Matrix();
                matrix.setScale(fMin, fMin);
                a(bitmap, bitmapE, matrix);
                return bitmapE;
            }
            if (Log.isLoggable(f78766a, 2)) {
                Log.v(f78766a, "adjusted target size matches input, returning input");
            }
        } else if (Log.isLoggable(f78766a, 2)) {
            Log.v(f78766a, "requested target size matches input, returning input");
            return bitmap;
        }
        return bitmap;
    }

    public static Bitmap g(@NonNull wb.e eVar, @NonNull Bitmap bitmap) {
        Bitmap.Config configH = h(bitmap);
        if (configH.equals(bitmap.getConfig())) {
            return bitmap;
        }
        Bitmap bitmapE = eVar.e(bitmap.getWidth(), bitmap.getHeight(), configH);
        new Canvas(bitmapE).drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        return bitmapE;
    }

    @NonNull
    public static Bitmap.Config h(@NonNull Bitmap bitmap) {
        return (Build.VERSION.SDK_INT < 26 || !Bitmap.Config.RGBA_F16.equals(bitmap.getConfig())) ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGBA_F16;
    }

    public static Lock i() {
        return f78773h;
    }

    public static int j(int i10) {
        switch (i10) {
            case 3:
            case 4:
                return 180;
            case 5:
            case 6:
                return 90;
            case 7:
            case 8:
                return com.google.android.material.bottomappbar.d.f50281j;
            default:
                return 0;
        }
    }

    @NonNull
    public static Bitmap.Config k(@NonNull Bitmap bitmap) {
        return bitmap.getConfig() != null ? bitmap.getConfig() : Bitmap.Config.ARGB_8888;
    }

    @h1
    public static void l(int i10, Matrix matrix) {
        switch (i10) {
            case 2:
                matrix.setScale(-1.0f, 1.0f);
                break;
            case 3:
                matrix.setRotate(180.0f);
                break;
            case 4:
                matrix.setRotate(180.0f);
                matrix.postScale(-1.0f, 1.0f);
                break;
            case 5:
                matrix.setRotate(90.0f);
                matrix.postScale(-1.0f, 1.0f);
                break;
            case 6:
                matrix.setRotate(90.0f);
                break;
            case 7:
                matrix.setRotate(-90.0f);
                matrix.postScale(-1.0f, 1.0f);
                break;
            case 8:
                matrix.setRotate(-90.0f);
                break;
        }
    }

    public static boolean m(int i10) {
        switch (i10) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                return true;
            default:
                return false;
        }
    }

    public static Bitmap n(@NonNull Bitmap bitmap, int i10) {
        Bitmap bitmap2;
        if (i10 == 0) {
            return bitmap;
        }
        try {
            Matrix matrix = new Matrix();
            matrix.setRotate(i10);
            bitmap2 = bitmap;
            try {
                return Bitmap.createBitmap(bitmap2, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
            } catch (Exception e10) {
                e = e10;
                Exception exc = e;
                if (!Log.isLoggable(f78766a, 6)) {
                    return bitmap2;
                }
                Log.e(f78766a, "Exception when trying to orient image", exc);
                return bitmap2;
            }
        } catch (Exception e11) {
            e = e11;
            bitmap2 = bitmap;
        }
    }

    public static Bitmap o(@NonNull wb.e eVar, @NonNull Bitmap bitmap, int i10) {
        if (!m(i10)) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        l(i10, matrix);
        RectF rectF = new RectF(0.0f, 0.0f, bitmap.getWidth(), bitmap.getHeight());
        matrix.mapRect(rectF);
        Bitmap bitmapE = eVar.e(Math.round(rectF.width()), Math.round(rectF.height()), k(bitmap));
        matrix.postTranslate(-rectF.left, -rectF.top);
        bitmapE.setHasAlpha(bitmap.hasAlpha());
        a(bitmap, bitmapE, matrix);
        return bitmapE;
    }

    public static Bitmap p(@NonNull wb.e eVar, @NonNull Bitmap bitmap, float f10, float f11, float f12, float f13) {
        return s(eVar, bitmap, new b(f10, f11, f12, f13));
    }

    public static Bitmap q(@NonNull wb.e eVar, @NonNull Bitmap bitmap, int i10) {
        pc.m.b(i10 > 0, "roundingRadius must be greater than 0.");
        return s(eVar, bitmap, new a(i10));
    }

    @Deprecated
    public static Bitmap r(@NonNull wb.e eVar, @NonNull Bitmap bitmap, int i10, int i11, int i12) {
        return q(eVar, bitmap, i12);
    }

    public static Bitmap s(@NonNull wb.e eVar, @NonNull Bitmap bitmap, c cVar) {
        Bitmap.Config configH = h(bitmap);
        Bitmap bitmapG = g(eVar, bitmap);
        Bitmap bitmapE = eVar.e(bitmapG.getWidth(), bitmapG.getHeight(), configH);
        bitmapE.setHasAlpha(true);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmapG, tileMode, tileMode);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setShader(bitmapShader);
        RectF rectF = new RectF(0.0f, 0.0f, bitmapE.getWidth(), bitmapE.getHeight());
        Lock lock = f78773h;
        lock.lock();
        try {
            Canvas canvas = new Canvas(bitmapE);
            canvas.drawColor(0, PorterDuff.Mode.CLEAR);
            cVar.a(canvas, paint, rectF);
            e(canvas);
            lock.unlock();
            if (!bitmapG.equals(bitmap)) {
                eVar.d(bitmapG);
            }
            return bitmapE;
        } catch (Throwable th2) {
            f78773h.unlock();
            throw th2;
        }
    }

    public static void t(Bitmap bitmap, Bitmap bitmap2) {
        bitmap2.setHasAlpha(bitmap.hasAlpha());
    }
}
