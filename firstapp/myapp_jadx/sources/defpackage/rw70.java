package defpackage;

import com.google.protobuf.Reader;
import com.sportybet.ntespm.socket.SocketPushManager;
import com.sportybet.ntespm.socket.Subscriber;
import com.sportybet.ntespm.socket.Topic;
import com.sportybet.plugin.realsports.data.Event;
import com.sportybet.plugin.realsports.type.RegularMarketRule;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lrw70;", "Lj8i0;", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class rw70 extends j8i0 {
    public List<? extends Event> A;
    public final wwd0 B;
    public final wwd0 C;
    public final xhh0 a;
    public final hkf b;
    public final b390 c;
    public final b390 d;
    public final wwd0 e;
    public final v340 f;
    public final wwd0 i;
    public final v340 v;
    public final LinkedHashMap w;
    public mfb0 y;
    public RegularMarketRule z;

    public rw70(xhh0 xhh0Var, hkf hkfVar) {
        this.a = xhh0Var;
        this.b = hkfVar;
        b390 b390VarB = d390.b(Reader.READ_DONE, Reader.READ_DONE, null, 4);
        this.c = b390VarB;
        this.d = b390VarB;
        wwd0 wwd0VarA = xwd0.a(m2g.a);
        this.e = wwd0VarA;
        this.f = e1i.b(wwd0VarA);
        wwd0 wwd0VarA2 = xwd0.a(new gw70(0));
        this.i = wwd0VarA2;
        this.v = e1i.b(wwd0VarA2);
        this.w = new LinkedHashMap();
        this.B = xwd0.a(avy.c);
        this.C = xwd0.a(Boolean.FALSE);
    }

    public final void A1() {
        LinkedHashMap linkedHashMap = this.w;
        Map mapL = kpu.l(linkedHashMap);
        linkedHashMap.clear();
        for (Map.Entry entry : mapL.entrySet()) {
            SocketPushManager.getInstance().unsubscribeTopic((Topic) entry.getKey(), (Subscriber) entry.getValue());
        }
    }

    public final void B1(RegularMarketRule regularMarketRule) {
        RegularMarketRule regularMarketRule2 = this.z;
        if (regularMarketRule2 == null) {
            return;
        }
        Iterable<RegularMarketRule> iterable = (Iterable) this.f.a.getValue();
        ArrayList arrayList = new ArrayList(l48.r(iterable, 10));
        for (RegularMarketRule regularMarketRule3 : iterable) {
            if (Intrinsics.g(regularMarketRule3.a, regularMarketRule2.a)) {
                regularMarketRule3 = regularMarketRule;
            }
            arrayList.add(regularMarketRule3);
        }
        wwd0 wwd0Var = this.e;
        wwd0Var.getClass();
        wwd0Var.k(null, arrayList);
    }

    public final void x1(RegularMarketRule regularMarketRule, boolean z) {
        List listC;
        if (this.y == null) {
            return;
        }
        this.z = regularMarketRule;
        gw70 gw70Var = (gw70) this.v.a.getValue();
        mfb0 mfb0Var = this.y;
        List<? extends Event> list = this.A;
        if (list != null) {
            listC = this.b.c(mfb0Var != null ? mfb0Var.getId() : null, regularMarketRule.a, list, true);
        } else {
            listC = null;
        }
        gw70Var.getClass();
        gw70 gw70Var2 = new gw70(mfb0Var, regularMarketRule, listC, z);
        wwd0 wwd0Var = this.i;
        wwd0Var.getClass();
        wwd0Var.k(null, gw70Var2);
    }

    public final RegularMarketRule y1(String str, RegularMarketRule regularMarketRule) {
        RegularMarketRule regularMarketRuleA;
        xhh0 xhh0Var = this.a;
        if (xhh0Var.e(regularMarketRule, str, true)) {
            RegularMarketRule regularMarketRuleB = xhh0Var.b((avy) this.B.getValue(), regularMarketRule, str, true);
            if (regularMarketRuleB != null) {
                return regularMarketRuleB;
            }
        } else {
            ckf ckfVar = ckf.c;
            String str2 = regularMarketRule.a;
            hkf hkfVar = this.b;
            hkfVar.getClass();
            if (hkfVar.a.b(ckfVar, str, str2, true) && (regularMarketRuleA = hkfVar.a(str, regularMarketRule, ((Boolean) this.C.getValue()).booleanValue(), true)) != null) {
                return regularMarketRuleA;
            }
        }
        return regularMarketRule;
    }

    public final void z1() {
        for (Map.Entry entry : kpu.l(this.w).entrySet()) {
            SocketPushManager.getInstance().subscribeTopic((Topic) entry.getKey(), (Subscriber) entry.getValue());
        }
    }
}
