package defpackage;

import com.sportybet.android.gp.tz.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes6.dex */
public final class mh90 extends oh90<zf60, ud90> {
    public final en20 a;
    public final k5b b;
    public final List<be90.a<zf60>> c;
    public final wwd0 d;
    public final v340 e;
    public final ju90<ud90> f;
    public final t340 i;

    @c0d(c = "com.sportygames.speedybingo.presentation.sidepanel.SidePanelViewModel$state$1", f = "SidePanelViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class a extends tje0 implements gaj<uf00<? extends be90.b<zf60>>, me90.a, v1b<? super dk60<zf60>>, Object> {
        public /* synthetic */ uf00 a;
        public /* synthetic */ me90.a b;

        public a(v1b<? super a> v1bVar) {
            super(3, v1bVar);
        }

        @Override // defpackage.gaj
        public final Object invoke(uf00<? extends be90.b<zf60>> uf00Var, me90.a aVar, v1b<? super dk60<zf60>> v1bVar) {
            a aVar2 = mh90.this.new a(v1bVar);
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
            return new dk60(aVar.b, aVar.a, a4h.f(CollectionsKt.i0(mh90.this.c, uf00Var)));
        }
    }

    public static final class b implements lyh<be90.b<zf60>> {
        public final /* synthetic */ lyh a;
        public final /* synthetic */ hne0 b;

        public static final class a<T> implements myh {
            public final /* synthetic */ myh a;
            public final /* synthetic */ hne0 b;

            /* JADX INFO: renamed from: mh90$b$a$a, reason: collision with other inner class name */
            @c0d(c = "com.sportygames.speedybingo.presentation.sidepanel.SidePanelViewModel$switchData$lambda$0$$inlined$map$1$2", f = "SidePanelViewModel.kt", l = {50}, m = "emit", v = 1)
            public static final class C0869a extends x1b {
                public /* synthetic */ Object a;
                public int b;

                public C0869a(v1b v1bVar) {
                    super(v1bVar);
                }

