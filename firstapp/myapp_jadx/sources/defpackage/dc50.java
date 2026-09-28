package defpackage;

import android.os.Bundle;
import android.widget.Toast;
import com.google.protobuf.DescriptorProtos;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sporty.android.platform.features.account.resetpassword.presentation.ResetPasswordFragment$collectResetPasswordEffect$$inlined$collectWithLifecycle$default$1", f = "ResetPasswordFragment.kt", l = {22}, m = "invokeSuspend", v = 2)
public final class dc50 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ ibs b;
    public final /* synthetic */ lyh c;
    public final /* synthetic */ fc50 d;

    @c0d(c = "com.sporty.android.platform.features.account.resetpassword.presentation.ResetPasswordFragment$collectResetPasswordEffect$$inlined$collectWithLifecycle$default$1$1", f = "ResetPasswordFragment.kt", l = {DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public /* synthetic */ Object b;
        public final /* synthetic */ lyh c;
        public final /* synthetic */ fc50 d;

        /* JADX INFO: renamed from: dc50$a$a, reason: collision with other inner class name */
        public static final class C0481a<T> implements myh {
            public final /* synthetic */ v5b a;
            public final /* synthetic */ fc50 b;

            public C0481a(v5b v5bVar, fc50 fc50Var) {
                this.b = fc50Var;
                this.a = v5bVar;
            }

            @Override // defpackage.myh
            public final Object emit(T t, v1b<? super Unit> v1bVar) {
                Bundle arguments;
                fc50 fc50Var = this.b;
                q8i0 q8i0Var = fc50Var.D;
                ub50 ub50Var = (ub50) t;
                if (ub50Var instanceof ub50.c) {
                    ub50.c cVar = (ub50.c) ub50Var;
                    String str = cVar.a;
                    String str2 = cVar.b;
                    nsm nsmVar = fc50Var.B;
                    if (nsmVar == null) {
                        Intrinsics.n("connectivityMonitor");
                        throw null;
                    }
                    if (nsmVar.isConnected()) {
                        kd50 kd50Var = (kd50) q8i0Var.getValue();
                        str.getClass();
                        str2.getClass();
                        if (kd50Var.y.c) {
                            ej5.c(o8i0.d(kd50Var), null, null, new jd50(null, kd50Var, str, str2), 3);
                        } else {
                            ej5.c(o8i0.d(kd50Var), null, null, new ld50(null, kd50Var, str2, str), 3);
                        }
                    } else {
                        ((kd50) q8i0Var.getValue()).z1(rb50.a.a);
                    }
                } else if (ub50Var instanceof ub50.a) {
                    fy1 fy1Var = fc50Var.C;
                    if (fy1Var == null) {
                        Intrinsics.n("authActivityProvider");
                        throw null;
                    }
                    boolean z = fy1Var.a() != null || ((arguments = fc50Var.getArguments()) != null && arguments.getBoolean("isForced", false));
                    ub50.a aVar = (ub50.a) ub50Var;
                    wvz wvzVar = aVar.c;
                    if (aVar.b && z) {
                        ((i7n) fc50Var.E.getValue()).b = true;
                        Toast.makeText(fc50Var.requireContext(), R.string.common_feedback__reset_password_done, 0).show();
                        vqm vqmVar = new vqm(aVar.a, wvzVar.b, wvzVar.c, wvzVar.d, wvzVar.e, (String) null, wvzVar.f, (String) null, (String) null, (String) null, (String) null, 0L, 8096);
                        uqm uqmVar = fc50Var.i;
                        fy1 fy1Var2 = fc50Var.C;
                        if (fy1Var2 == null) {
                            Intrinsics.n("authActivityProvider");
                            throw null;
                        }
                        uqmVar.saveToken(fy1Var2.a(), vqmVar);
                        fc50Var.i.setLanguage(wvzVar.g);
                        ((kd50) q8i0Var.getValue()).z1(rb50.g.a);
                    }
                } else {
                    if (!Intrinsics.g(ub50Var, ub50.b.a)) {
                        uhc.a();
                        return null;
                    }
                    fc50Var.requireActivity().finish();
                }
                return Unit.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(lyh lyhVar, v1b v1bVar, fc50 fc50Var) {
            super(2, v1bVar);
            this.c = lyhVar;
            this.d = fc50Var;
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
                C0481a c0481a = new C0481a(v5bVar, this.d);
                this.b = null;
                this.a = 1;
                if (this.c.collect(c0481a, this) == y5bVar) {
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
    public dc50(ibs ibsVar, lyh lyhVar, v1b v1bVar, fc50 fc50Var) {
        super(2, v1bVar);
        s9s.b bVar = s9s.b.a;
        this.b = ibsVar;
        this.c = lyhVar;
        this.d = fc50Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        s9s.b bVar = s9s.b.a;
        return new dc50(this.b, this.c, v1bVar, this.d);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((dc50) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
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
