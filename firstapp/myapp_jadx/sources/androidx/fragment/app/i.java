package androidx.fragment.app;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class i {
    public final FragmentManager a;
    public final CopyOnWriteArrayList<a> b = new CopyOnWriteArrayList<>();

    public static final class a {
        public final FragmentManager.l a;
        public final boolean b;

        public a(FragmentManager.l lVar, boolean z) {
            this.a = lVar;
            this.b = z;
        }
    }

    public i(FragmentManager fragmentManager) {
        this.a = fragmentManager;
    }

    public final void a(Fragment fragment, boolean z) {
        Fragment fragment2 = this.a.z;
        if (fragment2 != null) {
            FragmentManager parentFragmentManager = fragment2.getParentFragmentManager();
            parentFragmentManager.getClass();
            parentFragmentManager.p.a(fragment, true);
        }
        for (a aVar : this.b) {
            if (!z || aVar.b) {
                FragmentManager.l lVar = aVar.a;
            }
        }
    }

    public final void b(Fragment fragment, boolean z) {
        FragmentManager fragmentManager = this.a;
        Context context = fragmentManager.x.b;
        Fragment fragment2 = fragmentManager.z;
        if (fragment2 != null) {
            FragmentManager parentFragmentManager = fragment2.getParentFragmentManager();
            parentFragmentManager.getClass();
            parentFragmentManager.p.b(fragment, true);
        }
        for (a aVar : this.b) {
            if (!z || aVar.b) {
                FragmentManager.l lVar = aVar.a;
            }
        }
    }

    public final void c(Fragment fragment, boolean z) {
        Fragment fragment2 = this.a.z;
        if (fragment2 != null) {
            FragmentManager parentFragmentManager = fragment2.getParentFragmentManager();
            parentFragmentManager.getClass();
            parentFragmentManager.p.c(fragment, true);
        }
        for (a aVar : this.b) {
            if (!z || aVar.b) {
                FragmentManager.l lVar = aVar.a;
            }
        }
    }

    public final void d(Fragment fragment, boolean z) {
        Fragment fragment2 = this.a.z;
        if (fragment2 != null) {
            FragmentManager parentFragmentManager = fragment2.getParentFragmentManager();
            parentFragmentManager.getClass();
            parentFragmentManager.p.d(fragment, true);
        }
        for (a aVar : this.b) {
            if (!z || aVar.b) {
                FragmentManager.l lVar = aVar.a;
            }
        }
    }

    public final void e(Fragment fragment, boolean z) {
        Fragment fragment2 = this.a.z;
        if (fragment2 != null) {
            FragmentManager parentFragmentManager = fragment2.getParentFragmentManager();
            parentFragmentManager.getClass();
            parentFragmentManager.p.e(fragment, true);
        }
        for (a aVar : this.b) {
            if (!z || aVar.b) {
                FragmentManager.l lVar = aVar.a;
            }
        }
    }

    public final void f(Fragment fragment, boolean z) {
        Fragment fragment2 = this.a.z;
        if (fragment2 != null) {
            FragmentManager parentFragmentManager = fragment2.getParentFragmentManager();
            parentFragmentManager.getClass();
            parentFragmentManager.p.f(fragment, true);
        }
        for (a aVar : this.b) {
            if (!z || aVar.b) {
                aVar.a.a(fragment);
            }
        }
    }

    public final void g(Fragment fragment, boolean z) {
        FragmentManager fragmentManager = this.a;
        Context context = fragmentManager.x.b;
        Fragment fragment2 = fragmentManager.z;
        if (fragment2 != null) {
            FragmentManager parentFragmentManager = fragment2.getParentFragmentManager();
            parentFragmentManager.getClass();
            parentFragmentManager.p.g(fragment, true);
        }
        for (a aVar : this.b) {
            if (!z || aVar.b) {
                FragmentManager.l lVar = aVar.a;
            }
        }
    }

    public final void h(Fragment fragment, boolean z) {
        Fragment fragment2 = this.a.z;
        if (fragment2 != null) {
            FragmentManager parentFragmentManager = fragment2.getParentFragmentManager();
            parentFragmentManager.getClass();
            parentFragmentManager.p.h(fragment, true);
        }
        for (a aVar : this.b) {
            if (!z || aVar.b) {
                FragmentManager.l lVar = aVar.a;
            }
        }
    }

    public final void i(Fragment fragment, boolean z) {
        Fragment fragment2 = this.a.z;
        if (fragment2 != null) {
            FragmentManager parentFragmentManager = fragment2.getParentFragmentManager();
            parentFragmentManager.getClass();
            parentFragmentManager.p.i(fragment, true);
        }
        for (a aVar : this.b) {
            if (!z || aVar.b) {
                aVar.a.b(fragment);
            }
        }
    }

    public final void j(Fragment fragment, Bundle bundle, boolean z) {
        Fragment fragment2 = this.a.z;
        if (fragment2 != null) {
            FragmentManager parentFragmentManager = fragment2.getParentFragmentManager();
            parentFragmentManager.getClass();
            parentFragmentManager.p.j(fragment, bundle, true);
        }
        for (a aVar : this.b) {
            if (!z || aVar.b) {
                FragmentManager.l lVar = aVar.a;
            }
        }
    }

    public final void k(Fragment fragment, boolean z) {
        FragmentManager fragmentManager = this.a;
        Fragment fragment2 = fragmentManager.z;
        if (fragment2 != null) {
            FragmentManager parentFragmentManager = fragment2.getParentFragmentManager();
            parentFragmentManager.getClass();
            parentFragmentManager.p.k(fragment, true);
        }
        for (a aVar : this.b) {
            if (!z || aVar.b) {
                aVar.a.c(fragmentManager, fragment);
            }
        }
    }

    public final void l(Fragment fragment, boolean z) {
        FragmentManager fragmentManager = this.a;
        Fragment fragment2 = fragmentManager.z;
        if (fragment2 != null) {
            FragmentManager parentFragmentManager = fragment2.getParentFragmentManager();
            parentFragmentManager.getClass();
            parentFragmentManager.p.l(fragment, true);
        }
        for (a aVar : this.b) {
            if (!z || aVar.b) {
                aVar.a.d(fragmentManager, fragment);
            }
        }
    }

    public final void m(Fragment fragment, View view, Bundle bundle, boolean z) {
        view.getClass();
        FragmentManager fragmentManager = this.a;
        Fragment fragment2 = fragmentManager.z;
        if (fragment2 != null) {
            FragmentManager parentFragmentManager = fragment2.getParentFragmentManager();
            parentFragmentManager.getClass();
            parentFragmentManager.p.m(fragment, view, bundle, true);
        }
        for (a aVar : this.b) {
            if (!z || aVar.b) {
                aVar.a.e(fragmentManager, fragment, view);
            }
        }
    }

    public final void n(Fragment fragment, boolean z) {
        Fragment fragment2 = this.a.z;
        if (fragment2 != null) {
            FragmentManager parentFragmentManager = fragment2.getParentFragmentManager();
            parentFragmentManager.getClass();
            parentFragmentManager.p.n(fragment, true);
        }
        for (a aVar : this.b) {
            if (!z || aVar.b) {
                FragmentManager.l lVar = aVar.a;
            }
        }
    }
}
