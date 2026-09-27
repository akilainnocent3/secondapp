package androidx.leanback.widget;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.Layout;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.widget.TextView;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"AppCompatCustomView"})
class ResizingTextView extends TextView {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f12152m = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f12153b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f12154c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f12155d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f12156e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f12157f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f12158g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f12159h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f12160i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f12161j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f12162k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f12163l;

    @SuppressLint({"CustomViewStyleable"})
    public ResizingTextView(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10);
        this.f12158g = false;
        this.f12159h = false;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, s3.a.n.F2, i10, i11);
        try {
            this.f12153b = typedArrayObtainStyledAttributes.getInt(s3.a.n.H2, 1);
            this.f12154c = typedArrayObtainStyledAttributes.getDimensionPixelSize(s3.a.n.K2, -1);
            this.f12155d = typedArrayObtainStyledAttributes.getBoolean(s3.a.n.G2, false);
            this.f12156e = typedArrayObtainStyledAttributes.getDimensionPixelOffset(s3.a.n.J2, 0);
            this.f12157f = typedArrayObtainStyledAttributes.getDimensionPixelOffset(s3.a.n.I2, 0);
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public boolean a() {
        return this.f12155d;
    }

    public int b() {
        return this.f12157f;
    }

    public int c() {
        return this.f12156e;
    }

    public int d() {
        return this.f12154c;
    }

    public int e() {
        return this.f12153b;
    }

    public final void f() {
        if (this.f12158g) {
            requestLayout();
        }
    }

    public void g(boolean z10) {
        if (this.f12155d != z10) {
            this.f12155d = z10;
            f();
        }
    }

    public final void h(int i10, int i11) {
        if (isPaddingRelative()) {
            setPaddingRelative(getPaddingStart(), i10, getPaddingEnd(), i11);
        } else {
            setPadding(getPaddingLeft(), i10, getPaddingRight(), i11);
        }
    }

    public void i(int i10) {
        if (this.f12157f != i10) {
            this.f12157f = i10;
            f();
        }
    }

    public void j(int i10) {
        if (this.f12156e != i10) {
            this.f12156e = i10;
            f();
        }
    }

    public void k(int i10) {
        if (this.f12154c != i10) {
            this.f12154c = i10;
            f();
        }
    }

    public void l(int i10) {
        if (this.f12153b != i10) {
            this.f12153b = i10;
            requestLayout();
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0053  */
    /* JADX WARN: Code duplicated, block: B:45:0x00d3 A[PHI: r2
      0x00d3: PHI (r2v7 boolean) = (r2v2 boolean), (r2v9 boolean) binds: [B:43:0x00d0, B:28:0x0099] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i10, int i11) {
        boolean z10;
        int i12;
        boolean z11 = true;
        if (!this.f12159h) {
            this.f12160i = (int) getTextSize();
            this.f12161j = getLineSpacingExtra();
            this.f12162k = getPaddingTop();
            this.f12163l = getPaddingBottom();
            this.f12159h = true;
        }
        boolean z12 = false;
        setTextSize(0, this.f12160i);
        setLineSpacing(this.f12161j, getLineSpacingMultiplier());
        h(this.f12162k, this.f12163l);
        super.onMeasure(i10, i11);
        Layout layout = getLayout();
        if (layout == null || (this.f12153b & 1) <= 0) {
            z10 = false;
        } else {
            int lineCount = layout.getLineCount();
            int maxLines = getMaxLines();
            if (maxLines <= 1 || lineCount != maxLines) {
                z10 = false;
            } else {
                z10 = true;
            }
        }
        int textSize = (int) getTextSize();
        if (z10) {
            int i13 = this.f12154c;
            if (i13 != -1 && textSize != i13) {
                setTextSize(0, i13);
                z12 = true;
            }
            float f10 = (this.f12161j + this.f12160i) - this.f12154c;
            if (this.f12155d && getLineSpacingExtra() != f10) {
                setLineSpacing(f10, getLineSpacingMultiplier());
                z12 = true;
            }
            int i14 = this.f12162k + this.f12156e;
            int i15 = this.f12163l + this.f12157f;
            if (getPaddingTop() == i14 && getPaddingBottom() == i15) {
                z11 = z12;
            } else {
                h(i14, i15);
            }
        } else {
            if (this.f12154c != -1 && textSize != (i12 = this.f12160i)) {
                setTextSize(0, i12);
                z12 = true;
            }
            if (this.f12155d) {
                float lineSpacingExtra = getLineSpacingExtra();
                float f11 = this.f12161j;
                if (lineSpacingExtra != f11) {
                    setLineSpacing(f11, getLineSpacingMultiplier());
                    z12 = true;
                }
            }
            if (getPaddingTop() == this.f12162k && getPaddingBottom() == this.f12163l) {
                z11 = z12;
            } else {
                h(this.f12162k, this.f12163l);
            }
        }
        this.f12158g = z10;
        if (z11) {
            super.onMeasure(i10, i11);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(androidx.core.widget.q.G(this, callback));
    }

    public ResizingTextView(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public ResizingTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    public ResizingTextView(Context context) {
        this(context, null);
    }
}
