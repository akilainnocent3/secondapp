package defpackage;

import android.webkit.WebView;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes7.dex */
public final class jzi0 {
    public static final ConcurrentHashMap<Integer, f0j0> a = new ConcurrentHashMap<>();

    public static boolean a(WebView webView, String str) {
        str.getClass();
        f0j0 f0j0Var = a.get(Integer.valueOf(System.identityHashCode(webView)));
        if (f0j0Var == null || !f0j0Var.c) {
            return false;
        }
        if (f0j0Var.a == e0j0.a) {
            return true;
        }
        Set<uzi0> set = f0j0Var.d;
        if ((set instanceof Collection) && set.isEmpty()) {
            return false;
        }
        Iterator<T> it = set.iterator();
        while (it.hasNext()) {
            ((uzi0) it.next()).getClass();
        }
        return false;
    }
}
