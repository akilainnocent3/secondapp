package defpackage;

import com.sportybet.android.social.presentation.creation.a;
import com.sportybet.android.social.presentation.creation.b;
import com.sportybet.android.widget.ProgressButton;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class p0x implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ p0x(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                a aVar = (a) obj3;
                a.C0351a c0351a = a.D;
                ((ProgressButton) obj).getClass();
                aVar.p0(b.a.a);
                d1x d1xVarN0 = aVar.n0();
                ej5.c(o8i0.d(d1xVarN0), null, null, new b1x(null, d1xVarN0, String.valueOf(((pwi) obj2).d.getText())), 3);
                break;
            default:
                vp60 vp60Var = (vp60) obj;
                vp60Var.getClass();
                ((lvh0) obj3).b.m(vp60Var, (nfz) obj2);
                break;
        }
        return Unit.a;
    }
}
