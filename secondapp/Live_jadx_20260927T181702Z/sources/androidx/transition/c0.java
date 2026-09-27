package androidx.transition;

import android.content.Context;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f19416a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f19417b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ViewGroup f19418c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public View f19419d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Runnable f19420e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Runnable f19421f;

    public c0(@NonNull ViewGroup viewGroup) {
        this.f19417b = -1;
        this.f19418c = viewGroup;
    }

    @Nullable
    public static c0 c(@NonNull ViewGroup viewGroup) {
        return (c0) viewGroup.getTag(a0.a.f19391g);
    }

    @NonNull
    public static c0 d(@NonNull ViewGroup viewGroup, @k.h0 int i10, @NonNull Context context) {
        SparseArray sparseArray = (SparseArray) viewGroup.getTag(a0.a.f19396l);
        if (sparseArray == null) {
            sparseArray = new SparseArray();
            viewGroup.setTag(a0.a.f19396l, sparseArray);
        }
        c0 c0Var = (c0) sparseArray.get(i10);
        if (c0Var != null) {
            return c0Var;
        }
        c0 c0Var2 = new c0(viewGroup, i10, context);
        sparseArray.put(i10, c0Var2);
        return c0Var2;
    }

    public static void g(@NonNull ViewGroup viewGroup, @Nullable c0 c0Var) {
        viewGroup.setTag(a0.a.f19391g, c0Var);
    }

    public void a() {
        if (this.f19417b > 0 || this.f19419d != null) {
            e().removeAllViews();
            if (this.f19417b > 0) {
                LayoutInflater.from(this.f19416a).inflate(this.f19417b, this.f19418c);
            } else {
                this.f19418c.addView(this.f19419d);
            }
        }
        Runnable runnable = this.f19420e;
        if (runnable != null) {
            runnable.run();
        }
        g(this.f19418c, this);
    }

    public void b() {
        Runnable runnable;
        if (c(this.f19418c) != this || (runnable = this.f19421f) == null) {
            return;
        }
        runnable.run();
    }

    @NonNull
    public ViewGroup e() {
        return this.f19418c;
    }

    public boolean f() {
        return this.f19417b > 0;
    }

    public void h(@Nullable Runnable runnable) {
        this.f19420e = runnable;
    }

    public void i(@Nullable Runnable runnable) {
        this.f19421f = runnable;
    }

    public c0(ViewGroup viewGroup, int i10, Context context) {
        this.f19416a = context;
        this.f19418c = viewGroup;
        this.f19417b = i10;
    }

    public c0(@NonNull ViewGroup viewGroup, @NonNull View view) {
        this.f19417b = -1;
        this.f19418c = viewGroup;
        this.f19419d = view;
    }
}
