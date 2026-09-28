package defpackage;

import android.view.View;
import com.sportybet.plugin.realsports.betslip.widget.header.BetSlipHeader;
import com.sportybet.plugin.realsports.event.comment.prematch.data.entity.CommentsData;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class n43 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ n43(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                Function0<Unit> function0 = ((BetSlipHeader) obj).Q;
                if (function0 != null) {
                    function0.invoke();
                }
                break;
            default:
                t98 t98Var = (t98) obj;
                Object tag = view.getTag();
                if (!(tag instanceof CommentsData)) {
                    tag = null;
                }
                CommentsData commentsData = (CommentsData) tag;
                if (commentsData != null) {
                    t98Var.b.c(commentsData);
                }
                break;
        }
    }
}
