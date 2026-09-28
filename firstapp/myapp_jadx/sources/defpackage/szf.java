package defpackage;

import android.content.Context;
import androidx.navigation.fragment.NavHostFragment;
import com.google.protobuf.DescriptorProtos;
import com.sporty.android.platform.features.newotp.util.OtpData;
import com.sporty.android.platform.features.newotp.util.OtpModule;
import com.sportybet.android.auth.AuthNavigatorImpl;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sporty.android.platform.features.account.verifiedemailchange.verifyidentity.EmailChangeVerifyIdentityFragment$collectNavAction$$inlined$collectWithLifecycle$default$1", f = "EmailChangeVerifyIdentityFragment.kt", l = {22}, m = "invokeSuspend", v = 2)
public final class szf extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ ibs b;
    public final /* synthetic */ lyh c;
    public final /* synthetic */ tzf d;

    @c0d(c = "com.sporty.android.platform.features.account.verifiedemailchange.verifyidentity.EmailChangeVerifyIdentityFragment$collectNavAction$$inlined$collectWithLifecycle$default$1$1", f = "EmailChangeVerifyIdentityFragment.kt", l = {DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public /* synthetic */ Object b;
        public final /* synthetic */ lyh c;
        public final /* synthetic */ tzf d;

        /* JADX INFO: renamed from: szf$a$a, reason: collision with other inner class name */
        public static final class C1109a<T> implements myh {
            public final /* synthetic */ v5b a;
            public final /* synthetic */ tzf b;

            public C1109a(v5b v5bVar, tzf tzfVar) {
                this.b = tzfVar;
                this.a = v5bVar;
            }

            @Override // defpackage.myh
            public final Object emit(T t, v1b<? super Unit> v1bVar) {
                vzf vzfVar = (vzf) t;
                boolean z = vzfVar instanceof vzf.b;
                tzf tzfVar = this.b;
                yfx yfxVarA = null;
                if (z) {
                    AuthNavigatorImpl authNavigatorImpl = tzfVar.v;
                    if (authNavigatorImpl == null) {
                        Intrinsics.n("authNavigator");
                        throw null;
                    }
                    Context contextRequireContext = tzfVar.requireContext();
                    contextRequireContext.getClass();
                    vzf.b bVar = (vzf.b) vzfVar;
                    authNavigatorImpl.navigateToForgetPassword(contextRequireContext, bVar.a, bVar.b, "");
                } else if (vzfVar instanceof vzf.c) {
                    ee<OtpModule<OtpData.EmailChange>> eeVar = tzfVar.w;
                    if (eeVar == null) {
                        Intrinsics.n("otpLauncher");
                        throw null;
                    }
                    eeVar.b(((vzf.c) vzfVar).a);
                } else {
                    if (!(vzfVar instanceof vzf.a)) {
                        uhc.a();
                        return null;
                    }
                    try {
                        if (tzfVar.isAdded()) {
                            yfxVarA = NavHostFragment.a.a(tzfVar);
                        }
                    } catch (IllegalStateException e) {
                        itf0.a.f(e, "Failed to find NavController", new Object[0]);
                    }
                    if (yfxVarA != null) {
                        cxf.a(yfxVarA, ((vzf.a) vzfVar).a);
                    }
                }
                return Unit.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(lyh lyhVar, v1b v1bVar, tzf tzfVar) {
            super(2, v1bVar);
            this.c = lyhVar;
            this.d = tzfVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            a aVar = new a(this.c, v1bVar, this.d);
            aVar.b = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            v5b v5bVar = (v5b) this.b;
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                C1109a c1109a = new C1109a(v5bVar, this.d);
                this.b = null;
                this.a = 1;
                if (this.c.collect(c1109a, this) == y5bVar) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public szf(ibs ibsVar, lyh lyhVar, v1b v1bVar, tzf tzfVar) {
        super(2, v1bVar);
        s9s.b bVar = s9s.b.a;
        this.b = ibsVar;
        this.c = lyhVar;
        this.d = tzfVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        s9s.b bVar = s9s.b.a;
        return new szf(this.b, this.c, v1bVar, this.d);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((szf) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            s9s lifecycle = this.b.getLifecycle();
            s9s.b bVar = s9s.b.d;
            a aVar = new a(this.c, null, this.d);
            this.a = 1;
            if (m850.a(lifecycle, bVar, aVar, this) == y5bVar) {
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
