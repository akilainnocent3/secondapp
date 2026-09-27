package io.appmetrica.analytics.impl;

import android.annotation.TargetApi;
import android.telephony.SubscriptionInfo;
import io.appmetrica.analytics.coreapi.internal.annotations.DoNotInline;
import io.appmetrica.analytics.coreutils.internal.parsing.ParseUtils;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.ql, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
@DoNotInline
@TargetApi(29)
public final class C5333ql {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.l
    public static final C5333ql f98206a = new C5333ql();

    private C5333ql() {
    }

    @cs.o
    @oy.m
    public static final Integer a(@oy.l SubscriptionInfo subscriptionInfo) {
        return ParseUtils.intValueOf(subscriptionInfo.getMccString());
    }

    @cs.o
    @oy.m
    public static final Integer b(@oy.l SubscriptionInfo subscriptionInfo) {
        return ParseUtils.intValueOf(subscriptionInfo.getMncString());
    }
}
