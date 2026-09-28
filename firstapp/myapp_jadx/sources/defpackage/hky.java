package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sportybet.plugin.realsports.betslip.Selection;
import com.sportybet.plugin.realsports.data.Event;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.realsports.betslip.OddsPollHandler$refreshOdds$1", f = "OddsPollHandler.kt", l = {49, 60}, m = "invokeSuspend", v = 2)
public final class hky extends tje0 implements Function2<myh<? super List<? extends Event>>, v1b<? super Unit>, Object> {
    public Object a;
    public long b;
    public int c;
    public /* synthetic */ Object d;
    public final /* synthetic */ iky e;

    @c0d(c = "com.sportybet.plugin.realsports.betslip.OddsPollHandler$refreshOdds$1$2$response$1", f = "OddsPollHandler.kt", l = {50}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super BaseResponse<List<? extends Event>>>, Object> {
        public int a;
        public final /* synthetic */ iky b;
        public final /* synthetic */ List<Selection> c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(iky ikyVar, List<? extends Selection> list, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.b = ikyVar;
            this.c = list;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new a(this.b, this.c, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super BaseResponse<List<? extends Event>>> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i != 0) {
                if (i == 1) {
                    uj50.b(obj);
                    return obj;
                }
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
            e8h e8hVar = this.b.a;
            jqa0 jqa0Var = jqa0.BETSLIP_BUTTON_FOREGROUND;
            String requestBody = g880.k(this.c, false).getRequestBody();
            this.a = 1;
            Object objL = e8hVar.l(jqa0Var, requestBody, this);
            return objL == y5bVar ? y5bVar : objL;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hky(iky ikyVar, v1b<? super hky> v1bVar) {
        super(2, v1bVar);
        this.e = ikyVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        hky hkyVar = new hky(this.e, v1bVar);
        hkyVar.d = obj;
        return hkyVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(myh<? super List<? extends Event>> myhVar, v1b<? super Unit> v1bVar) {
        return ((hky) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:42:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:43:0x00fc  */
    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object bVar;
        Object obj2;
        Throwable thA;
        long j;
        myh myhVar = (myh) this.d;
        y5b y5bVar = y5b.a;
        int i = this.c;
        iky ikyVar = this.e;
        try {
            if (i != 0) {
                if (i == 1) {
                    j = this.b;
                    uj50.b(obj);
                } else {
                    if (i != 2) {
                        ib5.a("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    obj2 = this.a;
                    uj50.b(obj);
                }
                itf0.a.a("REFRESH ODDS: UPDATED SUCCESSFULLY", new Object[0]);
                bVar = obj2;
                thA = zi50.a(bVar);
                if (thA != null) {
                    if (thA instanceof CancellationException) {
                        throw thA;
                    }
                    itf0.a.f(thA, "REFRESH ODDS: ERROR during refresh", new Object[0]);
                }
                return Unit.a;
            }
            uj50.b(obj);
            if (i9p.h(getContext())) {
                Long l = ikyVar.d;
                j = 30000;
                if (l != null) {
                    long jCurrentTimeMillis = 30000 - (System.currentTimeMillis() - l.longValue());
                    if (jCurrentTimeMillis > 0) {
                        itf0.a.a(d020.a(jCurrentTimeMillis, "REFRESH ODDS: Too soon to update, ", " ms"), new Object[0]);
                        return Unit.a;
                    }
                    itf0.a.a(d020.a(jCurrentTimeMillis, "REFRESH ODDS: no waiting, passed ", " ms"), new Object[0]);
                }
                itf0.a.a("REFRESH ODDS: REFRESHING", new Object[0]);
                ArrayList arrayListU = ikyVar.b.U();
                if (!arrayListU.isEmpty()) {
                    zi50.a aVar = zi50.b;
                    k5b k5bVar = ikyVar.c;
                    a aVar2 = new a(ikyVar, arrayListU, null);
                    this.d = myhVar;
                    this.a = null;
                    this.b = 30000L;
                    this.c = 1;
                    obj = ej5.d(k5bVar, aVar2, this);
                    if (obj == y5bVar) {
                    }
                    return y5bVar;
                }
            }
            return Unit.a;
            itf0.a.a("REFRESH ODDS: GOT RESPONSE. Calling onSuccess", new Object[0]);
            bVar = (List) ((BaseResponse) obj).data;
            zi50.a aVar3 = zi50.b;
        } catch (Throwable th) {
            zi50.a aVar4 = zi50.b;
            bVar = new zi50.b(th);
        }
        if (!(bVar instanceof zi50.b)) {
            List list = (List) bVar;
            ikyVar.d = new Long(System.currentTimeMillis());
            list.getClass();
            this.d = null;
            this.a = bVar;
            this.b = j;
            this.c = 2;
            if (myhVar.emit(list, this) != y5bVar) {
                obj2 = bVar;
                itf0.a.a("REFRESH ODDS: UPDATED SUCCESSFULLY", new Object[0]);
                bVar = obj2;
                thA = zi50.a(bVar);
                if (thA != null) {
                    if (thA instanceof CancellationException) {
                        throw thA;
                    }
                    itf0.a.f(thA, "REFRESH ODDS: ERROR during refresh", new Object[0]);
                }
            }
            return y5bVar;
        }
        thA = zi50.a(bVar);
        if (thA != null) {
            if (thA instanceof CancellationException) {
                throw thA;
            }
            itf0.a.f(thA, "REFRESH ODDS: ERROR during refresh", new Object[0]);
        }
        return Unit.a;
    }
}
