package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import ua.naiksoftware.stomp.StompClient;

/* JADX INFO: loaded from: classes7.dex */
public final class bz00 implements pym {
    public final eal a;
    public final zxm b;
    public final ConcurrentHashMap<String, zde0<f1e0>> c;
    public final b390 d;
    public final b390 e;
    public final tuw f;
    public slr g;
    public StompClient h;

    public bz00(eal ealVar, zxm zxmVar) {
        ealVar.getClass();
        zxmVar.getClass();
        this.a = ealVar;
        this.b = zxmVar;
        this.c = new ConcurrentHashMap<>();
        pb5 pb5Var = pb5.b;
        this.d = d390.b(0, 100, pb5Var, 1);
        this.e = d390.b(0, 10, pb5Var, 1);
        this.f = uuw.a();
    }

    @Override // defpackage.pym
    public final void a() {
        slr slrVar = this.g;
        if (slrVar != null) {
            gee0.a(slrVar);
        }
        this.g = null;
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

    @Override // defpackage.pym
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
            final ty00 ty00Var = new ty00(this, str);
            yl8VarSend.b(new hv5(new pya() { // from class: uy00
                @Override // defpackage.pya
                public final void accept(Object obj) {
                    ty00Var.invoke(obj);
                }
            }, vq4Var));
        }
        return Unit.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.pym
    public final Object c(String str, int i, int i2, Map map, Map map2, x1b x1bVar) {
        yy00 yy00Var;
        tuw tuwVar;
        slr slrVar;
        r2i<bbs> r2iVarLifecycle;
        if (x1bVar instanceof yy00) {
            yy00Var = (yy00) x1bVar;
            int i3 = yy00Var.w;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                yy00Var.w = i3 - Integer.MIN_VALUE;
            } else {
                yy00Var = new yy00(this, x1bVar);
            }
        } else {
            yy00Var = new yy00(this, x1bVar);
        }
        Object obj = yy00Var.i;
        y5b y5bVar = y5b.a;
        int i4 = yy00Var.w;
        if (i4 == 0) {
            uj50.b(obj);
            yy00Var.a = str;
            yy00Var.b = map;
            yy00Var.c = map2;
            tuwVar = this.f;
            yy00Var.d = tuwVar;
            yy00Var.e = i;
            yy00Var.f = i2;
            yy00Var.w = 1;
            if (tuwVar.d(yy00Var) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i4 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i2 = yy00Var.f;
            i = yy00Var.e;
            tuw tuwVar2 = yy00Var.d;
            map2 = yy00Var.c;
            map = yy00Var.b;
            String str2 = yy00Var.a;
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
                    final e9n e9nVar = new e9n(this, 2);
                    pya pyaVar = new pya() { // from class: vy00
                        @Override // defpackage.pya
                        public final void accept(Object obj2) {
                            e9nVar.invoke(obj2);
                        }
                    };
                    final wy00 wy00Var = new wy00(this);
                    slrVar = new slr(pyaVar, new pya() { // from class: xy00
                        @Override // defpackage.pya
                        public final void accept(Object obj2) {
                            wy00Var.invoke(obj2);
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

    @Override // defpackage.pym
    public final b390 d() {
        return this.d;
    }

    @Override // defpackage.pym
    public final b390 e() {
        return this.e;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.pym
    public final Object f(x1b x1bVar) {
        az00 az00Var;
        tuw tuwVar;
        if (x1bVar instanceof az00) {
            az00Var = (az00) x1bVar;
            int i = az00Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                az00Var.d = i - Integer.MIN_VALUE;
            } else {
                az00Var = new az00(this, x1bVar);
            }
        } else {
            az00Var = new az00(this, x1bVar);
        }
        Object obj = az00Var.b;
        y5b y5bVar = y5b.a;
        int i2 = az00Var.d;
        if (i2 == 0) {
            uj50.b(obj);
            tuw tuwVar2 = this.f;
            az00Var.a = tuwVar2;
            az00Var.d = 1;
            if (tuwVar2.d(az00Var) == y5bVar) {
                return y5bVar;
            }
            tuwVar = tuwVar2;
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            tuwVar = az00Var.a;
            uj50.b(obj);
        }
        try {
            StompClient stompClient = this.h;
            return Boolean.valueOf(stompClient != null ? stompClient.isConnected() : false);
        } finally {
            tuwVar.f(null);
        }
    }

    @Override // defpackage.pym
    public final Unit g(String str, xyi0 xyi0Var, Map map) {
        r2i<f1e0> r2iVar;
        try {
            ArrayList arrayList = new ArrayList(map.size());
            for (Map.Entry entry : map.entrySet()) {
                arrayList.add(new e1e0((String) entry.getKey(), (String) entry.getValue()));
            }
            StompClient stompClient = this.h;
            if (stompClient != null && (r2iVar = stompClient.topic(str, arrayList)) != null) {
                zy00 zy00Var = new zy00(xyi0Var, this, str);
                r2iVar.c(zy00Var);
                this.c.put(UUID.randomUUID().toString(), zy00Var);
            }
        } catch (Exception e) {
            this.b.d(str, e);
        }
        return Unit.a;
    }
}
