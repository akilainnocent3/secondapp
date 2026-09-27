package com.startapp.sdk.internal;

import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class w6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakReference f75772a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f75773b;

    public w6(Object emitter) {
        kotlin.jvm.internal.m0.p(emitter, "emitter");
        this.f75772a = new WeakReference(emitter);
        this.f75773b = new ArrayList();
    }

    public final boolean a(Object obj) {
        kotlin.jvm.internal.m0.p(obj, "obj");
        kotlin.jvm.internal.m0.p(obj, "obj");
        if (this.f75772a.get() == obj) {
            return true;
        }
        for (w6 w6Var : this.f75773b) {
            if (w6Var.f75772a.get() == obj || w6Var.a(obj)) {
                return true;
            }
        }
        return false;
    }
}
