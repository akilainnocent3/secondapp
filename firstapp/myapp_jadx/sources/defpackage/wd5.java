package defpackage;

import com.sporty.android.core.model.gift.GiftDetails;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.buildandgo.handler.BuildAndGoGiftHandlerImpl$collectGiftGroupList$5", f = "BuildAndGoGiftHandlerImpl.kt", l = {}, m = "invokeSuspend", v = 2)
public final class wd5 extends tje0 implements Function2<List<? extends GiftDetails>, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ be5 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wd5(be5 be5Var, v1b<? super wd5> v1bVar) {
        super(2, v1bVar);
        this.b = be5Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        wd5 wd5Var = new wd5(this.b, v1bVar);
        wd5Var.a = obj;
        return wd5Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(List<? extends GiftDetails> list, v1b<? super Unit> v1bVar) {
        return ((wd5) create(list, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object value;
        List list = (List) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        wwd0 wwd0Var = this.b.c;
        do {
            value = wwd0Var.getValue();
        } while (!wwd0Var.g(value, list));
        return Unit.a;
    }
}
