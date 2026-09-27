package yads;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class d00 {
    public static e00 a(String str) {
        Object next;
        Iterator<E> it = e00.f148440l.iterator();
        while (it.hasNext()) {
            next = it.next();
            if (kotlin.jvm.internal.m0.g(((e00) next).f148441b, str)) {
                return (e00) next;
            }
        }
        next = null;
        return (e00) next;
    }
}
