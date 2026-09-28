package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import ua.naiksoftware.stomp.StompClient;

/* JADX INFO: loaded from: classes7.dex */
public final class sbe0 implements wzm {
    public final b390 a;
    public final b390 b;
    public final b390 c;
    public slr d;
    public rlr e;
    public final b390 f;
    public final b390 g;
    public final b390 h;
    public final ConcurrentHashMap<c, b> i;
    public final ConcurrentHashMap<c, a> j;
    public final Object k;
    public volatile boolean l;
    public volatile StompClient m;

    public static final class a {
        public final String a;
        public final slr b;

        public a(String str, slr slrVar) {
            str.getClass();
            this.a = str;
            this.b = slrVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                return Intrinsics.g(this.a, aVar.a) && this.b == aVar.b;
            }
            return false;
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "ActiveTopicSubscription(destinationPath=" + this.a + ", disposable=" + this.b + ')';
        }
    }

    public static final class b {
        public final String a;
        public final Map<String, String> b;

        public b(String str, Map<String, String> map) {
            str.getClass();
            map.getClass();
            this.a = str;
            this.b = map;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Intrinsics.g(this.a, bVar.a) && Intrinsics.g(this.b, bVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "PendingTopicSubscription(destinationPath=" + this.a + ", headersMap=" + this.b + ')';
        }
    }

    public static final class c {
        public final jgg0 a;
        public final String b;

        public c(jgg0 jgg0Var, String str) {
            str.getClass();
            this.a = jgg0Var;
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.a == cVar.a && Intrinsics.g(this.b, cVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("TopicSubscriptionKey(topicType=");
            sb.append(this.a);
            sb.append(", destinationPath=");
            return j26.a(sb, this.b, ')');
        }
    }

    public static final /* synthetic */ class d {
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

    public sbe0() {
        b390 b390VarB = d390.b(0, 64, null, 5);
        this.a = b390VarB;
        b390 b390VarB2 = d390.b(0, 64, null, 5);
        this.b = b390VarB2;
        b390 b390VarB3 = d390.b(0, 64, null, 5);
        this.c = b390VarB3;
        this.f = b390VarB;
        this.g = b390VarB2;
        this.h = b390VarB3;
        this.i = new ConcurrentHashMap<>();
        this.j = new ConcurrentHashMap<>();
        this.k = new Object();
    }

    @Override // defpackage.wzm
    public final b390 a() {
        return this.h;
    }

    @Override // defpackage.wzm
    public final void b(String str, Map map) {
        map.getClass();
        synchronized (this.k) {
            try {
                if (this.m == null) {
                    this.m = xjo.a(str, map, null).withClientHeartbeat(15000).withServerHeartbeat(15000);
                    l();
                }
                StompClient stompClient = this.m;
                if (stompClient != null) {
                    ArrayList arrayList = new ArrayList(map.size());
                    for (Map.Entry entry : map.entrySet()) {
                        arrayList.add(new e1e0((String) entry.getKey(), (String) entry.getValue()));
                    }
                    stompClient.connect(arrayList);
                    Unit unit = Unit.a;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.wzm
    public final boolean c() {
        return this.l;
    }

    @Override // defpackage.wzm
    public final b390 d() {
        return this.g;
    }

    @Override // defpackage.wzm
    public final void e() {
        synchronized (this.k) {
            try {
                this.l = false;
                k();
                this.i.clear();
                slr slrVar = this.d;
                if (slrVar != null) {
                    gee0.a(slrVar);
                }
                this.d = null;
                rlr rlrVar = this.e;
                if (rlrVar != null) {
                    xse.a(rlrVar);
                }
                this.e = null;
                StompClient stompClient = this.m;
                if (stompClient != null) {
                    stompClient.disconnect();
                }
                this.m = null;
                Unit unit = Unit.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.wzm
    public final b390 f() {
        return this.f;
    }

    @Override // defpackage.wzm
    public final void h(jgg0 jgg0Var, String str, Map<String, String> map) {
        str.getClass();
        map.getClass();
        synchronized (this.k) {
            try {
                c cVar = new c(jgg0Var, str);
                this.i.put(cVar, new b(str, map));
                if (this.l) {
                    j(cVar);
                }
                Unit unit = Unit.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.wzm
    public final void i(String str, Map map) {
        yl8 yl8VarSend;
        jgg0 jgg0Var = jgg0.a;
        map.getClass();
        synchronized (this.k) {
            if (this.l) {
                StompClient stompClient = this.m;
                if (stompClient != null && (yl8VarSend = stompClient.send("/queue/tournament/user-rank", str)) != null) {
                    yl8VarSend.f(wm70.c).b(new hv5(new nve(), new vq4()));
                }
            }
        }
    }

    public final void j(c cVar) {
        slr slrVar;
        b bVar = this.i.get(cVar);
        if (bVar == null) {
            return;
        }
        a aVar = this.j.get(cVar);
        if (aVar != null) {
            this.j.remove(cVar);
            gee0.a(aVar.b);
        }
        StompClient stompClient = this.m;
        if (stompClient == null) {
            return;
        }
        try {
            Map<String, String> map = bVar.b;
            ArrayList arrayList = new ArrayList(map.size());
            for (Map.Entry<String, String> entry : map.entrySet()) {
                arrayList.add(new e1e0(entry.getKey(), entry.getValue()));
            }
            boolean zIsEmpty = arrayList.isEmpty();
            String str = bVar.a;
            r2i<f1e0> r2iVar = zIsEmpty ? stompClient.topic(str) : stompClient.topic(str, arrayList);
            if (r2iVar != null) {
                m3i m3iVarJ = r2iVar.j(wm70.c);
                final lbe0 lbe0Var = new lbe0(this, cVar);
                pya pyaVar = new pya() { // from class: mbe0
                    @Override // defpackage.pya
                    public final void accept(Object obj) {
                        lbe0Var.invoke(obj);
                    }
                };
                final nbe0 nbe0Var = new nbe0(this, cVar);
                slrVar = new slr(pyaVar, new pya() { // from class: obe0
                    @Override // defpackage.pya
                    public final void accept(Object obj) {
                        nbe0Var.invoke(obj);
                    }
                }, taj.c);
                m3iVarJ.h(slrVar);
            } else {
                slrVar = null;
            }
            if (slrVar == null) {
                return;
            }
            this.j.put(cVar, new a(bVar.a, slrVar));
        } catch (Exception unused) {
        }
    }

    public final void k() {
        ConcurrentHashMap<c, a> concurrentHashMap = this.j;
        Collection<a> collectionValues = concurrentHashMap.values();
        collectionValues.getClass();
        Iterator<T> it = collectionValues.iterator();
        while (it.hasNext()) {
            gee0.a(((a) it.next()).b);
        }
        concurrentHashMap.clear();
    }

    public final void l() {
        slr slrVar;
        r2i<bbs> r2iVarLifecycle;
        slr slrVar2 = this.d;
        if (slrVar2 != null) {
            gee0.a(slrVar2);
        }
        StompClient stompClient = this.m;
        if (stompClient == null || (r2iVarLifecycle = stompClient.lifecycle()) == null) {
            slrVar = null;
        } else {
            final xha xhaVar = new xha(this, 1);
            slrVar = new slr(new pya() { // from class: pbe0
                @Override // defpackage.pya
                public final void accept(Object obj) {
                    xhaVar.invoke(obj);
                }
            }, new rbe0(), taj.c);
            r2iVarLifecycle.h(slrVar);
        }
        this.d = slrVar;
    }
}
