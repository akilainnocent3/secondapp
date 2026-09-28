package defpackage;

import com.sporty.android.core.model.security.sportypin.SportyPinStatus;
import com.sporty.android.core.model.security.sportypin.WithdrawalPinStatusInfo;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class zxc implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ zxc(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ((oyc) obj2).c(((Long) obj).longValue());
                return Unit.a;
            case 1:
                haw hawVar = (haw) obj2;
                WithdrawalPinStatusInfo withdrawalPinStatusInfo = (WithdrawalPinStatusInfo) obj;
                ohp<Object>[] ohpVarArr = haw.E;
                if (withdrawalPinStatusInfo == null) {
                    return Unit.a;
                }
                hawVar.m0().f.setEnabled(true);
                withdrawalPinStatusInfo.getUsage();
                if (withdrawalPinStatusInfo.getSportyPinStatus() == SportyPinStatus.Disabled) {
                    hawVar.m0().f.setRightText(R.string.wap_profile__create);
                } else {
                    hawVar.m0().f.setRightText(sn5.d(hawVar, R.string.common_functions__edit, new Object[0]));
                }
                return Unit.a;
            default:
                ((Float) obj).floatValue();
                return Float.valueOf(((Number) ((Function0) obj2).invoke()).floatValue());
        }
    }
}
