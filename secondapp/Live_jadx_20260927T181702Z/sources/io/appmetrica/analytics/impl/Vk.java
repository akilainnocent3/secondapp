package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class Vk {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f96626d = "SESSION_SLEEP_START";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f96627e = "SESSION_LAST_EVENT_OFFSET";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f96628f = "SESSION_ID";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f96629g = "SESSION_COUNTER_ID";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f96630h = "SESSION_INIT_TIME";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f96631i = "SESSION_IS_ALIVE_REPORT_NEEDED";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f96632a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    protected final Xe f96633b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public C5069gb f96634c;

    public Vk(@NonNull Xe xe2, @NonNull String str) {
        this.f96633b = xe2;
        this.f96632a = str;
        C5069gb c5069gb = new C5069gb();
        try {
            String strH = xe2.h(str);
            if (!TextUtils.isEmpty(strH)) {
                c5069gb = new C5069gb(strH);
            }
        } catch (Throwable unused) {
        }
        this.f96634c = c5069gb;
    }

    public final Vk a(long j10) {
        a(f96630h, Long.valueOf(j10));
        return this;
    }

    public final Vk b(long j10) {
        a(f96627e, Long.valueOf(j10));
        return this;
    }

    @Nullable
    public final Long c() {
        return this.f96634c.a(f96630h);
    }

    public final Vk d(long j10) {
        a(f96628f, Long.valueOf(j10));
        return this;
    }

    @Nullable
    public final Long e() {
        return this.f96634c.a(f96629g);
    }

    @Nullable
    public final Long f() {
        return this.f96634c.a(f96628f);
    }

    @Nullable
    public final Long g() {
        return this.f96634c.a(f96626d);
    }

    public final boolean h() {
        return this.f96634c.length() > 0;
    }

    @Nullable
    public final Boolean i() {
        C5069gb c5069gb = this.f96634c;
        c5069gb.getClass();
        try {
            return Boolean.valueOf(c5069gb.getBoolean(f96631i));
        } catch (Throwable unused) {
            return null;
        }
    }

    public final Vk a(boolean z10) {
        a(f96631i, Boolean.valueOf(z10));
        return this;
    }

    public final void b() {
        this.f96633b.e(this.f96632a, this.f96634c.toString());
        this.f96633b.b();
    }

    public final Vk c(long j10) {
        a(f96629g, Long.valueOf(j10));
        return this;
    }

    @Nullable
    public final Long d() {
        return this.f96634c.a(f96627e);
    }

    public final Vk e(long j10) {
        a(f96626d, Long.valueOf(j10));
        return this;
    }

    public final void a(String str, Object obj) {
        try {
            this.f96634c.put(str, obj);
        } catch (Throwable unused) {
        }
    }

    public final void a() {
        this.f96634c = new C5069gb();
        b();
    }
}
