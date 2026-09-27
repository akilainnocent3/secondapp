package x1;

import android.R;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.View;
import android.view.WindowInsetsController;
import k.t0;
import kotlin.jvm.internal.m0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@t0(31)
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.l
    public static final y f144143a = new y();

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @oy.l
        public static final a f144144a = new a();

        @cs.k
        @cs.o
        public static final void a(@oy.l Resources.Theme theme, @oy.l View decor) {
            m0.p(theme, "theme");
            m0.p(decor, "decor");
            c(theme, decor, null, 4, null);
        }

        @cs.k
        @cs.o
        public static final void b(@oy.l Resources.Theme theme, @oy.l View decor, @oy.l TypedValue tv2) {
            m0.p(theme, "theme");
            m0.p(decor, "decor");
            m0.p(tv2, "tv");
            int i10 = (!theme.resolveAttribute(R.attr.windowLightStatusBar, tv2, true) || tv2.data == 0) ? 0 : 8;
            if (theme.resolveAttribute(R.attr.windowLightNavigationBar, tv2, true) && tv2.data != 0) {
                i10 |= 16;
            }
            WindowInsetsController windowInsetsController = decor.getWindowInsetsController();
            m0.m(windowInsetsController);
            windowInsetsController.setSystemBarsAppearance(i10, 24);
        }

        public static /* synthetic */ void c(Resources.Theme theme, View view, TypedValue typedValue, int i10, Object obj) {
            if ((i10 & 4) != 0) {
                typedValue = new TypedValue();
            }
            b(theme, view, typedValue);
        }
    }
}
