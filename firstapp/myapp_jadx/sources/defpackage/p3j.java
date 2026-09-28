package defpackage;

import com.sportygames.roulette.activities.RouletteActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class p3j implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ p3j(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                n2j n2jVar = (n2j) obj;
                djh djhVar = n2jVar.b;
                if (djhVar != null) {
                    djhVar.B.setVisibility(8);
                }
                djh djhVar2 = n2jVar.b;
                if (djhVar2 != null) {
                    djhVar2.B.setClickable(false);
                }
                jbh.b.j(Boolean.TRUE);
                return Unit.a;
            case 1:
                RouletteActivity.this.finish();
                return null;
            default:
                ((Function1) obj).invoke(xia0.b);
                return Unit.a;
        }
    }
}
