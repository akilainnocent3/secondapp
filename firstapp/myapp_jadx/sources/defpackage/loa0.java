package defpackage;

import com.sporty.android.core.model.tracking.AnalyticsEvent;
import com.sportygames.commons.SportyGamesManager;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.c;

/* JADX INFO: loaded from: classes7.dex */
public class loa0 extends j8i0 {
    public final ssw<String> A;
    public final ssw<String> B;
    public final ssw<String> C;
    public final ssw<Boolean> D;
    public final ssw<String> E;
    public final ssw<String> F;
    public final ssw<String> G;
    public final ssw<String> H;
    public final ssw<String> I;
    public final ssw J;
    public final ConcurrentHashMap<String, Boolean> K;
    public final ConcurrentHashMap<String, Boolean> L;
    public final ConcurrentHashMap<String, Boolean> M;
    public final g0n a;
    public final usm b;
    public final tzm c;
    public jvd0 d;
    public jvd0 e;
    public jvd0 f;
    public final ssw<String> i;
    public final ssw<String> v;
    public final ssw<String> w;
    public final ssw<String> y;
    public final ssw<String> z;

    public loa0(g0n g0nVar, usm usmVar, tzm tzmVar) {
        g0nVar.getClass();
        usmVar.getClass();
        tzmVar.getClass();
        this.a = g0nVar;
        this.b = usmVar;
        this.c = tzmVar;
        this.i = new ssw<>();
        this.v = new ssw<>();
        this.w = new ssw<>();
        this.y = new ssw<>();
        this.z = new ssw<>();
        this.A = new ssw<>();
        this.B = new ssw<>();
        this.C = new ssw<>();
        this.D = new ssw<>();
        this.E = new ssw<>();
        this.F = new ssw<>();
        this.G = new ssw<>();
        this.H = new ssw<>();
        ssw<String> sswVar = new ssw<>();
        this.I = sswVar;
        this.J = sswVar;
        this.K = new ConcurrentHashMap<>();
        this.L = new ConcurrentHashMap<>();
        this.M = new ConcurrentHashMap<>();
    }

    public static String E1(long j, String str) {
        return str + "_" + j;
    }

    public final void A1(long j, String str) {
        str.getClass();
        this.L.put(E1(j, str), Boolean.TRUE);
    }

    public void B1(arb arbVar) {
        brb brbVar = arbVar.a;
        brb brbVar2 = brb.a;
        ssw<String> sswVar = this.v;
        if (brbVar == brbVar2) {
            sswVar.j("multiplier_error");
        } else {
            sswVar.j(AnalyticsEvent.BI_TRACKING_KIND_ERROR);
        }
    }

    public void C1(arb arbVar) {
        brb brbVar = arbVar.a;
        String str = arbVar.b;
        int iOrdinal = brbVar.ordinal();
        ssw<Boolean> sswVar = this.D;
        switch (iOrdinal) {
            case 0:
                this.v.j("messageReceived");
                this.i.j(str);
                break;
            case 1:
                this.w.m(str);
                break;
            case 2:
                this.A.j(str);
                break;
            case 3:
                this.y.j(str);
                break;
            case 4:
                this.B.j(str);
                break;
            case 5:
                this.z.m(str);
                break;
            case 6:
                this.C.j(str);
                break;
            case 7:
                sswVar.j(Boolean.TRUE);
                break;
            case 8:
                sswVar.j(Boolean.TRUE);
                break;
            default:
                switch (iOrdinal) {
                    case 16:
                        this.E.j(str);
                        break;
                    case 17:
                        this.F.j(str);
                        break;
                    case 18:
                        this.G.j(str);
                        break;
                }
                break;
        }
    }

    public final boolean D1() {
        return SportyGamesManager.getInstance().getUser() == null;
    }

    public final void F1() {
        this.v.j("go_to_login");
    }

    public final void G1(int i, String str, String str2, Function0 function0) {
        str2.getClass();
        if (D1()) {
            F1();
            return;
        }
        long j = i;
        String strE1 = E1(j, str2);
        ConcurrentHashMap<String, Boolean> concurrentHashMap = this.M;
        Boolean bool = concurrentHashMap.get(strE1);
        Boolean bool2 = Boolean.TRUE;
        if (Intrinsics.g(bool, bool2)) {
            function0.invoke();
            return;
        }
        brb brbVar = brb.z;
        this.b.h(brbVar, tzm.a(this.c, brbVar, null, 6), str, this.a.c());
        concurrentHashMap.put(E1(j, str2), bool2);
    }

    public final boolean H1(long j, String str, String str2, Function0 function0) {
        str2.getClass();
        if (Intrinsics.g(this.L.get(E1(j, str2)), Boolean.TRUE)) {
            function0.invoke();
            return false;
        }
        brb brbVar = brb.v;
        usm.g(this.b, brbVar, tzm.a(this.c, brbVar, null, 6), str);
        A1(j, str2);
        return true;
    }

    public final boolean I1(int i, String str, String str2, Function0 function0) {
        str2.getClass();
        if (D1()) {
            F1();
            return false;
        }
        long j = i;
        String strE1 = E1(j, str2);
        ConcurrentHashMap<String, Boolean> concurrentHashMap = this.K;
        Boolean bool = concurrentHashMap.get(strE1);
        Boolean bool2 = Boolean.TRUE;
        if (Intrinsics.g(bool, bool2)) {
            function0.invoke();
            return false;
        }
        brb brbVar = brb.w;
        this.b.h(brbVar, tzm.a(this.c, brbVar, null, 6), str, this.a.c());
        concurrentHashMap.put(E1(j, str2), bool2);
        return true;
    }

    public final void x1() {
        jvd0 jvd0Var = this.d;
        if (jvd0Var != null) {
            jvd0Var.cancel((CancellationException) null);
        }
        this.d = null;
        jvd0 jvd0Var2 = this.e;
        if (jvd0Var2 != null) {
            jvd0Var2.cancel((CancellationException) null);
        }
        this.e = null;
        jvd0 jvd0Var3 = this.f;
        if (jvd0Var3 != null) {
            jvd0Var3.cancel((CancellationException) null);
        }
        this.f = null;
    }

    public final void y1(String str) {
        str.getClass();
        Set<String> setKeySet = this.K.keySet();
        setKeySet.getClass();
        Iterator<T> it = setKeySet.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            str2.getClass();
            if (!c.u(str2, str, false)) {
                it.remove();
            }
        }
        Set<String> setKeySet2 = this.L.keySet();
        setKeySet2.getClass();
        Iterator<T> it2 = setKeySet2.iterator();
        while (it2.hasNext()) {
            String str3 = (String) it2.next();
            str3.getClass();
            if (!c.u(str3, str, false)) {
                it2.remove();
            }
        }
        Set<String> setKeySet3 = this.M.keySet();
        setKeySet3.getClass();
        Iterator<T> it3 = setKeySet3.iterator();
        while (it3.hasNext()) {
            String str4 = (String) it3.next();
            str4.getClass();
            if (!c.u(str4, str, false)) {
                it3.remove();
            }
        }
    }

    public final void z1(String str, String str2) {
        str.getClass();
        str2.getClass();
        brb brbVar = brb.i;
        usm.i(this.b, brbVar, this.c.b(brbVar, str2, str));
    }
}
