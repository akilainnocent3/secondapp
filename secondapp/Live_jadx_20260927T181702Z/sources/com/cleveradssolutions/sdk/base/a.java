package com.cleveradssolutions.sdk.base;

import android.os.Bundle;
import cs.g;
import dr.o;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @l
    public static final a f43988a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static InterfaceC0436a f43989b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @l
    @g
    public static String f43990c = "PSVTargetAd";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @l
    @g
    public static String f43991d = "CAS_Impression";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @l
    @g
    public static String f43992e = "CAS_Fail";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @l
    @g
    public static String f43993f = "PSV_AdEvent";

    /* JADX INFO: renamed from: com.cleveradssolutions.sdk.base.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @o(message = "Will be removed in feature")
    public interface InterfaceC0436a {
        void a(@l String str, @l Bundle bundle);
    }

    @m
    public final InterfaceC0436a b() {
        return f43989b;
    }

    public final void d(@m InterfaceC0436a interfaceC0436a) {
        f43989b = interfaceC0436a;
    }

    @o(message = "No longer support")
    public static /* synthetic */ void a() {
    }

    @o(message = "Not recommended to use")
    public static /* synthetic */ void c() {
    }
}
