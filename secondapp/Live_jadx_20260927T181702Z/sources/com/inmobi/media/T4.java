package com.inmobi.media;

import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public class T4 extends Q9 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final StackTraceElement[] f55534g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T4(Thread thread, Throwable error) {
        super("crashReporting", "CrashEvent", AbstractC3749il.a(thread, error));
        kotlin.jvm.internal.m0.p(thread, "thread");
        kotlin.jvm.internal.m0.p(error, "error");
        this.f55534g = error.getStackTrace();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public T4(String str) {
        String eventId = UUID.randomUUID().toString();
        kotlin.jvm.internal.m0.o(eventId, "toString(...)");
        kotlin.jvm.internal.m0.p("crashReporting", "component");
        kotlin.jvm.internal.m0.p("CatchEvent", "eventType");
        kotlin.jvm.internal.m0.p(eventId, "eventId");
        super(eventId, "crashReporting", "CatchEvent", str);
    }
}
