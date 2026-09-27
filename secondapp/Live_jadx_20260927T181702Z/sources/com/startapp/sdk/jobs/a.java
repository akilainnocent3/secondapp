package com.startapp.sdk.jobs;

import com.startapp.sdk.internal.d3;
import com.startapp.sdk.internal.za;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class a extends d3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SchedulerService f76007a;

    public a(SchedulerService schedulerService) {
        this.f76007a = schedulerService;
    }

    @Override // com.startapp.sdk.internal.d3
    public final void a(za zaVar) {
        ExecutorService executorService = this.f76007a.f76005a;
        if (executorService != null) {
            executorService.execute(zaVar);
        }
    }
}
