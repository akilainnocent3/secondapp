package defpackage;

import com.sportygames.newcms.b;
import kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.fbg_dialog.FBGDialogViewModel$downloadCmsData$4", f = "FBGDialogViewModel.kt", l = {74}, m = "invokeSuspend", v = 1)
public final class b5h extends tje0 implements gaj<myh<? super xxs<b>>, Throwable, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ e5h b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b5h(e5h e5hVar, v1b<? super b5h> v1bVar) {
        super(3, v1bVar);
        this.b = e5hVar;
    }

    @Override // defpackage.gaj
    public final Object invoke(myh<? super xxs<b>> myhVar, Throwable th, v1b<? super Unit> v1bVar) {
        return new b5h(this.b, v1bVar).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            wwd0 wwd0Var = this.b.e;
            pn5 pn5Var = pn5.c;
            this.a = 1;
            wwd0Var.setValue(pn5Var);
            if (Unit.a == y5bVar) {
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
