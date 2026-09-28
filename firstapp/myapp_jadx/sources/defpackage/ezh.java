package defpackage;

import java.util.Iterator;
import kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
public final class ezh implements lyh<Object> {
    public final /* synthetic */ Iterable a;

    @c0d(c = "kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$3", f = "Builders.kt", l = {111}, m = "collect")
    public static final class a extends x1b {
        public /* synthetic */ Object a;
        public int b;
        public myh d;
        public Iterator e;

        public a(v1b v1bVar) {
            super(v1bVar);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            this.a = obj;
            this.b |= Integer.MIN_VALUE;
            return ezh.this.collect(null, this);
        }
    }

    public ezh(Iterable iterable) {
        this.a = iterable;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.lyh
    public final Object collect(myh<? super Object> myhVar, v1b<? super Unit> v1bVar) {
        a aVar;
        Iterator it;
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
        Object obj = aVar.a;
        y5b y5bVar = y5b.a;
        int i2 = aVar.b;
        if (i2 == 0) {
            uj50.b(obj);
            it = this.a.iterator();
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            it = aVar.e;
            myhVar = aVar.d;
            uj50.b(obj);
        }
        while (it.hasNext()) {
            Object next = it.next();
            aVar.d = myhVar;
            aVar.e = it;
            aVar.b = 1;
            if (myhVar.emit(next, aVar) == y5bVar) {
                return y5bVar;
            }
        }
        return Unit.a;
    }
}
