package defpackage;

import android.content.Context;
import com.sportybet.android.widget.BubbleView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class kqu implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ haj b;
    public final /* synthetic */ Object c;

    public /* synthetic */ kqu(int i, haj hajVar, Object obj) {
        this.a = i;
        this.b = hajVar;
        this.c = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.c;
        haj hajVar = this.b;
        switch (i) {
            case 0:
                Function0 function0 = (Function0) hajVar;
                BubbleView bubbleView = (BubbleView) obj;
                if (function0 != null) {
                    function0.invoke();
                } else {
                    Context context = bubbleView.getDescriptionView().getContext();
                    context.getClass();
                    gby.c(context);
                }
                break;
            default:
                ((n7f0) hajVar).invoke((prg) obj);
                break;
        }
        return Unit.a;
    }
}
