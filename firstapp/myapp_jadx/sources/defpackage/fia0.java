package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.common.network.data.SprThrowable;
import com.sporty.android.core.model.service.CountryCodeName;
import com.sportybet.android.bookingcode.data.dto.BookingData;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.android.social.domain.usecase.SocialShareUseCase$addOrEditSocialShareCode$onGetShareBookingCode$2", f = "SocialShareUseCase.kt", l = {}, m = "invokeSuspend", v = 2)
public final class fia0 extends tje0 implements Function2<BookingData, v1b<? super lyh<? extends BookingData>>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ CountryCodeName b;
    public final /* synthetic */ CountryCodeName c;
    public final /* synthetic */ oia0 d;

    public static final class a implements lyh<BookingData> {
        public final /* synthetic */ lyh a;

        /* JADX INFO: renamed from: fia0$a$a, reason: collision with other inner class name */
        @c0d(c = "com.sportybet.android.social.domain.usecase.SocialShareUseCase$addOrEditSocialShareCode$onGetShareBookingCode$2$invokeSuspend$$inlined$map$1", f = "SocialShareUseCase.kt", l = {109}, m = "collect", v = 2)
        public static final class C0566a extends x1b {
            public /* synthetic */ Object a;
            public int b;

            public C0566a(v1b v1bVar) {
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

            /* JADX INFO: renamed from: fia0$a$b$a, reason: collision with other inner class name */
            @c0d(c = "com.sportybet.android.social.domain.usecase.SocialShareUseCase$addOrEditSocialShareCode$onGetShareBookingCode$2$invokeSuspend$$inlined$map$1$2", f = "SocialShareUseCase.kt", l = {50}, m = "emit", v = 2)
            public static final class C0567a extends x1b {
                public /* synthetic */ Object a;
                public int b;

                public C0567a(v1b v1bVar) {
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
            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.myh
            public final Object emit(Object obj, v1b v1bVar) throws SprThrowable {
                C0567a c0567a;
                if (v1bVar instanceof C0567a) {
                    c0567a = (C0567a) v1bVar;
                    int i = c0567a.b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c0567a.b = i - Integer.MIN_VALUE;
                    } else {
                        c0567a = new C0567a(v1bVar);
                    }
                } else {
                    c0567a = new C0567a(v1bVar);
                }
                Object obj2 = c0567a.a;
                y5b y5bVar = y5b.a;
                int i2 = c0567a.b;
                if (i2 == 0) {
                    uj50.b(obj2);
                    Object objB = n52.b((BaseResponse) obj);
                    c0567a.b = 1;
                    if (this.a.emit(objB, c0567a) == y5bVar) {
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

        public a(lyh lyhVar) {
            this.a = lyhVar;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // defpackage.lyh
        public final Object collect(myh<? super BookingData> myhVar, v1b v1bVar) {
            C0566a c0566a;
            if (v1bVar instanceof C0566a) {
                c0566a = (C0566a) v1bVar;
                int i = c0566a.b;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c0566a.b = i - Integer.MIN_VALUE;
                } else {
                    c0566a = new C0566a(v1bVar);
                }
            } else {
                c0566a = new C0566a(v1bVar);
            }
            Object obj = c0566a.a;
            y5b y5bVar = y5b.a;
            int i2 = c0566a.b;
            if (i2 == 0) {
                uj50.b(obj);
                b bVar = new b(myhVar);
                c0566a.b = 1;
                if (this.a.collect(bVar, c0566a) == y5bVar) {
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
    public fia0(CountryCodeName countryCodeName, CountryCodeName countryCodeName2, oia0 oia0Var, v1b<? super fia0> v1bVar) {
        super(2, v1bVar);
        this.b = countryCodeName;
        this.c = countryCodeName2;
        this.d = oia0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        fia0 fia0Var = new fia0(this.b, this.c, this.d, v1bVar);
        fia0Var.a = obj;
        return fia0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(BookingData bookingData, v1b<? super lyh<? extends BookingData>> v1bVar) {
        return ((fia0) create(bookingData, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        BookingData bookingData = (BookingData) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        return this.b != this.c ? new a(this.d.b(bookingData)) : new gzh(bookingData);
    }
}
