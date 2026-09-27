package androidx.leanback.widget;

import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.style.ForegroundColorSpan;
import android.text.style.ReplacementSpan;
import android.util.AttributeSet;
import android.util.Property;
import android.view.ActionMode;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import java.util.List;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"AppCompatCustomView"})
public class z2 extends EditText {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final boolean f13190g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f13191h = "StreamingTextView";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final float f13192i = 1.3f;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final boolean f13193j = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final boolean f13194k = true;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final boolean f13195l = true;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final long f13196m = 50;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final Pattern f13197n = Pattern.compile("\\S+");

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final Property<z2, Integer> f13198o = new a(Integer.class, "streamPosition");

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final String f13199p = "androidx.leanback.widget.StreamingTextView";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Random f13200b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Bitmap f13201c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Bitmap f13202d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f13203e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ObjectAnimator f13204f;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class a extends Property<z2, Integer> {
        public a(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer get(z2 z2Var) {
            return Integer.valueOf(z2Var.getStreamPosition());
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(z2 z2Var, Integer num) {
            z2Var.setStreamPosition(num.intValue());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class b extends ReplacementSpan {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f13205b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f13206c;

        public b(int i10, int i11) {
            this.f13205b = i10;
            this.f13206c = i11;
        }

        @Override // android.text.style.ReplacementSpan
        public void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f10, int i12, int i13, int i14, Paint paint) {
            int iMeasureText = (int) paint.measureText(charSequence, i10, i11);
            int width = z2.this.f13201c.getWidth();
            int i15 = width * 2;
            int i16 = iMeasureText / i15;
            int i17 = (iMeasureText % i15) / 2;
            boolean zE = z2.e(z2.this);
            z2.this.f13200b.setSeed(this.f13205b);
            int alpha = paint.getAlpha();
            for (int i18 = 0; i18 < i16; i18++) {
                int i19 = this.f13206c + i18;
                z2 z2Var = z2.this;
                if (i19 >= z2Var.f13203e) {
                    break;
                }
                float f11 = (i18 * i15) + i17 + (width / 2);
                float f12 = zE ? ((iMeasureText + f10) - f11) - width : f10 + f11;
                paint.setAlpha((z2Var.f13200b.nextInt(4) + 1) * 63);
                if (z2.this.f13200b.nextBoolean()) {
                    Bitmap bitmap = z2.this.f13202d;
                    canvas.drawBitmap(bitmap, f12, i13 - bitmap.getHeight(), paint);
                } else {
                    Bitmap bitmap2 = z2.this.f13201c;
                    canvas.drawBitmap(bitmap2, f12, i13 - bitmap2.getHeight(), paint);
                }
            }
            paint.setAlpha(alpha);
        }

        @Override // android.text.style.ReplacementSpan
        public int getSize(Paint paint, CharSequence charSequence, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
            return (int) paint.measureText(charSequence, i10, i11);
        }
    }

    public z2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f13200b = new Random();
    }

    public static boolean e(View view) {
        return 1 == view.getLayoutDirection();
    }

    public final void a(SpannableStringBuilder spannableStringBuilder, int i10, String str, int i11) {
        spannableStringBuilder.setSpan(new ForegroundColorSpan(i10), i11, str.length() + i11, 33);
    }

    public final void b(SpannableStringBuilder spannableStringBuilder, String str, int i10) {
        Matcher matcher = f13197n.matcher(str);
        while (matcher.find()) {
            int iStart = matcher.start() + i10;
            spannableStringBuilder.setSpan(new b(str.charAt(matcher.start()), iStart), iStart, matcher.end() + i10, 33);
        }
    }

    public final void c() {
        ObjectAnimator objectAnimator = this.f13204f;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    public final Bitmap d(int i10, float f10) {
        Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(getResources(), i10);
        return Bitmap.createScaledBitmap(bitmapDecodeResource, (int) (bitmapDecodeResource.getWidth() * f10), (int) (bitmapDecodeResource.getHeight() * f10), false);
    }

    public void f() {
        this.f13203e = -1;
        c();
        setText("");
    }

    public final void g() {
        c();
        int streamPosition = getStreamPosition();
        int length = length();
        int i10 = length - streamPosition;
        if (i10 > 0) {
            if (this.f13204f == null) {
                ObjectAnimator objectAnimator = new ObjectAnimator();
                this.f13204f = objectAnimator;
                objectAnimator.setTarget(this);
                this.f13204f.setProperty(f13198o);
            }
            this.f13204f.setIntValues(streamPosition, length);
            this.f13204f.setDuration(((long) i10) * 50);
            this.f13204f.start();
        }
    }

    public int getStreamPosition() {
        return this.f13203e;
    }

    public void h(String str, String str2) {
        if (str == null) {
            str = "";
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        if (str2 != null) {
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) str2);
            b(spannableStringBuilder, str2, length);
        }
        this.f13203e = Math.max(str.length(), this.f13203e);
        j(new SpannedString(spannableStringBuilder));
        g();
    }

    public final void j(CharSequence charSequence) {
        setText(charSequence);
        bringPointIntoView(length());
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f13201c = d(s3.a.f.U, 1.3f);
        this.f13202d = d(s3.a.f.W, 1.3f);
        f();
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(f13199p);
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(androidx.core.widget.q.G(this, callback));
    }

    public void setFinalRecognizedText(CharSequence charSequence) {
        j(charSequence);
    }

    public void setStreamPosition(int i10) {
        this.f13203e = i10;
        invalidate();
    }

    public z2(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f13200b = new Random();
    }

    public void i(String str, List<Float> list) {
    }
}
