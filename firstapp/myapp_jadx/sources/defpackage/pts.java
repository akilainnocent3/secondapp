package defpackage;

import com.google.protobuf.Reader;
import com.sportybet.ntespm.socket.GroupTopic;
import com.sportybet.ntespm.socket.SocketPushManager;
import com.sportybet.ntespm.socket.TopicInfoKt;
import com.sportybet.ntespm.socket.TopicType;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lpts;", "Lj8i0;", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class pts extends j8i0 {
    public final fe0 a;
    public final hus b;
    public final wwd0 c;
    public final v340 d;
    public final b390 e;
    public final t340 f;
    public String i;
    public jvd0 v;

    public pts(fe0 fe0Var, hus husVar) {
        this.a = fe0Var;
        this.b = husVar;
        wwd0 wwd0VarA = xwd0.a(lk50.b.a);
        this.c = wwd0VarA;
        this.d = e1i.b(wwd0VarA);
        b390 b390VarA = d390.a(Reader.READ_DONE, Reader.READ_DONE, pb5.b);
        this.e = b390VarA;
        this.f = e1i.a(b390VarA);
        this.i = "";
        SocketPushManager.getInstance().subscribeTopic(new GroupTopic(TopicInfoKt.generateTopicString$default(TopicType.LIVE_SPORTS, null, 2, null)), husVar.c);
        kzh.d(new g1i(r0i.e(husVar.h, husVar.j, husVar.l), new nts(this, null)), o8i0.d(this));
    }

    public final void x1() {
        et7 et7VarD = o8i0.d(this);
        String str = this.i;
        t2j t2jVar = new t2j(this, 1);
        fe0 fe0Var = this.a;
        fe0Var.getClass();
        str.getClass();
        h940 h940Var = (h940) fe0Var.a;
        kzh.d(new g1i(bm50.a(r1i.a(h940Var.z("1"), h940Var.m(str), h940Var.b(), new lts(str, null))), new mts(t2jVar, null)), et7VarD);
    }
}
