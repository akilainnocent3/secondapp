package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.common.network.data.SprThrowable;
import com.sporty.android.core.model.dispatcher.Dispatcher;
import com.sporty.android.core.model.dispatcher.SportyDispatchers;
import com.sportybet.android.social.data.remote.entity.AliasCode;
import com.sportybet.android.social.data.remote.entity.AliasCodeCreation;
import com.sportybet.android.social.data.remote.entity.AliasCodeList;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class sbc {
    public final x4k a;
    public final eac b;
    public final x2c c;
    public final lyz d;
    public final vga0 e;
    public final m2l f;
    public final lq1 g;
    public final k5b h;

    public static final class a {
        public final String a;
        public final boolean b;

        public a(String str, boolean z) {
            str.getClass();
            this.a = str;
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.g(this.a, aVar.a) && this.b == aVar.b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return tzx.a("UserInfo(username=", this.a, ", isCreator=", ")", this.b);
        }
    }

    public static final class b implements lyh<AliasCodeCreation> {
        public final /* synthetic */ lyh a;

        @c0d(c = "com.sportybet.android.social.domain.usecase.CustomCodeUseCase$createCustomCode$$inlined$map$1", f = "CustomCodeUseCase.kt", l = {109}, m = "collect", v = 2)
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
                return b.this.collect(null, this);
            }
        }

        /* JADX INFO: renamed from: sbc$b$b, reason: collision with other inner class name */
        public static final class C1087b<T> implements myh {
            public final /* synthetic */ myh a;

            /* JADX INFO: renamed from: sbc$b$b$a */
            @c0d(c = "com.sportybet.android.social.domain.usecase.CustomCodeUseCase$createCustomCode$$inlined$map$1$2", f = "CustomCodeUseCase.kt", l = {50}, m = "emit", v = 2)
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
                    return C1087b.this.emit(null, this);
                }
            }

            public C1087b(myh myhVar) {
                this.a = myhVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.myh
            public final Object emit(Object obj, v1b v1bVar) throws SprThrowable {
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
                    Object objB = n52.b((BaseResponse) obj);
                    aVar.b = 1;
                    if (this.a.emit(objB, aVar) == y5bVar) {
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

        public b(lyh lyhVar) {
            this.a = lyhVar;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // defpackage.lyh
        public final Object collect(myh<? super AliasCodeCreation> myhVar, v1b v1bVar) {
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
                C1087b c1087b = new C1087b(myhVar);
                aVar.b = 1;
                if (this.a.collect(c1087b, aVar) == y5bVar) {
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

    @c0d(c = "com.sportybet.android.social.domain.usecase.CustomCodeUseCase$createCustomCode$2", f = "CustomCodeUseCase.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class c extends tje0 implements gaj<AliasCodeCreation, String, v1b<? super Pair<? extends AliasCodeCreation, ? extends String>>, Object> {
        public /* synthetic */ AliasCodeCreation a;
        public /* synthetic */ String b;

        @Override // defpackage.gaj
        public final Object invoke(AliasCodeCreation aliasCodeCreation, String str, v1b<? super Pair<? extends AliasCodeCreation, ? extends String>> v1bVar) {
            c cVar = new c(3, v1bVar);
            cVar.a = aliasCodeCreation;
            cVar.b = str;
            return cVar.invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            AliasCodeCreation aliasCodeCreation = this.a;
            String str = this.b;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            return new Pair(aliasCodeCreation, str);
        }
    }

    @c0d(c = "com.sportybet.android.social.domain.usecase.CustomCodeUseCase$createCustomCode$3", f = "CustomCodeUseCase.kt", l = {169}, m = "invokeSuspend", v = 2)
    public static final class d extends tje0 implements Function2<Pair<? extends AliasCodeCreation, ? extends String>, v1b<? super lyh<? extends AliasCodeList>>, Object> {
        public AliasCodeCreation a;
        public String b;
        public int c;
        public /* synthetic */ Object d;
        public final /* synthetic */ String f;
        public final /* synthetic */ String i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str, String str2, v1b<? super d> v1bVar) {
            super(2, v1bVar);
            this.f = str;
            this.i = str2;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            d dVar = sbc.this.new d(this.f, this.i, v1bVar);
            dVar.d = obj;
            return dVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Pair<? extends AliasCodeCreation, ? extends String> pair, v1b<? super lyh<? extends AliasCodeList>> v1bVar) {
            return ((d) create(pair, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            String str;
            AliasCodeCreation aliasCodeCreation;
            Pair pair = (Pair) this.d;
            y5b y5bVar = y5b.a;
            int i = this.c;
            if (i == 0) {
                uj50.b(obj);
                AliasCodeCreation aliasCodeCreation2 = (AliasCodeCreation) pair.a;
                str = (String) pair.b;
                m2l m2lVar = sbc.this.f;
                Boolean bool = Boolean.TRUE;
                this.d = null;
                this.a = aliasCodeCreation2;
                this.b = str;
                this.c = 1;
                if (m2lVar.a.putBoolean("key_custom_code_was_created", bool, this) == y5bVar) {
                    return y5bVar;
                }
                aliasCodeCreation = aliasCodeCreation2;
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                str = this.b;
                aliasCodeCreation = this.a;
                uj50.b(obj);
            }
            ngs ngsVarB = kotlin.collections.a.b();
            ngsVarB.add(new AliasCode(aliasCodeCreation.getId(), i8c.a(this.f, this.i, str), null, null, null, null, null, null, null, null, null, null, 4092, null));
            return new gzh(new AliasCodeList(kotlin.collections.a.a(ngsVarB), aliasCodeCreation.getReachLimit()));
        }
    }

    public sbc(x4k x4kVar, eac eacVar, x2c x2cVar, lyz lyzVar, vga0 vga0Var, m2l m2lVar, lq1 lq1Var, @Dispatcher(sportyDispatcher = SportyDispatchers.IO) k5b k5bVar) {
        eacVar.getClass();
        x2cVar.getClass();
        lyzVar.getClass();
        vga0Var.getClass();
        m2lVar.getClass();
        lq1Var.getClass();
        this.a = x4kVar;
        this.b = eacVar;
        this.c = x2cVar;
        this.d = lyzVar;
        this.e = vga0Var;
        this.f = m2lVar;
        this.g = lq1Var;
        this.h = k5bVar;
    }

    public final lyh<AliasCodeList> a(String str, String str2) {
        str.getClass();
        str2.getClass();
        eac eacVar = this.b;
        return ozh.c(r0i.a(new s78(eacVar.e(), new b(eacVar.a(str)), new c(3, null)), new d(str, str2, null)), this.h);
    }
}
