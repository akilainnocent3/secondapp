package defpackage;

import android.app.Activity;
import android.graphics.Bitmap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.fruithunt.views.bethistory.FHuntBetHistoryItemViewHolder$bind$2", f = "FHuntBetHistoryItemViewHolder.kt", l = {73}, m = "invokeSuspend", v = 1)
public final class v5h extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ Activity b;
    public final /* synthetic */ u5h c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v5h(Activity activity, u5h u5hVar, v1b<? super v5h> v1bVar) {
        super(2, v1bVar);
        this.b = activity;
        this.c = u5hVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new v5h(this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((v5h) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            s4u<String, Bitmap> s4uVar = r9n.a;
            this.a = 1;
            obj = r9n.c(this, this.b, "bet_fixed_coeff_webp");
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
        this.c.a.D.setImageBitmap((Bitmap) obj);
        return Unit.a;
    }
}
