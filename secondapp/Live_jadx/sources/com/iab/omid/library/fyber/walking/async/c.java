package com.iab.omid.library.fyber.walking.async;

import java.util.ArrayDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public class c implements b.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final BlockingQueue<Runnable> f53244a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ThreadPoolExecutor f53245b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ArrayDeque<b> f53246c = new ArrayDeque<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private b f53247d = null;

    public c() {
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        this.f53244a = linkedBlockingQueue;
        this.f53245b = new ThreadPoolExecutor(1, 1, 1L, TimeUnit.SECONDS, linkedBlockingQueue);
    }

    private void a() {
        b bVarPoll = this.f53246c.poll();
        this.f53247d = bVarPoll;
        if (bVarPoll != null) {
            bVarPoll.a(this.f53245b);
        }
    }

    public void b(b bVar) {
        bVar.a(this);
        this.f53246c.add(bVar);
        if (this.f53247d == null) {
            a();
        }
    }

    @Override // com.iab.omid.library.fyber.walking.async.b.a
    public void a(b bVar) {
        this.f53247d = null;
        a();
    }
}
