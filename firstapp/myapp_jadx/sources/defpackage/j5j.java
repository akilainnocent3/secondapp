package defpackage;

import com.sportybet.plugin.realsports.event.viewholder.PlayerThreeColumnViewHolder;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.text.Regex;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class j5j implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ j5j(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                u6j u6jVar = (u6j) obj;
                u6jVar.t0 = false;
                u6jVar.q1();
                return Unit.a;
            case 1:
                String str = ((pgx) obj).e;
                if (str != null) {
                    return new Regex(str, ns40.IGNORE_CASE);
                }
                return null;
            default:
                return PlayerThreeColumnViewHolder.inflater_delegate$lambda$0((PlayerThreeColumnViewHolder) obj);
        }
    }
}
