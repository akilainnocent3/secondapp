package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import androidx.fragment.app.Fragment;
import defpackage.g6i0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class i6i0<T extends g6i0> implements n340<Fragment, T> {
    public final Function1<View, T> a;
    public T b;
    public final i6i0<T>.a c;

    public final class a implements rdd {
        public a() {
        }

        @Override // defpackage.rdd
        public final void onDestroy(ibs ibsVar) {
            ibsVar.getLifecycle().d(this);
            final i6i0<T> i6i0Var = i6i0.this;
            ((Handler) gpf0.a.getValue()).post(new Runnable() { // from class: h6i0
                @Override // java.lang.Runnable
                public final void run() {
                    i6i0Var.b = null;
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public i6i0(Function1<? super View, ? extends T> function1) {
        function1.getClass();
        this.a = function1;
        this.c = new a();
    }

    @Override // defpackage.n340
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final T a(Fragment fragment, ohp<?> ohpVar) {
        fragment.getClass();
        ohpVar.getClass();
        mpe0 mpe0Var = gpf0.a;
        if (!Intrinsics.g(Looper.myLooper(), Looper.getMainLooper())) {
            q1b.a(inm.a("Expected to be called on the main thread but was ", Thread.currentThread().getName()));
            return null;
        }
        T t = this.b;
        if (t != null) {
            return t;
        }
        if (fragment.getViewLifecycleOwner().getLifecycle().b().compareTo(s9s.b.b) < 0) {
            ib5.a("Should not attempt to get bindings when Fragment views are destroyed.");
            return null;
        }
        fragment.getViewLifecycleOwner().getLifecycle().a(this.c);
        View viewRequireView = fragment.requireView();
        viewRequireView.getClass();
        T tInvoke = this.a.invoke(viewRequireView);
        this.b = tInvoke;
        return tInvoke;
    }
}
