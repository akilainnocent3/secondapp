package defpackage;

import com.google.android.material.tabs.TabLayout;
import com.sportybet.plugin.realsports.live.livepage.LivePageActivity;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.realsports.live.livepage.LivePageActivity$selectedChangeFlow$1", f = "LivePageActivity.kt", l = {448}, m = "invokeSuspend", v = 2)
public final class lqs extends tje0 implements Function2<ez20<? super mfb0>, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ TabLayout c;
    public final /* synthetic */ LivePageActivity d;

    public static final class a implements TabLayout.d {
        public final /* synthetic */ LivePageActivity a;
        public final /* synthetic */ ez20<mfb0> b;
        public final /* synthetic */ TabLayout c;

        /* JADX WARN: Multi-variable type inference failed */
        public a(LivePageActivity livePageActivity, ez20<? super mfb0> ez20Var, TabLayout tabLayout) {
            this.a = livePageActivity;
            this.b = ez20Var;
            this.c = tabLayout;
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public final void A0(TabLayout.g gVar) {
            gVar.getClass();
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public final void G(TabLayout.g gVar) throws Throwable {
            gVar.getClass();
            Object obj = gVar.a;
            if (!(obj instanceof mfb0)) {
                obj = null;
            }
            mfb0 mfb0Var = (mfb0) obj;
            if (mfb0Var == null) {
                return;
            }
            int i = LivePageActivity.b0;
            LivePageActivity livePageActivity = this.a;
            livePageActivity.z1().w.setRefreshing(false);
            uqs uqsVarG1 = livePageActivity.G1();
            uqsVarG1.K1();
            jvd0 jvd0Var = uqsVarG1.g0;
            if (jvd0Var != null) {
                jvd0Var.cancel((CancellationException) null);
            }
            jvd0 jvd0Var2 = uqsVarG1.D;
            if (jvd0Var2 != null) {
                jvd0Var2.cancel((CancellationException) null);
            }
            jvd0 jvd0Var3 = uqsVarG1.h0;
            if (jvd0Var3 != null) {
                jvd0Var3.cancel((CancellationException) null);
            }
            uqsVarG1.B1(false);
            uqsVarG1.x1();
            livePageActivity.U = true;
            this.b.c(mfb0Var);
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public final void g0(TabLayout.g gVar) {
            gVar.getClass();
            Object obj = gVar.a;
            if (!(obj instanceof mfb0)) {
                obj = null;
            }
            mfb0 mfb0Var = (mfb0) obj;
            if (mfb0Var == null) {
                return;
            }
            int i = LivePageActivity.b0;
            LivePageActivity livePageActivity = this.a;
            Integer num = (Integer) livePageActivity.G1().b0.get(mfb0Var.getId());
            int iIntValue = 0;
            if (num != null) {
                int iIntValue2 = num.intValue();
                Integer num2 = (Integer) livePageActivity.G1().c0.get(mfb0Var.getId());
                iIntValue = (num2 != null ? num2.intValue() : 0) + iIntValue2;
            }
            if (iIntValue == 0) {
                this.c.p(gVar);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lqs(TabLayout tabLayout, LivePageActivity livePageActivity, v1b<? super lqs> v1bVar) {
        super(2, v1bVar);
        this.c = tabLayout;
        this.d = livePageActivity;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        lqs lqsVar = new lqs(this.c, this.d, v1bVar);
        lqsVar.b = obj;
        return lqsVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ez20<? super mfb0> ez20Var, v1b<? super Unit> v1bVar) {
        return ((lqs) create(ez20Var, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        ez20 ez20Var = (ez20) this.b;
        y5b y5bVar = y5b.a;
        int i = this.a;
        int i2 = 1;
        if (i == 0) {
            uj50.b(obj);
            LivePageActivity livePageActivity = this.d;
            TabLayout tabLayout = this.c;
            a aVar = new a(livePageActivity, ez20Var, tabLayout);
            tabLayout.a(aVar);
            d1j d1jVar = new d1j(i2, tabLayout, aVar);
            this.b = null;
            this.a = 1;
            if (az20.a(ez20Var, d1jVar, this) == y5bVar) {
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
