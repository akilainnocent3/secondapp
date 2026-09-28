package defpackage;

import com.sportybet.android.instantwin.presentation.penalty.b;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class ml4 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ml4(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                twd0 twd0Var = (twd0) obj2;
                tcf tcfVar = (tcf) obj;
                tcfVar.getClass();
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (tcfVar.d() >> 32)) / 2.0f)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (tcfVar.d() & 4294967295L)) * 0.56f)) & 4294967295L);
                float fC = yw90.c(tcfVar.d()) * 0.36f;
                float f = 1.13f * fC;
                double radians = Math.toRadians((((Number) twd0Var.getValue()).floatValue() * 360.0f) - 90.0f);
                int i2 = (int) (jFloatToRawIntBits >> 32);
                int i3 = (int) (jFloatToRawIntBits & 4294967295L);
                long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(((((float) Math.cos(radians)) * fC) * 0.7f) + Float.intBitsToFloat(i2))) << 32) | (((long) Float.floatToRawIntBits((((float) Math.sin(radians)) * fC * 0.7f) + Float.intBitsToFloat(i3))) & 4294967295L);
                long jC = j58.c(0.8f, r58.d(4294917942L));
                float fFloatValue = ((Number) twd0Var.getValue()).floatValue() * 360.0f;
                long jFloatToRawIntBits3 = (((long) Float.floatToRawIntBits(Float.intBitsToFloat(i2) - f)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat(i3) - f)) & 4294967295L);
                float f2 = f * 2.0f;
                tcf.I(tcfVar, jC, -90.0f, fFloatValue, true, jFloatToRawIntBits3, (((long) Float.floatToRawIntBits(f2)) & 4294967295L) | (Float.floatToRawIntBits(f2) << 32), 0.0f, null, 960);
                tcf.Z1(tcfVar, r58.d(4282790677L), jFloatToRawIntBits, jFloatToRawIntBits2, tcfVar.C1(1.8f), 1, null, 480);
                tcf.n0(tcfVar, r58.d(4282790677L), tcfVar.C1(2.0f), jFloatToRawIntBits, 0.0f, null, 120);
                break;
            default:
                zrd0 zrd0Var = (zrd0) obj;
                zrd0Var.getClass();
                ((Function1) obj2).invoke(new b.s.C0300b(zrd0Var));
                break;
        }
        return Unit.a;
    }
}
