package f2;

import android.R;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.view.inputmethod.InputMethodManager;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public final class m1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f82446a;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @k.t0(20)
    public static class a extends c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        public final View f82447a;

        public a(@Nullable View view) {
            this.f82447a = view;
        }

        @Override // f2.m1.c
        public void a() {
            View view = this.f82447a;
            if (view != null) {
                ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(this.f82447a.getWindowToken(), 0);
            }
        }

        @Override // f2.m1.c
        public void b() {
            final View viewFindViewById = this.f82447a;
            if (viewFindViewById == null) {
                return;
            }
            if (viewFindViewById.isInEditMode() || viewFindViewById.onCheckIsTextEditor()) {
                viewFindViewById.requestFocus();
            } else {
                viewFindViewById = viewFindViewById.getRootView().findFocus();
            }
            if (viewFindViewById == null) {
                viewFindViewById = this.f82447a.getRootView().findViewById(R.id.content);
            }
            if (viewFindViewById == null || !viewFindViewById.hasWindowFocus()) {
                return;
            }
            viewFindViewById.post(new Runnable() { // from class: f2.l1
                @Override // java.lang.Runnable
                public final void run() {
                    View view = viewFindViewById;
                    ((InputMethodManager) view.getContext().getSystemService("input_method")).showSoftInput(view, 0);
                }
            });
        }
    }

    public m1(@NonNull View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.f82446a = new b(view);
        } else {
            this.f82446a = new a(view);
        }
    }

    public void a() {
        this.f82446a.a();
    }

    public void b() {
        this.f82446a.b();
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @k.t0(30)
    public static class b extends a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public View f82448b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public WindowInsetsController f82449c;

        public b(@NonNull View view) {
            super(view);
            this.f82448b = view;
        }

        @Override // f2.m1.a, f2.m1.c
        public void a() {
            View view;
            WindowInsetsController windowInsetsController = this.f82449c;
            if (windowInsetsController == null) {
                View view2 = this.f82448b;
                windowInsetsController = view2 != null ? view2.getWindowInsetsController() : null;
            }
            if (windowInsetsController == null) {
                super.a();
                return;
            }
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            WindowInsetsController.OnControllableInsetsChangedListener onControllableInsetsChangedListener = new WindowInsetsController.OnControllableInsetsChangedListener() { // from class: f2.s1
                @Override // android.view.WindowInsetsController.OnControllableInsetsChangedListener
                public final void onControllableInsetsChanged(WindowInsetsController windowInsetsController2, int i10) {
                    atomicBoolean.set((i10 & 8) != 0);
                }
            };
            windowInsetsController.addOnControllableInsetsChangedListener(onControllableInsetsChangedListener);
            if (!atomicBoolean.get() && (view = this.f82448b) != null) {
                ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(this.f82448b.getWindowToken(), 0);
            }
            windowInsetsController.removeOnControllableInsetsChangedListener(onControllableInsetsChangedListener);
            windowInsetsController.hide(WindowInsets.Type.ime());
        }

        @Override // f2.m1.a, f2.m1.c
        public void b() {
            View view = this.f82448b;
            if (view != null && Build.VERSION.SDK_INT < 33) {
                ((InputMethodManager) view.getContext().getSystemService("input_method")).isActive();
            }
            WindowInsetsController windowInsetsController = this.f82449c;
            if (windowInsetsController == null) {
                View view2 = this.f82448b;
                windowInsetsController = view2 != null ? view2.getWindowInsetsController() : null;
            }
            if (windowInsetsController != null) {
                windowInsetsController.show(WindowInsets.Type.ime());
            }
            super.b();
        }

        public b(@Nullable WindowInsetsController windowInsetsController) {
            super(null);
            this.f82449c = windowInsetsController;
        }
    }

    @k.t0(30)
    @Deprecated
    public m1(@NonNull WindowInsetsController windowInsetsController) {
        this.f82446a = new b(windowInsetsController);
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class c {
        public void a() {
        }

        public void b() {
        }
    }
}
