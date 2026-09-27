package s;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.ActionProvider;
import android.view.CollapsibleActionView;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import java.lang.reflect.Method;
import k.y0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@y0({y0.a.LIBRARY_GROUP_PREFIX})
public class c extends s.b implements MenuItem {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final String f128139q = "MenuItemWrapper";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final p1.c f128140o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Method f128141p;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class a extends f2.b implements ActionProvider.VisibilityListener {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public f2.b.InterfaceC0815b f128142e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final ActionProvider f128143f;

        public a(Context context, ActionProvider actionProvider) {
            super(context);
            this.f128143f = actionProvider;
        }

        @Override // f2.b
        public boolean b() {
            return this.f128143f.hasSubMenu();
        }

        @Override // f2.b
        public boolean c() {
            return this.f128143f.isVisible();
        }

        @Override // f2.b
        @NonNull
        public View d() {
            return this.f128143f.onCreateActionView();
        }

        @Override // f2.b
        public View e(MenuItem menuItem) {
            return this.f128143f.onCreateActionView(menuItem);
        }

        @Override // f2.b
        public boolean f() {
            return this.f128143f.onPerformDefaultAction();
        }

        @Override // f2.b
        public void g(SubMenu subMenu) {
            this.f128143f.onPrepareSubMenu(c.this.f(subMenu));
        }

        @Override // f2.b
        public boolean h() {
            return this.f128143f.overridesItemVisibility();
        }

        @Override // f2.b
        public void i() {
            this.f128143f.refreshVisibility();
        }

        @Override // f2.b
        public void l(f2.b.InterfaceC0815b interfaceC0815b) {
            this.f128142e = interfaceC0815b;
            this.f128143f.setVisibilityListener(interfaceC0815b != null ? this : null);
        }

