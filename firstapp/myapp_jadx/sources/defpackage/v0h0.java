package defpackage;

import com.google.protobuf.DescriptorProtos;
import com.sportybet.android.transaction.domain.model.LastDayRangeOption;
import com.sportybet.android.transaction.domain.model.LastDayRangeSetting;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lv0h0;", "Lpu5;", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class v0h0 extends pu5 {
    public final v340 A;
    public final a1h0 e;
    public final Date f = gsc.c(new Date());
    public final b390 i;
    public final t340 v;
    public xpg0.e.a w;
    public final wwd0 y;
    public final v340 z;

    @c0d(c = "com.sportybet.android.transaction.ui.calendar.viewmodel.TxCalendarViewModel$lastDayRangeSettingUiStateFlow$1", f = "TxCalendarViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements gaj<LastDayRangeSetting, pyc, v1b<? super rmr>, Object> {
        public /* synthetic */ LastDayRangeSetting a;
        public /* synthetic */ pyc b;

        public a(v1b<? super a> v1bVar) {
            super(3, v1bVar);
        }

        @Override // defpackage.gaj
        public final Object invoke(LastDayRangeSetting lastDayRangeSetting, pyc pycVar, v1b<? super rmr> v1bVar) {
            a aVar = v0h0.this.new a(v1bVar);
            aVar.a = lastDayRangeSetting;
            aVar.b = pycVar;
            return aVar.invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            boolean zE;
            LastDayRangeSetting lastDayRangeSetting = this.a;
            pyc pycVar = this.b;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            if (lastDayRangeSetting == null) {
                return null;
            }
            LastDayRangeOption lastDayRangeOption = lastDayRangeSetting.c;
            LastDayRangeOption lastDayRangeOption2 = lastDayRangeSetting.b;
            LastDayRangeOption lastDayRangeOption3 = lastDayRangeSetting.a;
            boolean z = pycVar instanceof pyc.a;
            if (z) {
                zE = gsc.e(v0h0.this.f, ((pyc.a) pycVar).b);
            } else {
                if (!(pycVar instanceof pyc.b)) {
                    uhc.a();
                    return null;
                }
                zE = false;
            }
            if (!z || !zE) {
                return new rmr(new qmr(lastDayRangeOption3, false), new qmr(lastDayRangeOption2, false), new qmr(lastDayRangeOption, false));
            }
            pyc.a aVar = (pyc.a) pycVar;
            int iA = gsc.a(aVar.b, aVar.a);
            return new rmr(new qmr(lastDayRangeOption3, iA == lastDayRangeOption3.a - 1), new qmr(lastDayRangeOption2, iA == lastDayRangeOption2.a - 1), new qmr(lastDayRangeOption, iA == lastDayRangeOption.a - 1));
        }
    }

    public static final class b<T> implements myh {
        public final /* synthetic */ myh<gqx> a;

        /* JADX WARN: Multi-variable type inference failed */
        public b(myh<? super gqx> myhVar) {
            this.a = myhVar;
        }

        @Override // defpackage.myh
        public final Object emit(Object obj, v1b v1bVar) {
            return this.a.emit((gqx) obj, v1bVar);
        }
    }

    @c0d(c = "com.sportybet.android.transaction.ui.calendar.viewmodel.TxCalendarViewModel$quickSelect$1", f = "TxCalendarViewModel.kt", l = {140}, m = "invokeSuspend", v = 2)
    public static final class c extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ long c;
        public final /* synthetic */ long d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(long j, long j2, v1b<? super c> v1bVar) {
            super(2, v1bVar);
            this.c = j;
            this.d = j2;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return v0h0.this.new c(this.c, this.d, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((c) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                b390 b390Var = v0h0.this.i;
                Pair pair = new Pair(new Date(this.c), new Date(this.d));
                this.a = 1;
                if (b390Var.emit(pair, this) == y5bVar) {
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

    @c0d(c = "com.sportybet.android.transaction.ui.calendar.viewmodel.TxCalendarViewModel$special$$inlined$transform$1", f = "TxCalendarViewModel.kt", l = {DescriptorProtos.FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER}, m = "invokeSuspend", v = 2)
    public static final class d extends tje0 implements Function2<myh<? super gqx>, v1b<? super Unit>, Object> {
        public int a;
        public /* synthetic */ Object b;
        public final /* synthetic */ f1i c;
        public final /* synthetic */ v0h0 d;

        public static final class a<T> implements myh {
            public final /* synthetic */ myh<gqx> a;
            public final /* synthetic */ v0h0 b;

            public a(myh myhVar, v0h0 v0h0Var) {
                this.b = v0h0Var;
                this.a = myhVar;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.myh
            public final Object emit(T t, v1b<? super Unit> v1bVar) {
                a1h0 a1h0Var = this.b.e;
                LastDayRangeOption lastDayRangeOption = ((LastDayRangeSetting) t).a;
                a1h0Var.getClass();
                lastDayRangeOption.getClass();
                Object objCollect = new y0h0(new yzh(a1h0Var.a.needShow("need_show_tx_date_range_new_feature_alert"), new z0h0(3, null)), lastDayRangeOption).collect(new b(this.a), v1bVar);
                return objCollect == y5b.a ? objCollect : Unit.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(f1i f1iVar, v1b v1bVar, v0h0 v0h0Var) {
            super(2, v1bVar);
            this.c = f1iVar;
            this.d = v0h0Var;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            d dVar = new d(this.c, v1bVar, this.d);
            dVar.b = obj;
            return dVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(myh<? super gqx> myhVar, v1b<? super Unit> v1bVar) {
            return ((d) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                a aVar = new a((myh) this.b, this.d);
                this.b = null;
                this.a = 1;
                if (this.c.collect(aVar, this) == y5bVar) {
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

    public v0h0(a1h0 a1h0Var) {
        this.e = a1h0Var;
        b390 b390VarB = d390.b(0, 0, null, 7);
        this.i = b390VarB;
        this.v = e1i.a(b390VarB);
        wwd0 wwd0VarA = xwd0.a(null);
        this.y = wwd0VarA;
        n1i n1iVar = new n1i(wwd0VarA, this.a, new a(null));
        et7 et7VarD = o8i0.d(this);
        lwd0 lwd0Var = q490.a.b;
        this.z = e1i.e(n1iVar, et7VarD, lwd0Var, null);
        this.A = e1i.e(new or60(new d(new f1i(wwd0VarA), null, this)), o8i0.d(this), lwd0Var, null);
    }

    public final void B1(qmr qmrVar) {
        LastDayRangeSetting lastDayRangeSetting;
        if (qmrVar.b || (lastDayRangeSetting = (LastDayRangeSetting) this.y.getValue()) == null) {
            return;
        }
        LastDayRangeOption lastDayRangeOption = qmrVar.a;
        long time = this.f.getTime();
        int i = lastDayRangeOption.a;
        int i2 = lastDayRangeSetting.d;
        if (i > i2) {
            i = i2;
        }
        long millis = time - TimeUnit.DAYS.toMillis(i - 1);
        pyc.a aVar = new pyc.a(new Date(millis), new Date(time));
        wwd0 wwd0Var = this.a;
        wwd0Var.getClass();
        wwd0Var.k(null, aVar);
        ej5.c(o8i0.d(this), null, null, new c(millis, time, null), 3);
        this.w = new xpg0.e.a.b(Integer.valueOf(i));
    }
}
