package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import com.sportygames.goldmine.data.dto.oBji.dLRYz;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes8.dex */
@c0d(c = "com.sportygames.sportykick.components.DeflatedBallDropAnimationKt$DeflatedBallDropAnimation$1$1", f = "DeflatedBallDropAnimation.kt", l = {66}, m = "invokeSuspend", v = 1)
public final class zjd extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ String c;
    public final /* synthetic */ m9n d;
    public final /* synthetic */ ytw<c8n> e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zjd(Context context, String str, m9n m9nVar, ytw<c8n> ytwVar, v1b<? super zjd> v1bVar) {
        super(2, v1bVar);
        this.b = context;
        this.c = str;
        this.d = m9nVar;
        this.e = ytwVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new zjd(this.b, this.c, this.d, this.e, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((zjd) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        u7n u7nVar;
        Bitmap bitmapC;
        y5b y5bVar = y5b.a;
        int i = this.a;
        t70 t70Var = null;
        if (i == 0) {
            uj50.b(obj);
            nan.a aVar = new nan.a(this.b);
            aVar.c = this.c;
            abn.a(aVar, false);
            nan nanVarA = aVar.a();
            this.a = 1;
            obj = this.d.b(nanVarA, this);
            if (obj == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a(dLRYz.XTews);
                return null;
            }
            uj50.b(obj);
        }
        dbn dbnVar = (dbn) obj;
        dfe0 dfe0Var = dbnVar instanceof dfe0 ? (dfe0) dbnVar : null;
        if (dfe0Var != null && (u7nVar = dfe0Var.a) != null && (bitmapC = zbn.c(u7nVar)) != null) {
            t70Var = new t70(bitmapC);
        }
        this.e.setValue(t70Var);
        return Unit.a;
    }
}
