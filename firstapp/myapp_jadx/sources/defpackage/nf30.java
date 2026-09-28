package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.core.model.MyLog;
import com.sportybet.plugin.realsports.betslip.Selection;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.realsports.viewmodel.QuickBetViewModel$fetchOutcomesData$1", f = "QuickBetViewModel.kt", l = {426}, m = "invokeSuspend", v = 2)
public final class nf30 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public long a;
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ tf30 d;
    public final /* synthetic */ aak e;
    public final /* synthetic */ List<Selection> f;
    public final /* synthetic */ String i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public nf30(tf30 tf30Var, aak aakVar, List<? extends Selection> list, String str, v1b<? super nf30> v1bVar) {
        super(2, v1bVar);
        this.d = tf30Var;
        this.e = aakVar;
        this.f = list;
        this.i = str;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        nf30 nf30Var = new nf30(this.d, this.e, this.f, this.i, v1bVar);
        nf30Var.c = obj;
        return nf30Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((nf30) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Throwable th;
        long j;
        Object bVar;
        tf30 tf30Var = this.d;
        vu90<t7z> vu90Var = tf30Var.W;
        y5b y5bVar = y5b.a;
        int i = this.b;
        aak aakVar = this.e;
        if (i == 0) {
            uj50.b(obj);
            t7z.b bVar2 = new t7z.b(aakVar, this.f);
            if (vu90Var.e()) {
                vu90Var.m(bVar2);
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            try {
                zi50.a aVar = zi50.b;
                String str = this.i;
                if (str == null) {
                    throw new Exception("The selection json body is null.");
                }
                e8h e8hVar = tf30Var.w;
                jqa0 jqa0Var = jqa0.QUICK_BET_VIEW_MODEL_FETCH_OUTCOME_DATA;
                this.c = null;
                this.a = jCurrentTimeMillis;
                this.b = 1;
                obj = e8hVar.l(jqa0Var, str, this);
                if (obj == y5bVar) {
                    return y5bVar;
                }
                j = jCurrentTimeMillis;
            } catch (Throwable th2) {
                th = th2;
                j = jCurrentTimeMillis;
                zi50.a aVar2 = zi50.b;
                bVar = new zi50.b(th);
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j = this.a;
            try {
                uj50.b(obj);
            } catch (Throwable th3) {
                th = th3;
                zi50.a aVar3 = zi50.b;
                bVar = new zi50.b(th);
            }
        }
        bVar = (BaseResponse) obj;
        zi50.a aVar4 = zi50.b;
        long j2 = j;
        if (!(bVar instanceof zi50.b)) {
            BaseResponse baseResponse = (BaseResponse) bVar;
            long jCurrentTimeMillis2 = System.currentTimeMillis();
            if (baseResponse.isSuccessful()) {
                T t = baseResponse.data;
                t.getClass();
                t7z.c cVar = new t7z.c((List) t, aakVar, this.f, j2, jCurrentTimeMillis2);
                if (vu90Var.e()) {
                    vu90Var.m(cVar);
                }
            } else {
                t7z.a aVar5 = new t7z.a(aakVar);
                if (vu90Var.e()) {
                    vu90Var.m(aVar5);
                }
            }
        }
        Throwable thA = zi50.a(bVar);
        if (thA != null) {
            itf0.a aVar6 = itf0.a;
            aVar6.q(MyLog.TAG_QUICK_BET);
            aVar6.e(thA);
            t7z.a aVar7 = new t7z.a(aakVar);
            if (vu90Var.e()) {
                vu90Var.m(aVar7);
            }
        }
        return Unit.a;
    }
}
