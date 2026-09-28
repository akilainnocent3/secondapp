package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.ui.d;
import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class aoe implements gaj {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ aoe(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.gaj
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        Object obj4 = this.b;
        switch (i) {
            case 0:
                d dVar = (d) obj;
                a aVar = (a) obj2;
                e3w.a((Integer) obj3, dVar, aVar, -1697257652);
                d dVarC = androidx.compose.ui.draw.a.c(dVar, new h87(2.0f, ((Number) ((twd0) obj4).getValue()).floatValue(), ((ast) aVar.O(cst.e)).B, j060.c(((zib0) aVar.O(ajb0.a)).d)));
                aVar.H();
                return dVarC;
            default:
                ((Integer) obj3).getClass();
                ((jh0) obj).getClass();
                gqi0.n((ori0) obj4, (a) obj2, 0);
                return Unit.a;
        }
    }
}
