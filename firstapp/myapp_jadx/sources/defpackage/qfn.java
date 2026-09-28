package defpackage;

import java.util.ArrayList;
import kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public final class qfn<T> implements myh {
    public final /* synthetic */ ArrayList a;
    public final /* synthetic */ pfn b;

    public qfn(ArrayList arrayList, pfn pfnVar) {
        this.a = arrayList;
        this.b = pfnVar;
    }

    @Override // defpackage.myh
    public final Object emit(Object obj, v1b v1bVar) {
        xxo xxoVar = (xxo) obj;
        boolean z = xxoVar instanceof c4i;
        ArrayList arrayList = this.a;
        if (z) {
            arrayList.add(xxoVar);
        } else if (xxoVar instanceof d4i) {
            arrayList.remove(((d4i) xxoVar).a);
        }
        boolean z2 = !arrayList.isEmpty();
        pfn pfnVar = this.b;
        if (z2 != pfnVar.K) {
            pfnVar.K = z2;
            pfnVar.s2();
        }
        return Unit.a;
    }
}
