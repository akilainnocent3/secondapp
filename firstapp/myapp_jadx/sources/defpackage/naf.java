package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import androidx.compose.ui.layout.v;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final class naf implements haf {
    public final abf a;
    public final Integer b;
    public final paf c;

    public naf(abf abfVar, Integer num, paf pafVar) {
        i3z i3zVar = i3z.a;
        abfVar.getClass();
        this.a = abfVar;
        this.b = num;
        this.c = pafVar;
    }

    @Override // defpackage.haf
    public final d a(d dVar, final faf fafVar, final gaf gafVar, final psw pswVar) {
        dVar.getClass();
        return c.a(dVar, gnn.a, new gaj() { // from class: kaf
            @Override // defpackage.gaj
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                d dVar2 = (d) obj;
                a aVar = (a) obj2;
                ((Integer) obj3).getClass();
                dVar2.getClass();
                aVar.N(-1097498071);
                aq40 aq40Var = new aq40();
                Object objY = aVar.y();
                a.C0041a.C0042a c0042a = a.C0041a.a;
                if (objY == c0042a) {
                    objY = Float.valueOf(0.0f);
                    aVar.r(objY);
                }
                aq40Var.a = ((Number) objY).floatValue();
                bq40 bq40Var = new bq40();
                Object objY2 = aVar.y();
                if (objY2 == c0042a) {
                    objY2 = 0;
                    aVar.r(objY2);
                }
                bq40Var.a = ((Number) objY2).intValue();
                naf nafVar = this.a;
                d dVarA = v.a(dVar2, new Function1(nafVar, bq40Var) { // from class: iaf
                    public final /* synthetic */ bq40 b;

                    {
                        this.b = bq40Var;
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj4) {
                        urr urrVar = (urr) obj4;
                        urrVar.getClass();
                        i3z i3zVar = i3z.a;
                        this.a.a = Float.intBitsToFloat((int) (urrVar.i0(0L) & 4294967295L));
                        this.b.a = (int) (urrVar.a() & 4294967295L);
                        return Unit.a;
                    }
                });
                boolean zA = aVar.A(nafVar);
                Object objY3 = aVar.y();
                if (zA || objY3 == c0042a) {
                    objY3 = new jaf(nafVar, 0);
                    aVar.r(objY3);
                }
                kcf kcfVarB = y9f.b((Function1) objY3, aVar);
                i3z i3zVar = i3z.a;
                abf abfVar = nafVar.a;
                Integer num = nafVar.b;
                abfVar.getClass();
                boolean z = ((Boolean) a6a0.b(new waf(num, abfVar)).getValue()).booleanValue() || !((Boolean) abfVar.f.getValue()).booleanValue();
                laf lafVar = new laf(fafVar, aq40Var, nafVar, bq40Var, null);
                boolean zA2 = aVar.A(nafVar);
                gaf gafVar2 = gafVar;
                boolean zA3 = zA2 | aVar.A(gafVar2);
                Object objY4 = aVar.y();
                if (zA3 || objY4 == c0042a) {
                    objY4 = new maf(nafVar, gafVar2, null);
                    aVar.r(objY4);
                }
                d dVarA2 = y9f.a(dVarA, kcfVarB, i3zVar, z, pswVar, false, lafVar, (gaj) objY4, false, 144);
                aVar.H();
                return dVarA2;
            }
        });
    }
}
