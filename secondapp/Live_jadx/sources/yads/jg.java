package yads;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.Log;
import android.util.TypedValue;
import android.widget.EditText;
import android.widget.TextView;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class jg {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final RectF f151081j = new RectF();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final ConcurrentHashMap f151082k = new ConcurrentHashMap();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final ConcurrentHashMap f151083l = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f151084a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f151085b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f151086c = -1.0f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f151087d = -1.0f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int[] f151088e = new int[0];

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public TextPaint f151089f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TextView f151090g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Context f151091h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ig f151092i;

    public jg(TextView textView) {
        this.f151090g = textView;
        this.f151091h = textView.getContext();
        if (Build.VERSION.SDK_INT >= 29) {
            this.f151092i = new hg();
        } else {
            this.f151092i = new gg();
        }
    }

    public static Object a(TextView textView, String str, Object obj) {
        try {
            Field fieldA = a(str);
            return fieldA == null ? obj : fieldA.get(textView);
        } catch (IllegalAccessException e10) {
            Log.w(androidx.appcompat.widget.t0.f7373l, "Failed to access TextView#" + str + " member", e10);
            return obj;
        }
    }

    public static Method b(String str) {
        try {
            ConcurrentHashMap concurrentHashMap = f151082k;
            Method declaredMethod = (Method) concurrentHashMap.get(str);
            if (declaredMethod != null || (declaredMethod = TextView.class.getDeclaredMethod(str, null)) == null) {
                return declaredMethod;
            }
            declaredMethod.setAccessible(true);
            concurrentHashMap.put(str, declaredMethod);
            return declaredMethod;
        } catch (Exception e10) {
            Log.w(androidx.appcompat.widget.t0.f7373l, "Failed to retrieve TextView#" + str + "() method", e10);
            return null;
        }
    }

    public final void a() {
        TextView textView = this.f151090g;
        if ((textView instanceof EditText) || this.f151084a == 0) {
            return;
        }
        if (this.f151085b) {
            if (textView.getMeasuredHeight() <= 0 || this.f151090g.getMeasuredWidth() <= 0) {
                return;
            }
            int measuredWidth = this.f151092i.a(this.f151090g) ? 1048576 : (this.f151090g.getMeasuredWidth() - this.f151090g.getTotalPaddingLeft()) - this.f151090g.getTotalPaddingRight();
            int height = (this.f151090g.getHeight() - this.f151090g.getCompoundPaddingBottom()) - this.f151090g.getCompoundPaddingTop();
            if (measuredWidth <= 0 || height <= 0) {
                return;
            }
            RectF rectF = f151081j;
            synchronized (rectF) {
                try {
                    rectF.setEmpty();
                    rectF.right = measuredWidth;
                    rectF.bottom = height;
                    float fA = a(rectF);
                    if (fA != this.f151090g.getTextSize()) {
                        a(0, fA);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        this.f151085b = true;
    }

    public final int a(RectF rectF) {
        CharSequence transformation;
        int length = this.f151088e.length;
        if (length != 0) {
            int i10 = length - 1;
            int i11 = 1;
            int i12 = 0;
            while (i11 <= i10) {
                int i13 = (i11 + i10) / 2;
                int i14 = this.f151088e[i13];
                CharSequence text = this.f151090g.getText();
                TransformationMethod transformationMethod = this.f151090g.getTransformationMethod();
                if (transformationMethod != null && (transformation = transformationMethod.getTransformation(text, this.f151090g)) != null) {
                    text = transformation;
                }
                int maxLines = this.f151090g.getMaxLines();
                TextPaint textPaint = this.f151089f;
                if (textPaint == null) {
                    this.f151089f = new TextPaint();
                } else {
                    textPaint.reset();
                }
                this.f151089f.set(this.f151090g.getPaint());
                this.f151089f.setTextSize(i14);
                Layout.Alignment alignment = (Layout.Alignment) a((Object) this.f151090g, "getLayoutAlignment", (Object) Layout.Alignment.ALIGN_NORMAL);
                StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(text, 0, text.length(), this.f151089f, Math.round(rectF.right));
                builderObtain.setAlignment(alignment).setLineSpacing(this.f151090g.getLineSpacingExtra(), this.f151090g.getLineSpacingMultiplier()).setIncludePad(this.f151090g.getIncludeFontPadding()).setBreakStrategy(this.f151090g.getBreakStrategy()).setHyphenationFrequency(this.f151090g.getHyphenationFrequency()).setMaxLines(maxLines == -1 ? Integer.MAX_VALUE : maxLines);
                try {
                    this.f151092i.a(builderObtain, this.f151090g);
                } catch (ClassCastException unused) {
                    Log.w(androidx.appcompat.widget.t0.f7373l, "Failed to obtain TextDirectionHeuristic, auto size may be incorrect");
                }
                StaticLayout staticLayoutBuild = builderObtain.build();
                if ((maxLines == -1 || (staticLayoutBuild.getLineCount() <= maxLines && staticLayoutBuild.getLineEnd(staticLayoutBuild.getLineCount() - 1) == text.length())) && staticLayoutBuild.getHeight() <= rectF.bottom) {
                    int i15 = i13 + 1;
                    i12 = i11;
                    i11 = i15;
                } else {
                    i12 = i13 - 1;
                    i10 = i12;
                }
            }
            return this.f151088e[i12];
        }
        throw new IllegalStateException("No available text sizes to choose from.");
    }

    public static Object a(Object obj, String str, Object obj2) {
        try {
            return b(str).invoke(obj, null);
        } catch (Exception e10) {
            Log.w(androidx.appcompat.widget.t0.f7373l, "Failed to invoke TextView#" + str + "() method", e10);
            return obj2;
        }
    }

    public final void a(int i10, float f10) {
        Resources resources;
        Context context = this.f151091h;
        if (context == null) {
            resources = Resources.getSystem();
        } else {
            resources = context.getResources();
        }
        float fApplyDimension = TypedValue.applyDimension(i10, f10, resources.getDisplayMetrics());
        if (fApplyDimension != this.f151090g.getPaint().getTextSize()) {
            this.f151090g.getPaint().setTextSize(fApplyDimension);
            boolean zIsInLayout = this.f151090g.isInLayout();
            if (this.f151090g.getLayout() != null) {
                this.f151085b = false;
                try {
                    Method methodB = b("nullLayouts");
                    if (methodB != null) {
                        methodB.invoke(this.f151090g, null);
                    }
                } catch (Exception e10) {
                    Log.w(androidx.appcompat.widget.t0.f7373l, "Failed to invoke TextView#nullLayouts() method", e10);
                }
                if (!zIsInLayout) {
                    this.f151090g.requestLayout();
                } else {
                    this.f151090g.forceLayout();
                }
                this.f151090g.invalidate();
            }
        }
    }

    public static Field a(String str) {
        try {
            ConcurrentHashMap concurrentHashMap = f151083l;
            Field declaredField = (Field) concurrentHashMap.get(str);
            if (declaredField != null || (declaredField = TextView.class.getDeclaredField(str)) == null) {
                return declaredField;
            }
            declaredField.setAccessible(true);
            concurrentHashMap.put(str, declaredField);
            return declaredField;
        } catch (NoSuchFieldException e10) {
            Log.w(androidx.appcompat.widget.t0.f7373l, "Failed to access TextView#" + str + " member", e10);
            return null;
        }
    }
}
