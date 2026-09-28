package defpackage;

import com.sportybet.android.bookingcode.data.dto.BookingData;
import com.sportybet.plugin.realsports.data.Event;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.android.social.domain.viewmodel.PersonalCodeViewModel$onAddCode$2", f = "PersonalCodeViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class rk00 extends tje0 implements Function2<a8a0, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ kl00 b;
    public final /* synthetic */ el00 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rk00(v1b v1bVar, el00 el00Var, kl00 kl00Var) {
        super(2, v1bVar);
        this.b = kl00Var;
        this.c = el00Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        rk00 rk00Var = new rk00(v1bVar, this.c, this.b);
        rk00Var.a = obj;
        return rk00Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(a8a0 a8a0Var, v1b<? super Unit> v1bVar) {
        return ((rk00) create(a8a0Var, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        z7a0 aVar;
        a8a0 a8a0Var = (a8a0) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        boolean z = a8a0Var.b;
        BookingData bookingData = a8a0Var.a;
        if (z) {
            String str = bookingData.shareCode;
            str.getClass();
            List<Event> list = bookingData.outcomes;
            g08 g08Var = g08.UNKNOWN;
            kl00 kl00Var = this.b;
            int i = kl00Var.c;
            double d = kl00Var.b;
            aVar = new z7a0.c(str, list, new Integer(i), new Double(d), a8a0Var.c, new Integer(10000), 770);
        } else {
            String str2 = bookingData.shareCode;
            str2.getClass();
            List<Event> list2 = bookingData.outcomes;
            g08 g08Var2 = g08.UNKNOWN;
            aVar = new z7a0.a(str2, list2, new Integer(10000), null, null, null, 226);
        }
        wuw<z7a0> wuwVar = this.c.z;
        wuwVar.getClass();
        wuwVar.a.c(aVar);
        return Unit.a;
    }
}
