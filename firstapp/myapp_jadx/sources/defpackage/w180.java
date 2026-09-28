package defpackage;

import com.sportybet.plugin.realsports.data.HotKeywordData;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.realsports.search.SearchViewModel$getHotKeywords$2", f = "SearchViewModel.kt", l = {105}, m = "invokeSuspend", v = 2)
public final class w180 extends tje0 implements gaj<myh<? super lk50<? extends List<? extends HotKeywordData>>>, Throwable, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ myh b;
    public /* synthetic */ Throwable c;

    @Override // defpackage.gaj
    public final Object invoke(myh<? super lk50<? extends List<? extends HotKeywordData>>> myhVar, Throwable th, v1b<? super Unit> v1bVar) {
        w180 w180Var = new w180(3, v1bVar);
        w180Var.b = myhVar;
        w180Var.c = th;
        return w180Var.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        myh myhVar = this.b;
        Throwable th = this.c;
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            lk50.a aVarA = gtc0.a(th, obj);
            this.b = null;
            this.c = null;
            this.a = 1;
            if (myhVar.emit(aVarA, this) == y5bVar) {
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
