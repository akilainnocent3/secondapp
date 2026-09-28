package defpackage;

import androidx.compose.runtime.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class uje implements Function2 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ haj b;

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        haj hajVar = this.b;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                ike.c((Function0) hajVar, (a) obj, qj40.a(1));
                break;
            default:
                String str = (String) obj;
                String str2 = (String) obj2;
                str.getClass();
                str2.getClass();
                ((Function1) hajVar).invoke(new kli0.c.a(str, str2));
                break;
        }
        return Unit.a;
    }
}
