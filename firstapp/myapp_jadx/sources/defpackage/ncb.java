package defpackage;

import androidx.navigation.fragment.a;
import androidx.navigation.fragment.b;
import com.google.android.gms.common.annotation.LjLk.llGRV;
import com.sporty.android.platform.features.account.verifiedemailchange.model.EmailChangeFlowArgs;
import com.sporty.android.platform.features.account.verifiedemailchange.verifyidentity.model.EmailChangeVerifyIdentityArgs;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ncb implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ ncb(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                ((Integer) obj).getClass();
                return Unit.a;
            case 1:
                ghx ghxVar = (ghx) obj;
                ghxVar.getClass();
                Map mapB = jpu.b(new Pair(jq40.b(EmailChangeFlowArgs.class), new qwf(false)));
                wkx wkxVar = ghxVar.i;
                wkxVar.getClass();
                a aVar = (a) wkxVar.b(wkx.a.a(a.class));
                dq7 dq7VarA = jq40.a(pxf.class);
                dq7 dq7VarA2 = jq40.a(uxf.class);
                mapB.getClass();
                b bVar = new b(aVar, dq7VarA, (Map<qhp, djx<?>>) mapB);
                bVar.i = dq7VarA2;
                bVar.e = llGRV.gxUwcVpRVwOQfpg;
                ArrayList arrayList = ghxVar.m;
                arrayList.add(bVar.a());
                Map mapB2 = jpu.b(new Pair(jq40.b(EmailChangeVerifyIdentityArgs.class), new pzf(false)));
                a aVar2 = (a) wkxVar.b(wkx.a.a(a.class));
                dq7 dq7VarA3 = jq40.a(ozf.class);
                dq7 dq7VarA4 = jq40.a(tzf.class);
                mapB2.getClass();
                b bVar2 = new b(aVar2, dq7VarA3, (Map<qhp, djx<?>>) mapB2);
                bVar2.i = dq7VarA4;
                bVar2.e = "EmailChangeVerifyIdentityFragment";
                arrayList.add(bVar2.a());
                o2g o2gVar = o2g.a;
                o2gVar.getClass();
                a aVar3 = (a) wkxVar.b(wkx.a.a(a.class));
                dq7 dq7VarA5 = jq40.a(y47.class);
                dq7 dq7VarA6 = jq40.a(ywf.class);
                b bVar3 = new b(aVar3, dq7VarA5, o2gVar);
                bVar3.i = dq7VarA6;
                bVar3.e = "EmailChangeNewEmailFragment";
                arrayList.add(bVar3.a());
                return Unit.a;
            case 2:
                t2q.b bVar4 = (t2q.b) obj;
                bVar4.getClass();
                return Boolean.valueOf(bVar4 instanceof t2q.a);
            default:
                szr szrVar = (szr) obj;
                szrVar.getClass();
                szr.h(szrVar, null, qe9.a, 3);
                gav.c(szrVar);
                return Unit.a;
        }
    }
}
