package defpackage;

import android.graphics.Paint;
import com.sporty.android.platform.features.newotp.util.OTPResult;
import com.sporty.android.platform.features.newotp.util.OtpData;
import com.sportybet.android.gp.tz.R;
import com.sportygames.multilevel.common.model.MultiBonusWin;
import com.sportygames.multilevel.common.model.TopBonusWinsDto;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.a;
import kotlin.collections.b;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class lzc implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ lzc(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        List listT0;
        List<TopBonusWinsDto> bonusWins;
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                mzc mzcVar = (mzc) obj2;
                OTPResult oTPResult = (OTPResult) obj;
                oTPResult.getClass();
                mzcVar.b = OtpData.Deactivate.a((OtpData.Deactivate) mzcVar.B1(), oTPResult);
                break;
            case 1:
                String str = (String) obj;
                str.getClass();
                hmb0 hmb0VarD3 = ((ylb0) obj2).D3();
                hmb0VarD3.getClass();
                if (StringsKt.t0(str).toString().length() != 0) {
                    try {
                        MultiBonusWin multiBonusWin = (MultiBonusWin) ubw.a.e(str, MultiBonusWin.class);
                        wwd0 wwd0Var = hmb0VarD3.z;
                        if (multiBonusWin == null || (bonusWins = multiBonusWin.getBonusWins()) == null || (listT0 = CollectionsKt.t0(a.d(bonusWins), 3)) == null) {
                            listT0 = m2g.a;
                        }
                        wwd0Var.setValue(listT0);
                        hmb0VarD3.B.setValue(CollectionsKt.k0(b.k(nka.a(R.string.cheer_msg_1, "cheer_up_msg_1:sg_sporty_cars"), nka.a(R.string.cheer_msg_2, "cheer_up_msg_2:sg_sporty_cars"), nka.a(R.string.cheer_msg_3, "cheer_up_msg_3:sg_sporty_cars"), nka.a(R.string.cheer_msg_4, "cheer_up_msg_4:sg_sporty_cars"), nka.a(R.string.cheer_msg_5, "cheer_up_msg_5:sg_sporty_cars")), lx30.INSTANCE));
                        break;
                    } catch (qep unused) {
                    }
                }
                break;
            default:
                tcf tcfVar = (tcf) obj;
                tcfVar.getClass();
                i40.c(tcfVar.F1().a()).drawCircle(Float.intBitsToFloat((int) (tcfVar.R1() >> 32)), Float.intBitsToFloat((int) (tcfVar.R1() & 4294967295L)), yw90.c(tcfVar.d()) / 2.0f, (Paint) obj2);
                break;
        }
        return Unit.a;
    }
}
