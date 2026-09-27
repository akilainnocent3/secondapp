package com.ironsource;

/* JADX INFO: renamed from: com.ironsource.q4, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class C4469q4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.l
    private final Throwable f63392a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oy.l
    private final String f63393b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f63394c;

    public C4469q4(@oy.l Throwable throwable) {
        kotlin.jvm.internal.m0.p(throwable, "throwable");
        this.f63392a = throwable;
        StringBuilder sb2 = new StringBuilder();
        StackTraceElement[] stackTrace = throwable.getStackTrace();
        kotlin.jvm.internal.m0.o(stackTrace, "throwable.stackTrace");
        sb2.append(throwable.toString());
        sb2.append(System.lineSeparator());
        boolean z10 = false;
        for (StackTraceElement stackTraceElement : stackTrace) {
            sb2.append(stackTraceElement.toString());
            sb2.append(";" + System.lineSeparator());
            String string = stackTraceElement.toString();
            kotlin.jvm.internal.m0.o(string, "elem.toString()");
            String strE = C4485r4.d().e();
            kotlin.jvm.internal.m0.o(strE, "getInstance().keyword");
            if (cv.p0.n3(string, strE, false, 2, null)) {
                z10 = true;
            }
        }
        Throwable cause = this.f63392a.getCause();
        if (cause != null) {
            sb2.append("--CAUSE");
            sb2.append(System.lineSeparator());
            sb2.append(cause.toString());
            sb2.append(System.lineSeparator());
            StackTraceElement[] stackTrace2 = cause.getStackTrace();
            kotlin.jvm.internal.m0.o(stackTrace2, "cause.stackTrace");
            for (StackTraceElement stackTraceElement2 : stackTrace2) {
                sb2.append(stackTraceElement2.toString());
                sb2.append(";" + System.lineSeparator());
                String string2 = stackTraceElement2.toString();
                kotlin.jvm.internal.m0.o(string2, "elem.toString()");
                String strE2 = C4485r4.d().e();
                kotlin.jvm.internal.m0.o(strE2, "getInstance().keyword");
                if (cv.p0.n3(string2, strE2, false, 2, null)) {
                    z10 = true;
                }
            }
        }
        String string3 = sb2.toString();
        kotlin.jvm.internal.m0.o(string3, "builder.toString()");
        this.f63393b = string3;
        this.f63394c = z10;
    }

    @oy.l
    public final Throwable a() {
        return this.f63392a;
    }

    @oy.l
    public final String b() {
        return this.f63393b;
    }

    @oy.l
    public final Throwable c() {
        return this.f63392a;
    }

    public final boolean d() {
        return this.f63394c;
    }

    public boolean equals(@oy.m Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4469q4) && kotlin.jvm.internal.m0.g(this.f63392a, ((C4469q4) obj).f63392a);
    }

    public int hashCode() {
        return this.f63392a.hashCode();
    }

    @oy.l
    public String toString() {
        return "CrashReportWrapper(throwable=" + this.f63392a + gi.j.f86771d;
    }

    @oy.l
    public final C4469q4 a(@oy.l Throwable throwable) {
        kotlin.jvm.internal.m0.p(throwable, "throwable");
        return new C4469q4(throwable);
    }

    public static /* synthetic */ C4469q4 a(C4469q4 c4469q4, Throwable th2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            th2 = c4469q4.f63392a;
        }
        return c4469q4.a(th2);
    }
}
