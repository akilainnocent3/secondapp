package defpackage;

import androidx.compose.runtime.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class cxv implements Function2 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ Object b;
    public final /* synthetic */ haj c;

    public /* synthetic */ cxv(ftv ftvVar, Function0 function0) {
        this.b = ftvVar;
        this.c = function0;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        haj hajVar = this.c;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                ftv ftvVar = (ftv) obj3;
                Function0 function0 = (Function0) hajVar;
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    hxv.a(null, (ftv.b) ftvVar, function0, aVar, 64, 1);
                } else {
                    aVar.G();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                mfc0.b((nfc0) obj3, (gaj) hajVar, (a) obj, qj40.a(1));
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ cxv(nfc0 nfc0Var, gaj gajVar, int i) {
        this.b = nfc0Var;
        this.c = gajVar;
    }
}
