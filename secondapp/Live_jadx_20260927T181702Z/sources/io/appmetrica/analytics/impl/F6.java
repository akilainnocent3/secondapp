package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreapi.internal.control.DataSendingRestrictionController;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class F6 implements DataSendingRestrictionController {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final D6 f95814a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Boolean f95815b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashSet f95816c = new HashSet();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashSet f95817d = new HashSet();

    public F6(@NonNull D6 d10) {
        this.f95814a = d10;
        this.f95815b = ((E6) d10).a();
    }

    public final synchronized void a(@Nullable Boolean bool) {
        try {
            if (mo.a(bool) || this.f95815b == null) {
                boolean zEquals = Boolean.FALSE.equals(bool);
                this.f95815b = Boolean.valueOf(zEquals);
                ((E6) this.f95814a).f95751a.c(zEquals).b();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void b(@Nullable Boolean bool) {
        if (this.f95815b == null) {
            a(bool);
        }
    }

    @Override // io.appmetrica.analytics.coreapi.internal.control.DataSendingRestrictionController
    public final synchronized boolean isRestrictedForMainReporter() {
        return Boolean.TRUE.equals(this.f95815b);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0018  */
    @Override // io.appmetrica.analytics.coreapi.internal.control.DataSendingRestrictionController
    public final synchronized boolean isRestrictedForReporter(@NonNull String str) {
        boolean z10;
        if (this.f95816c.contains(str)) {
            z10 = true;
        } else {
            if (Boolean.TRUE.equals(this.f95815b)) {
                z10 = true;
            } else {
                z10 = false;
            }
        }
        return z10;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.control.DataSendingRestrictionController
    public final synchronized boolean isRestrictedForSdk() {
        Boolean bool;
        try {
            bool = this.f95815b;
        } catch (Throwable th2) {
            throw th2;
        }
        return bool == null ? this.f95817d.isEmpty() : bool.booleanValue();
    }

    public final synchronized void a(@NonNull String str, @Nullable Boolean bool) {
        try {
            if (mo.a(bool) || (!this.f95817d.contains(str) && !this.f95816c.contains(str))) {
                if (((Boolean) WrapUtils.getOrDefault(bool, Boolean.TRUE)).booleanValue()) {
                    this.f95817d.add(str);
                    this.f95816c.remove(str);
                } else {
                    this.f95816c.add(str);
                    this.f95817d.remove(str);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
