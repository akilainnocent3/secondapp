package defpackage;

import android.os.Build;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public abstract class rqz<T> {
    public final CoroutineContext a;
    public w9m b;
    public rch0 c;
    public ynz<T> d;
    public final bsw e;
    public final CopyOnWriteArrayList<Function0<Unit>> f;
    public final uv90 g;
    public volatile boolean h;
    public volatile int i;
    public final wwd0 j;
    public final v340 k;
    public final b390 l;

    public static final class a extends qlr implements Function0<Unit> {
        public final /* synthetic */ rqz<T> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(rqz<T> rqzVar) {
            super(0);
            this.a = rqzVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            b390 b390Var = this.a.l;
            Unit unit = Unit.a;
            b390Var.a(unit);
            return unit;
        }
    }

    public static final class b implements rch0 {
        public boolean a;
        public boolean b;

        @Override // defpackage.rch0
        public final void c() {
            this.b = true;
        }

        @Override // defpackage.rch0
        public final void retry() {
            this.a = true;
        }
    }

    public rqz(CoroutineContext coroutineContext, kqz<T> kqzVar) {
        ynz<T> ynzVar;
        xmz.b<T> bVarInvoke;
        coroutineContext.getClass();
        this.a = coroutineContext;
        this.c = new b();
        ynz<Object> ynzVar2 = ynz.e;
        xmz.b<T> bVarInvoke2 = kqzVar != null ? kqzVar.d.invoke() : null;
        if (bVarInvoke2 != null) {
            ynzVar = new ynz<>(bVarInvoke2);
        } else {
            ynzVar = (ynz<T>) ynz.e;
            ynzVar.getClass();
        }
        this.d = ynzVar;
        bsw bswVar = new bsw();
        if (kqzVar != null && (bVarInvoke = kqzVar.d.invoke()) != null) {
            jxs jxsVar = bVarInvoke.e;
            jxs jxsVar2 = bVarInvoke.f;
            jxsVar.getClass();
            bswVar.c(new zrw(bswVar, jxsVar, jxsVar2));
        }
        this.e = bswVar;
        CopyOnWriteArrayList<Function0<Unit>> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
        this.f = copyOnWriteArrayList;
        this.g = new uv90(true);
        this.j = xwd0.a(Boolean.FALSE);
        this.k = bswVar.c;
        this.l = d390.a(0, 64, pb5.b);
        copyOnWriteArrayList.add(new a(this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final T a(int i) {
        Object value;
        Object value2;
        wwd0 wwd0Var = this.j;
        do {
            value = wwd0Var.getValue();
            ((Boolean) value).getClass();
        } while (!wwd0Var.g(value, Boolean.TRUE));
        this.h = true;
        this.i = i;
        if (Build.ID != null && Log.isLoggable("Paging", 2)) {
            Log.v("Paging", "Accessing item index[" + i + ']', null);
        }
        w9m w9mVar = this.b;
        if (w9mVar != null) {
            w9mVar.a(this.d.c(i));
        }
        T tE = this.d.e(i);
        wwd0 wwd0Var2 = this.j;
        do {
            value2 = wwd0Var2.getValue();
            ((Boolean) value2).getClass();
        } while (!wwd0Var2.g(value2, Boolean.FALSE));
        return tE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(List list, int i, int i2, boolean z, jxs jxsVar, jxs jxsVar2, w9m w9mVar, x1b x1bVar) {
        uqz uqzVar;
        ynz<T> ynzVar;
        w9m w9mVar2;
        List<T> list2;
        List<T> list3;
        if (x1bVar instanceof uqz) {
            uqzVar = (uqz) x1bVar;
            int i3 = uqzVar.A;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                uqzVar.A = i3 - Integer.MIN_VALUE;
            } else {
                uqzVar = new uqz(this, x1bVar);
            }
        } else {
            uqzVar = new uqz(this, x1bVar);
        }
        Object obj = uqzVar.y;
        y5b y5bVar = y5b.a;
        int i4 = uqzVar.A;
        if (i4 == 0) {
            uj50.b(obj);
            if (z && jxsVar == null) {
                hb5.a("Cannot dispatch LoadStates in PagingDataPresenter without source LoadStates set.");
                return null;
            }
            this.h = false;
            ynzVar = new ynz<>(i, i2, list);
            ynz<T> ynzVar2 = this.d;
            ynzVar2.getClass();
            this.d = ynzVar;
            this.b = w9mVar;
            qqz.e eVar = new qqz.e(ynzVar, ynzVar2);
            uqzVar.a = this;
            uqzVar.b = list;
            uqzVar.c = jxsVar;
            uqzVar.d = jxsVar2;
            uqzVar.e = w9mVar;
            uqzVar.f = ynzVar;
            uqzVar.i = i;
            uqzVar.v = i2;
            uqzVar.w = z;
            uqzVar.A = 1;
            if (c(eVar, uqzVar) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i4 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z = uqzVar.w;
            i2 = uqzVar.v;
            i = uqzVar.i;
            ynz<T> ynzVar3 = uqzVar.f;
            w9mVar = uqzVar.e;
            jxsVar2 = uqzVar.d;
            jxsVar = uqzVar.c;
            list = uqzVar.b;
            rqz<T> rqzVar = uqzVar.a;
            uj50.b(obj);
            ynzVar = ynzVar3;
            this = rqzVar;
        }
        if (Build.ID != null && Log.isLoggable("Paging", 3)) {
            StringBuilder sb = new StringBuilder("Presenting data (\n                            |   first item: ");
            msg0 msg0Var = (msg0) CollectionsKt.firstOrNull(list);
            sb.append((msg0Var == null || (list3 = msg0Var.b) == null) ? null : CollectionsKt.firstOrNull(list3));
            sb.append("\n                            |   last item: ");
            msg0 msg0Var2 = (msg0) CollectionsKt.d0(list);
            sb.append((msg0Var2 == null || (list2 = msg0Var2.b) == null) ? null : CollectionsKt.d0(list2));
            sb.append("\n                            |   placeholdersBefore: ");
            sb.append(i);
            sb.append("\n                            |   placeholdersAfter: ");
            sb.append(i2);
            sb.append("\n                            |   hintReceiver: ");
            sb.append(w9mVar);
            sb.append("\n                            |   sourceLoadStates: ");
            sb.append(jxsVar);
            sb.append("\n                        ");
            String string = sb.toString();
            if (jxsVar2 != null) {
                string = string + "|   mediatorLoadStates: " + jxsVar2 + '\n';
            }
            Log.d("Paging", qae0.d(string.concat("|)")), null);
        }
        if (z) {
            bsw bswVar = this.e;
            jxsVar.getClass();
            bswVar.getClass();
            bswVar.c(new zrw(bswVar, jxsVar, jxsVar2));
        }
        if (ynzVar.a() == 0 && (w9mVar2 = this.b) != null) {
            int i5 = ynzVar.b / 2;
            w9mVar2.a(new qai0.b(i5, i5, ynzVar.g(), ynzVar.h()));
        }
        return Unit.a;
    }

    public abstract Object c(qqz qqzVar, x1b x1bVar);

    public final void d() {
        if (Build.ID != null && Log.isLoggable("Paging", 3)) {
            Log.d("Paging", "Refresh signal received", null);
        }
        this.c.c();
    }

    public final void e() {
        if (Build.ID != null && Log.isLoggable("Paging", 3)) {
            Log.d("Paging", "Retry signal received", null);
        }
        this.c.retry();
    }

    public final d3p<T> f() {
        ynz<T> ynzVar = this.d;
        int i = ynzVar.c;
        int i2 = ynzVar.d;
        ArrayList arrayList = ynzVar.a;
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            p48.w(((msg0) obj).b, arrayList2);
        }
        return new d3p<>(arrayList2, i, i2);
    }
}
