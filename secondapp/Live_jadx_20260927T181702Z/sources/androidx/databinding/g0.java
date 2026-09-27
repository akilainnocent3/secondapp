package androidx.databinding;

import android.view.View;
import android.view.ViewStub;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ViewStub f9494a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ViewDataBinding f9495b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public View f9496c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ViewStub.OnInflateListener f9497d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ViewDataBinding f9498e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ViewStub.OnInflateListener f9499f;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class a implements ViewStub.OnInflateListener {
        public a() {
        }

        @Override // android.view.ViewStub.OnInflateListener
        public void onInflate(ViewStub viewStub, View view) {
            g0.this.f9496c = view;
            g0 g0Var = g0.this;
            g0Var.f9495b = m.c(g0Var.f9498e.f9460m, view, viewStub.getLayoutResource());
            g0.this.f9494a = null;
            if (g0.this.f9497d != null) {
                g0.this.f9497d.onInflate(viewStub, view);
                g0.this.f9497d = null;
            }
            g0.this.f9498e.o0();
            g0.this.f9498e.z();
        }
    }

    public g0(@NonNull ViewStub viewStub) {
        a aVar = new a();
        this.f9499f = aVar;
        this.f9494a = viewStub;
        viewStub.setOnInflateListener(aVar);
    }

    @Nullable
    public ViewDataBinding g() {
        return this.f9495b;
    }

    public View h() {
        return this.f9496c;
    }

    @Nullable
    public ViewStub i() {
        return this.f9494a;
    }

    public boolean j() {
        return this.f9496c != null;
    }

    public void k(@NonNull ViewDataBinding viewDataBinding) {
        this.f9498e = viewDataBinding;
    }

    public void l(@Nullable ViewStub.OnInflateListener onInflateListener) {
        if (this.f9494a != null) {
            this.f9497d = onInflateListener;
        }
    }
}
