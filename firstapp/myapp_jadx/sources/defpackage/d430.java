package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.ui.d;
import com.sportygames.crash.remote.models.TopWinResponseV2;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class d430 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ d430(Object obj, int i, int i2, Object obj2) {
        this.a = i2;
        this.b = obj;
        this.c = obj2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iA = qj40.a(1);
                e430.a(iA, (a) obj, (d) obj4, (String) obj3);
                break;
            case 1:
                ((Integer) obj2).getClass();
                wh70.b((zk70) obj4, (Function1) obj3, (a) obj, qj40.a(9));
                break;
            default:
                ((Integer) obj2).getClass();
                lqb0.r((TopWinResponseV2) obj4, (gw2) obj3, (a) obj, qj40.a(1));
                break;
        }
        return Unit.a;
    }
}
