package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class rb1 implements Function1<t91.e, t91.e> {
    public final /* synthetic */ String a;

    public rb1(String str) {
        this.a = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final t91.e invoke(t91.e eVar) {
        t91.e eVar2 = eVar;
        eVar2.getClass();
        List<i91> list = eVar2.e;
        ArrayList arrayList = new ArrayList(l48.r(list, 10));
        for (i91 i91VarA : list) {
            if (Intrinsics.g(i91VarA.a, this.a)) {
                i91VarA = i91.a(i91VarA, null, false, 1032191);
            }
            arrayList.add(i91VarA);
        }
        return t91.e.a(eVar2, arrayList);
    }
}
