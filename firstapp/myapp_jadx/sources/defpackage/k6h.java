package defpackage;

import com.sportybet.feature.facialrecognition.presentation.FacialRecognitionActivity;
import com.sportybet.feature.facialrecognition.presentation.a;
import com.sportybet.feature.facialrecognition.presentation.b;
import com.sportybet.feature.facialrecognition.presentation.c;
import com.sportybet.feature.facialrecognition.presentation.d;
import com.sportybet.feature.facialrecognition.presentation.f;
import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
public final class k6h<T> implements myh {
    public final /* synthetic */ FacialRecognitionActivity a;

    public k6h(FacialRecognitionActivity facialRecognitionActivity) {
        this.a = facialRecognitionActivity;
    }

    @Override // defpackage.myh
    public final Object emit(Object obj, v1b v1bVar) {
        int iOrdinal = ((qt7) obj).ordinal();
        if (iOrdinal != 0) {
            FacialRecognitionActivity facialRecognitionActivity = this.a;
            if (iOrdinal == 1) {
                int i = FacialRecognitionActivity.f;
                c cVarI1 = facialRecognitionActivity.I1();
                ej5.c(o8i0.d(cVarI1), null, null, new f(cVarI1, null), 3);
            } else {
                if (iOrdinal != 2) {
                    uhc.a();
                    return null;
                }
                int i2 = FacialRecognitionActivity.f;
                c cVarI2 = facialRecognitionActivity.I1();
                vu60 vu60Var = cVarI2.y;
                Boolean bool = (Boolean) vu60Var.b("hasLaunchedFacialRecognition");
                if (!(bool != null ? bool.booleanValue() : false)) {
                    cVarI2.H1(new a.c(cVarI2.A1(), b.a(cVarI2.C1())));
                    vu60Var.e(Boolean.TRUE, "hasLaunchedFacialRecognition");
                    ej5.c(o8i0.d(cVarI2), null, null, new d(cVarI2, null), 3);
                }
            }
        }
        return Unit.a;
    }
}
