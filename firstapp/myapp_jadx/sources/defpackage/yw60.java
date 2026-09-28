package defpackage;

import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class yw60 implements Function1 {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        obj.getClass();
        List list = (List) obj;
        Object obj2 = list.get(0);
        afs.a aVar = obj2 != null ? (afs.a) obj2 : null;
        aVar.getClass();
        float f = aVar.a;
        Object obj3 = list.get(1);
        afs.c cVar = obj3 != null ? (afs.c) obj3 : null;
        cVar.getClass();
        int i = cVar.a;
        Object obj4 = list.get(2);
        (obj4 != null ? (afs.b) obj4 : null).getClass();
        return new afs(f, i, 0);
    }
}
