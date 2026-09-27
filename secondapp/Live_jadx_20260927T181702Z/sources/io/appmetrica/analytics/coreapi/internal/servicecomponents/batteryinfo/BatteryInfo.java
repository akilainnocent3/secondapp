package io.appmetrica.analytics.coreapi.internal.servicecomponents.batteryinfo;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public class BatteryInfo {

    @Nullable
    public final Integer batteryLevel;

    @NonNull
    public final ChargeType chargeType;

    public BatteryInfo(@Nullable Integer num, @NonNull ChargeType chargeType) {
        this.batteryLevel = num;
        this.chargeType = chargeType;
    }
}
