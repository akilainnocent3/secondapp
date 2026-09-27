package sg.bigo.ads.common.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.Nullable;
import sg.bigo.ads.R;

/* JADX INFO: loaded from: classes7.dex */
public class PrivacyCheckBox extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f133510a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f133511b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f133512c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f133513d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Paint f133514e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f133515f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f133516g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f133517h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f133518i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f133519j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private PorterDuffXfermode f133520k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private float f133521l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private a f133522m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private d f133523n;

    public class a {
        private a() {
        }

        public void a(Canvas canvas) {
            Paint paint;
            int i10;
            if (PrivacyCheckBox.this.f133510a) {
                paint = PrivacyCheckBox.this.f133514e;
                i10 = PrivacyCheckBox.this.f133516g;
            } else {
                paint = PrivacyCheckBox.this.f133514e;
                i10 = PrivacyCheckBox.this.f133517h;
            }
            paint.setColor(i10);
            canvas.drawCircle(0.0f, 0.0f, PrivacyCheckBox.this.f133513d, PrivacyCheckBox.this.f133514e);
        }

        public void b(Canvas canvas) {
            Paint paint;
            int i10;
            if (PrivacyCheckBox.this.f133510a) {
                paint = PrivacyCheckBox.this.f133514e;
                i10 = PrivacyCheckBox.this.f133518i;
            } else {
                paint = PrivacyCheckBox.this.f133514e;
                i10 = PrivacyCheckBox.this.f133519j;
            }
            paint.setColor(i10);
            PrivacyCheckBox.this.f133514e.setStyle(Paint.Style.STROKE);
            canvas.save();
            canvas.translate(-(PrivacyCheckBox.this.f133513d / 8.0f), PrivacyCheckBox.this.f133513d / 3.0f);
            canvas.rotate(-45.0f);
            Path path = new Path();
            path.reset();
            path.moveTo(0.0f, 0.0f);
            path.lineTo(PrivacyCheckBox.this.f133515f, 0.0f);
            path.moveTo(0.0f, 0.0f);
            path.lineTo(0.0f, (-PrivacyCheckBox.this.f133515f) / 2.0f);
            canvas.drawPath(path, PrivacyCheckBox.this.f133514e);
            canvas.restore();
        }

        public /* synthetic */ a(PrivacyCheckBox privacyCheckBox, byte b10) {
            this();
        }
    }

    public class b extends a {
        private b() {
            super(PrivacyCheckBox.this, (byte) 0);
        }

        @Override // sg.bigo.ads.common.view.PrivacyCheckBox.a
        public final void a(Canvas canvas) {
            Paint paint;
            Paint.Style style;
            if (PrivacyCheckBox.this.f133510a) {
                paint = PrivacyCheckBox.this.f133514e;
                style = Paint.Style.FILL;
            } else {
                paint = PrivacyCheckBox.this.f133514e;
                style = Paint.Style.STROKE;
            }
            paint.setStyle(style);
            super.a(canvas);
        }

        @Override // sg.bigo.ads.common.view.PrivacyCheckBox.a
        public final void b(Canvas canvas) {
            if (PrivacyCheckBox.this.f133510a) {
                PrivacyCheckBox.this.f133514e.setXfermode(PrivacyCheckBox.this.f133520k);
                super.b(canvas);
                PrivacyCheckBox.this.f133514e.setXfermode(null);
            }
        }

        public /* synthetic */ b(PrivacyCheckBox privacyCheckBox, byte b10) {
            this();
        }
    }

    public class c extends a {
        private c() {
            super(PrivacyCheckBox.this, (byte) 0);
        }

        @Override // sg.bigo.ads.common.view.PrivacyCheckBox.a
        public final void a(Canvas canvas) {
            PrivacyCheckBox.this.f133514e.setStyle(Paint.Style.FILL);
            super.a(canvas);
        }

        public /* synthetic */ c(PrivacyCheckBox privacyCheckBox, byte b10) {
            this();
        }
    }

    public interface d {
        void a(boolean z10);
    }

    public class e implements View.OnClickListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private View.OnClickListener f133529b;

        public e(View.OnClickListener onClickListener) {
            this.f133529b = onClickListener;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            PrivacyCheckBox privacyCheckBox = PrivacyCheckBox.this;
            privacyCheckBox.f133510a = !privacyCheckBox.f133510a;
            PrivacyCheckBox.this.invalidate();
            if (PrivacyCheckBox.this.f133523n != null) {
                PrivacyCheckBox.this.f133523n.a(PrivacyCheckBox.this.f133510a);
            }
            View.OnClickListener onClickListener = this.f133529b;
            if (onClickListener != null) {
                onClickListener.onClick(view);
            }
        }
    }

    public PrivacyCheckBox(Context context) {
        this(context, null);
    }

    private static int a(int i10) {
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        if (mode == 1073741824) {
            return size;
        }
        if (mode == Integer.MIN_VALUE) {
            return Math.min(80, size);
        }
        return 80;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int iSaveLayer = canvas.saveLayer((-this.f133511b) / 2.0f, (-this.f133512c) / 2.0f, getWidth(), getHeight(), null, 31);
        canvas.translate(this.f133511b / 2, this.f133512c / 2);
        this.f133522m.a(canvas);
        this.f133522m.b(canvas);
        canvas.restoreToCount(iSaveLayer);
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        setMeasuredDimension(a(i10), a(i11));
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.f133511b = i10;
        this.f133512c = i11;
        this.f133513d = (Math.min(i10, i11) / 2.0f) * 0.9f;
        this.f133515f = (Math.min(this.f133511b, this.f133512c) / 2.0f) * 0.8f;
    }

    public void setOnCheckChangeListener(d dVar) {
        this.f133523n = dVar;
    }

    @Override // android.view.View
    public void setOnClickListener(@Nullable View.OnClickListener onClickListener) {
        super.setOnClickListener(new e(onClickListener));
    }

    public PrivacyCheckBox(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final PrivacyCheckBox a(boolean z10) {
        this.f133510a = z10;
        d dVar = this.f133523n;
        if (dVar != null) {
            dVar.a(z10);
        }
        invalidate();
        return this;
    }

    public PrivacyCheckBox(Context context, @Nullable AttributeSet attributeSet, int i10) {
        int i11;
        a cVar;
        super(context, attributeSet, i10);
        float f10 = (int) ((context.getResources().getDisplayMetrics().density * 1.5f) + 0.5f);
        byte b10 = 0;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.PrivacyCheckBox, i10, 0);
            this.f133516g = typedArrayObtainStyledAttributes.getColor(R.styleable.PrivacyCheckBox_bigo_ad_hcb_check_circle_color, -16736769);
            this.f133517h = typedArrayObtainStyledAttributes.getColor(R.styleable.PrivacyCheckBox_bigo_ad_hcb_uncheck_circle_color, -1);
            this.f133518i = typedArrayObtainStyledAttributes.getColor(R.styleable.PrivacyCheckBox_bigo_ad_hcb_check_hook_color, -16777216);
            this.f133519j = typedArrayObtainStyledAttributes.getColor(R.styleable.PrivacyCheckBox_bigo_ad_hcb_uncheck_hook_color, -1);
            i11 = typedArrayObtainStyledAttributes.getInt(R.styleable.PrivacyCheckBox_bigo_ad_hcb_style, 1);
            this.f133510a = typedArrayObtainStyledAttributes.getBoolean(R.styleable.PrivacyCheckBox_bigo_ad_hcb_is_check, false);
            this.f133521l = typedArrayObtainStyledAttributes.getDimension(R.styleable.PrivacyCheckBox_bigo_ad_hcb_line_width, f10);
            typedArrayObtainStyledAttributes.recycle();
        } else {
            this.f133516g = -16736769;
            this.f133517h = -1;
            this.f133518i = -16777216;
            this.f133519j = -1;
            this.f133521l = f10;
            this.f133510a = false;
            i11 = 1;
        }
        if (i11 != 2) {
            cVar = i11 == 1 ? new c(this, b10) : cVar;
            Paint paint = new Paint();
            this.f133514e = paint;
            paint.setAntiAlias(true);
            this.f133514e.setStyle(Paint.Style.FILL);
            this.f133514e.setColor(this.f133517h);
            this.f133514e.setStrokeWidth(this.f133521l);
            this.f133514e.setStrokeJoin(Paint.Join.ROUND);
            this.f133514e.setStrokeCap(Paint.Cap.ROUND);
            setLayerType(1, null);
            this.f133520k = new PorterDuffXfermode(PorterDuff.Mode.XOR);
            setOnClickListener(new View.OnClickListener() { // from class: sg.bigo.ads.common.view.PrivacyCheckBox.1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                }
            });
        }
        cVar = new b(this, b10);
        this.f133522m = cVar;
        Paint paint2 = new Paint();
        this.f133514e = paint2;
        paint2.setAntiAlias(true);
        this.f133514e.setStyle(Paint.Style.FILL);
        this.f133514e.setColor(this.f133517h);
        this.f133514e.setStrokeWidth(this.f133521l);
        this.f133514e.setStrokeJoin(Paint.Join.ROUND);
        this.f133514e.setStrokeCap(Paint.Cap.ROUND);
        setLayerType(1, null);
        this.f133520k = new PorterDuffXfermode(PorterDuff.Mode.XOR);
        setOnClickListener(new View.OnClickListener() { // from class: sg.bigo.ads.common.view.PrivacyCheckBox.1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
            }
        });
    }
}
