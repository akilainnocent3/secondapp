package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import androidx.appcompat.widget.AppCompatImageView;
import com.sportygames.pocketrocket.model.response.BetDetails;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.pocketrocket.component.PrUserBetViewHolder$fillDetails$3", f = "PrUserBetViewHolder.kt", l = {144, 153, 162}, m = "invokeSuspend", v = 1)
public final class p920 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public AppCompatImageView a;
    public int b;
    public final /* synthetic */ BetDetails c;
    public final /* synthetic */ q920 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p920(BetDetails betDetails, q920 q920Var, v1b<? super p920> v1bVar) {
        super(2, v1bVar);
        this.c = betDetails;
        this.d = q920Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new p920(this.c, this.d, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((p920) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        AppCompatImageView appCompatImageView;
        AppCompatImageView appCompatImageView2;
        AppCompatImageView appCompatImageView3;
        q920 q920Var = this.d;
        ew2 ew2Var = q920Var.b;
        Context context = q920Var.a;
        y5b y5bVar = y5b.a;
        int i = this.b;
        if (i == 0) {
            uj50.b(obj);
            String rocketType = this.c.getRocketType();
            if (Intrinsics.g(rocketType, "RED")) {
                AppCompatImageView appCompatImageView4 = ew2Var.e;
                s4u<String, Bitmap> s4uVar = r9n.a;
                this.a = appCompatImageView4;
                this.b = 1;
                Object objC = r9n.c(this, context, "red_rocket_with_fire_png");
                if (objC != y5bVar) {
                    obj = objC;
                    appCompatImageView3 = appCompatImageView4;
                    appCompatImageView3.setImageBitmap((Bitmap) obj);
                }
            } else if (Intrinsics.g(rocketType, "PURPLE")) {
                AppCompatImageView appCompatImageView5 = ew2Var.e;
                s4u<String, Bitmap> s4uVar2 = r9n.a;
                this.a = appCompatImageView5;
                this.b = 2;
                Object objC2 = r9n.c(this, context, "purple_rocket_with_fire_png");
                if (objC2 != y5bVar) {
                    obj = objC2;
                    appCompatImageView2 = appCompatImageView5;
                    appCompatImageView2.setImageBitmap((Bitmap) obj);
                }
            } else {
                AppCompatImageView appCompatImageView6 = ew2Var.e;
                s4u<String, Bitmap> s4uVar3 = r9n.a;
                this.a = appCompatImageView6;
                this.b = 3;
                Object objC3 = r9n.c(this, context, "blue_rocket_with_fire_png");
                if (objC3 != y5bVar) {
                    obj = objC3;
                    appCompatImageView = appCompatImageView6;
                    appCompatImageView.setImageBitmap((Bitmap) obj);
                }
            }
            return y5bVar;
        }
        if (i == 1) {
            appCompatImageView3 = this.a;
            uj50.b(obj);
            appCompatImageView3.setImageBitmap((Bitmap) obj);
        } else if (i == 2) {
            appCompatImageView2 = this.a;
            uj50.b(obj);
            appCompatImageView2.setImageBitmap((Bitmap) obj);
        } else {
            if (i != 3) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            appCompatImageView = this.a;
            uj50.b(obj);
            appCompatImageView.setImageBitmap((Bitmap) obj);
        }
        return Unit.a;
    }
}
