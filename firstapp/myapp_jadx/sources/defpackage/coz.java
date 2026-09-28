package defpackage;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "androidx.paging.PagedList$dispatchStateChangeAsync$1", f = "PagedList.kt", l = {}, m = "invokeSuspend")
public final class coz extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public final /* synthetic */ u1b a;
    public final /* synthetic */ kxs b;
    public final /* synthetic */ hxs c;

    public static final class a extends qlr implements Function1<WeakReference<Function2<? super kxs, ? super hxs, ? extends Unit>>, Boolean> {
        public static final a a = new a(1);

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(WeakReference<Function2<? super kxs, ? super hxs, ? extends Unit>> weakReference) {
            WeakReference<Function2<? super kxs, ? super hxs, ? extends Unit>> weakReference2 = weakReference;
            weakReference2.getClass();
            return Boolean.valueOf(weakReference2.get() == null);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public coz(u1b u1bVar, kxs kxsVar, hxs hxsVar, v1b v1bVar) {
        super(2, v1bVar);
        this.a = u1bVar;
        this.b = kxsVar;
        this.c = hxsVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new coz(this.a, this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((coz) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        ArrayList arrayList = this.a.v;
        p48.A(arrayList, a.a);
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj2 = arrayList.get(i);
            i++;
            Function2 function2 = (Function2) ((WeakReference) obj2).get();
            if (function2 != null) {
                function2.invoke(this.b, this.c);
            }
        }
        return Unit.a;
    }
}
