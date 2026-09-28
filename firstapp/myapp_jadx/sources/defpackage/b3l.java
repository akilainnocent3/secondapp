package defpackage;

import android.app.AlertDialog;
import androidx.fragment.app.FragmentManager;
import com.google.android.material.tabs.TabLayout;
import com.google.protobuf.DescriptorProtos;
import com.sportybet.android.globalpay.GlobalWithdrawActivity;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.globalpay.GlobalWithdrawActivity$initViewModel$$inlined$collectWithLifecycle$default$1", f = "GlobalWithdrawActivity.kt", l = {22}, m = "invokeSuspend", v = 2)
public final class b3l extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ GlobalWithdrawActivity b;
    public final /* synthetic */ lyh c;
    public final /* synthetic */ GlobalWithdrawActivity d;

    @c0d(c = "com.sportybet.android.globalpay.GlobalWithdrawActivity$initViewModel$$inlined$collectWithLifecycle$default$1$1", f = "GlobalWithdrawActivity.kt", l = {DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public /* synthetic */ Object b;
        public final /* synthetic */ lyh c;
        public final /* synthetic */ GlobalWithdrawActivity d;

        /* JADX INFO: renamed from: b3l$a$a, reason: collision with other inner class name */
        public static final class C0110a<T> implements myh {
            public final /* synthetic */ v5b a;
            public final /* synthetic */ GlobalWithdrawActivity b;

            public C0110a(v5b v5bVar, GlobalWithdrawActivity globalWithdrawActivity) {
                this.b = globalWithdrawActivity;
                this.a = v5bVar;
            }

            @Override // defpackage.myh
            public final Object emit(T t, v1b<? super Unit> v1bVar) {
                g3l g3lVar = (g3l) t;
                boolean zG = Intrinsics.g(g3lVar, g3l.d.a);
                GlobalWithdrawActivity globalWithdrawActivity = this.b;
                if (zG) {
                    globalWithdrawActivity.z1();
                } else if (Intrinsics.g(g3lVar, g3l.e.a)) {
                    zyf0.b(R.string.common_feedback__something_went_wrong_please_try_again_later_thank_you, 0);
                } else if (g3lVar instanceof g3l.f) {
                    FragmentManager supportFragmentManager = globalWithdrawActivity.getSupportFragmentManager();
                    supportFragmentManager.getClass();
                    boolean z = ((g3l.f) g3lVar).a;
                    int i = GlobalWithdrawActivity.y;
                    k8d0.a(globalWithdrawActivity, supportFragmentManager, z, new d3l(0, globalWithdrawActivity.A1(), h3l.class, "onPinPromptSkipped", "onPinPromptSkipped()V", 0), 4);
                } else if (Intrinsics.g(g3lVar, g3l.a.a)) {
                    AlertDialog alertDialog = globalWithdrawActivity.b;
                    if (alertDialog != null) {
                        alertDialog.dismiss();
                    }
                } else if (g3lVar instanceof g3l.c) {
                    ad adVar = globalWithdrawActivity.d;
                    if (adVar == null) {
                        Intrinsics.n("binding");
                        throw null;
                    }
                    TabLayout tabLayout = adVar.A;
                    tabLayout.s(tabLayout.k(((g3l.c) g3lVar).a + 1), true);
                } else {
                    if (!Intrinsics.g(g3lVar, g3l.b.a)) {
                        uhc.a();
                        return null;
                    }
                    ad adVar2 = globalWithdrawActivity.d;
                    if (adVar2 == null) {
                        Intrinsics.n("binding");
                        throw null;
                    }
                    TabLayout tabLayout2 = adVar2.A;
                    tabLayout2.s(tabLayout2.k(0), true);
                }
                return Unit.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(lyh lyhVar, v1b v1bVar, GlobalWithdrawActivity globalWithdrawActivity) {
            super(2, v1bVar);
            this.c = lyhVar;
            this.d = globalWithdrawActivity;
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
                C0110a c0110a = new C0110a(v5bVar, this.d);
                this.b = null;
                this.a = 1;
                if (this.c.collect(c0110a, this) == y5bVar) {
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
    public b3l(GlobalWithdrawActivity globalWithdrawActivity, lyh lyhVar, v1b v1bVar, GlobalWithdrawActivity globalWithdrawActivity2) {
        super(2, v1bVar);
        s9s.b bVar = s9s.b.a;
        this.b = globalWithdrawActivity;
        this.c = lyhVar;
        this.d = globalWithdrawActivity2;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        s9s.b bVar = s9s.b.a;
        return new b3l(this.b, this.c, v1bVar, this.d);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((b3l) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
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
