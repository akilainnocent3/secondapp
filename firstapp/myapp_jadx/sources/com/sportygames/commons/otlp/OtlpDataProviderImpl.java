package com.sportygames.commons.otlp;

import com.sportygames.commons.SportyGamesManager;
import com.sportygames.otlp.core.EnvSnapshot;
import defpackage.i1z;
import defpackage.j1z;
import defpackage.xnh0;
import defpackage.zag;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0011\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\f¨\u0006\r"}, d2 = {"Lcom/sportygames/commons/otlp/OtlpDataProviderImpl;", "Lj1z;", "Lcom/sportygames/commons/SportyGamesManager;", "sportyGamesManager", "<init>", "(Lcom/sportygames/commons/SportyGamesManager;)V", "Li1z;", "provideOpenTelemetry", "()Li1z;", "Lcom/sportygames/otlp/core/EnvSnapshot;", "snapshot", "()Lcom/sportygames/otlp/core/EnvSnapshot;", "Lcom/sportygames/commons/SportyGamesManager;", "SGLibrary_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class OtlpDataProviderImpl implements j1z {
    public static final int $stable = 8;
    private final SportyGamesManager sportyGamesManager;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ OtlpDataProviderImpl(SportyGamesManager sportyGamesManager, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            sportyGamesManager = SportyGamesManager.getInstance();
            sportyGamesManager.getClass();
        }
        this(sportyGamesManager);
    }

    @Override // defpackage.j1z
    public i1z provideOpenTelemetry() {
        return this.sportyGamesManager.getOpenTelemetry();
    }

    @Override // defpackage.j1z
    public EnvSnapshot snapshot() {
        xnh0 user = this.sportyGamesManager.getUser();
        String str = user != null ? user.b : null;
        String deviceId = this.sportyGamesManager.getDeviceId();
        if (deviceId == null) {
            deviceId = "unknown_device";
        }
        String country = this.sportyGamesManager.getCountry();
        if (country == null) {
            country = "unknown_country";
        }
        return new EnvSnapshot(str, deviceId, country, String.valueOf(this.sportyGamesManager.getVersionCode()), this.sportyGamesManager.getEnvironment() == zag.a ? "prod" : "uat");
    }

    public OtlpDataProviderImpl(SportyGamesManager sportyGamesManager) {
        sportyGamesManager.getClass();
        this.sportyGamesManager = sportyGamesManager;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public OtlpDataProviderImpl() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
