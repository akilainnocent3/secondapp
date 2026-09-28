package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class jd3 implements Function1 {
    public final /* synthetic */ int a;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                List list = (List) obj;
                list.getClass();
                return CollectionsKt.D0(list);
            case 1:
                return Integer.valueOf(-((Integer) obj).intValue());
            default:
                ohp<Object>[] ohpVarArr = lb80.a;
                ob80<Unit> ob80Var = hb80.e;
                Unit unit = Unit.a;
                ((pb80) obj).b(ob80Var, unit);
                return unit;
        }
    }
}
