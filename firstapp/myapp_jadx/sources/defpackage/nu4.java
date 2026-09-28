package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.collections.b;
import kotlin.jvm.functions.Function1;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class nu4 implements Function1 {
    public final /* synthetic */ int a;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                tcf tcfVar = (tcf) obj;
                tcfVar.getClass();
                long j = j58.f;
                List listK = b.k(new j58(j58.c(0.1f, j)), new j58(j58.c(0.05f, j)), new j58(j58.c(0.03f, j)), new j58(j58.c(0.0f, j)), new j58(j58.c(0.5f, r58.d(4279440666L))));
                float fIntBitsToFloat = Float.intBitsToFloat((int) (tcfVar.d() >> 32)) / 2.0f;
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (tcfVar.d() & 4294967295L)) * 1.1f;
                tcf.V1(tcfVar, new vu30(listK, null, (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L), Float.intBitsToFloat((int) (tcfVar.d() >> 32)) / 2.0f), 0L, 0L, 0.0f, null, null, 0, WebSocketProtocol.PAYLOAD_SHORT);
                return Unit.a;
            default:
                pt00 pt00Var = (pt00) obj;
                pt00Var.getClass();
                return pt00Var.b;
        }
    }
}
