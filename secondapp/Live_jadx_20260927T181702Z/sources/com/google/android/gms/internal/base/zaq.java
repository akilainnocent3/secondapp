package com.google.android.gms.internal.base;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public interface zaq {
    ExecutorService zaa(ThreadFactory threadFactory, int i10);

    ExecutorService zab(int i10, int i11);

    ExecutorService zac(int i10, ThreadFactory threadFactory, int i11);
}
