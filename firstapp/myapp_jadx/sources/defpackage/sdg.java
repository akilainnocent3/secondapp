package defpackage;

import com.sportybet.plugin.realsports.event.viewholder.ScoreCountersViewHolder;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class sdg implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ sdg(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                jhg jhgVar = (jhg) ((fgg) obj).b;
                if (jhgVar != null) {
                    jhgVar.D.d();
                }
                return Unit.a;
            case 1:
                ((Function1) obj).invoke(c9q.b.a);
                return Unit.a;
            default:
                return ScoreCountersViewHolder.onBindView$lambda$6((ScoreCountersViewHolder) obj);
        }
    }
}
