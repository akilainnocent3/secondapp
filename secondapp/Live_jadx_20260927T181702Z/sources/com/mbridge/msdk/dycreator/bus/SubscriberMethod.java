package com.mbridge.msdk.dycreator.bus;

import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
final class SubscriberMethod {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Method f66481a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final ThreadMode f66482b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final Class<?> f66483c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    String f66484d;

    public SubscriberMethod(Method method, ThreadMode threadMode, Class<?> cls) {
        this.f66481a = method;
        this.f66482b = threadMode;
        this.f66483c = cls;
    }

    private synchronized void a() {
        if (this.f66484d == null) {
            StringBuilder sb2 = new StringBuilder(64);
            sb2.append(this.f66481a.getDeclaringClass().getName());
            sb2.append('#');
            sb2.append(this.f66481a.getName());
            sb2.append('(');
            sb2.append(this.f66483c.getName());
            this.f66484d = sb2.toString();
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof SubscriberMethod)) {
            return false;
        }
        a();
        return this.f66484d.equals(((SubscriberMethod) obj).f66484d);
    }

    public int hashCode() {
        return this.f66481a.hashCode();
    }
}
