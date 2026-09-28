package defpackage;

import com.sportybet.ntespm.socket.Subscriber;
import com.sportybet.plugin.realsports.data.Event;
import com.sportybet.plugin.realsports.data.SocketMarketMessage;
import com.sportygames.commons.models.GiftItem;
import com.sportygames.commons.models.PromotionGiftsResponse;
import com.sportygames.crashInitiated.model.response.DetailResponse;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class ykb implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ykb(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        List<GiftItem> entityList;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                enb enbVar = (enb) obj;
                PromotionGiftsResponse promotionGiftsResponse = enbVar.g0;
                if (promotionGiftsResponse != null && (entityList = promotionGiftsResponse.getEntityList()) != null) {
                    double maxAmount = ((DetailResponse) ((x5a0) enbVar.p0().d0).getValue()).getMaxAmount();
                    double minAmount = ((DetailResponse) ((x5a0) enbVar.p0().d0).getValue()).getMinAmount();
                    xi60 xi60Var = enbVar.j0;
                    if (xi60Var != null) {
                        xi60Var.r0(entityList, maxAmount, minAmount, ((Number) ((x5a0) enbVar.p0().D).getValue()).doubleValue());
                    }
                }
                return Unit.a;
            case 1:
                ((Function1) obj).invoke(c9q.k.a);
                return Unit.a;
            default:
                final t0k0 t0k0Var = (t0k0) obj;
                return new Subscriber() { // from class: p0k0
                    @Override // com.sportybet.ntespm.socket.Subscriber
                    public final void onReceive(String str) {
                        str.getClass();
                        final SocketMarketMessage socketMarketMessageCreate = SocketMarketMessage.create(str);
                        if (socketMarketMessageCreate == null) {
                            return;
                        }
                        final t0k0 t0k0Var2 = t0k0Var;
                        ArrayList arrayList = t0k0Var2.G;
                        String str2 = socketMarketMessageCreate.eventId;
                        str2.getClass();
                        boolean zG1 = t0k0.G1(arrayList, str2, new Function1(t0k0Var2, socketMarketMessageCreate) { // from class: s0k0
                            public final /* synthetic */ SocketMarketMessage a;

                            {
                                this.a = socketMarketMessageCreate;
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                Event event = (Event) obj2;
                                event.getClass();
                                return t0k0.C1(event, this.a);
                            }
                        });
                        ArrayList arrayList2 = t0k0Var2.H;
                        String str3 = socketMarketMessageCreate.eventId;
                        str3.getClass();
                        boolean zG2 = t0k0.G1(arrayList2, str3, new pdz(t0k0Var2, socketMarketMessageCreate));
                        if (zG1 || zG2) {
                            t0k0Var2.I1();
                        }
                    }
                };
        }
    }
}
