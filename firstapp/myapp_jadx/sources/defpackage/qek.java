package defpackage;

import com.google.protobuf.RuntimeVersion;
import com.sportybet.plugin.sportystories.domain.entity.Story;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.sportystories.domain.usecase.GetStoriesUseCase$invoke$apiStoriesFlow$2", f = "GetStoriesUseCase.kt", l = {RuntimeVersion.MINOR}, m = "invokeSuspend", v = 2)
public final class qek extends tje0 implements gaj<myh<? super List<? extends Story>>, Throwable, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ myh b;

    @Override // defpackage.gaj
    public final Object invoke(myh<? super List<? extends Story>> myhVar, Throwable th, v1b<? super Unit> v1bVar) {
        qek qekVar = new qek(3, v1bVar);
        qekVar.b = myhVar;
        return qekVar.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        myh myhVar = this.b;
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            m2g m2gVar = m2g.a;
            this.b = null;
            this.a = 1;
            if (myhVar.emit(m2gVar, this) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        return Unit.a;
    }
}
