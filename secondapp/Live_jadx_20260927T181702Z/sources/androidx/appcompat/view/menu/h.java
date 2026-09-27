package androidx.appcompat.view.menu;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import k.y0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@y0({y0.a.LIBRARY_GROUP_PREFIX})
public final class h implements p1.c {
    public static final String Q = "MenuItemImpl";
    public static final int R = 3;
    public static final int S = 1;
    public static final int T = 2;
    public static final int U = 4;
    public static final int V = 8;
    public static final int W = 16;
    public static final int X = 32;
    public static final int Y = 0;
    public Runnable A;
    public MenuItem.OnMenuItemClickListener B;
    public CharSequence C;
    public CharSequence D;
    public int K;
    public View L;
    public f2.b M;
    public MenuItem.OnActionExpandListener N;
    public ContextMenu.ContextMenuInfo P;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f6593l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f6594m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f6595n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f6596o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public CharSequence f6597p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public CharSequence f6598q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Intent f6599r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public char f6600s;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public char f6602u;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Drawable f6604w;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public e f6606y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public m f6607z;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f6601t = 4096;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f6603v = 4096;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f6605x = 0;
    public ColorStateList E = null;
    public PorterDuff.Mode F = null;
    public boolean G = false;
    public boolean H = false;
    public boolean I = false;
    public int J = 16;
    public boolean O = false;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class a implements f2.b.InterfaceC0815b {
        public a() {
        }

        @Override // f2.b.InterfaceC0815b
        public void onActionProviderVisibilityChanged(boolean z10) {
            h hVar = h.this;
            hVar.f6606y.N(hVar);
        }
    }

    public h(e eVar, int i10, int i11, int i12, int i13, CharSequence charSequence, int i14) {
        this.f6606y = eVar;
        this.f6593l = i11;
        this.f6594m = i10;
        this.f6595n = i12;
        this.f6596o = i13;
        this.f6597p = charSequence;
        this.K = i14;
    }

    public static void f(StringBuilder sb2, int i10, int i11, String str) {
        if ((i10 & i11) == i11) {
            sb2.append(str);
        }
    }

    public void A(m mVar) {
        this.f6607z = mVar;
        mVar.setHeaderTitle(getTitle());
    }

    public boolean B(boolean z10) {
        int i10 = this.J;
        int i11 = (z10 ? 0 : 8) | (i10 & (-9));
        this.J = i11;
        return i10 != i11;
    }

    public boolean C() {
        return this.f6606y.D();
    }

    public boolean D() {
        return this.f6606y.L() && j() != 0;
    }

    public boolean E() {
        return (this.K & 4) == 4;
    }

    @Override // p1.c
    @NonNull
    public p1.c a(f2.b bVar) {
        f2.b bVar2 = this.M;
        if (bVar2 != null) {
            bVar2.j();
        }
        this.L = null;
        this.M = bVar;
        this.f6606y.O(true);
        f2.b bVar3 = this.M;
        if (bVar3 != null) {
            bVar3.l(new a());
        }
        return this;
    }

    @Override // p1.c
    public f2.b b() {
        return this.M;
    }

    @Override // p1.c
    public boolean c() {
        return (this.K & 2) == 2;
    }

    @Override // p1.c, android.view.MenuItem
    public boolean collapseActionView() {
        if ((this.K & 8) == 0) {
            return false;
        }
        if (this.L == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.N;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f6606y.g(this);
        }
        return false;
    }

    @Override // p1.c
    public boolean d() {
        return (c() || q()) ? false : true;
    }

    public void e() {
        this.f6606y.M(this);
    }

    @Override // p1.c, android.view.MenuItem
    public boolean expandActionView() {
        if (!m()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.N;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.f6606y.n(this);
        }
        return false;
    }

    public final Drawable g(Drawable drawable) {
        if (drawable != null && this.I && (this.G || this.H)) {
            drawable = l1.d.r(drawable).mutate();
            if (this.G) {
                l1.d.o(drawable, this.E);
            }
            if (this.H) {
                l1.d.p(drawable, this.F);
            }
            this.I = false;
        }
        return drawable;
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // p1.c, android.view.MenuItem
    public View getActionView() {
        View view = this.L;
        if (view != null) {
            return view;
        }
        f2.b bVar = this.M;
        if (bVar == null) {
            return null;
        }
        View viewE = bVar.e(this);
        this.L = viewE;
        return viewE;
    }

    @Override // p1.c, android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f6603v;
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f6602u;
    }

