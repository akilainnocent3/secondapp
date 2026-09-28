package defpackage;

import android.content.Context;
import com.sportybet.android.bookingcode.data.dto.BookingData;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.realsports.betslip.recentcode.RecentCodeViewKt$RecentCodeViewContent$4$6$1", f = "RecentCodeView.kt", l = {355}, m = "invokeSuspend", v = 2)
public final class uh40 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ pg40 b;
    public final /* synthetic */ Context c;
    public final /* synthetic */ jox.a<BookingData> d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public uh40(pg40 pg40Var, Context context, jox.a<? extends BookingData> aVar, v1b<? super uh40> v1bVar) {
        super(2, v1bVar);
        this.b = pg40Var;
        this.c = context;
        this.d = aVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new uh40(this.b, this.c, this.d, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((uh40) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            BookingData bookingData = this.d.a;
            wae waeVar = wae.SHARE;
            this.a = 1;
            if (this.b.a(this.c, bookingData, waeVar, new zha0(31, null, null, null), this) == y5bVar) {
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
