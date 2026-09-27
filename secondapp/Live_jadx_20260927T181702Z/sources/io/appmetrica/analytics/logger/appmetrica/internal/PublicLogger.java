package io.appmetrica.analytics.logger.appmetrica.internal;

import android.content.Context;
import com.ironsource.C4235d4;
import com.mbridge.msdk.out.reveue.MBridgeRevenueParamsEntity;
import cs.o;
import fw.b;
import io.appmetrica.analytics.logger.common.BaseReleaseLogger;
import kotlin.jvm.internal.x;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class PublicLogger extends BaseReleaseLogger {

    @l
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final PublicLogger f98808a = new PublicLogger("");

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class Companion {
        public /* synthetic */ Companion(x xVar) {
            this();
        }

        @l
        @o
        public final PublicLogger getAnonymousInstance() {
            return PublicLogger.f98808a;
        }

        public final void init(@l Context context) {
            BaseReleaseLogger.init(context);
        }

        private Companion() {
        }
    }

    public PublicLogger(@l String str) {
        super(MBridgeRevenueParamsEntity.ATTRIBUTION_PLATFORM_APP_METRICA, C4235d4.j.f61460d + str + b.f85385l);
    }

    @l
    @o
    public static final PublicLogger getAnonymousInstance() {
        return Companion.getAnonymousInstance();
    }
}
