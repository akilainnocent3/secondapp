package com.ironsource;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public class R3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private a f59966a = a.NOT_READY;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ArrayList f59967b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f59968c;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public enum a {
        NOT_READY,
        READY
    }

    public R3(String str) {
        this.f59968c = str;
    }

    public synchronized void a(Runnable runnable) {
        if (this.f59966a != a.READY) {
            this.f59967b.add(runnable);
        } else {
            runnable.run();
        }
    }

    public synchronized void b() {
        this.f59966a = a.NOT_READY;
    }

    public synchronized void c() {
        this.f59966a = a.READY;
    }

    public synchronized void a() {
        try {
            Object[] array = this.f59967b.toArray();
            for (int i10 = 0; i10 < array.length; i10++) {
                ((Runnable) array[i10]).run();
                array[i10] = null;
            }
            this.f59967b.clear();
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
