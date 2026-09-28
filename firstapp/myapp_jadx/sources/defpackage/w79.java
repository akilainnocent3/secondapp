package defpackage;

import androidx.compose.runtime.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class w79 implements Function2 {
    public final /* synthetic */ int a;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    uro.d(0, aVar);
                } else {
                    aVar.G();
                }
                return Unit.a;
            default:
                qn70 qn70Var = (qn70) obj;
                Object objA = ((zym) qn4.a(qn70Var, (wrz) obj2, zym.class, null, null)).a(false, (OkHttpClient) qn70Var.a(jq40.a(OkHttpClient.class), null, null), qn70Var.a(jq40.a(wu00.class), null, null), qn70Var.a(jq40.a(Interceptor.class), null, wn50.a), qn70Var.a(jq40.a(Interceptor.class), null, un50.a)).a(mjz.class);
                objA.getClass();
                return (mjz) objA;
        }
    }
}
