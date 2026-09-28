package defpackage;

import com.sportybet.feature.facialrecognition.model.FacialRecognitionResult;
import com.sportygames.lobby.remote.models.GameDetails;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class e210 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ e210(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        v720 binding;
        v720 binding2;
        v720 binding3;
        v720 binding4;
        v720 binding5;
        Object value;
        Object value2;
        Object value3;
        Object value4;
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                m410 m410Var = (m410) obj2;
                ((String) obj).getClass();
                ixi ixiVar = (ixi) m410Var.b;
                if (ixiVar != null && (binding5 = ixiVar.b.getBinding()) != null) {
                    binding5.D.setVisibility(8);
                }
                ixi ixiVar2 = (ixi) m410Var.b;
                if (ixiVar2 != null && (binding4 = ixiVar2.b.getBinding()) != null) {
                    binding4.Y.setVisibility(8);
                }
                ixi ixiVar3 = (ixi) m410Var.b;
                if (ixiVar3 != null && (binding3 = ixiVar3.b.getBinding()) != null) {
                    binding3.a0.setVisibility(8);
                }
                ixi ixiVar4 = (ixi) m410Var.b;
                if (ixiVar4 != null && (binding2 = ixiVar4.b.getBinding()) != null) {
                    binding2.v.setVisibility(0);
                }
                ixi ixiVar5 = (ixi) m410Var.b;
                if (ixiVar5 != null && (binding = ixiVar5.b.getBinding()) != null) {
                    binding.q0.setVisibility(8);
                }
                m410Var.N = false;
                GameDetails gameDetails = m410Var.r1;
                wz.a("BetCancelled", gameDetails != null ? gameDetails.getName() : null, "1");
                break;
            default:
                s050 s050Var = (s050) obj2;
                FacialRecognitionResult facialRecognitionResult = (FacialRecognitionResult) obj;
                facialRecognitionResult.getClass();
                wwd0 wwd0Var = s050Var.a;
                int iOrdinal = facialRecognitionResult.a.ordinal();
                if (iOrdinal == 0) {
                    String str = facialRecognitionResult.b;
                    if (str == null) {
                        str = "";
                    }
                    String str2 = str;
                    do {
                        value = wwd0Var.getValue();
                    } while (!wwd0Var.g(value, l050.a((l050) value, null, null, null, null, false, false, null, false, false, true, 511)));
                    ej5.c(o8i0.d(s050Var), null, null, new m050(s050Var, str2, null), 3);
                } else if (iOrdinal == 1) {
                    do {
                        value2 = wwd0Var.getValue();
                    } while (!wwd0Var.g(value2, l050.a((l050) value2, null, null, null, null, false, false, null, false, true, false, 639)));
                } else if (iOrdinal != 2) {
                    do {
                        value4 = wwd0Var.getValue();
                    } while (!wwd0Var.g(value4, l050.a((l050) value4, null, null, null, null, false, false, null, false, true, false, 639)));
                } else {
                    do {
                        value3 = wwd0Var.getValue();
                    } while (!wwd0Var.g(value3, l050.a((l050) value3, null, null, null, null, false, false, null, false, false, false, 895)));
                }
                break;
        }
        return Unit.a;
    }
}
