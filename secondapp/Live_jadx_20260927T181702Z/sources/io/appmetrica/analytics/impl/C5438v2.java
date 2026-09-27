package io.appmetrica.analytics.impl;

import android.annotation.TargetApi;
import android.app.ActivityManager;
import android.app.usage.UsageStatsManager;
import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.annotations.DoNotInline;
import io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable;
import io.appmetrica.analytics.coreutils.internal.AndroidUtils;
import io.appmetrica.analytics.coreutils.internal.system.SystemServiceUtils;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.v2, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
@DoNotInline
@TargetApi(28)
public final class C5438v2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.l
    public static final C5438v2 f98429a = new C5438v2();

    private C5438v2() {
    }

    @oy.l
    @cs.o
    public static final C5513y2 a(@oy.l Context context, @oy.l final C4983d2 c4983d2) {
        return new C5513y2((EnumC5488x2) SystemServiceUtils.accessSystemServiceByNameSafely(context, "usagestats", "getting app standby bucket", "usageStatsManager", new FunctionWithThrowable() { // from class: io.appmetrica.analytics.impl.wq
            @Override // io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable
            public final Object apply(Object obj) {
                return C5438v2.a(c4983d2, (UsageStatsManager) obj);
            }
        }), (Boolean) SystemServiceUtils.accessSystemServiceByNameSafely(context, androidx.appcompat.widget.c.f6970r, "getting is background restricted", "activityManager", new FunctionWithThrowable() { // from class: io.appmetrica.analytics.impl.xq
            @Override // io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable
            public final Object apply(Object obj) {
                return C5438v2.a((ActivityManager) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EnumC5488x2 a(C4983d2 c4983d2, UsageStatsManager usageStatsManager) {
        int appStandbyBucket = usageStatsManager.getAppStandbyBucket();
        c4983d2.getClass();
        if (!AndroidUtils.isApiAchieved(28)) {
            return null;
        }
        if (AndroidUtils.isApiAchieved(30) && appStandbyBucket == 45) {
            return EnumC5488x2.RESTRICTED;
        }
        if (appStandbyBucket == 5) {
            return EnumC5488x2.EXEMPTED;
        }
        if (appStandbyBucket == 10) {
            return EnumC5488x2.ACTIVE;
        }
        if (appStandbyBucket == 30) {
            return EnumC5488x2.FREQUENT;
        }
        if (appStandbyBucket == 20) {
            return EnumC5488x2.WORKING_SET;
        }
        if (appStandbyBucket == 40) {
            return EnumC5488x2.RARE;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Boolean a(ActivityManager activityManager) {
        return Boolean.valueOf(activityManager.isBackgroundRestricted());
    }
}
