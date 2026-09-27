package com.yandex.div.internal.util;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import js.f;
import kotlin.jvm.internal.v1;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class UtilsKt {
    public static final <K, V> V getOrThrow(@l Map<? extends K, ? extends V> map, K k10, @m String str) {
        V v10 = map.get(k10);
        if (v10 != null) {
            return v10;
        }
        throw new NoSuchElementException(str);
    }

    public static /* synthetic */ Object getOrThrow$default(Map map, Object obj, String str, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            str = null;
        }
        return getOrThrow(map, obj, str);
    }

    @m
    public static final <T> T makeIf(boolean z10, @l ds.a<? extends T> aVar) {
        if (z10) {
            return aVar.invoke();
        }
        return null;
    }

    public static final <T> boolean removeFirstIf(@l Collection<T> collection, @l ds.l<? super T, Boolean> lVar) {
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            if (lVar.invoke(it.next()).booleanValue()) {
                it.remove();
                return true;
            }
        }
        return false;
    }

    public static final <K, V> V removeOrThrow(@l Map<? extends K, V> map, K k10, @m String str) {
        V v10 = (V) v1.k(map).remove(k10);
        if (v10 != null) {
            return v10;
        }
        throw new NoSuchElementException(str);
    }

    public static /* synthetic */ Object removeOrThrow$default(Map map, Object obj, String str, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            str = null;
        }
        return removeOrThrow(map, obj, str);
    }

    @l
    public static final <T> f<Object, T> weak(@m T t10) {
        return new WeakRef(t10);
    }

    public static /* synthetic */ f weak$default(Object obj, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            obj = null;
        }
        return weak(obj);
    }
}
