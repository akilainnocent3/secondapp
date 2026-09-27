package ej;

import java.lang.reflect.Method;
import zi.l0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
@e
public class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f81342a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f81343b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f81344c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Method f81345d;

    public k(f eventBus, Object event, Object subscriber, Method subscriberMethod) {
        this.f81342a = (f) l0.E(eventBus);
        this.f81343b = l0.E(event);
        this.f81344c = l0.E(subscriber);
        this.f81345d = (Method) l0.E(subscriberMethod);
    }

    public Object a() {
        return this.f81343b;
    }

    public f b() {
        return this.f81342a;
    }

    public Object c() {
        return this.f81344c;
    }

    public Method d() {
        return this.f81345d;
    }
}
