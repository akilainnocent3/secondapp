package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.core.model.patron.Country;
import com.sportybet.android.gp.tz.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.account.mzaccount.registration.MZAccountRegisterViewModel$fetchAllCountries$1", f = "MZAccountRegisterViewModel.kt", l = {71}, m = "invokeSuspend", v = 2)
public final class ohu extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
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
            lk50 lk50Var = (lk50) obj;
            phu phuVar = this.a;
            wwd0 wwd0Var = phuVar.y;
            if (lk50Var instanceof lk50.c) {
                do {
                    value2 = wwd0Var.getValue();
                } while (!wwd0Var.g(value2, thu.a((thu) value2, null, null, a4h.b((Iterable) ((lk50.c) lk50Var).a), null, null, null, null, null, null, null, null, 65503)));
            } else if (lk50Var instanceof lk50.a) {
                do {
                    value = wwd0Var.getValue();
                    StringUiText stringUiText = vch0.a;
                } while (!wwd0Var.g(value, thu.a((thu) value, null, null, null, null, null, null, null, null, null, null, new sx40.a(new ResourceUiText(R.string.common_feedback__please_check_your_internet_connection_and_try_again)), 32767)));
                phuVar.x1();
            }
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ohu(phu phuVar, v1b<? super ohu> v1bVar) {
        super(2, v1bVar);
        this.b = phuVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new ohu(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((ohu) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
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
            do {
                value = wwd0Var.getValue();
            } while (!wwd0Var.g(value, thu.a((thu) value, null, null, null, null, null, null, null, null, null, null, sx40.c.a, 32767)));
            lyh<lk50<List<Country>>> lyhVarW0 = phuVar.c.a.w0();
            a aVar = new a(phuVar);
            this.a = 1;
            if (lyhVarW0.collect(aVar, this) == y5bVar) {
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
