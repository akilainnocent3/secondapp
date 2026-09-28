package defpackage;

import androidx.compose.runtime.a;
import com.sporty.android.platform.features.newotp.util.OtpData;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class we7 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ we7(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                Function0 function0 = (Function0) obj3;
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    nk5.c(function0, null, false, null, null, null, null, null, pp8.b(-1245078586, new ag7(), aVar), aVar, 805306368, 510);
                } else {
                    aVar.G();
                }
                break;
            default:
                final zaf0 zaf0Var = (zaf0) obj3;
                a aVar2 = (a) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (aVar2.q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    or0.a(null, false, false, null, pp8.b(1731426479, new Function2() { // from class: yaf0
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj4, Object obj5) {
                            a aVar3 = (a) obj4;
                            int iIntValue3 = ((Integer) obj5).intValue();
                            if (aVar3.q(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                zaf0 zaf0Var2 = zaf0Var;
                                e6z e6zVar = (e6z) wyh.c(zaf0Var2.v0().f, aVar3, 0, 7).getValue();
                                OtpData otpDataP0 = zaf0Var2.p0();
                                OtpData.Register register = otpDataP0 instanceof OtpData.Register ? (OtpData.Register) otpDataP0 : null;
                                ecf0<? super OtpData> ecf0VarV0 = zaf0Var2.v0();
                                boolean zA = aVar3.A(ecf0VarV0);
                                Object objY = aVar3.y();
                                a.C0041a.C0042a c0042a = a.C0041a.a;
                                if (zA || objY == c0042a) {
                                    zaf0.b bVar = new zaf0.b(1, ecf0VarV0, ecf0.class, "handleEvent", "handleEvent(Lcom/sporty/android/platform/features/newotp/channel/OtpCodeVerifyEvent;)V", 0);
                                    aVar3.r(bVar);
                                    objY = bVar;
                                }
                                Function1 function1 = (Function1) ((chp) objY);
                                boolean zA2 = aVar3.A(zaf0Var2);
                                Object objY2 = aVar3.y();
                                if (zA2 || objY2 == c0042a) {
                                    objY2 = new q0g(zaf0Var2, 3);
                                    aVar3.r(objY2);
                                }
                                p5z.a(e6zVar, register, function1, (Function0) objY2, null, aVar3, 8, 16);
                            } else {
                                aVar3.G();
                            }
                            return Unit.a;
                        }
                    }, aVar2), aVar2, 24576);
                } else {
                    aVar2.G();
                }
                break;
        }
        return Unit.a;
    }
}
