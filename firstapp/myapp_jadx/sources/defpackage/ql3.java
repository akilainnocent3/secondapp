package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.collections.b;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class ql3 implements Function1 {
    public final /* synthetic */ int a;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                ((Long) obj).getClass();
                return Unit.a;
            default:
                mr5 mr5Var = (mr5) obj;
                mr5Var.getClass();
                List listK = b.k(new j58(r58.b(351330176)), new j58(r58.b(15785856)));
                float fIntBitsToFloat = Float.intBitsToFloat((int) (mr5Var.a.d() & 4294967295L)) / 2.0f;
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L);
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (mr5Var.a.d() >> 32));
                float fIntBitsToFloat3 = Float.intBitsToFloat((int) (mr5Var.a.d() & 4294967295L)) / 2.0f;
                return mr5Var.e(new o7c0(new hfs(listK, null, jFloatToRawIntBits, (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(fIntBitsToFloat3))), 0), 1));
        }
    }
}
