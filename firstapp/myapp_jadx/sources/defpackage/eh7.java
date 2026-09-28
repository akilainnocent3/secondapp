package defpackage;

import com.sportybet.android.instantwin.presentation.scheduledfootball.b;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class eh7 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ eh7(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Object value;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return (v8k) ((hh7) obj).b.invoke();
            case 1:
                wwd0 wwd0Var = ((c7z) obj).f;
                do {
                    value = wwd0Var.getValue();
                } while (!wwd0Var.g(value, new z6z.c(o6z.a.a)));
                return Unit.a;
            case 2:
                ((Function1) obj).invoke(b.c.C0324b.a);
                return Unit.a;
            default:
                l7g.a((ruj0) obj);
                return Unit.a;
        }
    }
}
