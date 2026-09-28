package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.core.model.MyLog;
import com.sportybet.plugin.realsports.data.OneCutData;

/* JADX INFO: loaded from: classes7.dex */
public final class aqy extends fte<BaseResponse<OneCutData>> {
    public final /* synthetic */ bqy.b a;
    public final /* synthetic */ bqy b;

    public aqy(bqy bqyVar, bqy.b bVar) {
        this.b = bqyVar;
        this.a = bVar;
    }

    @Override // defpackage.zu90
    public final void onError(Throwable th) {
        itf0.a aVar = itf0.a;
        aVar.q(MyLog.TAG_CONFIG);
        aVar.n("fail to create OneCutConfig from data: %s", th.toString());
        bqy.b bVar = this.a;
        if (bVar != null) {
            bVar.a();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.zu90
    public final void onSuccess(Object obj) {
        OneCutData oneCutData = (OneCutData) ((BaseResponse) obj).data;
        bqy.a aVar = null;
        if (oneCutData != null) {
            try {
                bqy.a aVar2 = new bqy.a();
                aVar2.a = oneCutData.getStatus();
                if (oneCutData.getSliderEnabled() != null) {
                    aVar2.b = oneCutData.getSliderEnabled().booleanValue();
                } else {
                    aVar2.b = false;
                }
                if (oneCutData.getMinOneCutStakePct() != null) {
                    aVar2.c = oneCutData.getMinOneCutStakePct().doubleValue();
                }
                if (oneCutData.getMaxOneCutStakePct() != null) {
                    aVar2.d = oneCutData.getMaxOneCutStakePct().doubleValue();
                }
                aVar = aVar2;
            } catch (Exception e) {
                itf0.a aVar3 = itf0.a;
                aVar3.q(MyLog.TAG_CONFIG);
                aVar3.n("Failed to create OneCutConfig from data: %s, exception: %s", oneCutData, e.toString());
            }
        }
        bqy bqyVar = this.b;
        bqyVar.b = aVar;
        bqyVar.c = System.currentTimeMillis();
        itf0.a aVar4 = itf0.a;
        aVar4.q(MyLog.TAG_CONFIG);
        aVar4.n("success to create OneCutConfig from data: %s", bqyVar.b);
        bqy.b bVar = this.a;
        if (bVar != null) {
            bVar.b(bqyVar.b);
        }
    }
}
