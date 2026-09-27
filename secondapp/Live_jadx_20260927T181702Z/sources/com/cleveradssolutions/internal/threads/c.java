package com.cleveradssolutions.internal.threads;

import android.os.Handler;
import android.os.Looper;
import com.cleveradssolutions.internal.consent.z;
import com.cleveradssolutions.internal.services.q;
import dr.w2;
import kotlin.jvm.internal.m0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public abstract class c implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Handler f43832b;

    public c(Handler callbackHandler) {
        m0.p(callbackHandler, "callbackHandler");
        this.f43832b = callbackHandler;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (m0.g(this.f43832b.getLooper(), Looper.myLooper())) {
            z zVar = (z) this;
            q.f43762d.o(zVar.f43315d, zVar.f43316e, zVar.f43317f);
        } else {
            q.f43760b.B(((z) this).f43314c);
            w2 w2Var = w2.f79517a;
            this.f43832b.post(this);
        }
    }

    public /* synthetic */ c() {
        this(com.cleveradssolutions.sdk.base.c.f43997a.e());
    }
}
