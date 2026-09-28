package defpackage;

import com.google.protobuf.Reader;
import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.core.model.MyLog;
import com.sportybet.ntespm.socket.GroupTopic;
import com.sportybet.ntespm.socket.SocketPushManager;
import com.sportybet.ntespm.socket.Subscriber;
import com.sportybet.ntespm.socket.Topic;
import com.sportybet.ntespm.socket.TopicInfo;
import com.sportybet.ntespm.socket.TopicInfoKt;
import com.sportybet.ntespm.socket.TopicType;
import com.sportybet.plugin.realsports.data.BoostInfo;
import com.sportybet.plugin.realsports.data.SocketEventMessage;
import com.sportybet.plugin.realsports.data.SocketMarketMessage;
import com.sportybet.plugin.realsports.data.Tournament;
import com.sportybet.plugin.realsports.live.data.LiveBoostMatchItem;
import com.sportybet.plugin.realsports.type.RegularMarketRule;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public abstract class u22 extends j8i0 {
    public final ssw A;
    public mfb0 B;
    public RegularMarketRule C;
    public jvd0 D;
    public final wwd0 E;
    public final v340 F;
    public final m2l a;
    public final v5k b;
    public final f1p c;
    public final Map<Topic, Subscriber> d;
    public final s22 e;
    public final t22 f;
    public final b390 i;
    public final b390 v;
    public final b390 w;
    public final b390 y;
    public final ssw<lk50<bxg0<List<Tournament>, List<LiveBoostMatchItem>, Boolean>>> z;

    @c0d(c = "com.sportybet.plugin.realsports.live.base.BaseLiveViewModel$1", f = "BaseLiveViewModel.kt", l = {96}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public wwd0 a;
        public int b;

        public a(v1b<? super a> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return u22.this.new a(v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            wwd0 wwd0Var;
            y5b y5bVar = y5b.a;
            int i = this.b;
            if (i == 0) {
                uj50.b(obj);
                u22 u22Var = u22.this;
                wwd0 wwd0Var2 = u22Var.E;
                m2l m2lVar = u22Var.a;
                this.a = wwd0Var2;
                this.b = 1;
                obj = m2lVar.a.getString("live_sorting_data", "", this);
                if (obj == y5bVar) {
                    return y5bVar;
                }
                wwd0Var = wwd0Var2;
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                wwd0Var = this.a;
                uj50.b(obj);
            }
            wwd0Var.setValue(obj);
            return Unit.a;
        }
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [s22] */
    /* JADX WARN: Type inference failed for: r1v4, types: [t22] */
    public u22(m2l m2lVar, v5k v5kVar, f1p f1pVar) {
        m2lVar.getClass();
        this.a = m2lVar;
        this.b = v5kVar;
        this.c = f1pVar;
        this.d = Collections.synchronizedMap(new LinkedHashMap());
        this.e = new Subscriber() { // from class: s22
            @Override // com.sportybet.ntespm.socket.Subscriber
            public final void onReceive(String str) {
                SocketMarketMessage socketMarketMessageCreate = SocketMarketMessage.create(str);
                if (socketMarketMessageCreate == null || !socketMarketMessageCreate.isLive) {
                    return;
                }
                this.a.i.a(socketMarketMessageCreate);
            }
        };
        this.f = new Subscriber() { // from class: t22
            @Override // com.sportybet.ntespm.socket.Subscriber
            public final void onReceive(String str) {
                itf0.a aVar = itf0.a;
                aVar.a(yv0.a(aVar, MyLog.TAG_LIVE_EVENT_STATUS, "on receive event status message: ", str), new Object[0]);
                SocketEventMessage socketEventMessageCreate = SocketEventMessage.create(str);
                if (socketEventMessageCreate == null) {
                    return;
                }
                this.a.w.a(socketEventMessageCreate);
            }
        };
        pb5 pb5Var = pb5.b;
        b390 b390VarA = d390.a(Reader.READ_DONE, Reader.READ_DONE, pb5Var);
        this.i = b390VarA;
        this.v = b390VarA;
        b390 b390VarA2 = d390.a(Reader.READ_DONE, Reader.READ_DONE, pb5Var);
        this.w = b390VarA2;
        this.y = b390VarA2;
        ssw<lk50<bxg0<List<Tournament>, List<LiveBoostMatchItem>, Boolean>>> sswVar = new ssw<>();
        this.z = sswVar;
        this.A = sswVar;
        wwd0 wwd0VarA = xwd0.a("");
        this.E = wwd0VarA;
        this.F = e1i.b(wwd0VarA);
        ej5.c(o8i0.d(this), null, null, new a(null), 3);
    }

    public static void z1(u22 u22Var, String str) {
        u22Var.getClass();
        str.getClass();
        jvd0 jvd0Var = u22Var.D;
        if (jvd0Var != null) {
            jvd0Var.cancel((CancellationException) null);
        }
        u22Var.D = kzh.d(new yzh(new g1i(new xzh(new v22(new s78(u22Var.y1(), u22Var.A1(str), new w22(3, null))), new x22(u22Var, null)), new y22(u22Var, null)), new z22(u22Var, null)), o8i0.d(u22Var));
    }

    public abstract lyh A1(String str);

    public final void B1(boolean z) {
        itf0.a aVar = itf0.a;
        aVar.q(MyLog.TAG_LIVE_PAGE);
        aVar.a("unsubscribe all topics [" + this.d.size() + "] " + this.d.keySet(), new Object[0]);
        Map<Topic, Subscriber> map = this.d;
        map.getClass();
        synchronized (map) {
            try {
                Map<Topic, Subscriber> map2 = this.d;
                map2.getClass();
                for (Map.Entry<Topic, Subscriber> entry : map2.entrySet()) {
                    SocketPushManager.getInstance().unsubscribeTopic(entry.getKey(), entry.getValue());
                }
                if (z) {
                    this.d.clear();
                }
                Unit unit = Unit.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void C1() {
        final RegularMarketRule regularMarketRule;
        mfb0 mfb0Var = this.B;
        if (mfb0Var == null || (regularMarketRule = this.C) == null) {
            return;
        }
        B1(true);
        x1();
        final String strA = sa8.a(mfb0Var.getId());
        String strGenerateTopicString = TopicInfoKt.generateTopicString(TopicType.EVENT_STATUS, new n22(strA, 0));
        String strGenerateTopicString2 = TopicInfoKt.generateTopicString(TopicType.MARKET_STATUS, new Function1() { // from class: o22
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                TopicInfo topicInfo = (TopicInfo) obj;
                topicInfo.getClass();
                topicInfo.setSportId(strA);
                topicInfo.setProductId(tva.a);
                topicInfo.setMarketId(regularMarketRule.a);
                return Unit.a;
            }
        });
        String strGenerateTopicString3 = TopicInfoKt.generateTopicString(TopicType.MARKET_ODDS, new Function1() { // from class: p22
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                TopicInfo topicInfo = (TopicInfo) obj;
                topicInfo.getClass();
                topicInfo.setSportId(strA);
                topicInfo.setProductId(tva.a);
                topicInfo.setMarketId(regularMarketRule.a);
                return Unit.a;
            }
        });
        Map<Topic, Subscriber> map = this.d;
        map.getClass();
        map.put(new GroupTopic(strGenerateTopicString), this.f);
        Map<Topic, Subscriber> map2 = this.d;
        map2.getClass();
        map2.put(new GroupTopic(strGenerateTopicString2), this.e);
        Map<Topic, Subscriber> map3 = this.d;
        map3.getClass();
        map3.put(new GroupTopic(strGenerateTopicString3), this.e);
        if (this.c.a(me1.b)) {
            String id = mfb0Var.getId();
            id.getClass();
            s22 s22Var = this.e;
            Map<Topic, Subscriber> map4 = this.d;
            List<String> listA = this.b.a(id);
            ArrayList arrayList = new ArrayList();
            for (Object obj : listA) {
                String str = (String) obj;
                RegularMarketRule regularMarketRule2 = this.C;
                if (!Intrinsics.g(str, regularMarketRule2 != null ? regularMarketRule2.a : null)) {
                    arrayList.add(obj);
                }
            }
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj2 = arrayList.get(i);
                i++;
                final String str2 = (String) obj2;
                final String strA2 = sa8.a(id);
                String strGenerateTopicString4 = TopicInfoKt.generateTopicString(TopicType.MARKET_STATUS, new Function1() { // from class: q22
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj3) {
                        TopicInfo topicInfo = (TopicInfo) obj3;
                        topicInfo.getClass();
                        topicInfo.setSportId(strA2);
                        topicInfo.setProductId(tva.a);
                        topicInfo.setMarketId(str2);
                        return Unit.a;
                    }
                });
                String strGenerateTopicString5 = TopicInfoKt.generateTopicString(TopicType.MARKET_ODDS, new Function1() { // from class: r22
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj3) {
                        TopicInfo topicInfo = (TopicInfo) obj3;
                        topicInfo.getClass();
                        topicInfo.setSportId(strA2);
                        topicInfo.setProductId(tva.a);
                        topicInfo.setMarketId(str2);
                        return Unit.a;
                    }
                });
                map4.getClass();
                map4.put(new GroupTopic(strGenerateTopicString4), s22Var);
                map4.put(new GroupTopic(strGenerateTopicString5), s22Var);
                itf0.a aVar = itf0.a;
                StringBuilder sbA = ce7.a(aVar, MyLog.TAG_LIVE_PAGE, "Subscribed to dynamic market ", str2, " for sport ");
                sbA.append(id);
                aVar.a(sbA.toString(), new Object[0]);
            }
        }
        itf0.a aVar2 = itf0.a;
        aVar2.q(MyLog.TAG_LIVE_PAGE);
        aVar2.a("subscribeAllTopics [" + this.d.size() + "] " + this.d.keySet(), new Object[0]);
        Map<Topic, Subscriber> map5 = this.d;
        map5.getClass();
        synchronized (map5) {
            try {
                Map<Topic, Subscriber> map6 = this.d;
                map6.getClass();
                for (Map.Entry<Topic, Subscriber> entry : map6.entrySet()) {
                    SocketPushManager.getInstance().subscribeTopic(entry.getKey(), entry.getValue());
                }
                Unit unit = Unit.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void x1() throws Throwable {
        this.i.h();
        this.w.h();
    }

    public abstract lyh<BaseResponse<BoostInfo>> y1();
}
