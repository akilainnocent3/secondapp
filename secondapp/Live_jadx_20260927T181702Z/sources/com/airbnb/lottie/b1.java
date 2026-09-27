package com.airbnb.lottie;

import android.annotation.SuppressLint;
import android.os.Build;
import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class b1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashSet<a1> f24973a = new HashSet<>();

    @SuppressLint({"DefaultLocale"})
    public boolean a(a1 a1Var, boolean z10) {
        if (!z10) {
            return this.f24973a.remove(a1Var);
        }
        if (Build.VERSION.SDK_INT >= a1Var.f24970b) {
            return this.f24973a.add(a1Var);
        }
        gb.g.e(String.format("%s is not supported pre SDK %d", a1Var.name(), Integer.valueOf(a1Var.f24970b)));
        return false;
    }

    public boolean b(a1 a1Var) {
        return this.f24973a.contains(a1Var);
    }
}
