package defpackage;

import com.sporty.android.core.model.pocket.common.ChannelAsset;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class hwp implements Function1 {
    public final /* synthetic */ int a;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) throws Exception {
        switch (this.a) {
            case 0:
                mwp mwpVar = (mwp) obj;
                mwpVar.getClass();
                return mwpVar.getClass();
            case 1:
                vp60 vp60Var = (vp60) obj;
                vp60Var.getClass();
                hq60 hq60VarH1 = vp60Var.H1("DELETE FROM sporty_bet_table");
                try {
                    hq60VarH1.D1();
                    return Unit.a;
                } finally {
                    hq60VarH1.close();
                }
            default:
                ChannelAsset channelAsset = (ChannelAsset) obj;
                channelAsset.getClass();
                return channelAsset.getEntityList();
        }
    }
}
