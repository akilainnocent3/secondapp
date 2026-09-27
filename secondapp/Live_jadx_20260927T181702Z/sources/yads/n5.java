package yads;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class n5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f152882a = "yandex_ad_info";

    public static String a(de3 de3Var) {
        Object next;
        Iterator it = de3Var.f148193a.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!kotlin.jvm.internal.m0.g(((hq0) next).f150220a, f152882a));
        hq0 hq0Var = (hq0) next;
        if (hq0Var != null) {
            return hq0Var.f150221b;
        }
        return null;
    }
}
