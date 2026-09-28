package defpackage;

import com.sportybet.android.gp.tz.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes7.dex */
public final class f0f0 extends j8i0 {
    public final en20 a;
    public final k5b b;
    public final b5 c;
    public final ju90<nze0> d;
    public final t340 e;
    public final wwd0 f;
    public final v340 i;

    @c0d(c = "com.sportygames.goldmine.sidepanel.TGSidePanelViewModel$sidePanelState$1", f = "TGSidePanelViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class a extends tje0 implements gaj<uf00<? extends oze0.b>, uf00<? extends oze0.a>, v1b<? super d0f0>, Object> {
        public /* synthetic */ uf00 a;
        public /* synthetic */ uf00 b;

        public a(v1b<? super a> v1bVar) {
            super(3, v1bVar);
        }

        @Override // defpackage.gaj
        public final Object invoke(uf00<? extends oze0.b> uf00Var, uf00<? extends oze0.a> uf00Var2, v1b<? super d0f0> v1bVar) {
            a aVar = f0f0.this.new a(v1bVar);
            aVar.a = uf00Var;
            aVar.b = uf00Var2;
            return aVar.invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            uf00 uf00Var = this.a;
            uf00 uf00Var2 = this.b;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            b5 b5Var = f0f0.this.c;
            String nickName = b5Var.getNickName();
            if (nickName == null) {
                nickName = "";
            }
            String userImage = b5Var.getUserImage();
            return new d0f0(new q0f0(nickName, userImage != null ? userImage : ""), a4h.f(CollectionsKt.i0(uf00Var2, uf00Var)));
        }
    }

    public static final class b implements lyh<uf00<? extends oze0.a>> {
        public final /* synthetic */ lyh a;

        public static final class a<T> implements myh {
            public final /* synthetic */ myh a;

            /* JADX INFO: renamed from: f0f0$b$a$a, reason: collision with other inner class name */
            @c0d(c = "com.sportygames.goldmine.sidepanel.TGSidePanelViewModel$special$$inlined$map$1$2", f = "TGSidePanelViewModel.kt", l = {50}, m = "emit", v = 1)
            public static final class C0539a extends x1b {
                public /* synthetic */ Object a;
                public int b;

                public C0539a(v1b v1bVar) {
                    super(v1bVar);
                }

