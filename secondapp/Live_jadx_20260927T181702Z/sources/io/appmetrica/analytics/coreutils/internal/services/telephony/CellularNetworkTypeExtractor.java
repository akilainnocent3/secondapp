package io.appmetrica.analytics.coreutils.internal.services.telephony;

import android.annotation.TargetApi;
import android.content.Context;
import android.telephony.TelephonyManager;
import io.appmetrica.analytics.coreapi.internal.annotations.DoNotInline;
import io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable;
import io.appmetrica.analytics.coreutils.internal.AndroidUtils;
import io.appmetrica.analytics.coreutils.internal.system.SystemServiceUtils;
import k.x0;
import kotlin.jvm.internal.x;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class CellularNetworkTypeExtractor {

    @l
    public static final Companion Companion = new Companion(null);

    @l
    public static final String UNKNOWN_NETWORK_TYPE_VALUE = "unknown";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f95365a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final FunctionWithThrowable f95366b;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class Companion {
        public /* synthetic */ Companion(x xVar) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @DoNotInline
    @TargetApi(24)
    public static final class a implements FunctionWithThrowable<TelephonyManager, Integer> {
        @Override // io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable
        @x0("android.permission.READ_PHONE_STATE")
        @l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer apply(@l TelephonyManager telephonyManager) {
            return Integer.valueOf(telephonyManager.getDataNetworkType());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @DoNotInline
    public static final class b implements FunctionWithThrowable<TelephonyManager, Integer> {
        @Override // io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable
        @x0("android.permission.READ_PHONE_STATE")
        @l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer apply(@l TelephonyManager telephonyManager) {
            return Integer.valueOf(telephonyManager.getNetworkType());
        }
    }

    public CellularNetworkTypeExtractor(@l Context context) {
        this.f95365a = context;
        this.f95366b = AndroidUtils.isApiAchieved(24) ? new a() : new b();
    }

    @l
    public final Context getContext() {
        return this.f95365a;
    }

    @x0("android.permission.READ_PHONE_STATE")
    @l
    public final String getNetworkType() {
        return CellularNetworkTypeConverter.convert((Integer) SystemServiceUtils.accessSystemServiceByNameSafely(this.f95365a, "phone", "Extracting cellular networkType", "TelephonyManager", this.f95366b));
    }
}
