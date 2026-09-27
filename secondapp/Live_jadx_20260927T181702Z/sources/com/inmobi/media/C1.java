package com.inmobi.media;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class C1 extends Handler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f54427a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1(Looper looper) {
        super(looper);
        kotlin.jvm.internal.m0.p(looper, "looper");
        this.f54427a = true;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message msg) {
        kotlin.jvm.internal.m0.p(msg, "msg");
        int i10 = msg.what;
        if (i10 == 1001 && this.f54427a) {
            this.f54427a = false;
            E1.a(false);
            kotlin.jvm.internal.m0.o("E1", "access$getTAG$p(...)");
        } else {
            if (i10 != 1002 || this.f54427a) {
                return;
            }
            this.f54427a = true;
            E1.a(true);
            kotlin.jvm.internal.m0.o("E1", "access$getTAG$p(...)");
        }
    }
}
