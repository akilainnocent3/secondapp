package com.sportygames.commons.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build;
import android.text.Layout;
import android.text.SpannableString;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.view.View;
import com.sportybet.android.gp.tz.R;
import com.sportygames.commons.models.OnboardingFocusBox;
import defpackage.o2g;
import defpackage.tk30;
import defpackage.uwx;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.f;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0017\u0018\u00002\u00020\u0001:\u0001RJ\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\u0007\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014¢\u0006\u0004\b\u0007\u0010\u0006J\u0019\u0010\b\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014¢\u0006\u0004\b\b\u0010\u0006R$\u0010\u0010\u001a\u0004\u0018\u00010\t8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR$\u0010\u0014\u001a\u0004\u0018\u00010\t8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u000b\u001a\u0004\b\u0012\u0010\r\"\u0004\b\u0013\u0010\u000fR$\u0010\u0018\u001a\u0004\u0018\u00010\t8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u000b\u001a\u0004\b\u0016\u0010\r\"\u0004\b\u0017\u0010\u000fR\u001a\u0010\u001d\u001a\u00020\u00198\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010#\u001a\u00020\u001e8\u0014X\u0094D¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u001a\u0010&\u001a\u00020\u00198\u0014X\u0094D¢\u0006\f\n\u0004\b$\u0010\u001a\u001a\u0004\b%\u0010\u001cR\u001a\u0010)\u001a\u00020\u001e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b'\u0010 \u001a\u0004\b(\u0010\"R\u001a\u0010,\u001a\u00020\u001e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b*\u0010 \u001a\u0004\b+\u0010\"R\u001a\u0010/\u001a\u00020\u001e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b-\u0010 \u001a\u0004\b.\u0010\"R\u001a\u00102\u001a\u00020\u001e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b0\u0010 \u001a\u0004\b1\u0010\"R&\u00109\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u000204038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R$\u0010A\u001a\u0004\u0018\u00010:8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R$\u0010E\u001a\u0004\u0018\u00010:8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\bB\u0010<\u001a\u0004\bC\u0010>\"\u0004\bD\u0010@R$\u0010I\u001a\u0004\u0018\u00010:8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\bF\u0010<\u001a\u0004\bG\u0010>\"\u0004\bH\u0010@R\u001a\u0010J\u001a\u0002048\u0016X\u0096D¢\u0006\f\n\u0004\bJ\u0010'\u001a\u0004\bK\u0010LR\u001a\u0010N\u001a\u00020M8\u0016X\u0096D¢\u0006\f\n\u0004\bN\u0010O\u001a\u0004\bP\u0010Q¨\u0006S"}, d2 = {"Lcom/sportygames/commons/views/DynamicOnboardingScreenBasicBase;", "Landroid/view/View;", "Landroid/graphics/Canvas;", "canvas", "", "setupFocusBox", "(Landroid/graphics/Canvas;)V", "setupImage", "setupText", "Lcom/sportygames/commons/models/OnboardingFocusBox;", "i", "Lcom/sportygames/commons/models/OnboardingFocusBox;", "getFocusBoxPrimary", "()Lcom/sportygames/commons/models/OnboardingFocusBox;", "setFocusBoxPrimary", "(Lcom/sportygames/commons/models/OnboardingFocusBox;)V", "focusBoxPrimary", "v", "getFocusBoxSecondary", "setFocusBoxSecondary", "focusBoxSecondary", "w", "getFocusBoxTertiary", "setFocusBoxTertiary", "focusBoxTertiary", "", "F", "getTEXT_SIZE", "()F", "TEXT_SIZE", "", "G", "Ljava/lang/String;", "getONBOARDING_BG_COLOR_HEX", "()Ljava/lang/String;", "ONBOARDING_BG_COLOR_HEX", "H", "getSTROKE_WIDTH", "STROKE_WIDTH", "I", "getBITMAP_KEY", "BITMAP_KEY", "J", "getDEFAULT_URL", "DEFAULT_URL", "K", "getTEXT_KEY", "TEXT_KEY", "L", "getDEFAULT_TEXT", "DEFAULT_TEXT", "", "", "M", "Ljava/util/Map;", "getWORDS_COLOR_MAP", "()Ljava/util/Map;", "WORDS_COLOR_MAP", "Landroid/graphics/RectF;", "N", "Landroid/graphics/RectF;", "getFocusRoundRectPrimary", "()Landroid/graphics/RectF;", "setFocusRoundRectPrimary", "(Landroid/graphics/RectF;)V", "focusRoundRectPrimary", "O", "getFocusRoundRectSecondary", "setFocusRoundRectSecondary", "focusRoundRectSecondary", "P", "getFocusRoundRectTertiary", "setFocusRoundRectTertiary", "focusRoundRectTertiary", "BITMAP_ID", "getBITMAP_ID", "()I", "", "noBorder", "Z", "getNoBorder", "()Z", "a", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public class DynamicOnboardingScreenBasicBase extends View {
    public String A;
    public boolean B;
    public boolean C;
    public a D;
    public int E;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public final float TEXT_SIZE;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public final String ONBOARDING_BG_COLOR_HEX;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public final float STROKE_WIDTH;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public final String BITMAP_KEY;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    public final String DEFAULT_URL;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public final String TEXT_KEY;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    public final String DEFAULT_TEXT;
    public final o2g M;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    public RectF focusRoundRectPrimary;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    public RectF focusRoundRectSecondary;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    public RectF focusRoundRectTertiary;
    public final Paint a;
    public final Paint b;
    public final Paint c;
    public final TextPaint d;
    public final Paint e;
    public final Path f;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public OnboardingFocusBox focusBoxPrimary;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    public OnboardingFocusBox focusBoxSecondary;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    public OnboardingFocusBox focusBoxTertiary;
    public Bitmap y;
    public StaticLayout z;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        public static final a a;
        public static final a b;
        public static final a c;
        public static final /* synthetic */ a[] d;

        static {
            a aVar = new a("ALIGN_TOP", 0);
            a = aVar;
            a aVar2 = new a("ALIGN_CENTER", 1);
            b = aVar2;
            a aVar3 = new a("ALIGN_BOTTOM", 2);
            c = aVar3;
            d = new a[]{aVar, aVar2, aVar3};
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) d.clone();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DynamicOnboardingScreenBasicBase(Context context, AttributeSet attributeSet, int i, int i2) {
        Typeface typefaceCreate;
        super(context, attributeSet, i, i2);
        context.getClass();
        this.f = new Path();
        this.D = a.a;
        this.TEXT_SIZE = context.getResources().getDimension(R.dimen._17ssp);
        this.ONBOARDING_BG_COLOR_HEX = "#CC000000";
        this.STROKE_WIDTH = 8.0f;
        this.BITMAP_KEY = new String();
        this.DEFAULT_URL = new String();
        this.TEXT_KEY = new String();
        this.DEFAULT_TEXT = new String();
        o2g o2gVar = o2g.a;
        o2gVar.getClass();
        this.M = o2gVar;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, tk30.d, i, i2);
        typedArrayObtainStyledAttributes.getClass();
        int i3 = 0;
        try {
            int i4 = typedArrayObtainStyledAttributes.getInt(0, 900);
            boolean z = typedArrayObtainStyledAttributes.getBoolean(1, true);
            typedArrayObtainStyledAttributes.recycle();
            Paint paint = new Paint();
            this.a = paint;
            paint.setColor(0);
            Paint paint2 = new Paint();
            this.b = paint2;
            paint2.setColor(0);
            Paint paint3 = new Paint();
            this.c = paint3;
            paint3.setStyle(Paint.Style.STROKE);
            Paint paint4 = this.c;
            if (paint4 == null) {
                Intrinsics.n("borderRectangle");
                throw null;
            }
            paint4.setColor(-1);
            Paint paint5 = this.c;
            if (paint5 == null) {
                Intrinsics.n("borderRectangle");
                throw null;
            }
            paint5.setStrokeWidth(getSTROKE_WIDTH());
            TextPaint textPaint = new TextPaint();
            this.d = textPaint;
            textPaint.setAntiAlias(true);
            TextPaint textPaint2 = this.d;
            if (textPaint2 == null) {
                Intrinsics.n("textPaint");
                throw null;
            }
            textPaint2.setTextSize(getTEXT_SIZE());
            TextPaint textPaint3 = this.d;
            if (textPaint3 == null) {
                Intrinsics.n("textPaint");
                throw null;
            }
            textPaint3.setColor(-1);
            TextPaint textPaint4 = this.d;
            if (textPaint4 == null) {
                Intrinsics.n("textPaint");
                throw null;
            }
            int iE = f.e(i4, 1, 1000);
            if (Build.VERSION.SDK_INT >= 28) {
                typefaceCreate = Typeface.create(Typeface.DEFAULT, iE, z);
                typefaceCreate.getClass();
            } else {
                boolean z2 = iE >= 600;
                if (z && z2) {
                    i3 = 3;
                } else if (z) {
                    i3 = 2;
                } else if (z2) {
                    i3 = 1;
                }
                typefaceCreate = Typeface.create(Typeface.DEFAULT, i3);
                typefaceCreate.getClass();
            }
            textPaint4.setTypeface(typefaceCreate);
            Paint paint6 = new Paint();
            this.e = paint6;
            paint6.setAntiAlias(true);
            Paint paint7 = this.e;
            if (paint7 == null) {
                Intrinsics.n("imagePaint");
                throw null;
            }
            paint7.setFilterBitmap(true);
            Paint paint8 = this.e;
            if (paint8 == null) {
                Intrinsics.n("imagePaint");
                throw null;
            }
            paint8.setDither(true);
            setClickable(true);
            setFocusable(true);
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    public static /* synthetic */ void h(DynamicOnboardingScreenBasicBase dynamicOnboardingScreenBasicBase, int i, int i2, Layout.Alignment alignment, a aVar, int i3) {
        if ((i3 & 4) != 0) {
            alignment = Layout.Alignment.ALIGN_CENTER;
        }
        if ((i3 & 8) != 0) {
            aVar = a.a;
        }
        dynamicOnboardingScreenBasicBase.g(i, i2, alignment, aVar);
    }

    public final int a(float f) {
        return (int) (f * getResources().getDisplayMetrics().density);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0075  */
    /* JADX WARN: Code duplicated, block: B:63:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:93:0x0159  */
    public final void b(Canvas canvas, Float f, Float f2, Float f3, Float f4, Float f5, Float f6, Float f7, Float f8, Float f9, Float f10, Float f11, Float f12, Float f13, Float f14, Float f15, Float f16, Float f17, Float f18) {
        RectF rectF;
        RectF rectF2;
        RectF rectF3;
        if (canvas == null) {
            return;
        }
        if (f != null && f2 != null && f3 != null && f4 != null) {
            if (f.floatValue() < 0.0f || f2.floatValue() < 0.0f || f3.floatValue() <= 0.0f || f4.floatValue() <= 0.0f || f3.floatValue() < f.floatValue() || f4.floatValue() < f2.floatValue()) {
                rectF3 = null;
            } else {
                if ((f5 != null ? f5.floatValue() : 0.0f) < 0.0f) {
                    rectF3 = null;
                } else {
                    if ((f6 != null ? f6.floatValue() : 0.0f) < 0.0f) {
                        rectF3 = null;
                    } else {
                        rectF3 = new RectF(f.floatValue(), f2.floatValue(), f3.floatValue(), f4.floatValue());
                    }
                }
            }
            this.focusRoundRectPrimary = rectF3;
        }
        if (f7 != null && f8 != null && f9 != null && f10 != null) {
            if (f7.floatValue() < 0.0f || f8.floatValue() < 0.0f || f9.floatValue() <= 0.0f || f10.floatValue() <= 0.0f || f9.floatValue() < f7.floatValue() || f10.floatValue() < f8.floatValue()) {
                rectF2 = null;
            } else {
                if ((f11 != null ? f11.floatValue() : 0.0f) < 0.0f) {
                    rectF2 = null;
                } else {
                    if ((f12 != null ? f12.floatValue() : 0.0f) < 0.0f) {
                        rectF2 = null;
                    } else {
                        rectF2 = new RectF(f7.floatValue(), f8.floatValue(), f9.floatValue(), f10.floatValue());
                    }
                }
            }
            this.focusRoundRectSecondary = rectF2;
        }
        if (f13 != null && f14 != null && f15 != null && f16 != null) {
            if (f13.floatValue() < 0.0f || f14.floatValue() < 0.0f || f15.floatValue() <= 0.0f || f16.floatValue() <= 0.0f || f15.floatValue() < f13.floatValue() || f16.floatValue() < f14.floatValue()) {
                rectF = null;
            } else {
                if ((f17 != null ? f17.floatValue() : 0.0f) < 0.0f) {
                    rectF = null;
                } else {
                    if ((f18 != null ? f18.floatValue() : 0.0f) < 0.0f) {
                        rectF = null;
                    } else {
                        rectF = new RectF(f13.floatValue(), f14.floatValue(), f15.floatValue(), f16.floatValue());
                    }
                }
            }
            this.focusRoundRectTertiary = rectF;
        }
        Path path = this.f;
        path.reset();
        RectF rectF4 = this.focusRoundRectPrimary;
        if (rectF4 != null) {
            path.addRoundRect(rectF4, f5 != null ? f5.floatValue() : 0.0f, f6 != null ? f6.floatValue() : 0.0f, Path.Direction.CW);
        }
        RectF rectF5 = this.focusRoundRectSecondary;
        if (rectF5 != null) {
            path.addRoundRect(rectF5, f11 != null ? f11.floatValue() : 0.0f, f12 != null ? f12.floatValue() : 0.0f, Path.Direction.CW);
        }
        RectF rectF6 = this.focusRoundRectTertiary;
        if (rectF6 != null) {
            path.addRoundRect(rectF6, f17 != null ? f17.floatValue() : 0.0f, f18 != null ? f18.floatValue() : 0.0f, Path.Direction.CW);
        }
        path.setFillType(Path.FillType.INVERSE_EVEN_ODD);
        Paint paint = this.b;
        if (paint == null) {
            Intrinsics.n("semiBlackPaint");
            throw null;
        }
        canvas.drawPath(path, paint);
        canvas.clipPath(path);
        canvas.drawColor(Color.parseColor(getONBOARDING_BG_COLOR_HEX()));
        setupImage(canvas);
        setupText(canvas);
        RectF rectF7 = this.focusRoundRectPrimary;
        Paint paint2 = this.c;
        Paint paint3 = this.a;
        if (rectF7 != null) {
            float fFloatValue = f5 != null ? f5.floatValue() : 0.0f;
            float fFloatValue2 = f6 != null ? f6.floatValue() : 0.0f;
            if (paint3 == null) {
                Intrinsics.n("transparentPaint");
                throw null;
            }
            canvas.drawRoundRect(rectF7, fFloatValue, fFloatValue2, paint3);
            if (!getNoBorder()) {
                float fFloatValue3 = f5 != null ? f5.floatValue() : 0.0f;
                float fFloatValue4 = f6 != null ? f6.floatValue() : 0.0f;
                if (paint2 == null) {
                    Intrinsics.n("borderRectangle");
                    throw null;
                }
                canvas.drawRoundRect(rectF7, fFloatValue3, fFloatValue4, paint2);
            }
        }
        RectF rectF8 = this.focusRoundRectSecondary;
        if (rectF8 != null) {
            float fFloatValue5 = f11 != null ? f11.floatValue() : 0.0f;
            float fFloatValue6 = f12 != null ? f12.floatValue() : 0.0f;
            if (paint3 == null) {
                Intrinsics.n("transparentPaint");
                throw null;
            }
            canvas.drawRoundRect(rectF8, fFloatValue5, fFloatValue6, paint3);
            if (!getNoBorder()) {
                float fFloatValue7 = f11 != null ? f11.floatValue() : 0.0f;
                float fFloatValue8 = f12 != null ? f12.floatValue() : 0.0f;
                if (paint2 == null) {
                    Intrinsics.n("borderRectangle");
                    throw null;
                }
                canvas.drawRoundRect(rectF8, fFloatValue7, fFloatValue8, paint2);
            }
        }
        RectF rectF9 = this.focusRoundRectTertiary;
        if (rectF9 != null) {
            float fFloatValue9 = f17 != null ? f17.floatValue() : 0.0f;
            float fFloatValue10 = f18 != null ? f18.floatValue() : 0.0f;
            if (paint3 == null) {
                Intrinsics.n("transparentPaint");
                throw null;
            }
            canvas.drawRoundRect(rectF9, fFloatValue9, fFloatValue10, paint3);
            if (getNoBorder()) {
                return;
            }
            float fFloatValue11 = f17 != null ? f17.floatValue() : 0.0f;
            float fFloatValue12 = f18 != null ? f18.floatValue() : 0.0f;
            if (paint2 != null) {
                canvas.drawRoundRect(rectF9, fFloatValue11, fFloatValue12, paint2);
            } else {
                Intrinsics.n("borderRectangle");
                throw null;
            }
        }
    }

    public final void d(Canvas canvas, float f, float f2) {
        if (this.B) {
            try {
                Bitmap bitmap = this.y;
                if (bitmap == null || canvas == null) {
                    return;
                }
                Paint paint = this.e;
                if (paint != null) {
                    canvas.drawBitmap(bitmap, f, f2, paint);
                } else {
                    Intrinsics.n("imagePaint");
                    throw null;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public final void e(Canvas canvas, float f, float f2) {
        StaticLayout staticLayout;
        if (!this.C || canvas == null) {
            return;
        }
        float height = 0.0f;
        if (f < 0.0f || f2 < 0.0f || this.E <= 0 || (staticLayout = this.z) == null) {
            return;
        }
        try {
            if (staticLayout.getHeight() <= this.E) {
                int iOrdinal = this.D.ordinal();
                if (iOrdinal != 0) {
                    if (iOrdinal == 1) {
                        height = (this.E - staticLayout.getHeight()) / 2.0f;
                    } else {
                        if (iOrdinal != 2) {
                            throw new uwx();
                        }
                        height = this.E - staticLayout.getHeight();
                    }
                }
                f2 += height;
            }
            canvas.save();
            canvas.translate(f, f2);
            staticLayout.draw(canvas);
            canvas.restore();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public final void f(int i, int i2) {
        Bitmap bitmap;
        if (i <= 0 || i2 <= 0 || (bitmap = this.y) == null) {
            return;
        }
        this.y = Bitmap.createScaledBitmap(bitmap, i, i2, true);
        this.B = true;
    }

    public final void g(int i, int i2, Layout.Alignment alignment, a aVar) {
        alignment.getClass();
        aVar.getClass();
        if (i <= 0 || i2 <= 0) {
            return;
        }
        this.E = i2;
        this.D = aVar;
        String str = this.A;
        if (str == null) {
            return;
        }
        SpannableString spannableString = new SpannableString(str);
        try {
            for (Map.Entry<String, Integer> entry : getWORDS_COLOR_MAP().entrySet()) {
                String key = entry.getKey();
                int iIntValue = entry.getValue().intValue();
                int iT = StringsKt.T(str, key, 0, false, 6);
                if (iT != -1) {
                    spannableString.setSpan(new ForegroundColorSpan(iIntValue), iT, key.length() + iT, 33);
                }
            }
            while (true) {
                TextPaint textPaint = this.d;
                if (textPaint == null) {
                    Intrinsics.n("textPaint");
                    throw null;
                }
                int i3 = i;
                Layout.Alignment alignment2 = alignment;
                this.z = new StaticLayout(spannableString, textPaint, i3, alignment2, 1.0f, 0.0f, false);
                TextPaint textPaint2 = this.d;
                if (textPaint2 == null) {
                    Intrinsics.n("textPaint");
                    throw null;
                }
                float textSize = textPaint2.getTextSize();
                if (textSize >= 0.0f) {
                    if (textPaint2 == null) {
                        Intrinsics.n("textPaint");
                        throw null;
                    }
                    textPaint2.setTextSize(textSize - 1.0f);
                    StaticLayout staticLayout = this.z;
                    if (staticLayout != null && staticLayout.getHeight() > i2) {
                        i = i3;
                        alignment = alignment2;
                    }
                }
                this.C = true;
                return;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public int getBITMAP_ID() {
        return 0;
    }

    public String getBITMAP_KEY() {
        return this.BITMAP_KEY;
    }

    public String getDEFAULT_TEXT() {
        return this.DEFAULT_TEXT;
    }

    public String getDEFAULT_URL() {
        return this.DEFAULT_URL;
    }

    public final OnboardingFocusBox getFocusBoxPrimary() {
        return this.focusBoxPrimary;
    }

    public final OnboardingFocusBox getFocusBoxSecondary() {
        return this.focusBoxSecondary;
    }

    public final OnboardingFocusBox getFocusBoxTertiary() {
        return this.focusBoxTertiary;
    }

    public final RectF getFocusRoundRectPrimary() {
        return this.focusRoundRectPrimary;
    }

    public final RectF getFocusRoundRectSecondary() {
        return this.focusRoundRectSecondary;
    }

    public final RectF getFocusRoundRectTertiary() {
        return this.focusRoundRectTertiary;
    }

    public boolean getNoBorder() {
        return false;
    }

    public String getONBOARDING_BG_COLOR_HEX() {
        return this.ONBOARDING_BG_COLOR_HEX;
    }

    public float getSTROKE_WIDTH() {
        return this.STROKE_WIDTH;
    }

    public String getTEXT_KEY() {
        return this.TEXT_KEY;
    }

    public float getTEXT_SIZE() {
        return this.TEXT_SIZE;
    }

    public Map<String, Integer> getWORDS_COLOR_MAP() {
        return this.M;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.getClass();
        super.onDraw(canvas);
        setupFocusBox(canvas);
    }

    public final void setFocusBoxPrimary(OnboardingFocusBox onboardingFocusBox) {
        this.focusBoxPrimary = onboardingFocusBox;
    }

    public final void setFocusBoxSecondary(OnboardingFocusBox onboardingFocusBox) {
        this.focusBoxSecondary = onboardingFocusBox;
    }

    public final void setFocusBoxTertiary(OnboardingFocusBox onboardingFocusBox) {
        this.focusBoxTertiary = onboardingFocusBox;
    }

    public final void setFocusRoundRectPrimary(RectF rectF) {
        this.focusRoundRectPrimary = rectF;
    }

    public final void setFocusRoundRectSecondary(RectF rectF) {
        this.focusRoundRectSecondary = rectF;
    }

    public final void setFocusRoundRectTertiary(RectF rectF) {
        this.focusRoundRectTertiary = rectF;
    }

    public void setupFocusBox(Canvas canvas) {
        Float f;
        Float fValueOf;
        Float fValueOf2;
        Float fValueOf3;
        Float fValueOf4;
        Float f2;
        Float f3;
        Float f4;
        Float f5;
        Float fValueOf5;
        Float f6;
        Float f7;
        Float f8;
        Float fValueOf6;
        Float fValueOf7;
        if (canvas == null || getWidth() == 0 || getHeight() == 0) {
            return;
        }
        OnboardingFocusBox onboardingFocusBox = this.focusBoxPrimary;
        if (onboardingFocusBox != null) {
            fValueOf = Float.valueOf(onboardingFocusBox.getLeftFactor() + (onboardingFocusBox.getFromLeftPercent() * getWidth()));
            fValueOf2 = Float.valueOf(onboardingFocusBox.getTopFactor() + (onboardingFocusBox.getFromTopPercent() * getHeight()));
            Float fValueOf8 = Float.valueOf(onboardingFocusBox.getRightFactor() + ((1.0f - onboardingFocusBox.getFromRightPercent()) * getWidth()));
            fValueOf4 = Float.valueOf(onboardingFocusBox.getBottomFactor() + ((1.0f - onboardingFocusBox.getFromBottomPercent()) * getHeight()));
            fValueOf3 = Float.valueOf(onboardingFocusBox.getRadiusPx());
            f = fValueOf8;
        } else {
            f = null;
            fValueOf = null;
            fValueOf2 = null;
            fValueOf3 = null;
            fValueOf4 = null;
        }
        OnboardingFocusBox onboardingFocusBox2 = this.focusBoxSecondary;
        if (onboardingFocusBox2 != null) {
            Float fValueOf9 = Float.valueOf(onboardingFocusBox2.getLeftFactor() + (onboardingFocusBox2.getFromLeftPercent() * getWidth()));
            Float fValueOf10 = Float.valueOf(onboardingFocusBox2.getTopFactor() + (onboardingFocusBox2.getFromTopPercent() * getHeight()));
            Float fValueOf11 = Float.valueOf(onboardingFocusBox2.getRightFactor() + ((1.0f - onboardingFocusBox2.getFromRightPercent()) * getWidth()));
            Float fValueOf12 = Float.valueOf(onboardingFocusBox2.getBottomFactor() + ((1.0f - onboardingFocusBox2.getFromBottomPercent()) * getHeight()));
            fValueOf5 = Float.valueOf(onboardingFocusBox2.getRadiusPx());
            f2 = fValueOf9;
            f3 = fValueOf10;
            f4 = fValueOf11;
            f5 = fValueOf12;
        } else {
            f2 = null;
            f3 = null;
            f4 = null;
            f5 = null;
            fValueOf5 = null;
        }
        OnboardingFocusBox onboardingFocusBox3 = this.focusBoxTertiary;
        if (onboardingFocusBox3 != null) {
            Float fValueOf13 = Float.valueOf(onboardingFocusBox3.getLeftFactor() + (onboardingFocusBox3.getFromLeftPercent() * getWidth()));
            Float fValueOf14 = Float.valueOf(onboardingFocusBox3.getTopFactor() + (onboardingFocusBox3.getFromTopPercent() * getHeight()));
            Float fValueOf15 = Float.valueOf(onboardingFocusBox3.getRightFactor() + ((1.0f - onboardingFocusBox3.getFromRightPercent()) * getWidth()));
            fValueOf6 = Float.valueOf(onboardingFocusBox3.getBottomFactor() + ((1.0f - onboardingFocusBox3.getFromBottomPercent()) * getHeight()));
            fValueOf7 = Float.valueOf(onboardingFocusBox3.getRadiusPx());
            f8 = fValueOf15;
            f7 = fValueOf14;
            f6 = fValueOf13;
        } else {
            f6 = null;
            f7 = null;
            f8 = null;
            fValueOf6 = null;
            fValueOf7 = null;
        }
        b(canvas, fValueOf, fValueOf2, f, fValueOf4, fValueOf3, fValueOf3, f2, f3, f4, f5, fValueOf5, fValueOf5, f6, f7, f8, fValueOf6, fValueOf7, fValueOf7);
    }

    public void setupImage(Canvas canvas) {
    }

    public void setupText(Canvas canvas) {
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DynamicOnboardingScreenBasicBase(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 12, 0);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DynamicOnboardingScreenBasicBase(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 8, 0);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DynamicOnboardingScreenBasicBase(Context context) {
        this(context, null, 0, 14, 0);
        context.getClass();
    }

    public /* synthetic */ DynamicOnboardingScreenBasicBase(Context context, AttributeSet attributeSet, int i, int i2, int i3) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i, 0);
    }
}
