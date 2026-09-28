package defpackage;

import com.sportybet.plugin.realsports.data.Event;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.realsports.home.presentation.LiveEventsPanelViewModel$handleEventMessage$5", f = "LiveEventsPanelViewModel.kt", l = {601}, m = "invokeSuspend", v = 2)
public final class mns extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ nns b;
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ Event d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mns(nns nnsVar, ArrayList arrayList, Event event, v1b v1bVar) {
        super(2, v1bVar);
        this.b = nnsVar;
        this.c = arrayList;
        this.d = event;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new mns(this.b, this.c, this.d, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((mns) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            b390 b390Var = this.b.J;
            Event event = this.d;
            ArrayList arrayList = this.c;
            qrg qrgVar = new qrg(arrayList.indexOf(event), arrayList);
            this.a = 1;
            if (b390Var.emit(qrgVar, this) == y5bVar) {
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
