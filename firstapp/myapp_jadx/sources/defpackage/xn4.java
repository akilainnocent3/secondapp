package defpackage;

import com.sportybet.android.instantwin.presentation.footballfamilysettlement.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class xn4 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ xn4(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                yn4.a aVar = (yn4.a) obj;
                aVar.getClass();
                return Boolean.valueOf(aVar.d.b - aVar.i > ((yn4) obj2).a.b + 1.0f);
            default:
                String str = (String) obj;
                str.getClass();
                ((Function1) obj2).invoke(new a.f(str));
                return Unit.a;
        }
    }
}
