package defpackage;

import com.sportybet.android.gp.tz.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes6.dex */
public final class lh90 extends oh90<nq30, td90> {
    public final en20 a;
    public final k5b b;
    public final List<be90.a<nq30>> c;
    public final wwd0 d;
    public final v340 e;
    public final ju90<td90> f;
    public final t340 i;

    @c0d(c = "com.sportygames.refscall.conponent.sidepanel.SidePanelViewModel$state$1", f = "SidePanelViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class a extends tje0 implements gaj<uf00<? extends be90.b<nq30>>, me90.a, v1b<? super dk60<nq30>>, Object> {
        public /* synthetic */ uf00 a;
        public /* synthetic */ me90.a b;

        public a(v1b<? super a> v1bVar) {
            super(3, v1bVar);
        }

        @Override // defpackage.gaj
        public final Object invoke(uf00<? extends be90.b<nq30>> uf00Var, me90.a aVar, v1b<? super dk60<nq30>> v1bVar) {
            a aVar2 = lh90.this.new a(v1bVar);
            aVar2.a = uf00Var;
            aVar2.b = aVar;
            return aVar2.invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            uf00 uf00Var = this.a;
            me90.a aVar = this.b;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            return new dk60(aVar.b, aVar.a, a4h.f(CollectionsKt.i0(lh90.this.c, uf00Var)));
        }
    }

    /* JADX INFO: loaded from: classes4.dex */
    public static final class b implements lyh<be90.b<nq30>> {
        public final /* synthetic */ lyh a;
        public final /* synthetic */ gne0 b;

        public static final class a<T> implements myh {
            public final /* synthetic */ myh a;
            public final /* synthetic */ gne0 b;

            /* JADX INFO: renamed from: lh90$b$a$a, reason: collision with other inner class name */
            @c0d(c = "com.sportygames.refscall.conponent.sidepanel.SidePanelViewModel$switchData$lambda$0$$inlined$map$1$2", f = "SidePanelViewModel.kt", l = {50}, m = "emit", v = 1)
            public static final class C0815a extends x1b {
                public /* synthetic */ Object a;
                public int b;

                public C0815a(v1b v1bVar) {
                    super(v1bVar);
                }

