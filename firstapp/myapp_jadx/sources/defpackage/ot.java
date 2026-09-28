package defpackage;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public abstract class ot {
    public final pt a;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public pt h;
    public boolean b = true;
    public final HashMap i = new HashMap();

    public static final class a extends qlr implements Function1<pt, Unit> {
        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(pt ptVar) {
            ot otVar;
            pt ptVar2 = ptVar;
            if (ptVar2.i()) {
                if (ptVar2.s().b) {
                    ptVar2.J();
                }
                Iterator it = ptVar2.s().i.entrySet().iterator();
                while (true) {
                    boolean zHasNext = it.hasNext();
                    otVar = ot.this;
                    if (!zHasNext) {
                        break;
                    }
                    Map.Entry entry = (Map.Entry) it.next();
                    otVar.a((kt) entry.getKey(), ((Number) entry.getValue()).intValue(), ptVar2.U());
                }
                ywx ywxVar = ptVar2.U().I;
                ywxVar.getClass();
                while (!ywxVar.equals(otVar.a.U())) {
                    for (kt ktVar : otVar.c(ywxVar).keySet()) {
                        otVar.a(ktVar, otVar.d(ywxVar, ktVar), ywxVar);
                    }
                    ywxVar = ywxVar.I;
                    ywxVar.getClass();
                }
            }
            return Unit.a;
        }
    }

    public ot(pt ptVar) {
        this.a = ptVar;
    }

    public final void a(kt ktVar, int i, ywx ywxVar) {
        long jB;
        float f = i;
        long jFloatToRawIntBits = ((long) Float.floatToRawIntBits(f)) << 32;
        long jFloatToRawIntBits2 = ((long) Float.floatToRawIntBits(f)) & 4294967295L;
        loop0: while (true) {
            jB = jFloatToRawIntBits | jFloatToRawIntBits2;
            do {
                jB = b(ywxVar, jB);
                ywxVar = ywxVar.I;
                ywxVar.getClass();
                if (ywxVar.equals(this.a.U())) {
                    break loop0;
                }
            } while (!c(ywxVar).containsKey(ktVar));
            float fD = d(ywxVar, ktVar);
            long jFloatToRawIntBits3 = Float.floatToRawIntBits(fD);
            long jFloatToRawIntBits4 = Float.floatToRawIntBits(fD);
            jFloatToRawIntBits = jFloatToRawIntBits3 << 32;
            jFloatToRawIntBits2 = jFloatToRawIntBits4 & 4294967295L;
        }
        int iRound = Math.round(ktVar instanceof mjm ? Float.intBitsToFloat((int) (jB & 4294967295L)) : Float.intBitsToFloat((int) (jB >> 32)));
        HashMap map = this.i;
        if (map.containsKey(ktVar)) {
            int iIntValue = ((Number) kpu.c(ktVar, map)).intValue();
            mjm mjmVar = mt.a;
            iRound = ktVar.a.invoke(Integer.valueOf(iIntValue), Integer.valueOf(iRound)).intValue();
        }
        map.put(ktVar, Integer.valueOf(iRound));
    }

    public abstract long b(ywx ywxVar, long j);

    public abstract Map<kt, Integer> c(ywx ywxVar);

    public abstract int d(ywx ywxVar, kt ktVar);

    public final boolean e() {
        return this.c || this.e || this.f || this.g;
    }

    public final boolean f() {
        i();
        return this.h != null;
    }

    public final void g() {
        this.b = true;
        pt ptVar = this.a;
        pt ptVarA = ptVar.A();
        if (ptVarA == null) {
            return;
        }
        if (this.c) {
            ptVarA.k0();
        } else if (this.e || this.d) {
            ptVarA.requestLayout();
        }
        if (this.f) {
            ptVar.k0();
        }
        if (this.g) {
            ptVar.requestLayout();
        }
        ptVarA.s().g();
    }

    public final void h() {
        HashMap map = this.i;
        map.clear();
        a aVar = new a();
        pt ptVar = this.a;
        ptVar.h0(aVar);
        map.putAll(c(ptVar.U()));
        this.b = false;
    }

    public final void i() {
        ot otVarS;
        ot otVarS2;
        boolean zE = e();
        pt ptVar = this.a;
        if (!zE) {
            pt ptVarA = ptVar.A();
            if (ptVarA == null) {
                return;
            }
            ptVar = ptVarA.s().h;
            if (ptVar == null || !ptVar.s().e()) {
                pt ptVar2 = this.h;
                if (ptVar2 == null || ptVar2.s().e()) {
                    return;
                }
                pt ptVarA2 = ptVar2.A();
                if (ptVarA2 != null && (otVarS2 = ptVarA2.s()) != null) {
                    otVarS2.i();
                }
                pt ptVarA3 = ptVar2.A();
                ptVar = (ptVarA3 == null || (otVarS = ptVarA3.s()) == null) ? null : otVarS.h;
            }
        }
        this.h = ptVar;
    }
}
