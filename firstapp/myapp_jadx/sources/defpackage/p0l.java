package defpackage;

import android.app.AlertDialog;
import com.google.android.material.tabs.TabLayout;
import com.google.protobuf.DescriptorProtos;
import com.sporty.android.common_ui.uitext.ConcatUiText;
import com.sportybet.android.globalpay.GlobalDepositActivity;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.globalpay.GlobalDepositActivity$initViewModel$$inlined$collectWithLifecycle$default$1", f = "GlobalDepositActivity.kt", l = {22}, m = "invokeSuspend", v = 2)
public final class p0l extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ GlobalDepositActivity b;
    public final /* synthetic */ lyh c;
    public final /* synthetic */ GlobalDepositActivity d;

    @c0d(c = "com.sportybet.android.globalpay.GlobalDepositActivity$initViewModel$$inlined$collectWithLifecycle$default$1$1", f = "GlobalDepositActivity.kt", l = {DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public /* synthetic */ Object b;
        public final /* synthetic */ lyh c;
        public final /* synthetic */ GlobalDepositActivity d;

        /* JADX INFO: renamed from: p0l$a$a, reason: collision with other inner class name */
        public static final class C0954a<T> implements myh {
            public final /* synthetic */ v5b a;
            public final /* synthetic */ GlobalDepositActivity b;

            public C0954a(v5b v5bVar, GlobalDepositActivity globalDepositActivity) {
                this.b = globalDepositActivity;
                this.a = v5bVar;
            }

            @Override // defpackage.myh
            public final Object emit(T t, v1b<? super Unit> v1bVar) {
                z0l z0lVar = (z0l) t;
                boolean zG = Intrinsics.g(z0lVar, z0l.e.a);
                GlobalDepositActivity globalDepositActivity = this.b;
                if (zG) {
                    globalDepositActivity.z1();
                } else if (Intrinsics.g(z0lVar, z0l.a.a)) {
                    AlertDialog alertDialog = globalDepositActivity.b;
                    if (alertDialog != null) {
                        alertDialog.dismiss();
                    }
                } else if (Intrinsics.g(z0lVar, z0l.f.a)) {
                    zyf0.b(R.string.common_feedback__something_went_wrong_please_try_again_later_thank_you, 0);
                } else if (z0lVar instanceof z0l.c) {
                    zc zcVar = globalDepositActivity.d;
                    if (zcVar == null) {
                        Intrinsics.n("binding");
                        throw null;
                    }
                    TabLayout tabLayout = zcVar.f;
                    tabLayout.s(tabLayout.k(((z0l.c) z0lVar).a + 1), true);
                } else if (z0lVar instanceof z0l.d) {
                    AlertDialog.Builder builder = new AlertDialog.Builder(globalDepositActivity, R.style.Widget_Payment_PendingRequest_AlertDialog);
                    ConcatUiText concatUiTextB = ((z0l.d) z0lVar).a.b();
                    concatUiTextB.getClass();
                    builder.setMessage(concatUiTextB.e(globalDepositActivity).toString()).setPositiveButton(R.string.common_functions__ok, t0l.a).setNegativeButton(R.string.common_functions__contact_support, u0l.a).show();
                } else {
                    if (!Intrinsics.g(z0lVar, z0l.b.a)) {
                        uhc.a();
                        return null;
                    }
                    zc zcVar2 = globalDepositActivity.d;
                    if (zcVar2 == null) {
                        Intrinsics.n("binding");
                        throw null;
                    }
                    TabLayout tabLayout2 = zcVar2.f;
                    tabLayout2.s(tabLayout2.k(0), true);
                }
                return Unit.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(lyh lyhVar, v1b v1bVar, GlobalDepositActivity globalDepositActivity) {
            super(2, v1bVar);
            this.c = lyhVar;
            this.d = globalDepositActivity;
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
                C0954a c0954a = new C0954a(v5bVar, this.d);
                this.b = null;
                this.a = 1;
                if (this.c.collect(c0954a, this) == y5bVar) {
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
    public p0l(GlobalDepositActivity globalDepositActivity, lyh lyhVar, v1b v1bVar, GlobalDepositActivity globalDepositActivity2) {
        super(2, v1bVar);
        s9s.b bVar = s9s.b.a;
        this.b = globalDepositActivity;
        this.c = lyhVar;
        this.d = globalDepositActivity2;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        s9s.b bVar = s9s.b.a;
        return new p0l(this.b, this.c, v1bVar, this.d);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((p0l) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
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
