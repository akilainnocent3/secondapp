package com.vungle.ads.internal.task;

import com.vungle.ads.internal.executor.VungleThreadPoolExecutor;
import kotlin.jvm.internal.m0;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public abstract class PriorityRunnable implements VungleThreadPoolExecutor.ComparableRunnable {
    @Override // java.lang.Comparable
    public int compareTo(@l Object other) {
        m0.p(other, "other");
        if (!(other instanceof PriorityRunnable)) {
            return -1;
        }
        return m0.t(((PriorityRunnable) other).getPriority(), getPriority());
    }

    public abstract int getPriority();
}
