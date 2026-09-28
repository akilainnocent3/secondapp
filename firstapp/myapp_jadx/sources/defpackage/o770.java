package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.scheduledfootball.handler.ScheduledFootballLeagueHandlerImpl$init$2", f = "ScheduledFootballLeagueHandlerImpl.kt", l = {}, m = "invokeSuspend", v = 2)
public final class o770 extends tje0 implements Function2<List<? extends l770>, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ p770 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o770(p770 p770Var, v1b<? super o770> v1bVar) {
        super(2, v1bVar);
        this.b = p770Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        o770 o770Var = new o770(this.b, v1bVar);
        o770Var.a = obj;
        return o770Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(List<? extends l770> list, v1b<? super Unit> v1bVar) {
        return ((o770) create(list, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object value;
        ArrayList arrayList;
        Object value2;
        String str;
        List<l770> list = (List) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        p770 p770Var = this.b;
        wwd0 wwd0Var = p770Var.a;
        do {
            value = wwd0Var.getValue();
            arrayList = new ArrayList(l48.r(list, 10));
            for (l770 l770Var : list) {
                arrayList.add(new c870(l770Var.a, l770Var.c, l770Var.b));
            }
        } while (!wwd0Var.g(value, a4h.b(arrayList)));
        wwd0 wwd0Var2 = p770Var.b;
        do {
            value2 = wwd0Var2.getValue();
            str = (String) value2;
            if (StringsKt.U(str)) {
                l770 l770Var2 = (l770) CollectionsKt.firstOrNull(list);
                str = l770Var2 != null ? l770Var2.a : null;
                if (str == null) {
                    str = "";
                }
            }
        } while (!wwd0Var2.g(value2, str));
        return Unit.a;
    }
}
