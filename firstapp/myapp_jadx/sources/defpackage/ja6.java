package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.collections.b;
import kotlin.jvm.functions.Function0;
import kotlin.time.h;
import kotlin.time.i;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class ja6 implements Function0 {
    public final /* synthetic */ int a;

    public /* synthetic */ ja6(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return Unit.a;
            default:
                lrp lrpVar = new lrp();
                krp krpVar = lrpVar.a;
                b21 b21Var = krpVar.a;
                b21Var.getClass();
                b21Var.f(v6s.a, "Create eager instances ...");
                i.a.a.getClass();
                h.a.getClass();
                long jB = h.b();
                aon aonVar = krpVar.d;
                ConcurrentHashMap concurrentHashMap = aonVar.c;
                int i = 0;
                pu90[] pu90VarArr = (pu90[]) concurrentHashMap.values().toArray(new pu90[0]);
                ArrayList arrayListF = b.f(Arrays.copyOf(pu90VarArr, pu90VarArr.length));
                concurrentHashMap.clear();
                krp krpVar2 = aonVar.a;
                uf50 uf50Var = new uf50(krpVar2.a, krpVar2.c.d, jq40.a(yux.class), null, null);
                int size = arrayListF.size();
                while (i < size) {
                    Object obj = arrayListF.get(i);
                    i++;
                    ((pu90) obj).b(uf50Var);
                }
                long jB2 = i.a.C0776a.b(jB);
                b21 b21Var2 = krpVar.a;
                StringBuilder sb = new StringBuilder("Created eager instances in ");
                kotlin.time.b.a aVar = kotlin.time.b.b;
                sb.append(kotlin.time.b.j(jB2, rgf.MICROSECONDS) / 1000.0d);
                sb.append(" ms");
                String string = sb.toString();
                b21Var2.getClass();
                b21Var2.f(v6s.a, string);
                return lrpVar;
        }
    }
}
