package defpackage;

import com.sporty.android.core.model.MyLog;
import com.sportybet.ntespm.socket.OnSubscribedListener;
import com.sportybet.ntespm.socket.Topic;

/* JADX INFO: loaded from: classes7.dex */
public final class ir00 implements OnSubscribedListener {
    public final /* synthetic */ kr00 a;

    public ir00(kr00 kr00Var) {
        this.a = kr00Var;
    }

    @Override // com.sportybet.ntespm.socket.OnSubscribedListener
    public final void onSubscribed(Topic topic) {
        topic.getClass();
        if ("personal_topic".equals(topic.getTopic())) {
            mq00 mq00Var = this.a.e;
            itf0.a aVar = itf0.a;
            aVar.q(MyLog.TAG_PERSON_SOCKET_USE_CASE);
            aVar.a("subscribe", new Object[0]);
            mq00Var.i.setValue(mq00.c.a.a);
        }
    }
}
