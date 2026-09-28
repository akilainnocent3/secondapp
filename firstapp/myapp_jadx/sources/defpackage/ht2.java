package defpackage;

import com.appsflyer.internal.y;
import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.core.model.orders.DeleteRealBetHistoryOrdersRequest;
import com.sportybet.android.bethistory.data.db.RealBetHistoryOrderDatabase;
import com.sportybet.android.bethistory.data.db.entity.RealBetHistoryOrderEntity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes5.dex */
public final class ht2 implements at2 {
    public final lq1 a;
    public final RealBetHistoryOrderDatabase b;
    public final g3z c;
    public final h3z d;
    public final wsm e;
    public final uqm f;
    public final jq2 g;
    public List<RealBetHistoryOrderEntity> h;
    public final p640 i = new p640();
    public Long j;

    public ht2(lq1 lq1Var, RealBetHistoryOrderDatabase realBetHistoryOrderDatabase, g3z g3zVar, h3z h3zVar, wsm wsmVar, uqm uqmVar, jq2 jq2Var) {
        this.a = lq1Var;
        this.b = realBetHistoryOrderDatabase;
        this.c = g3zVar;
        this.d = h3zVar;
        this.e = wsmVar;
        this.f = uqmVar;
        this.g = jq2Var;
    }

    @Override // defpackage.at2
    public final Object a(boolean z, d740.b bVar) {
        this.i.e = z;
        return this.b.x().a(z, bVar);
    }

    @Override // defpackage.at2
    public final lyh<Boolean> b() {
        return this.b.x().b();
    }

    @Override // defpackage.at2
    public final Object c(String str, tje0 tje0Var) {
        return this.b.x().c(str, tje0Var);
    }

    @Override // defpackage.at2
    public final lyh<List<String>> d() {
        return this.b.x().d();
    }

    @Override // defpackage.at2
    public final Object e(boolean z, d740.c cVar) {
        this.i.f = z;
        return this.b.x().e(z, cVar);
    }

    @Override // defpackage.at2
    public final Object f(String str, String str2, tje0 tje0Var) {
        return this.b.x().f(str, str2, tje0Var);
    }

    @Override // defpackage.at2
    public final Object g(boolean z, tje0 tje0Var) {
        return this.b.x().g(z, tje0Var);
    }

    @Override // defpackage.at2
    public final Object h(x1b x1bVar) {
        return this.b.x().h(x1bVar);
    }

    @Override // defpackage.at2
    public final Long i() {
        return this.i.b;
    }

    @Override // defpackage.at2
    public final void j() {
        this.j = Long.valueOf(System.currentTimeMillis());
    }

