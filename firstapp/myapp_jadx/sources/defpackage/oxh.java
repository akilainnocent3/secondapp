package defpackage;

import java.util.ArrayList;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "androidx.compose.material3.FloatingActionButtonElevation$animateElevation$2$1", f = "FloatingActionButton.kt", l = {651}, m = "invokeSuspend")
public final class oxh extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ psw c;
    public final /* synthetic */ sxh d;

    public static final class a<T> implements myh {
        public final /* synthetic */ ArrayList a;
        public final /* synthetic */ v5b b;
        public final /* synthetic */ sxh c;

        public a(ArrayList arrayList, v5b v5bVar, sxh sxhVar) {
            this.a = arrayList;
            this.b = v5bVar;
            this.c = sxhVar;
        }

        @Override // defpackage.myh
        public final Object emit(Object obj, v1b v1bVar) {
            xxo xxoVar = (xxo) obj;
            boolean z = xxoVar instanceof vkm;
            ArrayList arrayList = this.a;
            if (z) {
                arrayList.add(xxoVar);
            } else if (xxoVar instanceof wkm) {
                arrayList.remove(((wkm) xxoVar).a);
            } else if (xxoVar instanceof c4i) {
                arrayList.add(xxoVar);
            } else if (xxoVar instanceof d4i) {
                arrayList.remove(((d4i) xxoVar).a);
            } else if (xxoVar instanceof mp20.b) {
                arrayList.add(xxoVar);
            } else if (xxoVar instanceof mp20.c) {
                arrayList.remove(((mp20.c) xxoVar).a);
            } else if (xxoVar instanceof mp20.a) {
                arrayList.remove(((mp20.a) xxoVar).a);
            }
            ej5.c(this.b, null, null, new nxh(this.c, (xxo) CollectionsKt.d0(arrayList), null), 3);
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oxh(psw pswVar, sxh sxhVar, v1b<? super oxh> v1bVar) {
        super(2, v1bVar);
        this.c = pswVar;
        this.d = sxhVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        oxh oxhVar = new oxh(this.c, this.d, v1bVar);
        oxhVar.b = obj;
        return oxhVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((oxh) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
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
        uj50.b(obj);
        v5b v5bVar = (v5b) this.b;
        ArrayList arrayList = new ArrayList();
        b390 b390VarB = this.c.b();
        a aVar = new a(arrayList, v5bVar, this.d);
        this.a = 1;
        b390VarB.collect(aVar, this);
        return y5bVar;
    }
}
