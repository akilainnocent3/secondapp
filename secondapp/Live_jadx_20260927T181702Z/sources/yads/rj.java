package yads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class rj extends Handler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ tj f154983a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rj(tj tjVar, Looper looper) {
        super(looper);
        this.f154983a = tjVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        this.f154983a.a(message);
    }
}
