package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class oy1 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ oy1(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean z;
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                return py1.observeLanguage$lambda$0((py1) obj2, (Boolean) obj);
            case 1:
                t4b t4bVar = (t4b) obj2;
                List list = (List) obj;
                if (t4bVar.H.d() != null) {
                    vkf0 vkf0VarD = t4bVar.H.d();
                    vkf0VarD.getClass();
                    list.add(vkf0VarD.a);
                    z = true;
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            default:
                ((Function1) obj2).invoke(new igm.d.b(((Long) obj).longValue()));
                return Unit.a;
        }
    }
}