                @Override // defpackage.pz1
                public final Object invokeSuspend(Object obj) {
                    this.a = obj;
                    this.b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(myh myhVar) {
                this.a = myhVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // defpackage.myh
            public final Object emit(Object obj, v1b v1bVar) {
                C0539a c0539a;
                if (v1bVar instanceof C0539a) {
                    c0539a = (C0539a) v1bVar;
                    int i = c0539a.b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c0539a.b = i - Integer.MIN_VALUE;
                    } else {
                        c0539a = new C0539a(v1bVar);
                    }
                } else {
                    c0539a = new C0539a(v1bVar);
                }
                Object obj2 = c0539a.a;
                y5b y5bVar = y5b.a;
                int i2 = c0539a.b;
                if (i2 == 0) {
                    uj50.b(obj2);
                    boolean zBooleanValue = ((Boolean) obj).booleanValue();
                    vue0 vue0Var = vue0.X0;
                    uf00 uf00VarF = a4h.f(CollectionsKt.i0(zBooleanValue ? kotlin.collections.a.c(new oze0.a(R.drawable.sg_collection, vue0Var.H, new pze0.b(c0f0.b.a), 0.3f)) : m2g.a, kotlin.collections.b.k(new oze0.a(R.drawable.ic_how_to_play, vue0Var.E, new pze0.b(new c0f0.c(zBooleanValue))), new oze0.a(R.drawable.ic_bethistory, vue0Var.F, new pze0.b(c0f0.a.a)))));
                    c0539a.b = 1;
                    if (this.a.emit(uf00VarF, c0539a) == y5bVar) {
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

        public b(wwd0 wwd0Var) {
            this.a = wwd0Var;
        }

        @Override // defpackage.lyh
        public final Object collect(myh<? super uf00<? extends oze0.a>> myhVar, v1b v1bVar) {
            Object objCollect = this.a.collect(new a(myhVar), v1bVar);
            return objCollect == y5b.a ? objCollect : Unit.a;
        }
    }

    public static final class c implements lyh<oze0.b> {
        public final /* synthetic */ lyh a;
        public final /* synthetic */ jne0 b;

        public static final class a<T> implements myh {
            public final /* synthetic */ myh a;
            public final /* synthetic */ jne0 b;

            /* JADX INFO: renamed from: f0f0$c$a$a, reason: collision with other inner class name */
            @c0d(c = "com.sportygames.goldmine.sidepanel.TGSidePanelViewModel$switchData$lambda$0$$inlined$map$1$2", f = "TGSidePanelViewModel.kt", l = {50}, m = "emit", v = 1)
            public static final class C0540a extends x1b {
                public /* synthetic */ Object a;
                public int b;

                public C0540a(v1b v1bVar) {
                    super(v1bVar);
                }

                @Override // defpackage.pz1
                public final Object invokeSuspend(Object obj) {
                    this.a = obj;
                    this.b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(myh myhVar, jne0 jne0Var) {
                this.a = myhVar;
                this.b = jne0Var;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // defpackage.myh
            public final Object emit(Object obj, v1b v1bVar) {
                C0540a c0540a;
                if (v1bVar instanceof C0540a) {
                    c0540a = (C0540a) v1bVar;
                    int i = c0540a.b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c0540a.b = i - Integer.MIN_VALUE;
                    } else {
                        c0540a = new C0540a(v1bVar);
                    }
                } else {
                    c0540a = new C0540a(v1bVar);
                }
                Object obj2 = c0540a.a;
                y5b y5bVar = y5b.a;
                int i2 = c0540a.b;
                if (i2 == 0) {
                    uj50.b(obj2);
                    boolean zBooleanValue = ((Boolean) obj).booleanValue();
                    jne0 jne0Var = this.b;
                    oze0.b bVar = new oze0.b(jne0Var.a, jne0Var.b, zBooleanValue, new pze0.a(jne0Var.c));
                    c0540a.b = 1;
                    if (this.a.emit(bVar, c0540a) == y5bVar) {
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

        public c(lyh lyhVar, jne0 jne0Var) {
            this.a = lyhVar;
            this.b = jne0Var;
        }

        @Override // defpackage.lyh
        public final Object collect(myh<? super oze0.b> myhVar, v1b v1bVar) {
            Object objCollect = this.a.collect(new a(myhVar, this.b), v1bVar);
            return objCollect == y5b.a ? objCollect : Unit.a;
        }
    }

    public static final class d implements lyh<uf00<? extends oze0.b>> {
        public final /* synthetic */ lyh[] a;

        public static final class a implements Function0<oze0.b[]> {
            public final /* synthetic */ lyh[] a;

            public a(lyh[] lyhVarArr) {
                this.a = lyhVarArr;
            }

            @Override // kotlin.jvm.functions.Function0
            public final oze0.b[] invoke() {
                return new oze0.b[this.a.length];
            }
        }

        @c0d(c = "com.sportygames.goldmine.sidepanel.TGSidePanelViewModel$switchData$lambda$1$$inlined$combine$1$3", f = "TGSidePanelViewModel.kt", l = {288}, m = "invokeSuspend", v = 1)
        public static final class b extends tje0 implements gaj<myh<? super uf00<? extends oze0.b>>, oze0.b[], v1b<? super Unit>, Object> {
            public int a;
            public /* synthetic */ myh b;
            public /* synthetic */ Object[] c;

            @Override // defpackage.gaj
            public final Object invoke(myh<? super uf00<? extends oze0.b>> myhVar, oze0.b[] bVarArr, v1b<? super Unit> v1bVar) {
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
                    uf00 uf00VarF = a4h.f(ay0.S((oze0.b[]) this.c));
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

        public d(lyh[] lyhVarArr) {
            this.a = lyhVarArr;
        }

        @Override // defpackage.lyh
        public final Object collect(myh<? super uf00<? extends oze0.b>> myhVar, v1b v1bVar) {
            lyh[] lyhVarArr = this.a;
            Object objA = r78.a(v1bVar, myhVar, new b(3, null), new a(lyhVarArr), lyhVarArr);
            return objA == y5b.a ? objA : Unit.a;
        }
    }

    public f0f0(en20 en20Var, k5b k5bVar, b5 b5Var) {
        en20Var.getClass();
        k5bVar.getClass();
        b5Var.getClass();
        this.a = en20Var;
        this.b = k5bVar;
        this.c = b5Var;
        ju90<nze0> ju90Var = new ju90<>();
        this.d = ju90Var;
        this.e = e1i.a(ju90Var);
        this.f = xwd0.a(Boolean.FALSE);
        vue0 vue0Var = vue0.X0;
        List listK = kotlin.collections.b.k(new jne0(R.drawable.music, vue0Var.A, "key-TG-music", true), new jne0(R.drawable.ic_sound, vue0Var.B, "key-TG-sound", true), new jne0(R.drawable.ic_one_tap_bet, vue0Var.C, "key-TG-one-tap-bet", false), new jne0(R.drawable.wd_turbo_ic, vue0Var.D, "key - TG- turbo mode", false));
        ArrayList arrayList = new ArrayList(l48.r(listK, 10));
        Iterator it = listK.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            kwd0 kwd0Var = q490.a.a;
            if (!zHasNext) {
                d dVar = new d((lyh[]) CollectionsKt.A0(arrayList).toArray(new lyh[0]));
                et7 et7VarD = o8i0.d(this);
                n1a0 n1a0Var = n1a0.c;
                this.i = e1i.e(ozh.c(new n1i(e1i.e(dVar, et7VarD, kwd0Var, n1a0Var), e1i.e(new b(this.f), o8i0.d(this), kwd0Var, n1a0Var), new a(null)), this.b), o8i0.d(this), kwd0Var, new d0f0(0));
                return;
            }
            jne0 jne0Var = (jne0) it.next();
            en20 en20Var2 = this.a;
            String str = jne0Var.c;
            boolean z = jne0Var.d;
            arrayList.add(e1i.e(ozh.c(new c(en20Var2.getBooleanByFlow(str, z), jne0Var), this.b), o8i0.d(this), kwd0Var, new oze0.b(jne0Var.a, jne0Var.b, z, new pze0.a(jne0Var.c))));
        }
    }
}
