package mi;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import k.y0;
import k1.b0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
@y0({y0.a.LIBRARY_GROUP})
public class b {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f107510i = 68;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f107511j = 20;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f107512k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int[] f107513l = new int[3];

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final float[] f107514m = {0.0f, 0.5f, 1.0f};

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int[] f107515n = new int[4];

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final float[] f107516o = {0.0f, 0.0f, 0.5f, 1.0f};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final Paint f107517a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final Paint f107518b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final Paint f107519c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f107520d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f107521e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f107522f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Path f107523g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Paint f107524h;

    public b() {
        this(-16777216);
    }

    public void a(@NonNull Canvas canvas, @Nullable Matrix matrix, @NonNull RectF rectF, int i10, float f10, float f11) {
        float f12;
        boolean z10 = f11 < 0.0f;
        Path path = this.f107523g;
        if (z10) {
            int[] iArr = f107515n;
            iArr[0] = 0;
            iArr[1] = this.f107522f;
            iArr[2] = this.f107521e;
            iArr[3] = this.f107520d;
            f12 = f10;
        } else {
            path.rewind();
            path.moveTo(rectF.centerX(), rectF.centerY());
            f12 = f10;
            path.arcTo(rectF, f12, f11);
            path.close();
            float f13 = -i10;
            rectF.inset(f13, f13);
            int[] iArr2 = f107515n;
            iArr2[0] = 0;
            iArr2[1] = this.f107520d;
            iArr2[2] = this.f107521e;
            iArr2[3] = this.f107522f;
        }
        float fWidth = rectF.width() / 2.0f;
        if (fWidth <= 0.0f) {
            return;
        }
        float f14 = 1.0f - (i10 / fWidth);
        float[] fArr = f107516o;
        fArr[1] = f14;
        fArr[2] = ((1.0f - f14) / 2.0f) + f14;
        this.f107518b.setShader(new RadialGradient(rectF.centerX(), rectF.centerY(), fWidth, f107515n, fArr, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        canvas.scale(1.0f, rectF.height() / rectF.width());
        if (!z10) {
            canvas.clipPath(path, Region.Op.DIFFERENCE);
            canvas.drawPath(path, this.f107524h);
        }
        canvas.drawArc(rectF, f12, f11, true, this.f107518b);
        canvas.restore();
    }

    public void b(@NonNull Canvas canvas, @Nullable Matrix matrix, @NonNull RectF rectF, int i10) {
        rectF.bottom += i10;
        rectF.offset(0.0f, -i10);
        int[] iArr = f107513l;
        iArr[0] = this.f107522f;
        iArr[1] = this.f107521e;
        iArr[2] = this.f107520d;
        Paint paint = this.f107519c;
        float f10 = rectF.left;
        paint.setShader(new LinearGradient(f10, rectF.top, f10, rectF.bottom, iArr, f107514m, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        canvas.drawRect(rectF, this.f107519c);
        canvas.restore();
    }

    public void c(@NonNull Canvas canvas, @Nullable Matrix matrix, @NonNull RectF rectF, int i10, float f10, float f11, @NonNull float[] fArr) {
        if (f11 > 0.0f) {
            f10 += f11;
            f11 = -f11;
        }
        float f12 = f10;
        float f13 = f11;
        a(canvas, matrix, rectF, i10, f12, f13);
        Path path = this.f107523g;
        path.rewind();
        path.moveTo(fArr[0], fArr[1]);
        path.arcTo(rectF, f12, f13);
        path.close();
        canvas.save();
        canvas.concat(matrix);
        canvas.scale(1.0f, rectF.height() / rectF.width());
        canvas.drawPath(path, this.f107524h);
        canvas.drawPath(path, this.f107517a);
        canvas.restore();
    }

    @NonNull
    public Paint d() {
        return this.f107517a;
    }

    public void e(int i10) {
        this.f107520d = b0.D(i10, 68);
        this.f107521e = b0.D(i10, 20);
        this.f107522f = b0.D(i10, 0);
        this.f107517a.setColor(this.f107520d);
    }

    public b(int i10) {
        this.f107523g = new Path();
        Paint paint = new Paint();
        this.f107524h = paint;
        this.f107517a = new Paint();
        e(i10);
        paint.setColor(0);
        Paint paint2 = new Paint(4);
        this.f107518b = paint2;
        paint2.setStyle(Paint.Style.FILL);
        this.f107519c = new Paint(paint2);
    }
}
