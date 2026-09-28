package defpackage;

import com.sporty.android.common_ui.uitext.ConcatUiText;
import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.core.model.common.Range;
import com.sporty.android.core.model.pay.FeeAndTaxConfigs;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ldlp;", "Ldnj0;", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class dlp extends dnj0 {
    public final sr10 Q0;
    public final alp R0;
    public final v340 S0;
    public final ngs T0;
    public final wwd0 U0;
    public final wwd0 V0;
    public final mpe0 W0;

    @c0d(c = "com.sportybet.android.kepay.withdraw.KeWithdrawViewModel$entryDisplayOrderStateFlow$2$1", f = "KeWithdrawViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements gaj<FeeAndTaxConfigs, BigDecimal, v1b<? super List<? extends oag>>, Object> {
        public /* synthetic */ FeeAndTaxConfigs a;
        public /* synthetic */ BigDecimal b;
        public final /* synthetic */ psm c;
        public final /* synthetic */ dlp d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(psm psmVar, dlp dlpVar, v1b<? super a> v1bVar) {
            super(3, v1bVar);
            this.c = psmVar;
            this.d = dlpVar;
        }

        @Override // defpackage.gaj
        public final Object invoke(FeeAndTaxConfigs feeAndTaxConfigs, BigDecimal bigDecimal, v1b<? super List<? extends oag>> v1bVar) {
            a aVar = new a(this.c, this.d, v1bVar);
            aVar.a = feeAndTaxConfigs;
            aVar.b = bigDecimal;
            return aVar.invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code duplicated, block: B:34:0x0107 A[PHI: r16
          0x0107: PHI (r16v1 int) = (r16v0 int), (r16v3 int) binds: [B:39:0x0122, B:32:0x00db] A[DONT_GENERATE, DONT_INLINE]] */
        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            Object obj2;
            int i;
            oag oagVar;
            FeeAndTaxConfigs feeAndTaxConfigs = this.a;
            BigDecimal bigDecimal = this.b;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            if (feeAndTaxConfigs == null) {
                return m2g.a;
            }
            String strA = tug.a(" (", this.c.f(), ")");
            List<String> entryDisplayOrders = feeAndTaxConfigs.getEntryDisplayOrders();
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = entryDisplayOrders.iterator();
            while (true) {
                obj2 = null;
                if (!it.hasNext()) {
                    break;
                }
                String str = (String) it.next();
                pag.c.getClass();
                str.getClass();
                for (Object obj3 : pag.e) {
                    if (((pag) obj3).a.equalsIgnoreCase(str)) {
                        obj2 = obj3;
                        break;
                    }
                }
                pag pagVar = (pag) obj2;
                if (pagVar != null) {
                    arrayList.add(pagVar);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj4 = arrayList.get(i2);
                int i3 = i2 + 1;
                pag pagVar2 = (pag) obj4;
                int iOrdinal = pagVar2.ordinal();
                int i4 = pagVar2.b;
                dlp dlpVar = this.d;
                if (iOrdinal == 0) {
                    i = i3;
                    Long l = new Long(dlpVar.M1(bigDecimal, feeAndTaxConfigs.getWithdrawTaxRanges()));
                    if (l.longValue() <= 0) {
                        l = null;
                    }
                    if (l != null) {
                        long jLongValue = l.longValue();
                        StringUiText stringUiText = vch0.a;
                        oagVar = new oag("- " + p54.b(new BigDecimal(jLongValue)), jz4.a(new ResourceUiText(i4), strA), 1);
                    } else {
                        oagVar = null;
                    }
                } else if (iOrdinal == 1) {
                    i = i3;
                    Long l2 = new Long(dlpVar.M1(bigDecimal, feeAndTaxConfigs.getWithdrawFeeRanges()));
                    if (l2.longValue() <= 0) {
                        l2 = null;
                    }
                    if (l2 != null) {
                        long jLongValue2 = l2.longValue();
                        StringUiText stringUiText2 = vch0.a;
                        oagVar = new oag("- " + p54.b(new BigDecimal(jLongValue2)), jz4.a(new ResourceUiText(i4), strA), 1);
                    } else {
                        oagVar = null;
                    }
                } else {
                    if (iOrdinal != 2) {
                        uhc.a();
                        return obj2;
                    }
                    StringUiText stringUiText3 = vch0.a;
                    ConcatUiText concatUiTextA = jz4.a(new ResourceUiText(i4), strA);
                    String string = p54.b(new BigDecimal(bigDecimal.longValue() - dlpVar.M1(bigDecimal, feeAndTaxConfigs.getWithdrawTaxRanges()))).toString();
                    string.getClass();
                    oagVar = new oag(string, concatUiTextA, 1);
                    i = i3;
                }
                if (oagVar != null) {
                    arrayList2.add(oagVar);
                }
                i2 = i;
                obj2 = null;
            }
            return arrayList2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dlp(xqj0 xqj0Var, uyx uyxVar, juh0 juh0Var, vh7 vh7Var, d100 d100Var, wl wlVar, uy0 uy0Var, sr10 sr10Var, lyz lyzVar, final psm psmVar, mgb0 mgb0Var, shj0 shj0Var, phj0 phj0Var, rak rakVar, alp alpVar, c4k c4kVar, i390 i390Var) {
        super(uyxVar, juh0Var, vh7Var, rakVar, c4kVar, xqj0Var, d100Var, wlVar, uy0Var, sr10Var, lyzVar, psmVar, mgb0Var, shj0Var, phj0Var, i390Var);
        d100Var.getClass();
        wlVar.getClass();
        uy0Var.getClass();
        sr10Var.getClass();
        lyzVar.getClass();
        psmVar.getClass();
        mgb0Var.getClass();
        i390Var.getClass();
        this.Q0 = sr10Var;
        this.R0 = alpVar;
        pu0.b bVar = pu0.b.a;
        this.S0 = e1i.e(bm50.f(sr10Var.m0(bVar)), o8i0.d(this), q490.a.a, null);
        ngs ngsVarB = kotlin.collections.a.b();
        ngsVarB.addAll(this.N0);
        ngsVarB.add(sr10Var.m0(bVar));
        this.T0 = kotlin.collections.a.a(ngsVarB);
        wwd0 wwd0VarA = xwd0.a(BigDecimal.ZERO);
        this.U0 = wwd0VarA;
        this.V0 = wwd0VarA;
        this.W0 = hwr.b(new Function0() { // from class: clp
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                dlp dlpVar = this.a;
                return e1i.e(new n1i(dlpVar.S0, dlpVar.U0, new dlp.a(psmVar, dlpVar, null)), o8i0.d(dlpVar), q490.a.a, m2g.a);
            }
        });
    }

    @Override // defpackage.dnj0, defpackage.k72
    public final List<lyh<lk50<Object>>> A1() {
        return this.T0;
    }

    @Override // defpackage.dnj0, defpackage.k72
    public final List<c9p> E1() {
        ngs ngsVarB = kotlin.collections.a.b();
        ngsVarB.addAll(super.E1());
        ngsVarB.add(ej5.c(o8i0.d(this), null, null, new elp(this, null), 3));
        return kotlin.collections.a.a(ngsVarB);
    }

    public final long M1(BigDecimal bigDecimal, List<? extends Range> list) {
        BigDecimal.ZERO.getClass();
        return alp.a(this.R0, bigDecimal, list);
    }

    public final long N1() {
        List<Range> withdrawFeeRanges;
        BigDecimal bigDecimal = (BigDecimal) this.U0.getValue();
        FeeAndTaxConfigs feeAndTaxConfigs = (FeeAndTaxConfigs) this.S0.a.getValue();
        if (feeAndTaxConfigs == null || (withdrawFeeRanges = feeAndTaxConfigs.getWithdrawFeeRanges()) == null) {
            withdrawFeeRanges = m2g.a;
        }
        return M1(bigDecimal, withdrawFeeRanges);
    }

    public final long O1() {
        List<Range> withdrawTaxRanges;
        BigDecimal bigDecimal = (BigDecimal) this.U0.getValue();
        FeeAndTaxConfigs feeAndTaxConfigs = (FeeAndTaxConfigs) this.S0.a.getValue();
        if (feeAndTaxConfigs == null || (withdrawTaxRanges = feeAndTaxConfigs.getWithdrawTaxRanges()) == null) {
            withdrawTaxRanges = m2g.a;
        }
        return M1(bigDecimal, withdrawTaxRanges);
    }
}
