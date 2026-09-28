package defpackage;

import android.content.Context;
import com.sportybet.feature.winning.WinningDialogActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.inject.debugscreen.DebugScreenFeatureDependenciesModule$provideDebugScreenFeatureDependencies$1$openWinningDialog$1", f = "DebugScreenFeatureDependenciesModule.kt", l = {80}, m = "invokeSuspend", v = 2)
public final class p0d extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ u350 b;
    public final /* synthetic */ Context c;
    public final /* synthetic */ String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0d(u350 u350Var, Context context, String str, v1b v1bVar) {
        super(2, v1bVar);
        this.b = u350Var;
        this.c = context;
        this.d = str;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new p0d(this.b, this.c, this.d, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((p0d) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) throws Throwable {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            this.a = 1;
            obj = this.b.d(this);
            if (obj == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        WinningDialogActivity.C1(this.c, this.d, (u350.a) obj);
        return Unit.a;
    }
}
