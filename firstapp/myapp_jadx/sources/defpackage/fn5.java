package defpackage;

import com.sporty.android.core.model.cms.CMSResponse;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.core.database.CMSCacheIO$getCMSValuesFlow$$inlined$flatMapLatest$1", f = "CMSCacheIO.kt", l = {189}, m = "invokeSuspend", v = 2)
public final class fn5 extends tje0 implements gaj<myh<? super List<? extends CMSResponse>>, String, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ myh b;
    public /* synthetic */ Object c;
    public final /* synthetic */ in5 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fn5(v1b v1bVar, in5 in5Var) {
        super(3, v1bVar);
        this.d = in5Var;
    }

    @Override // defpackage.gaj
    public final Object invoke(myh<? super List<? extends CMSResponse>> myhVar, String str, v1b<? super Unit> v1bVar) {
        fn5 fn5Var = new fn5(v1bVar, this.d);
        fn5Var.b = myhVar;
        fn5Var.c = str;
        return fn5Var.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            myh myhVar = this.b;
            String str = (String) this.c;
            in5 in5Var = this.d;
            gn5 gn5Var = new gn5(in5Var.f().b(in5Var.e(), str));
            this.b = null;
            this.c = null;
            this.a = 1;
            if (kzh.c(myhVar, gn5Var, this) == y5bVar) {
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
