package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class jin implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ jin(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                t3w t3wVar = (t3w) obj;
                t3wVar.getClass();
                win winVar = new win();
                eae0 eae0Var = zn70.e;
                kqp kqpVar = kqp.a;
                m2g m2gVar = m2g.a;
                t3wVar.a(new pu90(new yd2(eae0Var, jq40.a(d4l.class), null, winVar, kqpVar, m2gVar)));
                int i = 1;
                ij9 ij9Var = new ij9(i);
                kqp kqpVar2 = kqp.b;
                t3wVar.a(new u7h(new yd2(eae0Var, jq40.a(t4l.class), null, ij9Var, kqpVar2, m2gVar)));
                t3wVar.a(new u7h(new yd2(eae0Var, jq40.a(qtm.class), null, new rjn(), kqpVar2, m2gVar)));
                t3wVar.a(new u7h(new yd2(eae0Var, jq40.a(ksm.class), null, new vjn(), kqpVar2, m2gVar)));
                t3wVar.a(new u7h(new yd2(eae0Var, jq40.a(que0.class), null, new zjn(), kqpVar2, m2gVar)));
                t3wVar.a(new u7h(new yd2(eae0Var, jq40.a(cwe0.class), null, new ek9(1), kqpVar2, m2gVar)));
                t3wVar.a(new u7h(new yd2(eae0Var, jq40.a(zve0.class), null, new ekn(), kqpVar2, m2gVar)));
                t3wVar.a(new u7h(new yd2(eae0Var, jq40.a(aof0.class), null, new mn4(i), kqpVar2, m2gVar)));
                t3wVar.a(new u7h(new yd2(eae0Var, jq40.a(f0f0.class), null, new on4(2), kqpVar2, m2gVar)));
                t3wVar.a(new u7h(new yd2(eae0Var, jq40.a(g58.class), null, new vin(), kqpVar2, m2gVar)));
                t3wVar.a(new u7h(new yd2(eae0Var, jq40.a(iue0.class), null, new ajn(0), kqpVar2, m2gVar)));
                rn4.a(new yd2(eae0Var, jq40.a(ise0.class), null, new yi9((byte) 0, 1), kqpVar2, m2gVar), t3wVar);
                break;
            default:
                lza lzaVar = (lza) obj;
                lzaVar.getClass();
                lzaVar.b2();
                long j = j58.l;
                float fIntBitsToFloat = Float.intBitsToFloat((int) (lzaVar.d() >> 32)) - lzaVar.C1(16.0f);
                tcf.m0(lzaVar, j, 0L, (((long) Float.floatToRawIntBits(lzaVar.C1(16.0f))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32), 0.0f, null, 6, 58);
                tcf.m0(lzaVar, j, (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (lzaVar.d() & 4294967295L)) - lzaVar.C1(16.0f))) & 4294967295L), (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (lzaVar.d() >> 32)) - lzaVar.C1(16.0f))) << 32) | (((long) Float.floatToRawIntBits(lzaVar.C1(16.0f))) & 4294967295L), 0.0f, null, 6, 56);
                break;
        }
        return Unit.a;
    }
}
