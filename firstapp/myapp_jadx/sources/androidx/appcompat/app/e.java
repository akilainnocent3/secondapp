package androidx.appcompat.app;

import android.R;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.appcompat.app.e;
import androidx.appcompat.view.menu.f;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.ActionMenuPresenter;
import androidx.appcompat.widget.Toolbar;
import defpackage.ac;
import defpackage.dl30;
import defpackage.g9i0;
import defpackage.h9i0;
import defpackage.ib5;
import defpackage.j9i0;
import defpackage.k9i0;
import defpackage.l5d;
import defpackage.mb;
import defpackage.r6i0;
import defpackage.sfe0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class e extends ActionBar implements ActionBarOverlayLayout.d {
    public Context a;
    public Context b;
    public ActionBarOverlayLayout c;
    public ActionBarContainer d;
    public l5d e;
    public ActionBarContextView f;
    public final View g;
    public boolean h;
    public d i;
    public d j;
    public AppCompatDelegateImpl.d k;
    public boolean l;
    public final ArrayList<ActionBar.a> m;
    public int n;
    public boolean o;
    public boolean p;
    public boolean q;
    public boolean r;
    public boolean s;
    public h9i0 t;
    public boolean u;
    public boolean v;
    public final a w;
    public final b x;
    public final c y;
    public static final AccelerateInterpolator z = new AccelerateInterpolator();
    public static final DecelerateInterpolator A = new DecelerateInterpolator();

    public class a extends j9i0 {
        public a() {
        }

        @Override // defpackage.i9i0
        public final void a() {
            View view;
            e eVar = e.this;
            if (eVar.o && (view = eVar.g) != null) {
                view.setTranslationY(0.0f);
                eVar.d.setTranslationY(0.0f);
            }
            eVar.d.setVisibility(8);
            eVar.d.setTransitioning(false);
            eVar.t = null;
            AppCompatDelegateImpl.d dVar = eVar.k;
            if (dVar != null) {
                dVar.c(eVar.j);
                eVar.j = null;
                eVar.k = null;
            }
            ActionBarOverlayLayout actionBarOverlayLayout = eVar.c;
            if (actionBarOverlayLayout != null) {
                WeakHashMap<View, g9i0> weakHashMap = r6i0.a;
                r6i0.c.c(actionBarOverlayLayout);
            }
        }
    }

    public class b extends j9i0 {
        public b() {
        }

        @Override // defpackage.i9i0
        public final void a() {
            e eVar = e.this;
            eVar.t = null;
            eVar.d.requestLayout();
        }
    }

    public class c implements k9i0 {
        public c() {
        }
    }

    public class d extends ac implements f.a {
        public final Context c;
        public final f d;
        public AppCompatDelegateImpl.d e;
        public WeakReference<View> f;

        public d(Context context, AppCompatDelegateImpl.d dVar) {
            this.c = context;
            this.e = dVar;
            f fVar = new f(context);
            fVar.l = 1;
            this.d = fVar;
            fVar.e = this;
        }

        @Override // androidx.appcompat.view.menu.f.a
        public final boolean a(f fVar, MenuItem menuItem) {
            AppCompatDelegateImpl.d dVar = this.e;
            if (dVar != null) {
                return dVar.a.b(this, menuItem);
            }
            return false;
        }

        @Override // androidx.appcompat.view.menu.f.a
        public final void b(f fVar) {
            if (this.e == null) {
                return;
            }
            i();
            ActionMenuPresenter actionMenuPresenter = e.this.f.d;
            if (actionMenuPresenter != null) {
                actionMenuPresenter.n();
            }
        }

        @Override // defpackage.ac
        public final void c() {
            e eVar = e.this;
            if (eVar.i != this) {
                return;
            }
            boolean z = eVar.p;
            boolean z2 = eVar.q;
            if (z || z2) {
                eVar.j = this;
                eVar.k = this.e;
            } else {
                this.e.c(this);
            }
            this.e = null;
            eVar.r(false);
            ActionBarContextView actionBarContextView = eVar.f;
            if (actionBarContextView.z == null) {
                actionBarContextView.h();
            }
            eVar.c.setHideOnContentScrollEnabled(eVar.v);
            eVar.i = null;
        }

        @Override // defpackage.ac
        public final View d() {
            WeakReference<View> weakReference = this.f;
            if (weakReference != null) {
                return weakReference.get();
            }
            return null;
        }

        @Override // defpackage.ac
        public final f e() {
            return this.d;
        }

        @Override // defpackage.ac
        public final MenuInflater f() {
            return new sfe0(this.c);
        }

        @Override // defpackage.ac
        public final CharSequence g() {
            return e.this.f.getSubtitle();
        }

        @Override // defpackage.ac
        public final CharSequence h() {
            return e.this.f.getTitle();
        }

        @Override // defpackage.ac
        public final void i() {
            if (e.this.i != this) {
                return;
            }
            f fVar = this.d;
            fVar.y();
            try {
                this.e.d(this, fVar);
            } finally {
                fVar.x();
            }
        }

        @Override // defpackage.ac
        public final boolean j() {
            return e.this.f.H;
        }

        @Override // defpackage.ac
        public final void k(View view) {
            e.this.f.setCustomView(view);
            this.f = new WeakReference<>(view);
        }

        @Override // defpackage.ac
        public final void l(int i) {
            m(e.this.a.getResources().getString(i));
        }

        @Override // defpackage.ac
        public final void m(CharSequence charSequence) {
            e.this.f.setSubtitle(charSequence);
        }

        @Override // defpackage.ac
        public final void n(int i) {
            o(e.this.a.getResources().getString(i));
        }

        @Override // defpackage.ac
        public final void o(CharSequence charSequence) {
            e.this.f.setTitle(charSequence);
        }

        @Override // defpackage.ac
        public final void p(boolean z) {
            this.b = z;
            e.this.f.setTitleOptional(z);
        }
    }

    public e(Activity activity, boolean z2) {
        new ArrayList();
        this.m = new ArrayList<>();
        this.n = 0;
        this.o = true;
        this.s = true;
        this.w = new a();
        this.x = new b();
        this.y = new c();
        View decorView = activity.getWindow().getDecorView();
        s(decorView);
        if (z2) {
            return;
        }
        this.g = decorView.findViewById(R.id.content);
    }

    @Override // androidx.appcompat.app.ActionBar
    public final boolean b() {
        l5d l5dVar = this.e;
        if (l5dVar == null || !l5dVar.f()) {
            return false;
        }
        this.e.collapseActionView();
        return true;
    }

    @Override // androidx.appcompat.app.ActionBar
    public final void c(boolean z2) {
        if (z2 == this.l) {
            return;
        }
        this.l = z2;
        ArrayList<ActionBar.a> arrayList = this.m;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList.get(i).a();
        }
    }

    @Override // androidx.appcompat.app.ActionBar
    public final int d() {
        return this.e.n();
    }

    @Override // androidx.appcompat.app.ActionBar
    public final Context e() {
        Context context = this.b;
        if (context != null) {
            return context;
        }
        TypedValue typedValue = new TypedValue();
        this.a.getTheme().resolveAttribute(com.sportybet.android.gp.tz.R.attr.actionBarWidgetTheme, typedValue, true);
        int i = typedValue.resourceId;
        if (i != 0) {
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(this.a, i);
            this.b = contextThemeWrapper;
            return contextThemeWrapper;
        }
        Context context2 = this.a;
        this.b = context2;
        return context2;
    }

    @Override // androidx.appcompat.app.ActionBar
    public final void f() {
        if (this.p) {
            return;
        }
        this.p = true;
        u(false);
    }

    @Override // androidx.appcompat.app.ActionBar
    public final void h() {
        t(mb.a(this.a).a.getResources().getBoolean(com.sportybet.android.gp.tz.R.bool.abc_action_bar_embed_tabs));
    }

    @Override // androidx.appcompat.app.ActionBar
    public final boolean j(int i, KeyEvent keyEvent) {
        f fVar;
        d dVar = this.i;
        if (dVar == null || (fVar = dVar.d) == null) {
            return false;
        }
        fVar.setQwertyMode(KeyCharacterMap.load(keyEvent.getDeviceId()).getKeyboardType() != 1);
        return fVar.performShortcut(i, keyEvent, 0);
    }

    @Override // androidx.appcompat.app.ActionBar
    public final void m(boolean z2) {
        if (this.h) {
            return;
        }
        int i = z2 ? 4 : 0;
        int iN = this.e.n();
        this.h = true;
        this.e.g((i & 4) | (iN & (-5)));
    }

    @Override // androidx.appcompat.app.ActionBar
    public final void n() {
        this.e.g(this.e.n() & (-9));
    }

    @Override // androidx.appcompat.app.ActionBar
    public final void o(boolean z2) {
        h9i0 h9i0Var;
        this.u = z2;
        if (z2 || (h9i0Var = this.t) == null) {
            return;
        }
        h9i0Var.a();
    }

    @Override // androidx.appcompat.app.ActionBar
    public final void p(CharSequence charSequence) {
        this.e.setWindowTitle(charSequence);
    }

    @Override // androidx.appcompat.app.ActionBar
    public final ac q(AppCompatDelegateImpl.d dVar) {
        d dVar2 = this.i;
        if (dVar2 != null) {
            dVar2.c();
        }
        this.c.setHideOnContentScrollEnabled(false);
        this.f.h();
        d dVar3 = new d(this.f.getContext(), dVar);
        f fVar = dVar3.d;
        fVar.y();
        try {
            boolean zA = dVar3.e.a.a(dVar3, fVar);
            fVar.x();
            if (!zA) {
                return null;
            }
            this.i = dVar3;
            dVar3.i();
            this.f.f(dVar3);
            r(true);
            return dVar3;
        } catch (Throwable th) {
            fVar.x();
            throw th;
        }
    }

    public final void r(boolean z2) {
        g9i0 g9i0VarE;
        g9i0 g9i0VarE2;
        boolean z3 = this.r;
        if (z2) {
            if (!z3) {
                this.r = true;
                ActionBarOverlayLayout actionBarOverlayLayout = this.c;
                if (actionBarOverlayLayout != null) {
                    actionBarOverlayLayout.setShowingForActionMode(true);
                }
                u(false);
            }
        } else if (z3) {
            this.r = false;
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.c;
            if (actionBarOverlayLayout2 != null) {
                actionBarOverlayLayout2.setShowingForActionMode(false);
            }
            u(false);
        }
        boolean zIsLaidOut = this.d.isLaidOut();
        l5d l5dVar = this.e;
        if (!zIsLaidOut) {
            if (z2) {
                l5dVar.setVisibility(4);
                this.f.setVisibility(0);
                return;
            } else {
                l5dVar.setVisibility(0);
                this.f.setVisibility(8);
                return;
            }
        }
        if (z2) {
            g9i0VarE = l5dVar.h(4, 100L);
            g9i0VarE2 = this.f.e(0, 200L);
        } else {
            g9i0 g9i0VarH = l5dVar.h(0, 200L);
            g9i0VarE = this.f.e(8, 100L);
            g9i0VarE2 = g9i0VarH;
        }
        h9i0 h9i0Var = new h9i0();
        ArrayList<g9i0> arrayList = h9i0Var.a;
        arrayList.add(g9i0VarE);
        View view = g9i0VarE.a.get();
        long duration = view != null ? view.animate().getDuration() : 0L;
        View view2 = g9i0VarE2.a.get();
        if (view2 != null) {
            view2.animate().setStartDelay(duration);
        }
        arrayList.add(g9i0VarE2);
        h9i0Var.b();
    }

    public final void s(View view) {
        l5d wrapper;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(com.sportybet.android.gp.tz.R.id.decor_content_parent);
        this.c = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        KeyEvent.Callback callbackFindViewById = view.findViewById(com.sportybet.android.gp.tz.R.id.action_bar);
        if (callbackFindViewById instanceof l5d) {
            wrapper = (l5d) callbackFindViewById;
        } else {
            if (!(callbackFindViewById instanceof Toolbar)) {
                throw new IllegalStateException("Can't make a decor toolbar out of ".concat(callbackFindViewById != null ? callbackFindViewById.getClass().getSimpleName() : "null"));
            }
            wrapper = ((Toolbar) callbackFindViewById).getWrapper();
        }
        this.e = wrapper;
        this.f = (ActionBarContextView) view.findViewById(com.sportybet.android.gp.tz.R.id.action_context_bar);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(com.sportybet.android.gp.tz.R.id.action_bar_container);
        this.d = actionBarContainer;
        l5d l5dVar = this.e;
        if (l5dVar == null || this.f == null || actionBarContainer == null) {
            ib5.a(e.class.getSimpleName().concat(" can only be used with a compatible window decor layout"));
            return;
        }
        this.a = l5dVar.getContext();
        if ((this.e.n() & 4) != 0) {
            this.h = true;
        }
        Context context = mb.a(this.a).a;
        int i = context.getApplicationInfo().targetSdkVersion;
        this.e.getClass();
        t(context.getResources().getBoolean(com.sportybet.android.gp.tz.R.bool.abc_action_bar_embed_tabs));
        TypedArray typedArrayObtainStyledAttributes = this.a.obtainStyledAttributes(null, dl30.a, com.sportybet.android.gp.tz.R.attr.actionBarStyle, 0);
        if (typedArrayObtainStyledAttributes.getBoolean(14, false)) {
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.c;
            if (!actionBarOverlayLayout2.i) {
                ib5.a("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
                return;
            } else {
                this.v = true;
                actionBarOverlayLayout2.setHideOnContentScrollEnabled(true);
            }
        }
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(12, 0);
        if (dimensionPixelSize != 0) {
            ActionBarContainer actionBarContainer2 = this.d;
            WeakHashMap<View, g9i0> weakHashMap = r6i0.a;
            r6i0.d.l(actionBarContainer2, dimensionPixelSize);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void t(boolean z2) {
        if (z2) {
            this.d.setTabContainer(null);
            this.e.l();
        } else {
            this.e.l();
            this.d.setTabContainer(null);
        }
        this.e.getClass();
        this.e.j(false);
        this.c.setHasNonEmbeddedTabs(false);
    }

    public final void u(boolean z2) {
        boolean z3 = this.r || !(this.p || this.q);
        boolean z4 = this.s;
        final c cVar = this.y;
        View view = this.g;
        if (!z3) {
            if (z4) {
                this.s = false;
                h9i0 h9i0Var = this.t;
                if (h9i0Var != null) {
                    h9i0Var.a();
                }
                int i = this.n;
                a aVar = this.w;
                if (i != 0 || (!this.u && !z2)) {
                    aVar.a();
                    return;
                }
                this.d.setAlpha(1.0f);
                this.d.setTransitioning(true);
                h9i0 h9i0Var2 = new h9i0();
                float f = -this.d.getHeight();
                if (z2) {
                    int[] iArr = {0, 0};
                    this.d.getLocationInWindow(iArr);
                    f -= iArr[1];
                }
                g9i0 g9i0VarA = r6i0.a(this.d);
                g9i0VarA.e(f);
                final View view2 = g9i0VarA.a.get();
                if (view2 != null) {
                    view2.animate().setUpdateListener(cVar != null ? new ValueAnimator.AnimatorUpdateListener() { // from class: e9i0
                        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            ((View) e.this.d.getParent()).invalidate();
                        }
                    } : null);
                }
                boolean z5 = h9i0Var2.e;
                ArrayList<g9i0> arrayList = h9i0Var2.a;
                if (!z5) {
                    arrayList.add(g9i0VarA);
                }
                if (this.o && view != null) {
                    g9i0 g9i0VarA2 = r6i0.a(view);
                    g9i0VarA2.e(f);
                    if (!h9i0Var2.e) {
                        arrayList.add(g9i0VarA2);
                    }
                }
                boolean z6 = h9i0Var2.e;
                if (!z6) {
                    h9i0Var2.c = z;
                }
                if (!z6) {
                    h9i0Var2.b = 250L;
                }
                if (!z6) {
                    h9i0Var2.d = aVar;
                }
                this.t = h9i0Var2;
                h9i0Var2.b();
                return;
            }
            return;
        }
        if (z4) {
            return;
        }
        this.s = true;
        h9i0 h9i0Var3 = this.t;
        if (h9i0Var3 != null) {
            h9i0Var3.a();
        }
        this.d.setVisibility(0);
        int i2 = this.n;
        b bVar = this.x;
        if (i2 == 0 && (this.u || z2)) {
            this.d.setTranslationY(0.0f);
            float f2 = -this.d.getHeight();
            if (z2) {
                int[] iArr2 = {0, 0};
                this.d.getLocationInWindow(iArr2);
                f2 -= iArr2[1];
            }
            this.d.setTranslationY(f2);
            h9i0 h9i0Var4 = new h9i0();
            g9i0 g9i0VarA3 = r6i0.a(this.d);
            g9i0VarA3.e(0.0f);
            final View view3 = g9i0VarA3.a.get();
            if (view3 != null) {
                view3.animate().setUpdateListener(cVar != null ? new ValueAnimator.AnimatorUpdateListener() { // from class: e9i0
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        ((View) e.this.d.getParent()).invalidate();
                    }
                } : null);
            }
            boolean z7 = h9i0Var4.e;
            ArrayList<g9i0> arrayList2 = h9i0Var4.a;
            if (!z7) {
                arrayList2.add(g9i0VarA3);
            }
            if (this.o && view != null) {
                view.setTranslationY(f2);
                g9i0 g9i0VarA4 = r6i0.a(view);
                g9i0VarA4.e(0.0f);
                if (!h9i0Var4.e) {
                    arrayList2.add(g9i0VarA4);
                }
            }
            boolean z8 = h9i0Var4.e;
            if (!z8) {
                h9i0Var4.c = A;
            }
            if (!z8) {
                h9i0Var4.b = 250L;
            }
            if (!z8) {
                h9i0Var4.d = bVar;
            }
            this.t = h9i0Var4;
            h9i0Var4.b();
        } else {
            this.d.setAlpha(1.0f);
            this.d.setTranslationY(0.0f);
            if (this.o && view != null) {
                view.setTranslationY(0.0f);
            }
            bVar.a();
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.c;
        if (actionBarOverlayLayout != null) {
            WeakHashMap<View, g9i0> weakHashMap = r6i0.a;
            r6i0.c.c(actionBarOverlayLayout);
        }
    }

    public e(Dialog dialog) {
        new ArrayList();
        this.m = new ArrayList<>();
        this.n = 0;
        this.o = true;
        this.s = true;
        this.w = new a();
        this.x = new b();
        this.y = new c();
        s(dialog.getWindow().getDecorView());
    }
}
