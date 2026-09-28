package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.core.model.config.bo.enums.BOConfigParam;
import com.sportybet.android.bethistory.data.db.RealBetHistoryOrderDatabase;
import com.sportybet.android.bethistory.data.db.entity.RealBetHistoryOrderEntity;
import com.sportybet.android.bethistory.data.dto.RealBetHistoryOrderDto;
import com.sportybet.plugin.realsports.data.ROrder;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class o640 extends r650<Integer, a740> {
    public final q640 a;
    public final String b;
    public final Long c;
    public final h3z d;
    public final RealBetHistoryOrderDatabase e;
    public final lq1 f;
    public final p640 g;
    public final wsm h;

    public o640(q640 q640Var, String str, Long l, h3z h3zVar, RealBetHistoryOrderDatabase realBetHistoryOrderDatabase, lq1 lq1Var, p640 p640Var, wsm wsmVar) {
        q640Var.getClass();
        this.a = q640Var;
        this.b = str;
        this.c = l;
        this.d = h3zVar;
        this.e = realBetHistoryOrderDatabase;
        this.f = lq1Var;
        this.g = p640Var;
        this.h = wsmVar;
    }

    @Override // defpackage.r650
    public final r650.a a() {
        String str;
        Long l;
        p640 p640Var = this.g;
        q640 q640Var = p640Var.a;
        if (q640Var != null && (str = p640Var.d) != null && (l = p640Var.b) != null) {
            long jLongValue = l.longValue();
            if (Intrinsics.g(this.a, q640Var) && Intrinsics.g(this.b, str)) {
                Long l2 = this.c;
                if ((l2 != null ? l2.longValue() : 0L) <= jLongValue) {
                    return r650.a.b;
                }
            }
        }
        return r650.a.a;
    }

    @Override // defpackage.r650
    public final Object b(kxs kxsVar, xqz xqzVar, tje0 tje0Var) {
        int iOrdinal = kxsVar.ordinal();
        if (iOrdinal == 0) {
            return c(xqzVar, true, tje0Var);
        }
        if (iOrdinal == 1) {
            return new r650.b.C1034b(true);
        }
        if (iOrdinal == 2) {
            return c(xqzVar, false, tje0Var);
        }
        uhc.a();
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:50:0x00ca A[Catch: all -> 0x0046, TryCatch #0 {all -> 0x0046, blocks: (B:16:0x0041, B:72:0x016d, B:75:0x017b, B:80:0x0188, B:82:0x018c, B:84:0x0190, B:86:0x01a3, B:78:0x0182, B:85:0x019d, B:23:0x0055, B:68:0x0142, B:26:0x0063, B:63:0x0118, B:64:0x011c, B:29:0x0070, B:48:0x00c0, B:32:0x0077, B:35:0x007d, B:38:0x0095, B:40:0x009f, B:42:0x00a5, B:44:0x00ad, B:50:0x00ca, B:53:0x00d5, B:55:0x00f7, B:58:0x00ff, B:59:0x0103), top: B:97:0x002d }] */
    /* JADX WARN: Code duplicated, block: B:52:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:53:0x00d5 A[Catch: all -> 0x0046, TryCatch #0 {all -> 0x0046, blocks: (B:16:0x0041, B:72:0x016d, B:75:0x017b, B:80:0x0188, B:82:0x018c, B:84:0x0190, B:86:0x01a3, B:78:0x0182, B:85:0x019d, B:23:0x0055, B:68:0x0142, B:26:0x0063, B:63:0x0118, B:64:0x011c, B:29:0x0070, B:48:0x00c0, B:32:0x0077, B:35:0x007d, B:38:0x0095, B:40:0x009f, B:42:0x00a5, B:44:0x00ad, B:50:0x00ca, B:53:0x00d5, B:55:0x00f7, B:58:0x00ff, B:59:0x0103), top: B:97:0x002d }] */
    /* JADX WARN: Code duplicated, block: B:55:0x00f7 A[Catch: all -> 0x0046, TryCatch #0 {all -> 0x0046, blocks: (B:16:0x0041, B:72:0x016d, B:75:0x017b, B:80:0x0188, B:82:0x018c, B:84:0x0190, B:86:0x01a3, B:78:0x0182, B:85:0x019d, B:23:0x0055, B:68:0x0142, B:26:0x0063, B:63:0x0118, B:64:0x011c, B:29:0x0070, B:48:0x00c0, B:32:0x0077, B:35:0x007d, B:38:0x0095, B:40:0x009f, B:42:0x00a5, B:44:0x00ad, B:50:0x00ca, B:53:0x00d5, B:55:0x00f7, B:58:0x00ff, B:59:0x0103), top: B:97:0x002d }] */
    /* JADX WARN: Code duplicated, block: B:56:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:58:0x00ff A[Catch: all -> 0x0046, TryCatch #0 {all -> 0x0046, blocks: (B:16:0x0041, B:72:0x016d, B:75:0x017b, B:80:0x0188, B:82:0x018c, B:84:0x0190, B:86:0x01a3, B:78:0x0182, B:85:0x019d, B:23:0x0055, B:68:0x0142, B:26:0x0063, B:63:0x0118, B:64:0x011c, B:29:0x0070, B:48:0x00c0, B:32:0x0077, B:35:0x007d, B:38:0x0095, B:40:0x009f, B:42:0x00a5, B:44:0x00ad, B:50:0x00ca, B:53:0x00d5, B:55:0x00f7, B:58:0x00ff, B:59:0x0103), top: B:97:0x002d }] */
    /* JADX WARN: Code duplicated, block: B:61:0x0116  */
    /* JADX WARN: Code duplicated, block: B:62:0x0117  */
    /* JADX WARN: Code duplicated, block: B:71:0x016b  */
    /* JADX WARN: Code duplicated, block: B:85:0x019d A[Catch: all -> 0x0046, TryCatch #0 {all -> 0x0046, blocks: (B:16:0x0041, B:72:0x016d, B:75:0x017b, B:80:0x0188, B:82:0x018c, B:84:0x0190, B:86:0x01a3, B:78:0x0182, B:85:0x019d, B:23:0x0055, B:68:0x0142, B:26:0x0063, B:63:0x0118, B:64:0x011c, B:29:0x0070, B:48:0x00c0, B:32:0x0077, B:35:0x007d, B:38:0x0095, B:40:0x009f, B:42:0x00a5, B:44:0x00ad, B:50:0x00ca, B:53:0x00d5, B:55:0x00f7, B:58:0x00ff, B:59:0x0103), top: B:97:0x002d }] */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    /* JADX WARN: Code duplicated, block: B:91:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:95:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:98:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:53:0x00d5, please report this as an issue */
    /* JADX WARN: Type inference failed for: r2v15, types: [java.lang.Boolean, v1b] */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v26 */
    public final Object c(xqz xqzVar, boolean z, x1b x1bVar) {
        m640 m640Var;
        Object bVar;
        Throwable thA;
        Throwable thA2;
        int i;
        Set<Integer> set;
        int size;
        Object obj;
        Object objJ;
        o640 o640Var;
        o640 o640Var2;
        Object obj2;
        Boolean bool;
        Object objC;
        boolean z2;
        int i2;
        ?? r2;
        boolean zIsEmpty;
        RealBetHistoryOrderDatabase realBetHistoryOrderDatabase;
        n640 n640Var;
        boolean z3;
        o640 o640Var3;
        boolean z4 = z;
        p640 p640Var = this.g;
        if (x1bVar instanceof m640) {
            m640Var = (m640) x1bVar;
            int i3 = m640Var.v;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                m640Var.v = i3 - Integer.MIN_VALUE;
            } else {
                m640Var = new m640(this, x1bVar);
            }
        } else {
            m640Var = new m640(this, x1bVar);
        }
        m640 m640Var2 = m640Var;
        Object obj3 = m640Var2.f;
        y5b y5bVar = y5b.a;
        int i4 = m640Var2.v;
        String str = null;
        try {
            if (i4 != 0) {
                if (i4 == 1) {
                    bool = m640Var2.b;
                    uj50.b(obj3);
                    return new r650.b.C1034b(bool.booleanValue());
                }
                if (i4 == 2) {
                    int i5 = m640Var2.e;
                    boolean z5 = m640Var2.c;
                    o640 o640Var4 = m640Var2.a;
                    uj50.b(obj3);
                    i = i5;
                    z4 = z5;
                    o640Var = o640Var4;
                    objJ = obj3;
                    obj = null;
                    str = (String) objJ;
                    o640Var2 = o640Var;
                    obj2 = obj;
                } else {
                    if (i4 == 3) {
                        i2 = m640Var2.e;
                        z2 = m640Var2.c;
                        o640 o640Var5 = m640Var2.a;
                        uj50.b(obj3);
                        o640Var2 = o640Var5;
                        objC = obj3;
                        r2 = 0;
                        List<RealBetHistoryOrderDto> list = ((ROrder) n52.b((BaseResponse) objC)).entityList;
                        zIsEmpty = list.isEmpty();
                        realBetHistoryOrderDatabase = o640Var2.e;
                        n640Var = new n640(o640Var2, z2, list, r2);
                        m640Var2.a = o640Var2;
                        m640Var2.b = r2;
                        m640Var2.c = z2;
                        m640Var2.d = zIsEmpty;
                        m640Var2.e = i2;
                        m640Var2.v = 4;
                        if (qv50.b(realBetHistoryOrderDatabase, n640Var, m640Var2) != y5bVar) {
                            z3 = zIsEmpty;
                            o640Var3 = o640Var2;
                        }
                        return y5bVar;
                    }
                    if (i4 != 4) {
                        ib5.a("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z3 = m640Var2.d;
                    z2 = m640Var2.c;
                    o640Var3 = m640Var2.a;
                    uj50.b(obj3);
                }
                p640 p640Var2 = o640Var3.g;
                q640 q640Var = o640Var3.a;
                p640Var2.c = Boolean.valueOf(z3);
                if (z2 && z3) {
                    Integer num = q640Var.d;
                    z2z z2zVar = z2z.UNSETTLED;
                    if (num != null && num.intValue() == 0) {
                        bVar = new r650.b.C1034b(z3);
                    } else if (q640Var.a == null && q640Var.b == null) {
                        bVar = new r650.b.a(new wmy("Older tickets are not shown."));
                    } else {
                        bVar = new r650.b.C1034b(z3);
                    }
                } else {
                    bVar = new r650.b.C1034b(z3);
                }
                zi50.a aVar = zi50.b;
                thA = zi50.a(bVar);
                if (thA != null) {
                    this.h.g("Caught exception in RealBetHistoryOrderPagingMediator.fetchRemote", "", thA, m2g.a);
                }
                thA2 = zi50.a(bVar);
                if (thA2 == null) {
                    return bVar;
                }
                return new r650.b.a(thA2);
            }
            uj50.b(obj3);
            zi50.a aVar2 = zi50.b;
            q640 q640Var2 = this.a;
            if (z4) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                Long l = p640Var.b;
                Boolean bool2 = p640Var.c;
                long jF = qq1.f(this.f, BOConfigParam.BetHistoryRefreshDebounceMs);
                q640 q640Var3 = p640Var.a;
                String str2 = p640Var.d;
                if (l == null || bool2 == null || jCurrentTimeMillis - l.longValue() >= jF || !Intrinsics.g(q640Var2, q640Var3) || !Intrinsics.g(this.b, str2)) {
                    i = xqzVar.c.a;
                    if (z4) {
                        o640Var2 = this;
                        obj2 = null;
                    } else {
                        RealBetHistoryOrderEntity.a aVarA = r640.a(q640Var2);
                        x540 x540VarX = this.e.x();
                        String str3 = this.b;
                        Long l2 = aVarA.a;
                        Long l3 = aVarA.b;
                        set = aVarA.c;
                        Set<Integer> set2 = aVarA.d;
                        m640Var2.a = this;
                        m640Var2.c = z4;
                        m640Var2.e = i;
                        m640Var2.v = 2;
                        if (set != null) {
                            size = set.size();
                        } else {
                            size = 0;
                        }
                        int size2 = set2 != null ? set2.size() : 0;
                        obj = null;
                        objJ = x540VarX.j(str3, l2, l3, set, set2, size, size2, m640Var2);
                        m640Var2 = m640Var2;
                        if (objJ == y5bVar) {
                            o640Var = this;
                            str = (String) objJ;
                            o640Var2 = o640Var;
                            obj2 = obj;
                        }
                    }
                } else {
                    m640Var2.a = null;
                    m640Var2.b = bool2;
                    m640Var2.c = z4;
                    m640Var2.v = 1;
                    if (hkd.b(3000L, m640Var2) != y5bVar) {
                        bool = bool2;
                        return new r650.b.C1034b(bool.booleanValue());
                    }
                }
            } else {
                i = xqzVar.c.a;
                if (z4) {
                    o640Var2 = this;
                    obj2 = null;
                } else {
                    RealBetHistoryOrderEntity.a aVarA2 = r640.a(q640Var2);
                    x540 x540VarX2 = this.e.x();
                    String str4 = this.b;
                    Long l4 = aVarA2.a;
                    Long l5 = aVarA2.b;
                    set = aVarA2.c;
                    Set<Integer> set3 = aVarA2.d;
                    m640Var2.a = this;
                    m640Var2.c = z4;
                    m640Var2.e = i;
                    m640Var2.v = 2;
                    if (set != null) {
                        size = set.size();
                    } else {
                        size = 0;
                    }
                    if (set3 != null) {
                    }
                    obj = null;
                    objJ = x540VarX2.j(str4, l4, l5, set, set3, size, size2, m640Var2);
                    m640Var2 = m640Var2;
                    if (objJ == y5bVar) {
                        o640Var = this;
                        str = (String) objJ;
                        o640Var2 = o640Var;
                        obj2 = obj;
                    }
                }
            }
            return y5bVar;
            h3z h3zVar = o640Var2.d;
            q640 q640Var4 = o640Var2.a;
            String str5 = q640Var4.a;
            String str6 = q640Var4.b;
            Set<Integer> set4 = q640Var4.c;
            Integer num2 = q640Var4.d;
            Integer num3 = new Integer(i);
            m640Var2.a = o640Var2;
            m640Var2.c = z4;
            m640Var2.e = i;
            m640Var2.v = 3;
            objC = h3zVar.c(num2, num3, str, str5, str6, set4, m640Var2);
            if (objC != y5bVar) {
                int i6 = i;
                z2 = z4;
                i2 = i6;
                r2 = obj2;
                List<RealBetHistoryOrderDto> list2 = ((ROrder) n52.b((BaseResponse) objC)).entityList;
                zIsEmpty = list2.isEmpty();
                realBetHistoryOrderDatabase = o640Var2.e;
                n640Var = new n640(o640Var2, z2, list2, r2);
                m640Var2.a = o640Var2;
                m640Var2.b = r2;
                m640Var2.c = z2;
                m640Var2.d = zIsEmpty;
                m640Var2.e = i2;
                m640Var2.v = 4;
                if (qv50.b(realBetHistoryOrderDatabase, n640Var, m640Var2) != y5bVar) {
                    z3 = zIsEmpty;
                    o640Var3 = o640Var2;
                    p640 p640Var3 = o640Var3.g;
                    q640 q640Var5 = o640Var3.a;
                    p640Var3.c = Boolean.valueOf(z3);
                    if (z2) {
                        bVar = new r650.b.C1034b(z3);
                    } else {
                        bVar = new r650.b.C1034b(z3);
                    }
                    zi50.a aVar3 = zi50.b;
                    thA = zi50.a(bVar);
                    if (thA != null) {
                        this.h.g("Caught exception in RealBetHistoryOrderPagingMediator.fetchRemote", "", thA, m2g.a);
                    }
                    thA2 = zi50.a(bVar);
                    if (thA2 == null) {
                        return bVar;
                    }
                    return new r650.b.a(thA2);
                }
            }
            return y5bVar;
        } catch (Throwable th) {
            zi50.a aVar4 = zi50.b;
            bVar = new zi50.b(th);
        }
    }
}
