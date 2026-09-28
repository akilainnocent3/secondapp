package defpackage;

import android.content.Context;
import android.util.DisplayMetrics;
import kotlin.Unit;
import kotlin.collections.b;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.home.MainViewModel$fetchRecapConfig$1", f = "MainViewModel.kt", l = {676}, m = "invokeSuspend", v = 2)
public final class uku extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ oku b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uku(v1b v1bVar, oku okuVar) {
        super(2, v1bVar);
        this.b = okuVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new uku(v1bVar, this.b);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((uku) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        oku okuVar = this.b;
        if (i == 0) {
            uj50.b(obj);
            bd40 bd40Var = okuVar.L;
            this.a = 1;
            obj = bd40Var.a(this);
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
        if (((ad40) obj).a) {
            Context context = okuVar.M.a;
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            for (String str : b.k("https://s.sporty.net/cms/new_recap_bg_0_7af02963ff.jpg", "https://s.sporty.net/cms/recap_bg_1_19c222393e.jpg", "https://s.sporty.net/cms/recap_bg_2_f10838fbf1.jpg", "https://s.sporty.net/cms/recap_bg_3_be6bfa9180.jpg", "https://s.sporty.net/cms/new_recap_bg_4_8258e7608e.jpg", "https://s.sporty.net/cms/recap_analyze_bg_64fcf2a763.jpg")) {
                nan.a aVar = new nan.a(context);
                aVar.c = str;
                aVar.f(dx90.a(displayMetrics.widthPixels, displayMetrics.heightPixels));
                aVar.s = dm20.b;
                qw90.a(context).a(aVar.a());
            }
        }
        return Unit.a;
    }
}
