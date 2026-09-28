package defpackage;

import com.sportygames.multilevel.common.model.LevelConfigDetailDto;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class ycw implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ycw(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ((Function1) obj2).invoke(Integer.valueOf(((LevelConfigDetailDto) obj).getLevel()));
                break;
            default:
                vx00 vx00Var = (vx00) obj2;
                vx00Var.y1();
                kmx kmxVar = ((nu00.g) ((nu00) obj)).a;
                kmxVar.getClass();
                ej5.c(o8i0.d(vx00Var), null, null, new ly00(kmxVar, vx00Var, null), 3);
                break;
        }
        return Unit.a;
    }
}
