package defpackage;

import com.sporty.android.common.network.data.SprThrowable;
import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.core.model.MyLog;
import com.sporty.android.core.model.luckywheel.LuckyWheelColor;
import com.sporty.android.core.model.luckywheel.LuckyWheelSpinResponse;
import com.sporty.android.core.model.luckywheel.TicketInfo;
import com.sporty.android.platform.features.luckywheel.error.LuckyWheelInfoFailed;
import com.sportybet.android.gp.tz.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sporty.android.platform.features.luckywheel.LuckyWheelViewModel$onSpinClicked$1", f = "LuckyWheelViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class bcu extends tje0 implements Function2<acb0, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ jbu b;
    public final /* synthetic */ ccu c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bcu(jbu jbuVar, ccu ccuVar, v1b<? super bcu> v1bVar) {
        super(2, v1bVar);
        this.b = jbuVar;
        this.c = ccuVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        bcu bcuVar = new bcu(this.b, this.c, v1bVar);
        bcuVar.a = obj;
        return bcuVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(acb0 acb0Var, v1b<? super Unit> v1bVar) {
        return ((bcu) create(acb0Var, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        Object value3;
        Object value4;
        Object value5;
        Object value6;
        Object value7;
        Object value8;
        final ccu ccuVar = this.c;
        wwd0 wwd0Var = ccuVar.v;
        acb0 acb0Var = (acb0) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        lk50<LuckyWheelSpinResponse> lk50Var = acb0Var.a;
        TicketInfo ticketInfo = acb0Var.b;
        int i = 1;
        if (lk50Var instanceof lk50.c) {
            LuckyWheelSpinResponse luckyWheelSpinResponse = (LuckyWheelSpinResponse) ((lk50.c) lk50Var).a;
            LuckyWheelColor colorName = luckyWheelSpinResponse.getColorName();
            int prizeAmount = luckyWheelSpinResponse.getPrizeAmount();
            List<p9u> list = this.b.c.d.a;
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : list) {
                p9u p9uVar = (p9u) obj2;
                if (p9uVar.a == colorName && p9uVar.b == prizeAmount) {
                    arrayList.add(obj2);
                }
            }
            p9u p9uVar2 = (p9u) CollectionsKt.l0(arrayList, lx30.INSTANCE);
            if (p9uVar2 != null) {
                do {
                    value8 = wwd0Var.getValue();
                } while (!wwd0Var.g(value8, jbu.a((jbu) value8, false, false, null, ccb0.c, p9uVar2, false, k9u.e, false, null, null, 935)));
            } else {
                do {
                    value7 = wwd0Var.getValue();
                } while (!wwd0Var.g(value7, jbu.a((jbu) value7, false, false, null, ccb0.a, null, false, null, false, null, null, 1015)));
            }
            if (ticketInfo != null) {
                ccuVar.z1(ticketInfo.getType(), ticketInfo.getTicketNum() - 1);
            }
        } else {
            int i2 = 0;
            if (lk50Var instanceof lk50.a) {
                do {
                    value = wwd0Var.getValue();
                } while (!wwd0Var.g(value, jbu.a((jbu) value, false, false, null, ccb0.a, null, false, null, false, null, null, 1015)));
                if (ticketInfo != null) {
                    ccuVar.z1(ticketInfo.getType(), ticketInfo.getTicketNum());
                }
                Throwable th = ((lk50.a) lk50Var).a;
                if (th instanceof LuckyWheelInfoFailed) {
                    do {
                        value6 = wwd0Var.getValue();
                    } while (!wwd0Var.g(value6, jbu.a((jbu) value6, false, false, null, null, null, false, null, false, null, new u8u.a(((LuckyWheelInfoFailed) th).getText(), new ed7(ccuVar, 2)), 511)));
                } else if (th instanceof SprThrowable) {
                    SprThrowable sprThrowable = (SprThrowable) th;
                    switch (sprThrowable.getD()) {
                        case 74106:
                            do {
                                value3 = wwd0Var.getValue();
                                StringUiText stringUiText = vch0.a;
                            } while (!wwd0Var.g(value3, jbu.a((jbu) value3, false, false, null, null, null, false, null, false, null, new u8u.a(new ResourceUiText(R.string.lucky_wheel__no_ticket_available), new sxf(ccuVar, i)), 511)));
                            break;
                        case 74107:
                            do {
                                value4 = wwd0Var.getValue();
                                StringUiText stringUiText2 = vch0.a;
                            } while (!wwd0Var.g(value4, jbu.a((jbu) value4, false, false, null, null, null, false, null, false, null, new u8u.a(new ResourceUiText(R.string.lucky_wheel__lucky_wheel_activity_expire), new Function0() { // from class: xbu
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    ccuVar.y1(x8u.d.a);
                                    return Unit.a;
                                }
                            }), 511)));
                            break;
                        default:
                            do {
                                value5 = wwd0Var.getValue();
                            } while (!wwd0Var.g(value5, jbu.a((jbu) value5, false, false, null, null, null, false, null, false, null, new u8u.a(sprThrowable.b(), new ybu(ccuVar, i2)), 511)));
                            break;
                    }
                } else {
                    do {
                        value2 = wwd0Var.getValue();
                        StringUiText stringUiText3 = vch0.a;
                    } while (!wwd0Var.g(value2, jbu.a((jbu) value2, false, false, null, null, null, false, null, false, null, new u8u.a(new ResourceUiText(R.string.common_feedback__something_went_wrong), new Function0() { // from class: zbu
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Object value9;
                            ccu ccuVar2 = ccuVar;
                            if (ccuVar2.d.isLogin()) {
                                wwd0 wwd0Var2 = ccuVar2.v;
                                do {
                                    value9 = wwd0Var2.getValue();
                                } while (!wwd0Var2.g(value9, jbu.a((jbu) value9, false, false, null, null, null, false, null, false, null, null, 511)));
                            } else {
                                ccuVar2.y1(x8u.d.a);
                            }
                            return Unit.a;
                        }
                    }), 511)));
                    itf0.a aVar = itf0.a;
                    aVar.a(e40.a(aVar, MyLog.TAG_LUCKY_WHEEL, "Spin Error: ", th), new Object[0]);
                }
            } else {
                if (!(lk50Var instanceof lk50.b)) {
                    uhc.a();
                    return null;
                }
                itf0.a aVar2 = itf0.a;
                aVar2.q(MyLog.TAG_LUCKY_WHEEL);
                aVar2.a("Spin Loading...", new Object[0]);
            }
        }
        return Unit.a;
    }
}
