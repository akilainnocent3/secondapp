package com.inmobi.media;

import android.content.Context;
import com.inmobi.media.core.config.models.CrashConfig;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.inmobi.media.u5, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class C4032u5 implements InterfaceC3982s5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile CrashConfig f57772a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C4114xc f57773b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f57774c;

    /* JADX WARN: Code duplicated, block: B:10:0x0080  */
    public C4032u5(Context context, CrashConfig crashConfig, C4114xc eventBus) {
        C4032u5 c4032u5;
        kotlin.jvm.internal.m0.p(context, "context");
        kotlin.jvm.internal.m0.p(crashConfig, "crashConfig");
        kotlin.jvm.internal.m0.p(eventBus, "eventBus");
        this.f57772a = crashConfig;
        this.f57773b = eventBus;
        List listSynchronizedList = Collections.synchronizedList(new ArrayList());
        kotlin.jvm.internal.m0.o(listSynchronizedList, "synchronizedList(...)");
        this.f57774c = listSynchronizedList;
        if (this.f57772a.getCrashConfig().getEnabled()) {
            listSynchronizedList.add(new S4(Thread.getDefaultUncaughtExceptionHandler(), this));
        }
        if (this.f57772a.getANRConfig().getAppExitReason().getEnabled()) {
            C4107x5.f58077a.getClass();
            if (C4107x5.r()) {
                c4032u5 = this;
                listSynchronizedList.add(new C4128y1(context, c4032u5, this.f57772a.getANRConfig().getAppExitReason().getIncidentWaitInterval(), this.f57772a.getANRConfig().getAppExitReason().getMaxNumberOfLines()));
            } else {
                c4032u5 = this;
            }
        } else {
            c4032u5 = this;
        }
        if (c4032u5.f57772a.getANRConfig().getWatchdog().getEnabled()) {
            listSynchronizedList.add(new C3575c(c4032u5.f57772a.getANRConfig().getWatchdog().getInterval(), this));
        }
    }

    public final void a(Q9 incidentEvent) {
        int i10;
        kotlin.jvm.internal.m0.p(incidentEvent, "incidentEvent");
        if ((incidentEvent instanceof C4153z1) && this.f57772a.getANRConfig().getAppExitReason().getEnabled()) {
            i10 = 152;
        } else if ((incidentEvent instanceof T4) && this.f57772a.getCrashConfig().getEnabled()) {
            i10 = 150;
        } else if (!(incidentEvent instanceof Wn) || !this.f57772a.getANRConfig().getWatchdog().getEnabled()) {
            return;
        } else {
            i10 = 151;
        }
        this.f57773b.b(new I2(i10, incidentEvent.f56632a, fr.m1.k(dr.v1.a("data", incidentEvent))));
    }
}
