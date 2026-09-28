package defpackage;

import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import nl.dionsegijn.konfetti.xml.KonfettiView;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class f7b0 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ f7b0(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                String str = (String) obj;
                str.getClass();
                ((b8b0) obj2).t0(str);
                return Unit.a;
            default:
                Context context = (Context) obj;
                context.getClass();
                KonfettiView konfettiView = new KonfettiView(context);
                ((ytw) obj2).setValue(konfettiView);
                return konfettiView;
        }
    }
}
