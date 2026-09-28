package defpackage;

import android.net.Uri;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class t6d implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ t6d(Object obj, int i) {
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
                yfx.i((phx) obj2, "team_article?article_id=" + Uri.encode(str), null, 6);
                return Unit.a;
            default:
                w9h0 w9h0Var = (w9h0) obj;
                return ((i8i) obj2).c(new w9h0(null, w9h0Var.b, w9h0Var.c, w9h0Var.d, w9h0Var.e)).getValue();
        }
    }
}
