package com.cleveradssolutions.adapters.exchange.rendering.utils.helpers;

import android.os.Handler;
import java.util.Hashtable;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Hashtable f42528a = new Hashtable();

    public void a(String str) {
        if (str == null || str.equals("")) {
            return;
        }
        d().remove(str);
    }

    public Handler b(String str) {
        if (str == null || str.equals("") || !d().containsKey(str)) {
            return null;
        }
        return (Handler) d().get(str);
    }

    public String c(Handler handler) {
        if (handler == null) {
            return null;
        }
        String strValueOf = String.valueOf(System.identityHashCode(handler));
        d().put(strValueOf, handler);
        return strValueOf;
    }

    public final Hashtable d() {
        return this.f42528a;
    }
}
