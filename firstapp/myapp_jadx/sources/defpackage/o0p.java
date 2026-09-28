package defpackage;

import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Pair;
import kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public final class o0p {
    public final lv50 a;
    public final twg0 b;
    public final LinkedHashMap c;
    public final ReentrantLock d;
    public final l0p e;
    public final m0p f;
    public final Object g;

    public static abstract class a {
        public abstract void a(Set<String> set);
    }

    public o0p(lv50 lv50Var, HashMap map, HashMap map2, String... strArr) {
        lv50Var.getClass();
        this.a = lv50Var;
        twg0 twg0Var = new twg0(lv50Var, map, map2, strArr, lv50Var.k, new p0p(1, this, o0p.class, "notifyInvalidatedObservers", "notifyInvalidatedObservers(Ljava/util/Set;)V", 0));
        this.b = twg0Var;
        this.c = new LinkedHashMap();
        this.d = new ReentrantLock();
        this.e = new l0p();
        this.f = new m0p();
        Collections.newSetFromMap(new IdentityHashMap()).getClass();
        this.g = new Object();
        twg0Var.k = new n0p(this, 0);
    }

    public final lyh<Set<String>> a(String[] strArr, boolean z) {
        twg0 twg0Var = this.b;
        Pair<String[], int[]> pairH = twg0Var.h(strArr);
        String[] strArr2 = pairH.a;
        int[] iArr = pairH.b;
        strArr2.getClass();
        iArr.getClass();
        return new or60(new pwg0(twg0Var, iArr, z, strArr2, null));
    }

    public final Object b(tje0 tje0Var) {
        Object objG = this.b.g(tje0Var);
        return objG == y5b.a ? objG : Unit.a;
    }
}
