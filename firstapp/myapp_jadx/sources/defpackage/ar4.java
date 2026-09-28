package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import ua.naiksoftware.stomp.StompClient;

/* JADX INFO: loaded from: classes7.dex */
public final class ar4 implements urm {
    public final eal a;
    public final bym b;
    public final ConcurrentHashMap<String, zde0<f1e0>> c;
    public final LinkedHashSet d;
    public final b390 e;
    public final tuw f;
    public slr g;
    public StompClient h;

    public ar4(eal ealVar, bym bymVar) {
        ealVar.getClass();
        bymVar.getClass();
        this.a = ealVar;
        this.b = bymVar;
        this.c = new ConcurrentHashMap<>();
        this.d = new LinkedHashSet();
        this.e = d390.b(0, 10, pb5.b, 1);
        this.f = uuw.a();
    }

    @Override // defpackage.urm
    public final void a() {
        slr slrVar = this.g;
        if (slrVar != null) {
            gee0.a(slrVar);
        }
        this.g = null;
        this.d.clear();
        ConcurrentHashMap<String, zde0<f1e0>> concurrentHashMap = this.c;
        Collection<zde0<f1e0>> collectionValues = concurrentHashMap.values();
        collectionValues.getClass();
        Iterator<T> it = collectionValues.iterator();
        while (it.hasNext()) {
            ((zde0) it.next()).onComplete();
        }
        concurrentHashMap.clear();
        StompClient stompClient = this.h;
        if (stompClient != null) {
            stompClient.disconnect();
        }
        this.h = null;
    }

    @Override // defpackage.urm
    public final Unit b(Map map, String str, String str2) {
        yl8 yl8VarSend;
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            arrayList.add(new e1e0((String) entry.getKey(), (String) entry.getValue()));
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        arrayList2.add(new e1e0("destination", str));
        f1e0 f1e0Var = new f1e0("SEND", arrayList2, str2);
        StompClient stompClient = this.h;
        if (stompClient != null && (yl8VarSend = stompClient.send(f1e0Var)) != null) {
            vq4 vq4Var = new vq4();
            final wq4 wq4Var = new wq4(this, str);
            yl8VarSend.b(new hv5(new pya() { // from class: xq4
                @Override // defpackage.pya
                public final void accept(Object obj) {
                    wq4Var.invoke(obj);
                }
            }, vq4Var));
        }
        return Unit.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.urm
    public final Object c(String str, int i, int i2, Map map, Map map2, x1b x1bVar) {
        yq4 yq4Var;
        tuw tuwVar;
        slr slrVar;
        r2i<bbs> r2iVarLifecycle;
        if (x1bVar instanceof yq4) {
            yq4Var = (yq4) x1bVar;
            int i3 = yq4Var.w;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                yq4Var.w = i3 - Integer.MIN_VALUE;
            } else {
                yq4Var = new yq4(this, x1bVar);
            }
        } else {
            yq4Var = new yq4(this, x1bVar);
        }
        Object obj = yq4Var.i;
        y5b y5bVar = y5b.a;
        int i4 = yq4Var.w;
        if (i4 == 0) {
            uj50.b(obj);
            yq4Var.a = str;
            yq4Var.b = map;
            yq4Var.c = map2;
            tuwVar = this.f;
            yq4Var.d = tuwVar;
            yq4Var.e = i;
            yq4Var.f = i2;
            yq4Var.w = 1;
            if (tuwVar.d(yq4Var) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i4 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i2 = yq4Var.f;
            i = yq4Var.e;
            tuw tuwVar2 = yq4Var.d;
            map2 = yq4Var.c;
            map = yq4Var.b;
            String str2 = yq4Var.a;
            uj50.b(obj);
            tuwVar = tuwVar2;
            str = str2;
        }
        try {
            if (this.h == null) {
                StompClient stompClientWithServerHeartbeat = xjo.a(str, map, null).withClientHeartbeat(i).withServerHeartbeat(i2);
                this.h = stompClientWithServerHeartbeat;
                if (stompClientWithServerHeartbeat != null) {
                    stompClientWithServerHeartbeat.setPathMatcher(new hee0(stompClientWithServerHeartbeat));
                }
                StompClient stompClient = this.h;
                if (stompClient == null || (r2iVarLifecycle = stompClient.lifecycle()) == null) {
                    slrVar = null;
                } else {
                    int i5 = 0;
                    final rq4 rq4Var = new rq4(this, i5);
                    pya pyaVar = new pya() { // from class: sq4
                        @Override // defpackage.pya
                        public final void accept(Object obj2) {
                            rq4Var.invoke(obj2);
                        }
                    };
                    final tq4 tq4Var = new tq4(this, i5);
                    slrVar = new slr(pyaVar, new pya() { // from class: uq4
                        @Override // defpackage.pya
                        public final void accept(Object obj2) {
                            tq4Var.invoke(obj2);
                        }
                    }, taj.c);
                    r2iVarLifecycle.h(slrVar);
                }
                this.g = slrVar;
                StompClient stompClient2 = this.h;
                if (stompClient2 != null) {
                    ArrayList arrayList = new ArrayList(map2.size());
                    for (Map.Entry entry : map2.entrySet()) {
                        arrayList.add(new e1e0((String) entry.getKey(), (String) entry.getValue()));
                    }
                    stompClient2.connect(arrayList);
                }
            }
            Unit unit = Unit.a;
            return Unit.a;
        } finally {
            tuwVar.f(null);
        }
    }

    @Override // defpackage.urm
    public final b390 d() {
        return this.e;
    }

    @Override // defpackage.urm
    public final Unit e(List list, Map map) {
        StompClient stompClient;
        r2i<f1e0> r2iVar;
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            arrayList.add(new e1e0((String) entry.getKey(), (String) entry.getValue()));
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            try {
                if (this.d.add(str) && (stompClient = this.h) != null && (r2iVar = stompClient.topic(str, arrayList)) != null) {
                    zq4 zq4Var = new zq4(this, str);
                    r2iVar.c(zq4Var);
                    this.c.put(UUID.randomUUID().toString(), zq4Var);
                }
            } catch (Exception e) {
                this.b.d(str, e);
            }
        }
        return Unit.a;
    }
}
