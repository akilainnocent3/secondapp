package defpackage;

import com.sportygames.commons.remote.model.HTTPResponse;
import com.sportygames.crashInitiated.model.response.BetHistoryItem;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.crashInitiated.repository.CrashInitiatedRepository$getArchiveBetHistory$2", f = "CrashInitiatedRepository.kt", l = {65}, m = "invokeSuspend", v = 1)
public final class iob extends tje0 implements Function1<v1b<? super HTTPResponse<List<? extends BetHistoryItem>>>, Object> {
    public int a;
    public final /* synthetic */ sob b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iob(sob sobVar, int i, int i2, v1b<? super iob> v1bVar) {
        super(1, v1bVar);
        this.b = sobVar;
        this.c = i;
        this.d = i2;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(v1b<?> v1bVar) {
        return new iob(this.b, this.c, this.d, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(v1b<? super HTTPResponse<List<? extends BetHistoryItem>>> v1bVar) {
        return ((iob) create(v1bVar)).invokeSuspend(Unit.a);
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
        znb znbVarA = this.b.a.a();
        this.a = 1;
        Object archiveBetHistory = znbVarA.getArchiveBetHistory(this.c, this.d, this);
        return archiveBetHistory == y5bVar ? y5bVar : archiveBetHistory;
    }
}
