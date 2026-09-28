package defpackage;

import android.graphics.Outline;
import android.os.Build;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.Window;
import android.view.WindowManager;
import com.sportybet.android.gp.tz.R;
import java.util.UUID;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class gme extends bo8 {
    public Function0<Unit> d;
    public yle e;
    public final View f;
    public final qle i;
    public boolean v;

    public static final class a extends ViewOutlineProvider {
        @Override // android.view.ViewOutlineProvider
        public final void getOutline(View view, Outline outline) {
            outline.setRect(0, 0, view.getWidth(), view.getHeight());
            outline.setAlpha(0.0f);
        }
    }

    public static final class b extends qlr implements Function1<cny, Unit> {
        public b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(cny cnyVar) {
            gme gmeVar = gme.this;
            if (gmeVar.e.a) {
                gmeVar.d.invoke();
            }
            return Unit.a;
        }
    }

    public gme(Function0<Unit> function0, yle yleVar, View view, asr asrVar, mmd mmdVar, UUID uuid) {
        super(new ContextThemeWrapper(view.getContext(), yleVar.e ? R.style.DialogWindowTheme : R.style.FloatingDialogWindowTheme), 0);
        this.d = function0;
        this.e = yleVar;
        this.f = view;
        Window window = getWindow();
        if (window == null) {
            ib5.a("Dialog has no window");
            throw null;
        }
        window.requestFeature(1);
        window.setBackgroundDrawableResource(android.R.color.transparent);
        z7j0.a(window, this.e.e);
        window.setGravity(17);
        if (!this.e.e) {
            window.addFlags(65792);
            WindowManager.LayoutParams attributes = window.getAttributes();
            int i = Build.VERSION.SDK_INT;
            if (i >= 28) {
                wl0.a.a(attributes);
            }
            if (i >= 30) {
                am0 am0Var = am0.a;
                am0Var.a(attributes, 0);
                am0Var.b(attributes, 0);
            }
            window.setAttributes(attributes);
        }
        qle qleVar = new qle(getContext(), window);
        setTitle(this.e.f);
        qleVar.setTag(R.id.compose_view_saveable_id_tag, "Dialog:" + uuid);
        qleVar.setClipChildren(false);
        qleVar.setElevation(mmdVar.C1(8.0f));
        qleVar.setOutlineProvider(new a());
        this.i = qleVar;
        View decorView = window.getDecorView();
        ViewGroup viewGroup = decorView instanceof ViewGroup ? (ViewGroup) decorView : null;
        if (viewGroup != null) {
            d(viewGroup);
        }
        setContentView(qleVar);
        qleVar.setTag(R.id.view_tree_lifecycle_owner, ll5.b(view));
        qleVar.setTag(R.id.view_tree_view_model_store_owner, tl5.b(view));
        qleVar.setTag(R.id.view_tree_saved_state_registry_owner, ydx.a(view));
        e(this.d, this.e, asrVar);
        mny.a(this.c, this, new b(), 2);
    }

    public static final void d(ViewGroup viewGroup) {
        viewGroup.setClipChildren(false);
        if (viewGroup instanceof qle) {
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            ViewGroup viewGroup2 = childAt instanceof ViewGroup ? (ViewGroup) childAt : null;
            if (viewGroup2 != null) {
                d(viewGroup2);
            }
        }
    }

    public final void e(Function0<Unit> function0, yle yleVar, asr asrVar) {
        int i;
        this.d = function0;
        this.e = yleVar;
        l380 l380Var = yleVar.c;
        boolean zC = u90.c(this.f);
        int iOrdinal = l380Var.ordinal();
        int i2 = 0;
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                zC = true;
            } else {
                if (iOrdinal != 2) {
                    uhc.a();
                    return;
                }
                zC = false;
            }
        }
        Window window = getWindow();
        window.getClass();
        window.setFlags(zC ? 8192 : -8193, 8192);
        int iOrdinal2 = asrVar.ordinal();
        if (iOrdinal2 == 0) {
            i = 0;
        } else {
            if (iOrdinal2 != 1) {
                uhc.a();
                return;
            }
            i = 1;
        }
        qle qleVar = this.i;
        qleVar.setLayoutDirection(i);
        boolean z = yleVar.e;
        boolean z2 = yleVar.d;
        Window window2 = qleVar.w;
        boolean z3 = (qleVar.B && z2 == qleVar.z && z == qleVar.A) ? false : true;
        qleVar.z = z2;
        qleVar.A = z;
        if (z3) {
            WindowManager.LayoutParams attributes = window2.getAttributes();
            int i3 = z2 ? -2 : -1;
            if (i3 != attributes.width || !qleVar.B) {
                window2.setLayout(i3, -2);
                qleVar.B = true;
            }
        }
        setCanceledOnTouchOutside(yleVar.b);
        Window window3 = getWindow();
        if (window3 != null) {
            if (!z) {
                i2 = Build.VERSION.SDK_INT < 31 ? 16 : 48;
            }
            window3.setSoftInputMode(i2);
        }
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (!this.e.a || !keyEvent.isTracking() || keyEvent.isCanceled() || i != 111) {
            return super.onKeyUp(i, keyEvent);
        }
        this.d.invoke();
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x008b  */
    @Override // android.app.Dialog
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked;
        View childAt;
        int iB;
        boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
        if (!this.e.b) {
            actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 0) {
            }
            this.v = false;
            return zOnTouchEvent;
        }
        qle qleVar = this.i;
        qleVar.getClass();
        float x = motionEvent.getX();
        if (!Float.isInfinite(x) && !Float.isNaN(x)) {
            float y = motionEvent.getY();
            if (!Float.isInfinite(y) && !Float.isNaN(y) && (childAt = qleVar.getChildAt(0)) != null) {
                int left = childAt.getLeft() + qleVar.getLeft();
                int width = childAt.getWidth() + left;
                int top = childAt.getTop() + qleVar.getTop();
                int height = childAt.getHeight() + top;
                int iB2 = ycv.b(motionEvent.getX());
                if (left <= iB2 && iB2 <= width && top <= (iB = ycv.b(motionEvent.getY())) && iB <= height) {
                    actionMasked = motionEvent.getActionMasked();
                    if (actionMasked != 0 || actionMasked == 1 || actionMasked == 3) {
                        this.v = false;
                        return zOnTouchEvent;
                    }
                }
            }
        }
        int actionMasked2 = motionEvent.getActionMasked();
        if (actionMasked2 == 0) {
            this.v = true;
            return true;
        }
        if (actionMasked2 != 1) {
            if (actionMasked2 == 3) {
                this.v = false;
                return zOnTouchEvent;
            }
        } else if (this.v) {
            this.d.invoke();
            this.v = false;
            return true;
        }
        return zOnTouchEvent;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void cancel() {
    }
}
