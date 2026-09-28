package defpackage;

import com.sportybet.android.instantwin.newtork.model.response.BetBuilderInRound;
import com.sportybet.android.social.domain.SocialRouter$SocialNetwork;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class fh5 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function2 b;
    public final /* synthetic */ Object c;

    public /* synthetic */ fh5(Function2 function2, Object obj, int i) {
        this.a = i;
        this.b = function2;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.c;
        Function2 function2 = this.b;
        switch (i) {
            case 0:
                function2.invoke((cf5) obj2, (BetBuilderInRound) obj);
                break;
            default:
                String str = (String) obj;
                str.getClass();
                function2.invoke(str, ((SocialRouter$SocialNetwork.Data) ((ytw) obj2).getValue()).getCountryCode());
                break;
        }
        return Unit.a;
    }
}
