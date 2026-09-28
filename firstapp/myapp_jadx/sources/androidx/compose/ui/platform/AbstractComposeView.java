package androidx.compose.ui.platform;

import android.content.Context;
import android.os.Handler;
import android.os.IBinder;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import com.sportybet.android.gp.tz.R;
import defpackage.ej5;
import defpackage.g9j0;
import defpackage.h9j0;
import defpackage.i9j0;
import defpackage.ib5;
import defpackage.l9j0;
import defpackage.mma;
import defpackage.op8;
import defpackage.q2l;
import defpackage.q7k0;
import defpackage.qlr;
import defpackage.u6i0;
import defpackage.v6i0;
import defpackage.vcl;
import defpackage.wgz;
import defpackage.wj40;
import defpackage.wkn;
import defpackage.wue;
import defpackage.xcl;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0011\b'\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R(\u0010\u001d\u001a\u0004\u0018\u00010\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR(\u0010!\u001a\u0004\u0018\u00010\n2\b\u0010\u0018\u001a\u0004\u0018\u00010\n8\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010\u000eR$\u0010'\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\f\n\u0004\b#\u0010$\u0012\u0004\b%\u0010&R0\u0010.\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u00138\u0006@FX\u0087\u000e¢\u0006\u0018\n\u0004\b(\u0010)\u0012\u0004\b-\u0010&\u001a\u0004\b*\u0010+\"\u0004\b,\u0010\u0016R\u0014\u00100\u001a\u00020\u00138TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b/\u0010+R\u0011\u00102\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b1\u0010+¨\u00063"}, d2 = {"Landroidx/compose/ui/platform/AbstractComposeView;", "Landroid/view/ViewGroup;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lmma;", "parent", "", "setParentCompositionContext", "(Lmma;)V", "Lu6i0;", "strategy", "setViewCompositionStrategy", "(Lu6i0;)V", "", "isTransitionGroup", "setTransitionGroup", "(Z)V", "Landroid/os/IBinder;", "value", "b", "Landroid/os/IBinder;", "setPreviousAttachedWindowToken", "(Landroid/os/IBinder;)V", "previousAttachedWindowToken", "d", "Lmma;", "setParentContext", "parentContext", "Lkotlin/Function0;", "e", "Lkotlin/jvm/functions/Function0;", "getDisposeViewCompositionStrategy$annotations", "()V", "disposeViewCompositionStrategy", "f", "Z", "getShowLayoutBounds", "()Z", "setShowLayoutBounds", "getShowLayoutBounds$annotations", "showLayoutBounds", "getShouldCreateCompositionOnAttachedToWindow", "shouldCreateCompositionOnAttachedToWindow", "getHasComposition", "hasComposition", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class AbstractComposeView extends ViewGroup {
    public WeakReference<mma> a;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public IBinder previousAttachedWindowToken;
    public i c;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public mma parentContext;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public Function0<Unit> disposeViewCompositionStrategy;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public boolean showLayoutBounds;
    public boolean i;
    public boolean v;

    public static final class a extends qlr implements Function2<androidx.compose.runtime.a, Integer, Unit> {
        public a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.runtime.a aVar2 = aVar;
            int iIntValue = num.intValue();
            if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                AbstractComposeView.this.a(0, aVar2);
            } else {
                aVar2.G();
            }
            return Unit.a;
        }
    }

    public AbstractComposeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setClipChildren(false);
        setClipToPadding(false);
        setImportantForAccessibility(1);
        u6i0.b.ViewOnAttachStateChangeListenerC1164b viewOnAttachStateChangeListenerC1164b = new u6i0.b.ViewOnAttachStateChangeListenerC1164b(this);
        addOnAttachStateChangeListener(viewOnAttachStateChangeListenerC1164b);
        v6i0 v6i0Var = new v6i0(this);
        wue.c(this).a.add(v6i0Var);
        this.disposeViewCompositionStrategy = new u6i0.b.a(this, viewOnAttachStateChangeListenerC1164b, v6i0Var);
    }

    private static /* synthetic */ void getDisposeViewCompositionStrategy$annotations() {
    }

    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }

    private final void setParentContext(mma mmaVar) {
        if (this.parentContext != mmaVar) {
            this.parentContext = mmaVar;
            if (mmaVar != null) {
                this.a = null;
            }
            i iVar = this.c;
            if (iVar != null) {
                iVar.dispose();
                this.c = null;
                if (isAttachedToWindow()) {
                    f();
                }
            }
        }
    }

    private final void setPreviousAttachedWindowToken(IBinder iBinder) {
        if (this.previousAttachedWindowToken != iBinder) {
            this.previousAttachedWindowToken = iBinder;
            this.a = null;
        }
    }

    public abstract void a(int i, androidx.compose.runtime.a aVar);

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        c();
        super.addView(view);
    }

    @Override // android.view.ViewGroup
    public final boolean addViewInLayout(View view, int i, ViewGroup.LayoutParams layoutParams) {
        c();
        return super.addViewInLayout(view, i, layoutParams);
    }

    public final void c() {
        if (this.i) {
            return;
        }
        throw new UnsupportedOperationException("Cannot add views to " + getClass().getSimpleName() + "; only Compose content is supported");
    }

    public final void d() {
        if (this.parentContext != null || isAttachedToWindow()) {
            f();
        } else {
            ib5.a("createComposition requires either a parent reference or the View to be attachedto a window. Attach the View or call setParentCompositionReference.");
        }
    }

    public final void e() {
        i iVar = this.c;
        if (iVar != null) {
            iVar.dispose();
        }
        this.c = null;
        requestLayout();
    }

    public final void f() {
        if (this.c == null) {
            try {
                this.i = true;
                this.c = q7k0.a(this, i(), new op8(-656146368, new a(), true));
            } finally {
                this.i = false;
            }
        }
    }

    public void g(boolean z, int i, int i2, int i3, int i4) {
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.layout(getPaddingLeft(), getPaddingTop(), (i3 - i) - getPaddingRight(), (i4 - i2) - getPaddingBottom());
        }
    }

    public final boolean getHasComposition() {
        return this.c != null;
    }

    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return true;
    }

    public final boolean getShowLayoutBounds() {
        return this.showLayoutBounds;
    }

    public void h(int i, int i2) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            super.onMeasure(i, i2);
            return;
        }
        childAt.measure(View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - getPaddingLeft()) - getPaddingRight()), View.MeasureSpec.getMode(i)), View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i2) - getPaddingTop()) - getPaddingBottom()), View.MeasureSpec.getMode(i2)));
        setMeasuredDimension(getPaddingRight() + getPaddingLeft() + childAt.getMeasuredWidth(), getPaddingBottom() + getPaddingTop() + childAt.getMeasuredHeight());
    }

    public final mma i() {
        wj40 wj40VarA;
        mma mmaVarB = this.parentContext;
        if (mmaVarB == null) {
            mmaVarB = l9j0.b(this);
            if (mmaVarB == null) {
                Object parent = getParent();
                while (mmaVarB == null && (parent instanceof View)) {
                    View view = (View) parent;
                    mmaVarB = l9j0.b(view);
                    parent = view.getParent();
                }
            }
            if (mmaVarB != null) {
                mma mmaVar = (!(mmaVarB instanceof wj40) || ((wj40.c) ((wj40) mmaVarB).t.getValue()).compareTo(wj40.c.b) > 0) ? mmaVarB : null;
                if (mmaVar != null) {
                    this.a = new WeakReference<>(mmaVar);
                }
            } else {
                mmaVarB = null;
            }
            if (mmaVarB == null) {
                WeakReference<mma> weakReference = this.a;
                if (weakReference == null || (mmaVarB = weakReference.get()) == null || ((mmaVarB instanceof wj40) && ((wj40.c) ((wj40) mmaVarB).t.getValue()).compareTo(wj40.c.b) <= 0)) {
                    mmaVarB = null;
                }
                if (mmaVarB == null) {
                    if (!isAttachedToWindow()) {
                        wkn.c("Cannot locate windowRecomposer; View " + this + " is not attached to a window");
                    }
                    Object parent2 = getParent();
                    View view2 = this;
                    while (parent2 instanceof View) {
                        View view3 = (View) parent2;
                        if (view3.getId() == 16908290) {
                            break;
                        }
                        view2 = view3;
                        parent2 = view3.getParent();
                    }
                    mma mmaVarB2 = l9j0.b(view2);
                    if (mmaVarB2 == null) {
                        wj40VarA = i9j0.a.get().a(view2);
                        view2.setTag(R.id.androidx_compose_ui_view_composition_context, wj40VarA);
                        Handler handler = view2.getHandler();
                        int i = xcl.a;
                        view2.addOnAttachStateChangeListener(new g9j0(ej5.c(q2l.a, new vcl(handler, "windowRecomposer cleanup", false).e, null, new h9j0(wj40VarA, view2, null), 2)));
                    } else {
                        if (!(mmaVarB2 instanceof wj40)) {
                            ib5.a("root viewTreeParentCompositionContext is not a Recomposer");
                            return null;
                        }
                        wj40VarA = (wj40) mmaVarB2;
                    }
                    wj40 wj40Var = ((wj40.c) wj40VarA.t.getValue()).compareTo(wj40.c.b) > 0 ? wj40VarA : null;
                    if (wj40Var != null) {
                        this.a = new WeakReference<>(wj40Var);
                    }
                    return wj40VarA;
                }
            }
        }
        return mmaVarB;
    }

    @Override // android.view.ViewGroup
    public final boolean isTransitionGroup() {
        return !this.v || super.isTransitionGroup();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        setPreviousAttachedWindowToken(getWindowToken());
        if (getShouldCreateCompositionOnAttachedToWindow()) {
            f();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        g(z, i, i2, i3, i4);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        f();
        h(i, i2);
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.setLayoutDirection(i);
        }
    }

    public final void setParentCompositionContext(mma parent) {
        setParentContext(parent);
    }

    public final void setShowLayoutBounds(boolean z) {
        this.showLayoutBounds = z;
        KeyEvent.Callback childAt = getChildAt(0);
        if (childAt != null) {
            ((wgz) childAt).setShowLayoutBounds(z);
        }
    }

    @Override // android.view.ViewGroup
    public void setTransitionGroup(boolean isTransitionGroup) {
        super.setTransitionGroup(isTransitionGroup);
        this.v = true;
    }

    public final void setViewCompositionStrategy(u6i0 strategy) {
        Function0<Unit> function0 = this.disposeViewCompositionStrategy;
        if (function0 != null) {
            function0.invoke();
        }
        this.disposeViewCompositionStrategy = strategy.a(this);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i) {
        c();
        super.addView(view, i);
    }

    @Override // android.view.ViewGroup
    public final boolean addViewInLayout(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        c();
        return super.addViewInLayout(view, i, layoutParams, z);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, int i2) {
        c();
        super.addView(view, i, i2);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        c();
        super.addView(view, layoutParams);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        c();
        super.addView(view, i, layoutParams);
    }

    public AbstractComposeView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
    }

    public /* synthetic */ AbstractComposeView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }

    public AbstractComposeView(Context context) {
        this(context, null, 6, 0);
    }
}
