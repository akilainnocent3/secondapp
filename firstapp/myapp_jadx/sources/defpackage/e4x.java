package defpackage;

import com.sporty.android.core.model.dispatcher.Dispatcher;
import com.sporty.android.core.model.dispatcher.SportyDispatchers;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Le4x;", "Lj8i0;", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class e4x extends j8i0 {
    public static final f4x i = f4x.e;
    public final h4x a;
    public final b390 b;
    public boolean c;
    public final lyh<Map<f4x, Boolean>> d;
    public final lyh<Map<f4x, Boolean>> e;
    public final v340 f;

    public e4x(h4x h4xVar, @Dispatcher(sportyDispatcher = SportyDispatchers.IO) odd oddVar) {
        kwd0 kwd0Var;
        h4xVar.getClass();
        this.a = h4xVar;
        b390 b390VarB = d390.b(1, 0, null, 6);
        this.b = b390VarB;
        this.c = true;
        f4x f4xVar = i;
        b390VarB.a(f4xVar);
        this.d = ozh.c(new or60(new m4x(h4xVar, null)), h4xVar.d);
        uag uagVar = f4x.w;
        ArrayList arrayList = new ArrayList(l48.r(uagVar, 10));
        q3.b bVar = new q3.b();
        while (true) {
            boolean zHasNext = bVar.hasNext();
            kwd0Var = q490.a.a;
            if (!zHasNext) {
                break;
            }
            f4x f4xVar2 = (f4x) bVar.next();
            h4x h4xVar2 = this.a;
            h4xVar2.getClass();
            f4xVar2.getClass();
            m2l m2lVar = h4xVar2.b;
            String str = f4xVar2.c;
            m2lVar.getClass();
            arrayList.add(e1i.e(m2lVar.a.getBooleanByFlow(str, false), o8i0.d(this), kwd0Var, Boolean.FALSE));
        }
        lyh<Map<f4x, Boolean>> lyhVarC = ozh.c(new c4x((lyh[]) CollectionsKt.A0(arrayList).toArray(new lyh[0])), oddVar);
        this.e = lyhVarC;
        k1i k1iVarA = r1i.a(this.b, this.d, lyhVarC, new d4x(this, null));
        et7 et7VarD = o8i0.d(this);
        f4x[] f4xVarArrValues = f4x.values();
        ArrayList arrayList2 = new ArrayList(f4xVarArrValues.length);
        for (f4x f4xVar3 : f4xVarArrValues) {
            arrayList2.add(new b4x(f4xVar3, false));
        }
        this.f = e1i.e(k1iVarA, et7VarD, kwd0Var, new w3x(f4xVar, a4h.f(arrayList2)));
    }

    @Override // defpackage.j8i0
    public final void onCleared() {
        super.onCleared();
        h4x h4xVar = this.a;
        h4xVar.getClass();
        zu7.a aVar = zu7.a;
        k5b k5bVar = h4xVar.d;
        ej5.c(zu7.b(k5bVar), null, null, new i4x(h4xVar, null), 3);
    }
}
