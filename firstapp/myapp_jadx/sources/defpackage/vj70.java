package defpackage;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.scheduledfootball.handler.ScheduledFootballSingleBetHandlerImpl$init$1", f = "ScheduledFootballSingleBetHandlerImpl.kt", l = {}, m = "invokeSuspend", v = 2)
public final class vj70 extends tje0 implements Function2<List<? extends cz2>, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ bk70 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vj70(bk70 bk70Var, v1b<? super vj70> v1bVar) {
        super(2, v1bVar);
        this.b = bk70Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        vj70 vj70Var = new vj70(this.b, v1bVar);
        vj70Var.a = obj;
        return vj70Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(List<? extends cz2> list, v1b<? super Unit> v1bVar) {
        return ((vj70) create(list, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object value;
        LinkedHashMap linkedHashMap;
        List list = (List) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        bk70 bk70Var = this.b;
        CharSequence charSequenceJ = (CharSequence) bk70Var.g.getValue();
        if (StringsKt.U(charSequenceJ)) {
            charSequenceJ = bk70Var.b.j();
            charSequenceJ.getClass();
        }
        String str = (String) charSequenceJ;
        wwd0 wwd0Var = bk70Var.e;
        do {
            value = wwd0Var.getValue();
            Map<String, String> map = ((ft90) value).b;
            int iA = jpu.a(l48.r(list, 10));
            if (iA < 16) {
                iA = 16;
            }
            linkedHashMap = new LinkedHashMap(iA);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String str2 = ((cz2) it.next()).c;
                String str3 = map.get(str2);
                if (str3 == null) {
                    str3 = str;
                }
                linkedHashMap.put(str2, str3);
            }
        } while (!wwd0Var.g(value, new ft90(list, linkedHashMap)));
        return Unit.a;
    }
}
