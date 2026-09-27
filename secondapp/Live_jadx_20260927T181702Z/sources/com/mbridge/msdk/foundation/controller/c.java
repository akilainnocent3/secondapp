package com.mbridge.msdk.foundation.controller;

import android.annotation.SuppressLint;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public class c extends a {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @SuppressLint({"StaticFieldLeak"})
    private static volatile c f66708t;

    private c() {
    }

    public static c n() {
        if (f66708t == null) {
            synchronized (c.class) {
                try {
                    if (f66708t == null) {
                        f66708t = new c();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f66708t;
    }

    @Override // com.mbridge.msdk.foundation.controller.a
    public void a(a.e eVar) {
    }
}
