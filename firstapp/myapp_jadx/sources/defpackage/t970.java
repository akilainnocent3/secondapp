package defpackage;

import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.scheduledfootball.handler.ScheduledFootballMultipleBetHandlerImpl$init$1", f = "ScheduledFootballMultipleBetHandlerImpl.kt", l = {}, m = "invokeSuspend", v = 2)
public final class t970 extends tje0 implements Function2<List<? extends cz2>, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ aa70 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t970(aa70 aa70Var, v1b<? super t970> v1bVar) {
        super(2, v1bVar);
        this.b = aa70Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        t970 t970Var = new t970(this.b, v1bVar);
        t970Var.a = obj;
        return t970Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(List<? extends cz2> list, v1b<? super Unit> v1bVar) {
        return ((t970) create(list, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object value;
        nmw nmwVar;
        List list = (List) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        aa70 aa70Var = this.b;
        String str = (String) aa70Var.h.getValue();
        wwd0 wwd0Var = aa70Var.f;
        do {
            value = wwd0Var.getValue();
            nmw nmwVar2 = (nmw) value;
            if (list.isEmpty()) {
                nmwVar = nmw.g;
            } else {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Object obj2 : list) {
                    String str2 = ((cz2) obj2).a;
                    Object objA = linkedHashMap.get(str2);
                    if (objA == null) {
                        objA = r9i.a(str2, linkedHashMap);
                    }
                    ((List) objA).add(obj2);
                }
                if (linkedHashMap.size() < 2) {
                    nmwVar = nmw.g;
                } else {
                    nmwVar2.getClass();
                    str.getClass();
                    nmwVar = new nmw(list, str);
                }
            }
        } while (!wwd0Var.g(value, nmwVar));
        return Unit.a;
    }
}
