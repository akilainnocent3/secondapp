package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public abstract class E2 implements ModulePreferences {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC5457vl f95748a;

    public E2(@oy.l InterfaceC5457vl interfaceC5457vl) {
        this.f95748a = interfaceC5457vl;
    }

    @oy.l
    public abstract String a(@oy.l String str);

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences
    public final boolean getBoolean(@oy.l String str, boolean z10) {
        return ((AbstractC5549zd) this.f95748a).c(str, z10);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences
    public final int getInt(@oy.l String str, int i10) {
        return ((AbstractC5549zd) this.f95748a).c(str, i10);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences
    public final long getLong(@oy.l String str, long j10) {
        return ((AbstractC5549zd) this.f95748a).c(a(str), j10);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences
    @oy.m
    public final String getString(@oy.l String str, @oy.m String str2) {
        return ((AbstractC5549zd) this.f95748a).c(a(str), str2);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences
    public final void putBoolean(@oy.l String str, boolean z10) {
        AbstractC5549zd abstractC5549zd = (AbstractC5549zd) this.f95748a;
        ((Ye) ((InterfaceC5457vl) abstractC5549zd.b(abstractC5549zd.f(a(str)), z10))).b();
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences
    public final void putInt(@oy.l String str, int i10) {
        AbstractC5549zd abstractC5549zd = (AbstractC5549zd) this.f95748a;
        ((Ye) ((InterfaceC5457vl) abstractC5549zd.b(abstractC5549zd.f(str), i10))).b();
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences
    public final void putLong(@oy.l String str, long j10) {
        AbstractC5549zd abstractC5549zd = (AbstractC5549zd) this.f95748a;
        ((Ye) ((InterfaceC5457vl) abstractC5549zd.b(abstractC5549zd.f(a(str)), j10))).b();
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences
    public final void putString(@oy.l String str, @oy.m String str2) {
        AbstractC5549zd abstractC5549zd = (AbstractC5549zd) this.f95748a;
        ((Ye) ((InterfaceC5457vl) abstractC5549zd.b(abstractC5549zd.f(a(str)), str2))).b();
    }
}
