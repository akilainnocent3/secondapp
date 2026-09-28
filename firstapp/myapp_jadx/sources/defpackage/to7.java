package defpackage;

import androidx.compose.runtime.a;
import com.sportybet.android.globalpay.stp.clabe.f;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class to7 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ to7(int i, int i2, Object obj) {
        this.a = i2;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                zo7.b((f) obj3, (a) obj, qj40.a(9));
                break;
            default:
                ((Integer) obj2).getClass();
                hbg.a((Function1) obj3, (a) obj, qj40.a(1));
                break;
        }
        return Unit.a;
    }
}
