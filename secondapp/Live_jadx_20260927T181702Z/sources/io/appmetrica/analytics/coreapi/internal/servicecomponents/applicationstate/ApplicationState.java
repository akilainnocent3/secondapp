package io.appmetrica.analytics.coreapi.internal.servicecomponents.applicationstate;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public enum ApplicationState {
    UNKNOWN("unknown"),
    BACKGROUND("background"),
    VISIBLE("visible");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f95269a;

    ApplicationState(String str) {
        this.f95269a = str;
    }

    @NonNull
    public static ApplicationState fromString(@Nullable String str) {
        ApplicationState applicationState = UNKNOWN;
        for (ApplicationState applicationState2 : values()) {
            if (applicationState2.f95269a.equals(str)) {
                return applicationState2;
            }
        }
        return applicationState;
    }

    @NonNull
    public String getStringValue() {
        return this.f95269a;
    }
}
