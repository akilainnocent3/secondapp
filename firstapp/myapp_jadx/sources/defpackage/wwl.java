package defpackage;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.sportybet.android.firebase.MessageService;

/* JADX INFO: loaded from: classes5.dex */
public abstract class wwl extends FirebaseMessagingService implements j1k {
    public volatile ze80 a;
    public final Object b = new Object();
    public boolean c = false;

    @Override // defpackage.j1k
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final ze80 componentManager() {
        if (this.a == null) {
            synchronized (this.b) {
                try {
                    if (this.a == null) {
                        this.a = new ze80(this);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.a;
    }

    @Override // defpackage.i1k
    public final Object generatedComponent() {
        return componentManager().generatedComponent();
    }

    @Override // android.app.Service
    public void onCreate() {
        if (!this.c) {
            this.c = true;
            ((lov) generatedComponent()).a((MessageService) this);
        }
        super.onCreate();
    }
}
