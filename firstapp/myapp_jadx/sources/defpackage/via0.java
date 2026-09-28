package defpackage;

import com.sporty.android.common.network.data.SprThrowable;
import com.sporty.android.core.model.tracking.AnalyticsEvent;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lvia0;", "Lj8i0;", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class via0 extends j8i0 {
    public final h530 a;
    public final rdd0 b;
    public final iym c;
    public final y8j d;
    public final ip0 e;
    public final t190 f;
    public final ku90<dha0> i;
    public final t340 v;
    public x190 w;

    public via0(h530 h530Var, rdd0 rdd0Var, iym iymVar, y8j y8jVar, ip0 ip0Var, t190 t190Var) {
        h530Var.getClass();
        rdd0Var.getClass();
        iymVar.getClass();
        y8jVar.getClass();
        this.a = h530Var;
        this.b = rdd0Var;
        this.c = iymVar;
        this.d = y8jVar;
        this.e = ip0Var;
        this.f = t190Var;
        ku90<dha0> ku90Var = new ku90<>();
        this.i = ku90Var;
        this.v = e1i.a(ku90Var);
    }

    public final void A1(String str) {
        x190 x190Var = this.w;
        if (Intrinsics.g(x190Var != null ? x190Var.e : null, "share-loyalty-reward")) {
            this.b.a(new w430.c(str), k00.a, k00.b, k00.c);
        }
    }

    public final e190 x1() {
        x190 x190Var = this.w;
        if (x190Var == null) {
            return e190.c;
        }
        if (Intrinsics.g(x190Var.e, "share-loyalty-reward") || x190Var.l == q190.b) {
            return e190.d;
        }
        String str = x190Var.c;
        if (str == null || str.length() == 0) {
            return e190.e;
        }
        if (x190Var.j) {
            return e190.a;
        }
        return x190Var.k ? e190.b : e190.c;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object y1(aga0 aga0Var, x1b x1bVar) {
        uia0 uia0Var;
        x190 x190Var;
        aga0 aga0Var2;
        if (x1bVar instanceof uia0) {
            uia0Var = (uia0) x1bVar;
            int i = uia0Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                uia0Var.e = i - Integer.MIN_VALUE;
            } else {
                uia0Var = new uia0(this, x1bVar);
            }
        } else {
            uia0Var = new uia0(this, x1bVar);
        }
        Object objA = uia0Var.c;
        y5b y5bVar = y5b.a;
        int i2 = uia0Var.e;
        String e = "";
        try {
            if (i2 == 0) {
                uj50.b(objA);
                x190Var = this.w;
                if (x190Var != null) {
                    t190 t190Var = this.f;
                    String str = x190Var.b;
                    aga0Var2 = aga0Var;
                    uia0Var.a = aga0Var2;
                    uia0Var.b = x190Var;
                    uia0Var.e = 1;
                    objA = t190Var.a(str, uia0Var);
                    if (objA == y5bVar) {
                        return y5bVar;
                    }
                }
                return null;
            }
            if (i2 != 1) {
                if (i2 == 2) {
                    uj50.b(objA);
                    return null;
                }
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            x190Var = uia0Var.b;
            aga0 aga0Var3 = uia0Var.a;
            uj50.b(objA);
            aga0Var2 = aga0Var3;
            pvk pvkVar = (pvk) objA;
            if (pvkVar != null) {
                return new dha0.g(aga0Var2, pvkVar.a, pvkVar.b);
            }
            String str2 = x190Var.a;
            return new dha0.e(aga0Var2, str2 == null ? "" : str2, x1(), x190Var.j ? x190Var.i : null, x190Var.m, x190Var.n, x190Var.f, x190Var.g, x190Var.h, x190Var.o);
        } catch (Exception e2) {
            if (e2 instanceof SprThrowable) {
                e = ((SprThrowable) e2).getE();
            } else {
                String message = e2.getMessage();
                if (message != null) {
                    e = message;
                }
            }
            dha0.f fVar = new dha0.f(e);
            uia0Var.a = null;
            uia0Var.b = null;
            uia0Var.e = 2;
            if (this.i.a.emit(fVar, uia0Var) != y5bVar) {
                return null;
            }
        }
    }

    public final void z1(int i, long j) {
        String str;
        x190 x190Var = this.w;
        if (x190Var == null || (str = x190Var.d) == null) {
            return;
        }
        Pair pair = new Pair(AnalyticsParam.SOCIAL_SHARE_TYPE, Integer.valueOf(i));
        x190 x190Var2 = this.w;
        Pair pair2 = new Pair(AnalyticsParam.EVENT_PARAM_BOOKING_CODE, x190Var2 != null ? x190Var2.c : null);
        Pair pair3 = new Pair("from", str);
        Pair pair4 = new Pair(AnalyticsParam.SOCIAL_START_TIMESTAMP, Long.valueOf(j));
        Pair pair5 = new Pair(AnalyticsParam.SOCIAL_END_TIMESTAMP, Long.valueOf(System.currentTimeMillis()));
        x190 x190Var3 = this.w;
        String str2 = x190Var3 != null ? x190Var3.b : null;
        if (str2 == null) {
            str2 = "";
        }
        this.c.c(AnalyticsEvent.SOCIAL_GENERAL_SHARE_BET_CLICK, kpu.f(pair, pair2, pair3, pair4, pair5, new Pair(AnalyticsParam.SOCIAL_ORDER_ID, str2)), null);
    }
}
