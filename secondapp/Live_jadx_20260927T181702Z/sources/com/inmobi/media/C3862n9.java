package com.inmobi.media;

import android.content.Context;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: com.inmobi.media.n9, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class C3862n9 implements InterfaceC3837m9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Gh f57087a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Mj f57088b;

    public C3862n9(Context context, double d10, Ab logLevel, boolean z10, int i10, long j10) {
        kotlin.jvm.internal.m0.p(context, "context");
        kotlin.jvm.internal.m0.p(logLevel, "logLevel");
        this.f57088b = new Mj();
        if (z10) {
            return;
        }
        Gh gh2 = new Gh(context, d10, logLevel, j10, i10);
        this.f57087a = gh2;
        CopyOnWriteArrayList copyOnWriteArrayList = Mb.f55137a;
        kotlin.jvm.internal.m0.m(gh2);
        Lb.b(gh2);
    }

    public final void a(String tag, String message) {
        kotlin.jvm.internal.m0.p(tag, "tag");
        kotlin.jvm.internal.m0.p(message, "message");
        Gh gh2 = this.f57087a;
        if (gh2 != null) {
            gh2.a(Ab.DEBUG, tag, message);
        }
        if (this.f57088b != null) {
            kotlin.jvm.internal.m0.p(tag, "tag");
            kotlin.jvm.internal.m0.p(message, "message");
        }
    }

    public final void b(String tag, String message) {
        kotlin.jvm.internal.m0.p(tag, "tag");
        kotlin.jvm.internal.m0.p(message, "message");
        Gh gh2 = this.f57087a;
        if (gh2 != null) {
            gh2.a(Ab.ERROR, tag, message);
        }
        if (this.f57088b != null) {
            kotlin.jvm.internal.m0.p(tag, "tag");
            kotlin.jvm.internal.m0.p(message, "message");
        }
    }

    public final void c(String tag, String message) {
        kotlin.jvm.internal.m0.p(tag, "tag");
        kotlin.jvm.internal.m0.p(message, "message");
        Gh gh2 = this.f57087a;
        if (gh2 != null) {
            gh2.a(Ab.INFO, tag, message);
        }
        if (this.f57088b != null) {
            kotlin.jvm.internal.m0.p(tag, "tag");
            kotlin.jvm.internal.m0.p(message, "message");
        }
    }

    public final void d(String tag, String message) {
        kotlin.jvm.internal.m0.p(tag, "tag");
        kotlin.jvm.internal.m0.p(message, "message");
        Gh gh2 = this.f57087a;
        if (gh2 != null) {
            gh2.a(Ab.STATE, tag, message);
        }
        if (this.f57088b != null) {
            kotlin.jvm.internal.m0.p(tag, "tag");
            kotlin.jvm.internal.m0.p("STATE_CHANGE: " + message, "message");
        }
    }

    public final void a(String tag, String message, Exception error) {
        kotlin.jvm.internal.m0.p(tag, "tag");
        kotlin.jvm.internal.m0.p(message, "message");
        kotlin.jvm.internal.m0.p(error, "error");
        Gh gh2 = this.f57087a;
        if (gh2 != null) {
            gh2.a(Ab.ERROR, tag, message + "\nError: " + dr.t.i(error));
        }
        if (this.f57088b != null) {
            kotlin.jvm.internal.m0.p(tag, "tag");
            kotlin.jvm.internal.m0.p(message, "message");
            kotlin.jvm.internal.m0.p(error, "error");
        }
    }

    public final void a(boolean z10) {
        Gh gh2 = this.f57087a;
        if (gh2 != null) {
            gh2.b(z10);
        }
        if (z10) {
            return;
        }
        Gh gh3 = this.f57087a;
        if (gh3 == null || !gh3.f54724f.a()) {
            CopyOnWriteArrayList copyOnWriteArrayList = Mb.f55137a;
            Lb.a(this.f57087a);
            this.f57087a = null;
        }
    }

    public final void a() {
        Gh gh2 = this.f57087a;
        if (gh2 != null) {
            gh2.b();
        }
        CopyOnWriteArrayList copyOnWriteArrayList = Mb.f55137a;
        Lb.a(this.f57087a);
    }
}
