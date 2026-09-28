package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.view.menu.f;
import androidx.appcompat.view.menu.h;
import androidx.appcompat.view.menu.j;
import com.sportybet.android.gp.tz.R;
import defpackage.a0g0;
import defpackage.dl30;
import defpackage.fyf0;
import defpackage.g9i0;
import defpackage.gr0;
import defpackage.j9i0;
import defpackage.l5d;
import defpackage.r6i0;

/* JADX INFO: loaded from: classes.dex */
public final class b implements l5d {
    public final Toolbar a;
    public int b;
    public final View c;
    public Drawable d;
    public Drawable e;
    public final Drawable f;
    public final boolean g;
    public CharSequence h;
    public final CharSequence i;
    public final CharSequence j;
    public Window.Callback k;
    public boolean l;
    public ActionMenuPresenter m;
    public final int n;
    public final Drawable o;

    public class a extends j9i0 {
        public boolean a = false;
        public final /* synthetic */ int b;

        public a(int i) {
            this.b = i;
        }

        @Override // defpackage.i9i0
        public final void a() {
            if (this.a) {
                return;
            }
            b.this.a.setVisibility(this.b);
        }

        @Override // defpackage.j9i0, defpackage.i9i0
        public final void b() {
            this.a = true;
        }

        @Override // defpackage.j9i0, defpackage.i9i0
        public final void c() {
            b.this.a.setVisibility(0);
        }
    }

    public b(Toolbar toolbar, boolean z) {
        Drawable drawable;
        this.n = 0;
        this.a = toolbar;
        this.h = toolbar.getTitle();
        this.i = toolbar.getSubtitle();
        this.g = this.h != null;
        this.f = toolbar.getNavigationIcon();
        fyf0 fyf0VarF = fyf0.f(toolbar.getContext(), null, dl30.a, R.attr.actionBarStyle);
        TypedArray typedArray = fyf0VarF.b;
        int i = 15;
        this.o = fyf0VarF.b(15);
        if (z) {
            CharSequence text = typedArray.getText(27);
            if (!TextUtils.isEmpty(text)) {
                this.g = true;
                this.h = text;
                if ((this.b & 8) != 0) {
                    toolbar.setTitle(text);
                    if (this.g) {
                        r6i0.q(toolbar.getRootView(), text);
                    }
                }
            }
            CharSequence text2 = typedArray.getText(25);
            if (!TextUtils.isEmpty(text2)) {
                this.i = text2;
                if ((this.b & 8) != 0) {
                    toolbar.setSubtitle(text2);
                }
            }
            Drawable drawableB = fyf0VarF.b(20);
            if (drawableB != null) {
                this.e = drawableB;
                q();
            }
            Drawable drawableB2 = fyf0VarF.b(17);
            if (drawableB2 != null) {
                setIcon(drawableB2);
            }
            if (this.f == null && (drawable = this.o) != null) {
                this.f = drawable;
                if ((this.b & 4) != 0) {
                    toolbar.setNavigationIcon(drawable);
                } else {
                    toolbar.setNavigationIcon((Drawable) null);
                }
            }
            g(typedArray.getInt(10, 0));
            int resourceId = typedArray.getResourceId(9, 0);
            if (resourceId != 0) {
                View viewInflate = LayoutInflater.from(toolbar.getContext()).inflate(resourceId, (ViewGroup) toolbar, false);
                View view = this.c;
                if (view != null && (this.b & 16) != 0) {
                    toolbar.removeView(view);
                }
                this.c = viewInflate;
                if (viewInflate != null && (this.b & 16) != 0) {
                    toolbar.addView(viewInflate);
                }
                g(this.b | 16);
            }
            int layoutDimension = typedArray.getLayoutDimension(13, 0);
            if (layoutDimension > 0) {
                ViewGroup.LayoutParams layoutParams = toolbar.getLayoutParams();
                layoutParams.height = layoutDimension;
                toolbar.setLayoutParams(layoutParams);
            }
            int dimensionPixelOffset = typedArray.getDimensionPixelOffset(7, -1);
            int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(3, -1);
            if (dimensionPixelOffset >= 0 || dimensionPixelOffset2 >= 0) {
                toolbar.setContentInsetsRelative(Math.max(dimensionPixelOffset, 0), Math.max(dimensionPixelOffset2, 0));
            }
            int resourceId2 = typedArray.getResourceId(28, 0);
            if (resourceId2 != 0) {
                toolbar.setTitleTextAppearance(toolbar.getContext(), resourceId2);
            }
            int resourceId3 = typedArray.getResourceId(26, 0);
            if (resourceId3 != 0) {
                toolbar.setSubtitleTextAppearance(toolbar.getContext(), resourceId3);
            }
            int resourceId4 = typedArray.getResourceId(22, 0);
            if (resourceId4 != 0) {
                toolbar.setPopupTheme(resourceId4);
            }
        } else {
            if (toolbar.getNavigationIcon() != null) {
                this.o = toolbar.getNavigationIcon();
            } else {
                i = 11;
            }
            this.b = i;
        }
        fyf0VarF.g();
        if (R.string.abc_action_bar_up_description != this.n) {
            this.n = R.string.abc_action_bar_up_description;
            if (TextUtils.isEmpty(toolbar.getNavigationContentDescription())) {
                int i2 = this.n;
                this.j = i2 != 0 ? toolbar.getContext().getString(i2) : null;
                p();
            }
        }
        this.j = toolbar.getNavigationContentDescription();
        toolbar.setNavigationOnClickListener(new a0g0(this));
    }

