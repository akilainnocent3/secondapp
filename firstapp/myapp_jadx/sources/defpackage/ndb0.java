package defpackage;

import android.content.res.Resources;
import android.os.Build;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.home.SplashActivity;

/* JADX INFO: loaded from: classes.dex */
public final class ndb0 {
    public final b a;

    public static final class a extends b {
        public mdb0 c;
        public final ldb0 d;

        public a(SplashActivity splashActivity) {
            super(splashActivity);
            this.d = new ldb0(this, splashActivity);
        }

        @Override // ndb0.b
        public final void a() {
            int i;
            SplashActivity splashActivity = this.a;
            Resources.Theme theme = splashActivity.getTheme();
            theme.getClass();
            TypedValue typedValue = new TypedValue();
            if (theme.resolveAttribute(R.attr.postSplashScreenTheme, typedValue, true) && (i = typedValue.resourceId) != 0) {
                splashActivity.setTheme(i);
            }
            ((ViewGroup) splashActivity.getWindow().getDecorView()).setOnHierarchyChangeListener(this.d);
        }

        @Override // ndb0.b
        public final void b(w57 w57Var) {
            this.b = w57Var;
            View viewFindViewById = this.a.findViewById(android.R.id.content);
            ViewTreeObserver viewTreeObserver = viewFindViewById.getViewTreeObserver();
            if (this.c != null && viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnPreDrawListener(this.c);
            }
            mdb0 mdb0Var = new mdb0(this, viewFindViewById);
            this.c = mdb0Var;
            viewTreeObserver.addOnPreDrawListener(mdb0Var);
        }
    }

    public static class b {
        public final SplashActivity a;
        public c b = new hdb0();

        public b(SplashActivity splashActivity) {
            this.a = splashActivity;
        }

        public void a() {
            int i;
            TypedValue typedValue = new TypedValue();
            SplashActivity splashActivity = this.a;
            Resources.Theme theme = splashActivity.getTheme();
            theme.resolveAttribute(R.attr.windowSplashScreenBackground, typedValue, true);
            if (theme.resolveAttribute(R.attr.windowSplashScreenAnimatedIcon, typedValue, true)) {
                theme.getDrawable(typedValue.resourceId);
            }
            theme.resolveAttribute(R.attr.splashScreenIconSize, typedValue, true);
            if (!theme.resolveAttribute(R.attr.postSplashScreenTheme, typedValue, true) || (i = typedValue.resourceId) == 0) {
                return;
            }
            splashActivity.setTheme(i);
        }

        public void b(w57 w57Var) {
            this.b = w57Var;
            View viewFindViewById = this.a.findViewById(android.R.id.content);
            viewFindViewById.getViewTreeObserver().addOnPreDrawListener(new idb0(this, viewFindViewById));
        }
    }

    public interface c {
        boolean a();
    }

    public ndb0(SplashActivity splashActivity) {
        this.a = Build.VERSION.SDK_INT >= 31 ? new a(splashActivity) : new b(splashActivity);
    }
}
