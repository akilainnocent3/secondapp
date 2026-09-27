package sg.bigo.ads.core.mraid.a;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import k.h1;
import sg.bigo.ads.R;
import sg.bigo.ads.common.utils.e;

/* JADX INFO: loaded from: classes7.dex */
public final class a extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final Drawable f134980a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f134981b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private b f134982c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    private EnumC1380a f134983d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f134984e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f134985f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f134986g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f134987h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Rect f134988i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Rect f134989j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Rect f134990k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final Rect f134991l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f134992m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Nullable
    private c f134993n;

    /* JADX INFO: renamed from: sg.bigo.ads.core.mraid.a.a$a, reason: collision with other inner class name */
    public enum EnumC1380a {
        TOP_LEFT(51),
        TOP_CENTER(49),
        TOP_RIGHT(53),
        CENTER(17),
        BOTTOM_LEFT(83),
        BOTTOM_CENTER(81),
        BOTTOM_RIGHT(85);


        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final int f135002h;

        EnumC1380a(int i10) {
            this.f135002h = i10;
        }
    }

    public interface b {
        void a();
    }

    public final class c implements Runnable {
        private c() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            a.this.setClosePressed(false);
        }

        public /* synthetic */ c(a aVar, byte b10) {
            this();
        }
    }

    public a(@NonNull Context context) {
        this(context, (byte) 0);
    }

    private static void a(EnumC1380a enumC1380a, int i10, Rect rect, Rect rect2) {
        Gravity.apply(enumC1380a.f135002h, i10, i10, rect, rect2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setClosePressed(boolean z10) {
        if (z10 == a()) {
            return;
        }
        this.f134980a.setState(z10 ? FrameLayout.SELECTED_STATE_SET : FrameLayout.EMPTY_STATE_SET);
        invalidate(this.f134989j);
    }

    @Override // android.view.View
    public final void draw(@NonNull Canvas canvas) {
        super.draw(canvas);
        if (this.f134987h) {
            this.f134987h = false;
            this.f134988i.set(0, 0, getWidth(), getHeight());
            a(this.f134983d, this.f134988i, this.f134989j);
            this.f134991l.set(this.f134989j);
            Rect rect = this.f134991l;
            int i10 = this.f134986g;
            rect.inset(i10, i10);
            a(this.f134983d, this.f134985f, this.f134991l, this.f134990k);
            this.f134980a.setBounds(this.f134990k);
        }
        if (this.f134980a.isVisible()) {
            this.f134980a.draw(canvas);
        }
    }

    @h1
    public final Rect getCloseBounds() {
        return this.f134989j;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(@NonNull MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0) {
            return false;
        }
        return a((int) motionEvent.getX(), (int) motionEvent.getY(), 0);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        this.f134987h = true;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(@NonNull MotionEvent motionEvent) {
        byte b10 = 0;
        if (!a((int) motionEvent.getX(), (int) motionEvent.getY(), this.f134981b) || (!this.f134992m && !this.f134980a.isVisible())) {
            setClosePressed(false);
            super.onTouchEvent(motionEvent);
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            setClosePressed(true);
        } else if (action != 1) {
            if (action == 3) {
                setClosePressed(false);
            }
        } else if (a()) {
            if (this.f134993n == null) {
                this.f134993n = new c(this, b10);
            }
            postDelayed(this.f134993n, ViewConfiguration.getPressedStateDuration());
            playSoundEffect(0);
            b bVar = this.f134982c;
            if (bVar != null) {
                bVar.a();
            }
        }
        return true;
    }

    public final void setCloseAlwaysInteractable(boolean z10) {
        this.f134992m = z10;
    }

    @h1
    public final void setCloseBoundChanged(boolean z10) {
        this.f134987h = z10;
    }

    @h1
    public final void setCloseBounds(Rect rect) {
        this.f134989j.set(rect);
    }

    public final void setClosePosition(@NonNull EnumC1380a enumC1380a) {
        this.f134983d = enumC1380a;
        this.f134987h = true;
        invalidate();
    }

    public final void setCloseVisible(boolean z10) {
        if (this.f134980a.setVisible(z10, false)) {
            invalidate(this.f134989j);
        }
    }

    public final void setOnCloseListener(@Nullable b bVar) {
        this.f134982c = bVar;
    }

    private a(@NonNull Context context, byte b10) {
        super(context, null, 0);
        this.f134988i = new Rect();
        this.f134989j = new Rect();
        this.f134990k = new Rect();
        this.f134991l = new Rect();
        Drawable drawableA = sg.bigo.ads.common.utils.a.a(context, R.drawable.bigo_ad_ic_close);
        this.f134980a = drawableA;
        this.f134983d = EnumC1380a.TOP_RIGHT;
        drawableA.setState(FrameLayout.EMPTY_STATE_SET);
        drawableA.setCallback(this);
        this.f134981b = ViewConfiguration.get(context).getScaledTouchSlop();
        this.f134984e = e.a(context, 50);
        this.f134985f = e.a(context, 30);
        this.f134986g = e.a(context, 8);
        setWillNotDraw(false);
        this.f134992m = true;
    }

    public final void a(EnumC1380a enumC1380a, Rect rect, Rect rect2) {
        a(enumC1380a, this.f134984e, rect, rect2);
    }

    @h1
    private boolean a() {
        return this.f134980a.getState() == FrameLayout.SELECTED_STATE_SET;
    }

    @h1
    private boolean a(int i10, int i11, int i12) {
        Rect rect = this.f134989j;
        return i10 >= rect.left - i12 && i11 >= rect.top - i12 && i10 < rect.right + i12 && i11 < rect.bottom + i12;
    }
}
