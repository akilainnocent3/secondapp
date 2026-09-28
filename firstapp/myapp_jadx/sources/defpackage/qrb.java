package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import ua.naiksoftware.stomp.StompClient;

/* JADX INFO: loaded from: classes7.dex */
public final class qrb implements usm {
    public final ConcurrentHashMap<brb, zde0<f1e0>> a = new ConcurrentHashMap<>();
    public final b390 b;
    public final b390 c;
    public final b390 d;
    public final Object e;
    public slr f;
    public rlr g;
    public volatile StompClient h;

    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[bbs.a.values().length];
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[0] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            a = iArr;
        }
    }

    public qrb() {
        pb5 pb5Var = pb5.b;
        this.b = d390.b(0, 10, pb5Var, 1);
        this.c = d390.b(0, 10, pb5Var, 1);
        this.d = d390.b(0, 10, pb5Var, 1);
        this.e = new Object();
    }

    @Override // defpackage.usm
    public final b390 a() {
        return this.c;
    }

    @Override // defpackage.usm
    public final void b(String str, Map map) {
        r2i<bbs> r2iVarLifecycle;
        map.getClass();
        synchronized (this.e) {
            try {
                if (this.h == null) {
                    slr slrVar = null;
                    this.h = xjo.a(str, map, null).withClientHeartbeat(15000).withServerHeartbeat(15000);
                    StompClient stompClient = this.h;
                    if (stompClient != null && (r2iVarLifecycle = stompClient.lifecycle()) != null) {
                        final jrb jrbVar = new jrb(this, 0);
                        pya pyaVar = new pya() { // from class: krb
                            @Override // defpackage.pya
                            public final void accept(Object obj) {
                                jrbVar.invoke(obj);
                            }
                        };
                        final lrb lrbVar = new lrb(0);
                        slr slrVar2 = new slr(pyaVar, new pya() { // from class: mrb
                            @Override // defpackage.pya
                            public final void accept(Object obj) {
                                lrbVar.invoke(obj);
                            }
                        }, taj.c);
                        r2iVarLifecycle.h(slrVar2);
                        slrVar = slrVar2;
                    }
                    this.f = slrVar;
                    StompClient stompClient2 = this.h;
                    if (stompClient2 != null) {
                        ArrayList arrayList = new ArrayList(map.size());
                        for (Map.Entry entry : map.entrySet()) {
                            arrayList.add(new e1e0((String) entry.getKey(), (String) entry.getValue()));
                        }
                        stompClient2.connect(arrayList);
                    }
                }
                Unit unit = Unit.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.usm
    public final boolean c() {
        boolean z;
        synchronized (this.e) {
            z = this.h != null;
        }
        return z;
    }

    @Override // defpackage.usm
    public final b390 d() {
        return this.b;
    }

    @Override // defpackage.usm
    public final void e() {
        synchronized (this.e) {
            try {
                Collection<zde0<f1e0>> collectionValues = this.a.values();
                collectionValues.getClass();
                Iterator<T> it = collectionValues.iterator();
                while (it.hasNext()) {
                    ((zde0) it.next()).onComplete();
                }
                this.a.clear();
                slr slrVar = this.f;
                if (slrVar != null) {
                    gee0.a(slrVar);
                }
                rlr rlrVar = this.g;
                if (rlrVar != null) {
                    xse.a(rlrVar);
                }
                StompClient stompClient = this.h;
                if (stompClient != null) {
                    stompClient.disconnect();
                }
                this.h = null;
                Unit unit = Unit.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.usm
    public final b390 f() {
        return this.d;
    }

    @Override // defpackage.usm
    public final void h(final brb brbVar, String str, String str2, Map<String, String> map) {
        yl8 yl8VarSend;
        str.getClass();
        map.getClass();
        synchronized (this.e) {
            try {
                ArrayList arrayList = new ArrayList(map.size());
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    arrayList.add(new e1e0(entry.getKey(), entry.getValue()));
                }
                List listB = y8h0.b(arrayList);
                listB.add(new e1e0("destination", str));
                f1e0 f1e0Var = new f1e0("SEND", listB, str2);
                StompClient stompClient = this.h;
                if (stompClient != null && (yl8VarSend = stompClient.send(f1e0Var)) != null) {
                    ib ibVar = new ib() { // from class: frb
                        @Override // defpackage.ib
                        public final void run() {
                            this.a.b.a(new arb(brbVar, "", 4));
                        }
                    };
                    final hrb hrbVar = new hrb();
                    yl8VarSend.b(new hv5(new pya() { // from class: irb
                        @Override // defpackage.pya
                        public final void accept(Object obj) {
                            hrbVar.invoke(obj);
                        }
                    }, ibVar));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.usm
    public final void j(brb brbVar, String str, Map<String, String> map) {
        r2i<f1e0> r2iVar;
        str.getClass();
        map.getClass();
        synchronized (this.e) {
            try {
                try {
                    if (!this.a.containsKey(brbVar)) {
                        ArrayList arrayList = new ArrayList(map.size());
                        for (Map.Entry<String, String> entry : map.entrySet()) {
                            arrayList.add(new e1e0(entry.getKey(), entry.getValue()));
                        }
                        StompClient stompClient = this.h;
                        if (stompClient != null && (r2iVar = stompClient.topic(str, arrayList)) != null) {
                            rrb rrbVar = new rrb(this, brbVar);
                            r2iVar.c(rrbVar);
                            this.a.put(brbVar, rrbVar);
                        }
                    }
                } catch (Exception e) {
                    itf0.a.a("Websocket subscription exception: " + e, new Object[0]);
                }
                Unit unit = Unit.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
