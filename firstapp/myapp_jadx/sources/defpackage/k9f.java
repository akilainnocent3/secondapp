package defpackage;

import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "androidx.compose.foundation.interaction.DragInteractionKt$collectIsDraggedAsState$1$1", f = "DragInteraction.kt", l = {82}, m = "invokeSuspend")
public final class k9f extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ psw b;
    public final /* synthetic */ ytw<Boolean> c;

    public static final class a<T> implements myh {
        public final /* synthetic */ ArrayList a;
        public final /* synthetic */ ytw<Boolean> b;

        public a(ytw ytwVar, ArrayList arrayList) {
            this.a = arrayList;
            this.b = ytwVar;
        }

        @Override // defpackage.myh
        public final Object emit(Object obj, v1b v1bVar) {
            xxo xxoVar = (xxo) obj;
            boolean z = xxoVar instanceof i9f.b;
            ArrayList arrayList = this.a;
            if (z) {
                arrayList.add(xxoVar);
            } else if (xxoVar instanceof i9f.c) {
                arrayList.remove(((i9f.c) xxoVar).a);
            } else if (xxoVar instanceof i9f.a) {
                arrayList.remove(((i9f.a) xxoVar).a);
            }
            this.b.setValue(Boolean.valueOf(!arrayList.isEmpty()));
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k9f(psw pswVar, ytw<Boolean> ytwVar, v1b<? super k9f> v1bVar) {
        super(2, v1bVar);
        this.b = pswVar;
        this.c = ytwVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new k9f(this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((k9f) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) throws Throwable {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i != 0) {
            if (i == 1) {
                uj50.b(obj);
                return Unit.a;
            }
            ib5.a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ArrayList arrayListA = j9f.a(obj);
        b390 b390VarB = this.b.b();
        a aVar = new a(this.c, arrayListA);
        this.a = 1;
        b390VarB.collect(aVar, this);
        return y5bVar;
    }
}
