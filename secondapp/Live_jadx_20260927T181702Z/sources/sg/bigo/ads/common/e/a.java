package sg.bigo.ads.common.e;

import android.view.View;
import android.view.ViewTreeObserver;
import androidx.annotation.NonNull;
import k.t0;

/* JADX INFO: loaded from: classes7.dex */
public final class a {

    /* JADX INFO: renamed from: sg.bigo.ads.common.e.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC1342a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Object f132912a = new ViewTreeObserver.OnWindowFocusChangeListener() { // from class: sg.bigo.ads.common.e.a.a.1
            @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
            public final void onWindowFocusChanged(boolean z10) {
                AbstractC1342a.this.a(z10);
            }
        };

        @t0(api = 18)
        public final ViewTreeObserver.OnWindowFocusChangeListener a() {
            Object obj = this.f132912a;
            if (obj instanceof ViewTreeObserver.OnWindowFocusChangeListener) {
                return (ViewTreeObserver.OnWindowFocusChangeListener) obj;
            }
            return null;
        }

        public abstract void a(boolean z10);
    }

    public static void a(@NonNull View view) {
        view.postInvalidateOnAnimation();
    }

    public static void b(View view, AbstractC1342a abstractC1342a) {
        ViewTreeObserver viewTreeObserver;
        ViewTreeObserver.OnWindowFocusChangeListener onWindowFocusChangeListenerA;
        if (view == null || abstractC1342a == null || (viewTreeObserver = view.getViewTreeObserver()) == null || !viewTreeObserver.isAlive() || (onWindowFocusChangeListenerA = abstractC1342a.a()) == null) {
            return;
        }
        viewTreeObserver.removeOnWindowFocusChangeListener(onWindowFocusChangeListenerA);
    }

    public static void a(View view, float f10) {
        if (view == null) {
            return;
        }
        view.setZ(f10);
    }

    public static void a(View view, int i10) {
        if (view == null) {
            return;
        }
        view.setElevation(i10);
    }

    public static void a(@NonNull View view, Runnable runnable) {
        view.postOnAnimation(runnable);
    }

    public static void a(View view, AbstractC1342a abstractC1342a) {
        ViewTreeObserver viewTreeObserver;
        ViewTreeObserver.OnWindowFocusChangeListener onWindowFocusChangeListenerA;
        if (view == null || abstractC1342a == null || (viewTreeObserver = view.getViewTreeObserver()) == null || !viewTreeObserver.isAlive() || (onWindowFocusChangeListenerA = abstractC1342a.a()) == null) {
            return;
        }
        viewTreeObserver.addOnWindowFocusChangeListener(onWindowFocusChangeListenerA);
    }
}
