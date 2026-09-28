package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.bumptech.glide.a;
import com.sportygames.pingpong.components.ShMultiplierContainer;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.pingpong.components.ShMultiplierContainer$setP1WaitingAnimation$1", f = "ShMultiplierContainer.kt", l = {844}, m = "invokeSuspend", v = 1)
public final class nu80 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ ShMultiplierContainer b;
    public final /* synthetic */ bq40 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nu80(ShMultiplierContainer shMultiplierContainer, bq40 bq40Var, v1b<? super nu80> v1bVar) {
        super(2, v1bVar);
        this.b = shMultiplierContainer;
        this.c = bq40Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new nu80(this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((nu80) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        long j;
        f820 binding;
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i != 0 && i != 1) {
            ib5.a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        uj50.b(obj);
        do {
            ShMultiplierContainer shMultiplierContainer = this.b;
            if (!shMultiplierContainer.y.equals("ROUND_WAITING")) {
                return Unit.a;
            }
            Context context = shMultiplierContainer.a;
            bq40 bq40Var = this.c;
            if (context != null && (binding = shMultiplierContainer.getBinding()) != null) {
                ImageView imageView = binding.B;
                if (shMultiplierContainer.z == 1) {
                    ea50<Drawable> ea50VarO = a.b(context).c(context).o(shMultiplierContainer.Q[bq40Var.a]);
                    f820 binding2 = shMultiplierContainer.getBinding();
                    ea50VarO.p(binding2 != null ? binding2.B.getDrawable() : null).f().M(imageView);
                } else {
                    ea50<Drawable> ea50VarO2 = a.b(context).c(context).o(shMultiplierContainer.P[bq40Var.a]);
                    f820 binding3 = shMultiplierContainer.getBinding();
                    ea50VarO2.p(binding3 != null ? binding3.B.getDrawable() : null).f().M(imageView);
                }
            }
            if (bq40Var.a == 0) {
                bq40Var.a = 1;
            } else {
                bq40Var.a = 0;
            }
            j = shMultiplierContainer.I;
            this.a = 1;
        } while (hkd.b(j, this) != y5bVar);
        return y5bVar;
    }
}
