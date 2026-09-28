package defpackage;

import com.sportybet.android.instantwin.presentation.legends.b;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class kic0 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ kic0(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                a5o a5oVar = (a5o) obj;
                a5oVar.getClass();
                ((Function1) obj2).invoke(new b.InterfaceC0275b.a(a5oVar));
                break;
            default:
                ((jlv) obj2).m(obj);
                break;
        }
        return Unit.a;
    }
}
