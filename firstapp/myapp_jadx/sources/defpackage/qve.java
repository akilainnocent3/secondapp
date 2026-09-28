package defpackage;

import androidx.navigation.fragment.a;
import androidx.navigation.fragment.b;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class qve implements Function1 {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ghx ghxVar = (ghx) obj;
        ghxVar.getClass();
        o2g o2gVar = o2g.a;
        o2gVar.getClass();
        wkx wkxVar = ghxVar.i;
        wkxVar.getClass();
        a aVar = (a) wkxVar.b(wkx.a.a(a.class));
        dq7 dq7VarA = jq40.a(xwe.class);
        dq7 dq7VarA2 = jq40.a(kxe.class);
        b bVar = new b(aVar, dq7VarA, o2gVar);
        bVar.i = dq7VarA2;
        bVar.e = "DobVerificationFragment";
        ArrayList arrayList = ghxVar.m;
        arrayList.add(bVar.a());
        a aVar2 = (a) wkxVar.b(wkx.a.a(a.class));
        dq7 dq7VarA3 = jq40.a(hwe.class);
        dq7 dq7VarA4 = jq40.a(lwe.class);
        b bVar2 = new b(aVar2, dq7VarA3, o2gVar);
        bVar2.i = dq7VarA4;
        bVar2.e = "DobSuccessFragment";
        arrayList.add(bVar2.a());
        return Unit.a;
    }
}
