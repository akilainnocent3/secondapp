package defpackage;

import android.view.View;
import com.sporty.android.platform.features.newotp.util.OTPResult;
import com.sporty.android.platform.features.newotp.util.OtpData;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class ed0 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ed0(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                Object tag = ((View) obj).getTag(R.id.binding_reference);
                tag.getClass();
                ((Function1) obj2).invoke((g6i0) tag);
                break;
            case 1:
                ldx ldxVar = (ldx) obj2;
                OTPResult oTPResult = (OTPResult) obj;
                oTPResult.getClass();
                ldxVar.b = OtpData.NameUpdate.a((OtpData.NameUpdate) ldxVar.B1(), oTPResult);
                break;
            default:
                wd0 wd0Var = (wd0) obj2;
                a7l a7lVar = (a7l) obj;
                a7lVar.getClass();
                a7lVar.k(((Number) wd0Var.d()).floatValue());
                a7lVar.v(((Number) wd0Var.d()).floatValue());
                break;
        }
        return Unit.a;
    }
}