                @Override // defpackage.pz1
                public final Object invokeSuspend(Object obj) {
                    this.a = obj;
                    this.b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(myh myhVar, hne0 hne0Var) {
                this.a = myhVar;
                this.b = hne0Var;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // defpackage.myh
            public final Object emit(Object obj, v1b v1bVar) {
                C0869a c0869a;
                if (v1bVar instanceof C0869a) {
                    c0869a = (C0869a) v1bVar;
                    int i = c0869a.b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c0869a.b = i - Integer.MIN_VALUE;
                    } else {
                        c0869a = new C0869a(v1bVar);
                    }
                } else {
                    c0869a = new C0869a(v1bVar);
                }
                Object obj2 = c0869a.a;
                y5b y5bVar = y5b.a;
                int i2 = c0869a.b;
                if (i2 == 0) {
                    uj50.b(obj2);
                    boolean zBooleanValue = ((Boolean) obj).booleanValue();
                    hne0 hne0Var = this.b;
                    be90.b bVar = new be90.b(hne0Var.a, hne0Var.b, zBooleanValue, new zf60.a(hne0Var.c, zBooleanValue));
                    c0869a.b = 1;
                    if (this.a.emit(bVar, c0869a) == y5bVar) {
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

        public b(lyh lyhVar, hne0 hne0Var) {
            this.a = lyhVar;
            this.b = hne0Var;
        }

        @Override // defpackage.lyh
        public final Object collect(myh<? super be90.b<zf60>> myhVar, v1b v1bVar) {
            Object objCollect = this.a.collect(new a(myhVar, this.b), v1bVar);
            return objCollect == y5b.a ? objCollect : Unit.a;
        }
    }

    public static final class c implements lyh<uf00<? extends be90.b<zf60>>> {
        public final /* synthetic */ lyh[] a;

        public static final class a implements Function0<be90.b<zf60>[]> {
            public final /* synthetic */ lyh[] a;

            public a(lyh[] lyhVarArr) {
                this.a = lyhVarArr;
            }

            @Override // kotlin.jvm.functions.Function0
            public final be90.b<zf60>[] invoke() {
                return new be90.b[this.a.length];
            }
        }

        @c0d(c = "com.sportygames.speedybingo.presentation.sidepanel.SidePanelViewModel$switchData$lambda$1$$inlined$combine$1$3", f = "SidePanelViewModel.kt", l = {288}, m = "invokeSuspend", v = 1)
        public static final class b extends tje0 implements gaj<myh<? super uf00<? extends be90.b<zf60>>>, be90.b<zf60>[], v1b<? super Unit>, Object> {
            public int a;
            public /* synthetic */ myh b;
            public /* synthetic */ Object[] c;

            @Override // defpackage.gaj
            public final Object invoke(myh<? super uf00<? extends be90.b<zf60>>> myhVar, be90.b<zf60>[] bVarArr, v1b<? super Unit> v1bVar) {
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
        public final Object collect(myh<? super uf00<? extends be90.b<zf60>>> myhVar, v1b v1bVar) {
            lyh[] lyhVarArr = this.a;
            Object objA = r78.a(v1bVar, myhVar, new b(3, null), new a(lyhVarArr), lyhVarArr);
            return objA == y5b.a ? objA : Unit.a;
        }
    }

    public mh90(en20 en20Var, k5b k5bVar) {
        en20Var.getClass();
        k5bVar.getClass();
        this.a = en20Var;
        this.b = k5bVar;
        ma60 ma60Var = ma60.B0;
        hne0 hne0Var = new hne0(R.drawable.music, ma60Var.b.c, "speedy_bingo_music", true);
        vfd vfdVar = ma60Var.b;
        List listK = kotlin.collections.b.k(hne0Var, new hne0(R.drawable.ic_sound, vfdVar.d, "speedy_bingo_sound", true), new hne0(R.drawable.ic_one_tap_bet, vfdVar.e, "speedy_bingo_one_tap_bet", false), new hne0(R.drawable.wd_turbo_ic, vfdVar.f, "speedy_bingo_turbo_mode", false));
        ArrayList arrayList = new ArrayList(l48.r(listK, 10));
        Iterator it = listK.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            kwd0 kwd0Var = q490.a.a;
            if (!zHasNext) {
                v340 v340VarE = e1i.e(new c((lyh[]) CollectionsKt.A0(arrayList).toArray(new lyh[0])), o8i0.d(this), kwd0Var, n1a0.c);
                ma60 ma60Var2 = ma60.B0;
                this.c = kotlin.collections.b.k(new be90.a(R.drawable.ic_how_to_play, ma60Var2.b.g, new zf60.b(bg60.a)), new be90.a(R.drawable.ic_bethistory, ma60Var2.b.h, new zf60.b(ag60.a)));
                wwd0 wwd0VarA = xwd0.a(new me90.a(0));
                this.d = wwd0VarA;
                this.e = e1i.e(new n1i(v340VarE, wwd0VarA, new a(null)), o8i0.d(this), kwd0Var, new dk60(0));
                ju90<ud90> ju90Var = new ju90<>();
                this.f = ju90Var;
                this.i = e1i.a(ju90Var);
                return;
            }
            hne0 hne0Var2 = (hne0) it.next();
            en20 en20Var2 = this.a;
            String str = hne0Var2.c;
            boolean z = hne0Var2.d;
            arrayList.add(e1i.e(ozh.c(new b(en20Var2.getBooleanByFlow(str, z), hne0Var2), this.b), o8i0.d(this), kwd0Var, new be90.b(hne0Var2.a, hne0Var2.b, z, new zf60.a(hne0Var2.c, z))));
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
    public final uwd0<dk60<zf60>> y1() {
        return this.e;
    }

    @Override // defpackage.oh90
    public final void z1(zf60 zf60Var) {
        zf60 zf60Var2 = zf60Var;
        zf60Var2.getClass();
        if (zf60Var2 instanceof zf60.a) {
            av7.a aVar = av7.a;
            av7.a(this.b, new dh90(this, zf60Var2, null));
        } else if (!(zf60Var2 instanceof zf60.b)) {
            uhc.a();
        } else {
            this.f.a.a(new ud90.a(((zf60.b) zf60Var2).a));
        }
    }
}
