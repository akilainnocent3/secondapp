package defpackage;

import android.content.Context;
import com.sportybet.plugin.realsports.search.SearchFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class uy2 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ uy2(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((Function1) obj).invoke(vc60.m.a);
                return Unit.a;
            case 1:
                Object objB = ((hjz) obj).Y.b("CHANNEL_ID");
                objB.getClass();
                String str = (String) objB;
                c100 c100VarA = sg8.a(Integer.parseInt(str));
                c100VarA.getClass();
                String str2 = c100VarA == c100.f ? "5" : str;
                int iOrdinal = c100VarA.ordinal();
                if (iOrdinal == 18 || iOrdinal == 19) {
                    str = "5";
                }
                return new n000.a(c100VarA, h400.OZOW, str2, str);
            default:
                ohp<Object>[] ohpVarArr = SearchFragment.V;
                Context context = ((uhd0) obj).a.getContext();
                context.getClass();
                gby.c(context);
                return Unit.a;
        }
    }
}
