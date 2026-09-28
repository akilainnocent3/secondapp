package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.e;
import com.sportybet.android.gp.tz.R;
import com.sportygames.commons.models.GPSData;
import com.sportygames.commons.models.GiftItem;
import com.sportygames.commons.remote.model.Status;
import com.sportygames.crash.models.bet.BetContainerState;
import com.sportygames.crash.remote.models.DetailResponse;
import com.sportygames.crash.remote.models.DetailResponseData;
import com.sportygames.crash.remote.models.MultiplierResponse;
import com.sportygames.crash.remote.models.TopBets;
import com.sportygames.sportyherocompose.components.OverUnderComponent;
import com.sportygames.sportyherocompose.components.RangeComponent;
import com.sportygames.sportyherocompose.components.SHOverBetComponent;
import com.sportygames.sportyherocompose.components.SHRangeComponent;
import com.sportygames.sportyherov2.components.SideBetTabContainer;
import com.sportygames.sportyherov2.remote.models.CashOutOverUnderRequest;
import com.sportygames.sportyherov2.remote.models.PlaceOverUnderBetRequest;
import com.sportygames.sportyherov2.remote.models.PlaceRangeBetRequest;
import com.sportygames.sportyherov2.remote.models.SideBetConfigsList;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes5.dex */
public final class fd90 {
    public final qub0 a;
    public final a6c0 b;
    public final ln1 c;
    public final k6c0 d;
    public final ibs e;
    public final ig50 f;
    public DetailResponseData g;
    public ynj h;
    public HashMap<Double, Double> i;
    public Boolean j;
    public List<GiftItem> k;
    public xi60 l;
    public boolean m;
    public boolean n;
    public hd90.a o;
    public hd90.b p;
    public MultiplierResponse q;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        public static final a a;
        public static final a b;
        public static final a c;
        public static final /* synthetic */ a[] d;

