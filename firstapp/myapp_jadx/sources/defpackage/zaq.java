package defpackage;

import androidx.compose.runtime.a;
import com.sportybet.feature.luckynumber.featurematch.presentation.c;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class zaq implements Function2 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ Function0 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ zaq(int i, String str, Function0 function0) {
        this.d = str;
        this.b = function0;
        this.c = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ((Integer) obj2).intValue();
                int iA = qj40.a(this.c | 1);
                c.d(this.b, (Function0) this.d, (a) obj, iA);
                break;
            default:
                String str = (String) this.d;
                ((Integer) obj2).intValue();
                q2k0.a(qj40.a(this.c | 1), (a) obj, str, this.b);
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ zaq(int i, Function0 function0, Function0 function1) {
        this.b = function0;
        this.d = function1;
        this.c = i;
    }
}
