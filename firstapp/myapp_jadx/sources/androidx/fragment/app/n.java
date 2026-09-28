package androidx.fragment.app;

import com.sportybet.android.gp.tz.R;
import defpackage.hb5;
import defpackage.ib5;
import defpackage.s9s;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class n {
    public final g a;
    public final ClassLoader b;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public boolean i;
    public String k;
    public int l;
    public CharSequence m;
    public int n;
    public CharSequence o;
    public ArrayList<String> p;
    public ArrayList<String> q;
    public ArrayList<Runnable> s;
    public final ArrayList<a> c = new ArrayList<>();
    public boolean j = true;
    public boolean r = false;

    public n(g gVar, ClassLoader classLoader) {
        this.a = gVar;
        this.b = classLoader;
    }

    public final void b(a aVar) {
        this.c.add(aVar);
        aVar.d = this.d;
        aVar.e = this.e;
        aVar.f = this.f;
        aVar.g = this.g;
    }

    public final void c(String str) {
        if (!this.j) {
            ib5.a("This FragmentTransaction is not allowed to be added to the back stack.");
        } else {
            this.i = true;
            this.k = str;
        }
    }

    public abstract int d();

    public abstract void e(int i, Fragment fragment, String str, int i2);

    public final void f(int i, Fragment fragment, String str) {
        if (i != 0) {
            e(i, fragment, str, 2);
        } else {
            hb5.a("Must use non-zero containerViewId");
        }
    }

    public final void g(Fragment fragment) {
        f(R.id.main_game_container, fragment, null);
    }

    public final void h(int i, int i2, int i3, int i4) {
        this.d = i;
        this.e = i2;
        this.f = i3;
        this.g = i4;
    }

    public static final class a {
        public int a;
        public Fragment b;
        public boolean c;
        public int d;
        public int e;
        public int f;
        public int g;
        public s9s.b h;
        public s9s.b i;

        public a(Fragment fragment, int i) {
            this.a = i;
            this.b = fragment;
            this.c = false;
            s9s.b bVar = s9s.b.e;
            this.h = bVar;
            this.i = bVar;
        }

        public a() {
        }

        public a(int i, int i2, Fragment fragment) {
            this.a = i;
            this.b = fragment;
            this.c = true;
            s9s.b bVar = s9s.b.e;
            this.h = bVar;
            this.i = bVar;
        }
    }
}
