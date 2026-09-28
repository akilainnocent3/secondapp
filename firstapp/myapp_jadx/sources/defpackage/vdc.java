package defpackage;

import androidx.appcompat.app.b;
import com.sportybet.feature.facialrecognition.presentation.FacialRecognitionActivity;
import com.sportybet.feature.facialrecognition.presentation.a;
import com.sportybet.feature.facialrecognition.presentation.c;
import com.sportybet.feature.facialrecognition.presentation.j;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class vdc implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ vdc(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Object value;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((Function0) obj).invoke();
                break;
            case 1:
                FacialRecognitionActivity facialRecognitionActivity = (FacialRecognitionActivity) obj;
                int i2 = FacialRecognitionActivity.f;
                b bVar = facialRecognitionActivity.d;
                if (bVar != null) {
                    bVar.dismiss();
                }
                facialRecognitionActivity.d = null;
                c cVarI1 = facialRecognitionActivity.I1();
                vu60 vu60Var = cVarI1.y;
                jvd0 jvd0Var = cVarI1.z;
                if (jvd0Var != null) {
                    jvd0Var.cancel((CancellationException) null);
                }
                Boolean bool = Boolean.FALSE;
                vu60Var.e(bool, "awaitingUnicoCallback");
                vu60Var.e(bool, "hasLaunchedFacialRecognition");
                cVarI1.H1(new a.m(cVarI1.A1(), com.sportybet.feature.facialrecognition.presentation.b.a(cVarI1.C1())));
                wwd0 wwd0Var = cVarI1.a;
                do {
                    value = wwd0Var.getValue();
                    ((p7h) value).getClass();
                } while (!wwd0Var.g(value, new p7h(true, false)));
                ej5.c(o8i0.d(cVarI1), null, null, new j(cVarI1, null), 3);
                break;
            default:
                ((Function1) obj).invoke(ac00.a.a);
                break;
        }
        return Unit.a;
    }
}
