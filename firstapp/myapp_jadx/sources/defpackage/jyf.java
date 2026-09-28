package defpackage;

import com.sporty.android.core.model.account.verifiedemailchange.EmailChangeBindOtpSessionDTO;
import com.sporty.android.platform.features.newotp.otpselector.OtpSelection;
import com.sporty.android.platform.features.newotp.util.OTPResponse;
import com.sporty.android.platform.features.newotp.util.OtpData;
import kotlin.Metadata;
import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Ljyf;", "Lc7z;", "Lcom/sporty/android/platform/features/newotp/util/OtpData$EmailChange;", "sportyplatform"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class jyf extends c7z<OtpData.EmailChange> {
    public final pc80 A;
    public final c64 B;

    public static final class a implements lyh<String> {
        public final /* synthetic */ lyh a;

        /* JADX INFO: renamed from: jyf$a$a, reason: collision with other inner class name */
        @c0d(c = "com.sporty.android.platform.features.newotp.feature.verifiedemailchange.EmailChangeOtpSelectorViewModel$getSessionFlow$$inlined$map$1", f = "EmailChangeOtpSelectorViewModel.kt", l = {109}, m = "collect", v = 2)
        public static final class C0742a extends x1b {
            public /* synthetic */ Object a;
            public int b;

            public C0742a(v1b v1bVar) {
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

            /* JADX INFO: renamed from: jyf$a$b$a, reason: collision with other inner class name */
            @c0d(c = "com.sporty.android.platform.features.newotp.feature.verifiedemailchange.EmailChangeOtpSelectorViewModel$getSessionFlow$$inlined$map$1$2", f = "EmailChangeOtpSelectorViewModel.kt", l = {50}, m = "emit", v = 2)
            public static final class C0743a extends x1b {
                public /* synthetic */ Object a;
                public int b;

                public C0743a(v1b v1bVar) {
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
            @Override // defpackage.myh
            public final Object emit(Object obj, v1b v1bVar) {
                C0743a c0743a;
                if (v1bVar instanceof C0743a) {
                    c0743a = (C0743a) v1bVar;
                    int i = c0743a.b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c0743a.b = i - Integer.MIN_VALUE;
                    } else {
                        c0743a = new C0743a(v1bVar);
                    }
                } else {
                    c0743a = new C0743a(v1bVar);
                }
                Object obj2 = c0743a.a;
                y5b y5bVar = y5b.a;
                int i2 = c0743a.b;
                if (i2 == 0) {
                    uj50.b(obj2);
                    String token = ((EmailChangeBindOtpSessionDTO) obj).getToken();
                    c0743a.b = 1;
                    if (this.a.emit(token, c0743a) == y5bVar) {
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
        public final Object collect(myh<? super String> myhVar, v1b v1bVar) {
            C0742a c0742a;
            if (v1bVar instanceof C0742a) {
                c0742a = (C0742a) v1bVar;
                int i = c0742a.b;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c0742a.b = i - Integer.MIN_VALUE;
                } else {
                    c0742a = new C0742a(v1bVar);
                }
            } else {
                c0742a = new C0742a(v1bVar);
            }
            Object obj = c0742a.a;
            y5b y5bVar = y5b.a;
            int i2 = c0742a.b;
            if (i2 == 0) {
                uj50.b(obj);
                b bVar = new b(myhVar);
                c0742a.b = 1;
                if (this.a.collect(bVar, c0742a) == y5bVar) {
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
    public jyf(pc80 pc80Var, c64 c64Var, v8w v8wVar, rdd0 rdd0Var) {
        super(v8wVar, rdd0Var);
        c64Var.getClass();
        v8wVar.getClass();
        rdd0Var.getClass();
        this.A = pc80Var;
        this.B = c64Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.c7z
    public final lyh<String> P1() {
        EmailChangeBindOtpSessionDTO emailChangeBindOtpSessionDTO = new EmailChangeBindOtpSessionDTO(((OtpData.EmailChange) B1()).d);
        c64 c64Var = this.B;
        c64Var.getClass();
        return new a(c64Var.a.b(emailChangeBindOtpSessionDTO));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.c7z
    public final lyh<lk50<OTPResponse>> U1(OtpSelection otpSelection) {
        otpSelection.getClass();
        return this.A.a(otpSelection, z1().b, ((OtpData.EmailChange) B1()).c, ((OtpData.EmailChange) B1()).b, ((OtpData.EmailChange) B1()).a);
    }
}