    @Override // defpackage.at2
    public final lyh<kqz<a740>> k(final q640 q640Var) {
        q640Var.getClass();
        return new ymz(new joz(new Function0() { // from class: bt2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                RealBetHistoryOrderEntity.a aVarA = r640.a(q640Var);
                ht2 ht2Var = this;
                x540 x540VarX = ht2Var.b.x();
                String userId = ht2Var.f.getUserId();
                Long l = aVarA.a;
                Long l2 = aVarA.b;
                Set<Integer> set = aVarA.c;
                Set<Integer> set2 = aVarA.d;
                return x540VarX.o(userId, l, l2, set, set2, set != null ? set.size() : 0, set2 != null ? set2.size() : 0);
            }
        }, null), new iqz(10, 0, false, 10, 0, 52), new o640(q640Var, this.f.getUserId(), this.j, this.d, this.b, this.a, this.i, this.e)).e;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:34:0x00a8 A[Catch: all -> 0x0053, TryCatch #0 {all -> 0x0053, blocks: (B:18:0x004e, B:41:0x00e3, B:42:0x00e8, B:31:0x00a3, B:34:0x00a8, B:35:0x00b9, B:37:0x00bf, B:38:0x00cd), top: B:54:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x00bf A[Catch: all -> 0x0053, LOOP:0: B:35:0x00b9->B:37:0x00bf, LOOP_END, TryCatch #0 {all -> 0x0053, blocks: (B:18:0x004e, B:41:0x00e3, B:42:0x00e8, B:31:0x00a3, B:34:0x00a8, B:35:0x00b9, B:37:0x00bf, B:38:0x00cd), top: B:54:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:40:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:41:0x00e3 A[Catch: all -> 0x0053, PHI: r12 r13 r14
      0x00e3: PHI (r12v12 ??) = (r12v18 ??), (r12v19 ??) binds: [B:39:0x00e0, B:18:0x004e] A[DONT_GENERATE, DONT_INLINE]
      0x00e3: PHI (r13v12 java.util.List) = (r13v20 java.util.List), (r13v21 java.util.List) binds: [B:39:0x00e0, B:18:0x004e] A[DONT_GENERATE, DONT_INLINE]
      0x00e3: PHI (r14v16 java.lang.Object) = (r14v13 java.lang.Object), (r14v1 java.lang.Object) binds: [B:39:0x00e0, B:18:0x004e] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {all -> 0x0053, blocks: (B:18:0x004e, B:41:0x00e3, B:42:0x00e8, B:31:0x00a3, B:34:0x00a8, B:35:0x00b9, B:37:0x00bf, B:38:0x00cd), top: B:54:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x0101  */
    /* JADX WARN: Code duplicated, block: B:50:0x0116  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r12v12 */
    /* JADX WARN: Type inference failed for: r12v18 */
    /* JADX WARN: Type inference failed for: r12v19 */
    /* JADX WARN: Type inference failed for: r12v20 */
    /* JADX WARN: Type inference failed for: r12v21 */
    /* JADX WARN: Type inference failed for: r12v22 */
    /* JADX WARN: Type inference failed for: r12v23 */
    /* JADX WARN: Type inference failed for: r12v24 */
    /* JADX WARN: Type inference failed for: r12v6, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r12v9, types: [boolean] */
    /* JADX WARN: Type inference failed for: r13v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v19 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v22 */
    /* JADX WARN: Type inference failed for: r13v23 */
    /* JADX WARN: Type inference failed for: r13v25 */
    /* JADX WARN: Type inference failed for: r13v26 */
    /* JADX WARN: Type inference failed for: r13v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v7, types: [boolean] */
    /* JADX WARN: Type inference failed for: r14v15 */
    /* JADX WARN: Type inference failed for: r14v18 */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r14v5, types: [java.util.List<com.sportybet.android.bethistory.data.db.entity.RealBetHistoryOrderEntity>] */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r2v4, types: [x540] */
    @Override // defpackage.at2
    public final Object l(Iterable iterable, boolean z, x1b x1bVar) {
        ct2 ct2Var;
        ?? r14;
        ?? r13;
        Object obj;
        ?? X;
        ?? r15;
        ?? r16;
        ?? r17;
        ?? r12;
        ?? r18;
        List list;
        ArrayList arrayList;
        Iterator it;
        List list2;
        ?? r19;
        if (x1bVar instanceof ct2) {
            ct2Var = (ct2) x1bVar;
            int i = ct2Var.i;
            if ((i & Integer.MIN_VALUE) != 0) {
                ct2Var.i = i - Integer.MIN_VALUE;
            } else {
                ct2Var = new ct2(this, x1bVar);
            }
        } else {
            ct2Var = new ct2(this, x1bVar);
        }
        Object objK = ct2Var.e;
        y5b y5bVar = y5b.a;
        int i2 = ct2Var.i;
        RealBetHistoryOrderDatabase realBetHistoryOrderDatabase = this.b;
        try {
            if (i2 == 0) {
                uj50.b(objK);
                this.h = null;
                x540 x540VarX = realBetHistoryOrderDatabase.x();
                List listA0 = CollectionsKt.A0(iterable);
                ct2Var.a = (Iterable) iterable;
                ct2Var.d = z;
                ct2Var.i = 1;
                objK = x540VarX.k(listA0, ct2Var);
                if (objK != y5bVar) {
                }
                r12 = iterable;
                r17 = z;
                return y5bVar;
            }
            if (i2 == 1) {
                boolean z2 = ct2Var.d;
                Iterable iterable2 = ct2Var.a;
                uj50.b(objK);
                r12 = iterable2;
                r17 = z2;
            } else {
                if (i2 == 2) {
                    boolean z3 = ct2Var.d;
                    List list3 = ct2Var.b;
                    Iterable iterable3 = ct2Var.a;
                    uj50.b(objK);
                    r18 = z3;
                    list = list3;
                    zi50.a aVar = zi50.b;
                    if (r18 == 0) {
                        iterable = r18;
                        z = list;
                        Unit unit = Unit.a;
                        zi50.a aVar2 = zi50.b;
                        ?? r10 = z;
                        r13 = iterable;
                        obj = unit;
                        r14 = r10;
                        r16 = r14;
                        if (zi50.a(obj) != null) {
                            X = realBetHistoryOrderDatabase.x();
                            ct2Var.a = null;
                            ct2Var.b = r14;
                            ct2Var.c = obj;
                            ct2Var.d = r13;
                            ct2Var.i = 4;
                            if (X.m(r14, ct2Var) != y5bVar) {
                                r15 = r14;
                            }
                        }
                        uj50.b(obj);
                        this.h = r16;
                        return Unit.a;
                    }
                    g3z g3zVar = this.c;
                    arrayList = new ArrayList(l48.r(list, 10));
                    it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((RealBetHistoryOrderEntity) it.next()).getOrderId());
                    }
                    DeleteRealBetHistoryOrdersRequest deleteRealBetHistoryOrdersRequest = new DeleteRealBetHistoryOrdersRequest(arrayList);
                    ct2Var.a = null;
                    ct2Var.b = list;
                    ct2Var.c = null;
                    ct2Var.d = r18;
                    ct2Var.i = 3;
                    objK = g3zVar.p(deleteRealBetHistoryOrdersRequest, ct2Var);
                    r19 = r18;
                    list2 = list;
                    if (objK == y5bVar) {
                        n52.c((BaseResponse) objK);
                        iterable = r19;
                        z = list2;
                        Unit unit2 = Unit.a;
                        zi50.a aVar3 = zi50.b;
                        ?? r11 = z;
                        r13 = iterable;
                        obj = unit2;
                        r14 = r11;
                        r16 = r14;
                        if (zi50.a(obj) != null) {
                            X = realBetHistoryOrderDatabase.x();
                            ct2Var.a = null;
                            ct2Var.b = r14;
                            ct2Var.c = obj;
                            ct2Var.d = r13;
                            ct2Var.i = 4;
                            if (X.m(r14, ct2Var) != y5bVar) {
                                r15 = r14;
                            }
                        }
                        uj50.b(obj);
                        this.h = r16;
                        return Unit.a;
                    }
                    r12 = iterable;
                    r17 = z;
                    return y5bVar;
                }
                if (i2 == 3) {
                    boolean z4 = ct2Var.d;
                    List list4 = ct2Var.b;
                    Iterable iterable4 = ct2Var.a;
                    uj50.b(objK);
                    r19 = z4;
                    list2 = list4;
                    n52.c((BaseResponse) objK);
                    iterable = r19;
                    z = list2;
                    Unit unit3 = Unit.a;
                    zi50.a aVar4 = zi50.b;
                    ?? r110 = z;
                    r13 = iterable;
                    obj = unit3;
                    r14 = r110;
                    r16 = r14;
                    if (zi50.a(obj) != null) {
                        X = realBetHistoryOrderDatabase.x();
                        ct2Var.a = null;
                        ct2Var.b = r14;
                        ct2Var.c = obj;
                        ct2Var.d = r13;
                        ct2Var.i = 4;
                        if (X.m(r14, ct2Var) != y5bVar) {
                            r15 = r14;
                        }
                        r12 = iterable;
                        r17 = z;
                        return y5bVar;
                    }
                    uj50.b(obj);
                    this.h = r16;
                    return Unit.a;
                }
                if (i2 != 4) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                obj = ct2Var.c;
                List list5 = ct2Var.b;
                Iterable iterable5 = ct2Var.a;
                uj50.b(objK);
                r15 = list5;
            }
            r16 = r15;
            uj50.b(obj);
            this.h = r16;
            return Unit.a;
            r12 = iterable;
            r17 = z;
            List list6 = (List) objK;
            dt2 dt2Var = new dt2(this, r12, null);
            ct2Var.a = null;
            ct2Var.b = list6;
            ct2Var.d = r17;
            ct2Var.i = 2;
            if (qv50.b(realBetHistoryOrderDatabase, dt2Var, ct2Var) != y5bVar) {
                r18 = r17;
                list = list6;
                zi50.a aVar5 = zi50.b;
                if (r18 == 0) {
                    iterable = r18;
                    z = list;
                    Unit unit4 = Unit.a;
                    zi50.a aVar6 = zi50.b;
                    ?? r111 = z;
                    r13 = iterable;
                    obj = unit4;
                    r14 = r111;
                    r16 = r14;
                    if (zi50.a(obj) != null) {
                        X = realBetHistoryOrderDatabase.x();
                        ct2Var.a = null;
                        ct2Var.b = r14;
                        ct2Var.c = obj;
                        ct2Var.d = r13;
                        ct2Var.i = 4;
                        if (X.m(r14, ct2Var) != y5bVar) {
                            r15 = r14;
                            r16 = r15;
                        }
                    }
                    uj50.b(obj);
                    this.h = r16;
                    return Unit.a;
                }
                g3z g3zVar2 = this.c;
                arrayList = new ArrayList(l48.r(list, 10));
                it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((RealBetHistoryOrderEntity) it.next()).getOrderId());
                }
                DeleteRealBetHistoryOrdersRequest deleteRealBetHistoryOrdersRequest2 = new DeleteRealBetHistoryOrdersRequest(arrayList);
                ct2Var.a = null;
                ct2Var.b = list;
                ct2Var.c = null;
                ct2Var.d = r18;
                ct2Var.i = 3;
                objK = g3zVar2.p(deleteRealBetHistoryOrdersRequest2, ct2Var);
                r19 = r18;
                list2 = list;
                if (objK == y5bVar) {
                    n52.c((BaseResponse) objK);
                    iterable = r19;
                    z = list2;
                    Unit unit5 = Unit.a;
                    zi50.a aVar7 = zi50.b;
                    ?? r112 = z;
                    r13 = iterable;
                    obj = unit5;
                    r14 = r112;
                    r16 = r14;
                    if (zi50.a(obj) != null) {
                        X = realBetHistoryOrderDatabase.x();
                        ct2Var.a = null;
                        ct2Var.b = r14;
                        ct2Var.c = obj;
                        ct2Var.d = r13;
                        ct2Var.i = 4;
                        if (X.m(r14, ct2Var) != y5bVar) {
                            r15 = r14;
                            r16 = r15;
                        }
                    }
                    uj50.b(obj);
                    this.h = r16;
                    return Unit.a;
                }
            }
        } catch (Throwable th) {
            zi50.a aVar8 = zi50.b;
            zi50.b bVar = new zi50.b(th);
            r14 = z;
            r13 = iterable;
            obj = bVar;
        }
        r12 = iterable;
        r17 = z;
        return y5bVar;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00b3 A[Catch: all -> 0x00c1, LOOP:0: B:40:0x00ad->B:42:0x00b3, LOOP_END, TryCatch #0 {all -> 0x00c1, blocks: (B:39:0x009a, B:40:0x00ad, B:42:0x00b3, B:45:0x00c4), top: B:63:0x009a }] */
    /* JADX WARN: Code duplicated, block: B:48:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:54:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:57:0x0105  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v24 */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r12v9, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v11, types: [int] */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [int] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [int] */
    /* JADX WARN: Type inference failed for: r2v8 */
    @Override // defpackage.at2
    public final Object m(x1b x1bVar) throws Exception {
        et2 et2Var;
        List<RealBetHistoryOrderEntity> list;
        List<RealBetHistoryOrderEntity> list2;
        ?? r2;
        List<RealBetHistoryOrderEntity> list3;
        ArrayList arrayList;
        Iterator it;
        Object bVar;
        ?? r3;
        gt2 gt2Var;
        Object obj;
        if (x1bVar instanceof et2) {
            et2Var = (et2) x1bVar;
            int i = et2Var.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                et2Var.f = i - Integer.MIN_VALUE;
            } else {
                et2Var = new et2(this, x1bVar);
            }
        } else {
            et2Var = new et2(this, x1bVar);
        }
        Object objC = et2Var.d;
        y5b y5bVar = y5b.a;
        int i2 = et2Var.f;
        RealBetHistoryOrderDatabase realBetHistoryOrderDatabase = this.b;
        if (i2 == 0) {
            uj50.b(objC);
            list = this.h;
            if (list == null || list.isEmpty()) {
                y.a("Nothing to undo.");
                return null;
            }
            q2i q2iVarB = realBetHistoryOrderDatabase.x().b();
            et2Var.a = list;
            et2Var.f = 1;
            objC = s0i.c(q2iVarB, et2Var);
            if (objC != y5bVar) {
            }
            return y5bVar;
        }
        if (i2 == 1) {
            list = et2Var.a;
            uj50.b(objC);
        } else {
            if (i2 == 2) {
                int i3 = et2Var.c;
                list2 = et2Var.a;
                uj50.b(objC);
                r2 = i3;
                try {
                    zi50.a aVar = zi50.b;
                    g3z g3zVar = this.c;
                    arrayList = new ArrayList(l48.r(list2, 10));
                    it = list2.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((RealBetHistoryOrderEntity) it.next()).getOrderId());
                    }
                    DeleteRealBetHistoryOrdersRequest deleteRealBetHistoryOrdersRequest = new DeleteRealBetHistoryOrdersRequest(arrayList);
                    et2Var.a = list2;
                    et2Var.b = null;
                    et2Var.c = r2;
                    et2Var.f = 3;
                    objC = g3zVar.k(deleteRealBetHistoryOrdersRequest, et2Var);
                    if (objC != y5bVar) {
                        list3 = list2;
                        r2 = r2;
                        n52.c((BaseResponse) objC);
                        bVar = Unit.a;
                        zi50.a aVar2 = zi50.b;
                        r3 = r2;
                        if (zi50.a(bVar) != null) {
                            gt2Var = new gt2(this, list3, null);
                            et2Var.a = null;
                            et2Var.b = bVar;
                            et2Var.c = r3;
                            et2Var.f = 4;
                            if (qv50.b(realBetHistoryOrderDatabase, gt2Var, et2Var) != y5bVar) {
                                obj = bVar;
                            }
                        }
                        uj50.b(bVar);
                        this.h = null;
                        return Unit.a;
                    }
                } catch (Throwable th) {
                    th = th;
                    list3 = list2;
                    zi50.a aVar3 = zi50.b;
                    bVar = new zi50.b(th);
                    r3 = r2;
                }
                return y5bVar;
            }
            if (i2 == 3) {
                r2 = et2Var.c;
                list3 = et2Var.a;
                try {
                    uj50.b(objC);
                    r2 = r2;
                    n52.c((BaseResponse) objC);
                    bVar = Unit.a;
                    zi50.a aVar4 = zi50.b;
                    r3 = r2;
                } catch (Throwable th2) {
                    th = th2;
                    zi50.a aVar5 = zi50.b;
                    bVar = new zi50.b(th);
                    r3 = r2;
                }
                if (zi50.a(bVar) != null) {
                    gt2Var = new gt2(this, list3, null);
                    et2Var.a = null;
                    et2Var.b = bVar;
                    et2Var.c = r3;
                    et2Var.f = 4;
                    if (qv50.b(realBetHistoryOrderDatabase, gt2Var, et2Var) != y5bVar) {
                        obj = bVar;
                    }
                    return y5bVar;
                }
                uj50.b(bVar);
                this.h = null;
                return Unit.a;
            }
            if (i2 != 4) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            obj = et2Var.b;
            uj50.b(objC);
        }
        bVar = obj;
        uj50.b(bVar);
        this.h = null;
        return Unit.a;
        Boolean bool = (Boolean) objC;
        ?? BooleanValue = bool != null ? bool.booleanValue() : 0;
        ft2 ft2Var = new ft2(this, list, BooleanValue, null);
        et2Var.a = list;
        et2Var.c = BooleanValue;
        et2Var.f = 2;
        if (qv50.b(realBetHistoryOrderDatabase, ft2Var, et2Var) != y5bVar) {
            list2 = list;
            r2 = BooleanValue;
            zi50.a aVar6 = zi50.b;
            g3z g3zVar2 = this.c;
            arrayList = new ArrayList(l48.r(list2, 10));
            it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(((RealBetHistoryOrderEntity) it.next()).getOrderId());
            }
            DeleteRealBetHistoryOrdersRequest deleteRealBetHistoryOrdersRequest2 = new DeleteRealBetHistoryOrdersRequest(arrayList);
            et2Var.a = list2;
            et2Var.b = null;
            et2Var.c = r2;
            et2Var.f = 3;
            objC = g3zVar2.k(deleteRealBetHistoryOrdersRequest2, et2Var);
            if (objC != y5bVar) {
                list3 = list2;
                r2 = r2;
                n52.c((BaseResponse) objC);
                bVar = Unit.a;
                zi50.a aVar7 = zi50.b;
                r3 = r2;
                if (zi50.a(bVar) != null) {
                    gt2Var = new gt2(this, list3, null);
                    et2Var.a = null;
                    et2Var.b = bVar;
                    et2Var.c = r3;
                    et2Var.f = 4;
                    if (qv50.b(realBetHistoryOrderDatabase, gt2Var, et2Var) != y5bVar) {
                        obj = bVar;
                        bVar = obj;
                    }
                }
                uj50.b(bVar);
                this.h = null;
                return Unit.a;
            }
        }
        return y5bVar;
    }

    @Override // defpackage.at2
    public final Object n(String str, tje0 tje0Var) {
        return this.b.x().i(str, tje0Var);
    }

    @Override // defpackage.at2
    public final Object o(tje0 tje0Var) {
        jq2 jq2Var = this.g;
        return jq2Var.b.a(jq2Var, jq2.c[0]).g(tje0Var, Boolean.TRUE);
    }

    @Override // defpackage.at2
    public final lyh<Boolean> p() {
        jq2 jq2Var = this.g;
        return jq2Var.b.a(jq2Var, jq2.c[0]).d(Boolean.FALSE);
    }

    @Override // defpackage.at2
    public final Long q() {
        return this.j;
    }
}
