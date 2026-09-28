package defpackage;

import com.sporty.android.core.model.tracking.AnalyticsParam;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.collections.b;
import kotlin.jvm.internal.Intrinsics;
import ua.naiksoftware.stomp.StompClient;

/* JADX INFO: loaded from: classes8.dex */
public final class iic {
    public static ConcurrentHashMap<String, String> b;
    public static l830<f1e0> c;
    public static zd2<Boolean> d;
    public static rlr g;
    public static rlr h;
    public static x2 k;
    public static final iic a = new iic();
    public static final ConcurrentHashMap<String, r2i<f1e0>> e = new ConcurrentHashMap<>();
    public static final l830<bbs> i = new l830<>();
    public static final ssw<String> l = new ssw<>();
    public static final fk90 f = new fk90();
    public static final ua.naiksoftware.stomp.a j = new ua.naiksoftware.stomp.a(new tfc(), new xfc());

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
            gm8Var = new gm8(x2Var.b(), new zhc());
            if (gm8Var != null) {
                gm8Var.b(new hv5(new thc(), new vq4()));
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
        if (x2Var == null) {
            Intrinsics.n("connectionProvider");
            throw null;
        }
        jm8 jm8VarI = x2Var.i(f1e0Var.a(false));
        zd2<Boolean> zd2VarB = b();
        new lhc(0);
        return jm8VarI.c(new mdv(new fdy(new idy(zd2VarB, new nhc()))));
    }

    public final am8 f(String str, String str2, List list) {
        ArrayList arrayListL = b.l(new e1e0("destination", str));
        if (list != null) {
            arrayListL.addAll(list);
        }
        return e(new f1e0("SEND", arrayListL, str2));
    }

    public final r2i<f1e0> h(final String str) {
        ConcurrentHashMap<String, r2i<f1e0>> concurrentHashMap = e;
        if (!concurrentHashMap.containsKey(str)) {
            concurrentHashMap.put(str, new zl8(new bm8(new Callable() { // from class: tgc
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    iic iicVar = iic.a;
                    String string = UUID.randomUUID().toString();
                    string.getClass();
                    ConcurrentHashMap<String, String> concurrentHashMap2 = iic.b;
                    if (concurrentHashMap2 == null) {
                        concurrentHashMap2 = new ConcurrentHashMap<>();
                        iic.b = concurrentHashMap2;
                    }
                    String str2 = str;
                    if (concurrentHashMap2.containsKey(str2)) {
                        hm8 hm8Var = hm8.a;
                        hm8Var.getClass();
                        return hm8Var;
                    }
                    ConcurrentHashMap<String, String> concurrentHashMap3 = iic.b;
                    concurrentHashMap3.getClass();
                    concurrentHashMap3.put(str2, string);
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(new e1e0(AnalyticsParam.EVENT_PARAM_ID, string));
                    arrayList.add(new e1e0("destination", str2));
                    arrayList.add(new e1e0("ack", StompClient.DEFAULT_ACK));
                    return new om8(iicVar.e(new f1e0("SUBSCRIBE", arrayList, null)), new rhc(new phc(str2)));
                }
            }), new t2i(new idy(c(), new wgc(new gp3(str, 1))).i(qt1.b), new ib() { // from class: ygc
                @Override // defpackage.ib
                public final void run() {
                    iic.a.i(str).d();
                }
            }).g()));
        }
        r2i<f1e0> r2iVar = concurrentHashMap.get(str);
        r2iVar.getClass();
        return r2iVar;
    }

    public final yl8 i(String str) {
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
