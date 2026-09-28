package defpackage;

import ua.naiksoftware.stomp.StompClient;

/* JADX INFO: loaded from: classes8.dex */
public final class hee0 implements oxz {
    public final StompClient a;

    public hee0(StompClient stompClient) {
        this.a = stompClient;
    }

    @Override // defpackage.oxz
    public final boolean a(String str, f1e0 f1e0Var) {
        String topicId = this.a.getTopicId(str);
        if (topicId == null) {
            return false;
        }
        return topicId.equals(f1e0Var.b("subscription"));
    }
}
