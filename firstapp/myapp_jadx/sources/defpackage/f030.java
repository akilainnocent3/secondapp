package defpackage;

import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.sporty.android.core.model.patron.KYCBannerItem;
import com.sporty.android.core.model.patron.KYCTierStatus;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.user.kyc.banner.KYCBanner;
import com.sportybet.android.widget.IndicatorView;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.profile.ProfileFragment$collectKYCTiers$1", f = "ProfileFragment.kt", l = {538}, m = "invokeSuspend", v = 2)
public final class f030 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ d030 b;

    public static final class a<T> implements myh {
        public final /* synthetic */ d030 a;

        public a(d030 d030Var) {
            this.a = d030Var;
        }

        /* JADX WARN: Code duplicated, block: B:12:0x0040  */
        @Override // defpackage.myh
        public final Object emit(Object obj, v1b<? super Unit> v1bVar) {
            Object obj2 = ((zi50) obj).a;
            boolean z = obj2 instanceof zi50.b;
            d030 d030Var = this.a;
            if (z) {
                ohp<Object>[] ohpVarArr = d030.S;
                d030Var.n0().v.setVisibility(8);
                d030Var.n0().A.J(sn5.d(d030Var, R.string.common_feedback__please_check_your_internet_connection_and_try_again, new Object[0]));
            } else {
                if ((z ? null : obj2) != null) {
                    if (z) {
                        obj2 = null;
                    }
                    obj2.getClass();
                    final List<T> list = (List) obj2;
                    ohp<Object>[] ohpVarArr2 = d030.S;
                    d030Var.n0().A.E();
                    final KYCBanner kYCBanner = d030Var.n0().v;
                    kYCBanner.G.j(list, new Runnable() { // from class: yhp
                        /* JADX WARN: Type inference fix 'apply assigned field type' failed
                        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
                        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                         */
                        @Override // java.lang.Runnable
                        public final void run() {
                            int i = KYCBanner.I;
                            List list2 = list;
                            int size = list2.size();
                            Iterator it = list2.iterator();
                            int size2 = 0;
                            while (true) {
                                if (!it.hasNext()) {
                                    size2 = -1;
                                    break;
                                } else if (((KYCBannerItem) it.next()).getTierStatus() == KYCTierStatus.AVAILABLE) {
                                    break;
                                } else {
                                    size2++;
                                }
                            }
                            Iterator it2 = list2.iterator();
                            int i2 = 0;
                            while (true) {
                                if (!it2.hasNext()) {
                                    i2 = -1;
                                    break;
                                } else if (((KYCBannerItem) it2.next()).getTierStatus() == KYCTierStatus.FAILED) {
                                    break;
                                } else {
                                    i2++;
                                }
                            }
                            if (size2 >= 0 && i2 >= 0) {
                                size2 = Math.min(size2, i2);
                            } else if (size2 < 0) {
                                size2 = i2 >= 0 ? i2 : list2.size() - 1;
                            }
                            KYCBanner kYCBanner2 = kYCBanner;
                            fsp fspVar = kYCBanner2.F;
                            fspVar.b.removeAllViews();
                            FrameLayout frameLayout = fspVar.b;
                            IndicatorView indicatorView = kYCBanner2.H;
                            int i3 = IndicatorView.d;
                            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
                            indicatorView.getClass();
                            layoutParams.gravity = 16;
                            indicatorView.setLayoutParams(layoutParams);
                            indicatorView.setOrientation(0);
                            indicatorView.setGravity(17);
                            frameLayout.addView(indicatorView);
                            fspVar.c.setCurrentItem(size2, false);
                            indicatorView.removeAllViews();
                            indicatorView.a(size, false);
                            indicatorView.setGreyVersion(true);
                            indicatorView.b(size2);
                        }
                    });
                    d030Var.n0().v.setVisibility(0);
                } else {
                    ohp<Object>[] ohpVarArr3 = d030.S;
                    d030Var.n0().v.setVisibility(8);
                    d030Var.n0().A.J(sn5.d(d030Var, R.string.common_feedback__please_check_your_internet_connection_and_try_again, new Object[0]));
                }
            }
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f030(v1b v1bVar, d030 d030Var) {
        super(2, v1bVar);
        this.b = d030Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new f030(v1bVar, this.b);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((f030) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            ohp<Object>[] ohpVarArr = d030.S;
            d030 d030Var = this.b;
            f1i f1iVar = d030Var.s0().D;
            a aVar = new a(d030Var);
            this.a = 1;
            if (f1iVar.collect(aVar, this) == y5bVar) {
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
