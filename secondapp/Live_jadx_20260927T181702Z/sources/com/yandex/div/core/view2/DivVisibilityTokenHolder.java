package com.yandex.div.core.view2;

import dr.w2;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;
import kotlin.jvm.internal.m0;
import mq.rj;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
@k.d
public final class DivVisibilityTokenHolder {

    @oy.l
    private final ConcurrentLinkedQueue<Map<CompositeLogId, rj>> tokens = new ConcurrentLinkedQueue<>();

    public final boolean add(@oy.l Map<CompositeLogId, rj> map) {
        return this.tokens.add(map);
    }

    @oy.m
    public final CompositeLogId getLogId(@oy.l CompositeLogId compositeLogId) {
        Object next;
        Set setKeySet;
        Iterator<T> it = this.tokens.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((Map) next).containsKey(compositeLogId));
        Map map = (Map) next;
        if (map != null && (setKeySet = map.keySet()) != null) {
            CompositeLogId[] compositeLogIdArr = (CompositeLogId[]) setKeySet.toArray(new CompositeLogId[0]);
            if (compositeLogIdArr != null) {
                for (CompositeLogId compositeLogId2 : compositeLogIdArr) {
                    if (m0.g(compositeLogId2, compositeLogId)) {
                        return compositeLogId2;
                    }
                }
            }
        }
        return null;
    }

    public final void remove(@oy.l CompositeLogId compositeLogId, @oy.l ds.l<? super Map<CompositeLogId, ? extends rj>, w2> lVar) {
        Object next;
        Iterator<T> it = this.tokens.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((Map) next).remove(compositeLogId) == null);
        Map map = (Map) next;
        if (map != null && map.isEmpty()) {
            lVar.invoke(map);
            this.tokens.remove(map);
        }
    }
}
