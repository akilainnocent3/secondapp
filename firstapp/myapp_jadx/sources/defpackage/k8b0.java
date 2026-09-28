package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.sportybet.android.gp.tz.R;
import com.sportygames.lobby.remote.models.GameDetails;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportygames.spindabottle.views.SpinFragment$showHowToPlay$2$1", f = "SpinFragment.kt", l = {862}, m = "invokeSuspend", v = 1)
public final class k8b0 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ b8b0 c;
    public final /* synthetic */ Function0<Unit> d;
    public final /* synthetic */ boolean e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k8b0(Context context, b8b0 b8b0Var, Function0<Unit> function0, boolean z, v1b<? super k8b0> v1bVar) {
        super(2, v1bVar);
        this.b = context;
        this.c = b8b0Var;
        this.d = function0;
        this.e = z;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new k8b0(this.b, this.c, this.d, this.e, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((k8b0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        Context context = this.b;
        b8b0 b8b0Var = this.c;
        if (i == 0) {
            uj50.b(obj);
            s4u<String, Bitmap> s4uVar = r9n.a;
            String string = b8b0Var.getString(R.string.key_background_htp_png);
            string.getClass();
            this.a = 1;
            obj = r9n.b(context, string, this);
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
        Drawable drawable = (Drawable) obj;
        GameDetails gameDetails = b8b0Var.y;
        nle nleVar = new nle(context, gameDetails != null ? gameDetails.getName() : null, null, drawable, this.d, 4);
        b8b0Var.u0 = nleVar;
        nleVar.show();
        if (this.e) {
            GameDetails gameDetails2 = b8b0Var.y;
            wz.a("PaytableCheck", gameDetails2 != null ? gameDetails2.getName() : null, new String[0]);
        }
        return Unit.a;
    }
}
