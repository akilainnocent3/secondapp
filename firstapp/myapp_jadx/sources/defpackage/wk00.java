package defpackage;

import com.sportybet.android.bookingcode.data.dto.BookingData;
import com.sportybet.plugin.realsports.data.Event;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.android.social.domain.viewmodel.PersonalCodeViewModel$onEditCode$2", f = "PersonalCodeViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class wk00 extends tje0 implements Function2<a8a0, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ kl00 c;
    public final /* synthetic */ el00 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wk00(v1b v1bVar, el00 el00Var, kl00 kl00Var, boolean z) {
        super(2, v1bVar);
        this.b = z;
        this.c = kl00Var;
        this.d = el00Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        wk00 wk00Var = new wk00(v1bVar, this.d, this.c, this.b);
        wk00Var.a = obj;
        return wk00Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(a8a0 a8a0Var, v1b<? super Unit> v1bVar) {
        return ((wk00) create(a8a0Var, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        z7a0 bVar;
        g08 g08Var = g08.UNKNOWN;
        a8a0 a8a0Var = (a8a0) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        boolean z = a8a0Var.b;
        BookingData bookingData = a8a0Var.a;
        if (z) {
            String str = bookingData.shareCode;
            str.getClass();
            List<Event> list = bookingData.outcomes;
            kl00 kl00Var = this.c;
            int i = kl00Var.c;
            double d = kl00Var.b;
            bVar = new z7a0.c(str, list, new Integer(i), new Double(d), a8a0Var.c, new Integer(10000), 770);
        } else {
            String str2 = bookingData.shareCode;
            str2.getClass();
            bVar = new z7a0.b(str2, bookingData.outcomes, new Integer(10000), null, null, 98);
        }
        wuw<z7a0> wuwVar = this.d.z;
        wuwVar.getClass();
        wuwVar.a.c(bVar);
        return Unit.a;
    }
}
