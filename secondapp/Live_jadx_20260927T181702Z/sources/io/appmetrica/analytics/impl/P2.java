package io.appmetrica.analytics.impl;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class P2 implements InterfaceC5232mk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f96311a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Intent f96312b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f96313c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final H5 f96314d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final IHandlerExecutor f96315e;

    public P2(@NonNull Context context, @NonNull IHandlerExecutor iHandlerExecutor) {
        this(context, iHandlerExecutor, 0);
    }

    @Nullable
    public final synchronized Intent a(@NonNull Consumer<Intent> consumer) {
        this.f96311a.add(consumer);
        return this.f96312b;
    }

    public final void b() {
        this.f96312b = null;
        H5 h10 = this.f96314d;
        Context context = this.f96313c;
        synchronized (h10) {
            if (h10.f95884b) {
                try {
                    context.unregisterReceiver(h10.f95883a);
                    h10.f95884b = false;
                } catch (Throwable unused) {
                }
            }
        }
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5232mk
    public final synchronized void onCreate() {
        Intent intentA = a();
        this.f96312b = intentA;
        Iterator it = this.f96311a.iterator();
        while (it.hasNext()) {
            ((Consumer) it.next()).consume(intentA);
        }
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC5232mk
    public final synchronized void onDestroy() {
        this.f96312b = null;
        b();
        Iterator it = this.f96311a.iterator();
        while (it.hasNext()) {
            ((Consumer) it.next()).consume(null);
        }
    }

    public P2(Context context, IHandlerExecutor iHandlerExecutor, int i10) {
        this.f96311a = new ArrayList();
        this.f96312b = null;
        this.f96313c = context;
        this.f96315e = iHandlerExecutor;
        this.f96314d = G5.a(new C5413u2(new O2(this), iHandlerExecutor));
    }

    public final Intent a() {
        Intent intentRegisterReceiver;
        IntentFilter intentFilter = new IntentFilter("android.intent.action.BATTERY_CHANGED");
        H5 h10 = this.f96314d;
        Context context = this.f96313c;
        IHandlerExecutor iHandlerExecutor = this.f96315e;
        synchronized (h10) {
            intentRegisterReceiver = null;
            try {
                intentRegisterReceiver = context.registerReceiver(h10.f95883a, intentFilter, null, iHandlerExecutor.getHandler());
                h10.f95884b = true;
            } catch (Throwable unused) {
            }
        }
        return intentRegisterReceiver;
    }
}