    @Override // defpackage.l5d
    public final boolean a() {
        ActionMenuView actionMenuView;
        Toolbar toolbar = this.a;
        return toolbar.getVisibility() == 0 && (actionMenuView = toolbar.a) != null && actionMenuView.H;
    }

    @Override // defpackage.l5d
    public final boolean b() {
        ActionMenuPresenter actionMenuPresenter;
        ActionMenuView actionMenuView = this.a.a;
        return (actionMenuView == null || (actionMenuPresenter = actionMenuView.I) == null || !actionMenuPresenter.b()) ? false : true;
    }

    @Override // defpackage.l5d
    public final boolean c() {
        return this.a.u();
    }

    @Override // defpackage.l5d
    public final void collapseActionView() {
        Toolbar.f fVar = this.a.e0;
        h hVar = fVar == null ? null : fVar.b;
        if (hVar != null) {
            hVar.collapseActionView();
        }
    }

    @Override // defpackage.l5d
    public final boolean d() {
        ActionMenuPresenter actionMenuPresenter;
        ActionMenuView actionMenuView = this.a.a;
        return (actionMenuView == null || (actionMenuPresenter = actionMenuView.I) == null || !actionMenuPresenter.m()) ? false : true;
    }

    @Override // defpackage.l5d
    public final boolean e() {
        ActionMenuPresenter actionMenuPresenter;
        ActionMenuView actionMenuView = this.a.a;
        if (actionMenuView == null || (actionMenuPresenter = actionMenuView.I) == null) {
            return false;
        }
        return actionMenuPresenter.K != null || actionMenuPresenter.m();
    }

    @Override // defpackage.l5d
    public final boolean f() {
        Toolbar.f fVar = this.a.e0;
        return (fVar == null || fVar.b == null) ? false : true;
    }

    @Override // defpackage.l5d
    public final void g(int i) {
        View view;
        int i2 = this.b ^ i;
        this.b = i;
        if (i2 != 0) {
            int i3 = i2 & 4;
            Toolbar toolbar = this.a;
            if (i3 != 0) {
                if ((i & 4) != 0) {
                    p();
                }
                if ((this.b & 4) != 0) {
                    Drawable drawable = this.f;
                    if (drawable == null) {
                        drawable = this.o;
                    }
                    toolbar.setNavigationIcon(drawable);
                } else {
                    toolbar.setNavigationIcon((Drawable) null);
                }
            }
            if ((i2 & 3) != 0) {
                q();
            }
            if ((i2 & 8) != 0) {
                if ((i & 8) != 0) {
                    toolbar.setTitle(this.h);
                    toolbar.setSubtitle(this.i);
                } else {
                    toolbar.setTitle((CharSequence) null);
                    toolbar.setSubtitle((CharSequence) null);
                }
            }
            if ((i2 & 16) == 0 || (view = this.c) == null) {
                return;
            }
            if ((i & 16) != 0) {
                toolbar.addView(view);
            } else {
                toolbar.removeView(view);
            }
        }
    }

