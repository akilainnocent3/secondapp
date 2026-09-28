package androidx.camera.view;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Rational;
import android.util.Size;
import android.view.Display;
import android.view.GestureDetector;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.camera.view.PreviewView;
import androidx.camera.view.b;
import androidx.camera.view.c;
import androidx.camera.view.d;
import androidx.camera.view.internal.compat.quirk.SurfaceViewNotCroppedByParentQuirk;
import androidx.camera.view.internal.compat.quirk.SurfaceViewStretchedQuirk;
import defpackage.aq20;
import defpackage.cie0;
import defpackage.d9i0;
import defpackage.h8n;
import defpackage.hb5;
import defpackage.ipv;
import defpackage.kk30;
import defpackage.kpf0;
import defpackage.lsg0;
import defpackage.m26;
import defpackage.n16;
import defpackage.n26;
import defpackage.njs;
import defpackage.o0b;
import defpackage.ock0;
import defpackage.pck0;
import defpackage.pgt;
import defpackage.r6i0;
import defpackage.rq20;
import defpackage.ssw;
import defpackage.uj5;
import defpackage.vq20;
import defpackage.wq20;
import defpackage.yaz;
import defpackage.yhe;
import defpackage.z9l;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class PreviewView extends FrameLayout {
    public static final /* synthetic */ int C = 0;
    public final rq20 A;
    public final a B;
    public c a;
    public androidx.camera.view.c b;
    public final ScreenFlashView c;
    public final androidx.camera.view.b d;
    public boolean e;
    public final ssw<f> f;
    public final AtomicReference<androidx.camera.view.a> i;
    public Executor v;
    public final wq20 w;
    public m26 y;
    public final b z;

    public class a implements aq20.c {
        public a() {
        }

        @Override // aq20.c
        public final void a(final cie0 cie0Var) {
            androidx.camera.view.c dVar;
            if (!kpf0.b()) {
                o0b.c(PreviewView.this.getContext()).execute(new Runnable() { // from class: tq20
                    @Override // java.lang.Runnable
                    public final void run() {
                        PreviewView.this.B.a(cie0Var);
                    }
                });
                return;
            }
            pgt.a("PreviewView", "Surface requested by Preview.");
            final n26 n26Var = cie0Var.d;
            PreviewView.this.y = n26Var.h();
            wq20 wq20Var = PreviewView.this.w;
            Rect rectE = n26Var.h().e();
            wq20Var.getClass();
            new Rational(rectE.width(), rectE.height());
            synchronized (wq20Var) {
                wq20Var.b = rectE;
            }
            cie0Var.b(o0b.c(PreviewView.this.getContext()), new cie0.e() { // from class: uq20
                @Override // cie0.e
                public final void a(cie0.d dVar2) {
                    c cVar;
                    PreviewView previewView = PreviewView.this;
                    pgt.a("PreviewView", "Preview transformation info updated. " + dVar2);
                    boolean z = n26Var.h().f() == 0;
                    b bVar = previewView.d;
                    Size size = cie0Var.b;
                    bVar.getClass();
                    pgt.a("PreviewTransform", "Transformation info set: " + dVar2 + " " + size + " " + z);
                    bVar.b = dVar2.a();
                    bVar.c = dVar2.b();
                    bVar.e = dVar2.d();
                    bVar.a = size;
                    bVar.f = z;
                    bVar.g = dVar2.e();
                    bVar.d = dVar2.c();
                    if (dVar2.d() == -1 || ((cVar = previewView.b) != null && (cVar instanceof d))) {
                        previewView.e = true;
                    } else {
                        previewView.e = false;
                    }
                    previewView.a();
                }
            });
            PreviewView previewView = PreviewView.this;
            androidx.camera.view.c cVar = previewView.b;
            c cVar2 = previewView.a;
            if (!(cVar instanceof androidx.camera.view.d) || PreviewView.b(cie0Var, cVar2)) {
                PreviewView previewView2 = PreviewView.this;
                boolean zB = PreviewView.b(cie0Var, previewView2.a);
                PreviewView previewView3 = PreviewView.this;
                androidx.camera.view.b bVar = previewView3.d;
                if (zB) {
                    androidx.camera.view.f fVar = new androidx.camera.view.f(previewView3, bVar);
                    fVar.i = false;
                    fVar.k = new AtomicReference<>();
                    dVar = fVar;
                } else {
                    dVar = new androidx.camera.view.d(previewView3, bVar);
                }
                previewView2.b = dVar;
            }
            m26 m26VarH = n26Var.h();
            PreviewView previewView4 = PreviewView.this;
            androidx.camera.view.a aVar = new androidx.camera.view.a(m26VarH, previewView4.f, previewView4.b);
            PreviewView.this.i.set(aVar);
            n26Var.b().c(o0b.c(PreviewView.this.getContext()), aVar);
            PreviewView.this.b.e(cie0Var, new vq20(this, aVar, n26Var));
            PreviewView previewView5 = PreviewView.this;
            if (previewView5.indexOfChild(previewView5.c) == -1) {
                PreviewView previewView6 = PreviewView.this;
                previewView6.addView(previewView6.c);
            }
        }
    }

    public class b implements DisplayManager.DisplayListener {
        public b() {
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public final void onDisplayAdded(int i) {
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public final void onDisplayChanged(int i) {
            PreviewView previewView = PreviewView.this;
            Display defaultDisplay = previewView.getDefaultDisplay();
            if (defaultDisplay == null || defaultDisplay.getDisplayId() != i) {
                return;
            }
            previewView.a();
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public final void onDisplayRemoved(int i) {
        }
    }

    public enum c {
        PERFORMANCE(0),
        COMPATIBLE(1);

        public final int a;

        c(int i) {
            this.a = i;
        }
    }

    public interface d {
    }

    public enum e {
        /* JADX INFO: Fake field, exist only in values array */
        FILL_START(0),
        FILL_CENTER(1),
        /* JADX INFO: Fake field, exist only in values array */
        FILL_END(2),
        FIT_START(3),
        FIT_CENTER(4),
        FIT_END(5);

        public final int a;

        e(int i) {
            this.a = i;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class f {
        public static final f a;
        public static final f b;
        public static final /* synthetic */ f[] c;

        static {
            f fVar = new f("IDLE", 0);
            a = fVar;
            f fVar2 = new f("STREAMING", 1);
            b = fVar2;
            c = new f[]{fVar, fVar2};
        }

        public f() {
            throw null;
        }

        public static f valueOf(String str) {
            return (f) Enum.valueOf(f.class, str);
        }

        public static f[] values() {
            return (f[]) c.clone();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r3v4, types: [rq20] */
    public PreviewView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, 0);
        this.a = c.PERFORMANCE;
        androidx.camera.view.b bVar = new androidx.camera.view.b();
        bVar.h = e.FILL_CENTER;
        this.d = bVar;
        this.e = true;
        this.f = new ssw<>(f.a);
        this.i = new AtomicReference<>();
        this.w = new wq20(bVar);
        this.z = new b();
        this.A = new View.OnLayoutChangeListener() { // from class: rq20
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
                int i10 = PreviewView.C;
                if (i4 - i2 == i8 - i6 && i5 - i3 == i9 - i7) {
                    return;
                }
                PreviewView previewView = this.a;
                previewView.a();
                kpf0.a();
                previewView.getViewPort();
            }
        };
        this.B = new a();
        kpf0.a();
        Resources.Theme theme = context.getTheme();
        int[] iArr = kk30.a;
        TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, iArr, i, 0);
        r6i0.o(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, i);
        try {
            int integer = typedArrayObtainStyledAttributes.getInteger(1, bVar.h.a);
            for (e eVar : e.values()) {
                if (eVar.a == integer) {
                    setScaleType(eVar);
                    int integer2 = typedArrayObtainStyledAttributes.getInteger(0, 0);
                    for (c cVar : c.values()) {
                        if (cVar.a == integer2) {
                            setImplementationMode(cVar);
                            typedArrayObtainStyledAttributes.recycle();
                            ViewConfiguration.get(context).getScaledTouchSlop();
                            new GestureDetector(context, new ock0(new pck0()));
                            if (getBackground() == null) {
                                setBackgroundColor(getContext().getColor(R.color.black));
                            }
                            ScreenFlashView screenFlashView = new ScreenFlashView(context);
                            this.c = screenFlashView;
                            screenFlashView.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
                            return;
                        }
                    }
                    throw new IllegalArgumentException("Unknown implementation mode id " + integer2);
                }
            }
            throw new IllegalArgumentException("Unknown scale type id " + integer);
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    public static boolean b(cie0 cie0Var, c cVar) {
        boolean zEquals = cie0Var.d.h().n().equals("androidx.camera.camera2.legacy");
        boolean z = (yhe.a.b(SurfaceViewStretchedQuirk.class) == null && yhe.a.b(SurfaceViewNotCroppedByParentQuirk.class) == null) ? false : true;
        if (Build.VERSION.SDK_INT > 24 && !zEquals && !z) {
            int iOrdinal = cVar.ordinal();
            if (iOrdinal == 0) {
                return false;
            }
            if (iOrdinal != 1) {
                z9l.a(cVar, "Invalid implementation mode: ");
                return false;
            }
        }
        return true;
    }

    private DisplayManager getDisplayManager() {
        Context context = getContext();
        if (context == null) {
            return null;
        }
        return (DisplayManager) context.getSystemService("display");
    }

    private h8n.i getScreenFlashInternal() {
        return this.c.getScreenFlash();
    }

    private int getViewPortScaleType() {
        int iOrdinal = getScaleType().ordinal();
        if (iOrdinal == 0) {
            return 0;
        }
        int i = 1;
        if (iOrdinal != 1) {
            i = 2;
            if (iOrdinal != 2) {
                i = 3;
                if (iOrdinal != 3 && iOrdinal != 4 && iOrdinal != 5) {
                    uj5.a(getScaleType(), "Unexpected scale type: ");
                    return 0;
                }
            }
        }
        return i;
    }

    private void setScreenFlashUiInfo(h8n.i iVar) {
        pgt.a("PreviewView", "setScreenFlashUiInfo: mCameraController is null!");
    }

    public final void a() {
        Rect rect;
        Display defaultDisplay;
        m26 m26Var;
        kpf0.a();
        if (this.b != null) {
            if (this.e && (defaultDisplay = getDefaultDisplay()) != null && (m26Var = this.y) != null) {
                androidx.camera.view.b bVar = this.d;
                int iO = m26Var.o(defaultDisplay.getRotation());
                int rotation = defaultDisplay.getRotation();
                if (bVar.g) {
                    bVar.c = iO;
                    bVar.e = rotation;
                }
            }
            this.b.f();
        }
        wq20 wq20Var = this.w;
        Size size = new Size(getWidth(), getHeight());
        int layoutDirection = getLayoutDirection();
        wq20Var.getClass();
        kpf0.a();
        synchronized (wq20Var) {
            try {
                if (size.getWidth() != 0 && size.getHeight() != 0 && (rect = wq20Var.b) != null) {
                    wq20Var.a.a(size, layoutDirection, rect);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public Bitmap getBitmap() {
        kpf0.a();
        androidx.camera.view.c cVar = this.b;
        if (cVar == null) {
            return null;
        }
        FrameLayout frameLayout = cVar.b;
        Bitmap bitmapB = cVar.b();
        if (bitmapB == null) {
            return null;
        }
        androidx.camera.view.b bVar = cVar.c;
        Size size = new Size(frameLayout.getWidth(), frameLayout.getHeight());
        int layoutDirection = frameLayout.getLayoutDirection();
        if (!bVar.f()) {
            return bitmapB;
        }
        Matrix matrixD = bVar.d();
        RectF rectFE = bVar.e(size, layoutDirection);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(size.getWidth(), size.getHeight(), bitmapB.getConfig());
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Matrix matrix = new Matrix();
        matrix.postConcat(matrixD);
        matrix.postScale(rectFE.width() / bVar.a.getWidth(), rectFE.height() / bVar.a.getHeight());
        matrix.postTranslate(rectFE.left, rectFE.top);
        canvas.drawBitmap(bitmapB, matrix, new Paint(7));
        return bitmapCreateBitmap;
    }

    public n16 getController() {
        kpf0.a();
        return null;
    }

    public Display getDefaultDisplay() {
        if (getDisplay() == null) {
            return null;
        }
        Display display = getDisplayManager().getDisplay(0);
        return display != null ? display : getDisplay();
    }

    public c getImplementationMode() {
        kpf0.a();
        return this.a;
    }

    public ipv getMeteringPointFactory() {
        kpf0.a();
        return this.w;
    }

    public yaz getOutputTransform() {
        Matrix matrixC;
        androidx.camera.view.b bVar = this.d;
        kpf0.a();
        try {
            matrixC = bVar.c(new Size(getWidth(), getHeight()), getLayoutDirection());
        } catch (IllegalStateException unused) {
            matrixC = null;
        }
        Rect rect = bVar.b;
        if (matrixC == null || rect == null) {
            pgt.a("PreviewView", "Transform info is not ready");
            return null;
        }
        RectF rectF = lsg0.a;
        RectF rectF2 = new RectF(rect);
        Matrix matrix = new Matrix();
        matrix.setRectToRect(lsg0.a, rectF2, Matrix.ScaleToFit.FILL);
        matrixC.preConcat(matrix);
        if (this.b instanceof androidx.camera.view.f) {
            matrixC.postConcat(getMatrix());
        } else if (!getMatrix().isIdentity()) {
            pgt.i("PreviewView", "PreviewView needs to be in COMPATIBLE mode for the transform to work correctly.");
        }
        new Size(rect.width(), rect.height());
        return new yaz();
    }

    public njs<f> getPreviewStreamState() {
        return this.f;
    }

    public e getScaleType() {
        kpf0.a();
        return this.d.h;
    }

    public h8n.i getScreenFlash() {
        return getScreenFlashInternal();
    }

    public Matrix getSensorToViewTransform() {
        kpf0.a();
        if (getWidth() == 0 || getHeight() == 0) {
            return null;
        }
        Size size = new Size(getWidth(), getHeight());
        int layoutDirection = getLayoutDirection();
        androidx.camera.view.b bVar = this.d;
        if (!bVar.f()) {
            return null;
        }
        Matrix matrix = new Matrix(bVar.d);
        matrix.postConcat(bVar.c(size, layoutDirection));
        return matrix;
    }

    public aq20.c getSurfaceProvider() {
        kpf0.a();
        return this.B;
    }

    public d9i0 getViewPort() {
        kpf0.a();
        Display defaultDisplay = getDefaultDisplay();
        if (defaultDisplay == null) {
            return null;
        }
        defaultDisplay.getRotation();
        kpf0.a();
        if (getWidth() == 0 || getHeight() == 0) {
            return null;
        }
        new Rational(getWidth(), getHeight());
        getViewPortScaleType();
        getLayoutDirection();
        return new d9i0();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        DisplayManager displayManager;
        super.onAttachedToWindow();
        if (!isInEditMode() && (displayManager = getDisplayManager()) != null) {
            displayManager.registerDisplayListener(this.z, new Handler(Looper.getMainLooper()));
        }
        addOnLayoutChangeListener(this.A);
        androidx.camera.view.c cVar = this.b;
        if (cVar != null) {
            cVar.c();
        }
        kpf0.a();
        getViewPort();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        DisplayManager displayManager;
        super.onDetachedFromWindow();
        removeOnLayoutChangeListener(this.A);
        androidx.camera.view.c cVar = this.b;
        if (cVar != null) {
            cVar.d();
        }
        if (isInEditMode() || (displayManager = getDisplayManager()) == null) {
            return;
        }
        displayManager.unregisterDisplayListener(this.z);
    }

    public void setController(n16 n16Var) {
        kpf0.a();
        kpf0.a();
        getViewPort();
        setScreenFlashUiInfo(getScreenFlashInternal());
    }

    public void setFrameUpdateListener(Executor executor, d dVar) {
        if (this.a == c.PERFORMANCE) {
            hb5.a("PERFORMANCE mode doesn't support frame update listener");
            return;
        }
        this.v = executor;
        androidx.camera.view.c cVar = this.b;
        if (cVar != null) {
            cVar.g(executor);
        }
    }

    public void setImplementationMode(c cVar) {
        kpf0.a();
        this.a = cVar;
    }

    public void setScaleType(e eVar) {
        kpf0.a();
        this.d.h = eVar;
        a();
        kpf0.a();
        getViewPort();
    }

    public void setScreenFlashOverlayColor(int i) {
        this.c.setBackgroundColor(i);
    }

    public void setScreenFlashWindow(Window window) {
        kpf0.a();
        this.c.setScreenFlashWindow(window);
        setScreenFlashUiInfo(getScreenFlashInternal());
    }

    public PreviewView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PreviewView(Context context) {
        this(context, null);
    }
}
