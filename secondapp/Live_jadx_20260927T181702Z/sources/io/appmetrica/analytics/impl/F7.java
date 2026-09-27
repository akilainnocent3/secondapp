package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceComponentsInitializer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class F7 implements ServiceComponentsInitializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f95818a = fr.h0.Q("io.appmetrica.analytics.remotepermissions.internal.RemotePermissionsModuleEntryPoint", "io.appmetrica.analytics.apphud.internal.ApphudServiceModuleEntryPoint", "io.appmetrica.analytics.screenshot.internal.ScreenshotServiceModuleEntryPoint", "io.appmetrica.analytics.billing.internal.BillingServiceModuleEntryPoint", "io.appmetrica.analytics.idsync.internal.IdSyncModuleEntryPoint");

    @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceComponentsInitializer
    public final void onCreate(@oy.l Context context) {
        Tc tc2 = C5272oa.I.f98050s;
        List list = this.f95818a;
        ArrayList arrayList = new ArrayList(fr.i0.d0(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new C5341r5((String) it.next()));
        }
        Object[] array = arrayList.toArray(new C5341r5[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
        C5341r5[] c5341r5Arr = (C5341r5[]) array;
        Sc[] scArr = (Sc[]) Arrays.copyOf(c5341r5Arr, c5341r5Arr.length);
        synchronized (tc2) {
            fr.m0.u0(tc2.f96511a, scArr);
        }
        C5272oa.I.f98050s.a(new Ve(context, "io.appmetrica.analytics.modules.ads", "lsm"));
    }
}
