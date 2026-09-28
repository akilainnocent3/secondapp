package defpackage;

import com.sportybet.ntespm.socket.ISocketPushManager;
import com.twilio.voice.EventKeys;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.realsports.viewmodel.BetSlipViewModel$reportPlaceBetFailedToFs$1", f = "BetSlipViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class u73 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public final /* synthetic */ q73 a;
    public final /* synthetic */ Integer b;
    public final /* synthetic */ String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u73(q73 q73Var, Integer num, String str, v1b<? super u73> v1bVar) {
        super(2, v1bVar);
        this.a = q73Var;
        this.b = num;
        this.c = str;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new u73(this.a, this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((u73) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        q73 q73Var = this.a;
        ISocketPushManager iSocketPushManager = q73Var.Z;
        Long lastConnectedTimestamp = iSocketPushManager.getLastConnectedTimestamp();
        Long lastDisconnectedTimestamp = iSocketPushManager.getLastDisconnectedTimestamp();
        Long l = null;
        if (lastConnectedTimestamp != null && lastDisconnectedTimestamp != null) {
            long jLongValue = lastDisconnectedTimestamp.longValue();
            Long l2 = new Long(lastConnectedTimestamp.longValue());
            if (l2.longValue() > jLongValue) {
                l = l2;
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Integer num = this.b;
        if (num != null) {
            linkedHashMap.put("biz_code", new Integer(num.intValue()));
        }
        String str = this.c;
        if (str != null) {
            linkedHashMap.put(EventKeys.ERROR_MESSAGE, str);
        }
        Long l3 = q73Var.K1;
        if (l3 != null) {
            linkedHashMap.put("place_bet_timestamp", new Long(l3.longValue()));
        }
        if (lastDisconnectedTimestamp != null) {
            linkedHashMap.put("disconnected_socket_start_time", new Long(lastDisconnectedTimestamp.longValue()));
        }
        if (l != null) {
            linkedHashMap.put("disconnected_socket_end_time", new Long(l.longValue()));
        }
        linkedHashMap.put("selection_changed_during_place_bet", Boolean.valueOf(q73Var.N1));
        q73Var.a0.f("PLACE_BET_FAILED", linkedHashMap);
        return Unit.a;
    }
}
