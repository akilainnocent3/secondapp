package defpackage;

import com.sportybet.android.data.BannedItemSocket;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.realsports.viewmodel.BetSlipViewModel$fetchBannedList$1", f = "BetSlipViewModel.kt", l = {1223}, m = "invokeSuspend", v = 2)
public final class y63 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public ArrayList a;
    public int b;
    public final /* synthetic */ q73 c;

    public static final class a<T> implements myh {
        public final /* synthetic */ ArrayList a;

        public a(ArrayList arrayList) {
            this.a = arrayList;
        }

        @Override // defpackage.myh
        public final Object emit(Object obj, v1b v1bVar) {
            lk50 lk50Var = (lk50) obj;
            if (lk50Var instanceof lk50.c) {
                Iterable iterable = (Iterable) ((lk50.c) lk50Var).a;
                ArrayList arrayList = new ArrayList(l48.r(iterable, 10));
                Iterator<T> it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(new BannedItemSocket("ADD", (String) it.next(), "EVENT", true));
                }
                this.a.addAll(arrayList);
            } else if (lk50Var instanceof lk50.a) {
                itf0.a.d("Unexpected result type: " + lk50Var, new Object[0]);
            }
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y63(q73 q73Var, v1b<? super y63> v1bVar) {
        super(2, v1bVar);
        this.c = q73Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new y63(this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((y63) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        ArrayList arrayList;
        y5b y5bVar = y5b.a;
        int i = this.b;
        q73 q73Var = this.c;
        if (i == 0) {
            ArrayList arrayListA = j9f.a(obj);
            lyh<lk50<List<String>>> lyhVarU = q73Var.D.u();
            a aVar = new a(arrayListA);
            this.a = arrayListA;
            this.b = 1;
            if (lyhVarU.collect(aVar, this) == y5bVar) {
                return y5bVar;
            }
            arrayList = arrayListA;
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            arrayList = this.a;
            uj50.b(obj);
        }
        wwd0 wwd0Var = q73Var.W0;
        lk50.c cVar = new lk50.c(arrayList);
        wwd0Var.getClass();
        wwd0Var.k(null, cVar);
        return Unit.a;
    }
}
