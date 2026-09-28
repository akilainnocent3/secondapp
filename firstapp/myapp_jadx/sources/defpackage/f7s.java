package defpackage;

import com.sportygames.multilevel.common.model.LevelConfigDetailDto;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class f7s implements Function1 {
    public final /* synthetic */ int a;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                LevelConfigDetailDto levelConfigDetailDto = (LevelConfigDetailDto) obj;
                levelConfigDetailDto.getClass();
                return Integer.valueOf(levelConfigDetailDto.getLevel());
            default:
                pb80 pb80Var = (pb80) obj;
                pb80Var.getClass();
                mb80.a(pb80Var);
                return Unit.a;
        }
    }
}