    @Override // p1.c, android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.C;
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f6594m;
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        Drawable drawable = this.f6604w;
        if (drawable != null) {
            return g(drawable);
        }
        if (this.f6605x == 0) {
            return null;
        }
        Drawable drawableB = n.a.b(this.f6606y.x(), this.f6605x);
        this.f6605x = 0;
        this.f6604w = drawableB;
        return g(drawableB);
    }

    @Override // p1.c, android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.E;
    }

    @Override // p1.c, android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.F;
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f6599r;
    }

    @Override // android.view.MenuItem
    @ViewDebug.CapturedViewProperty
    public int getItemId() {
        return this.f6593l;
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.P;
    }

    @Override // p1.c, android.view.MenuItem
    public int getNumericModifiers() {
        return this.f6601t;
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f6600s;
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f6595n;
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return this.f6607z;
    }

    @Override // android.view.MenuItem
    @ViewDebug.CapturedViewProperty
    public CharSequence getTitle() {
        return this.f6597p;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f6598q;
        return charSequence != null ? charSequence : this.f6597p;
    }

    @Override // p1.c, android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.D;
    }

    public Runnable h() {
        return this.A;
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return this.f6607z != null;
    }

    public int i() {
        return this.f6596o;
    }

    @Override // p1.c, android.view.MenuItem
    public boolean isActionViewExpanded() {
        return this.O;
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return (this.J & 1) == 1;
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return (this.J & 2) == 2;
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return (this.J & 16) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        f2.b bVar = this.M;
        if (bVar == null || !bVar.h()) {
            return (this.J & 8) == 0;
        }
        return (this.J & 8) == 0 && this.M.c();
    }

    public char j() {
        return this.f6606y.K() ? this.f6602u : this.f6600s;
    }

    public String k() {
        char cJ = j();
        if (cJ == 0) {
            return "";
        }
        Resources resources = this.f6606y.x().getResources();
        StringBuilder sb2 = new StringBuilder();
        if (ViewConfiguration.get(this.f6606y.x()).hasPermanentMenuKey()) {
            sb2.append(resources.getString(m.a.k.f105796r));
        }
        int i10 = this.f6606y.K() ? this.f6603v : this.f6601t;
        f(sb2, i10, 65536, resources.getString(m.a.k.f105792n));
        f(sb2, i10, 4096, resources.getString(m.a.k.f105788j));
        f(sb2, i10, 2, resources.getString(m.a.k.f105787i));
        f(sb2, i10, 1, resources.getString(m.a.k.f105793o));
        f(sb2, i10, 4, resources.getString(m.a.k.f105795q));
        f(sb2, i10, 8, resources.getString(m.a.k.f105791m));
        if (cJ == '\b') {
            sb2.append(resources.getString(m.a.k.f105789k));
        } else if (cJ == '\n') {
            sb2.append(resources.getString(m.a.k.f105790l));
        } else if (cJ != ' ') {
            sb2.append(cJ);
        } else {
            sb2.append(resources.getString(m.a.k.f105794p));
        }
        return sb2.toString();
    }

    public CharSequence l(k.a aVar) {
        return (aVar == null || !aVar.c()) ? getTitle() : getTitleCondensed();
    }

    public boolean m() {
        f2.b bVar;
        if ((this.K & 8) != 0) {
            if (this.L == null && (bVar = this.M) != null) {
                this.L = bVar.e(this);
            }
            if (this.L != null) {
                return true;
            }
        }
        return false;
    }

    public boolean n() {
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = this.B;
        if (onMenuItemClickListener != null && onMenuItemClickListener.onMenuItemClick(this)) {
            return true;
        }
        e eVar = this.f6606y;
        if (eVar.i(eVar, this)) {
            return true;
        }
        Runnable runnable = this.A;
        if (runnable != null) {
            runnable.run();
            return true;
        }
        if (this.f6599r != null) {
            try {
                this.f6606y.x().startActivity(this.f6599r);
                return true;
            } catch (ActivityNotFoundException e10) {
                Log.e(Q, "Can't find activity to handle intent; ignoring", e10);
            }
        }
        f2.b bVar = this.M;
        return bVar != null && bVar.f();
    }

    public boolean o() {
        return (this.J & 32) == 32;
    }

    public boolean p() {
        return (this.J & 4) != 0;
    }

    public boolean q() {
        return (this.K & 1) == 1;
    }

    @Override // p1.c, android.view.MenuItem
    @NonNull
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public p1.c setActionView(int i10) {
        Context contextX = this.f6606y.x();
        setActionView(LayoutInflater.from(contextX).inflate(i10, (ViewGroup) new LinearLayout(contextX), false));
        return this;
    }

    @Override // p1.c, android.view.MenuItem
    @NonNull
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public p1.c setActionView(View view) {
        int i10;
        this.L = view;
        this.M = null;
        if (view != null && view.getId() == -1 && (i10 = this.f6593l) > 0) {
            view.setId(i10);
        }
        this.f6606y.M(this);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c10) {
        if (this.f6602u == c10) {
            return this;
        }
        this.f6602u = Character.toLowerCase(c10);
        this.f6606y.O(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z10) {
        int i10 = this.J;
        int i11 = (z10 ? 1 : 0) | (i10 & (-2));
        this.J = i11;
        if (i10 != i11) {
            this.f6606y.O(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z10) {
        if ((this.J & 4) != 0) {
            this.f6606y.b0(this);
            return this;
        }
        v(z10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z10) {
        if (z10) {
            this.J |= 16;
        } else {
            this.J &= -17;
        }
        this.f6606y.O(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f6605x = 0;
        this.f6604w = drawable;
        this.I = true;
        this.f6606y.O(false);
        return this;
    }

    @Override // p1.c, android.view.MenuItem
    @NonNull
    public MenuItem setIconTintList(@Nullable ColorStateList colorStateList) {
        this.E = colorStateList;
        this.G = true;
        this.I = true;
        this.f6606y.O(false);
        return this;
    }

    @Override // p1.c, android.view.MenuItem
    @NonNull
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.F = mode;
        this.H = true;
        this.I = true;
        this.f6606y.O(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f6599r = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c10) {
        if (this.f6600s == c10) {
            return this;
        }
        this.f6600s = c10;
        this.f6606y.O(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.N = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.B = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c10, char c11) {
        this.f6600s = c10;
        this.f6602u = Character.toLowerCase(c11);
        this.f6606y.O(false);
        return this;
    }

    @Override // p1.c, android.view.MenuItem
    public void setShowAsAction(int i10) {
        int i11 = i10 & 3;
        if (i11 != 0 && i11 != 1 && i11 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.K = i10;
        this.f6606y.M(this);
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f6597p = charSequence;
        this.f6606y.O(false);
        m mVar = this.f6607z;
        if (mVar != null) {
            mVar.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f6598q = charSequence;
        this.f6606y.O(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z10) {
        if (B(z10)) {
            this.f6606y.N(this);
        }
        return this;
    }

    public void t(boolean z10) {
        this.O = z10;
        this.f6606y.O(false);
    }

    public String toString() {
        CharSequence charSequence = this.f6597p;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    public MenuItem u(Runnable runnable) {
        this.A = runnable;
        return this;
    }

    public void v(boolean z10) {
        int i10 = this.J;
        int i11 = (z10 ? 2 : 0) | (i10 & (-3));
        this.J = i11;
        if (i10 != i11) {
            this.f6606y.O(false);
        }
    }

    public void w(boolean z10) {
        this.J = (z10 ? 4 : 0) | (this.J & (-5));
    }

    public void x(boolean z10) {
        if (z10) {
            this.J |= 32;
        } else {
            this.J &= -33;
        }
    }

    public void y(ContextMenu.ContextMenuInfo contextMenuInfo) {
        this.P = contextMenuInfo;
    }

    @Override // p1.c, android.view.MenuItem
    @NonNull
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public p1.c setShowAsActionFlags(int i10) {
        setShowAsAction(i10);
        return this;
    }

    @Override // p1.c, android.view.MenuItem
    @NonNull
    public p1.c setContentDescription(CharSequence charSequence) {
        this.C = charSequence;
        this.f6606y.O(false);
        return this;
    }

    @Override // p1.c, android.view.MenuItem
    @NonNull
    public p1.c setTooltipText(CharSequence charSequence) {
        this.D = charSequence;
        this.f6606y.O(false);
        return this;
    }

    @Override // p1.c, android.view.MenuItem
    @NonNull
    public MenuItem setAlphabeticShortcut(char c10, int i10) {
        if (this.f6602u == c10 && this.f6603v == i10) {
            return this;
        }
        this.f6602u = Character.toLowerCase(c10);
        this.f6603v = KeyEvent.normalizeMetaState(i10);
        this.f6606y.O(false);
        return this;
    }

    @Override // p1.c, android.view.MenuItem
    @NonNull
    public MenuItem setNumericShortcut(char c10, int i10) {
        if (this.f6600s == c10 && this.f6601t == i10) {
            return this;
        }
        this.f6600s = c10;
        this.f6601t = KeyEvent.normalizeMetaState(i10);
        this.f6606y.O(false);
        return this;
    }

    @Override // p1.c, android.view.MenuItem
    @NonNull
    public MenuItem setShortcut(char c10, char c11, int i10, int i11) {
        this.f6600s = c10;
        this.f6601t = KeyEvent.normalizeMetaState(i10);
        this.f6602u = Character.toLowerCase(c11);
        this.f6603v = KeyEvent.normalizeMetaState(i11);
        this.f6606y.O(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i10) {
        this.f6604w = null;
        this.f6605x = i10;
        this.I = true;
        this.f6606y.O(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i10) {
        return setTitle(this.f6606y.x().getString(i10));
    }
}
