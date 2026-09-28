package defpackage;

import kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
public final class jqd0<T> implements myh {
    public final /* synthetic */ myh a;

    @c0d(c = "com.sportygames.stacker.presentation.StackerViewModel$observeGameUpdates$1$invokeSuspend$$inlined$filter$1$2", f = "StackerViewModel.kt", l = {50}, m = "emit", v = 1)
    public static final class a extends x1b {
        public /* synthetic */ Object a;
        public int b;

        public a(v1b v1bVar) {
            super(v1bVar);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            this.a = obj;
            this.b |= Integer.MIN_VALUE;
            return jqd0.this.emit(null, this);
        }
    }

    public jqd0(myh myhVar) {
        this.a = myhVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.myh
    public final Object emit(Object obj, v1b v1bVar) {
        a aVar;
        if (v1bVar instanceof a) {
            aVar = (a) v1bVar;
            int i = aVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                aVar.b = i - Integer.MIN_VALUE;
            } else {
                aVar = new a(v1bVar);
            }
        } else {
            aVar = new a(v1bVar);
        }
        Object obj2 = aVar.a;
        y5b y5bVar = y5b.a;
        int i2 = aVar.b;
        if (i2 == 0) {
            uj50.b(obj2);
            if (((zmd0) obj).f.length() > 0) {
                aVar.b = 1;
                if (this.a.emit(obj, aVar) == y5bVar) {
                    return y5bVar;
                }
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj2);
        }
        return Unit.a;
    }
}
