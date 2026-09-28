package defpackage;

import com.google.protobuf.DescriptorProtos;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "com.sportybet.android.joker.presentation.reveal.JokerSelectionsViewModel$onLoadJokerSelections$1", f = "JokerSelectionsViewModel.kt", l = {DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER}, m = "invokeSuspend", v = 2)
public final class gbp extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public fbp a;
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ fbp d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gbp(fbp fbpVar, v1b<? super gbp> v1bVar) {
        super(2, v1bVar);
        this.d = fbpVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        gbp gbpVar = new gbp(this.d, v1bVar);
        gbpVar.c = obj;
        return gbpVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((gbp) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object bVar;
        fbp fbpVar;
        y5b y5bVar = y5b.a;
        int i = this.b;
        fbp fbpVar2 = this.d;
        try {
            if (i == 0) {
                uj50.b(obj);
                zi50.a aVar = zi50.b;
                kbp kbpVar = fbpVar2.a;
                String str = fbpVar2.b;
                this.c = null;
                this.a = fbpVar2;
                this.b = 1;
                obj = kbpVar.a.b(str, this);
                if (obj == y5bVar) {
                    return y5bVar;
                }
                fbpVar = fbpVar2;
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                fbpVar = this.a;
                uj50.b(obj);
            }
            List list = (List) obj;
            fbpVar.getClass();
            ArrayList arrayListY1 = fbp.y1(list);
            ArrayList arrayListX1 = fbp.x1(list);
            wwd0 wwd0Var = fbpVar.c;
            vap.c cVar = new vap.c(arrayListY1, arrayListX1);
            wwd0Var.getClass();
            wwd0Var.k(null, cVar);
            bVar = Unit.a;
            zi50.a aVar2 = zi50.b;
        } catch (Throwable th) {
            zi50.a aVar3 = zi50.b;
            bVar = new zi50.b(th);
        }
        Throwable thA = zi50.a(bVar);
        if (thA != null) {
            itf0.a.e(thA);
            fbpVar2.c.setValue(vap.a.a);
        }
        return Unit.a;
    }
}
