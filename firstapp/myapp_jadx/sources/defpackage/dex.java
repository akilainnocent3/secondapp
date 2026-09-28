package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.common.network.data.SprThrowable;
import com.sporty.android.core.model.security.otp.OTPUpdateNameResult;
import com.sporty.android.core.model.security.otp.OTPVerificationRequest;
import com.sporty.android.platform.features.newotp.otpselector.OtpSelection;
import com.sporty.android.platform.features.newotp.util.OTPResponse;
import com.sporty.android.platform.features.newotp.util.OtpData;
import com.sportygames.goldmine.data.dto.oBji.dLRYz;
import kotlin.Metadata;
import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Ldex;", "Lecf0;", "Lcom/sporty/android/platform/features/newotp/util/OtpData$NameUpdate;", "sportyplatform"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class dex extends ecf0<OtpData.NameUpdate> {
    public final pc80 A;
    public final lyz z;

    public static final class a implements lyh<OTPUpdateNameResult> {
        public final /* synthetic */ lyh a;

        /* JADX INFO: renamed from: dex$a$a, reason: collision with other inner class name */
        @c0d(c = "com.sporty.android.platform.features.newotp.feature.nameupdate.NameUpdateTelegramViewModel$verifyFlow$$inlined$map$1", f = "NameUpdateTelegramViewModel.kt", l = {109}, m = "collect", v = 2)
        public static final class C0483a extends x1b {
            public /* synthetic */ Object a;
            public int b;

            public C0483a(v1b v1bVar) {
                super(v1bVar);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                this.a = obj;
                this.b |= Integer.MIN_VALUE;
                return a.this.collect(null, this);
            }
        }

        /* JADX INFO: loaded from: classes2.dex */
        public static final class b<T> implements myh {
            public final /* synthetic */ myh a;

            /* JADX INFO: renamed from: dex$a$b$a, reason: collision with other inner class name */
            /* JADX INFO: loaded from: classes5.dex */
            @c0d(c = "com.sporty.android.platform.features.newotp.feature.nameupdate.NameUpdateTelegramViewModel$verifyFlow$$inlined$map$1$2", f = "NameUpdateTelegramViewModel.kt", l = {50}, m = "emit", v = 2)
            public static final class C0484a extends x1b {
                public /* synthetic */ Object a;
                public int b;

                public C0484a(v1b v1bVar) {
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
                C0484a c0484a;
                if (v1bVar instanceof C0484a) {
                    c0484a = (C0484a) v1bVar;
                    int i = c0484a.b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c0484a.b = i - Integer.MIN_VALUE;
                    } else {
                        c0484a = new C0484a(v1bVar);
                    }
                } else {
                    c0484a = new C0484a(v1bVar);
                }
                Object obj2 = c0484a.a;
                y5b y5bVar = y5b.a;
                int i2 = c0484a.b;
                if (i2 == 0) {
                    uj50.b(obj2);
                    Object objB = n52.b((BaseResponse) obj);
                    c0484a.b = 1;
                    if (this.a.emit(objB, c0484a) == y5bVar) {
                        return y5bVar;
                    }
                } else {
                    if (i2 != 1) {
                        ib5.a(dLRYz.OJAnk);
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
        public final Object collect(myh<? super OTPUpdateNameResult> myhVar, v1b v1bVar) {
            C0483a c0483a;
            if (v1bVar instanceof C0483a) {
                c0483a = (C0483a) v1bVar;
                int i = c0483a.b;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c0483a.b = i - Integer.MIN_VALUE;
                } else {
                    c0483a = new C0483a(v1bVar);
                }
            } else {
                c0483a = new C0483a(v1bVar);
            }
            Object obj = c0483a.a;
            y5b y5bVar = y5b.a;
            int i2 = c0483a.b;
            if (i2 == 0) {
                uj50.b(obj);
                b bVar = new b(myhVar);
                c0483a.b = 1;
                if (this.a.collect(bVar, c0483a) == y5bVar) {
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
    public dex(lyz lyzVar, pc80 pc80Var, rdd0 rdd0Var) {
        super(rdd0Var);
        lyzVar.getClass();
        rdd0Var.getClass();
        this.z = lyzVar;
        this.A = pc80Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ecf0
    public final lyh<lk50<OTPResponse>> N1(OtpSelection otpSelection) {
        return this.A.a(otpSelection, z1().b, j6c.UPDATE_NAME, ((OtpData.NameUpdate) B1()).a, ((OtpData.NameUpdate) B1()).b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ecf0
    public final lyh<lk50<Unit>> P1(String str) {
        return b42.F1(bm50.a(new a(this.z.W(new OTPVerificationRequest(z1().b, str, ((OtpData.NameUpdate) B1()).b, ((OtpData.NameUpdate) B1()).a)))), new cex(this, 0));
    }
}
