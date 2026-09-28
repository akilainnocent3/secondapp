package defpackage;

import android.content.Context;
import androidx.camera.core.impl.utils.TP.sgwpmp;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IndexedValue;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"La1l;", "Lj8i0;", "d", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class a1l extends j8i0 {
    public final wwd0 A;
    public final wwd0 B;
    public final v340 C;
    public final wwd0 D;
    public final v340 E;
    public final ku90<z0l> F;
    public final ku90 G;
    public boolean H;
    public String I;
    public final Context a;
    public final uqm b;
    public final x0l c;
    public final v800 d;
    public final iym e;
    public final w900 f;
    public final psm i;
    public final rdd0 v;
    public final c0e w;
    public final i2k0 y;
    public final ubk0 z;

    /* JADX INFO: loaded from: classes2.dex */
    @c0d(c = "com.sportybet.android.basepay.viewModel.GlobalDepositViewModel$1", f = "GlobalDepositViewModel.kt", l = {85}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;

        /* JADX INFO: renamed from: a1l$a$a, reason: collision with other inner class name */
        /* JADX INFO: loaded from: classes5.dex */
        public static final class C0002a<T> implements myh {
            public final /* synthetic */ a1l a;

            public C0002a(a1l a1lVar) {
                this.a = a1lVar;
            }

            @Override // defpackage.myh
            public final Object emit(Object obj, v1b v1bVar) {
                this.a.x1(new z0l.c(((Number) obj).intValue()));
                return Unit.a;
            }
        }

        public a(v1b<? super a> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return a1l.this.new a(v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
            return y5b.a;
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i != 0) {
                if (i == 1) {
                    throw l80.a(obj);
                }
                ib5.a(sgwpmp.jDlGa);
                return null;
            }
            uj50.b(obj);
            a1l a1lVar = a1l.this;
            ku90<Integer> ku90Var = a1lVar.d.h;
            C0002a c0002a = new C0002a(a1lVar);
            this.a = 1;
            ku90Var.collect(c0002a, this);
            return y5bVar;
        }
    }

    @c0d(c = "com.sportybet.android.basepay.viewModel.GlobalDepositViewModel$2", f = "GlobalDepositViewModel.kt", l = {90}, m = "invokeSuspend", v = 2)
    public static final class b extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;

        public static final class a<T> implements myh {
            public final /* synthetic */ a1l a;

            public a(a1l a1lVar) {
                this.a = a1lVar;
            }

            @Override // defpackage.myh
            public final Object emit(Object obj, v1b v1bVar) {
                this.a.x1(new z0l.d((n990) obj));
                return Unit.a;
            }
        }

        public b(v1b<? super b> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return a1l.this.new b(v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            ((b) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
            return y5b.a;
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i != 0) {
                if (i == 1) {
                    throw l80.a(obj);
                }
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
            a1l a1lVar = a1l.this;
            ku90<n990> ku90Var = a1lVar.d.j;
            a aVar = new a(a1lVar);
            this.a = 1;
            ku90Var.collect(aVar, this);
            return y5bVar;
        }
    }

    @c0d(c = "com.sportybet.android.basepay.viewModel.GlobalDepositViewModel$3", f = "GlobalDepositViewModel.kt", l = {95}, m = "invokeSuspend", v = 2)
    public static final class c extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;

        public static final class a<T> implements myh {
            public final /* synthetic */ a1l a;

            public a(a1l a1lVar) {
                this.a = a1lVar;
            }

            @Override // defpackage.myh
            public final Object emit(Object obj, v1b v1bVar) {
                this.a.x1(z0l.b.a);
                return Unit.a;
            }
        }

        public c(v1b<? super c> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return a1l.this.new c(v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            ((c) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
            return y5b.a;
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i != 0) {
                if (i == 1) {
                    throw l80.a(obj);
                }
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
            a1l a1lVar = a1l.this;
            ku90<Unit> ku90Var = a1lVar.d.k;
            a aVar = new a(a1lVar);
            this.a = 1;
            ku90Var.collect(aVar, this);
            return y5bVar;
        }
    }

    @c0d(c = "com.sportybet.android.basepay.viewModel.GlobalDepositViewModel$emitSideEffect$1", f = "GlobalDepositViewModel.kt", l = {217}, m = "invokeSuspend", v = 2)
    public static final class e extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ z0l c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(z0l z0lVar, v1b<? super e> v1bVar) {
            super(2, v1bVar);
            this.c = z0lVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return a1l.this.new e(this.c, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((e) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                ku90<z0l> ku90Var = a1l.this.F;
                this.a = 1;
                if (ku90Var.a.emit(this.c, this) == y5bVar) {
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

    public a1l(Context context, uqm uqmVar, x0l x0lVar, v800 v800Var, iym iymVar, w900 w900Var, psm psmVar, rdd0 rdd0Var, c0e c0eVar, i2k0 i2k0Var, ubk0 ubk0Var) {
        uqmVar.getClass();
        v800Var.getClass();
        iymVar.getClass();
        w900Var.getClass();
        psmVar.getClass();
        rdd0Var.getClass();
        c0eVar.getClass();
        i2k0Var.getClass();
        ubk0Var.getClass();
        this.a = context;
        this.b = uqmVar;
        this.c = x0lVar;
        this.d = v800Var;
        this.e = iymVar;
        this.f = w900Var;
        this.i = psmVar;
        this.v = rdd0Var;
        this.w = c0eVar;
        this.y = i2k0Var;
        this.z = ubk0Var;
        this.A = v800Var.i;
        wwd0 wwd0VarA = xwd0.a(null);
        this.B = wwd0VarA;
        this.C = e1i.b(wwd0VarA);
        wwd0 wwd0VarA2 = xwd0.a(null);
        this.D = wwd0VarA2;
        this.E = e1i.b(wwd0VarA2);
        ku90<z0l> ku90Var = new ku90<>();
        this.F = ku90Var;
        this.G = ku90Var;
        this.I = "All deposits";
        v800Var.m = o8i0.d(this);
        x1(z0l.e.a);
        ej5.c(o8i0.d(this), null, null, new a(null), 3);
        ej5.c(o8i0.d(this), null, null, new b(null), 3);
        ej5.c(o8i0.d(this), null, null, new c(null), 3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Pair y1(int i, List list) {
        Pair pair;
        Iterator it = CollectionsKt.G0(list).iterator();
        do {
            hfn hfnVar = (hfn) it;
            pair = null;
            if (!hfnVar.a.hasNext()) {
                break;
            }
            IndexedValue indexedValue = (IndexedValue) hfnVar.next();
            int i2 = indexedValue.a;
            Iterator<o800.a> it2 = ((o800) indexedValue.b).b.a.iterator();
            int i3 = 0;
            while (true) {
                if (!it2.hasNext()) {
                    i3 = -1;
                    break;
                }
                if (it2.next().b.getId() == i) {
                    break;
                }
                i3++;
            }
            if (i3 != -1) {
                pair = new Pair(Integer.valueOf(i2), Integer.valueOf(i3));
            }
        } while (pair == null);
        return pair;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0083  */
    /* JADX WARN: Code duplicated, block: B:38:0x008d  */
    /* JADX WARN: Code duplicated, block: B:40:0x0091  */
    /* JADX WARN: Code duplicated, block: B:42:0x00af  */
    /* JADX WARN: Code duplicated, block: B:45:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:46:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0064, code lost:
    
        if (r2 != null) goto L39;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A1(defpackage.x1b r9) {
        /*
            Method dump skipped, instruction units count: 211
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a1l.A1(x1b):java.lang.Object");
    }

    public final void x1(z0l z0lVar) {
        ej5.c(o8i0.d(this), null, null, new e(z0lVar, null), 3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object z1(x1b x1bVar) {
        c1l c1lVar;
        if (x1bVar instanceof c1l) {
            c1lVar = (c1l) x1bVar;
            int i = c1lVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                c1lVar.c = i - Integer.MIN_VALUE;
            } else {
                c1lVar = new c1l(this, x1bVar);
            }
        } else {
            c1lVar = new c1l(this, x1bVar);
        }
        Object obj = c1lVar.a;
        y5b y5bVar = y5b.a;
        int i2 = c1lVar.c;
        if (i2 == 0) {
            uj50.b(obj);
            uqm uqmVar = this.b;
            if (uqmVar.getAccountInfo() != null) {
                return Unit.a;
            }
            c1lVar.c = 1;
            bc6 bc6Var = new bc6(1, yzo.b(c1lVar));
            bc6Var.q();
            uqmVar.loadAccountInfo(new d1l(bc6Var));
            if (bc6Var.o() == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        return Unit.a;
    }

    public static final class d {
        public final List<o800> a;
        public final Integer b;

        public d(List<o800> list, Integer num) {
            list.getClass();
            this.a = list;
            this.b = num;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return Intrinsics.g(this.a, dVar.a) && Intrinsics.g(this.b, dVar.b);
        }

        public final int hashCode() {
            int iHashCode = this.a.hashCode() * 31;
            Integer num = this.b;
            return iHashCode + (num == null ? 0 : num.hashCode());
        }

        public final String toString() {
            return "DepositTabsState(providerTabs=" + this.a + ", selectedTabIndex=" + this.b + ")";
        }

        public d() {
            this(m2g.a, null);
        }
    }
}
