package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import ua.naiksoftware.stomp.StompClient;

/* JADX INFO: loaded from: classes8.dex */
public final class brd0 implements mzm {
    public final aym a;
    public final ConcurrentHashMap<String, zde0<f1e0>> b;
    public final b390 c;
    public final tuw d;
    public slr e;
    public StompClient f;
    public boolean g;

    public brd0(aym aymVar) {
        aymVar.getClass();
        this.a = aymVar;
        this.b = new ConcurrentHashMap<>();
        this.c = d390.b(0, 10, pb5.b, 1);
        this.d = uuw.a();
    }

    @Override // defpackage.mzm
    public final void a() {
        slr slrVar = this.e;
        if (slrVar != null) {
            gee0.a(slrVar);
        }
        this.e = null;
        ConcurrentHashMap<String, zde0<f1e0>> concurrentHashMap = this.b;
        Collection<zde0<f1e0>> collectionValues = concurrentHashMap.values();
        collectionValues.getClass();
        Iterator<T> it = collectionValues.iterator();
        while (it.hasNext()) {
            ((zde0) it.next()).onComplete();
        }
        concurrentHashMap.clear();
        StompClient stompClient = this.f;
        if (stompClient != null) {
            stompClient.disconnect();
        }
        this.f = null;
    }

    @Override // defpackage.mzm
    public final Unit b(Map map, String str, String str2) {
        yl8 yl8VarSend;
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            arrayList.add(new e1e0((String) entry.getKey(), (String) entry.getValue()));
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        arrayList2.add(new e1e0("destination", str));
        f1e0 f1e0Var = new f1e0("SEND", arrayList2, str2);
        StompClient stompClient = this.f;
        if (stompClient != null && (yl8VarSend = stompClient.send(f1e0Var)) != null) {
            vq4 vq4Var = new vq4();
            final xqd0 xqd0Var = new xqd0(this, str);
            yl8VarSend.b(new hv5(new pya() { // from class: yqd0
                @Override // defpackage.pya
                public final void accept(Object obj) {
                    xqd0Var.invoke(obj);
                }
            }, vq4Var));
        }
        return Unit.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.mzm
    public final Object c(String str, int i, int i2, Map map, Map map2, x1b x1bVar) {
        zqd0 zqd0Var;
        tuw tuwVar;
        slr slrVar;
        r2i<bbs> r2iVarLifecycle;
        if (x1bVar instanceof zqd0) {
            zqd0Var = (zqd0) x1bVar;
            int i3 = zqd0Var.w;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                zqd0Var.w = i3 - Integer.MIN_VALUE;
            } else {
                zqd0Var = new zqd0(this, x1bVar);
            }
        } else {
            zqd0Var = new zqd0(this, x1bVar);
        }
        Object obj = zqd0Var.i;
        y5b y5bVar = y5b.a;
        int i4 = zqd0Var.w;
        if (i4 == 0) {
            uj50.b(obj);
            zqd0Var.a = str;
            zqd0Var.b = map;
            zqd0Var.c = map2;
            tuwVar = this.d;
            zqd0Var.d = tuwVar;
            zqd0Var.e = i;
            zqd0Var.f = i2;
            zqd0Var.w = 1;
            if (tuwVar.d(zqd0Var) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i4 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i2 = zqd0Var.f;
            i = zqd0Var.e;
            tuw tuwVar2 = zqd0Var.d;
            map2 = zqd0Var.c;
            map = zqd0Var.b;
            String str2 = zqd0Var.a;
            uj50.b(obj);
            tuwVar = tuwVar2;
            str = str2;
        }
        try {
            if (this.f == null) {
                StompClient stompClientWithServerHeartbeat = xjo.a(str, map, null).withClientHeartbeat(i).withServerHeartbeat(i2);
                this.f = stompClientWithServerHeartbeat;
                if (stompClientWithServerHeartbeat != null) {
                    stompClientWithServerHeartbeat.setPathMatcher(new hee0(stompClientWithServerHeartbeat));
                }
                StompClient stompClient = this.f;
                if (stompClient == null || (r2iVarLifecycle = stompClient.lifecycle()) == null) {
                    slrVar = null;
                } else {
                    final uqd0 uqd0Var = new uqd0(this);
                    pya pyaVar = new pya() { // from class: vqd0
                        @Override // defpackage.pya
                        public final void accept(Object obj2) {
                            uqd0Var.invoke(obj2);
                        }
                    };
                    final cex cexVar = new cex(this, 1);
                    slrVar = new slr(pyaVar, new pya() { // from class: wqd0
                        @Override // defpackage.pya
                        public final void accept(Object obj2) {
                            cexVar.invoke(obj2);
                        }
                    }, taj.c);
                    r2iVarLifecycle.h(slrVar);
                }
                this.e = slrVar;
                StompClient stompClient2 = this.f;
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

    @Override // defpackage.mzm
    public final b390 d() {
        return this.c;
    }

    @Override // defpackage.mzm
    public final Unit e(String str, Map map) {
        r2i<f1e0> r2iVar;
        try {
            if (!this.g) {
                this.g = true;
                ArrayList arrayList = new ArrayList(map.size());
                for (Map.Entry entry : map.entrySet()) {
                    arrayList.add(new e1e0((String) entry.getKey(), (String) entry.getValue()));
                }
                StompClient stompClient = this.f;
                if (stompClient != null && (r2iVar = stompClient.topic(str, arrayList)) != null) {
                    ard0 ard0Var = new ard0(this, str);
                    r2iVar.c(ard0Var);
                    this.b.put(UUID.randomUUID().toString(), ard0Var);
                }
            }
        } catch (Exception e) {
            this.a.d(str, e);
        }
        return Unit.a;
    }
}
