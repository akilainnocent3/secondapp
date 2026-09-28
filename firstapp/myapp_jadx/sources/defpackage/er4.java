package defpackage;

import android.app.Activity;
import com.sportybet.android.home.MainActivity;
import com.sportybet.ntespm.socket.GroupTopic;
import com.sportybet.ntespm.socket.ISocketPushManager;
import com.sportybet.ntespm.socket.Subscriber;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes5.dex */
public final class er4 implements Subscriber, qti {
    public final krm a;
    public final gtm b;
    public final ISocketPushManager c;
    public final GroupTopic d;

    public er4(krm krmVar, gtm gtmVar, ISocketPushManager iSocketPushManager) {
        krmVar.getClass();
        gtmVar.getClass();
        iSocketPushManager.getClass();
        this.a = krmVar;
        this.b = gtmVar;
        this.c = iSocketPushManager;
        this.d = new GroupTopic("refresh_bonus_factor_topic");
    }

    @Override // defpackage.qti
    public final void onActivityCreated(Activity activity) {
        activity.getClass();
        if (activity instanceof MainActivity) {
            ISocketPushManager iSocketPushManager = this.c;
            GroupTopic groupTopic = this.d;
            iSocketPushManager.unsubscribeTopic(groupTopic, this);
            iSocketPushManager.subscribeTopic(groupTopic, this);
        }
    }

    @Override // defpackage.qti
    public final void onActivityDestroyed(Activity activity) {
        activity.getClass();
        activity.getClass();
    }

    @Override // defpackage.qti
    public final void onActivityResumed(Activity activity) {
        activity.getClass();
        activity.getClass();
    }

    @Override // defpackage.qti
    public final void onBecameBackground() {
        this.c.unsubscribeTopic(this.d, this);
    }

    @Override // defpackage.qti
    public final void onBecameForeground() {
        this.c.subscribeTopic(this.d, this);
    }

    @Override // com.sportybet.ntespm.socket.Subscriber
    public final void onReceive(String str) {
        LinkedHashMap linkedHashMap = dr4.a;
        if (!linkedHashMap.isEmpty()) {
            linkedHashMap.clear();
        }
        this.a.F();
    }
}
