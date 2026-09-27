package e2;

import android.annotation.SuppressLint;
import android.util.Pair;
import dr.z0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public final class u {
    @SuppressLint({"UnknownNullness"})
    public static final <F, S> F a(@oy.l Pair<F, S> pair) {
        return (F) pair.first;
    }

    @SuppressLint({"UnknownNullness"})
    public static final <F, S> F b(@oy.l t<F, S> tVar) {
        return tVar.f79831a;
    }

    @SuppressLint({"UnknownNullness"})
    public static final <F, S> S c(@oy.l Pair<F, S> pair) {
        return (S) pair.second;
    }

    @SuppressLint({"UnknownNullness"})
    public static final <F, S> S d(@oy.l t<F, S> tVar) {
        return tVar.f79832b;
    }

    @oy.l
    public static final <F, S> Pair<F, S> e(@oy.l z0<? extends F, ? extends S> z0Var) {
        return new Pair<>(z0Var.j(), z0Var.k());
    }

    @oy.l
    public static final <F, S> t<F, S> f(@oy.l z0<? extends F, ? extends S> z0Var) {
        return new t<>(z0Var.j(), z0Var.k());
    }

    @oy.l
    public static final <F, S> z0<F, S> g(@oy.l Pair<F, S> pair) {
        return new z0<>(pair.first, pair.second);
    }

    @oy.l
    public static final <F, S> z0<F, S> h(@oy.l t<F, S> tVar) {
        return new z0<>(tVar.f79831a, tVar.f79832b);
    }
}
