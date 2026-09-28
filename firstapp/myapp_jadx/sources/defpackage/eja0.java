package defpackage;

import android.util.Pair;
import com.sporty.android.common.network.data.BaseResponse;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Leja0;", "Lc82;", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class eja0 extends c82 {
    public final uqm d;
    public final oia0 e;
    public final vu90<jox<zha0>> f;
    public final vu90 i;
    public final vu90<lk50<Integer>> v;
    public final vu90 w;

    public static final class a implements lyh<jox<? extends zha0>> {
        public final /* synthetic */ lyh a;
        public final /* synthetic */ eja0 b;

        /* JADX INFO: renamed from: eja0$a$a, reason: collision with other inner class name */
        @c0d(c = "com.sportybet.android.social.domain.viewmodel.SocialViewModel$checkShareCodePublished$$inlined$map$1", f = "SocialViewModel.kt", l = {109}, m = "collect", v = 2)
        public static final class C0520a extends x1b {
            public /* synthetic */ Object a;
            public int b;

            public C0520a(v1b v1bVar) {
                super(v1bVar);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                this.a = obj;
                this.b |= Integer.MIN_VALUE;
                return a.this.collect(null, this);
            }
        }

        public static final class b<T> implements myh {
            public final /* synthetic */ myh a;
            public final /* synthetic */ eja0 b;

            /* JADX INFO: renamed from: eja0$a$b$a, reason: collision with other inner class name */
            @c0d(c = "com.sportybet.android.social.domain.viewmodel.SocialViewModel$checkShareCodePublished$$inlined$map$1$2", f = "SocialViewModel.kt", l = {50}, m = "emit", v = 2)
            public static final class C0521a extends x1b {
                public /* synthetic */ Object a;
                public int b;

                public C0521a(v1b v1bVar) {
                    super(v1bVar);
                }

                @Override // defpackage.pz1
                public final Object invokeSuspend(Object obj) {
                    this.a = obj;
                    this.b |= Integer.MIN_VALUE;
                    return b.this.emit(null, this);
                }
            }

            public b(myh myhVar, eja0 eja0Var) {
                this.a = myhVar;
                this.b = eja0Var;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0017  */
            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // defpackage.myh
            public final Object emit(Object obj, v1b v1bVar) {
                C0521a c0521a;
                uqm uqmVar = this.b.d;
                if (v1bVar instanceof C0521a) {
                    c0521a = (C0521a) v1bVar;
                    int i = c0521a.b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c0521a.b = i - Integer.MIN_VALUE;
                    } else {
                        c0521a = new C0521a(v1bVar);
                    }
                } else {
                    c0521a = new C0521a(v1bVar);
                }
                Object obj2 = c0521a.a;
                y5b y5bVar = y5b.a;
                int i2 = c0521a.b;
                if (i2 == 0) {
                    uj50.b(obj2);
                    BaseResponse baseResponse = (BaseResponse) obj;
                    jox aVar = (baseResponse.isSuccessful() && baseResponse.hasData()) ? new jox.a(new zha0(5, (Boolean) n52.b(baseResponse), uqmVar.getLastNickName(), uqmVar.getAvatarUrl())) : new jox.c(new Throwable(baseResponse.message));
                    c0521a.b = 1;
                    if (this.a.emit(aVar, c0521a) == y5bVar) {
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

        public a(lyh lyhVar, eja0 eja0Var) {
            this.a = lyhVar;
            this.b = eja0Var;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // defpackage.lyh
        public final Object collect(myh<? super jox<? extends zha0>> myhVar, v1b v1bVar) {
            C0520a c0520a;
            if (v1bVar instanceof C0520a) {
                c0520a = (C0520a) v1bVar;
                int i = c0520a.b;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c0520a.b = i - Integer.MIN_VALUE;
                } else {
                    c0520a = new C0520a(v1bVar);
                }
            } else {
                c0520a = new C0520a(v1bVar);
            }
            Object obj = c0520a.a;
            y5b y5bVar = y5b.a;
            int i2 = c0520a.b;
            if (i2 == 0) {
                uj50.b(obj);
                b bVar = new b(myhVar, this.b);
                c0520a.b = 1;
                if (this.a.collect(bVar, c0520a) == y5bVar) {
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
    }

    @c0d(c = "com.sportybet.android.social.domain.viewmodel.SocialViewModel$checkShareCodePublished$2", f = "SocialViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class b extends tje0 implements Function2<myh<? super jox<? extends zha0>>, v1b<? super Unit>, Object> {
        public b(v1b<? super b> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return eja0.this.new b(v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(myh<? super jox<? extends zha0>> myhVar, v1b<? super Unit> v1bVar) {
            return ((b) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            eja0.this.f.m(jox.e.a);
            return Unit.a;
        }
    }

    @c0d(c = "com.sportybet.android.social.domain.viewmodel.SocialViewModel$checkShareCodePublished$3", f = "SocialViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class c extends tje0 implements Function2<jox<? extends zha0>, v1b<? super Unit>, Object> {
        public /* synthetic */ Object a;

        public c(v1b<? super c> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            c cVar = eja0.this.new c(v1bVar);
            cVar.a = obj;
            return cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(jox<? extends zha0> joxVar, v1b<? super Unit> v1bVar) {
            return ((c) create(joxVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            jox<zha0> joxVar = (jox) this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            eja0.this.f.m(joxVar);
            return Unit.a;
        }
    }

    @c0d(c = "com.sportybet.android.social.domain.viewmodel.SocialViewModel$checkShareCodePublished$4", f = "SocialViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class d extends tje0 implements gaj<myh<? super jox<? extends zha0>>, Throwable, v1b<? super Unit>, Object> {
        public /* synthetic */ Throwable a;

        public d(v1b<? super d> v1bVar) {
            super(3, v1bVar);
        }

        @Override // defpackage.gaj
        public final Object invoke(myh<? super jox<? extends zha0>> myhVar, Throwable th, v1b<? super Unit> v1bVar) {
            d dVar = eja0.this.new d(v1bVar);
            dVar.a = th;
            return dVar.invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            Throwable th = this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            eja0.this.f.m(new jox.c(th));
            return Unit.a;
        }
    }

    public static final class e implements lyh<lk50<? extends Integer>> {
        public final /* synthetic */ lyh a;

        @c0d(c = "com.sportybet.android.social.domain.viewmodel.SocialViewModel$publishShareCode$$inlined$map$1", f = "SocialViewModel.kt", l = {109}, m = "collect", v = 2)
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
                return e.this.collect(null, this);
            }
        }

        public static final class b<T> implements myh {
            public final /* synthetic */ myh a;

            @c0d(c = "com.sportybet.android.social.domain.viewmodel.SocialViewModel$publishShareCode$$inlined$map$1$2", f = "SocialViewModel.kt", l = {50}, m = "emit", v = 2)
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
                    return b.this.emit(null, this);
                }
            }

            public b(myh myhVar) {
                this.a = myhVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // defpackage.myh
            public final Object emit(Object obj, v1b v1bVar) {
                a aVar;
                int i;
                if (v1bVar instanceof a) {
                    aVar = (a) v1bVar;
                    int i2 = aVar.b;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        aVar.b = i2 - Integer.MIN_VALUE;
                    } else {
                        aVar = new a(v1bVar);
                    }
                } else {
                    aVar = new a(v1bVar);
                }
                Object obj2 = aVar.a;
                y5b y5bVar = y5b.a;
                int i3 = aVar.b;
                if (i3 == 0) {
                    uj50.b(obj2);
                    BaseResponse baseResponse = (BaseResponse) obj;
                    lk50 cVar = (baseResponse.isSuccessful() || (i = baseResponse.bizCode) == 4756 || i == 4757) ? new lk50.c(new Integer(baseResponse.bizCode)) : new lk50.a(new Throwable(baseResponse.message));
                    aVar.b = 1;
                    if (this.a.emit(cVar, aVar) == y5bVar) {
                        return y5bVar;
                    }
                } else {
                    if (i3 != 1) {
                        ib5.a("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    uj50.b(obj2);
                }
                return Unit.a;
            }
        }

        public e(lyh lyhVar) {
            this.a = lyhVar;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // defpackage.lyh
        public final Object collect(myh<? super lk50<? extends Integer>> myhVar, v1b v1bVar) {
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
            Object obj = aVar.a;
            y5b y5bVar = y5b.a;
            int i2 = aVar.b;
            if (i2 == 0) {
                uj50.b(obj);
                b bVar = new b(myhVar);
                aVar.b = 1;
                if (this.a.collect(bVar, aVar) == y5bVar) {
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
    }

    @c0d(c = "com.sportybet.android.social.domain.viewmodel.SocialViewModel$publishShareCode$2", f = "SocialViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class f extends tje0 implements Function2<lk50<? extends Integer>, v1b<? super Unit>, Object> {
        public /* synthetic */ Object a;

        public f(v1b<? super f> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            f fVar = eja0.this.new f(v1bVar);
            fVar.a = obj;
            return fVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(lk50<? extends Integer> lk50Var, v1b<? super Unit> v1bVar) {
            return ((f) create(lk50Var, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            lk50<Integer> lk50Var = (lk50) this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            eja0 eja0Var = eja0.this;
            eja0Var.v.m(lk50Var);
            String lastNickName = eja0Var.d.getLastNickName();
            if (lastNickName != null && lastNickName.length() != 0) {
                b390 b390Var = ftg.a;
                ftg.a(new u8a0(lastNickName));
            }
            return Unit.a;
        }
    }

    @c0d(c = "com.sportybet.android.social.domain.viewmodel.SocialViewModel$publishShareCode$3", f = "SocialViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class g extends tje0 implements gaj<myh<? super lk50<? extends Integer>>, Throwable, v1b<? super Unit>, Object> {
        public /* synthetic */ Throwable a;
        public final /* synthetic */ String b;
        public final /* synthetic */ eja0 c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(String str, eja0 eja0Var, v1b<? super g> v1bVar) {
            super(3, v1bVar);
            this.b = str;
            this.c = eja0Var;
        }

        @Override // defpackage.gaj
        public final Object invoke(myh<? super lk50<? extends Integer>> myhVar, Throwable th, v1b<? super Unit> v1bVar) {
            g gVar = new g(this.b, this.c, v1bVar);
            gVar.a = th;
            return gVar.invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            Throwable th = this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            w950.a("SocialViewModel", "ShareCodeUseCase.publishShareCode", th, kotlin.collections.a.c(new Pair("shareCode", this.b)));
            this.c.v.m(new lk50.a(th));
            return Unit.a;
        }
    }

    public eja0(uqm uqmVar, oia0 oia0Var) {
        uqmVar.getClass();
        this.d = uqmVar;
        this.e = oia0Var;
        vu90<jox<zha0>> vu90Var = new vu90<>();
        this.f = vu90Var;
        this.i = vu90Var;
        vu90<lk50<Integer>> vu90Var2 = new vu90<>();
        this.v = vu90Var2;
        this.w = vu90Var2;
    }

    public final void x1(String str) {
        str.getClass();
        kzh.d(new yzh(new g1i(new xzh(new a(this.e.d(str), this), new b(null)), new c(null)), new d(null)), o8i0.d(this));
    }

    public final void y1(String str, String str2) {
        str.getClass();
        kzh.d(new yzh(new g1i(new e(this.e.e(str, str2)), new f(null)), new g(str, this, null)), o8i0.d(this));
    }
}
