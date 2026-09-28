package defpackage;

import androidx.compose.runtime.a;
import com.sporty.android.platform.features.newotp.util.OtpData;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class uqx implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ uqx(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                vqx vqxVar = (vqx) obj3;
                ttr ttrVar = vqxVar.B;
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    z6z z6zVar = (z6z) wyh.c(((c7z) ttrVar.getValue()).i, aVar, 0, 7).getValue();
                    OtpData otpDataP0 = vqxVar.p0();
                    OtpData.Register register = otpDataP0 instanceof OtpData.Register ? (OtpData.Register) otpDataP0 : null;
                    c7z c7zVar = (c7z) ttrVar.getValue();
                    boolean zA = aVar.A(c7zVar);
                    Object objY = aVar.y();
                    if (zA || objY == a.C0041a.a) {
                        vqx.b bVar = new vqx.b(1, c7zVar, c7z.class, "handleEvent", "handleEvent(Lcom/sporty/android/platform/features/newotp/otpselector/OtpSelectorEvent;)V", 0);
                        aVar.r(bVar);
                        objY = bVar;
                    }
                    m6z.a(z6zVar, register, (Function1) ((chp) objY), aVar, 0);
                } else {
                    aVar.G();
                }
                break;
            default:
                ytw ytwVar = (ytw) obj3;
                float fFloatValue = ((Float) obj2).floatValue();
                ((m020) obj).getClass();
                if (fFloatValue > 0.0f) {
                    ytwVar.setValue(Float.valueOf(((Number) ytwVar.getValue()).floatValue() + fFloatValue));
                }
                break;
        }
        return Unit.a;
    }
}
