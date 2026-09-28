package defpackage;

import android.content.Context;
import com.sportygames.commons.remote.model.LoadingState;
import java.io.File;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class afb implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ fgb b;

    public /* synthetic */ afb(fgb fgbVar, int i) {
        this.a = i;
        this.b = fgbVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        gvi gviVar;
        gvi gviVar2;
        int i = this.a;
        fgb fgbVar = this.b;
        switch (i) {
            case 0:
                LoadingState loadingState = (LoadingState) obj;
                int i2 = fgb.b.a[loadingState.getStatus().ordinal()];
                if (i2 == 1) {
                    op5 op5Var = op5.a;
                    List<? extends File> list = (List) loadingState.getData();
                    op5Var.getClass();
                    op5.b = list;
                    if (fgbVar.L2()) {
                        fgbVar.I0();
                    }
                    fgbVar.h2();
                    fgbVar.C1();
                    gvi gviVar3 = fgbVar.z;
                    if (gviVar3 != null) {
                        gviVar3.Y.N();
                    }
                    Context context = fgbVar.getContext();
                    if (context != null && (gviVar = fgbVar.z) != null) {
                        gviVar.Y.H(context, (String) ((x5a0) fgbVar.c1().z).getValue());
                    }
                    fgbVar.o2();
                    fgbVar.t1();
                    ((x5a0) fgbVar.c1().g0).setValue(Boolean.TRUE);
                } else if (i2 != 2) {
                    if (i2 != 3) {
                        uhc.a();
                        return null;
                    }
                    gvi gviVar4 = fgbVar.z;
                    if (gviVar4 != null) {
                        gviVar4.Y.N();
                    }
                    Context context2 = fgbVar.getContext();
                    if (context2 != null && (gviVar2 = fgbVar.z) != null) {
                        gviVar2.Y.H(context2, (String) ((x5a0) fgbVar.c1().z).getValue());
                    }
                    fgbVar.o2();
                }
                return Unit.a;
            default:
                ylb0 ylb0Var = (ylb0) fgbVar;
                cgb.a(ylb0Var.e1(), (String) ((x5a0) ylb0Var.c1().v).getValue(), "placeBet", (String) obj);
                return Unit.a;
        }
    }
}
