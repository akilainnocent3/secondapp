package defpackage;

import android.view.View;
import com.sporty.android.platform.features.newotp.util.OTPResult;
import com.sporty.android.platform.features.newotp.util.OtpData;
import com.sporty.android.platform.features.newotp.util.OtpModule;
import com.sporty.android.platform.features.newotp.util.OtpViewModelClasses;
import com.sporty.android.platform.features.newotp.util.a;
import com.sportygames.pocketrocket.component.BetContainer;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class il2 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ il2(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                BetContainer betContainer = (BetContainer) obj3;
                Function0 function0 = (Function0) obj2;
                int i2 = BetContainer.R;
                ((View) obj).getClass();
                if (!betContainer.betPlaced && !betContainer.betInProgress && !betContainer.autoBetPlace) {
                    function0.invoke();
                    betContainer.binding.I.setVisibility(8);
                    betContainer.binding.K.setVisibility(8);
                    betContainer.binding.M.setVisibility(8);
                    betContainer.binding.O.setVisibility(8);
                }
                break;
            default:
                p9g p9gVar = (p9g) obj3;
                String str = (String) obj2;
                String str2 = (String) obj;
                ku90<e9g> ku90Var = p9gVar.z;
                a aVar = p9gVar.e;
                String strP = p9gVar.d.P();
                aVar.getClass();
                strP.getClass();
                str2.getClass();
                ku90Var.a(new e9g.a(new OtpModule(new OtpData.DeviceBlocking(strP, str, j6c.BlockDevice, str2, OTPResult.NoResult.a), new OtpViewModelClasses(ace.class, hce.class, pce.class, dce.class, lce.class, xbe.class))));
                itf0.a aVar2 = itf0.a;
                aVar2.q("BlockDevice");
                aVar2.a("Received token for blocking OTP: ".concat(str2), new Object[0]);
                break;
        }
        return Unit.a;
    }
}
