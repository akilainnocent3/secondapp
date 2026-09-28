package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import okhttp3.internal.http.HttpStatusCodesKt;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sporty.android.platform.features.homeshortcut.sidepanel.SidePanelViewModel$saveAndExitEditMode$1", f = "SidePanelViewModel.kt", l = {HttpStatusCodesKt.HTTP_TEMP_REDIRECT}, m = "invokeSuspend", v = 2)
public final class kh90 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ zg90 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kh90(zg90 zg90Var, v1b<? super kh90> v1bVar) {
        super(2, v1bVar);
        this.b = zg90Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new kh90(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((kh90) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            zg90 zg90Var = this.b;
            List listA0 = CollectionsKt.A0((Iterable) zg90Var.v.getValue());
            zg90Var.y1(Boolean.FALSE, null);
            zg90Var.x1();
            if (!listA0.isEmpty()) {
                l790 l790Var = zg90Var.b;
                this.a = 1;
                if (l790Var.a(listA0, this) == y5bVar) {
                    return y5bVar;
                }
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
