package com.iab.omid.library.bigosg.walking.a;

import java.util.ArrayDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public class c implements b.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final BlockingQueue<Runnable> f52839a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ThreadPoolExecutor f52840b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ArrayDeque<b> f52841c = new ArrayDeque<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private b f52842d = null;

    public c() {
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        this.f52839a = linkedBlockingQueue;
        this.f52840b = new ThreadPoolExecutor(1, 1, 1L, TimeUnit.SECONDS, linkedBlockingQueue);
    }

    private void a() {
        b bVarPoll = this.f52841c.poll();
        this.f52842d = bVarPoll;
        if (bVarPoll != null) {
            bVarPoll.a(this.f52840b);
        }
    }

    public void b(b bVar) {
        bVar.a(this);
        this.f52841c.add(bVar);
        if (this.f52842d == null) {
            a();
        }
    }

    @Override // com.iab.omid.library.bigosg.walking.a.b.a
    public void a(b bVar) {
        this.f52842d = null;
        a();
    }
}
