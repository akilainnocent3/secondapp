package com.ironsource;

import android.app.Activity;
import android.content.MutableContextWrapper;

/* JADX INFO: renamed from: com.ironsource.g4, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public class C4289g4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    MutableContextWrapper f61853a;

    public synchronized void a(Activity activity) {
        try {
            if (this.f61853a == null) {
                this.f61853a = new MutableContextWrapper(activity);
            }
            this.f61853a.setBaseContext(activity);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void b() {
        this.f61853a = null;
    }

    public Activity a() {
        return (Activity) this.f61853a.getBaseContext();
    }
}
