package defpackage;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.playtimecontrol.remove.viewmodel.PlayTimeControlRemoveViewModel$buildInfo$1", f = "PlayTimeControlRemoveViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class xn10 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public final /* synthetic */ yn10 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xn10(yn10 yn10Var, v1b<? super xn10> v1bVar) {
        super(2, v1bVar);
        this.a = yn10Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new xn10(this.a, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((xn10) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object value;
        String str;
        boolean z;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        yn10 yn10Var = this.a;
        wwd0 wwd0Var = yn10Var.a;
        do {
            value = wwd0Var.getValue();
            gr10 gr10Var = (gr10) value;
            yn10Var.v.getClass();
            Calendar calendar = Calendar.getInstance();
            calendar.add(6, 1);
            str = new SimpleDateFormat("d MMM. yyyy HH:mm '(GMT'XXX')'", Locale.US).format(calendar.getTime());
            str.getClass();
            z = gr10Var.b;
            gr10Var.getClass();
        } while (!wwd0Var.g(value, new gr10(str, z)));
        return Unit.a;
    }
}
