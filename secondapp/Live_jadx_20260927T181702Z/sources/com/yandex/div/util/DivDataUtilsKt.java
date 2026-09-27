package com.yandex.div.util;

import mq.m7;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class DivDataUtilsKt {
    public static final long getINVALID_STATE_ID(@l m7.b bVar) {
        return -1L;
    }

    public static final long getInitialStateId(@l m7 m7Var) {
        return m7Var.f111787c.isEmpty() ? getINVALID_STATE_ID(m7.f111782j) : m7Var.f111787c.get(0).f111798b;
    }
}
