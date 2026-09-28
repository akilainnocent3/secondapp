package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.core.model.assetsinfo.AssetsInfo;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.transaction.domain.model.LastDayRangeOption;
import com.sportybet.android.transaction.domain.model.LastDayRangeSetting;
import com.sportybet.android.transaction.ui.txlist.model.TxListItem;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lo7h0;", "Lj8i0;", "", "a", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class o7h0 extends j8i0 {
    public final wwd0 A;
    public final v340 B;
    public final wwd0 C;
    public final v340 D;
    public final b390 E;
    public final t340 F;
    public final b390 G;
    public final t340 H;
    public final v340 I;
    public final wwd0 J;
    public final n1i K;
    public final wwd0 L;
    public final b390 M;
    public final ku90<h7l> N;
    public final ku90 O;
    public final v340 P;
    public jvd0 Q;
    public final bgk a;
    public final e6h0 b;
    public final a1h0 c;
    public final bi7 d;
    public final k6k e;
    public final lyz f;
    public final t990 i;
    public final psm v;
    public final rdd0 w;
    public final Date y;
    public final v340 z;

    public static final class a {
        public final LastDayRangeSetting a;
        public final boolean b;

        public a(LastDayRangeSetting lastDayRangeSetting, boolean z) {
            lastDayRangeSetting.getClass();
            this.a = lastDayRangeSetting;
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.g(this.a, aVar.a) && this.b == aVar.b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "TxPreCheckState(lastDayRangeSetting=" + this.a + ", isFirstDeposit=" + this.b + ")";
        }
    }

    @c0d(c = "com.sportybet.android.transaction.ui.txlist.TxListViewModel$checkAuditStatus$1", f = "TxListViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class b extends tje0 implements Function2<Pair<? extends m7l, ? extends AssetsInfo>, v1b<? super Unit>, Object> {
        public /* synthetic */ Object a;
        public final /* synthetic */ o7h0 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(v1b v1bVar, o7h0 o7h0Var) {
            super(2, v1bVar);
            this.b = o7h0Var;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            b bVar = new b(v1bVar, this.b);
            bVar.a = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Pair<? extends m7l, ? extends AssetsInfo> pair, v1b<? super Unit> v1bVar) {
            return ((b) create(pair, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            Pair pair = (Pair) this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            this.b.L.setValue(pair.a);
            return Unit.a;
        }
    }

    @c0d(c = "com.sportybet.android.transaction.ui.txlist.TxListViewModel$checkAuditStatus$2", f = "TxListViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class c extends tje0 implements gaj<myh<? super Pair<? extends m7l, ? extends AssetsInfo>>, Throwable, v1b<? super Unit>, Object> {
        @Override // defpackage.gaj
        public final Object invoke(myh<? super Pair<? extends m7l, ? extends AssetsInfo>> myhVar, Throwable th, v1b<? super Unit> v1bVar) {
            return new c(3, v1bVar).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            return Unit.a;
        }
    }

    @c0d(c = "com.sportybet.android.transaction.ui.txlist.TxListViewModel$init$1", f = "TxListViewModel.kt", l = {240}, m = "invokeSuspend", v = 2)
    public static final class d extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ o7h0 b;

        public static final class a<T> implements myh {
            public final /* synthetic */ o7h0 a;

            public a(o7h0 o7h0Var) {
                this.a = o7h0Var;
            }

            @Override // defpackage.myh
            public final Object emit(Object obj, v1b v1bVar) {
                LastDayRangeOption lastDayRangeOption = ((a) obj).a.a;
                o7h0 o7h0Var = this.a;
                Date date = o7h0Var.y;
                long jD = gsc.d(date) - TimeUnit.DAYS.toMillis(lastDayRangeOption.a - 1);
                long time = date.getTime();
                wwd0 wwd0Var = o7h0Var.C;
                b1h0 b1h0VarA1 = o7h0Var.A1(lastDayRangeOption, jD, time);
                wwd0Var.getClass();
                wwd0Var.k(null, b1h0VarA1);
                o7h0Var.z1();
                return Unit.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(v1b v1bVar, o7h0 o7h0Var) {
            super(2, v1bVar);
            this.b = o7h0Var;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new d(v1bVar, this.b);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((d) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                o7h0 o7h0Var = this.b;
                i0i i0iVar = new i0i(new f1i(o7h0Var.z));
                a aVar = new a(o7h0Var);
                this.a = 1;
                if (i0iVar.collect(aVar, this) == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            return Unit.a;
        }
    }

    @c0d(c = "com.sportybet.android.transaction.ui.txlist.TxListViewModel$initTxList$1", f = "TxListViewModel.kt", l = {266}, m = "invokeSuspend", v = 2)
    public static final class e extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ o7h0 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(v1b v1bVar, o7h0 o7h0Var) {
            super(2, v1bVar);
            this.b = o7h0Var;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new e(v1bVar, this.b);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((e) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            o7h0 o7h0Var = this.b;
            if (i == 0) {
                uj50.b(obj);
                b1h0 b1h0Var = (b1h0) o7h0Var.C.getValue();
                Pair pair = new Pair(new Date(b1h0Var.a.getTime()), new Date(b1h0Var.b.getTime()));
                aqg0 aqg0Var = ((w0h0) o7h0Var.A.getValue()).a;
                this.a = 1;
                if (o7h0Var.C1(aqg0Var, pair, null, this) == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            o7h0Var.Q = null;
            return Unit.a;
        }
    }

    public o7h0(bgk bgkVar, e6h0 e6h0Var, a1h0 a1h0Var, bi7 bi7Var, k6k k6kVar, lyz lyzVar, sr10 sr10Var, m2l m2lVar, t990 t990Var, psm psmVar, rdd0 rdd0Var) {
        e6h0Var.getClass();
        lyzVar.getClass();
        sr10Var.getClass();
        m2lVar.getClass();
        psmVar.getClass();
        rdd0Var.getClass();
        this.a = bgkVar;
        this.b = e6h0Var;
        this.c = a1h0Var;
        this.d = bi7Var;
        this.e = k6kVar;
        this.f = lyzVar;
        this.i = t990Var;
        this.v = psmVar;
        this.w = rdd0Var;
        this.y = gsc.b(new Date());
        or60 or60Var = new or60(new x7h0(null, this));
        et7 et7VarD = o8i0.d(this);
        kwd0 kwd0Var = q490.a.a;
        v340 v340VarE = e1i.e(or60Var, et7VarD, kwd0Var, null);
        this.z = v340VarE;
        wwd0 wwd0VarA = xwd0.a(new w0h0(aqg0.a.c, true));
        this.A = wwd0VarA;
        this.B = e1i.b(wwd0VarA);
        wwd0 wwd0VarA2 = xwd0.a(new b1h0(new Date(), new Date(), "", true));
        this.C = wwd0VarA2;
        this.D = e1i.b(wwd0VarA2);
        b390 b390VarB = d390.b(0, 0, null, 7);
        this.E = b390VarB;
        this.F = e1i.a(b390VarB);
        b390 b390VarB2 = d390.b(0, 0, null, 7);
        this.G = b390VarB2;
        this.H = e1i.a(b390VarB2);
        this.I = e1i.e(new or60(new a8h0(new f1i(v340VarE), null, this)), o8i0.d(this), kwd0Var, null);
        wwd0 wwd0VarA3 = xwd0.a(v8h0.d.a);
        this.J = wwd0VarA3;
        this.K = new n1i(wwd0VarA3, sr10Var.c0(new pu0.a(0)), new c8h0(3, null));
        v340 v340VarE2 = e1i.e(m2lVar.a.getBooleanByFlow("key_name_update_result_dialog_has_shown", false), o8i0.d(this), q490.a.a(3), Boolean.FALSE);
        wwd0 wwd0VarA4 = xwd0.a(m7l.c.a);
        this.L = wwd0VarA4;
        b390 b390VarB3 = d390.b(1, 0, null, 6);
        this.M = b390VarB3;
        v340 v340VarE3 = e1i.e(new yzh(new or60(new b8h0(r0i.f(b390VarB3, new z7h0(null, this)), null, this)), new p7h0(3, null)), o8i0.d(this), q490.a.a(3), new zsp(null, 7));
        ku90<h7l> ku90Var = new ku90<>();
        this.N = ku90Var;
        this.O = ku90Var;
        this.P = e1i.e(r1i.a(wwd0VarA4, v340VarE2, v340VarE3, new q7h0(4, null)), o8i0.d(this), q490.a.a(3), new fex(0));
        t990Var.b(o8i0.d(this));
        ej5.c(o8i0.d(this), null, null, new y7h0(null, this), 3);
    }

    public static void B1(o7h0 o7h0Var, pdd0 pdd0Var, Function1 function1, int i) {
        k00[] k00VarArr = {k00.d};
        if ((i & 4) != 0) {
            function1 = new gxc0(1);
        }
        o7h0Var.getClass();
        pdd0Var.getClass();
        lpi.b(o7h0Var.w, o7h0Var.v, pdd0Var, (k00[]) Arrays.copyOf(k00VarArr, k00VarArr.length), function1);
    }

    public final b1h0 A1(LastDayRangeOption lastDayRangeOption, long j, long j2) {
        Date date = new Date(j);
        Date date2 = new Date(j2);
        int iA = gsc.a(date2, date);
        Locale locale = Locale.getDefault();
        locale.getClass();
        boolean z = false;
        String strL = bwf0.l(date, "dd/MM/yy", locale, 0, 0);
        Locale locale2 = Locale.getDefault();
        locale2.getClass();
        String strA = tug.a(strL, "~", bwf0.l(date2, "dd/MM/yy", locale2, 0, 0));
        if (gsc.e(this.y, date2) && iA == lastDayRangeOption.a - 1) {
            z = true;
        }
        return new b1h0(date, date2, strA, z);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v3, types: [int] */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r11v13 */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v3, types: [int] */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r12v2, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [int] */
    /* JADX WARN: Type inference failed for: r2v6 */
    public final Object C1(aqg0 aqg0Var, Pair pair, v8h0.f fVar, x1b x1bVar) {
        d8h0 d8h0Var;
        List list;
        ?? r2;
        ?? r12;
        ?? r10;
        List list2;
        ?? r11;
        brg0 brg0Var;
        boolean z;
        if (x1bVar instanceof d8h0) {
            d8h0Var = (d8h0) x1bVar;
            int i = d8h0Var.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                d8h0Var.f = i - Integer.MIN_VALUE;
            } else {
                d8h0Var = new d8h0(this, x1bVar);
            }
        } else {
            d8h0Var = new d8h0(this, x1bVar);
        }
        Object obj = d8h0Var.d;
        y5b y5bVar = y5b.a;
        int i2 = d8h0Var.f;
        if (i2 == 0) {
            uj50.b(obj);
            if (fVar != null) {
                List<TxListItem> list3 = fVar.a;
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list3) {
                    if (obj2 instanceof TxListItem.b) {
                        arrayList.add(obj2);
                    }
                }
                list = arrayList;
            } else {
                list = m2g.a;
            }
            if (fVar != null) {
                z = fVar.b;
            } else {
                r2 = 0;
            }
            if (fVar != null) {
                r2 = z;
                r12 = fVar.c;
            } else {
                r2 = z;
                r12 = 0;
            }
            TxListItem.b bVar = (TxListItem.b) CollectionsKt.d0(list);
            String str = (bVar == null || (brg0Var = bVar.a) == null) ? null : brg0Var.a;
            d8h0Var.a = list;
            d8h0Var.b = r2;
            d8h0Var.c = r12;
            d8h0Var.f = 1;
            Object objA = this.a.a(aqg0Var, pair, str, d8h0Var);
            if (objA != y5bVar) {
                List list4 = list;
                obj = objA;
                r10 = r12;
                list2 = list4;
                r11 = r2;
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                uj50.b(obj);
                return obj;
            }
            ib5.a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        int i3 = d8h0Var.c;
        int i4 = d8h0Var.b;
        list2 = (List) d8h0Var.a;
        uj50.b(obj);
        r10 = i3;
        r11 = i4;
        ng50 ng50Var = (ng50) obj;
        boolean z2 = ng50Var instanceof ng50.b;
        wwd0 wwd0Var = this.J;
        if (z2) {
            Object obj3 = ((ng50.b) ng50Var).a;
            obj3.getClass();
            e8h0 e8h0Var = (e8h0) obj3;
            boolean z3 = r10 != 0 || e8h0Var.c;
            boolean z4 = r11 != 0 || e8h0Var.b;
            List<brg0> list5 = e8h0Var.a;
            ArrayList arrayList2 = new ArrayList(l48.r(list5, 10));
            Iterator it = list5.iterator();
            while (it.hasNext()) {
                arrayList2.add(new TxListItem.b((brg0) it.next()));
            }
            if (!arrayList2.isEmpty()) {
                v8h0.f fVar2 = new v8h0.f(arrayList2.size() == 20 ? CollectionsKt.j0(CollectionsKt.i0(arrayList2, list2), TxListItem.a.a) : CollectionsKt.i0(arrayList2, list2), z4, z3);
                wwd0Var.getClass();
                wwd0Var.k(null, fVar2);
            } else if (list2.isEmpty()) {
                a aVar = (a) this.z.a.getValue();
                if (aVar == null) {
                    v8h0.b bVar2 = new v8h0.b(z4);
                    wwd0Var.getClass();
                    wwd0Var.k(null, bVar2);
                } else if (aVar.b) {
                    v8h0.a aVar2 = new v8h0.a(z4);
                    wwd0Var.getClass();
                    wwd0Var.k(null, aVar2);
                } else {
                    v8h0.b bVar3 = new v8h0.b(z4);
                    wwd0Var.getClass();
                    wwd0Var.k(null, bVar3);
                }
            } else {
                v8h0.f fVar3 = new v8h0.f(list2, z4, z3);
                wwd0Var.getClass();
                wwd0Var.k(null, fVar3);
            }
        } else {
            if (!(ng50Var instanceof ng50.a)) {
                uhc.a();
                return null;
            }
            if (!list2.isEmpty()) {
                ResourceUiText resourceUiText = new ResourceUiText(R.string.common_feedback__something_went_wrong_please_try_again_later);
                d8h0Var.a = null;
                d8h0Var.b = r11;
                d8h0Var.c = r10;
                d8h0Var.f = 2;
                Object objEmit = this.G.emit(resourceUiText, d8h0Var);
                return objEmit == y5bVar ? y5bVar : objEmit;
            }
            wwd0Var.getClass();
            wwd0Var.k(null, v8h0.c.a);
        }
        return Unit.a;
    }

    public final void x1() {
        bi7 bi7Var = this.d;
        bi7Var.getClass();
        dq40 dq40Var = new dq40();
        kzh.d(new yzh(new g1i(new zh7(new s78(bm50.d(bi7Var.b.a(pu0.c.a)), new yzh(ozh.c(new or60(new xh7(bi7Var, null)), bi7Var.c), new yh7(3, null)), new ai7(dq40Var, bi7Var, null)), dq40Var), new b(null, this)), new c(3, null)), o8i0.d(this));
    }

    public final void y1(aqg0 aqg0Var) {
        aqg0Var.getClass();
        w0h0 w0h0Var = new w0h0(aqg0Var, aqg0Var.equals(aqg0.a.c));
        wwd0 wwd0Var = this.A;
        wwd0Var.getClass();
        wwd0Var.k(null, w0h0Var);
        ej5.c(o8i0.d(this), null, null, new d(null, this), 3);
    }

    public final void z1() {
        wwd0 wwd0Var = this.J;
        wwd0Var.getClass();
        wwd0Var.k(null, v8h0.d.a);
        jvd0 jvd0Var = this.Q;
        if (jvd0Var != null) {
            jvd0Var.cancel((CancellationException) null);
        }
        this.Q = null;
        this.Q = ej5.c(o8i0.d(this), null, null, new e(null, this), 3);
    }
}
