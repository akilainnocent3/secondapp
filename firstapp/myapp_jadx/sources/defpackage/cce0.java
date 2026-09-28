package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sporty.android.sportynews.groupieitem.SubArticle$bind$1$request$3$1", f = "SubArticle.kt", l = {78}, m = "invokeSuspend", v = 2)
public final class cce0 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ ueb0 b;
    public final /* synthetic */ Bitmap c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cce0(ueb0 ueb0Var, Bitmap bitmap, v1b<? super cce0> v1bVar) {
        super(2, v1bVar);
        this.b = ueb0Var;
        this.c = bitmap;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new cce0(this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((cce0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) throws Throwable {
        y5b y5bVar = y5b.a;
        int i = this.a;
        ueb0 ueb0Var = this.b;
        if (i == 0) {
            uj50.b(obj);
            Context context = ueb0Var.a.getContext();
            context.getClass();
            mg4 mg4Var = new mg4(context);
            Bitmap bitmap = this.c;
            bitmap.getClass();
            ww90 ww90Var = ww90.c;
            this.a = 1;
            obj = mg4Var.b(bitmap);
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
        ueb0Var.b.setImageBitmap((Bitmap) obj);
        return Unit.a;
    }
}
