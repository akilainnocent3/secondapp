package defpackage;

import com.sporty.android.platform.features.newotp.otpselector.OtpSelection;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class xdw implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function1 b;

    public /* synthetic */ xdw(int i, Function1 function1) {
        this.a = i;
        this.b = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Function1 function1 = this.b;
        switch (i) {
            case 0:
                ibw ibwVar = (ibw) function1;
                String str = (String) obj;
                if (str == null) {
                    str = "";
                }
                ibwVar.invoke(str);
                break;
            default:
                OtpSelection otpSelection = (OtpSelection) obj;
                otpSelection.getClass();
                function1.invoke(new o6z.i(otpSelection));
                break;
        }
        return Unit.a;
    }
}
