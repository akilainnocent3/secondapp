package defpackage;

import android.content.Context;
import com.sportybet.android.bookingcode.data.dto.BookingData;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.realsports.betslip.recentcode.RecentCodeViewKt$RecentCodeViewContent$4$10$1", f = "RecentCodeView.kt", l = {403}, m = "invokeSuspend", v = 2)
public final class sh40 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ pg40 b;
    public final /* synthetic */ Context c;
    public final /* synthetic */ zha0 d;
    public final /* synthetic */ eja0 e;
    public final /* synthetic */ ytw<BookingData> f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sh40(pg40 pg40Var, Context context, zha0 zha0Var, eja0 eja0Var, ytw<BookingData> ytwVar, v1b<? super sh40> v1bVar) {
        super(2, v1bVar);
        this.b = pg40Var;
        this.c = context;
        this.d = zha0Var;
        this.e = eja0Var;
        this.f = ytwVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new sh40(this.b, this.c, this.d, this.e, this.f, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((sh40) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        sh40 sh40Var;
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            BookingData value = this.f.getValue();
            wae waeVar = wae.SHARE;
            this.a = 1;
            sh40Var = this;
            if (this.b.a(this.c, value, waeVar, this.d, sh40Var) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
            sh40Var = this;
        }
        sh40Var.e.f.m(jox.b.a);
        return Unit.a;
    }
}
