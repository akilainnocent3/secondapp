package defpackage;

import com.sportygames.commons.remote.model.HTTPResponse;
import com.sportygames.crash.remote.models.TopWinResponseV2;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.crash.repository.CrashRepository$getTopWinsV2$2", f = "CrashRepository.kt", l = {137}, m = "invokeSuspend", v = 1)
public final class vqb extends tje0 implements Function1<v1b<? super HTTPResponse<List<? extends TopWinResponseV2>>>, Object> {
    public int a;
    public final /* synthetic */ zqb b;
    public final /* synthetic */ String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vqb(zqb zqbVar, String str, v1b v1bVar) {
        super(1, v1bVar);
        this.b = zqbVar;
        this.c = str;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(v1b<?> v1bVar) {
        return new vqb(this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(v1b<? super HTTPResponse<List<? extends TopWinResponseV2>>> v1bVar) {
        return ((vqb) create(v1bVar)).invokeSuspend(Unit.a);
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
        dpb dpbVarA = this.b.a.a();
        this.a = 1;
        Object obj2 = dpbVarA.topWinsV2(this.c, 0, 15, "DAILY", this);
        return obj2 == y5bVar ? y5bVar : obj2;
    }
}
