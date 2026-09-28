package defpackage;

import android.content.Context;
import com.sportybet.android.gp.tz.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes8.dex */
public final class mui0 extends j8i0 {
    public final b5 a;
    public final odd b;
    public final mn20 c;
    public final ju90<bui0> d;
    public final t340 e;
    public final uf00<ce90.a> f;
    public final v340 i;

    public static final class a implements lyh<sg90> {
        public final /* synthetic */ v340 a;
        public final /* synthetic */ mui0 b;

        /* JADX INFO: renamed from: mui0$a$a, reason: collision with other inner class name */
        public static final class C0879a<T> implements myh {
            public final /* synthetic */ myh a;
            public final /* synthetic */ mui0 b;

            /* JADX INFO: renamed from: mui0$a$a$a, reason: collision with other inner class name */
            @c0d(c = "com.sportygames.wheelanddeal.sidepanel.WDSidePanelViewModel$special$$inlined$map$1$2", f = "WDSidePanelViewModel.kt", l = {50}, m = "emit", v = 1)
            public static final class C0880a extends x1b {
                public /* synthetic */ Object a;
                public int b;

                public C0880a(v1b v1bVar) {
                    super(v1bVar);
                }

                @Override // defpackage.pz1
                public final Object invokeSuspend(Object obj) {
                    this.a = obj;
                    this.b |= Integer.MIN_VALUE;
                    return C0879a.this.emit(null, this);
                }
            }