        @Override // android.view.ActionProvider.VisibilityListener
        public void onActionProviderVisibilityChanged(boolean z10) {
            f2.b.InterfaceC0815b interfaceC0815b = this.f128142e;
            if (interfaceC0815b != null) {
                interfaceC0815b.onActionProviderVisibilityChanged(z10);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class b extends FrameLayout implements r.c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final CollapsibleActionView f128145b;

        /* JADX WARN: Multi-variable type inference failed */
        public b(View view) {
            super(view.getContext());
            this.f128145b = (CollapsibleActionView) view;
            addView(view);
        }

        public View a() {
            return (View) this.f128145b;
        }

        @Override // r.c
        public void onActionViewCollapsed() {
            this.f128145b.onActionViewCollapsed();
        }

        @Override // r.c
        public void onActionViewExpanded() {
            this.f128145b.onActionViewExpanded();
        }
    }

    /* JADX INFO: renamed from: s.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class MenuItemOnActionExpandListenerC1275c implements MenuItem.OnActionExpandListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final MenuItem.OnActionExpandListener f128146a;

        public MenuItemOnActionExpandListenerC1275c(MenuItem.OnActionExpandListener onActionExpandListener) {
            this.f128146a = onActionExpandListener;
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public boolean onMenuItemActionCollapse(MenuItem menuItem) {
            return this.f128146a.onMenuItemActionCollapse(c.this.e(menuItem));
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public boolean onMenuItemActionExpand(MenuItem menuItem) {
            return this.f128146a.onMenuItemActionExpand(c.this.e(menuItem));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class d implements MenuItem.OnMenuItemClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final MenuItem.OnMenuItemClickListener f128148a;

        public d(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
            this.f128148a = onMenuItemClickListener;
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            return this.f128148a.onMenuItemClick(c.this.e(menuItem));
        }
    }

    public c(Context context, p1.c cVar) {
        super(context);
        if (cVar == null) {
            throw new IllegalArgumentException("Wrapped Object can not be null.");
        }
        this.f128140o = cVar;
    }

    @Override // android.view.MenuItem
    public boolean collapseActionView() {
        return this.f128140o.collapseActionView();
    }

    @Override // android.view.MenuItem
    public boolean expandActionView() {
        return this.f128140o.expandActionView();
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        f2.b bVarB = this.f128140o.b();
        if (bVarB instanceof a) {
            return ((a) bVarB).f128143f;
        }
        return null;
    }

    @Override // android.view.MenuItem
    public View getActionView() {
        View actionView = this.f128140o.getActionView();
        return actionView instanceof b ? ((b) actionView).a() : actionView;
    }

    @Override // android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f128140o.getAlphabeticModifiers();
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f128140o.getAlphabeticShortcut();
    }

    @Override // android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.f128140o.getContentDescription();
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f128140o.getGroupId();
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        return this.f128140o.getIcon();
    }

    @Override // android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.f128140o.getIconTintList();
    }

    @Override // android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.f128140o.getIconTintMode();
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f128140o.getIntent();
    }

    @Override // android.view.MenuItem
    public int getItemId() {
        return this.f128140o.getItemId();
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f128140o.getMenuInfo();
    }

    @Override // android.view.MenuItem
    public int getNumericModifiers() {
        return this.f128140o.getNumericModifiers();
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f128140o.getNumericShortcut();
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f128140o.getOrder();
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return f(this.f128140o.getSubMenu());
    }

    @Override // android.view.MenuItem
    public CharSequence getTitle() {
        return this.f128140o.getTitle();
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        return this.f128140o.getTitleCondensed();
    }

    @Override // android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.f128140o.getTooltipText();
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return this.f128140o.hasSubMenu();
    }

    @Override // android.view.MenuItem
    public boolean isActionViewExpanded() {
        return this.f128140o.isActionViewExpanded();
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return this.f128140o.isCheckable();
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return this.f128140o.isChecked();
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return this.f128140o.isEnabled();
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        return this.f128140o.isVisible();
    }

    public void j(boolean z10) {
        try {
            if (this.f128141p == null) {
                this.f128141p = this.f128140o.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
            }
            this.f128141p.invoke(this.f128140o, Boolean.valueOf(z10));
        } catch (Exception e10) {
            Log.w(f128139q, "Error while calling setExclusiveCheckable", e10);
        }
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        a aVar = new a(this.f128136l, actionProvider);
        p1.c cVar = this.f128140o;
        if (actionProvider == null) {
            aVar = null;
        }
        cVar.a(aVar);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionView(View view) {
        if (view instanceof CollapsibleActionView) {
            view = new b(view);
        }
        this.f128140o.setActionView(view);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c10) {
        this.f128140o.setAlphabeticShortcut(c10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z10) {
        this.f128140o.setCheckable(z10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z10) {
        this.f128140o.setChecked(z10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setContentDescription(CharSequence charSequence) {
        this.f128140o.setContentDescription(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z10) {
        this.f128140o.setEnabled(z10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f128140o.setIcon(drawable);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f128140o.setIconTintList(colorStateList);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f128140o.setIconTintMode(mode);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f128140o.setIntent(intent);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c10) {
        this.f128140o.setNumericShortcut(c10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f128140o.setOnActionExpandListener(onActionExpandListener != null ? new MenuItemOnActionExpandListenerC1275c(onActionExpandListener) : null);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f128140o.setOnMenuItemClickListener(onMenuItemClickListener != null ? new d(onMenuItemClickListener) : null);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c10, char c11) {
        this.f128140o.setShortcut(c10, c11);
        return this;
    }

    @Override // android.view.MenuItem
    public void setShowAsAction(int i10) {
        this.f128140o.setShowAsAction(i10);
    }

    @Override // android.view.MenuItem
    public MenuItem setShowAsActionFlags(int i10) {
        this.f128140o.setShowAsActionFlags(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f128140o.setTitle(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f128140o.setTitleCondensed(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTooltipText(CharSequence charSequence) {
        this.f128140o.setTooltipText(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z10) {
        return this.f128140o.setVisible(z10);
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c10, int i10) {
        this.f128140o.setAlphabeticShortcut(c10, i10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i10) {
        this.f128140o.setIcon(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c10, int i10) {
        this.f128140o.setNumericShortcut(c10, i10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c10, char c11, int i10, int i11) {
        this.f128140o.setShortcut(c10, c11, i10, i11);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i10) {
        this.f128140o.setTitle(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionView(int i10) {
        this.f128140o.setActionView(i10);
        View actionView = this.f128140o.getActionView();
        if (actionView instanceof CollapsibleActionView) {
            this.f128140o.setActionView(new b(actionView));
        }
        return this;
    }
}
