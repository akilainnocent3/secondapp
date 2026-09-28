package defpackage;

import com.sporty.android.core.model.patron.Country;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.account.mzaccount.registration.MZAccountRegisterViewModel$createAccount$2", f = "MZAccountRegisterViewModel.kt", l = {228}, m = "invokeSuspend", v = 2)
public final class nhu extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ phu b;

    public static final class a<T> implements myh {
        public final /* synthetic */ phu a;

        public a(phu phuVar) {
            this.a = phuVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.myh
        public final Object emit(Object obj, v1b v1bVar) {
            Object value;
            Object value2;
            ws40 ws40Var = (ws40) obj;
            boolean z = ws40Var instanceof ws40.b;
            phu phuVar = this.a;
            if (z) {
                wwd0 wwd0Var = phuVar.y;
                do {
                    value2 = wwd0Var.getValue();
                } while (!wwd0Var.g(value2, thu.a((thu) value2, null, null, null, null, null, null, null, null, null, uxs.ENABLE, sx40.b.a, 16383)));
                ku90<us40> ku90Var = phuVar.v;
                ku90Var.a.a(xs40.a(ws40Var));
            } else if (ws40Var instanceof ws40.a) {
                wwd0 wwd0Var2 = phuVar.y;
                do {
                    value = wwd0Var2.getValue();
                } while (!wwd0Var2.g(value, thu.a((thu) value, null, null, null, null, null, null, null, null, null, uxs.ENABLE, new sx40.a(((ws40.a) ws40Var).e()), 16383)));
                Unit unit = Unit.a;
            } else {
                if (!(ws40Var instanceof ws40.c)) {
                    uhc.a();
                    return null;
                }
                ku90<us40> ku90Var2 = phuVar.v;
                ku90Var2.a.a(xs40.a(ws40Var));
            }
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nhu(phu phuVar, v1b<? super nhu> v1bVar) {
        super(2, v1bVar);
        this.b = phuVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new nhu(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((nhu) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object value;
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            phu phuVar = this.b;
            wwd0 wwd0Var = phuVar.y;
            v340 v340Var = phuVar.z;
            do {
                value = wwd0Var.getValue();
            } while (!wwd0Var.g(value, thu.a((thu) value, null, null, null, null, null, null, null, null, null, uxs.LOADING, sx40.c.a, 16383)));
            ct40 ct40Var = phuVar.d;
            String strP = phuVar.a.P();
            String str = ((thu) v340Var.a.getValue()).i.a.b;
            String str2 = ((thu) v340Var.a.getValue()).k.a.b;
            String str3 = ((thu) v340Var.a.getValue()).d.a.b;
            String str4 = ((thu) v340Var.a.getValue()).e.a.b;
            Long l = ((thu) v340Var.a.getValue()).h;
            Country country = ((thu) v340Var.a.getValue()).g;
            lyh lyhVarA = ct40.a(ct40Var, strP, str, str2, null, str3, str4, l, country != null ? country.getCode() : null, 8);
            a aVar = new a(phuVar);
            this.a = 1;
            if (lyhVarA.collect(aVar, this) == y5bVar) {
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
