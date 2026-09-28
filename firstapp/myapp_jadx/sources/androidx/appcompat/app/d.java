package androidx.appcompat.app;

import android.content.Context;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.appcompat.view.menu.f;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.ActionMenuPresenter;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import defpackage.g9i0;
import defpackage.r6i0;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class d extends ActionBar {
    public final androidx.appcompat.widget.b a;
    public final Window.Callback b;
    public final e c;
    public boolean d;
    public boolean e;
    public boolean f;
    public final ArrayList<ActionBar.a> g = new ArrayList<>();
    public final a h = new a();

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            d dVar = d.this;
            Window.Callback callback = dVar.b;
            Menu menuR = dVar.r();
            f fVar = menuR instanceof f ? (f) menuR : null;
            if (fVar != null) {
                fVar.y();
            }
            try {
                menuR.clear();
                if (!callback.onCreatePanelMenu(0, menuR) || !callback.onPreparePanel(0, null, menuR)) {
                    menuR.clear();
                }
            } finally {
                if (fVar != null) {
                    fVar.x();
                }
            }
        }
    }

    public class b implements Toolbar.g {
        public b() {
        }
    }

    public final class c implements j.a {
        public boolean a;

        public c() {
        }

        @Override // androidx.appcompat.view.menu.j.a
        public final void c(f fVar, boolean z) {
            if (this.a) {
                return;
            }
            this.a = true;
            d dVar = d.this;
            dVar.a.k();
            dVar.b.onPanelClosed(108, fVar);
            this.a = false;
        }

        @Override // androidx.appcompat.view.menu.j.a
        public final boolean d(f fVar) {
            d.this.b.onMenuOpened(108, fVar);
            return true;
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.app.d$d, reason: collision with other inner class name */
    public final class C0031d implements f.a {
        public C0031d() {
        }

        @Override // androidx.appcompat.view.menu.f.a
        public final boolean a(f fVar, MenuItem menuItem) {
            return false;
        }

        @Override // androidx.appcompat.view.menu.f.a
        public final void b(f fVar) {
            ActionMenuPresenter actionMenuPresenter;
            d dVar = d.this;
            Window.Callback callback = dVar.b;
            ActionMenuView actionMenuView = dVar.a.a.a;
            if (actionMenuView != null && (actionMenuPresenter = actionMenuView.I) != null && actionMenuPresenter.m()) {
                callback.onPanelClosed(108, fVar);
            } else if (callback.onPreparePanel(0, null, fVar)) {
                callback.onMenuOpened(108, fVar);
            }
        }
    }

    public class e {
        public e() {
        }
    }

    public d(Toolbar toolbar, CharSequence charSequence, Window.Callback callback) {
        b bVar = new b();
        toolbar.getClass();
        androidx.appcompat.widget.b bVar2 = new androidx.appcompat.widget.b(toolbar, false);
        this.a = bVar2;
        callback.getClass();
        this.b = callback;
        bVar2.k = callback;
        toolbar.setOnMenuItemClickListener(bVar);
        bVar2.setWindowTitle(charSequence);
        this.c = new e();
    }

    @Override // androidx.appcompat.app.ActionBar
    public final boolean a() {
        return this.a.b();
    }

    @Override // androidx.appcompat.app.ActionBar
    public final boolean b() {
        androidx.appcompat.widget.b bVar = this.a;
        Toolbar.f fVar = bVar.a.e0;
        if (fVar == null || fVar.b == null) {
            return false;
        }
        bVar.collapseActionView();
        return true;
    }

    @Override // androidx.appcompat.app.ActionBar
    public final void c(boolean z) {
        if (z == this.f) {
            return;
        }
        this.f = z;
        ArrayList<ActionBar.a> arrayList = this.g;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList.get(i).a();
        }
    }

    @Override // androidx.appcompat.app.ActionBar
    public final int d() {
        return this.a.b;
    }

    @Override // androidx.appcompat.app.ActionBar
    public final Context e() {
        return this.a.a.getContext();
    }

    @Override // androidx.appcompat.app.ActionBar
    public final void f() {
        this.a.setVisibility(8);
    }

    @Override // androidx.appcompat.app.ActionBar
    public final boolean g() {
        androidx.appcompat.widget.b bVar = this.a;
        Toolbar toolbar = bVar.a;
        a aVar = this.h;
        toolbar.removeCallbacks(aVar);
        Toolbar toolbar2 = bVar.a;
        WeakHashMap<View, g9i0> weakHashMap = r6i0.a;
        toolbar2.postOnAnimation(aVar);
        return true;
    }

    @Override // androidx.appcompat.app.ActionBar
    public final void i() {
        this.a.a.removeCallbacks(this.h);
    }

    @Override // androidx.appcompat.app.ActionBar
    public final boolean j(int i, KeyEvent keyEvent) {
        Menu menuR = r();
        if (menuR == null) {
            return false;
        }
        menuR.setQwertyMode(KeyCharacterMap.load(keyEvent.getDeviceId()).getKeyboardType() != 1);
        return menuR.performShortcut(i, keyEvent, 0);
    }

    @Override // androidx.appcompat.app.ActionBar
    public final boolean k(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1) {
            l();
        }
        return true;
    }

    @Override // androidx.appcompat.app.ActionBar
    public final boolean l() {
        return this.a.a.u();
    }

    @Override // androidx.appcompat.app.ActionBar
    public final void m(boolean z) {
    }

    @Override // androidx.appcompat.app.ActionBar
    public final void n() {
        androidx.appcompat.widget.b bVar = this.a;
        bVar.g(bVar.b & (-9));
    }

    @Override // androidx.appcompat.app.ActionBar
    public final void o(boolean z) {
    }

    @Override // androidx.appcompat.app.ActionBar
    public final void p(CharSequence charSequence) {
        this.a.setWindowTitle(charSequence);
    }

    public final Menu r() {
        boolean z = this.e;
        androidx.appcompat.widget.b bVar = this.a;
        if (!z) {
            bVar.a.setMenuCallbacks(new c(), new C0031d());
            this.e = true;
        }
        return bVar.a.getMenu();
    }

    @Override // androidx.appcompat.app.ActionBar
    public final void h() {
    }
}
