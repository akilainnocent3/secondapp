package io.appmetrica.analytics.profile;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.impl.C5390t4;
import io.appmetrica.analytics.impl.C5417u6;
import io.appmetrica.analytics.impl.Ci;
import io.appmetrica.analytics.impl.InterfaceC5056fo;
import io.appmetrica.analytics.impl.InterfaceC5163k2;
import io.appmetrica.analytics.impl.Y2;
import io.appmetrica.analytics.impl.Yk;
import io.appmetrica.analytics.impl.to;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public class BooleanAttribute {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C5417u6 f98984a;

    public BooleanAttribute(String str, to toVar, InterfaceC5163k2 interfaceC5163k2) {
        this.f98984a = new C5417u6(str, toVar, interfaceC5163k2);
    }

    @NonNull
    public UserProfileUpdate<? extends InterfaceC5056fo> withValue(boolean z10) {
        C5417u6 c5417u6 = this.f98984a;
        return new UserProfileUpdate<>(new Y2(c5417u6.f98401c, z10, c5417u6.f98399a, new C5390t4(c5417u6.f98400b)));
    }

    @NonNull
    public UserProfileUpdate<? extends InterfaceC5056fo> withValueIfUndefined(boolean z10) {
        C5417u6 c5417u6 = this.f98984a;
        return new UserProfileUpdate<>(new Y2(c5417u6.f98401c, z10, c5417u6.f98399a, new Yk(c5417u6.f98400b)));
    }

    @NonNull
    public UserProfileUpdate<? extends InterfaceC5056fo> withValueReset() {
        C5417u6 c5417u6 = this.f98984a;
        return new UserProfileUpdate<>(new Ci(3, c5417u6.f98401c, c5417u6.f98399a, c5417u6.f98400b));
    }
}
