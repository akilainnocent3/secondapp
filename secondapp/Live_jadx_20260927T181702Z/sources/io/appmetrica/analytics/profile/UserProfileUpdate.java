package io.appmetrica.analytics.profile;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.impl.InterfaceC5056fo;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public class UserProfileUpdate<T extends InterfaceC5056fo> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC5056fo f99000a;

    public UserProfileUpdate(InterfaceC5056fo interfaceC5056fo) {
        this.f99000a = interfaceC5056fo;
    }

    @NonNull
    public T getUserProfileUpdatePatcher() {
        return (T) this.f99000a;
    }
}
