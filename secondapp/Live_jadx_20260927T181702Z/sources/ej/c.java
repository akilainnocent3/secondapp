package ej;

import zi.d0;
import zi.l0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
@e
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f81317a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f81318b;

    public c(Object source, Object event) {
        this.f81317a = l0.E(source);
        this.f81318b = l0.E(event);
    }

    public Object a() {
        return this.f81318b;
    }

    public Object b() {
        return this.f81317a;
    }

    public String toString() {
        return d0.c(this).f("source", this.f81317a).f("event", this.f81318b).toString();
    }
}
