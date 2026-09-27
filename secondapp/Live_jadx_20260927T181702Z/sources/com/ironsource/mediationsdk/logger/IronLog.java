package com.ironsource.mediationsdk.logger;

import com.ironsource.C4332ib;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public enum IronLog {
    API(IronSourceLogger.IronSourceTag.API),
    CALLBACK(IronSourceLogger.IronSourceTag.CALLBACK),
    ADAPTER_API(IronSourceLogger.IronSourceTag.ADAPTER_API),
    ADAPTER_CALLBACK(IronSourceLogger.IronSourceTag.ADAPTER_CALLBACK),
    NETWORK(IronSourceLogger.IronSourceTag.NETWORK),
    INTERNAL(IronSourceLogger.IronSourceTag.INTERNAL),
    NATIVE(IronSourceLogger.IronSourceTag.NATIVE),
    EVENT(IronSourceLogger.IronSourceTag.EVENT);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    IronSourceLogger.IronSourceTag f62717a;

    IronLog(IronSourceLogger.IronSourceTag ironSourceTag) {
        this.f62717a = ironSourceTag;
    }

    public void error(String str, Throwable th2) {
        IronSourceLoggerManager.getLogger().a(this.f62717a, new C4332ib(str, 3), th2);
    }

    public void general(String str) {
        IronSourceLoggerManager.getLogger().a(this.f62717a, new C4332ib(str, 4));
    }

    public void info(String str) {
        IronSourceLoggerManager.getLogger().a(this.f62717a, new C4332ib(str, 1));
    }

    public void verbose(String str) {
        IronSourceLoggerManager.getLogger().a(this.f62717a, new C4332ib(str, 0));
    }

    public void warning(String str) {
        IronSourceLoggerManager.getLogger().a(this.f62717a, new C4332ib(str, 2));
    }

    public void error(String str) {
        IronSourceLoggerManager.getLogger().a(this.f62717a, new C4332ib(str, 3));
    }

    public void general() {
        IronSourceLoggerManager.getLogger().a(this.f62717a, new C4332ib("", 4));
    }

    public void info() {
        IronSourceLoggerManager.getLogger().a(this.f62717a, new C4332ib("", 1));
    }

    public void verbose() {
        IronSourceLoggerManager.getLogger().a(this.f62717a, new C4332ib("", 0));
    }

    public void warning() {
        IronSourceLoggerManager.getLogger().a(this.f62717a, new C4332ib("", 2));
    }

    public void error() {
        IronSourceLoggerManager.getLogger().a(this.f62717a, new C4332ib("", 3));
    }
}
