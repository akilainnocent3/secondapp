package defpackage;

import android.view.View;
import com.sporty.android.core.model.pocket.common.ChannelAsset;
import com.sportybet.plugin.realsports.live.livepage.LivePageActivity;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class h1e implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ h1e(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                view.getClass();
                lop.b(view, Boolean.FALSE);
                r2e r2eVarR0 = ((m1e) obj).P0();
                Object value = r2eVarR0.C0.a.getValue();
                lk50.c cVar = value instanceof lk50.c ? (lk50.c) value : null;
                List<ChannelAsset.Channel> list = cVar != null ? (List) cVar.a : null;
                if (list != null) {
                    ArrayList arrayList = new ArrayList();
                    for (ChannelAsset.Channel channel : list) {
                        ChannelAsset.Channel channel2 = (ChannelAsset.Channel) r2eVarR0.E0.getValue();
                        aoe0.h hVarC = coe0.c(channel, channel2 != null ? channel2.getChannelSendName() : null);
                        if (hVarC != null) {
                            arrayList.add(hVarC);
                        }
                    }
                    wwd0 wwd0Var = r2eVarR0.U;
                    wne0 wne0Var = new wne0(14, arrayList);
                    wwd0Var.getClass();
                    wwd0Var.k(null, wne0Var);
                    ku90<spg0> ku90Var = r2eVarR0.v;
                    int i2 = vpg0.a;
                    ku90Var.getClass();
                    ku90Var.a(new spg0.m(false));
                }
                break;
            default:
                yec yecVar = ((LivePageActivity) obj).W;
                if (yecVar != null) {
                    yecVar.dismiss();
                }
                break;
        }
    }
}
