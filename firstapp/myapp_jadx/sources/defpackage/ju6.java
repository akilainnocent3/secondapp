package defpackage;

import android.animation.ObjectAnimator;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.lobby.views.adapter.CategoryShimmerAdapter$onBindViewHolder$1", f = "CategoryShimmerAdapter.kt", l = {29}, m = "invokeSuspend", v = 1)
public final class ju6 extends tje0 implements Function2<ImageView, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ iu6 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ju6(iu6 iu6Var, v1b<? super ju6> v1bVar) {
        super(2, v1bVar);
        this.c = iu6Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        ju6 ju6Var = new ju6(this.c, v1bVar);
        ju6Var.b = obj;
        return ju6Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ImageView imageView, v1b<? super Unit> v1bVar) {
        return ((ju6) create(imageView, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) throws Throwable {
        ImageView imageView = (ImageView) this.b;
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            this.b = null;
            this.a = 1;
            bc6 bc6Var = new bc6(1, yzo.b(this));
            bc6Var.q();
            float width = 70.0f;
            if ((imageView == null || imageView.getWidth() != 0) && imageView != null) {
                width = imageView.getWidth();
            }
            if (imageView != null) {
                imageView.setPivotX(0.0f);
            }
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(imageView, "translationX", 0.0f, width);
            objectAnimatorOfFloat.setDuration(1600L);
            objectAnimatorOfFloat.setInterpolator(new LinearInterpolator());
            objectAnimatorOfFloat.setRepeatCount(-1);
            objectAnimatorOfFloat.start();
            bc6Var.t(new ku6(objectAnimatorOfFloat));
            Object objO = bc6Var.o();
            if (objO != y5bVar) {
                objO = Unit.a;
            }
            if (objO == y5bVar) {
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
