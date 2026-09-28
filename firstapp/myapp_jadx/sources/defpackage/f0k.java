package defpackage;

import com.google.gson.internal.Excluder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Objects;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class f0k implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ j8i0 b;

    public /* synthetic */ f0k(j8i0 j8i0Var, int i) {
        this.a = i;
        this.b = j8i0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        j8i0 j8i0Var = this.b;
        switch (i) {
            case 0:
                Excluder excluder = Excluder.c;
                HashMap map = new HashMap();
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                pyf0.a aVar = eal.n;
                pyf0.b bVar = eal.o;
                ArrayDeque arrayDeque = new ArrayDeque();
                zti ztiVar = zti.e;
                Objects.requireNonNull(ztiVar);
                ArrayList arrayList3 = new ArrayList(arrayList2.size() + arrayList.size() + 3);
                arrayList3.addAll(arrayList);
                Collections.reverse(arrayList3);
                ArrayList arrayList4 = new ArrayList(arrayList2);
                Collections.reverse(arrayList4);
                arrayList3.addAll(arrayList4);
                boolean z = mkd0.a;
                return new eal(excluder, jjh.a, new HashMap(map), ztiVar, new ArrayList(arrayList), new ArrayList(arrayList2), arrayList3, aVar, bVar, new ArrayList(arrayDeque)).j(((g0k) j8i0Var).a);
            default:
                pjp pjpVar = (pjp) j8i0Var;
                return e1i.e(new n1i(pjpVar.f1.N(), pjpVar.m1, new njp(pjpVar, null)), o8i0.d(pjpVar), q490.a.a, m2g.a);
        }
    }
}