        static {
            a aVar = new a("NONE", 0);
            a = aVar;
            a aVar2 = new a("WAITING", 1);
            b = aVar2;
            a aVar3 = new a("FLYING", 2);
            c = aVar3;
            d = new a[]{aVar, aVar2, aVar3};
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) d.clone();
        }
    }

    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[Status.values().length];
            try {
                iArr[Status.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Status.FAILED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            a = iArr;
            int[] iArr2 = new int[hg50.a.values().length];
            try {
                iArr2[0] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                hg50.a aVar = hg50.a.a;
                iArr2[1] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                hg50.a aVar2 = hg50.a.a;
                iArr2[2] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                hg50.a aVar3 = hg50.a.a;
                iArr2[3] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            int[] iArr3 = new int[jg50.b.values().length];
            try {
                iArr3[0] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                jg50.b bVar = jg50.b.a;
                iArr3[1] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                jg50.b bVar2 = jg50.b.a;
                iArr3[2] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            int[] iArr4 = new int[a.values().length];
            try {
                iArr4[2] = 1;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                a aVar4 = a.a;
                iArr4[1] = 2;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                a aVar5 = a.a;
                iArr4[0] = 3;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    /* JADX INFO: loaded from: classes8.dex */
    public static final class c implements lfy, paj {
        public final /* synthetic */ Function1 a;

        public c(Function1 function1) {
            this.a = function1;
        }

        @Override // defpackage.paj
        public final haj<?> c() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof lfy) && (obj instanceof paj)) {
                return Intrinsics.g(c(), ((paj) obj).c());
            }
            return false;
        }

        public final int hashCode() {
            return c().hashCode();
        }

        @Override // defpackage.lfy
        public final /* synthetic */ void u1(Object obj) {
            this.a.invoke(obj);
        }
    }

    public fd90(qub0 qub0Var, a6c0 a6c0Var, ln1 ln1Var, k6c0 k6c0Var, ibs ibsVar) {
        ig50 ig50Var = new ig50();
        ln1Var.getClass();
        k6c0Var.getClass();
        ibsVar.getClass();
        this.a = qub0Var;
        this.b = a6c0Var;
        this.c = ln1Var;
        this.d = k6c0Var;
        this.e = ibsVar;
        this.f = ig50Var;
        this.h = new ynj(null, 3);
    }

    public static final void i(gd90 gd90Var) {
        if (gd90Var instanceof gd90.a) {
            OverUnderComponent overUnderComponent = ((gd90.a) gd90Var).a;
            overUnderComponent.getBinding().v0.setVisibility(8);
            overUnderComponent.getBinding().Z0.setVisibility(8);
        } else if (gd90Var instanceof gd90.b) {
            ((gd90.b) gd90Var).a.getBinding().z.setVisibility(8);
        } else {
            uhc.a();
        }
    }

    public static a j(ul2 ul2Var) {
        BetContainerState betContainerState = (BetContainerState) ul2Var.a.getValue();
        if (!betContainerState.getBetPlaced()) {
            return a.a;
        }
        MultiplierResponse multiplierResponse = (MultiplierResponse) ((x5a0) ul2Var.b).getValue();
        if (Intrinsics.g(((HashMap) ((x5a0) ul2Var.d).getValue()).get(Long.valueOf(betContainerState.getRoundId())), Boolean.TRUE)) {
            return a.a;
        }
        if (Intrinsics.g(multiplierResponse.getMessageType(), "ROUND_END_WAIT") && multiplierResponse.getRoundId() == betContainerState.getRoundId()) {
            return a.a;
        }
        Double dR = r(multiplierResponse.getCurrentMultiplier());
        return (Intrinsics.g(multiplierResponse.getMessageType(), "ROUND_ONGOING") && multiplierResponse.getRoundId() == betContainerState.getRoundId() && (dR != null ? dR.doubleValue() : 0.0d) > 1.0d) ? a.c : a.b;
    }

    public static Double k(CharSequence charSequence) {
        String string;
        String string2 = (charSequence == null || (string = charSequence.toString()) == null) ? null : StringsKt.t0(StringsKt.c0(string, "x")).toString();
        if (string2 == null) {
            string2 = "";
        }
        if (string2.length() == 0) {
            return null;
        }
        return kotlin.text.b.h(string2);
    }

    public static Double r(String str) {
        String string;
        if (str != null && (string = StringsKt.t0(str).toString()) != null) {
            if (string.length() <= 0) {
                string = null;
            }
            if (string != null) {
                return kotlin.text.b.h(string);
            }
        }
        return null;
    }

    public final void a(TextView textView, gd90 gd90Var, gd90 gd90Var2) {
        int i;
        a aVarL = l(gd90Var);
        a aVarL2 = l(gd90Var2);
        List listK = kotlin.collections.b.k(aVarL, aVarL2);
        if (listK == null || !listK.isEmpty()) {
            Iterator it = listK.iterator();
            i = 0;
            while (it.hasNext()) {
                if (((a) it.next()) != a.a && (i = i + 1) < 0) {
                    kotlin.collections.b.p();
                    throw null;
                }
            }
        } else {
            i = 0;
        }
        if (i == 0) {
            textView.setVisibility(8);
            return;
        }
        textView.setText(String.valueOf(i));
        a aVar = a.c;
        textView.setEnabled((aVarL == aVar || aVarL2 == aVar) ? false : true);
        textView.setVisibility(0);
    }

    public final void b(hd90 hd90Var, TopBets topBets) {
        boolean z = topBets.getBetIndex() == 1;
        gd90 gd90VarE = hd90Var.e(z);
        gd90 gd90VarE2 = hd90Var.e(!z);
        gd90VarE.G(topBets.getRoundId());
        gd90VarE.v(topBets.getStakeAmount());
        gd90VarE.w(topBets.getBetId());
        gd90VarE.A(true);
        gd90VarE.y();
        gd90VarE.z();
        gd90VarE.x();
        gd90VarE.B(false);
        gd90VarE.I();
        gd90VarE.s(topBets.getStakeAmount());
        gd90VarE.r(topBets);
        gd90VarE.f();
        gd90VarE.e(0.5f, false);
        gd90VarE.H(topBets.getStakeAmount());
        Double giftAmount = topBets.getGiftAmount();
        boolean z2 = giftAmount != null;
        if (giftAmount != null) {
            gd90VarE.p(giftAmount.doubleValue());
            gd90VarE.D(new GiftItem(giftAmount.doubleValue(), "", "", "", 0.0d, 0L, 0, null, null, 384, null), giftAmount.doubleValue());
            gd90VarE2.q();
            gd90VarE.E(topBets.getRoundId());
            m();
            gd90VarE.t();
        } else {
            gd90VarE.q();
        }
        gd90VarE.J(topBets);
        if (z2) {
            m();
        }
        m();
        if (z2 || n()) {
            this.a.E0();
        }
        MultiplierResponse multiplierResponse = this.q;
        if (multiplierResponse != null) {
            g(hd90Var, z, multiplierResponse);
        }
        v();
        u();
    }

    public final void c(hd90 hd90Var, TopBets topBets) {
        DetailResponse detailResponseA;
        String currency;
        goj.b cVar;
        boolean z = topBets.getBetIndex() == 1;
        gd90 gd90VarE = hd90Var.e(z);
        gd90VarE.B(true);
        gd90VarE.A(false);
        gd90VarE.y();
        gd90VarE.C();
        gd90VarE.u();
        gd90VarE.g();
        gd90VarE.f();
        gd90VarE.e(1.0f, true);
        Double giftAmount = topBets.getGiftAmount();
        qub0 qub0Var = this.a;
        if (giftAmount != null && !Intrinsics.c(giftAmount, 0.0d)) {
            m();
            if (n()) {
                qub0Var.E0();
            } else {
                qub0Var.J0();
            }
        } else if (n()) {
            m();
            qub0Var.E0();
        }
        if (topBets.getGiftAmount() != null) {
            gd90VarE.H(gd90VarE.h());
            qub0Var.f1().x1();
            gd90VarE.q();
        }
        gd90VarE.s(gd90VarE.h());
        v();
        u();
        boolean z2 = hd90Var instanceof hd90.a;
        if (z2) {
            detailResponseA = v580.a(this.g, v580.a.OverUnder, z);
        } else {
            if (!(hd90Var instanceof hd90.b)) {
                uhc.a();
                return;
            }
            detailResponseA = v580.a(this.g, v580.a.Range, z);
        }
        if (detailResponseA == null || (currency = detailResponseA.getCurrency()) == null) {
            currency = qub0Var.y0;
        }
        String str = currency;
        double maxPayoutAmount = detailResponseA != null ? detailResponseA.getMaxPayoutAmount() : Double.MAX_VALUE;
        if (z2) {
            String betType = topBets.getBetType();
            Double targetCoefficient = topBets.getTargetCoefficient();
            cVar = new goj.b.C0606b(betType, targetCoefficient != null ? targetCoefficient.doubleValue() : 0.0d);
        } else {
            if (!(hd90Var instanceof hd90.b)) {
                uhc.a();
                return;
            }
            Double startCoefficient = topBets.getStartCoefficient();
            double dDoubleValue = startCoefficient != null ? startCoefficient.doubleValue() : 0.0d;
            Double endCoefficient = topBets.getEndCoefficient();
            cVar = new goj.b.c(dDoubleValue, endCoefficient != null ? endCoefficient.doubleValue() : 0.0d);
        }
        goj.b bVar = cVar;
        str.getClass();
        ghb ghbVar = new ghb(qub0Var, topBets, str, maxPayoutAmount, bVar, null);
        nas nasVarA = ebs.a(qub0Var.getLifecycle());
        pfd pfdVar = fse.a;
        ej5.c(nasVarA, gku.a, null, new igb(qub0Var, ghbVar, null), 2);
    }

    public final void d(ImageView imageView, boolean z, gd90 gd90Var) {
        if (!z) {
            imageView.setVisibility(8);
            return;
        }
        int iOrdinal = l(gd90Var).ordinal();
        if (iOrdinal == 0) {
            imageView.setVisibility(8);
            return;
        }
        if (iOrdinal == 1) {
            imageView.setEnabled(true);
            imageView.setVisibility(0);
        } else if (iOrdinal != 2) {
            uhc.a();
        } else {
            imageView.setEnabled(false);
            imageView.setVisibility(0);
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void e() {
        List<SideBetConfigsList> sideBetConfigs;
        su80 binding;
        su80 binding2;
        Object next;
        Object next2;
        Object next3;
        a6c0 a6c0Var = this.b;
        final SHOverBetComponent sHOverBetComponent = a6c0Var.k;
        final SHRangeComponent sHRangeComponent = a6c0Var.l;
        int i = 2;
        int i2 = 0;
        SideBetConfigsList sideBetConfigsList = null;
        Object obj = null;
        sideBetConfigsList = null;
        int i3 = 1;
        if (!this.n && sHOverBetComponent != null && sHRangeComponent != null) {
            final OverUnderComponent overUnderComponent = sHOverBetComponent.getBinding().b;
            final OverUnderComponent overUnderComponent2 = sHOverBetComponent.getBinding().c;
            overUnderComponent.getBinding().c0.setVisibility(8);
            overUnderComponent2.getBinding().c0.setVisibility(8);
            overUnderComponent.setOnBetChipSelectedListener(new Function1() { // from class: cd90
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    OverUnderComponent overUnderComponent3 = overUnderComponent;
                    overUnderComponent3.j();
                    overUnderComponent2.j();
                    overUnderComponent3.q(iIntValue);
                    return Unit.a;
                }
            });
            overUnderComponent2.setOnBetChipSelectedListener(new Function1() { // from class: zb90
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    overUnderComponent.j();
                    OverUnderComponent overUnderComponent3 = overUnderComponent2;
                    overUnderComponent3.j();
                    overUnderComponent3.q(iIntValue);
                    return Unit.a;
                }
            });
            overUnderComponent.setFbgClickListener(new Function1() { // from class: ac90
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    ((Boolean) obj2).getClass();
                    fd90 fd90Var = this.a;
                    DetailResponse detailResponseA = v580.a(fd90Var.g, v580.a.OverUnder, true);
                    if (detailResponseA == null) {
                        return Unit.a;
                    }
                    final OverUnderComponent overUnderComponent3 = overUnderComponent;
                    fd90Var.q(detailResponseA, new Function2() { // from class: jc90
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj3, Object obj4) {
                            GiftItem giftItem = (GiftItem) obj3;
                            double dDoubleValue = ((Double) obj4).doubleValue();
                            giftItem.getClass();
                            overUnderComponent3.setFBG(giftItem, false, dDoubleValue);
                            return Unit.a;
                        }
                    });
                    return Unit.a;
                }
            });
            overUnderComponent2.setFbgClickListener(new Function1() { // from class: bc90
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    ((Boolean) obj2).getClass();
                    fd90 fd90Var = this.a;
                    DetailResponse detailResponseA = v580.a(fd90Var.g, v580.a.OverUnder, false);
                    if (detailResponseA == null) {
                        return Unit.a;
                    }
                    final OverUnderComponent overUnderComponent3 = overUnderComponent2;
                    fd90Var.q(detailResponseA, new Function2() { // from class: kc90
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj3, Object obj4) {
                            GiftItem giftItem = (GiftItem) obj3;
                            double dDoubleValue = ((Double) obj4).doubleValue();
                            giftItem.getClass();
                            overUnderComponent3.setFBG(giftItem, false, dDoubleValue);
                            return Unit.a;
                        }
                    });
                    return Unit.a;
                }
            });
            overUnderComponent.setFBGRemoveListener(new a7n(this, i3));
            overUnderComponent2.setFBGRemoveListener(new Function0() { // from class: cc90
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    fd90 fd90Var = this.a;
                    fd90Var.m();
                    boolean zN = fd90Var.n();
                    qub0 qub0Var = fd90Var.a;
                    if (zN) {
                        qub0Var.E0();
                    } else {
                        qub0Var.J0();
                    }
                    return Unit.a;
                }
            });
            overUnderComponent.setBetStepListener(new dc90());
            overUnderComponent2.setBetStepListener(new ec90());
            final RangeComponent rangeComponent = sHRangeComponent.getBinding().c;
            final RangeComponent rangeComponent2 = sHRangeComponent.getBinding().d;
            rangeComponent.setOnBetChipSelectedListener(new Function1() { // from class: fc90
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    RangeComponent rangeComponent3 = rangeComponent;
                    rangeComponent3.o();
                    rangeComponent2.o();
                    rangeComponent3.w(iIntValue);
                    return Unit.a;
                }
            });
            rangeComponent2.setOnBetChipSelectedListener(new Function1() { // from class: gc90
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    rangeComponent.o();
                    RangeComponent rangeComponent3 = rangeComponent2;
                    rangeComponent3.o();
                    rangeComponent3.w(iIntValue);
                    return Unit.a;
                }
            });
            rangeComponent.setFbgClickListener(new Function1() { // from class: dd90
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    ((Boolean) obj2).getClass();
                    fd90 fd90Var = this.a;
                    DetailResponse detailResponseA = v580.a(fd90Var.g, v580.a.Range, true);
                    if (detailResponseA == null) {
                        return Unit.a;
                    }
                    fd90Var.q(detailResponseA, new k3d(rangeComponent));
                    return Unit.a;
                }
            });
            rangeComponent2.setFbgClickListener(new Function1() { // from class: ed90
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    ((Boolean) obj2).getClass();
                    fd90 fd90Var = this.a;
                    DetailResponse detailResponseA = v580.a(fd90Var.g, v580.a.Range, false);
                    if (detailResponseA == null) {
                        return Unit.a;
                    }
                    final RangeComponent rangeComponent3 = rangeComponent2;
                    fd90Var.q(detailResponseA, new Function2() { // from class: ic90
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj3, Object obj4) {
                            GiftItem giftItem = (GiftItem) obj3;
                            double dDoubleValue = ((Double) obj4).doubleValue();
                            giftItem.getClass();
                            rangeComponent3.setFBG(giftItem, false, dDoubleValue);
                            return Unit.a;
                        }
                    });
                    return Unit.a;
                }
            });
            rangeComponent.setFBGRemoveListener(new x1d(this, i));
            rangeComponent2.setFBGRemoveListener(new ow00(this, i));
            rangeComponent.setBetStepListener(new xb90(i2));
            rangeComponent2.setBetStepListener(new yb90());
            ConstraintLayout constraintLayout = sHOverBetComponent.getBinding().e.B;
            ViewGroup.LayoutParams layoutParams = constraintLayout.getLayoutParams();
            ConstraintLayout.LayoutParams layoutParams2 = layoutParams instanceof ConstraintLayout.LayoutParams ? (ConstraintLayout.LayoutParams) layoutParams : null;
            if (layoutParams2 != null) {
                layoutParams2.S = 0.111f;
                constraintLayout.setLayoutParams(layoutParams2);
            }
            Context context = sHOverBetComponent.getContext();
            int color = context.getColor(Intrinsics.g(((x5a0) gci0.h).getValue(), Boolean.TRUE) ? R.color.color_F0C461 : R.color.sh_bet_text_enable_color);
            int color2 = context.getColor(R.color.sh_bet_text_disable_color);
            final hw80 hw80Var = sHOverBetComponent.getBinding().e;
            ConstraintLayout constraintLayout2 = hw80Var.d;
            ConstraintLayout constraintLayout3 = hw80Var.i;
            constraintLayout2.setEnabled(false);
            constraintLayout3.setEnabled(true);
            hw80Var.b.setTextColor(color);
            hw80Var.e.setTextColor(color2);
            gr60.a(constraintLayout2, new Function1() { // from class: vc90
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    ((View) obj2).getClass();
                    hw80 hw80Var2 = hw80Var;
                    hw80Var2.d.setEnabled(false);
                    hw80Var2.i.setEnabled(true);
                    int i4 = SHOverBetComponent.G;
                    boolean zG = Intrinsics.g(((x5a0) gci0.h).getValue(), Boolean.TRUE);
                    SHOverBetComponent sHOverBetComponent2 = sHOverBetComponent;
                    sHOverBetComponent2.E(zG);
                    sHOverBetComponent2.getBinding().c.setVisibility(8);
                    sHOverBetComponent2.getBinding().b.setVisibility(0);
                    sHOverBetComponent2.getBinding().b.c();
                    fd90 fd90Var = this;
                    fd90Var.b.c();
                    fd90Var.v();
                    return Unit.a;
                }
            });
            gr60.a(constraintLayout3, new Function1() { // from class: wc90
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    ((View) obj2).getClass();
                    hw80 hw80Var2 = hw80Var;
                    hw80Var2.d.setEnabled(true);
                    hw80Var2.i.setEnabled(false);
                    int i4 = SHOverBetComponent.G;
                    boolean zG = Intrinsics.g(((x5a0) gci0.h).getValue(), Boolean.TRUE);
                    SHOverBetComponent sHOverBetComponent2 = sHOverBetComponent;
                    sHOverBetComponent2.E(zG);
                    sHOverBetComponent2.getBinding().b.setVisibility(8);
                    sHOverBetComponent2.getBinding().c.setVisibility(0);
                    sHOverBetComponent2.getBinding().c.c();
                    fd90 fd90Var = this;
                    fd90Var.b.c();
                    fd90Var.v();
                    return Unit.a;
                }
            });
            final hw80 hw80Var2 = sHRangeComponent.getBinding().e;
            ConstraintLayout constraintLayout4 = hw80Var2.d;
            ConstraintLayout constraintLayout5 = hw80Var2.i;
            constraintLayout4.setEnabled(false);
            constraintLayout5.setEnabled(true);
            hw80Var2.b.setTextColor(color);
            hw80Var2.e.setTextColor(color2);
            gr60.a(constraintLayout4, new Function1() { // from class: xc90
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    ((View) obj2).getClass();
                    hw80 hw80Var3 = hw80Var2;
                    hw80Var3.d.setEnabled(false);
                    hw80Var3.i.setEnabled(true);
                    int i4 = SHRangeComponent.G;
                    boolean zG = Intrinsics.g(((x5a0) gci0.h).getValue(), Boolean.TRUE);
                    SHRangeComponent sHRangeComponent2 = sHRangeComponent;
                    sHRangeComponent2.E(zG);
                    sHRangeComponent2.getBinding().d.setVisibility(8);
                    sHRangeComponent2.getBinding().c.setVisibility(0);
                    sHRangeComponent2.getBinding().c.c();
                    fd90 fd90Var = this;
                    fd90Var.b.c();
                    fd90Var.v();
                    return Unit.a;
                }
            });
            gr60.a(constraintLayout5, new Function1() { // from class: yc90
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    ((View) obj2).getClass();
                    hw80 hw80Var3 = hw80Var2;
                    hw80Var3.d.setEnabled(true);
                    hw80Var3.i.setEnabled(false);
                    int i4 = SHRangeComponent.G;
                    boolean zG = Intrinsics.g(((x5a0) gci0.h).getValue(), Boolean.TRUE);
                    SHRangeComponent sHRangeComponent2 = sHRangeComponent;
                    sHRangeComponent2.E(zG);
                    sHRangeComponent2.getBinding().c.setVisibility(8);
                    sHRangeComponent2.getBinding().d.setVisibility(0);
                    sHRangeComponent2.getBinding().d.c();
                    fd90 fd90Var = this;
                    fd90Var.b.c();
                    fd90Var.v();
                    return Unit.a;
                }
            });
            SharedPreferences sharedPreferences = this.a.H;
            if (sharedPreferences != null) {
                final OverUnderComponent overUnderComponent3 = sHOverBetComponent.getBinding().b;
                final OverUnderComponent overUnderComponent4 = sHOverBetComponent.getBinding().c;
                final RangeComponent rangeComponent3 = sHRangeComponent.getBinding().c;
                final RangeComponent rangeComponent4 = sHRangeComponent.getBinding().d;
                overUnderComponent3.setBetListener(sharedPreferences, new gaj() { // from class: lc90
                    @Override // defpackage.gaj
                    public final Object invoke(Object obj2, Object obj3, Object obj4) {
                        String str = (String) obj2;
                        double dDoubleValue = ((Double) obj3).doubleValue();
                        String str2 = (String) obj4;
                        str.getClass();
                        str2.getClass();
                        this.a.s(overUnderComponent3, true, str, dDoubleValue, str2);
                        return Unit.a;
                    }
                }, new Function0() { // from class: pc90
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Boolean.valueOf(this.a.a.z1());
                    }
                }, new Function0() { // from class: qc90
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        this.a.a.V1();
                        return Unit.a;
                    }
                });
                overUnderComponent3.setOnMaxPayoutExceededClick(new uew(this, i3));
                overUnderComponent4.setBetListener(sharedPreferences, new gaj() { // from class: rc90
                    @Override // defpackage.gaj
                    public final Object invoke(Object obj2, Object obj3, Object obj4) {
                        String str = (String) obj2;
                        double dDoubleValue = ((Double) obj3).doubleValue();
                        String str2 = (String) obj4;
                        str.getClass();
                        str2.getClass();
                        this.a.s(overUnderComponent4, false, str, dDoubleValue, str2);
                        return Unit.a;
                    }
                }, new lv40(this, i3), new k9n(this, i));
                overUnderComponent4.setOnMaxPayoutExceededClick(new Function0() { // from class: tc90
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        this.a.a.v4(false);
                        return Unit.a;
                    }
                });
                rangeComponent3.setBetListener(sharedPreferences, new iaj() { // from class: uc90
                    @Override // defpackage.iaj
                    public final Object d(Object obj2, Object obj3, Object obj4, Object obj5) {
                        String str = (String) obj2;
                        double dDoubleValue = ((Double) obj3).doubleValue();
                        double dDoubleValue2 = ((Double) obj4).doubleValue();
                        String str2 = (String) obj5;
                        str.getClass();
                        str2.getClass();
                        this.a.t(rangeComponent3, true, str, dDoubleValue, dDoubleValue2, str2);
                        return Unit.a;
                    }
                }, new pv40(this, i3), new Function0() { // from class: mc90
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        this.a.a.V1();
                        return Unit.a;
                    }
                });
                rangeComponent3.setOnMaxPayoutExceededClick(new gv40(this, i3));
                rangeComponent4.setBetListener(sharedPreferences, new iaj() { // from class: oc90
                    @Override // defpackage.iaj
                    public final Object d(Object obj2, Object obj3, Object obj4, Object obj5) {
                        String str = (String) obj2;
                        double dDoubleValue = ((Double) obj3).doubleValue();
                        double dDoubleValue2 = ((Double) obj4).doubleValue();
                        String str2 = (String) obj5;
                        str.getClass();
                        str2.getClass();
                        this.a.t(rangeComponent4, false, str, dDoubleValue, dDoubleValue2, str2);
                        return Unit.a;
                    }
                }, new rew(this, i3), new sew(this, i));
                rangeComponent4.setOnMaxPayoutExceededClick(new tew(this, i));
            }
            this.n = true;
        }
        DetailResponseData detailResponseData = this.g;
        if (detailResponseData != null) {
            List<DetailResponse> gameDetails = detailResponseData.getGameDetails();
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : gameDetails) {
                if (Intrinsics.g(((DetailResponse) obj2).getBetCategoryEnum(), "OVER_UNDER")) {
                    arrayList.add(obj2);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj3 : gameDetails) {
                if (Intrinsics.g(((DetailResponse) obj3).getBetCategoryEnum(), "RANGE")) {
                    arrayList2.add(obj3);
                }
            }
            Boolean bool = this.j;
            boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
            if (sHOverBetComponent != null && arrayList.size() >= 2) {
                sHOverBetComponent.getBinding().b.setFbgAvailable(zBooleanValue);
                sHOverBetComponent.getBinding().c.setFbgAvailable(zBooleanValue);
                sHOverBetComponent.getBinding().b.setBetModel((DetailResponse) arrayList.get(0), true);
                sHOverBetComponent.getBinding().c.setBetModel((DetailResponse) arrayList.get(1), false);
                sHOverBetComponent.getBinding().b.setMinThreshold(detailResponseData.getOuMinFBGUsageThreshold());
                sHOverBetComponent.getBinding().c.setMinThreshold(detailResponseData.getOuMinFBGUsageThreshold());
                Iterator<T> it = detailResponseData.getSideBetConfigs().iterator();
                do {
                    if (!it.hasNext()) {
                        next3 = null;
                        break;
                    }
                    next3 = it.next();
                } while (!Intrinsics.g(((SideBetConfigsList) next3).getSideBetType(), "OVER_UNDER"));
                SideBetConfigsList sideBetConfigsList2 = (SideBetConfigsList) next3;
                if (sideBetConfigsList2 != null) {
                    sHOverBetComponent.getBinding().b.setCoeffModel(sideBetConfigsList2, detailResponseData.getOuMinFBGUsageThreshold());
                    sHOverBetComponent.getBinding().c.setCoeffModel(sideBetConfigsList2, detailResponseData.getOuMinFBGUsageThreshold());
                }
            }
            if (sHRangeComponent != null && arrayList2.size() >= 2) {
                sHRangeComponent.getBinding().c.setFbgAvailable(zBooleanValue);
                sHRangeComponent.getBinding().d.setFbgAvailable(zBooleanValue);
                sHRangeComponent.getBinding().c.setBetModel((DetailResponse) arrayList2.get(0), true);
                sHRangeComponent.getBinding().d.setBetModel((DetailResponse) arrayList2.get(1), false);
                sHRangeComponent.getBinding().c.setMinThreshold(detailResponseData.getRangeMinFBGUsageThreshold());
                sHRangeComponent.getBinding().d.setMinThreshold(detailResponseData.getRangeMinFBGUsageThreshold());
                Iterator<T> it2 = detailResponseData.getSideBetConfigs().iterator();
                do {
                    if (!it2.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it2.next();
                } while (!Intrinsics.g(((SideBetConfigsList) next).getSideBetType(), "RANGE_LEFT"));
                SideBetConfigsList sideBetConfigsList3 = (SideBetConfigsList) next;
                Iterator<T> it3 = detailResponseData.getSideBetConfigs().iterator();
                do {
                    if (!it3.hasNext()) {
                        next2 = null;
                        break;
                    }
                    next2 = it3.next();
                } while (!Intrinsics.g(((SideBetConfigsList) next2).getSideBetType(), "RANGE_RIGHT"));
                SideBetConfigsList sideBetConfigsList4 = (SideBetConfigsList) next2;
                if (sideBetConfigsList3 != null && sideBetConfigsList4 != null) {
                    sHRangeComponent.getBinding().c.setCoeffModel(sideBetConfigsList3, sideBetConfigsList4, detailResponseData.getRangeMinFBGUsageThreshold());
                    sHRangeComponent.getBinding().d.setCoeffModel(sideBetConfigsList3, sideBetConfigsList4, detailResponseData.getRangeMinFBGUsageThreshold());
                }
            }
        }
        HashMap<Double, Double> map = this.i;
        if (map != null) {
            if (sHOverBetComponent != null && (binding2 = sHOverBetComponent.getBinding()) != null) {
                binding2.b.setUnderFetchDetail(new HashMap<>(map));
            }
            if (sHOverBetComponent != null && (binding = sHOverBetComponent.getBinding()) != null) {
                binding.c.setUnderFetchDetail(new HashMap<>(map));
            }
            DetailResponseData detailResponseData2 = this.g;
            if (detailResponseData2 != null && (sideBetConfigs = detailResponseData2.getSideBetConfigs()) != null) {
                for (Object obj4 : sideBetConfigs) {
                    if (Intrinsics.g(((SideBetConfigsList) obj4).getSideBetType(), "OVER_UNDER")) {
                        obj = obj4;
                        break;
                    }
                }
                sideBetConfigsList = (SideBetConfigsList) obj;
            }
            if (sideBetConfigsList != null && sHOverBetComponent != null) {
                sHOverBetComponent.getBinding().b.setCoeffModel(sideBetConfigsList, detailResponseData2.getOuMinFBGUsageThreshold());
                sHOverBetComponent.getBinding().c.setCoeffModel(sideBetConfigsList, detailResponseData2.getOuMinFBGUsageThreshold());
            }
        }
        m();
    }

    public final void f() {
        qv80 binding;
        qv80 binding2;
        su80 binding3;
        su80 binding4;
        qv80 binding5;
        qv80 binding6;
        su80 binding7;
        su80 binding8;
        boolean z = this.h.e;
        a6c0 a6c0Var = this.b;
        SHOverBetComponent sHOverBetComponent = a6c0Var.k;
        SHRangeComponent sHRangeComponent = a6c0Var.l;
        if (sHOverBetComponent != null) {
            sHOverBetComponent.setBetContainerBgWcTheme(z);
        }
        if (sHRangeComponent != null) {
            sHRangeComponent.setBetContainerBgWcTheme(z);
        }
        if (z) {
            String lowerCase = e6a.a().toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            if (lowerCase.equals("br") || lowerCase.equals("int") || lowerCase.equals("mx") || lowerCase.equals("za") || lowerCase.equals("gh")) {
                if (sHOverBetComponent != null) {
                    sHOverBetComponent.binding.e.v.setVisibility(0);
                }
                if (sHOverBetComponent != null && (binding8 = sHOverBetComponent.getBinding()) != null) {
                    binding8.b.h(true);
                }
                if (sHOverBetComponent != null) {
                    sHOverBetComponent.binding.e.w.setVisibility(0);
                }
                if (sHOverBetComponent != null && (binding7 = sHOverBetComponent.getBinding()) != null) {
                    binding7.c.h(true);
                }
                if (sHRangeComponent != null) {
                    sHRangeComponent.binding.e.v.setVisibility(0);
                }
                if (sHRangeComponent != null && (binding6 = sHRangeComponent.getBinding()) != null) {
                    binding6.c.k(true);
                }
                if (sHRangeComponent != null) {
                    sHRangeComponent.binding.e.w.setVisibility(0);
                }
                if (sHRangeComponent == null || (binding5 = sHRangeComponent.getBinding()) == null) {
                    return;
                }
                binding5.d.k(true);
                return;
            }
        }
        if (sHOverBetComponent != null) {
            sHOverBetComponent.binding.e.v.setVisibility(8);
            sHOverBetComponent.binding.e.w.setVisibility(8);
        }
        if (sHOverBetComponent != null && (binding4 = sHOverBetComponent.getBinding()) != null) {
            binding4.b.h(false);
        }
        if (sHOverBetComponent != null && (binding3 = sHOverBetComponent.getBinding()) != null) {
            binding3.c.h(false);
        }
        if (sHRangeComponent != null) {
            sHRangeComponent.binding.e.v.setVisibility(8);
            sHRangeComponent.binding.e.w.setVisibility(8);
        }
        if (sHRangeComponent != null && (binding2 = sHRangeComponent.getBinding()) != null) {
            binding2.c.k(false);
        }
        if (sHRangeComponent == null || (binding = sHRangeComponent.getBinding()) == null) {
            return;
        }
        binding.d.k(false);
    }

    public final void g(hd90 hd90Var, boolean z, MultiplierResponse multiplierResponse) {
        hg50.a aVar;
        gd90 gd90VarE = hd90Var.e(z);
        gd90 gd90VarE2 = hd90Var.e(!z);
        hw80 hw80VarD = hd90Var.d();
        ImageView imageView = z ? hw80VarD.c : hw80VarD.f;
        ConstraintLayout constraintLayout = z ? hw80VarD.d : hw80VarD.i;
        boolean zK = gd90VarE.k();
        boolean zJ = gd90VarE.j();
        boolean zO = gd90VarE.o();
        boolean zL = gd90VarE.l();
        long jN = gd90VarE.n();
        if (zO) {
            aVar = hg50.a.a;
        } else {
            boolean z2 = (zK || zJ || zO) ? false : true;
            boolean z3 = multiplierResponse != null && Intrinsics.g(multiplierResponse.getMessageType(), "ROUND_END_WAIT") && zK && multiplierResponse.getRoundId() == jN;
            if (z2 || z3) {
                aVar = hg50.a.b;
            } else {
                aVar = (zK && multiplierResponse != null && Intrinsics.g(multiplierResponse.getMessageType(), "ROUND_ONGOING") && multiplierResponse.getRoundId() == jN && !zL) ? hg50.a.c : hg50.a.d;
            }
        }
        int iOrdinal = aVar.ordinal();
        if (iOrdinal == 0) {
            gd90VarE.a();
            return;
        }
        if (iOrdinal == 1) {
            gd90VarE.c();
            imageView.setVisibility(8);
            return;
        }
        if (iOrdinal == 2) {
            gd90VarE.b();
            if (constraintLayout.isEnabled()) {
                imageView.setEnabled(false);
                imageView.setVisibility(0);
            }
            hd90Var.c().setEnabled(false);
            return;
        }
        if (iOrdinal != 3) {
            uhc.a();
            return;
        }
        gd90VarE.d();
        if (constraintLayout.isEnabled()) {
            imageView.setEnabled(true);
            imageView.setVisibility(0);
        }
        hd90Var.c().setEnabled(!gd90VarE2.i());
    }

    public final void h() {
        int i = 0;
        ArrayList arrayListV = ay0.v(new hd90[]{this.o, this.p});
        int size = arrayListV.size();
        while (i < size) {
            Object obj = arrayListV.get(i);
            i++;
            hd90 hd90Var = (hd90) obj;
            i(hd90Var.a());
            i(hd90Var.b());
        }
    }

    public final a l(gd90 gd90Var) {
        MultiplierResponse multiplierResponse = this.q;
        if (Intrinsics.g(multiplierResponse != null ? multiplierResponse.getMessageType() : null, "ROUND_END_WAIT") && multiplierResponse.getRoundId() == gd90Var.n()) {
            return a.a;
        }
        if (gd90Var.i()) {
            return a.c;
        }
        if (gd90Var.j()) {
            return a.b;
        }
        if (gd90Var.k()) {
            if (Intrinsics.g(multiplierResponse != null ? multiplierResponse.getMessageType() : null, "ROUND_ONGOING") && multiplierResponse.getRoundId() == gd90Var.n()) {
                return a.c;
            }
        }
        return gd90Var.k() ? a.b : a.a;
    }

    public final void m() {
        boolean zG = Intrinsics.g(this.j, Boolean.TRUE);
        hd90.a aVar = this.o;
        int i = 0;
        if (!zG) {
            gd90.a aVar2 = aVar != null ? aVar.c : null;
            gd90.a aVar3 = aVar != null ? aVar.d : null;
            hd90.b bVar = this.p;
            ArrayList arrayListV = ay0.v(new gd90[]{aVar2, aVar3, bVar != null ? bVar.c : null, bVar != null ? bVar.d : null});
            int size = arrayListV.size();
            while (i < size) {
                Object obj = arrayListV.get(i);
                i++;
                ((gd90) obj).F(8);
            }
            return;
        }
        gd90.a aVar4 = aVar != null ? aVar.c : null;
        gd90.a aVar5 = aVar != null ? aVar.d : null;
        hd90.b bVar2 = this.p;
        ArrayList arrayListV2 = ay0.v(new gd90[]{aVar4, aVar5, bVar2 != null ? bVar2.c : null, bVar2 != null ? bVar2.d : null});
        int size2 = arrayListV2.size();
        int i2 = 0;
        while (i2 < size2) {
            Object obj2 = arrayListV2.get(i2);
            i2++;
            gd90 gd90Var = (gd90) obj2;
            gd90Var.F((gd90Var.k() || gd90Var.m() > 0 || n()) ? 0 : 8);
        }
    }

    public final boolean n() {
        gd90.b bVar;
        gd90.b bVar2;
        gd90.a aVar;
        gd90.a aVar2;
        List<GiftItem> list = this.k;
        if (list == null || list.isEmpty()) {
            return false;
        }
        qub0 qub0Var = this.a;
        if (egb.a((BetContainerState) qub0Var.R0().a.getValue()) > 0 || egb.a((BetContainerState) qub0Var.S0().a.getValue()) > 0) {
            return true;
        }
        hd90.a aVar3 = this.o;
        GiftItem giftItem = null;
        if (((aVar3 == null || (aVar2 = aVar3.c) == null) ? null : aVar2.a.getGiftItem()) != null) {
            return true;
        }
        hd90.a aVar4 = this.o;
        if (((aVar4 == null || (aVar = aVar4.d) == null) ? null : aVar.a.getGiftItem()) != null) {
            return true;
        }
        hd90.b bVar3 = this.p;
        if (((bVar3 == null || (bVar2 = bVar3.c) == null) ? null : bVar2.a.getGiftItem()) != null) {
            return true;
        }
        hd90.b bVar4 = this.p;
        if (bVar4 != null && (bVar = bVar4.d) != null) {
            giftItem = bVar.a.getGiftItem();
        }
        return giftItem != null;
    }

    public final void o(MultiplierResponse multiplierResponse, gd90.a aVar) {
        OverUnderComponent overUnderComponent = aVar.a;
        Double dK = k(overUnderComponent.getBinding().T0.getText());
        if (dK != null) {
            double dDoubleValue = dK.doubleValue();
            Double dR = r(multiplierResponse.getCurrentMultiplier());
            if (dR != null) {
                double dDoubleValue2 = dR.doubleValue();
                if (Intrinsics.g(overUnderComponent.getBetType(), "OVER") && ((Intrinsics.g(multiplierResponse.getMessageType(), "ROUND_ONGOING") || Intrinsics.g(multiplierResponse.getMessageType(), "ROUND_END_WAIT")) && multiplierResponse.getRoundId() == overUnderComponent.getRoundId() && !overUnderComponent.getCashoutInProgress() && !overUnderComponent.getCashoutDone() && dDoubleValue2 > dDoubleValue)) {
                    w(overUnderComponent, overUnderComponent.getBinding().T0.getText().toString().substring(0, overUnderComponent.getBinding().T0.getText().length() - 1));
                }
                if (Intrinsics.g(overUnderComponent.getBetType(), "UNDER") && multiplierResponse.getRoundId() == overUnderComponent.getRoundId() && Intrinsics.g(multiplierResponse.getMessageType(), "ROUND_END_WAIT") && !overUnderComponent.getCashoutInProgress() && !overUnderComponent.getCashoutDone() && dDoubleValue2 < dDoubleValue) {
                    String currentMultiplier = multiplierResponse.getCurrentMultiplier();
                    if (currentMultiplier == null) {
                        return;
                    } else {
                        w(overUnderComponent, currentMultiplier);
                    }
                }
                if (Intrinsics.g(overUnderComponent.getBetType(), "UNDER") && multiplierResponse.getRoundId() == overUnderComponent.getRoundId()) {
                    if ((Intrinsics.g(multiplierResponse.getMessageType(), "ROUND_ONGOING") || Intrinsics.g(multiplierResponse.getMessageType(), "ROUND_END_WAIT")) && !overUnderComponent.getCashoutInProgress() && !overUnderComponent.getCashoutDone() && dDoubleValue2 >= dDoubleValue && overUnderComponent.getBetId() > 0 && overUnderComponent.getRoundId() > 0 && overUnderComponent.getRoundId() == multiplierResponse.getRoundId()) {
                        overUnderComponent.getBinding().s0.setVisibility(0);
                    }
                }
            }
        }
    }

    public final void p(MultiplierResponse multiplierResponse, gd90.b bVar) {
        RangeComponent rangeComponent = bVar.a;
        Double dK = k(rangeComponent.getBinding().J0.getText());
        if (dK != null) {
            double dDoubleValue = dK.doubleValue();
            Double dK2 = k(rangeComponent.getBinding().G0.getText());
            if (dK2 != null) {
                double dDoubleValue2 = dK2.doubleValue();
                Double dR = r(multiplierResponse.getCurrentMultiplier());
                if (dR != null) {
                    double dDoubleValue3 = dR.doubleValue();
                    if (Intrinsics.g(multiplierResponse.getMessageType(), "ROUND_END_WAIT") && multiplierResponse.getRoundId() == rangeComponent.getRoundId() && !rangeComponent.getCashoutInProgress() && !rangeComponent.getCashoutDone() && dDoubleValue3 >= dDoubleValue && dDoubleValue3 <= dDoubleValue2 && dDoubleValue3 >= dDoubleValue && dDoubleValue3 <= dDoubleValue2 && rangeComponent.getBetId() > 0 && rangeComponent.getRoundId() > 0 && rangeComponent.getRoundId() == multiplierResponse.getRoundId()) {
                        String currentMultiplier = multiplierResponse.getCurrentMultiplier();
                        if (currentMultiplier == null) {
                            return;
                        }
                        String strJ = new eal().j(new CashOutOverUnderRequest(rangeComponent.getBetId(), rangeComponent.getRoundId(), currentMultiplier, String.valueOf(System.currentTimeMillis())));
                        loa0 loa0VarK1 = this.a.k1();
                        loa0VarK1.getClass();
                        if (loa0VarK1.D1()) {
                            loa0VarK1.F1();
                        } else {
                            usm usmVar = loa0VarK1.b;
                            brb brbVar = brb.D;
                            usm.g(usmVar, brbVar, tzm.a(loa0VarK1.c, brbVar, null, 6), strJ);
                        }
                        rangeComponent.setCashoutInProgress(true);
                    }
                    if (multiplierResponse.getRoundId() == rangeComponent.getRoundId()) {
                        if ((Intrinsics.g(multiplierResponse.getMessageType(), "ROUND_ONGOING") || Intrinsics.g(multiplierResponse.getMessageType(), "ROUND_END_WAIT")) && !rangeComponent.getCashoutInProgress() && !rangeComponent.getCashoutDone() && dDoubleValue3 > dDoubleValue2 && rangeComponent.getBetId() > 0 && rangeComponent.getRoundId() > 0 && rangeComponent.getRoundId() == multiplierResponse.getRoundId()) {
                            rangeComponent.getBinding().r0.setVisibility(0);
                        }
                    }
                }
            }
        }
    }

    public final void q(final DetailResponse detailResponse, final Function2<? super GiftItem, ? super Double, Unit> function2) {
        List<GiftItem> list;
        e activity = this.a.getActivity();
        if (activity == null || (list = this.k) == null || list.isEmpty() || n() || this.m) {
            return;
        }
        xi60 xi60Var = this.l;
        int i = 1;
        if (xi60Var == null || !xi60Var.isAdded()) {
            this.m = true;
            final xi60 xi60Var2 = this.l;
            if (xi60Var2 == null) {
                xi60Var2 = new xi60();
                this.l = xi60Var2;
            }
            final ArrayList arrayList = new ArrayList(list);
            FragmentManager supportFragmentManager = activity.getSupportFragmentManager();
            supportFragmentManager.getClass();
            xi60Var2.q0(supportFragmentManager, new Function0() { // from class: zc90
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    DetailResponse detailResponse2 = detailResponse;
                    xi60Var2.r0(arrayList, detailResponse2.getMaxAmount(), detailResponse2.getMinAmount(), 0.0d);
                    return Unit.a;
                }
            }, new gaj() { // from class: ad90
                @Override // defpackage.gaj
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    GiftItem giftItem = (GiftItem) obj;
                    Double d = (Double) obj2;
                    d.getClass();
                    ((Boolean) obj3).getClass();
                    giftItem.getClass();
                    fd90 fd90Var = this.a;
                    fd90Var.m = false;
                    function2.invoke(giftItem, d);
                    fd90Var.m();
                    fd90Var.a.E0();
                    xi60 xi60Var3 = fd90Var.l;
                    if (xi60Var3 != null) {
                        xi60Var3.dismiss();
                    }
                    fd90Var.l = null;
                    return Unit.a;
                }
            }, new d6i(this, i));
        }
    }

    public final void s(OverUnderComponent overUnderComponent, boolean z, String str, double d, String str2) {
        fi10.a c0565a;
        DetailResponse detailResponseA = v580.a(this.g, v580.a.OverUnder, z);
        if (detailResponseA == null) {
            return;
        }
        boolean betPlaced = overUnderComponent.getBetPlaced();
        boolean betInProgress = overUnderComponent.getBetInProgress();
        GiftItem giftItem = overUnderComponent.getGiftItem();
        String giftId = giftItem != null ? giftItem.getGiftId() : null;
        Double giftAmount = overUnderComponent.getGiftAmount();
        qub0 qub0Var = this.a;
        long j = qub0Var.z0;
        GPSData gPSData = qub0Var.U0;
        boolean z2 = qub0Var.h2;
        if (betPlaced || betInProgress) {
            c0565a = fi10.a.b.a;
        } else {
            c0565a = new fi10.a.C0565a(new PlaceOverUnderBetRequest(str, str2, detailResponseA.getBetIndex(), detailResponseA.getCurrency(), j, giftId, giftAmount, Double.valueOf(d), z2, gPSData, giftId != null ? Boolean.TRUE : null));
        }
        if (c0565a instanceof fi10.a.C0565a) {
            String strJ = new eal().j(((fi10.a.C0565a) c0565a).a);
            loa0 loa0VarK1 = qub0Var.k1();
            loa0VarK1.getClass();
            if (loa0VarK1.D1()) {
                loa0VarK1.F1();
            } else {
                usm usmVar = loa0VarK1.b;
                brb brbVar = brb.A;
                usmVar.h(brbVar, tzm.a(loa0VarK1.c, brbVar, null, 6), strJ, loa0VarK1.a.c());
            }
            overUnderComponent.setBetInProgress(true);
        }
    }

    public final void t(RangeComponent rangeComponent, boolean z, String str, double d, double d2, String str2) {
        DetailResponse detailResponseA = v580.a(this.g, v580.a.Range, z);
        if (detailResponseA == null) {
            return;
        }
        boolean betPlaced = rangeComponent.getBetPlaced();
        boolean betInProgress = rangeComponent.getBetInProgress();
        GiftItem giftItem = rangeComponent.getGiftItem();
        String giftId = giftItem != null ? giftItem.getGiftId() : null;
        Double giftAmount = rangeComponent.getGiftAmount();
        qub0 qub0Var = this.a;
        Object c0596a = (betPlaced || betInProgress) ? gi10.a.b.a : new gi10.a.C0596a(new PlaceRangeBetRequest(str, str2, detailResponseA.getBetIndex(), detailResponseA.getCurrency(), qub0Var.z0, giftId, giftAmount, Double.valueOf(d), Double.valueOf(d2), qub0Var.h2, qub0Var.U0));
        if (c0596a instanceof gi10.a.C0596a) {
            String strJ = new eal().j(((gi10.a.C0596a) c0596a).a);
            loa0 loa0VarK1 = qub0Var.k1();
            loa0VarK1.getClass();
            if (loa0VarK1.D1()) {
                loa0VarK1.F1();
            } else {
                usm usmVar = loa0VarK1.b;
                brb brbVar = brb.B;
                usmVar.h(brbVar, tzm.a(loa0VarK1.c, brbVar, null, 6), strJ, loa0VarK1.a.c());
            }
            rangeComponent.setBetInProgress(true);
        }
    }

    public final void u() {
        rs80 binding;
        int i;
        a6c0 a6c0Var = this.b;
        b6c0 b6c0Var = (b6c0) ((x5a0) a6c0Var.h).getValue();
        SideBetTabContainer sideBetTabContainer = a6c0Var.j;
        if (sideBetTabContainer != null && (binding = sideBetTabContainer.getBinding()) != null) {
            TextView textView = binding.c;
            if (b6c0Var == b6c0.a) {
                textView.setVisibility(8);
            } else {
                qub0 qub0Var = this.a;
                a aVarJ = j(qub0Var.R0());
                a aVarJ2 = j(qub0Var.S0());
                List listK = kotlin.collections.b.k(aVarJ, aVarJ2);
                if (listK == null || !listK.isEmpty()) {
                    Iterator it = listK.iterator();
                    i = 0;
                    while (it.hasNext()) {
                        if (((a) it.next()) != a.a && (i = i + 1) < 0) {
                            kotlin.collections.b.p();
                            throw null;
                        }
                    }
                } else {
                    i = 0;
                }
                if (i == 0) {
                    textView.setVisibility(8);
                } else {
                    textView.setText(String.valueOf(i));
                    a aVar = a.c;
                    textView.setEnabled((aVarJ == aVar || aVarJ2 == aVar) ? false : true);
                    textView.setVisibility(0);
                }
            }
        }
        hd90.a aVar2 = this.o;
        if (aVar2 != null) {
            b6c0 b6c0Var2 = b6c0.b;
            TextView textView2 = aVar2.a;
            if (b6c0Var == b6c0Var2) {
                textView2.setVisibility(8);
            } else {
                a(textView2, aVar2.c, aVar2.d);
            }
        }
        hd90.b bVar = this.p;
        if (bVar != null) {
            b6c0 b6c0Var3 = b6c0.c;
            TextView textView3 = bVar.a;
            if (b6c0Var == b6c0Var3) {
                textView3.setVisibility(8);
            } else {
                a(textView3, bVar.c, bVar.d);
            }
        }
    }

    public final void v() {
        int i = 0;
        ArrayList arrayListV = ay0.v(new hd90[]{this.o, this.p});
        int size = arrayListV.size();
        while (i < size) {
            Object obj = arrayListV.get(i);
            i++;
            hd90 hd90Var = (hd90) obj;
            hw80 hw80VarD = hd90Var.d();
            boolean zIsEnabled = hw80VarD.d.isEnabled();
            boolean zIsEnabled2 = hw80VarD.i.isEnabled();
            d(hw80VarD.c, zIsEnabled, hd90Var.a());
            d(hw80VarD.f, zIsEnabled2, hd90Var.b());
        }
    }

    public final void w(OverUnderComponent overUnderComponent, String str) {
        if (overUnderComponent.getBetId() <= 0 || overUnderComponent.getRoundId() <= 0) {
            return;
        }
        String strJ = new eal().j(new CashOutOverUnderRequest(overUnderComponent.getBetId(), overUnderComponent.getRoundId(), str, String.valueOf(System.currentTimeMillis())));
        loa0 loa0VarK1 = this.a.k1();
        loa0VarK1.getClass();
        if (loa0VarK1.D1()) {
            loa0VarK1.F1();
        } else {
            usm usmVar = loa0VarK1.b;
            brb brbVar = brb.C;
            usm.g(usmVar, brbVar, tzm.a(loa0VarK1.c, brbVar, null, 6), strJ);
        }
        overUnderComponent.setCashoutInProgress(true);
    }
}
