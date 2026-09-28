package defpackage;

import com.sportygames.commons.remote.model.HTTPResponse;
import com.sportygames.spin2win.model.BetHistoryItem;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportygames.spin2win.data.Spin2WinRepository$getArchiveBetHistory$2", f = "Spin2WinRepository.kt", l = {90}, m = "invokeSuspend", v = 1)
public final class i4b0 extends tje0 implements Function1<v1b<? super HTTPResponse<List<? extends BetHistoryItem>>>, Object> {
    public int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i4b0(int i, int i2, v1b<? super i4b0> v1bVar) {
        super(1, v1bVar);
        this.b = i;
        this.c = i2;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(v1b<?> v1bVar) {
        return new i4b0(this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(v1b<? super HTTPResponse<List<? extends BetHistoryItem>>> v1bVar) {
        return ((i4b0) create(v1bVar)).invokeSuspend(Unit.a);
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
        mpe0 mpe0Var = on0.a;
        s1b0 s1b0VarO = on0.o();
        this.a = 1;
        Object archiveBetHistory = s1b0VarO.getArchiveBetHistory(this.b, this.c, this);
        return archiveBetHistory == y5bVar ? y5bVar : archiveBetHistory;
    }
}
