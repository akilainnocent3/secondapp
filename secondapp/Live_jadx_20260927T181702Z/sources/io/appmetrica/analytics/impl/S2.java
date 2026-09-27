package io.appmetrica.analytics.impl;

import android.content.Intent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.batteryinfo.BatteryInfo;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.batteryinfo.ChargeType;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.batteryinfo.ChargeTypeChangeListener;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.batteryinfo.ChargeTypeProvider;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class S2 implements ChargeTypeProvider {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ChargeType f96433d = ChargeType.UNKNOWN;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ICommonExecutor f96434a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile BatteryInfo f96435b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f96436c = new ArrayList();

    public S2(@NonNull ICommonExecutor iCommonExecutor, @NonNull P2 p10) {
        R2 r10 = new R2(this);
        this.f96434a = iCommonExecutor;
        this.f96435b = a(p10.a(r10));
    }

    public static BatteryInfo a(Intent intent) {
        ChargeType chargeType = f96433d;
        Integer numValueOf = null;
        if (intent != null) {
            int intExtra = intent.getIntExtra("level", -1);
            int intExtra2 = intent.getIntExtra("scale", -1);
            if (intExtra > 0 && intExtra2 > 0) {
                numValueOf = Integer.valueOf((intExtra * 100) / intExtra2);
            }
            int intExtra3 = intent.getIntExtra("plugged", -1);
            chargeType = ChargeType.NONE;
            if (intExtra3 == 1) {
                chargeType = ChargeType.AC;
            } else if (intExtra3 == 2) {
                chargeType = ChargeType.USB;
            } else if (intExtra3 == 4) {
                chargeType = ChargeType.WIRELESS;
            }
        }
        return new BatteryInfo(numValueOf, chargeType);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.batteryinfo.ChargeTypeProvider
    @Nullable
    public final Integer getBatteryLevel() {
        BatteryInfo batteryInfo = this.f96435b;
        if (batteryInfo == null) {
            return null;
        }
        return batteryInfo.batteryLevel;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.batteryinfo.ChargeTypeProvider
    @NonNull
    public final ChargeType getChargeType() {
        BatteryInfo batteryInfo = this.f96435b;
        return batteryInfo == null ? ChargeType.UNKNOWN : batteryInfo.chargeType;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.batteryinfo.ChargeTypeProvider
    public final synchronized void registerChargeTypeListener(@NonNull ChargeTypeChangeListener chargeTypeChangeListener) {
        this.f96436c.add(chargeTypeChangeListener);
        chargeTypeChangeListener.onChargeTypeChanged(getChargeType());
    }
}