            public C0879a(myh myhVar, mui0 mui0Var) {
                this.a = myhVar;
                this.b = mui0Var;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // defpackage.myh
            public final Object emit(Object obj, v1b v1bVar) {
                C0880a c0880a;
                if (v1bVar instanceof C0880a) {
                    c0880a = (C0880a) v1bVar;
                    int i = c0880a.b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c0880a.b = i - Integer.MIN_VALUE;
                    } else {
                        c0880a = new C0880a(v1bVar);
                    }
                } else {
                    c0880a = new C0880a(v1bVar);
                }
                Object obj2 = c0880a.a;
                y5b y5bVar = y5b.a;
                int i2 = c0880a.b;
                if (i2 == 0) {
                    uj50.b(obj2);
                    uf00 uf00Var = (uf00) obj;
                    mui0 mui0Var = this.b;
                    b5 b5Var = mui0Var.a;
                    String nickName = b5Var.getNickName();
                    if (nickName == null) {
                        nickName = "";
                    }
                    String userImage = b5Var.getUserImage();
                    sg90 sg90Var = new sg90(new hph0(nickName, userImage != null ? userImage : ""), a4h.f(CollectionsKt.i0(mui0Var.f, uf00Var)));
                    c0880a.b = 1;
                    if (this.a.emit(sg90Var, c0880a) == y5bVar) {
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

        public a(v340 v340Var, mui0 mui0Var) {
            this.a = v340Var;
            this.b = mui0Var;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // defpackage.lyh
        public final Object collect(myh<? super sg90> myhVar, v1b v1bVar) {
            Object objCollect = this.a.a.collect(new C0879a(myhVar, this.b), (v1b<? super Unit>) v1bVar);
            return objCollect == y5b.a ? objCollect : Unit.a;
        }
    }

    public static final class b implements lyh<ce90.b> {
        public final /* synthetic */ lyh a;
        public final /* synthetic */ ine0 b;

        public static final class a<T> implements myh {
            public final /* synthetic */ myh a;
            public final /* synthetic */ ine0 b;

            /* JADX INFO: renamed from: mui0$b$a$a, reason: collision with other inner class name */
            @c0d(c = "com.sportygames.wheelanddeal.sidepanel.WDSidePanelViewModel$switchData$lambda$0$$inlined$map$1$2", f = "WDSidePanelViewModel.kt", l = {50}, m = "emit", v = 1)
            public static final class C0881a extends x1b {
                public /* synthetic */ Object a;
                public int b;

                public C0881a(v1b v1bVar) {
                    super(v1bVar);
                }

                @Override // defpackage.pz1
                public final Object invokeSuspend(Object obj) {
                    this.a = obj;
                    this.b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(myh myhVar, ine0 ine0Var) {
                this.a = myhVar;
                this.b = ine0Var;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // defpackage.myh
            public final Object emit(Object obj, v1b v1bVar) {
                C0881a c0881a;
                if (v1bVar instanceof C0881a) {
                    c0881a = (C0881a) v1bVar;
                    int i = c0881a.b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c0881a.b = i - Integer.MIN_VALUE;
                    } else {
                        c0881a = new C0881a(v1bVar);
                    }
                } else {
                    c0881a = new C0881a(v1bVar);
                }
                Object obj2 = c0881a.a;
                y5b y5bVar = y5b.a;
                int i2 = c0881a.b;
                if (i2 == 0) {
                    uj50.b(obj2);
                    boolean zBooleanValue = ((Boolean) obj).booleanValue();
                    ine0 ine0Var = this.b;
                    ce90.b bVar = new ce90.b(ine0Var.a, ine0Var.b, zBooleanValue, new cui0.a(ine0Var.c));
                    c0881a.b = 1;
                    if (this.a.emit(bVar, c0881a) == y5bVar) {
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

        public b(lyh lyhVar, ine0 ine0Var) {
            this.a = lyhVar;
            this.b = ine0Var;
        }

        @Override // defpackage.lyh
        public final Object collect(myh<? super ce90.b> myhVar, v1b v1bVar) {
            Object objCollect = this.a.collect(new a(myhVar, this.b), v1bVar);
            return objCollect == y5b.a ? objCollect : Unit.a;
        }
    }

    public static final class c implements lyh<uf00<? extends ce90.b>> {
        public final /* synthetic */ lyh[] a;

        public static final class a implements Function0<ce90.b[]> {
            public final /* synthetic */ lyh[] a;

            public a(lyh[] lyhVarArr) {
                this.a = lyhVarArr;
            }

            @Override // kotlin.jvm.functions.Function0
            public final ce90.b[] invoke() {
                return new ce90.b[this.a.length];
            }
        }

        @c0d(c = "com.sportygames.wheelanddeal.sidepanel.WDSidePanelViewModel$switchData$lambda$1$$inlined$combine$1$3", f = "WDSidePanelViewModel.kt", l = {288}, m = "invokeSuspend", v = 1)
        public static final class b extends tje0 implements gaj<myh<? super uf00<? extends ce90.b>>, ce90.b[], v1b<? super Unit>, Object> {
            public int a;
            public /* synthetic */ myh b;
            public /* synthetic */ Object[] c;

            @Override // defpackage.gaj
            public final Object invoke(myh<? super uf00<? extends ce90.b>> myhVar, ce90.b[] bVarArr, v1b<? super Unit> v1bVar) {
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
                    uf00 uf00VarF = a4h.f(ay0.S((ce90.b[]) this.c));
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
        public final Object collect(myh<? super uf00<? extends ce90.b>> myhVar, v1b v1bVar) {
            lyh[] lyhVarArr = this.a;
            Object objA = r78.a(v1bVar, myhVar, new b(3, null), new a(lyhVarArr), lyhVarArr);
            return objA == y5b.a ? objA : Unit.a;
        }
    }

    public mui0(Context context, b5 b5Var) {
        context.getClass();
        b5Var.getClass();
        this.a = b5Var;
        pfd pfdVar = fse.a;
        this.b = odd.b;
        this.c = new mn20(context);
        ju90<bui0> ju90Var = new ju90<>();
        this.d = ju90Var;
        this.e = e1i.a(ju90Var);
        eyi0 eyi0Var = eyi0.v0;
        List listK = kotlin.collections.b.k(new ine0(R.drawable.music, eyi0Var.f0, "key-WD-music", true), new ine0(R.drawable.ic_sound, eyi0Var.g0, "key-WD-sound", true), new ine0(R.drawable.ic_one_tap_bet, eyi0Var.h0, "key-WD-one-tap-bet", false), new ine0(R.drawable.wd_turbo_ic, eyi0Var.i0, "key - wheel and deal turbo mode", false));
        ArrayList arrayList = new ArrayList(l48.r(listK, 10));
        Iterator it = listK.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            kwd0 kwd0Var = q490.a.a;
            if (!zHasNext) {
                v340 v340VarE = e1i.e(new c((lyh[]) CollectionsKt.A0(arrayList).toArray(new lyh[0])), o8i0.d(this), kwd0Var, n1a0.c);
                eyi0 eyi0Var2 = eyi0.v0;
                this.f = a4h.f(kotlin.collections.b.k(new ce90.a(R.drawable.ic_how_to_play, eyi0Var2.j0, new cui0.b(kui0.b.a)), new ce90.a(R.drawable.ic_bethistory, eyi0Var2.k0, new cui0.b(kui0.a.a))));
                this.i = e1i.e(ozh.c(new a(v340VarE, this), this.b), o8i0.d(this), kwd0Var, new sg90(0));
                return;
            }
            ine0 ine0Var = (ine0) it.next();
            mn20 mn20Var = this.c;
            String str = ine0Var.c;
            boolean z = ine0Var.d;
            arrayList.add(e1i.e(ozh.c(new b(mn20Var.getBooleanByFlow(str, z), ine0Var), this.b), o8i0.d(this), kwd0Var, new ce90.b(ine0Var.a, ine0Var.b, z, new cui0.a(ine0Var.c))));
        }
    }
}
