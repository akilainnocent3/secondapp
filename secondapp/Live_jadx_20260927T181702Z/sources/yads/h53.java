package yads;

import android.os.Message;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class h53 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Message f149941a;

    public final void a() {
        this.f149941a = null;
        ArrayList arrayList = i53.f150439b;
        synchronized (arrayList) {
            try {
                if (arrayList.size() < 50) {
                    arrayList.add(this);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void b() {
        Message message = this.f149941a;
        message.getClass();
        message.sendToTarget();
        a();
    }
}
