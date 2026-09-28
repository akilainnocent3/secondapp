package defpackage;

import com.sportybet.android.instantwin.presentation.openbet.fNZf.oLsIjJCWb;
import com.sportybet.ntespm.socket.ISocketPushManager;
import com.twilio.voice.EventKeys;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
@c0d(c = "com.sportybet.plugin.realsports.viewmodel.QuickBetViewModel$reportPlaceBetFailedToFs$1", f = "QuickBetViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class vf30 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public final /* synthetic */ tf30 a;
    public final /* synthetic */ Integer b;
    public final /* synthetic */ String c;
    public final /* synthetic */ Long d;
    public final /* synthetic */ boolean e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vf30(tf30 tf30Var, Integer num, String str, Long l, boolean z, v1b<? super vf30> v1bVar) {
        super(2, v1bVar);
        this.a = tf30Var;
        this.b = num;
        this.c = str;
        this.d = l;
        this.e = z;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new vf30(this.a, this.b, this.c, this.d, this.e, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((vf30) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        tf30 tf30Var = this.a;
        ISocketPushManager iSocketPushManager = tf30Var.L;
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
        linkedHashMap.put("place_bet_timestamp", new Long(this.d.longValue()));
        if (lastDisconnectedTimestamp != null) {
            linkedHashMap.put("disconnected_socket_start_time", new Long(lastDisconnectedTimestamp.longValue()));
        }
        if (l != null) {
            linkedHashMap.put("disconnected_socket_end_time", new Long(l.longValue()));
        }
        linkedHashMap.put("selection_changed_during_place_bet", Boolean.valueOf(this.e));
        tf30Var.M.f(oLsIjJCWb.jPnMHPTCJaRTb, linkedHashMap);
        return Unit.a;
    }
}
