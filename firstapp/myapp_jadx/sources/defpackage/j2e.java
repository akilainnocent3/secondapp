package defpackage;

import com.sporty.android.common.uievent.a;
import com.sporty.android.common.uievent.b;
import com.sporty.android.common_ui.uitext.UiText;
import com.sporty.android.core.model.patron.UserPhone;
import com.sporty.android.core.model.pocket.common.ChannelAsset;
import com.sporty.android.core.model.pocket.deposit.DepositRequest;
import com.sporty.android.core.model.service.CountryCodeName;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.payment.impl.deposit.presentation.viewmodel.DepositMomoViewModel$requestDeposit$1", f = "DepositMomoViewModel.kt", l = {737}, m = "invokeSuspend", v = 2)
public final class j2e extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ r2e b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j2e(v1b v1bVar, r2e r2eVar) {
        super(2, v1bVar);
        this.b = r2eVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new j2e(v1bVar, this.b);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((j2e) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00c8  */
    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        String channelSendName;
        UiText uiText;
        wwd0 wwd0Var;
        r2e r2eVar;
        Object next;
        jck0.a aVar;
        r2e r2eVar2 = this.b;
        wwd0 wwd0Var2 = r2eVar2.X0;
        wwd0 wwd0Var3 = r2eVar2.G;
        wwd0 wwd0Var4 = r2eVar2.E0;
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            UserPhone userPhone = (UserPhone) r2eVar2.R0.a.getValue();
            String phone = userPhone != null ? userPhone.getPhone() : null;
            if (phone == null) {
                b.h(r2eVar2.f);
                return Unit.a;
            }
            ChannelAsset.Channel channel = (ChannelAsset.Channel) wwd0Var4.getValue();
            if (channel == null) {
                return Unit.a;
            }
            int payChId = channel.getPayChId();
            ChannelAsset.Channel channel2 = (ChannelAsset.Channel) wwd0Var4.getValue();
            if (channel2 == null || (channelSendName = channel2.getChannelSendName()) == null) {
                return Unit.a;
            }
            ChannelAsset.Channel channel3 = (ChannelAsset.Channel) wwd0Var4.getValue();
            if (channel3 != null) {
                v2k v2kVar = r2eVar2.q0;
                v2kVar.getClass();
                CountryCodeName countryCode = v2kVar.a.getCountryCode();
                String channelSendName2 = channel3.getChannelSendName();
                int i2 = v2k.a.a[countryCode.ordinal()];
                if (i2 == 1) {
                    Iterator<T> it = ihk.a.d.iterator();
                    do {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                    } while (!((ihk.a) next).a.equals(channelSendName2));
                    ihk.a aVar2 = (ihk.a) next;
                    if (aVar2 != null) {
                        uiText = aVar2.b;
                    } else {
                        uiText = null;
                    }
                } else if (i2 == 2) {
                    jah0.a aVar3 = (jah0.a) v2k.a(channelSendName2, jah0.a.d);
                    if (aVar3 != null) {
                        uiText = aVar3.b;
                    } else {
                        uiText = null;
                    }
                } else if (i2 == 3 && (aVar = (jck0.a) v2k.a(channelSendName2, jck0.a.d)) != null) {
                    uiText = aVar.b;
                } else {
                    uiText = null;
                }
            } else {
                uiText = null;
            }
            DepositRequest depositRequest = new DepositRequest(Intrinsics.g(r2eVar2.z1(), i41.d.a) ? 1 : 0, p54.c(r2eVar2.S.c), payChId, phone, null, r2eVar2.t0.f(), null, null, null, null, null, null, null, null, null, channelSendName, null, null, null, null, null, null, null, null, 16744400, null);
            wwd0Var3.setValue(tzs.b.a);
            wwd0Var2.setValue(c330.b.a);
            f9e f9eVar = r2eVar2.l0;
            a300.f fVar = r2eVar2.B0;
            UiText uiText2 = uiText;
            wwd0 wwd0Var5 = r2eVar2.G;
            ku90<a> ku90Var = r2eVar2.f;
            ku90<spg0> ku90Var2 = r2eVar2.v;
            ku90<m480> ku90Var3 = r2eVar2.y;
            ku90<tng0> ku90Var4 = r2eVar2.A;
            ku90<z7e> ku90Var5 = r2eVar2.h0;
            b390 b390VarB = d390.b(0, 0, null, 7);
            ku90<x7e> ku90Var6 = r2eVar2.c1;
            wwd0Var = wwd0Var2;
            r1e r1eVar = r2eVar2.e1;
            ku90<pdd0> ku90Var7 = r2eVar2.K;
            wzd wzdVarI1 = r2eVar2.I1();
            w7e w7eVar = new w7e(CollectionsKt.A0(r2eVar2.g0), 2);
            this.a = 1;
            r2eVar = r2eVar2;
            if (f9eVar.a(fVar, depositRequest, wwd0Var5, ku90Var, ku90Var2, ku90Var3, ku90Var4, ku90Var5, b390VarB, ku90Var6, r1eVar, ku90Var7, wzdVarI1, w7eVar, uiText2, this) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
            r2eVar = r2eVar2;
            wwd0Var = wwd0Var2;
        }
        wwd0Var3.setValue(tzs.a.a);
        c330.a aVar4 = new c330.a(null, false);
        wwd0Var.getClass();
        wwd0Var.k(null, aVar4);
        r2e r2eVar3 = r2eVar;
        vpg0.d(r2eVar3.v);
        r2eVar3.x1("");
        return Unit.a;
    }
}
