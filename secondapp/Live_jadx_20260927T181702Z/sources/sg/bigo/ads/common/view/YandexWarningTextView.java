package sg.bigo.ads.common.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.TextView;
import sg.bigo.ads.R;
import sg.bigo.ads.common.utils.e;

/* JADX INFO: loaded from: classes7.dex */
public class YandexWarningTextView extends TextView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f133599a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f133600b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f133601c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f133602d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f133603e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f133604f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f133605g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f133606h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private float f133607i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f133608j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f133609k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final int f133610l;

    public YandexWarningTextView(Context context) {
        super(context);
        this.f133599a = 25;
        this.f133600b = 10;
        this.f133601c = 35.0f;
        this.f133603e = 1;
        this.f133604f = 50.0f;
        this.f133605g = false;
        this.f133606h = 0;
        this.f133607i = 0.0f;
        this.f133608j = 1000;
        this.f133609k = 1000;
        this.f133610l = 1000;
        a(null);
    }

    private void a(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.YandexWarningTextView);
            this.f133599a = e.d(getContext(), typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.YandexWarningTextView_bigo_ad_maxTextSize, this.f133599a));
            this.f133600b = e.d(getContext(), typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.YandexWarningTextView_bigo_ad_minTextSize, this.f133600b));
            typedArrayObtainStyledAttributes.recycle();
        }
        this.f133608j = e.c(getContext());
        this.f133609k = e.b(getContext());
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        int i10 = this.f133603e;
        if (i10 > 2) {
            i10 = 2;
        }
        canvas.save();
        float f10 = (this.f133602d * 1.0f) / i10;
        float f11 = f10 / this.f133604f;
        sg.bigo.ads.common.t.a.a("yandexWarn", "onDraw...singleLineHeight:" + f10 + "...scaleY:" + f11 + "...mPy:" + this.f133607i);
        canvas.scale(1.0f, f11, 0.0f, this.f133607i);
        super.onDraw(canvas);
        canvas.restore();
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        int i14;
        super.onSizeChanged(i10, i11, i12, i13);
        if (i10 <= 0 || i11 <= 0) {
            return;
        }
        try {
            if (TextUtils.isEmpty(getText())) {
                return;
            }
            int paddingLeft = (i10 - getPaddingLeft()) - getPaddingRight();
            int paddingTop = (i11 - getPaddingTop()) - getPaddingBottom();
            this.f133602d = paddingTop;
            float f10 = this.f133599a;
            float f11 = paddingTop * 0.5f;
            this.f133601c = f11;
            setLineSpacing(f11, 0.0f);
            setTextSize(2, f10);
            StaticLayout staticLayout = new StaticLayout(getText(), getPaint(), paddingLeft, Layout.Alignment.ALIGN_NORMAL, 0.0f, this.f133601c, true);
            while (true) {
                if ((staticLayout.getHeight() <= this.f133602d && staticLayout.getWidth() <= paddingLeft) || f10 <= this.f133600b) {
                    break;
                }
                f10 -= 1.0f;
                setTextSize(2, f10);
                staticLayout = new StaticLayout(getText(), getPaint(), paddingLeft, Layout.Alignment.ALIGN_NORMAL, 0.0f, this.f133601c, true);
            }
            this.f133603e = staticLayout.getLineCount();
            this.f133606h = staticLayout.getLineAscent(0);
            this.f133604f = e.b(getContext(), Math.round(f10));
            int iAbs = Math.abs(this.f133606h);
            boolean z10 = this.f133605g;
            if (z10 || 1 == (i14 = this.f133603e)) {
                if (!z10 || f10 <= 20.0f) {
                    this.f133607i = iAbs / 2.0f;
                } else {
                    this.f133607i = iAbs * 1.1f;
                }
            } else if (i14 >= 3) {
                this.f133607i = 0.0f;
            } else if (f10 > 36.0f) {
                this.f133607i = iAbs * 1.1f;
            } else {
                this.f133607i = (iAbs * 1.0f) / i14;
            }
            if (this.f133609k <= 1000 && this.f133608j <= 1000) {
                this.f133607i = 0.0f;
            }
            setLineSpacing(this.f133604f, 0.0f);
            sg.bigo.ads.common.t.a.a("yandexWarn", "adjust...line " + this.f133603e + "...TextSizeSP:" + f10 + "...TextSizePx:" + this.f133604f + "...TotalHeight:" + this.f133602d + "..lineSpace:" + this.f133601c + "...scaleX:" + getPaint().getTextScaleX() + "...mSecondLineAscentHeight:" + this.f133606h + "...secondLineTopH:" + staticLayout.getLineTop(0) + "...mPy:" + this.f133607i);
        } catch (Throwable unused) {
        }
    }

    public void setIsHorizontal(boolean z10) {
        this.f133605g = z10;
    }

    public YandexWarningTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f133599a = 25;
        this.f133600b = 10;
        this.f133601c = 35.0f;
        this.f133603e = 1;
        this.f133604f = 50.0f;
        this.f133605g = false;
        this.f133606h = 0;
        this.f133607i = 0.0f;
        this.f133608j = 1000;
        this.f133609k = 1000;
        this.f133610l = 1000;
        a(attributeSet);
    }

    public YandexWarningTextView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f133599a = 25;
        this.f133600b = 10;
        this.f133601c = 35.0f;
        this.f133603e = 1;
        this.f133604f = 50.0f;
        this.f133605g = false;
        this.f133606h = 0;
        this.f133607i = 0.0f;
        this.f133608j = 1000;
        this.f133609k = 1000;
        this.f133610l = 1000;
        a(attributeSet);
    }
}
