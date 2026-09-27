package com.chartboost.sdk.impl;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class db {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PackageManager f38533a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ds.a f38534b;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a extends kotlin.jvm.internal.o0 implements ds.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f38535b = new a();

        public a() {
            super(0);
        }

        @Override // ds.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Intent invoke() {
            return new Intent("android.intent.action.VIEW");
        }
    }

    public db(PackageManager packageManager, ds.a intentFactory) {
        kotlin.jvm.internal.m0.p(packageManager, "packageManager");
        kotlin.jvm.internal.m0.p(intentFactory, "intentFactory");
        this.f38533a = packageManager;
        this.f38534b = intentFactory;
    }

    public final Intent a(String str) {
        Intent intent = (Intent) this.f38534b.invoke();
        intent.addFlags(268435456);
        intent.setData(Uri.parse(str));
        return intent;
    }

    public final boolean b(String str) {
        if (str != null && str.length() != 0) {
            try {
                return !a(a(str)).isEmpty();
            } catch (Exception e10) {
                sb.b("Cannot open URL", e10);
            }
        }
        return false;
    }

    public final List a(Intent intent, PackageManager.ResolveInfoFlags resolveInfoFlags) {
        List listQueryIntentActivities = this.f38533a.queryIntentActivities(intent, resolveInfoFlags);
        kotlin.jvm.internal.m0.o(listQueryIntentActivities, "queryIntentActivities(...)");
        return listQueryIntentActivities;
    }

    public /* synthetic */ db(PackageManager packageManager, ds.a aVar, int i10, kotlin.jvm.internal.x xVar) {
        this(packageManager, (i10 & 2) != 0 ? a.f38535b : aVar);
    }

    public final List a(Intent intent) {
        if (Build.VERSION.SDK_INT >= 33) {
            PackageManager.ResolveInfoFlags resolveInfoFlagsOf = PackageManager.ResolveInfoFlags.of(65536L);
            kotlin.jvm.internal.m0.o(resolveInfoFlagsOf, "of(...)");
            return a(intent, resolveInfoFlagsOf);
        }
        List<ResolveInfo> listQueryIntentActivities = this.f38533a.queryIntentActivities(intent, 65536);
        kotlin.jvm.internal.m0.m(listQueryIntentActivities);
        return listQueryIntentActivities;
    }
}
