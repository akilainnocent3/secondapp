package defpackage;

import com.sportybet.android.widget.BubbleView;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class mdm implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ mdm(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                List<String> list = dfm.v2;
                gby.b(((BubbleView) obj).getDescriptionView().getContext());
                break;
            default:
                ((Function1) obj).invoke(zxq.c0.a);
                break;
        }
        return Unit.a;
    }
}
