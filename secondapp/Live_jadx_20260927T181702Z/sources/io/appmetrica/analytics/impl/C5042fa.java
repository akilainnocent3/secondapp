package io.appmetrica.analytics.impl;

import android.content.Context;
import android.os.Handler;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceComponentsInitializer;
import io.appmetrica.analytics.coreutils.internal.reflection.ReflectionUtils;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import io.appmetrica.analytics.modulesapi.internal.service.ModuleServiceEntryPoint;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.fa, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class C5042fa {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C5042fa f97361d = new C5042fa();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C5399td f97362a = new C5399td();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ServiceComponentsInitializer f97363b = AbstractC4975ck.a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f97364c = false;

    public final void a(Context context) {
        C4968cd c4968cd;
        C5272oa.a(context);
        this.f97363b.onCreate(context);
        this.f97362a.getClass();
        List<String> listA = C5272oa.I.f98050s.a();
        ArrayList arrayList = new ArrayList(fr.i0.d0(listA, 10));
        for (String str : listA) {
            ReflectionUtils reflectionUtils = ReflectionUtils.INSTANCE;
            Object objLoadAndInstantiateClassWithDefaultConstructor = ReflectionUtils.loadAndInstantiateClassWithDefaultConstructor(str, ModuleServiceEntryPoint.class);
            if (objLoadAndInstantiateClassWithDefaultConstructor == null) {
                c4968cd = new C4968cd(str, false);
            } else {
                C5272oa.I.p().a((ModuleServiceEntryPoint<Object>) objLoadAndInstantiateClassWithDefaultConstructor);
                c4968cd = new C4968cd(str, true);
            }
            arrayList.add(c4968cd);
        }
        new C5282ok(C5272oa.I.D().f95638d).a(context);
        xo xoVar = C5272oa.I.D().f95637c;
        synchronized (xoVar) {
            xoVar.f98628a.a();
        }
        C5272oa.I.q().a();
        a().a(arrayList);
    }

    public final void b(Context context) {
        if (this.f97364c) {
            return;
        }
        synchronized (this) {
            try {
                if (!this.f97364c) {
                    a(context);
                    this.f97364c = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static C4994dd a() {
        C5207lk c5207lk = C5272oa.I.f98035d;
        if (c5207lk.f97848b == null) {
            synchronized (c5207lk) {
                try {
                    if (c5207lk.f97848b == null) {
                        c5207lk.f97847a.getClass();
                        HandlerThreadC4992db handlerThreadC4992dbA = A9.a("IAA-SC");
                        c5207lk.f97848b = new A9(handlerThreadC4992dbA, handlerThreadC4992dbA.getLooper(), new Handler(handlerThreadC4992dbA.getLooper()));
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return new C4994dd(c5207lk.f97848b, C5272oa.I.y(), "service_modules", new SystemTimeProvider());
    }
}
