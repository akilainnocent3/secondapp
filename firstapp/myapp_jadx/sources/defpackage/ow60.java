package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ow60 implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ ow60(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                if (Intrinsics.g(obj, Boolean.FALSE)) {
                    return new omf0(omf0.c);
                }
                obj.getClass();
                List list = (List) obj;
                Object obj2 = list.get(0);
                Float f = obj2 != null ? (Float) obj2 : null;
                f.getClass();
                float fFloatValue = f.floatValue();
                Object obj3 = list.get(1);
                pmf0 pmf0Var = obj3 != null ? (pmf0) obj3 : null;
                pmf0Var.getClass();
                return new omf0(d2l.g(fFloatValue, pmf0Var.a));
            default:
                pb80 pb80Var = (pb80) obj;
                pb80Var.getClass();
                mb80.a(pb80Var);
                return Unit.a;
        }
    }
}
