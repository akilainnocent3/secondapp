package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.core.model.tracking.AnalyticsEvent;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lf4n;", "Lj8i0;", "instantWin"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class f4n extends j8i0 {
    public final rdd0 a;
    public final y8j b;
    public x2n c;
    public final ku90<z3n> d;
    public final wwd0 e;

    public f4n(cmo cmoVar, rdd0 rdd0Var, y8j y8jVar) {
        ResourceUiText resourceUiText;
        f3n.d dVar;
        rdd0Var.getClass();
        y8jVar.getClass();
        this.a = rdd0Var;
        this.b = y8jVar;
        this.d = new ku90<>();
        Integer numB = cmoVar.b("sr:sport:2");
        Integer numC = cmoVar.c("sr:sport:2");
        fqo.a.b bVar = new fqo.a.b(numB);
        if (numC != null) {
            int iIntValue = numC.intValue();
            StringUiText stringUiText = vch0.a;
            resourceUiText = new ResourceUiText(iIntValue);
        } else {
            resourceUiText = null;
        }
        fqo fqoVar = new fqo(bVar, resourceUiText);
        if ((16383 & 1) != 0) {
            dVar = new f3n.d((31 & 1) != 0 ? vch0.a : null, (31 & 2) != 0 ? vch0.a : null, (31 & 4) != 0 ? vch0.a : null, false, true);
        } else {
            dVar = null;
        }
        f3n.f fVar = new f3n.f(false, "");
        f3n.i iVar = new f3n.i("", "", "", "", 0, 0, 0, 0, false);
        f3n.g gVar = new f3n.g(0, 0L);
        f3n.e eVar = new f3n.e(vch0.a, false);
        f3n.a aVar = new f3n.a(false, "");
        f3n.b bVar2 = new f3n.b(vch0.a, "", false);
        f3n.h hVar = new f3n.h(3, (qcn) null);
        f3n.c cVar = (16383 & 256) != 0 ? new f3n.c(false) : null;
        k3n k3nVar = k3n.a;
        pg00 pg00Var = pg00.e;
        this.e = xwd0.a(new c4n(fqoVar, new f3n(dVar, fVar, iVar, gVar, eVar, aVar, bVar2, hVar, cVar, k3nVar, null, null, pg00Var, pg00Var)));
    }

    public final void x1(y3n y3nVar) {
        Object value;
        c4n c4nVar;
        f3n f3nVar;
        qcn qcnVarB;
        Object value2;
        c4n c4nVar2;
        f3n f3nVar2;
        qcn qcnVarB2;
        if (y3nVar.equals(y3n.b.a)) {
            this.d.a(z3n.a.a);
            return;
        }
        boolean z = y3nVar instanceof y3n.c;
        wwd0 wwd0Var = this.e;
        if (z) {
            String str = ((y3n.c) y3nVar).a;
            do {
                value2 = wwd0Var.getValue();
                c4nVar2 = (c4n) value2;
                f3nVar2 = c4nVar2.b;
                f3n.h hVar = f3nVar2.h;
                qcn<a4n> qcnVar = hVar.b;
                ArrayList arrayList = new ArrayList(l48.r(qcnVar, 10));
                for (Object objA : qcnVar) {
                    if (objA instanceof a4n.b) {
                        a4n.b bVar = (a4n.b) objA;
                        objA = Intrinsics.g(bVar.a, str) ? a4n.b.a(bVar, !bVar.h, 0, 0, null, null, 65407) : bVar;
                    }
                    arrayList.add(objA);
                }
                qcnVarB2 = a4h.b(arrayList);
                hVar.getClass();
                qcnVarB2.getClass();
            } while (!wwd0Var.g(value2, new c4n(c4nVar2.a, f3n.a(f3nVar2, null, null, null, null, null, null, null, new f3n.h(qcnVarB2, true), null, null, null, null, null, null, 16255))));
            return;
        }
        if (!(y3nVar instanceof y3n.a)) {
            if (!(y3nVar instanceof x3n)) {
                uhc.a();
                return;
            }
            a5o.a aVar = new a5o.a("sr:sport:2");
            this.a.a(aVar, k00.d);
            this.b.f(AnalyticsEvent.IV_ANIMATION_ERROR, aVar.createCustomMetrics());
            return;
        }
        boolean z2 = ((y3n.a) y3nVar).a;
        do {
            value = wwd0Var.getValue();
            c4nVar = (c4n) value;
            f3nVar = c4nVar.b;
            f3n.h hVar2 = f3nVar.h;
            qcn<a4n> qcnVar2 = hVar2.b;
            ArrayList arrayList2 = new ArrayList(l48.r(qcnVar2, 10));
            for (Object objA2 : qcnVar2) {
                if (objA2 instanceof a4n.b) {
                    objA2 = a4n.b.a((a4n.b) objA2, z2, 0, 0, null, null, 65407);
                }
                arrayList2.add(objA2);
            }
            qcnVarB = a4h.b(arrayList2);
            hVar2.getClass();
            qcnVarB.getClass();
        } while (!wwd0Var.g(value, new c4n(c4nVar.a, f3n.a(f3nVar, null, null, null, null, null, null, null, new f3n.h(qcnVarB, true), null, null, null, null, null, null, 16255))));
    }
}
