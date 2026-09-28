package defpackage;

import androidx.compose.runtime.snapshots.SnapshotStateList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "androidx.compose.material3.CardElevation$animateElevation$1$1", f = "Card.kt", l = {670}, m = "invokeSuspend")
public final class hg6 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ psw b;
    public final /* synthetic */ SnapshotStateList<xxo> c;

    public static final class a<T> implements myh {
        public final /* synthetic */ SnapshotStateList<xxo> a;

        public a(SnapshotStateList<xxo> snapshotStateList) {
            this.a = snapshotStateList;
        }

        @Override // defpackage.myh
        public final Object emit(Object obj, v1b v1bVar) {
            xxo xxoVar = (xxo) obj;
            boolean z = xxoVar instanceof vkm;
            SnapshotStateList<xxo> snapshotStateList = this.a;
            if (z) {
                snapshotStateList.add(xxoVar);
            } else if (xxoVar instanceof wkm) {
                snapshotStateList.remove(((wkm) xxoVar).a);
            } else if (xxoVar instanceof c4i) {
                snapshotStateList.add(xxoVar);
            } else if (xxoVar instanceof d4i) {
                snapshotStateList.remove(((d4i) xxoVar).a);
            } else if (xxoVar instanceof mp20.b) {
                snapshotStateList.add(xxoVar);
            } else if (xxoVar instanceof mp20.c) {
                snapshotStateList.remove(((mp20.c) xxoVar).a);
            } else if (xxoVar instanceof mp20.a) {
                snapshotStateList.remove(((mp20.a) xxoVar).a);
            } else if (xxoVar instanceof i9f.b) {
                snapshotStateList.add(xxoVar);
            } else if (xxoVar instanceof i9f.c) {
                snapshotStateList.remove(((i9f.c) xxoVar).a);
            } else if (xxoVar instanceof i9f.a) {
                snapshotStateList.remove(((i9f.a) xxoVar).a);
            }
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hg6(psw pswVar, SnapshotStateList<xxo> snapshotStateList, v1b<? super hg6> v1bVar) {
        super(2, v1bVar);
        this.b = pswVar;
        this.c = snapshotStateList;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new hg6(this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((hg6) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
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
        b390 b390VarB = this.b.b();
        a aVar = new a(this.c);
        this.a = 1;
        b390VarB.collect(aVar, this);
        return y5bVar;
    }
}
