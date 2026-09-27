package com.bytedance.sdk.component.hu.hww.hww.tq;

import com.bytedance.sdk.component.hu.hww.vy.hww;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public abstract class vy<T extends com.bytedance.sdk.component.hu.hww.vy.hww> {
    private com.bytedance.sdk.component.hu.hww.vy.tq.hww hww;

    /* JADX INFO: renamed from: sd, reason: collision with root package name */
    private Queue<String> f34558sd;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    private Queue<T> f34559tq = new ConcurrentLinkedQueue();
    private String vy;

    public vy(com.bytedance.sdk.component.hu.hww.vy.tq.hww hwwVar, Queue<String> queue, String str) {
        this.hww = hwwVar;
        this.f34558sd = queue;
        this.vy = str;
    }

    public void hww(T t10) {
        Queue<T> queue = this.f34559tq;
        if (queue == null || t10 == null) {
            return;
        }
        queue.offer(t10);
    }

    public synchronized boolean tq(int i10, int i11) {
        int size = this.f34559tq.size();
        int iHww = this.hww.hww();
        if (i10 != 2 && i10 != 1) {
            return size >= iHww;
        }
        if (com.bytedance.sdk.component.hu.hww.sd.hww.sd()) {
            return size > 0;
        }
        return size >= iHww;
    }

    public synchronized List<com.bytedance.sdk.component.hu.hww.vy.hww> hww(int i10, int i11) {
        if (!tq(i10, i11)) {
            return null;
        }
        ArrayList arrayList = new ArrayList(this.hww.hww());
        do {
            T tPoll = this.f34559tq.poll();
            if (tPoll == null) {
                break;
            }
            arrayList.add(tPoll);
        } while (arrayList.size() != this.hww.tq());
        return arrayList;
    }

    public synchronized void hww(int i10, List<T> list) {
        try {
            if (i10 != -1 && i10 != 200 && i10 != 509) {
                this.f34559tq.addAll(list);
            } else {
                this.f34559tq.size();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
