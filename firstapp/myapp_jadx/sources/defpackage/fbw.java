package defpackage;

import com.sportygames.multilevel.common.model.LevelConfigDto;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class fbw implements Function1 {
    public final /* synthetic */ ylb0 a;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String str = (String) obj;
        str.getClass();
        ylb0 ylb0Var = this.a;
        ylb0Var.D3().getClass();
        if (StringsKt.t0(str).toString().length() != 0) {
            try {
                if (((LevelConfigDto) ubw.a.e(str, LevelConfigDto.class)).isUpdated()) {
                    ylb0Var.z2 = -1;
                    ylb0Var.n1().x1();
                    ylb0Var.D3().x1();
                    ylb0Var.D3().y1();
                    Unit unit = Unit.a;
                }
            } catch (qep unused) {
            }
        }
        return Unit.a;
    }
}
