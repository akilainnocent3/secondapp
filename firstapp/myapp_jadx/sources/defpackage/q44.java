package defpackage;

import j$.time.LocalDate;
import j$.time.chrono.ChronoLocalDate;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lq44;", "Lj8i0;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class q44 extends j8i0 {
    public final t3k a;
    public final jv0 b;
    public final z14 c;
    public final rdd0 d;
    public final c34 e;
    public final Boolean f;
    public final wwd0 i;
    public final v340 v;
    public int w;
    public jvd0 y;
    public jvd0 z;

    @c0d(c = "com.sportybet.feature.loyalty.impl.bettingstreak.presentation.main.BettingStreakViewModel", f = "BettingStreakViewModel.kt", l = {359, 366}, m = "refreshMissions", v = 2)
    public static final class a extends x1b {
        public lk50 a;
        public ztw b;
        public Object c;
        public k44 d;
        public /* synthetic */ Object e;
        public int i;

        public a(v1b<? super a> v1bVar) {
            super(v1bVar);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            this.e = obj;
            this.i |= Integer.MIN_VALUE;
            return q44.this.y1(this);
        }
    }

    public q44(t3k t3kVar, jv0 jv0Var, z14 z14Var, rdd0 rdd0Var, c34 c34Var, vu60 vu60Var) {
        z14Var.getClass();
        rdd0Var.getClass();
        c34Var.getClass();
        vu60Var.getClass();
        this.a = t3kVar;
        this.b = jv0Var;
        this.c = z14Var;
        this.d = rdd0Var;
        this.e = c34Var;
        o2g o2gVar = o2g.a;
        o2gVar.getClass();
        this.f = ((e04) fnf.a(vu60Var, jq40.a(e04.class), o2gVar)).a;
        wwd0 wwd0VarA = xwd0.a(new k44(0));
        this.i = wwd0VarA;
        this.v = e1i.b(wwd0VarA);
        ej5.c(o8i0.d(this), null, null, new n44(this, false, null), 3);
        ej5.c(o8i0.d(this), null, null, new o44(this, null), 3);
    }

    public final boolean x1(List<r7e0> list) {
        r7e0 r7e0Var = (r7e0) CollectionsKt.V(this.w, list);
        if (r7e0Var != null && this.w < list.size() - 1) {
            ChronoLocalDate chronoLocalDateNow = LocalDate.now();
            LocalDate localDate = r7e0Var.b;
            LocalDate localDate2 = r7e0Var.c;
            chronoLocalDateNow.getClass();
            if ((chronoLocalDateNow.compareTo((ChronoLocalDate) localDate) < 0 || chronoLocalDateNow.compareTo((ChronoLocalDate) localDate2) > 0) && !localDate.isAfter(chronoLocalDateNow)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004e, code lost:
    
        if (r15 == r1) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00b2, code lost:
    
        if (r4.g(r0, r2) != false) goto L44;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x006a -> B:33:0x00ae). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x0091 -> B:32:0x0097). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object y1(defpackage.v1b<? super kotlin.Unit> r15) {
        /*
            Method dump skipped, instruction units count: 230
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q44.y1(v1b):java.lang.Object");
    }

    public final void z1(m4e0.c cVar) {
        s7e0 s7e0VarE;
        wwd0 wwd0Var;
        Object value;
        n7e0 n7e0Var = cVar.a;
        r7e0 r7e0Var = (r7e0) CollectionsKt.V(this.w, n7e0Var.p);
        n7e0 n7e0Var2 = cVar.a;
        if (r7e0Var != null) {
            this.c.getClass();
            s7e0VarE = z14.e(r7e0Var);
        } else {
            s7e0VarE = null;
        }
        n7e0 n7e0VarA = n7e0.a(n7e0Var2, false, null, null, null, null, null, false, false, s7e0VarE, this.w > 0, x1(n7e0Var.p), 2359295);
        do {
            wwd0Var = this.i;
            value = wwd0Var.getValue();
        } while (!wwd0Var.g(value, k44.a((k44) value, new m4e0.c(n7e0VarA), null, null, null, null, 30)));
    }
}
