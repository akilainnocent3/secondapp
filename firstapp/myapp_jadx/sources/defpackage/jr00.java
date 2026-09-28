package defpackage;

import com.sporty.android.core.model.MyLog;
import com.sportybet.ntespm.socket.OnUnsubscribedListener;
import com.sportybet.ntespm.socket.Topic;

/* JADX INFO: loaded from: classes7.dex */
public final class jr00 implements OnUnsubscribedListener {
    public final /* synthetic */ kr00 a;

    public jr00(kr00 kr00Var) {
        this.a = kr00Var;
    }

    @Override // com.sportybet.ntespm.socket.OnUnsubscribedListener
    public final void onUnsubscribed(Topic topic) {
        topic.getClass();
        if ("personal_topic".equals(topic.getTopic())) {
            mq00 mq00Var = this.a.e;
            itf0.a aVar = itf0.a;
            aVar.q(MyLog.TAG_PERSON_SOCKET_USE_CASE);
            aVar.a("unsubscribe", new Object[0]);
            mq00Var.i.setValue(mq00.c.b.a);
        }
    }
}
