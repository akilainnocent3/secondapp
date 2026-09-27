package io.appmetrica.analytics.impl;

import com.ironsource.C4235d4;
import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenueProcessor;
import io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenueProcessorsHolder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.j5, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class C5140j5 implements ModuleAdRevenueProcessor, ModuleAdRevenueProcessorsHolder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f97607a = new ArrayList();

    @Override // io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenueProcessor
    @oy.l
    public final String getDescription() {
        return fr.r0.r3(this.f97607a, null, "Composite processor with " + this.f97607a.size() + " children: [", C4235d4.j.f61462e, 0, null, C5115i5.f97556a, 25, null);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenueProcessor
    public final boolean process(@oy.l Object... objArr) {
        Object next;
        LoggerStorage.getMainPublicOrAnonymousLogger().info("Processing Ad Revenue for " + Arrays.toString(objArr), new Object[0]);
        Iterator it = this.f97607a.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            ModuleAdRevenueProcessor moduleAdRevenueProcessor = (ModuleAdRevenueProcessor) next;
            try {
                boolean zProcess = moduleAdRevenueProcessor.process(Arrays.copyOf(objArr, objArr.length));
                if (!zProcess) {
                    LoggerStorage.getMainPublicOrAnonymousLogger().info("Ad Revenue was not processed by " + moduleAdRevenueProcessor.getDescription(), new Object[0]);
                }
                if (zProcess) {
                    break;
                }
            } catch (Throwable th2) {
                LoggerStorage.getMainPublicOrAnonymousLogger().error(th2, "Got exception from processor " + moduleAdRevenueProcessor.getDescription(), new Object[0]);
            }
        }
        boolean z10 = ((ModuleAdRevenueProcessor) next) != null;
        if (!z10) {
            LoggerStorage.getMainPublicOrAnonymousLogger().info("Ad Revenue was not processed by " + getDescription() + " since processor for " + Arrays.toString(objArr) + " was not found", new Object[0]);
        }
        return z10;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.client.adrevenue.ModuleAdRevenueProcessorsHolder
    public final void register(@oy.l ModuleAdRevenueProcessor moduleAdRevenueProcessor) {
        this.f97607a.add(moduleAdRevenueProcessor);
    }
}
