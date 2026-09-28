package defpackage;

import com.sportybet.plugin.realsports.event.viewholder.PlayerThreeColumnViewHolder;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class n5j implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ n5j(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        List list;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                u6j u6jVar = (u6j) obj;
                djh djhVar = u6jVar.b;
                if (djhVar != null) {
                    djhVar.d.n(8388613);
                }
                n2j.H0(u6jVar, u6jVar.getContext(), u6jVar.A, u6jVar.B, u6jVar.C, u6jVar.D, 2);
                return Unit.a;
            case 1:
                Pair pair = (Pair) ((pgx) obj).j.getValue();
                return (pair == null || (list = (List) pair.a) == null) ? new ArrayList() : list;
            default:
                return Integer.valueOf(PlayerThreeColumnViewHolder.totalColumnsWidthPx_delegate$lambda$0((PlayerThreeColumnViewHolder) obj));
        }
    }
}
