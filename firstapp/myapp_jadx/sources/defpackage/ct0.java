package defpackage;

import java.util.Arrays;
import kotlin.Unit;
import kotlin.collections.a;
import kotlin.jvm.functions.Function2;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class ct0 implements Function2 {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        qn70 qn70Var = (qn70) obj;
        zym zymVar = (zym) qn4.a(qn70Var, (wrz) obj2, zym.class, null, null);
        OkHttpClient okHttpClient = (OkHttpClient) qn70Var.a(jq40.a(OkHttpClient.class), null, null);
        ngs ngsVarB = a.b();
        ngsVarB.add(qn70Var.a(jq40.a(Interceptor.class), null, wn50.a));
        ngsVarB.add(qn70Var.a(jq40.a(Interceptor.class), null, un50.a));
        Unit unit = Unit.a;
        Interceptor[] interceptorArr = (Interceptor[]) a.a(ngsVarB).toArray(new Interceptor[0]);
        return zymVar.a(true, okHttpClient, (Interceptor[]) Arrays.copyOf(interceptorArr, interceptorArr.length));
    }
}
