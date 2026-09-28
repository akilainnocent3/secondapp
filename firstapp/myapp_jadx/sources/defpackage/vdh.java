package defpackage;

import android.widget.ViewFlipper;
import com.google.android.material.tabs.TabLayout;
import com.sportybet.plugin.realsports.home.featuredsection.FeaturedContainer;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.realsports.home.featuredsection.FeaturedContainer$initView$1$6$1$1", f = "FeaturedContainer.kt", l = {460}, m = "invokeSuspend", v = 2)
public final class vdh extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public Object a;
    public int b;
    public final /* synthetic */ ydh c;
    public final /* synthetic */ FeaturedContainer d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vdh(v1b v1bVar, ydh ydhVar, FeaturedContainer featuredContainer) {
        super(2, v1bVar);
        this.c = ydhVar;
        this.d = featuredContainer;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new vdh(v1bVar, this.c, this.d);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((vdh) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        final Object obj2;
        y5b y5bVar = y5b.a;
        int i = this.b;
        final FeaturedContainer featuredContainer = this.d;
        final ydh ydhVar = this.c;
        if (i == 0) {
            uj50.b(obj);
            TabLayout tabLayout = ydhVar.e;
            TabLayout.g gVarK = tabLayout.k(tabLayout.getSelectedTabPosition());
            Object obj3 = gVarK != null ? gVarK.a : null;
            m2l preferenceDataStore = featuredContainer.getPreferenceDataStore();
            this.a = obj3;
            this.b = 1;
            obj = preferenceDataStore.a.getInt("featured_container_selected_tab", 0, this);
            if (obj == y5bVar) {
                return y5bVar;
            }
            obj2 = obj3;
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            obj2 = this.a;
            uj50.b(obj);
        }
        final int iIntValue = ((Number) obj).intValue();
        ydhVar.e.post(new Runnable() { // from class: udh
            @Override // java.lang.Runnable
            public final void run() {
                TabLayout.g gVarJ;
                boolean z = featuredContainer.a0;
                ydh ydhVar2 = ydhVar;
                if (z) {
                    TabLayout tabLayout2 = ydhVar2.e;
                    gVarJ = FeaturedContainer.J(tabLayout2, Integer.valueOf(iIntValue));
                    if (gVarJ == null && (gVarJ = FeaturedContainer.J(tabLayout2, obj2)) == null) {
                        gVarJ = tabLayout2.k(0);
                    }
                } else {
                    gVarJ = null;
                }
                if (gVarJ != null) {
                    ydhVar2.e.s(gVarJ, true);
                }
                TabLayout tabLayout3 = ydhVar2.e;
                TabLayout.g gVarK2 = tabLayout3.k(tabLayout3.getSelectedTabPosition());
                Object obj4 = gVarK2 != null ? gVarK2.a : null;
                ViewFlipper viewFlipper = ydhVar2.z;
                Integer num = (Integer) (obj4 instanceof Integer ? obj4 : null);
                viewFlipper.setDisplayedChild(num != null ? num.intValue() : 0);
            }
        });
        return Unit.a;
    }
}
