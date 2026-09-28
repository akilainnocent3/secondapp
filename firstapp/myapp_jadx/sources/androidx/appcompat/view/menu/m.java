package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import defpackage.hce0;

/* JADX INFO: loaded from: classes.dex */
public class m extends f implements SubMenu {
    public final h A;
    public final f z;

    public m(Context context, f fVar, h hVar) {
        super(context);
        this.z = fVar;
        this.A = hVar;
    }

    @Override // androidx.appcompat.view.menu.f
    public final boolean d(h hVar) {
        return this.z.d(hVar);
    }

    @Override // androidx.appcompat.view.menu.f
    public final boolean e(f fVar, MenuItem menuItem) {
        return super.e(fVar, menuItem) || this.z.e(fVar, menuItem);
    }

    @Override // android.view.SubMenu
    public final MenuItem getItem() {
        return this.A;
    }

    @Override // androidx.appcompat.view.menu.f
    public final boolean h(h hVar) {
        return this.z.h(hVar);
    }

    @Override // androidx.appcompat.view.menu.f
    public final String l() {
        h hVar = this.A;
        int i = hVar != null ? hVar.a : 0;
        if (i == 0) {
            return null;
        }
        return hce0.a(i, "android:menu:actionviewstates:");
    }

    @Override // androidx.appcompat.view.menu.f
    public final f m() {
        return this.z.m();
    }

    @Override // androidx.appcompat.view.menu.f
    public final boolean o() {
        return this.z.o();
    }

    @Override // androidx.appcompat.view.menu.f
    public final boolean p() {
        return this.z.p();
    }

    @Override // androidx.appcompat.view.menu.f
    public final boolean q() {
        return this.z.q();
    }

    @Override // androidx.appcompat.view.menu.f, android.view.Menu
    public final void setGroupDividerEnabled(boolean z) {
        this.z.setGroupDividerEnabled(z);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(Drawable drawable) {
        w(0, null, 0, drawable, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(CharSequence charSequence) {
        w(0, charSequence, 0, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderView(View view) {
        w(0, null, 0, null, view);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(Drawable drawable) {
        this.A.setIcon(drawable);
        return this;
    }

    @Override // androidx.appcompat.view.menu.f, android.view.Menu
    public final void setQwertyMode(boolean z) {
        this.z.setQwertyMode(z);
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(int i) {
        this.A.setIcon(i);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(int i) {
        w(0, null, i, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(int i) {
        w(i, null, 0, null, null);
        return this;
    }
}
