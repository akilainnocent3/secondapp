package defpackage;

import com.sportygames.multilevel.common.model.LevelConfigDetailDto;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class pdw implements Function0 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ Object c;

    public /* synthetic */ pdw(p3h0 p3h0Var, Function1 function1) {
        this.c = p3h0Var;
        this.b = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Function1 function1 = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                function1.invoke(Integer.valueOf(((LevelConfigDetailDto) obj).getLevel()));
                break;
            default:
                p3h0 p3h0Var = (p3h0) obj;
                if (!StringsKt.U(p3h0Var.g.d.b)) {
                    function1.invoke(p3h0Var.g.d);
                }
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ pdw(Function1 function1, LevelConfigDetailDto levelConfigDetailDto) {
        this.b = function1;
        this.c = levelConfigDetailDto;
    }
}
