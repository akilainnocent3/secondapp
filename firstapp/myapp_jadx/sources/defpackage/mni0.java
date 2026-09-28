package defpackage;

import java.util.Map;
import kotlin.Pair;

/* JADX INFO: loaded from: classes.dex */
public final class mni0 {
    public static final lk40 a;
    public static final Map<f0h0<?, ?>, Float> b;

    static {
        Float fValueOf = Float.valueOf(0.5f);
        a = new lk40(0.5f, 0.5f, 0.5f, 0.5f);
        g0h0 g0h0Var = gjs.c;
        Float fValueOf2 = Float.valueOf(1.0f);
        Pair pair = new Pair(g0h0Var, fValueOf2);
        Pair pair2 = new Pair(gjs.i, fValueOf2);
        Pair pair3 = new Pair(gjs.h, fValueOf2);
        Pair pair4 = new Pair(gjs.b, Float.valueOf(0.01f));
        Pair pair5 = new Pair(gjs.j, fValueOf);
        Pair pair6 = new Pair(gjs.f, fValueOf);
        Pair pair7 = new Pair(gjs.g, fValueOf);
        g0h0 g0h0Var2 = gjs.d;
        Float fValueOf3 = Float.valueOf(0.1f);
        b = kpu.f(pair, pair2, pair3, pair4, pair5, pair6, pair7, new Pair(g0h0Var2, fValueOf3), new Pair(gjs.e, fValueOf3));
    }
}
