package com.applovin.shadow.okhttp3.internal.concurrent;

import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s1;
import kotlin.jvm.internal.x;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
@s1({"SMAP\nTask.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Task.kt\nokhttp3/internal/concurrent/Task\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,71:1\n1#2:72\n*E\n"})
public abstract class Task {
    private final boolean cancelable;

    @l
    private final String name;
    private long nextExecuteNanoTime;

    @m
    private TaskQueue queue;

    public Task(@l String name, boolean z10) {
        m0.p(name, "name");
        this.name = name;
        this.cancelable = z10;
        this.nextExecuteNanoTime = -1L;
    }

    public final boolean getCancelable() {
        return this.cancelable;
    }

    @l
    public final String getName() {
        return this.name;
    }

    public final long getNextExecuteNanoTime$okhttp() {
        return this.nextExecuteNanoTime;
    }

    @m
    public final TaskQueue getQueue$okhttp() {
        return this.queue;
    }

    public final void initQueue$okhttp(@l TaskQueue queue) {
        m0.p(queue, "queue");
        TaskQueue taskQueue = this.queue;
        if (taskQueue == queue) {
            return;
        }
        if (taskQueue != null) {
            throw new IllegalStateException("task is in multiple queues");
        }
        this.queue = queue;
    }

    public abstract long runOnce();

    public final void setNextExecuteNanoTime$okhttp(long j10) {
        this.nextExecuteNanoTime = j10;
    }

    public final void setQueue$okhttp(@m TaskQueue taskQueue) {
        this.queue = taskQueue;
    }

    @l
    public String toString() {
        return this.name;
    }

    public /* synthetic */ Task(String str, boolean z10, int i10, x xVar) {
        this(str, (i10 & 2) != 0 ? true : z10);
    }
}
