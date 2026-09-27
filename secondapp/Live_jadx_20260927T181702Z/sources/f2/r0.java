package f2;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Build;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public final class r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f82551a = "MenuItemCompat";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Deprecated
    public static final int f82552b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Deprecated
    public static final int f82553c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Deprecated
    public static final int f82554d = 2;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Deprecated
    public static final int f82555e = 4;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Deprecated
    public static final int f82556f = 8;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class a implements MenuItem.OnActionExpandListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ c f82557a;

        public a(c cVar) {
            this.f82557a = cVar;
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public boolean onMenuItemActionCollapse(MenuItem menuItem) {
            return this.f82557a.onMenuItemActionCollapse(menuItem);
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public boolean onMenuItemActionExpand(MenuItem menuItem) {
            return this.f82557a.onMenuItemActionExpand(menuItem);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @k.t0(26)
    public static class b {
        @k.t
        public static int a(MenuItem menuItem) {
            return menuItem.getAlphabeticModifiers();
        }

        @k.t
        public static CharSequence b(MenuItem menuItem) {
            return menuItem.getContentDescription();
        }

        @k.t
        public static ColorStateList c(MenuItem menuItem) {
            return menuItem.getIconTintList();
        }

        @k.t
        public static PorterDuff.Mode d(MenuItem menuItem) {
            return menuItem.getIconTintMode();
        }

        @k.t
        public static int e(MenuItem menuItem) {
            return menuItem.getNumericModifiers();
        }

        @k.t
        public static CharSequence f(MenuItem menuItem) {
            return menuItem.getTooltipText();
        }

        @k.t
        public static MenuItem g(MenuItem menuItem, char c10, int i10) {
            return menuItem.setAlphabeticShortcut(c10, i10);
        }

        @k.t
        public static MenuItem h(MenuItem menuItem, CharSequence charSequence) {
            return menuItem.setContentDescription(charSequence);
        }

        @k.t
        public static MenuItem i(MenuItem menuItem, ColorStateList colorStateList) {
            return menuItem.setIconTintList(colorStateList);
        }

        @k.t
        public static MenuItem j(MenuItem menuItem, PorterDuff.Mode mode) {
            return menuItem.setIconTintMode(mode);
        }

        @k.t
        public static MenuItem k(MenuItem menuItem, char c10, int i10) {
            return menuItem.setNumericShortcut(c10, i10);
        }

        @k.t
        public static MenuItem l(MenuItem menuItem, char c10, char c11, int i10, int i11) {
            return menuItem.setShortcut(c10, c11, i10, i11);
        }

        @k.t
        public static MenuItem m(MenuItem menuItem, CharSequence charSequence) {
            return menuItem.setTooltipText(charSequence);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @Deprecated
    public interface c {
        boolean onMenuItemActionCollapse(MenuItem menuItem);

        boolean onMenuItemActionExpand(MenuItem menuItem);
    }

    @Deprecated
    public static boolean a(MenuItem menuItem) {
        return menuItem.collapseActionView();
    }

    @Deprecated
    public static boolean b(MenuItem menuItem) {
        return menuItem.expandActionView();
    }

    @Nullable
    public static f2.b c(@NonNull MenuItem menuItem) {
        if (menuItem instanceof p1.c) {
            return ((p1.c) menuItem).b();
        }
        Log.w(f82551a, "getActionProvider: item does not implement SupportMenuItem; returning null");
        return null;
    }

    @Deprecated
    public static View d(MenuItem menuItem) {
        return menuItem.getActionView();
    }

    public static int e(@NonNull MenuItem menuItem) {
        if (menuItem instanceof p1.c) {
            return ((p1.c) menuItem).getAlphabeticModifiers();
        }
        if (Build.VERSION.SDK_INT >= 26) {
            return b.a(menuItem);
        }
        return 0;
    }

    @Nullable
    public static CharSequence f(@NonNull MenuItem menuItem) {
        if (menuItem instanceof p1.c) {
            return ((p1.c) menuItem).getContentDescription();
        }
        if (Build.VERSION.SDK_INT >= 26) {
            return b.b(menuItem);
        }
        return null;
    }

    @Nullable
    public static ColorStateList g(@NonNull MenuItem menuItem) {
        if (menuItem instanceof p1.c) {
            return ((p1.c) menuItem).getIconTintList();
        }
        if (Build.VERSION.SDK_INT >= 26) {
            return b.c(menuItem);
        }
        return null;
    }

    @Nullable
    public static PorterDuff.Mode h(@NonNull MenuItem menuItem) {
        if (menuItem instanceof p1.c) {
            return ((p1.c) menuItem).getIconTintMode();
        }
        if (Build.VERSION.SDK_INT >= 26) {
            return b.d(menuItem);
        }
        return null;
    }

    public static int i(@NonNull MenuItem menuItem) {
        if (menuItem instanceof p1.c) {
            return ((p1.c) menuItem).getNumericModifiers();
        }
        if (Build.VERSION.SDK_INT >= 26) {
            return b.e(menuItem);
        }
        return 0;
    }

    @Nullable
    public static CharSequence j(@NonNull MenuItem menuItem) {
        if (menuItem instanceof p1.c) {
            return ((p1.c) menuItem).getTooltipText();
        }
        if (Build.VERSION.SDK_INT >= 26) {
            return b.f(menuItem);
        }
        return null;
    }

    @Deprecated
    public static boolean k(MenuItem menuItem) {
        return menuItem.isActionViewExpanded();
    }

    @Nullable
    public static MenuItem l(@NonNull MenuItem menuItem, @Nullable f2.b bVar) {
        if (menuItem instanceof p1.c) {
            return ((p1.c) menuItem).a(bVar);
        }
        Log.w(f82551a, "setActionProvider: item does not implement SupportMenuItem; ignoring");
        return menuItem;
    }

    @Deprecated
    public static MenuItem m(MenuItem menuItem, int i10) {
        return menuItem.setActionView(i10);
    }

    @Deprecated
    public static MenuItem n(MenuItem menuItem, View view) {
        return menuItem.setActionView(view);
    }

    public static void o(@NonNull MenuItem menuItem, char c10, int i10) {
        if (menuItem instanceof p1.c) {
            ((p1.c) menuItem).setAlphabeticShortcut(c10, i10);
        } else if (Build.VERSION.SDK_INT >= 26) {
            b.g(menuItem, c10, i10);
        }
    }

    public static void p(@NonNull MenuItem menuItem, @Nullable CharSequence charSequence) {
        if (menuItem instanceof p1.c) {
            ((p1.c) menuItem).setContentDescription(charSequence);
        } else if (Build.VERSION.SDK_INT >= 26) {
            b.h(menuItem, charSequence);
        }
    }

    public static void q(@NonNull MenuItem menuItem, @Nullable ColorStateList colorStateList) {
        if (menuItem instanceof p1.c) {
            ((p1.c) menuItem).setIconTintList(colorStateList);
        } else if (Build.VERSION.SDK_INT >= 26) {
            b.i(menuItem, colorStateList);
        }
    }

    public static void r(@NonNull MenuItem menuItem, @Nullable PorterDuff.Mode mode) {
        if (menuItem instanceof p1.c) {
            ((p1.c) menuItem).setIconTintMode(mode);
        } else if (Build.VERSION.SDK_INT >= 26) {
            b.j(menuItem, mode);
        }
    }

    public static void s(@NonNull MenuItem menuItem, char c10, int i10) {
        if (menuItem instanceof p1.c) {
            ((p1.c) menuItem).setNumericShortcut(c10, i10);
        } else if (Build.VERSION.SDK_INT >= 26) {
            b.k(menuItem, c10, i10);
        }
    }

    @Deprecated
    public static MenuItem t(MenuItem menuItem, c cVar) {
        return menuItem.setOnActionExpandListener(new a(cVar));
    }

    public static void u(@NonNull MenuItem menuItem, char c10, char c11, int i10, int i11) {
        if (menuItem instanceof p1.c) {
            ((p1.c) menuItem).setShortcut(c10, c11, i10, i11);
        } else if (Build.VERSION.SDK_INT >= 26) {
            b.l(menuItem, c10, c11, i10, i11);
        }
    }

    @Deprecated
    public static void v(MenuItem menuItem, int i10) {
        menuItem.setShowAsAction(i10);
    }

    public static void w(@NonNull MenuItem menuItem, @Nullable CharSequence charSequence) {
        if (menuItem instanceof p1.c) {
            ((p1.c) menuItem).setTooltipText(charSequence);
        } else if (Build.VERSION.SDK_INT >= 26) {
            b.m(menuItem, charSequence);
        }
    }
}
