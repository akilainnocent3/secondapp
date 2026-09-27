package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import io.appmetrica.analytics.coreapi.internal.backport.Function;
import java.io.File;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class Uf implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f96574a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Function f96575b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Consumer f96576c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Consumer f96577d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C4913aa f96578e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final InterfaceC4950bl f96579f;

    public Uf(File file, Function function, Consumer consumer, Consumer consumer2, C4913aa c4913aa, InterfaceC4950bl interfaceC4950bl) {
        this.f96574a = file;
        this.f96575b = function;
        this.f96576c = consumer;
        this.f96577d = consumer2;
        this.f96578e = c4913aa;
        this.f96579f = interfaceC4950bl;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f96574a.exists()) {
            C5520y9 c5520y9B = this.f96578e.b(this.f96574a.getName());
            Consumer consumer = this.f96576c;
            try {
                c5520y9B.f98668a.lock();
                c5520y9B.f98669b.a();
                if (!this.f96574a.exists()) {
                    consumer.consume(this.f96574a);
                    c5520y9B.c();
                    C4913aa c4913aa = this.f96578e;
                    String name = this.f96574a.getName();
                    synchronized (c4913aa) {
                        c4913aa.f96937b.remove(name);
                    }
                    return;
                }
                Object objApply = this.f96575b.apply(this.f96574a);
                if (objApply != null) {
                    if (this.f96579f.a(objApply)) {
                        this.f96577d.consume(objApply);
                    } else {
                        consumer = new Consumer() { // from class: io.appmetrica.analytics.impl.up
                            @Override // io.appmetrica.analytics.coreapi.internal.backport.Consumer
                            public final void consume(Object obj) {
                                Uf.a((File) obj);
                            }
                        };
                    }
                }
            } catch (Throwable unused) {
            }
            consumer.consume(this.f96574a);
            c5520y9B.c();
            this.f96578e.a(this.f96574a.getName());
        }
    }

    public static final void a(File file) {
    }
}
