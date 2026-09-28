package defpackage;

import android.content.Context;
import android.widget.ImageView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class ma40 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ma40(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                sa40 sa40Var = (sa40) obj2;
                ej5.c(o8i0.d(sa40Var), null, null, new ra40(sa40Var, ((Boolean) obj).booleanValue(), null), 3);
                return Unit.a;
            default:
                String str = (String) obj2;
                Context context = (Context) obj;
                context.getClass();
                ImageView imageView = new ImageView(context);
                xa50 xa50VarA = np5.a(context, context);
                ea50 ea50VarP = xa50VarA.f(thk.class).a(xa50.A).P(str);
                ea50VarP.getClass();
                po80 po80Var = new po80(xa50VarA, str, ea50VarP, lo80.b);
                hre.a aVar = hre.a;
                aVar.getClass();
                po80Var.c(aVar);
                po80Var.h();
                d5f0 gig0Var = new gig0(imageView);
                ea50 ea50VarB = po80Var.b();
                ea50VarB.L(gig0Var, null, ea50VarB, fug.a);
                return imageView;
        }
    }
}
