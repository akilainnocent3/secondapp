package com.vungle.ads.internal.util;

import cs.o;
import java.util.HashSet;
import kotlin.jvm.internal.m0;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class CollectionsConcurrencyUtil {

    @l
    public static final CollectionsConcurrencyUtil INSTANCE = new CollectionsConcurrencyUtil();

    private CollectionsConcurrencyUtil() {
    }

    @o
    public static final synchronized void addToSet(@l HashSet<String> hashset, @l String set) {
        m0.p(hashset, "hashset");
        m0.p(set, "set");
        hashset.add(set);
    }

    @l
    @o
    public static final synchronized HashSet<String> getNewHashSet(@m HashSet<String> hashSet) {
        return new HashSet<>(hashSet);
    }
}