                @Override // defpackage.pz1
                public final Object invokeSuspend(Object obj) {
                    this.a = obj;
                    this.b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(myh myhVar, gne0 gne0Var) {
                this.a = myhVar;
                this.b = gne0Var;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // defpackage.myh
            public final Object emit(Object obj, v1b v1bVar) {
                C0815a c0815a;
                if (v1bVar instanceof C0815a) {
                    c0815a = (C0815a) v1bVar;
                    int i = c0815a.b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c0815a.b = i - Integer.MIN_VALUE;
                    } else {
                        c0815a = new C0815a(v1bVar);
                    }
                } else {
                    c0815a = new C0815a(v1bVar);
                }
                Object obj2 = c0815a.a;
                y5b y5bVar = y5b.a;
                int i2 = c0815a.b;
                if (i2 == 0) {
                    uj50.b(obj2);
                    boolean zBooleanValue = ((Boolean) obj).booleanValue();
                    gne0 gne0Var = this.b;
                    be90.b bVar = new be90.b(gne0Var.a, gne0Var.b, zBooleanValue, new nq30.a(gne0Var.c, zBooleanValue));
                    c0815a.b = 1;
                    if (this.a.emit(bVar, c0815a) == y5bVar) {
                        return y5bVar;
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

        public b(lyh lyhVar, gne0 gne0Var) {
            this.a = lyhVar;
            this.b = gne0Var;
        }

        @Override // defpackage.lyh
        public final Object collect(myh<? super be90.b<nq30>> myhVar, v1b v1bVar) {
            Object objCollect = this.a.collect(new a(myhVar, this.b), v1bVar);
            return objCollect == y5b.a ? objCollect : Unit.a;
        }
    }

    /* JADX INFO: loaded from: classes4.dex */
    public static final class c implements lyh<uf00<? extends be90.b<nq30>>> {
        public final /* synthetic */ lyh[] a;

        public static final class a implements Function0<be90.b<nq30>[]> {
            public final /* synthetic */ lyh[] a;

            public a(lyh[] lyhVarArr) {
                this.a = lyhVarArr;
            }

            @Override // kotlin.jvm.functions.Function0
            public final be90.b<nq30>[] invoke() {
                return new be90.b[this.a.length];
            }
        }

        @c0d(c = "com.sportygames.refscall.conponent.sidepanel.SidePanelViewModel$switchData$lambda$1$$inlined$combine$1$3", f = "SidePanelViewModel.kt", l = {288}, m = "invokeSuspend", v = 1)
        public static final class b extends tje0 implements gaj<myh<? super uf00<? extends be90.b<nq30>>>, be90.b<nq30>[], v1b<? super Unit>, Object> {
            public int a;
            public /* synthetic */ myh b;
            public /* synthetic */ Object[] c;

            @Override // defpackage.gaj
            public final Object invoke(myh<? super uf00<? extends be90.b<nq30>>> myhVar, be90.b<nq30>[] bVarArr, v1b<? super Unit> v1bVar) {
                b bVar = new b(3, v1bVar);
                bVar.b = myhVar;
                bVar.c = bVarArr;
                return bVar.invokeSuspend(Unit.a);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                y5b y5bVar = y5b.a;
                int i = this.a;
                if (i == 0) {
                    uj50.b(obj);
                    myh myhVar = this.b;
                    uf00 uf00VarF = a4h.f(ay0.S((be90.b[]) this.c));
                    this.b = null;
                    this.c = null;
                    this.a = 1;
                    if (myhVar.emit(uf00VarF, this) == y5bVar) {
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

        public c(lyh[] lyhVarArr) {
            this.a = lyhVarArr;
        }

        @Override // defpackage.lyh
        public final Object collect(myh<? super uf00<? extends be90.b<nq30>>> myhVar, v1b v1bVar) {
            lyh[] lyhVarArr = this.a;
            Object objA = r78.a(v1bVar, myhVar, new b(3, null), new a(lyhVarArr), lyhVarArr);
            return objA == y5b.a ? objA : Unit.a;
        }
    }

    public lh90(en20 en20Var, k5b k5bVar) {
        en20Var.getClass();
        k5bVar.getClass();
        this.a = en20Var;
        this.b = k5bVar;
        jn30 jn30Var = jn30.c0;
        gne0 gne0Var = new gne0(R.drawable.music, jn30Var.c.c, "key-Refs-call-music", true);
        vfd vfdVar = jn30Var.c;
        List listK = kotlin.collections.b.k(gne0Var, new gne0(R.drawable.ic_sound, vfdVar.d, "key-Refs-call-sound", true), new gne0(R.drawable.ic_one_tap_bet, vfdVar.e, "key-Refs-call-one-tap-bet", false));
        ArrayList arrayList = new ArrayList(l48.r(listK, 10));
        Iterator it = listK.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            kwd0 kwd0Var = q490.a.a;
            if (!zHasNext) {
                v340 v340VarE = e1i.e(new c((lyh[]) CollectionsKt.A0(arrayList).toArray(new lyh[0])), o8i0.d(this), kwd0Var, n1a0.c);
                jn30 jn30Var2 = jn30.c0;
                this.c = kotlin.collections.b.k(new be90.a(R.drawable.ic_how_to_play, jn30Var2.c.g, new nq30.b(pq30.a)), new be90.a(R.drawable.ic_bethistory, jn30Var2.c.h, new nq30.b(oq30.a)));
                wwd0 wwd0VarA = xwd0.a(new me90.a(0));
                this.d = wwd0VarA;
                this.e = e1i.e(new n1i(v340VarE, wwd0VarA, new a(null)), o8i0.d(this), kwd0Var, new dk60(0));
                ju90<td90> ju90Var = new ju90<>();
                this.f = ju90Var;
                this.i = e1i.a(ju90Var);
                return;
            }
            gne0 gne0Var2 = (gne0) it.next();
            en20 en20Var2 = this.a;
            String str = gne0Var2.c;
            boolean z = gne0Var2.d;
            arrayList.add(e1i.e(ozh.c(new b(en20Var2.getBooleanByFlow(str, z), gne0Var2), this.b), o8i0.d(this), kwd0Var, new be90.b(gne0Var2.a, gne0Var2.b, z, new nq30.a(gne0Var2.c, z))));
        }
    }

    @Override // defpackage.oh90
    public final void A1(me90.a aVar) {
        aVar.getClass();
        wwd0 wwd0Var = this.d;
        wwd0Var.getClass();
        wwd0Var.k(null, aVar);
    }

    @Override // defpackage.oh90
    public final t340 x1() {
        return this.i;
    }

    @Override // defpackage.oh90
    public final uwd0<dk60<nq30>> y1() {
        return this.e;
    }

    @Override // defpackage.oh90
    public final void z1(nq30 nq30Var) {
        nq30 nq30Var2 = nq30Var;
        nq30Var2.getClass();
        if (nq30Var2 instanceof nq30.a) {
            av7.a aVar = av7.a;
            av7.a(this.b, new ch90(this, nq30Var2, null));
        } else if (!(nq30Var2 instanceof nq30.b)) {
            uhc.a();
        } else {
            this.f.a.a(new td90.a(((nq30.b) nq30Var2).a));
        }
    }
}
