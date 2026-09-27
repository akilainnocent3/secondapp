package com.bytedance.sdk.component.ok.hww;

import com.bytedance.sdk.component.ok.hww.sd;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class vy<T extends sd> {
    private int hww;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    private BlockingQueue<T> f34926tq = new LinkedBlockingQueue();

    private vy(int i10) {
        this.hww = i10;
    }

    public static vy hww(int i10) {
        return new vy(i10);
    }

    public T hww() {
        return this.f34926tq.poll();
    }

    public boolean hww(T t10) {
        if (t10 == null) {
            return false;
        }
        t10.hww();
        if (this.f34926tq.size() >= this.hww) {
            return false;
        }
        return this.f34926tq.offer(t10);
    }
}
