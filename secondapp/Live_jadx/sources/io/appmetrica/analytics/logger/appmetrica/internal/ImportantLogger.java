package io.appmetrica.analytics.logger.appmetrica.internal;

import com.mbridge.msdk.out.reveue.MBridgeRevenueParamsEntity;
import io.appmetrica.analytics.logger.common.BaseImportantLogger;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class ImportantLogger extends BaseImportantLogger {

    @l
    public static final ImportantLogger INSTANCE = new ImportantLogger();

    private ImportantLogger() {
        super(MBridgeRevenueParamsEntity.ATTRIBUTION_PLATFORM_APP_METRICA);
    }
}
