package defpackage;

import com.google.protobuf.DescriptorProtos;
import com.sporty.android.core.model.config.bo.enums.BOConfigParam;
import com.sporty.android.core.model.instantwin.NetworkVirtualInHouseGamePromotionBanner;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.data.repository.VirtualInHouseGamePromotionBannerRepoImpl", f = "VirtualInHouseGamePromotionBannerRepoImpl.kt", l = {DescriptorProtos.FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER, 52}, m = "getVirtualInHouseGamePromotionBanner-IoAF18A", v = 2)
public final class mfi0 extends x1b {
    public ofi0 a;
    public BOConfigParam b;
    public NetworkVirtualInHouseGamePromotionBanner c;
    public String d;
    public /* synthetic */ Object e;
    public final /* synthetic */ ofi0 f;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mfi0(ofi0 ofi0Var, x1b x1bVar) {
        super(x1bVar);
        this.f = ofi0Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.i |= Integer.MIN_VALUE;
        Object objA = this.f.a(this);
        return objA == y5b.a ? objA : new zi50(objA);
    }
}
