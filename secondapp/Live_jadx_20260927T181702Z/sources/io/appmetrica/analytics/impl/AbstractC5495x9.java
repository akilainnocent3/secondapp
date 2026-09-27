package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.x9, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public abstract class AbstractC5495x9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Set f98568a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final EnumSet f98569b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final EnumSet f98570c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final EnumSet f98571d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final EnumSet f98572e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final EnumSet f98573f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final EnumSet f98574g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final EnumSet f98575h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final List f98576i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final List f98577j;

    static {
        EnumC4966cb enumC4966cb = EnumC4966cb.EVENT_TYPE_EXCEPTION_UNHANDLED_FROM_FILE;
        EnumC4966cb enumC4966cb2 = EnumC4966cb.EVENT_TYPE_PREV_SESSION_EXCEPTION_UNHANDLED_FROM_FILE;
        f98568a = CollectionUtils.unmodifiableSetOf(5892, 5896, 5891, 5889, 5890, 5968);
        EnumC4966cb enumC4966cb3 = EnumC4966cb.EVENT_TYPE_UNDEFINED;
        EnumC4966cb enumC4966cb4 = EnumC4966cb.EVENT_TYPE_PURGE_BUFFER;
        EnumC4966cb enumC4966cb5 = EnumC4966cb.EVENT_TYPE_SEND_REFERRER;
        EnumC4966cb enumC4966cb6 = EnumC4966cb.EVENT_TYPE_APP_ENVIRONMENT_UPDATED;
        EnumC4966cb enumC4966cb7 = EnumC4966cb.EVENT_TYPE_APP_ENVIRONMENT_CLEARED;
        EnumC4966cb enumC4966cb8 = EnumC4966cb.EVENT_TYPE_PREV_SESSION_NATIVE_CRASH_PROTOBUF;
        EnumC4966cb enumC4966cb9 = EnumC4966cb.EVENT_TYPE_SET_SESSION_EXTRA;
        f98569b = EnumSet.of(enumC4966cb3, enumC4966cb4, enumC4966cb5, enumC4966cb6, enumC4966cb7, EnumC4966cb.EVENT_TYPE_ACTIVATION, enumC4966cb8, enumC4966cb2, enumC4966cb9);
        EnumC4966cb enumC4966cb10 = EnumC4966cb.EVENT_TYPE_UPDATE_FOREGROUND_TIME;
        EnumC4966cb enumC4966cb11 = EnumC4966cb.EVENT_TYPE_CURRENT_SESSION_NATIVE_CRASH_PROTOBUF;
        f98570c = EnumSet.of(enumC4966cb10, enumC4966cb, enumC4966cb2, enumC4966cb8, enumC4966cb11);
        EnumC4966cb enumC4966cb12 = EnumC4966cb.EVENT_TYPE_REGULAR;
        f98571d = EnumSet.of(enumC4966cb, enumC4966cb2, EnumC4966cb.EVENT_TYPE_EXCEPTION_UNHANDLED_PROTOBUF, EnumC4966cb.EVENT_TYPE_EXCEPTION_USER_PROTOBUF, EnumC4966cb.EVENT_TYPE_EXCEPTION_USER_CUSTOM_PROTOBUF, enumC4966cb11, enumC4966cb8, enumC4966cb12, EnumC4966cb.EVENT_CLIENT_EXTERNAL_ATTRIBUTION, EnumC4966cb.EVENT_TYPE_SEND_ECOMMERCE_EVENT, EnumC4966cb.EVENT_TYPE_SEND_REVENUE_EVENT, EnumC4966cb.EVENT_TYPE_SEND_AD_REVENUE_EVENT, enumC4966cb4, EnumC4966cb.EVENT_TYPE_INIT, EnumC4966cb.EVENT_TYPE_SEND_USER_PROFILE, EnumC4966cb.EVENT_TYPE_SET_USER_PROFILE_ID, enumC4966cb5, enumC4966cb6, enumC4966cb7, EnumC4966cb.EVENT_TYPE_FIRST_ACTIVATION, EnumC4966cb.EVENT_TYPE_START, EnumC4966cb.EVENT_TYPE_APP_OPEN, EnumC4966cb.EVENT_TYPE_APP_UPDATE, EnumC4966cb.EVENT_TYPE_ANR);
        f98572e = EnumSet.of(enumC4966cb12);
        f98573f = EnumSet.of(enumC4966cb12);
        f98574g = EnumSet.of(enumC4966cb8);
        f98575h = EnumSet.of(EnumC4966cb.EVENT_TYPE_ALIVE, enumC4966cb4, enumC4966cb9, enumC4966cb2, enumC4966cb8);
        f98576i = Arrays.asList(0, 6145, Integer.valueOf(androidx.fragment.app.q0.I), 8224);
        f98577j = Arrays.asList(12290);
    }
}
