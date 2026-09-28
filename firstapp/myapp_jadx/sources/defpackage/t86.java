package defpackage;

import com.sportygames.common.business.CommonGameDetails;
import com.sportygames.common.framework.network.HTTPResponse;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.bonuscup.data.repository.CampaignRepository$toTierNotReachedData$4", f = "CampaignRepository.kt", l = {99}, m = "invokeSuspend", v = 1)
public final class t86 extends tje0 implements Function1<v1b<? super HTTPResponse<List<? extends CommonGameDetails>>>, Object> {
    public int a;
    public final /* synthetic */ w86 b;
    public final /* synthetic */ List<String> c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t86(w86 w86Var, List<String> list, v1b<? super t86> v1bVar) {
        super(1, v1bVar);
        this.b = w86Var;
        this.c = list;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(v1b<?> v1bVar) {
        return new t86(this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(v1b<? super HTTPResponse<List<? extends CommonGameDetails>>> v1bVar) {
        return ((t86) create(v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i != 0) {
            if (i == 1) {
                uj50.b(obj);
                return obj;
            }
            ib5.a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        uj50.b(obj);
        rt70 rt70Var = (rt70) this.b.e.getValue();
        String strA0 = CollectionsKt.a0(this.c, ",", null, null, null, 62);
        this.a = 1;
        Object objA = rt70Var.a(strA0, this);
        return objA == y5bVar ? y5bVar : objA;
    }
}
