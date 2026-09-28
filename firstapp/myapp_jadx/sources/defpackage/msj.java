package defpackage;

import com.sporty.android.core.model.tracking.AnalyticsParam;
import java.util.ArrayList;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;
import ua.naiksoftware.stomp.StompClient;

/* JADX INFO: loaded from: classes8.dex */
public final class msj {
    public static ConcurrentHashMap<String, String> b;
    public static l830<f1e0> c;
    public static zd2<Boolean> d;
    public static rlr g;
    public static rlr h;
    public static x2 k;
    public static final msj a = new msj();
    public static final ConcurrentHashMap<String, r2i<f1e0>> e = new ConcurrentHashMap<>();
    public static final l830<bbs> i = new l830<>();
    public static final ssw<String> l = new ssw<>();
    public static final fk90 f = new fk90();
    public static final ua.naiksoftware.stomp.a j = new ua.naiksoftware.stomp.a(new jrj(), new rrj());

    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[bbs.a.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            a = iArr;
        }
    }

    public final void a() {
        if (!d()) {
            return;
        }
        gm8 gm8Var = null;
        try {
            j.e();
            rlr rlrVar = g;
            if (rlrVar != null) {
                xse.a(rlrVar);
            }
            rlr rlrVar2 = h;
            if (rlrVar2 != null) {
                xse.a(rlrVar2);
            }
            x2 x2Var = k;
            if (x2Var == null) {
                Intrinsics.n("connectionProvider");
                throw null;
            }
            gm8Var = new gm8(x2Var.b(), new urj());
            if (gm8Var != null) {
                gm8Var.b(new hv5(new fsj(), new vq4()));
            }
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0014 A[Catch: all -> 0x0023, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0005, B:11:0x001c, B:10:0x0014), top: B:17:0x0001 }] */
    public final synchronized zd2<Boolean> b() {
        zd2<Boolean> zd2Var;
        zd2<Boolean> zd2Var2 = d;
        if (zd2Var2 == null) {
            d = zd2.j(Boolean.FALSE);
        } else {
            if (zd2Var2.a.get() == s2y.a) {
                d = zd2.j(Boolean.FALSE);
            }
        }
        zd2Var = d;
        zd2Var.getClass();
        return zd2Var;
    }

    public final synchronized l830<f1e0> c() {
        l830<f1e0> l830Var;
        try {
            l830<f1e0> l830Var2 = c;
            if (l830Var2 != null) {
                l830Var2.getClass();
                if (l830Var2.j()) {
                    c = new l830<>();
                }
            } else {
                c = new l830<>();
            }
            l830Var = c;
            l830Var.getClass();
        } catch (Throwable th) {
            throw th;
        }
        return l830Var;
    }

    public final boolean d() {
        try {
            Boolean boolK = b().k();
            if (boolK != null) {
                return boolK.booleanValue();
            }
        } catch (Exception unused) {
        }
        return false;
    }

    public final am8 e(f1e0 f1e0Var) {
        x2 x2Var = k;
        if (x2Var != null) {
            return x2Var.i(f1e0Var.a(false)).c(new mdv(new fdy(new idy(b(), new esj()))));
        }
        Intrinsics.n("connectionProvider");
        throw null;
    }

    public final r2i f(final String str, final ArrayList arrayList) {
        ConcurrentHashMap<String, r2i<f1e0>> concurrentHashMap = e;
        if (!concurrentHashMap.containsKey(str)) {
            bm8 bm8Var = new bm8(new Callable() { // from class: wrj
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    msj msjVar = msj.a;
                    String string = UUID.randomUUID().toString();
                    string.getClass();
                    ConcurrentHashMap<String, String> concurrentHashMap2 = msj.b;
                    if (concurrentHashMap2 == null) {
                        concurrentHashMap2 = new ConcurrentHashMap<>();
                        msj.b = concurrentHashMap2;
                    }
                    String str2 = str;
                    if (concurrentHashMap2.containsKey(str2)) {
                        hm8 hm8Var = hm8.a;
                        hm8Var.getClass();
                        return hm8Var;
                    }
                    ConcurrentHashMap<String, String> concurrentHashMap3 = msj.b;
                    concurrentHashMap3.getClass();
                    concurrentHashMap3.put(str2, string);
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(new e1e0(AnalyticsParam.EVENT_PARAM_ID, string));
                    arrayList2.add(new e1e0("destination", str2));
                    arrayList2.add(new e1e0("ack", StompClient.DEFAULT_ACK));
                    arrayList2.addAll(arrayList);
                    am8 am8VarE = msjVar.e(new f1e0("SUBSCRIBE", arrayList2, null));
                    final bsj bsjVar = new bsj(str2, 0);
                    return new om8(am8VarE, new pya() { // from class: csj
                        @Override // defpackage.pya
                        public final void accept(Object obj) {
                            bsjVar.invoke(obj);
                        }
                    });
                }
            });
            l830<f1e0> l830VarC = c();
            final xrj xrjVar = new xrj(str, 0);
            concurrentHashMap.put(str, new zl8(bm8Var, new t2i(new idy(l830VarC, new nm20() { // from class: yrj
                @Override // defpackage.nm20
                public final boolean test(Object obj) {
                    obj.getClass();
                    return ((Boolean) xrjVar.invoke(obj)).booleanValue();
                }
            }).i(qt1.b), new ib() { // from class: zrj
                @Override // defpackage.ib
                public final void run() {
                    msj.a.g(str).d();
                }
            }).g()));
        }
        r2i<f1e0> r2iVar = concurrentHashMap.get(str);
        r2iVar.getClass();
        return r2iVar;
    }

    public final yl8 g(String str) {
        e.remove(str);
        ConcurrentHashMap<String, String> concurrentHashMap = b;
        concurrentHashMap.getClass();
        String str2 = concurrentHashMap.get(str);
        if (str2 == null) {
            hm8 hm8Var = hm8.a;
            hm8Var.getClass();
            return hm8Var;
        }
        ConcurrentHashMap<String, String> concurrentHashMap2 = b;
        concurrentHashMap2.getClass();
        concurrentHashMap2.remove(str);
        return new nm8(e(new f1e0("UNSUBSCRIBE", kotlin.collections.a.c(new e1e0(AnalyticsParam.EVENT_PARAM_ID, str2)), null)));
    }
}
