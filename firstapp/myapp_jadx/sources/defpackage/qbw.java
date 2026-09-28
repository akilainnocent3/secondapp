package defpackage;

import com.sportygames.commons.remote.model.HTTPResponse;
import com.sportygames.multilevel.common.model.LevelConfigDetailDto;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.multilevel.common.repository.MultiLevelLevelConfigRepository$getLevelConfigDetails$2", f = "MultiLevelLevelConfigRepository.kt", l = {17}, m = "invokeSuspend", v = 1)
public final class qbw extends tje0 implements Function1<v1b<? super HTTPResponse<List<? extends LevelConfigDetailDto>>>, Object> {
    public int a;
    public final /* synthetic */ sbw b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qbw(sbw sbwVar, v1b<? super qbw> v1bVar) {
        super(1, v1bVar);
        this.b = sbwVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(v1b<?> v1bVar) {
        return new qbw(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(v1b<? super HTTPResponse<List<? extends LevelConfigDetailDto>>> v1bVar) {
        return ((qbw) create(v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i != 0) {
            if (i == 1) {
                uj50.b(obj);
                return obj;
            }
            ib5.a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        uj50.b(obj);
        this.b.getClass();
        paw pawVarA = sbw.a();
        this.a = 1;
        Object objLevelConfigDetails = pawVarA.levelConfigDetails(this);
        return objLevelConfigDetails == y5bVar ? y5bVar : objLevelConfigDetails;
    }
}
