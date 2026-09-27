package com.iab.omid.library.startio.walking.async;

import java.util.ArrayDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public class c implements b.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final BlockingQueue f53967a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ThreadPoolExecutor f53968b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ArrayDeque f53969c = new ArrayDeque();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private b f53970d = null;

    public c() {
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        this.f53967a = linkedBlockingQueue;
        this.f53968b = new ThreadPoolExecutor(1, 1, 1L, TimeUnit.SECONDS, linkedBlockingQueue);
    }

    private void a() {
        b bVar = (b) this.f53969c.poll();
        this.f53970d = bVar;
        if (bVar != null) {
            bVar.a(this.f53968b);
        }
    }

    public void b(b bVar) {
        bVar.a(this);
        this.f53969c.add(bVar);
        if (this.f53970d == null) {
            a();
        }
    }

    @Override // com.iab.omid.library.startio.walking.async.b.a
    public void a(b bVar) {
        this.f53970d = null;
        a();
    }
}
