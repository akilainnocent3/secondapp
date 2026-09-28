package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class pb2 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ pb2(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ytw ytwVar = (ytw) obj2;
                List list = (List) obj;
                if (ytwVar != null) {
                    ytwVar.setValue(list);
                }
                return Unit.a;
            default:
                ps6 ps6Var = (ps6) obj;
                ps6Var.getClass();
                return Boolean.valueOf(ps6Var.b == ((bq40) obj2).a);
        }
    }
}
