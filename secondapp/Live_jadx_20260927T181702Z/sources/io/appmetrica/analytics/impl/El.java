package io.appmetrica.analytics.impl;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class El {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f95792a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f95793b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f95794c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Integer f95795d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f95796e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Boolean f95797f;

    public El(String str, String str2, Integer num, Integer num2, String str3, Boolean bool) {
        this.f95792a = str;
        this.f95793b = str2;
        this.f95794c = num;
        this.f95795d = num2;
        this.f95796e = str3;
        this.f95797f = bool;
    }

    public El(StackTraceElement stackTraceElement) {
        this(stackTraceElement.getClassName(), stackTraceElement.getFileName(), Integer.valueOf(stackTraceElement.getLineNumber()), null, stackTraceElement.getMethodName(), Boolean.valueOf(stackTraceElement.isNativeMethod()));
    }
}
