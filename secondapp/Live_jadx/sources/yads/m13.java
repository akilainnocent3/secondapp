package yads;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.preference.PreferenceManager;
import android.widget.ImageView;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class m13 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i13 f152260a = new i13();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Matrix f152261b = new Matrix();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Paint f152262c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Rect f152263d;

    public m13() {
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(Color.parseColor("#2E7D32"));
        paint.setStrokeWidth(10.0f);
        this.f152262c = paint;
        this.f152263d = new Rect();
    }

    public final void a(ImageView imageView, Bitmap bitmap, g13 g13Var) {
        float f10;
        float fFloatValue;
        Float fValueOf;
        float fFloatValue2;
        float width = imageView.getWidth();
        float height = imageView.getHeight();
        float width2 = bitmap.getWidth();
        float height2 = bitmap.getHeight();
        Float fValueOf2 = Float.valueOf(0.0f);
        if (height == 0.0f || height2 == 0.0f) {
            return;
        }
        boolean z10 = width / height > width2 / height2;
        float f11 = z10 ? width / width2 : height / height2;
        float f12 = width2 * f11;
        float f13 = height2 * f11;
        if (z10) {
            fFloatValue = 0.0f;
            f10 = 0.0f;
        } else {
            f10 = 0.0f;
            fFloatValue = (width / 2) - (((g13Var.f149344c / 2) + g13Var.f149342a) * f11);
            if (fFloatValue > 0.0f) {
                fValueOf = fValueOf2;
            } else {
                fValueOf = fFloatValue + f12 < width ? Float.valueOf(width - f12) : null;
            }
            if (fValueOf != null) {
                fFloatValue = fValueOf.floatValue();
            }
        }
        if (z10) {
            float f14 = (height / 2) - (((g13Var.f149345d / 2) + g13Var.f149343b) * f11);
            if (f14 <= f10) {
                fValueOf2 = f14 + f13 < height ? Float.valueOf(height - f13) : null;
            }
            fFloatValue2 = fValueOf2 != null ? fValueOf2.floatValue() : f14;
        } else {
            fFloatValue2 = f10;
        }
        this.f152261b.setScale(f11, f11);
        this.f152261b.postTranslate(fFloatValue, fFloatValue2);
        imageView.setScaleType(ImageView.ScaleType.MATRIX);
        imageView.setImageMatrix(this.f152261b);
        i13 i13Var = this.f152260a;
        Context context = imageView.getContext();
        i13Var.getClass();
        if (PreferenceManager.getDefaultSharedPreferences(context).getBoolean("preference_smart_centers_debug_enabled", false)) {
            Bitmap bitmapCopy = bitmap.copy(Bitmap.Config.ARGB_8888, true);
            Canvas canvas = new Canvas(bitmapCopy);
            Rect rect = this.f152263d;
            int i10 = g13Var.f149342a;
            int i11 = g13Var.f149343b;
            rect.set(i10, i11, g13Var.f149344c + i10, g13Var.f149345d + i11);
            canvas.drawRect(rect, this.f152262c);
            imageView.setImageBitmap(bitmapCopy);
        }
    }
}
