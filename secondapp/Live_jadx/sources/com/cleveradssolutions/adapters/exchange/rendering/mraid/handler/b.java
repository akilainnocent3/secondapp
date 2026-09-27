package com.cleveradssolutions.adapters.exchange.rendering.mraid.handler;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public class b extends Handler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f42291a;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface a {
        void a(Throwable th2);

        void b(String str);
    }

    public b(a aVar) {
        super(Looper.getMainLooper());
        this.f42291a = aVar;
    }

    public final /* synthetic */ void b(Message message) {
        try {
            this.f42291a.b(message.getData().getString("value"));
        } catch (Exception e10) {
            this.f42291a.a(e10);
        }
    }

    @Override // android.os.Handler
    public void handleMessage(final Message message) {
        super.handleMessage(message);
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.cleveradssolutions.adapters.exchange.rendering.mraid.handler.a
            @Override // java.lang.Runnable
            public final void run() {
                this.f42289b.b(message);
            }
        });
    }
}
