package defpackage;

import com.sportybet.android.gp.tz.R;
import com.sportybet.android.instantwin.presentation.footballfamilysettlement.c;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.footballfamilysettlement.FootballFamilySettlementViewModel$3", f = "FootballFamilySettlementViewModel.kt", l = {184}, m = "invokeSuspend", v = 2)
public final class ufi extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ c b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ufi(v1b v1bVar, c cVar) {
        super(2, v1bVar);
        this.b = cVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new ufi(v1bVar, this.b);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((ufi) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        int i;
        Object value;
        y5b y5bVar = y5b.a;
        int i2 = this.a;
        c cVar = this.b;
        if (i2 == 0) {
            uj50.b(obj);
            iug0 iug0Var = cVar.d;
            this.a = 1;
            obj = iug0Var.a();
            if (obj == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        int iOrdinal = ((hug0) obj).ordinal();
        if (iOrdinal == 1) {
            i = R.drawable.ic_one_bet_cut_sw;
        } else if (iOrdinal != 2) {
            i = iOrdinal != 3 ? R.drawable.ic_one_bet_cut : R.drawable.ic_one_bet_cut_pt_br;
        } else {
            i = R.drawable.ic_one_bet_cut_es_mx;
        }
        wwd0 wwd0Var = cVar.G;
        do {
            value = wwd0Var.getValue();
            ((Number) value).intValue();
        } while (!wwd0Var.g(value, new Integer(i)));
        return Unit.a;
    }
}
