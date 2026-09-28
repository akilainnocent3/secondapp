package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class se80 implements Function2 {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ygp ygpVar = (ygp) obj;
        List list = (List) obj2;
        ygpVar.getClass();
        list.getClass();
        ArrayList arrayListF = ue80.f(ve80.a, list, true);
        arrayListF.getClass();
        php phpVarA = ue80.a(ygpVar, arrayListF, new hk8(list, 2));
        if (phpVarA != null) {
            return hj5.a(phpVarA);
        }
        return null;
    }
}
