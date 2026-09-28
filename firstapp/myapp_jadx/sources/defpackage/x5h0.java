package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.core.model.cms.CMSResponse;
import com.sporty.android.core.model.service.CountryCodeName;
import com.sportybet.android.gp.tz.R;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lx5h0;", "Lj8i0;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class x5h0 extends j8i0 {
    public final wwd0 A;
    public final k1i B;
    public Long C;
    public final wwd0 D;
    public jvd0 E;
    public final wwd0 F;
    public final wwd0 G;
    public final k1i H;
    public final sr10 a;
    public final d100 b;
    public final wo5 c;
    public final b700 d;
    public final psm e;
    public final ku90<com.sporty.android.common.uievent.a> f;
    public final ku90 i;
    public final ku90<v5h0> v;
    public final ku90 w;
    public final v340 y;
    public final wwd0 z;

    @c0d(c = "com.sportybet.feature.payment.impl.transaction.presentation.viewmodel.TxFixStatusViewModel$confirmButtonUiState$2", f = "TxFixStatusViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements iaj<Integer, String, Boolean, v1b<? super c330>, Object> {
        public /* synthetic */ int a;
        public /* synthetic */ String b;
        public /* synthetic */ boolean c;

        @Override // defpackage.iaj
        public final Object d(Integer num, String str, Boolean bool, v1b<? super c330> v1bVar) {
            int iIntValue = num.intValue();
            boolean zBooleanValue = bool.booleanValue();
            a aVar = new a(4, v1bVar);
            aVar.a = iIntValue;
            aVar.b = str;
            aVar.c = zBooleanValue;
            return aVar.invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            ResourceUiText resourceUiText;
            int i = this.a;
            String str = this.b;
            boolean z = this.c;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            if (z) {
                return c330.b.a;
            }
            boolean z2 = false;
            boolean z3 = i > 0;
            boolean zU = StringsKt.U(str);
            if (!z3 && !zU) {
                z2 = true;
            }
            if (z3) {
                Object[] objArr = {String.valueOf(i)};
                StringUiText stringUiText = vch0.a;
                resourceUiText = new ResourceUiText(R.string.page_transaction__wait_vsecond, ay0.S(objArr));
            } else {
                StringUiText stringUiText2 = vch0.a;
                resourceUiText = new ResourceUiText(R.string.common_functions__confirm);
            }
            return new c330.a(resourceUiText, z2);
        }
    }

    @c0d(c = "com.sportybet.feature.payment.impl.transaction.presentation.viewmodel.TxFixStatusViewModel$fixStatusTipStatesFlow$1", f = "TxFixStatusViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class b extends tje0 implements iaj<Integer, List<? extends CMSResponse>, Boolean, v1b<? super List<? extends u5h0>>, Object> {
        public /* synthetic */ int a;
        public /* synthetic */ List b;
        public /* synthetic */ boolean c;

        public b(v1b<? super b> v1bVar) {
            super(4, v1bVar);
        }

        @Override // defpackage.iaj
        public final Object d(Integer num, List<? extends CMSResponse> list, Boolean bool, v1b<? super List<? extends u5h0>> v1bVar) {
            int iIntValue = num.intValue();
            boolean zBooleanValue = bool.booleanValue();
            b bVar = x5h0.this.new b(v1bVar);
            bVar.a = iIntValue;
            bVar.b = list;
            bVar.c = zBooleanValue;
            return bVar.invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code duplicated, block: B:14:0x0037  */
        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            String value;
            Object next;
            Object next2;
            int i = this.a;
            List list = this.b;
            boolean z = this.c;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            String value2 = null;
            if (list != null) {
                Iterator it = list.iterator();
                do {
                    if (!it.hasNext()) {
                        next2 = null;
                        break;
                    }
                    next2 = it.next();
                } while (!Intrinsics.g(((CMSResponse) next2).getKey(), "ussd_deposit_transaction_tip_image"));
                CMSResponse cMSResponse = (CMSResponse) next2;
                if (cMSResponse != null) {
                    value = cMSResponse.getValue();
                } else {
                    value = null;
                }
            } else {
                value = null;
            }
            if (list != null) {
                Iterator it2 = list.iterator();
                do {
                    if (!it2.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it2.next();
                } while (!Intrinsics.g(((CMSResponse) next).getKey(), "pending_transaction_tip_image"));
                CMSResponse cMSResponse2 = (CMSResponse) next;
                if (cMSResponse2 != null) {
                    value2 = cMSResponse2.getValue();
                }
            }
            if (!kotlin.collections.b.k(CountryCodeName.NIGERIA, CountryCodeName.GHANA, CountryCodeName.KENYA).contains(x5h0.this.e.getCountryCode())) {
                return kotlin.collections.a.c(x5h0.x1(false, true, value2, new Integer(i)));
            }
            StringUiText stringUiText = vch0.a;
            return kotlin.collections.b.k(new u5h0(new ResourceUiText(R.string.page_transaction__ussd_deposit_transaction), new ResourceUiText(R.string.page_transaction__ussd_deposit_transaction_tip), value, true, z), x5h0.x1(true, z, value2, new Integer(i)));
        }
    }

    public static final class c implements lyh<Boolean> {
        public final /* synthetic */ wwd0 a;

        @c0d(c = "com.sportybet.feature.payment.impl.transaction.presentation.viewmodel.TxFixStatusViewModel$special$$inlined$map$1", f = "TxFixStatusViewModel.kt", l = {109}, m = "collect", v = 2)
        public static final class a extends x1b {
            public /* synthetic */ Object a;
            public int b;

            public a(v1b v1bVar) {
                super(v1bVar);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                this.a = obj;
                this.b |= Integer.MIN_VALUE;
                return c.this.collect(null, this);
            }
        }

        public static final class b<T> implements myh {
            public final /* synthetic */ myh a;

            @c0d(c = "com.sportybet.feature.payment.impl.transaction.presentation.viewmodel.TxFixStatusViewModel$special$$inlined$map$1$2", f = "TxFixStatusViewModel.kt", l = {50}, m = "emit", v = 2)
            public static final class a extends x1b {
                public /* synthetic */ Object a;
                public int b;

                public a(v1b v1bVar) {
                    super(v1bVar);
                }

                @Override // defpackage.pz1
                public final Object invokeSuspend(Object obj) {
                    this.a = obj;
                    this.b |= Integer.MIN_VALUE;
                    return b.this.emit(null, this);
                }
            }

            public b(myh myhVar) {
                this.a = myhVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // defpackage.myh
            public final Object emit(Object obj, v1b v1bVar) {
                a aVar;
                if (v1bVar instanceof a) {
                    aVar = (a) v1bVar;
                    int i = aVar.b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        aVar.b = i - Integer.MIN_VALUE;
                    } else {
                        aVar = new a(v1bVar);
                    }
                } else {
                    aVar = new a(v1bVar);
                }
                Object obj2 = aVar.a;
                y5b y5bVar = y5b.a;
                int i2 = aVar.b;
                if (i2 == 0) {
                    uj50.b(obj2);
                    Boolean boolValueOf = Boolean.valueOf(Intrinsics.g((tzs) obj, tzs.b.a));
                    aVar.b = 1;
                    if (this.a.emit(boolValueOf, aVar) == y5bVar) {
                        return y5bVar;
                    }
                } else {
                    if (i2 != 1) {
                        ib5.a("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    uj50.b(obj2);
                }
                return Unit.a;
            }
        }

        public c(wwd0 wwd0Var) {
            this.a = wwd0Var;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // defpackage.lyh
        public final Object collect(myh<? super Boolean> myhVar, v1b v1bVar) throws Throwable {
            a aVar;
            if (v1bVar instanceof a) {
                aVar = (a) v1bVar;
                int i = aVar.b;
                if ((i & Integer.MIN_VALUE) != 0) {
                    aVar.b = i - Integer.MIN_VALUE;
                } else {
                    aVar = new a(v1bVar);
                }
            } else {
                aVar = new a(v1bVar);
            }
            Object obj = aVar.a;
            y5b y5bVar = y5b.a;
            int i2 = aVar.b;
            if (i2 != 0) {
                if (i2 == 1) {
                    uj50.b(obj);
                    return Unit.a;
                }
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
            b bVar = new b(myhVar);
            aVar.b = 1;
            this.a.collect(bVar, aVar);
            return y5bVar;
        }
    }

    public x5h0(sr10 sr10Var, d100 d100Var, wo5 wo5Var, b700 b700Var, psm psmVar) {
        sr10Var.getClass();
        d100Var.getClass();
        wo5Var.getClass();
        b700Var.getClass();
        psmVar.getClass();
        this.a = sr10Var;
        this.b = d100Var;
        this.c = wo5Var;
        this.d = b700Var;
        this.e = psmVar;
        ku90<com.sporty.android.common.uievent.a> ku90Var = new ku90<>();
        this.f = ku90Var;
        this.i = ku90Var;
        ku90<v5h0> ku90Var2 = new ku90<>();
        this.v = ku90Var2;
        this.w = ku90Var2;
        v340 v340VarE = e1i.e(d100Var.I(), o8i0.d(this), q490.a.a, 30);
        this.y = v340VarE;
        wwd0 wwd0VarA = xwd0.a(null);
        this.z = wwd0VarA;
        wwd0 wwd0VarA2 = xwd0.a(Boolean.TRUE);
        this.A = wwd0VarA2;
        this.B = r1i.a(v340VarE, wwd0VarA, wwd0VarA2, new b(null));
        wwd0 wwd0VarA3 = xwd0.a(0);
        this.D = wwd0VarA3;
        wwd0 wwd0VarA4 = xwd0.a("");
        this.F = wwd0VarA4;
        wwd0 wwd0VarA5 = xwd0.a(tzs.a.a);
        this.G = wwd0VarA5;
        this.H = r1i.a(wwd0VarA3, wwd0VarA4, new c(wwd0VarA5), new a(4, null));
    }

    public static u5h0 x1(boolean z, boolean z2, String str, Integer num) {
        StringUiText stringUiText = vch0.a;
        return new u5h0(new ResourceUiText(R.string.page_transaction__pending_transaction), new ResourceUiText(R.string.page_transaction__pending_transaction_tip_vsecond, ay0.S(new Object[]{String.valueOf(num.intValue())})), str, z, z2);
    }
}