    @Override // defpackage.l5d
    public final Context getContext() {
        return this.a.getContext();
    }

    @Override // defpackage.l5d
    public final CharSequence getTitle() {
        return this.a.getTitle();
    }

    @Override // defpackage.l5d
    public final g9i0 h(int i, long j) {
        g9i0 g9i0VarA = r6i0.a(this.a);
        g9i0VarA.a(i == 0 ? 1.0f : 0.0f);
        g9i0VarA.c(j);
        g9i0VarA.d(new a(i));
        return g9i0VarA;
    }

    @Override // defpackage.l5d
    public final void i() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    @Override // defpackage.l5d
    public final void j(boolean z) {
        this.a.setCollapsible(z);
    }

    @Override // defpackage.l5d
    public final void k() {
        ActionMenuPresenter actionMenuPresenter;
        ActionMenuView actionMenuView = this.a.a;
        if (actionMenuView == null || (actionMenuPresenter = actionMenuView.I) == null) {
            return;
        }
        actionMenuPresenter.b();
        ActionMenuPresenter.a aVar = actionMenuPresenter.J;
        if (aVar == null || !aVar.b()) {
            return;
        }
        aVar.i.dismiss();
    }

    @Override // defpackage.l5d
    public final void m(int i) {
        this.e = i != 0 ? gr0.a(this.a.getContext(), i) : null;
        q();
    }

    @Override // defpackage.l5d
    public final int n() {
        return this.b;
    }

    @Override // defpackage.l5d
    public final void o() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    public final void p() {
        if ((this.b & 4) != 0) {
            boolean zIsEmpty = TextUtils.isEmpty(this.j);
            Toolbar toolbar = this.a;
            if (zIsEmpty) {
                toolbar.setNavigationContentDescription(this.n);
            } else {
                toolbar.setNavigationContentDescription(this.j);
            }
        }
    }

    public final void q() {
        Drawable drawable;
        int i = this.b;
        if ((i & 2) == 0) {
            drawable = null;
        } else if ((i & 1) == 0 || (drawable = this.e) == null) {
            drawable = this.d;
        }
        this.a.setLogo(drawable);
    }

    @Override // defpackage.l5d
    public final void setIcon(int i) {
        setIcon(i != 0 ? gr0.a(this.a.getContext(), i) : null);
    }

    @Override // defpackage.l5d
    public final void setMenu(Menu menu, j.a aVar) {
        ActionMenuPresenter actionMenuPresenter = this.m;
        Toolbar toolbar = this.a;
        if (actionMenuPresenter == null) {
            actionMenuPresenter = new ActionMenuPresenter(toolbar.getContext());
            this.m = actionMenuPresenter;
            actionMenuPresenter.w = R.id.action_menu_presenter;
        }
        actionMenuPresenter.e = aVar;
        toolbar.setMenu((f) menu, actionMenuPresenter);
    }

    @Override // defpackage.l5d
    public final void setMenuPrepared() {
        this.l = true;
    }

    @Override // defpackage.l5d
    public final void setVisibility(int i) {
        this.a.setVisibility(i);
    }

    @Override // defpackage.l5d
    public final void setWindowCallback(Window.Callback callback) {
        this.k = callback;
    }

    @Override // defpackage.l5d
    public final void setWindowTitle(CharSequence charSequence) {
        boolean z = this.g;
        if (z) {
            return;
        }
        this.h = charSequence;
        if ((this.b & 8) != 0) {
            Toolbar toolbar = this.a;
            toolbar.setTitle(charSequence);
            if (z) {
                r6i0.q(toolbar.getRootView(), charSequence);
            }
        }
    }

    @Override // defpackage.l5d
    public final void setIcon(Drawable drawable) {
        this.d = drawable;
        q();
    }

    @Override // defpackage.l5d
    public final void l() {
    }
}
