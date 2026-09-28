package defpackage;

import androidx.compose.runtime.a;
import kotlin.jvm.functions.Function2;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class w92 implements Function2 {
    public final /* synthetic */ int a;

    public /* synthetic */ w92(int i) {
        this.a = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                qn70 qn70Var = (qn70) obj;
                Object objA = ((zym) qn4.a(qn70Var, (wrz) obj2, zym.class, null, null)).a(false, (OkHttpClient) qn70Var.a(jq40.a(OkHttpClient.class), null, null), qn70Var.a(jq40.a(Interceptor.class), null, wn50.a)).a(yc7.class);
                objA.getClass();
                return (yc7) objA;
            default:
                a aVar = (a) obj;
                ((Integer) obj2).getClass();
                aVar.N(1724532178);
                c55 c55Var = c55.a;
                vbs vbsVarB = c55.b(aVar);
                aVar.H();
                return vbsVarB;
        }
    }
}
