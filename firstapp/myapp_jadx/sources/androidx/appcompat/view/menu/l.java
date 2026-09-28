package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Parcelable;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.widget.MenuPopupWindow;
import com.sportybet.android.gp.tz.R;
import defpackage.ib5;
import defpackage.qef;
import defpackage.ymv;

/* JADX INFO: loaded from: classes.dex */
public final class l extends ymv implements PopupWindow.OnDismissListener, View.OnKeyListener {
    public View A;
    public View B;
    public j.a C;
    public ViewTreeObserver D;
    public boolean E;
    public boolean F;
    public int G;
    public boolean I;
    public final Context b;
    public final f c;
    public final e d;
    public final boolean e;
    public final int f;
    public final int i;
    public final MenuPopupWindow v;
    public PopupWindow.OnDismissListener z;
    public final a w = new a();
    public final b y = new b();
    public int H = 0;

    public class a implements ViewTreeObserver.OnGlobalLayoutListener {
        public a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            l lVar = l.this;
            MenuPopupWindow menuPopupWindow = lVar.v;
            if (!lVar.b() || menuPopupWindow.N) {
                return;
            }
            View view = lVar.B;
            if (view == null || !view.isShown()) {
                lVar.dismiss();
            } else {
                menuPopupWindow.a();
            }
        }
    }

    public class b implements View.OnAttachStateChangeListener {
        public b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
            l lVar = l.this;
            ViewTreeObserver viewTreeObserver = lVar.D;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    lVar.D = view.getViewTreeObserver();
                }
                lVar.D.removeGlobalOnLayoutListener(lVar.w);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    public l(Context context, f fVar, View view, int i, boolean z) {
        this.b = context;
        this.c = fVar;
        this.e = z;
        this.d = new e(fVar, LayoutInflater.from(context), z, R.layout.abc_popup_menu_item_layout);
        this.i = i;
        Resources resources = context.getResources();
        this.f = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.A = view;
        this.v = new MenuPopupWindow(context, null, i, 0);
        fVar.b(this, context);
    }

    @Override // defpackage.sb90
    public final void a() {
        View view;
        if (b()) {
            return;
        }
        if (this.E || (view = this.A) == null) {
            ib5.a("StandardMenuPopup cannot be used without an anchor");
            return;
        }
        this.B = view;
        MenuPopupWindow menuPopupWindow = this.v;
        PopupWindow popupWindow = menuPopupWindow.O;
        PopupWindow popupWindow2 = menuPopupWindow.O;
        popupWindow.setOnDismissListener(this);
        menuPopupWindow.E = this;
        menuPopupWindow.N = true;
        popupWindow2.setFocusable(true);
        View view2 = this.B;
        boolean z = this.D == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.D = viewTreeObserver;
        if (z) {
            viewTreeObserver.addOnGlobalLayoutListener(this.w);
        }
        view2.addOnAttachStateChangeListener(this.y);
        menuPopupWindow.D = view2;
        menuPopupWindow.A = this.H;
        boolean z2 = this.F;
        Context context = this.b;
        e eVar = this.d;
        if (!z2) {
            this.G = ymv.n(eVar, context, this.f);
            this.F = true;
        }
        menuPopupWindow.r(this.G);
        popupWindow2.setInputMethodMode(2);
        Rect rect = this.a;
        menuPopupWindow.M = rect != null ? new Rect(rect) : null;
        menuPopupWindow.a();
        qef qefVar = menuPopupWindow.c;
        qefVar.setOnKeyListener(this);
        if (this.I) {
            f fVar = this.c;
            if (fVar.m != null) {
                FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(context).inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) qefVar, false);
                TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
                if (textView != null) {
                    textView.setText(fVar.m);
                }
                frameLayout.setEnabled(false);
                qefVar.addHeaderView(frameLayout, null, false);
            }
        }
        menuPopupWindow.m(eVar);
        menuPopupWindow.a();
    }

    @Override // defpackage.sb90
    public final boolean b() {
        return !this.E && this.v.O.isShowing();
    }

    @Override // androidx.appcompat.view.menu.j
    public final void c(f fVar, boolean z) {
        if (fVar != this.c) {
            return;
        }
        dismiss();
        j.a aVar = this.C;
        if (aVar != null) {
            aVar.c(fVar, z);
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public final void d(j.a aVar) {
        this.C = aVar;
    }

    @Override // defpackage.sb90
    public final void dismiss() {
        if (b()) {
            this.v.dismiss();
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public final void f(Parcelable parcelable) {
    }

    @Override // androidx.appcompat.view.menu.j
    public final boolean g(m mVar) {
        boolean z;
        if (mVar.hasVisibleItems()) {
            i iVar = new i(this.b, mVar, this.B, this.e, this.i, 0);
            j.a aVar = this.C;
            iVar.h = aVar;
            ymv ymvVar = iVar.i;
            if (ymvVar != null) {
                ymvVar.d(aVar);
            }
            int size = mVar.f.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    z = false;
                    break;
                }
                MenuItem item = mVar.getItem(i);
                if (item.isVisible() && item.getIcon() != null) {
                    z = true;
                    break;
                }
                i++;
            }
            iVar.g = z;
            ymv ymvVar2 = iVar.i;
            if (ymvVar2 != null) {
                ymvVar2.q(z);
            }
            iVar.j = this.z;
            this.z = null;
            this.c.c(false);
            MenuPopupWindow menuPopupWindow = this.v;
            int width = menuPopupWindow.f;
            int iL = menuPopupWindow.l();
            if ((Gravity.getAbsoluteGravity(this.H, this.A.getLayoutDirection()) & 7) == 5) {
                width += this.A.getWidth();
            }
            if (!iVar.b()) {
                if (iVar.e != null) {
                    iVar.d(width, iL, true, true);
                }
            }
            j.a aVar2 = this.C;
            if (aVar2 != null) {
                aVar2.d(mVar);
            }
            return true;
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public final Parcelable h() {
        return null;
    }

    @Override // androidx.appcompat.view.menu.j
    public final void j(boolean z) {
        this.F = false;
        e eVar = this.d;
        if (eVar != null) {
            eVar.notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public final boolean k() {
        return false;
    }

    @Override // defpackage.ymv
    public final void m(f fVar) {
    }

    @Override // defpackage.sb90
    public final qef o() {
        return this.v.c;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.E = true;
        this.c.c(true);
        ViewTreeObserver viewTreeObserver = this.D;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.D = this.B.getViewTreeObserver();
            }
            this.D.removeGlobalOnLayoutListener(this.w);
            this.D = null;
        }
        this.B.removeOnAttachStateChangeListener(this.y);
        PopupWindow.OnDismissListener onDismissListener = this.z;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // defpackage.ymv
    public final void p(View view) {
        this.A = view;
    }

    @Override // defpackage.ymv
    public final void q(boolean z) {
        this.d.c = z;
    }

    @Override // defpackage.ymv
    public final void r(int i) {
        this.H = i;
    }

    @Override // defpackage.ymv
    public final void s(int i) {
        this.v.f = i;
    }

    @Override // defpackage.ymv
    public final void t(PopupWindow.OnDismissListener onDismissListener) {
        this.z = onDismissListener;
    }

    @Override // defpackage.ymv
    public final void u(boolean z) {
        this.I = z;
    }

    @Override // defpackage.ymv
    public final void v(int i) {
        this.v.i(i);
    }
}
