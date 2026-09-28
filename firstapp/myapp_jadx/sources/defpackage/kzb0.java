package defpackage;

import androidx.fragment.app.e;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class kzb0 implements Function1 {
    public final /* synthetic */ HashMap a;
    public final /* synthetic */ q1c0 b;
    public final /* synthetic */ e c;

    public /* synthetic */ kzb0(q1c0 q1c0Var, e eVar, HashMap map) {
        this.a = map;
        this.b = q1c0Var;
        this.c = eVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Long l = (Long) obj;
        long jLongValue = l.longValue();
        HashMap map = this.a;
        map.put(l, "not_interested");
        q1c0.s2(this.c, map);
        q1c0 q1c0Var = this.b;
        q1c0Var.l2(jLongValue);
        q1c0Var.P1("tournament_not_interested", true);
        return Unit.a;
    }
}
