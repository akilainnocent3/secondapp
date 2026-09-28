package defpackage;

import com.sportygames.crash.remote.models.MultiplierResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.text.b;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class lbb implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ lbb(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Double dH;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                fgb fgbVar = (fgb) obj;
                fgbVar.v0(fgbVar.R0(), null);
                return Unit.a;
            default:
                String currentMultiplier = ((MultiplierResponse) ((ytw) obj).getValue()).getCurrentMultiplier();
                boolean z = false;
                if (currentMultiplier != null && (dH = b.h(currentMultiplier)) != null && dH.doubleValue() > 5.0d) {
                    z = true;
                }
                return Boolean.valueOf(z);
        }
    }
}
