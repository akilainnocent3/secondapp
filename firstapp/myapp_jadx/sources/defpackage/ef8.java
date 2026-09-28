package defpackage;

import com.sporty.android.core.model.pocket.common.PaymentChannel;
import com.sporty.android.core.model.pocket.deposit.QuickInputItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.android.ugpay.deposit.momo.CommonMobileMoneyDepositViewModel$initChannel$1", f = "CommonMobileMoneyDepositViewModel.kt", l = {401}, m = "invokeSuspend", v = 2)
public final class ef8 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public df8 a;
    public int b;
    public final /* synthetic */ df8 c;
    public final /* synthetic */ PaymentChannel d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ef8(df8 df8Var, PaymentChannel paymentChannel, v1b<? super ef8> v1bVar) {
        super(2, v1bVar);
        this.c = df8Var;
        this.d = paymentChannel;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new ef8(this.c, this.d, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((ef8) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        df8 df8Var;
        List listT0;
        Map map;
        y5b y5bVar = y5b.a;
        int i = this.b;
        xrd xrdVar = null;
        df8 df8Var2 = this.c;
        if (i == 0) {
            uj50.b(obj);
            yrd yrdVar = df8Var2.d;
            this.a = df8Var2;
            this.b = 1;
            obj = yrdVar.a(this);
            if (obj == y5bVar) {
                return y5bVar;
            }
            df8Var = df8Var2;
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            df8Var = this.a;
            uj50.b(obj);
        }
        ng50.b bVar = obj instanceof ng50.b ? (ng50.b) obj : null;
        PaymentChannel paymentChannel = this.d;
        if (bVar != null && (map = (Map) bVar.a) != null) {
            xrdVar = (xrd) map.get(new Integer(paymentChannel.getPayChId()));
        }
        df8Var.X = xrdVar;
        xrd xrdVar2 = df8Var2.X;
        if (xrdVar2 != null && (listT0 = CollectionsKt.t0(xrdVar2.a, 6)) != null) {
            ArrayList arrayList = new ArrayList(l48.r(listT0, 10));
            Iterator it = listT0.iterator();
            while (it.hasNext()) {
                arrayList.add(new ug30(false, (QuickInputItem) it.next()));
            }
            df8Var2.P.m(arrayList);
        }
        ssw<o77> sswVar = df8Var2.D;
        String channelShowName = paymentChannel.getChannelShowName();
        int channelIconResId = paymentChannel.getChannelIconResId();
        String channelIconUrl = paymentChannel.getChannelIconUrl();
        if (channelIconUrl == null) {
            channelIconUrl = "";
        }
        sswVar.m(new o77(channelShowName, channelIconResId, channelIconUrl));
        return Unit.a;
    }
}
