package defpackage;

import androidx.navigation.fragment.NavHostFragment;
import com.google.protobuf.DescriptorProtos;
import com.sporty.android.platform.features.account.verifiedemailchange.verifyidentity.model.EmailChangeVerifyIdentityArgs;
import com.sporty.android.platform.features.newotp.util.OtpData;
import com.sporty.android.platform.features.newotp.util.OtpModule;
import com.sportybet.feature.payment.impl.security.nameupdate.presentation.activity.kekO.YAzniTbXHYQ;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sporty.android.platform.features.account.verifiedemailchange.notice.EmailChangeNoticeFragment$collectNavAction$$inlined$collectWithLifecycle$default$1", f = "EmailChangeNoticeFragment.kt", l = {22}, m = "invokeSuspend", v = 2)
public final class txf extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ ibs b;
    public final /* synthetic */ lyh c;
    public final /* synthetic */ uxf d;

    @c0d(c = "com.sporty.android.platform.features.account.verifiedemailchange.notice.EmailChangeNoticeFragment$collectNavAction$$inlined$collectWithLifecycle$default$1$1", f = "EmailChangeNoticeFragment.kt", l = {DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public /* synthetic */ Object b;
        public final /* synthetic */ lyh c;
        public final /* synthetic */ uxf d;

        /* JADX INFO: renamed from: txf$a$a, reason: collision with other inner class name */
        /* JADX INFO: loaded from: classes2.dex */
        public static final class C1153a<T> implements myh {
            public final /* synthetic */ v5b a;
            public final /* synthetic */ uxf b;

            public C1153a(v5b v5bVar, uxf uxfVar) {
                this.b = uxfVar;
                this.a = v5bVar;
            }

            @Override // defpackage.myh
            public final Object emit(T t, v1b<? super Unit> v1bVar) {
                wxf wxfVar = (wxf) t;
                boolean z = wxfVar instanceof wxf.d;
                uxf uxfVar = this.b;
                yfx yfxVarA = null;
                if (z) {
                    ee<String> eeVar = uxfVar.y;
                    if (eeVar == null) {
                        Intrinsics.n("sportyPinLauncher");
                        throw null;
                    }
                    eeVar.b(((wxf.d) wxfVar).a.a);
                } else if (wxfVar instanceof wxf.c) {
                    try {
                        if (uxfVar.isAdded()) {
                            yfxVarA = NavHostFragment.a.a(uxfVar);
                        }
                    } catch (IllegalStateException e) {
                        itf0.a.f(e, "Failed to find NavController", new Object[0]);
                    }
                    if (yfxVarA != null) {
                        EmailChangeVerifyIdentityArgs emailChangeVerifyIdentityArgs = ((wxf.c) wxfVar).a;
                        yfx.h(yfxVarA, new ozf(emailChangeVerifyIdentityArgs), bjx.a(new r8a(1, new kkx())), 4);
                    }
                } else if (wxfVar instanceof wxf.b) {
                    ee<OtpModule<OtpData.EmailChange>> eeVar2 = uxfVar.z;
                    if (eeVar2 == null) {
                        Intrinsics.n(YAzniTbXHYQ.siMBxzIdeVFjll);
                        throw null;
                    }
                    eeVar2.b(((wxf.b) wxfVar).a);
                } else {
                    if (!(wxfVar instanceof wxf.a)) {
                        uhc.a();
                        return null;
                    }
                    try {
                        if (uxfVar.isAdded()) {
                            yfxVarA = NavHostFragment.a.a(uxfVar);
                        }
                    } catch (IllegalStateException e2) {
                        itf0.a.f(e2, "Failed to find NavController", new Object[0]);
                    }
                    if (yfxVarA != null) {
                        cxf.a(yfxVarA, ((wxf.a) wxfVar).a);
                    }
                }
                return Unit.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(lyh lyhVar, v1b v1bVar, uxf uxfVar) {
            super(2, v1bVar);
            this.c = lyhVar;
            this.d = uxfVar;
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
                C1153a c1153a = new C1153a(v5bVar, this.d);
                this.b = null;
                this.a = 1;
                if (this.c.collect(c1153a, this) == y5bVar) {
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
    public txf(ibs ibsVar, lyh lyhVar, v1b v1bVar, uxf uxfVar) {
        super(2, v1bVar);
        s9s.b bVar = s9s.b.a;
        this.b = ibsVar;
        this.c = lyhVar;
        this.d = uxfVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        s9s.b bVar = s9s.b.a;
        return new txf(this.b, this.c, v1bVar, this.d);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((txf) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
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
