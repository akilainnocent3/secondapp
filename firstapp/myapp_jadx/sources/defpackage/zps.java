package defpackage;

import com.google.android.material.tabs.TabLayout;
import com.sportybet.plugin.realsports.data.OrderedSportItem;
import com.sportybet.plugin.realsports.live.livepage.LivePageActivity;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.realsports.live.livepage.LivePageActivity$collectSocketMessage$1", f = "LivePageActivity.kt", l = {1470}, m = "invokeSuspend", v = 2)
public final class zps extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ LivePageActivity b;

    public static final class a<T> implements myh {
        public final /* synthetic */ LivePageActivity a;

        public a(LivePageActivity livePageActivity) {
            this.a = livePageActivity;
        }

        @Override // defpackage.myh
        public final Object emit(Object obj, v1b v1bVar) {
            mfb0 mfb0Var;
            Object obj2;
            List list = (List) obj;
            boolean zIsEmpty = list.isEmpty();
            LivePageActivity livePageActivity = this.a;
            if (zIsEmpty) {
                livePageActivity.finish();
                return Unit.a;
            }
            int i = LivePageActivity.b0;
            TabLayout tabLayout = livePageActivity.z1().i;
            boolean z = true;
            if (tabLayout.getTabCount() == list.size()) {
                int tabCount = tabLayout.getTabCount();
                boolean z2 = false;
                for (int i2 = 0; i2 < tabCount; i2++) {
                    TabLayout.g gVarK = tabLayout.k(i2);
                    if (gVarK == null || (obj2 = gVarK.a) == null) {
                        mfb0Var = null;
                    } else {
                        if (!(obj2 instanceof mfb0)) {
                            obj2 = null;
                        }
                        mfb0Var = (mfb0) obj2;
                    }
                    if (!Intrinsics.g(mfb0Var != null ? mfb0Var.getId() : null, ((OrderedSportItem) list.get(i2)).id)) {
                        z2 = true;
                    }
                }
                z = z2;
            }
            if (z) {
                k48.a(livePageActivity.G1().e0, list);
            }
            if (z) {
                livePageActivity.K1();
            } else {
                livePageActivity.O1();
            }
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zps(LivePageActivity livePageActivity, v1b<? super zps> v1bVar) {
        super(2, v1bVar);
        this.b = livePageActivity;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new zps(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) throws Throwable {
        ((zps) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        return y5b.a;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) throws Throwable {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i != 0) {
            if (i == 1) {
                throw l80.a(obj);
            }
            ib5.a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        uj50.b(obj);
        int i2 = LivePageActivity.b0;
        LivePageActivity livePageActivity = this.b;
        b390 b390Var = livePageActivity.G1().V;
        a aVar = new a(livePageActivity);
        this.a = 1;
        b390Var.getClass();
        b390.m(b390Var, aVar, this);
        return y5bVar;
    }
}
