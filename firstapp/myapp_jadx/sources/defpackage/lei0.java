package defpackage;

import com.sportygames.common.framework.network.HTTPResponse;
import com.sportygames.newcms.b;
import com.sportygames.newcms.d;
import com.sportygames.vip.data.EliteTopWinsThisWeekItem;
import com.sportygames.vip.data.LastHeroStandingListResponse;
import com.sportygames.vip.data.StakeSafeUsageCountResponse;
import com.sportygames.vip.data.TopWinsLastWeekResponse;
import com.sportygames.vip.data.TurboUsageCountResponse;
import com.sportygames.vip.data.UserTopCoeffResponse;
import com.sportygames.vip.data.VipFeatureListResponse;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class lei0 extends j8i0 {
    public final ssw<izs<HTTPResponse<UserTopCoeffResponse>>> A;
    public final d a;
    public final zai0 b;
    public final f0n c;
    public boolean d;
    public final wwd0 e;
    public final ssw<izs<HTTPResponse<StakeSafeUsageCountResponse>>> f;
    public final ssw<izs<HTTPResponse<TurboUsageCountResponse>>> i;
    public final ssw<izs<HTTPResponse<VipFeatureListResponse>>> v;
    public final ssw<izs<HTTPResponse<List<EliteTopWinsThisWeekItem>>>> w;
    public final ssw<izs<HTTPResponse<List<LastHeroStandingListResponse>>>> y;
    public final ssw<izs<HTTPResponse<TopWinsLastWeekResponse>>> z;

    public lei0(d dVar, zai0 zai0Var, f0n f0nVar) {
        dVar.getClass();
        zai0Var.getClass();
        f0nVar.getClass();
        this.a = dVar;
        this.b = zai0Var;
        this.c = f0nVar;
        this.e = xwd0.a(new b(0));
        this.f = new ssw<>();
        this.i = new ssw<>();
        this.v = new ssw<>();
        this.w = new ssw<>();
        this.y = new ssw<>();
        this.z = new ssw<>();
        this.A = new ssw<>();
    }
}
