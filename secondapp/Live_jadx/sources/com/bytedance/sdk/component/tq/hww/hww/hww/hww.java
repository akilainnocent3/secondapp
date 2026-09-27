package com.bytedance.sdk.component.tq.hww.hww.hww;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class hww extends com.bytedance.sdk.component.tq.hww.vy {
    public static volatile nod hww;
    private ExecutorService vy;

    /* JADX INFO: renamed from: tq, reason: collision with root package name */
    private List<com.bytedance.sdk.component.tq.hww.tq> f35027tq = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: sd, reason: collision with root package name */
    private List<com.bytedance.sdk.component.tq.hww.tq> f35026sd = new CopyOnWriteArrayList();

    public hww(ExecutorService executorService) {
        this.vy = executorService;
    }

    public boolean hv() {
        return (hww == null || hww.hww() == null) ? false : true;
    }

    @Override // com.bytedance.sdk.component.tq.hww.vy
    public int hww() {
        return 0;
    }

    @Override // com.bytedance.sdk.component.tq.hww.vy
    public List<com.bytedance.sdk.component.tq.hww.tq> sd() {
        return this.f35027tq;
    }

    @Override // com.bytedance.sdk.component.tq.hww.vy
    public ExecutorService tq() {
        ExecutorService executorServiceHww = hww != null ? hww.hww() : null;
        return executorServiceHww != null ? executorServiceHww : this.vy;
    }

    @Override // com.bytedance.sdk.component.tq.hww.vy
    public List<com.bytedance.sdk.component.tq.hww.tq> vy() {
        return this.f35026sd;
    }

    @Override // com.bytedance.sdk.component.tq.hww.vy
    public void hww(int i10) {
    }

    public static void hww(nod nodVar) {
        hww = nodVar;
    }
}
