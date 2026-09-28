package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.common.network.data.SprThrowable;
import com.sporty.android.core.model.security.otp.PreRegisterResponse;
import com.sportybet.android.account.international.data.model.KycFieldRequestData;
import java.util.Date;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.account.registration.usecase.RegisterAccountUseCase$invoke$1", f = "RegisterAccountUseCase.kt", l = {83}, m = "invokeSuspend", v = 2)
public final class ys40 extends tje0 implements Function2<myh<? super ws40>, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ ct40 c;
    public final /* synthetic */ ts40 d;
    public final /* synthetic */ String e;
    public final /* synthetic */ String f;
    public final /* synthetic */ String i;
    public final /* synthetic */ Long v;
    public final /* synthetic */ String w;
    public final /* synthetic */ String y;
    public final /* synthetic */ String z;

    public static final class a<T> implements myh {
        public final /* synthetic */ myh<ws40> a;
        public final /* synthetic */ ct40 b;
        public final /* synthetic */ String c;
        public final /* synthetic */ String d;

        /* JADX INFO: renamed from: ys40$a$a, reason: collision with other inner class name */
        @c0d(c = "com.sportybet.android.account.registration.usecase.RegisterAccountUseCase$invoke$1$3", f = "RegisterAccountUseCase.kt", l = {87, 87, 89, 109}, m = "emit", v = 2)
        public static final class C1360a extends x1b {
            public myh a;
            public /* synthetic */ Object b;
            public final /* synthetic */ a<T> c;
            public int d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C1360a(a<? super T> aVar, v1b<? super C1360a> v1bVar) {
                super(v1bVar);
                this.c = aVar;
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                this.b = obj;
                this.d |= Integer.MIN_VALUE;
                return this.c.emit(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public a(myh<? super ws40> myhVar, ct40 ct40Var, String str, String str2) {
            this.a = myhVar;
            this.b = ct40Var;
            this.c = str;
            this.d = str2;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0017  */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x007d, code lost:
        
            if (r10.emit(r12, r2) == r3) goto L60;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x008c, code lost:
        
            if (r4.emit(r11, r2) == r3) goto L60;
         */
        @Override // defpackage.myh
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(defpackage.lk50<com.sporty.android.core.model.security.otp.PreRegisterResponse> r11, defpackage.v1b<? super kotlin.Unit> r12) {
            /*
                Method dump skipped, instruction units count: 281
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: ys40.a.emit(lk50, v1b):java.lang.Object");
        }
    }

    public static final class b implements lyh<PreRegisterResponse> {
        public final /* synthetic */ lyh a;

        @c0d(c = "com.sportybet.android.account.registration.usecase.RegisterAccountUseCase$invoke$1$invokeSuspend$$inlined$map$1", f = "RegisterAccountUseCase.kt", l = {109}, m = "collect", v = 2)
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

        /* JADX INFO: renamed from: ys40$b$b, reason: collision with other inner class name */
        public static final class C1361b<T> implements myh {
            public final /* synthetic */ myh a;

            /* JADX INFO: renamed from: ys40$b$b$a */
            @c0d(c = "com.sportybet.android.account.registration.usecase.RegisterAccountUseCase$invoke$1$invokeSuspend$$inlined$map$1$2", f = "RegisterAccountUseCase.kt", l = {50}, m = "emit", v = 2)
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
                    return C1361b.this.emit(null, this);
                }
            }

            public C1361b(myh myhVar) {
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
        public final Object collect(myh<? super PreRegisterResponse> myhVar, v1b v1bVar) {
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
                C1361b c1361b = new C1361b(myhVar);
                aVar.b = 1;
                if (this.a.collect(c1361b, aVar) == y5bVar) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ys40(ct40 ct40Var, ts40 ts40Var, String str, String str2, String str3, Long l, String str4, String str5, String str6, v1b<? super ys40> v1bVar) {
        super(2, v1bVar);
        this.c = ct40Var;
        this.d = ts40Var;
        this.e = str;
        this.f = str2;
        this.i = str3;
        this.v = l;
        this.w = str4;
        this.y = str5;
        this.z = str6;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        ys40 ys40Var = new ys40(this.c, this.d, this.e, this.f, this.i, this.v, this.w, this.y, this.z, v1bVar);
        ys40Var.b = obj;
        return ys40Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(myh<? super ws40> myhVar, v1b<? super Unit> v1bVar) {
        return ((ys40) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        myh myhVar = (myh) this.b;
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            ct40 ct40Var = this.c;
            ct40Var.a.a(this.d, k00.d);
            ou40 ou40Var = ct40Var.b;
            xnu xnuVar = new xnu();
            Long l = this.v;
            if (l != null) {
                Date date = new Date(l.longValue());
                Locale locale = Locale.US;
                locale.getClass();
                xnuVar.put("R0002", bwf0.l(date, "yyyy-MM-dd", locale, 0, 0));
            }
            String str = this.w;
            if (str != null) {
                String str2 = this.z;
                if (str2 == null) {
                    str2 = "";
                }
                xnuVar.put("R0001", new htp(str, str2));
            }
            String str3 = this.y;
            if (str3 != null) {
                xnuVar.put("R0027", new KycFieldRequestData.CountryCodeRequestData(str3));
            }
            Unit unit = Unit.a;
            xnu xnuVarC = xnuVar.c();
            String str4 = this.e;
            String str5 = this.f;
            yzh yzhVarA = bm50.a(new b(ou40Var.b(str4, str5, this.i, xnuVarC)));
            a aVar = new a(myhVar, ct40Var, str4, str5);
            this.b = null;
            this.a = 1;
            if (yzhVarA.collect(aVar, this) == y5bVar) {
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
