package defpackage;

import com.sportygames.fbg_dialog.data.model.GiftItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.fbg_dialog.presentation.component.ComposeFBGDialogKt$ComposeFBGDialog$2$1$2$1$1", f = "ComposeFBGDialog.kt", l = {121}, m = "invokeSuspend", v = 1)
public final class nca extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ j590 b;
    public final /* synthetic */ gaj<GiftItem, Double, Boolean, Unit> c;
    public final /* synthetic */ GiftItem d;
    public final /* synthetic */ double e;
    public final /* synthetic */ boolean f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public nca(j590 j590Var, gaj<? super GiftItem, ? super Double, ? super Boolean, Unit> gajVar, GiftItem giftItem, double d, boolean z, v1b<? super nca> v1bVar) {
        super(2, v1bVar);
        this.b = j590Var;
        this.c = gajVar;
        this.d = giftItem;
        this.e = d;
        this.f = z;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new nca(this.b, this.c, this.d, this.e, this.f, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((nca) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            this.a = 1;
            if (this.b.d(this) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        this.c.invoke(this.d, new Double(this.e), Boolean.valueOf(this.f));
        return Unit.a;
    }
}
