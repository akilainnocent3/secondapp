package defpackage;

import com.sporty.android.core.model.pocket.common.PayHintData;
import com.sporty.android.core.model.pocket.common.PaymentChannel;
import com.sportybet.android.account.RegistrationKYC$Result;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lzc8;", "Lj8i0;", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class zc8 extends j8i0 {
    public wc8 A;
    public String B;
    public String C;
    public PaymentChannel D;
    public PaymentChannel E;
    public final wwd0 F;
    public final wwd0 G;
    public jvd0 H;
    public final lq1 a;
    public final g77 b;
    public final yrd c;
    public final uy0 d;
    public final ssw<Map<String, PayHintData>> e;
    public final ssw<RegistrationKYC$Result> f;
    public final jlv<g9e> i;
    public final jlv v;
    public final ArrayList w;
    public final ssw<List<wc8>> y;
    public final ssw z;

    @c0d(c = "com.sportybet.android.ugpay.deposit.CommonDepositViewModel$refresh$1", f = "CommonDepositViewModel.kt", l = {110}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<lk50<? extends PayHintData.PayHintEntity>, v1b<? super Unit>, Object> {
        public int a;
        public /* synthetic */ Object b;

        public a(v1b<? super a> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            a aVar = zc8.this.new a(v1bVar);
            aVar.b = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(lk50<? extends PayHintData.PayHintEntity> lk50Var, v1b<? super Unit> v1bVar) {
            return ((a) create(lk50Var, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            List<PayHintData> list;
            zc8 zc8Var = zc8.this;
            ssw<Map<String, PayHintData>> sswVar = zc8Var.e;
            lk50 lk50Var = (lk50) this.b;
            y5b y5bVar = y5b.a;
            int i = this.a;
            boolean z = true;
            if (i == 0) {
                uj50.b(obj);
                if (lk50Var instanceof lk50.c) {
                    yrd yrdVar = zc8Var.c;
                    this.b = lk50Var;
                    this.a = 1;
                    if (yrdVar.b(this) == y5bVar) {
                        return y5bVar;
                    }
                } else if (lk50Var instanceof lk50.a) {
                    o2g o2gVar = o2g.a;
                    o2gVar.getClass();
                    sswVar.m(o2gVar);
                    zc8Var.H = null;
                }
                return Unit.a;
            }
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
            PayHintData.PayHintEntity payHintEntity = (PayHintData.PayHintEntity) ((lk50.c) lk50Var).a;
            if (payHintEntity != null && (list = payHintEntity.entityList) != null) {
                int iA = jpu.a(l48.r(list, 10));
                if (iA < 16) {
                    iA = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iA);
                for (Object obj2 : list) {
                    linkedHashMap.put(((PayHintData) obj2).methodId, obj2);
                }
                wc8 wc8Var = zc8Var.A;
                ArrayList arrayList = zc8Var.w;
                if (wc8Var != null) {
                    sswVar.m(linkedHashMap);
                    return Unit.a;
                }
                wc8 wc8Var2 = (wc8) CollectionsKt.firstOrNull(arrayList);
                wc8.b bVar = wc8.b.b;
                if (arrayList.contains(bVar)) {
                    String str = zc8Var.C;
                    if (str == null) {
                        Intrinsics.n("mobileMoneyMethodId");
                        throw null;
                    }
                    PayHintData payHintData = (PayHintData) linkedHashMap.get(str);
                    String str2 = payHintData != null ? payHintData.alert : null;
                    if (str2 != null && str2.length() != 0) {
                        z = false;
                    }
                    String str3 = zc8Var.B;
                    if (str3 == null) {
                        Intrinsics.n("paybillMethodId");
                        throw null;
                    }
                    PayHintData payHintData2 = (PayHintData) linkedHashMap.get(str3);
                    String str4 = payHintData2 != null ? payHintData2.alert : null;
                    if (str4 != null && str4.length() != 0 && z) {
                        wc8Var2 = bVar;
                    }
                }
                zc8Var.A = wc8Var2;
                sswVar.m(linkedHashMap);
            }
            zc8Var.H = null;
            return Unit.a;
        }
    }

    public static final class b implements lfy, paj {
        public final /* synthetic */ xc8 a;

        public b(xc8 xc8Var) {
            this.a = xc8Var;
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

    public zc8(lq1 lq1Var, g77 g77Var, yrd yrdVar, uy0 uy0Var) {
        lq1Var.getClass();
        g77Var.getClass();
        yrdVar.getClass();
        uy0Var.getClass();
        this.a = lq1Var;
        this.b = g77Var;
        this.c = yrdVar;
        this.d = uy0Var;
        ssw<Map<String, PayHintData>> sswVar = new ssw<>();
        this.e = sswVar;
        this.f = new ssw<>();
        jlv<g9e> jlvVar = new jlv<>();
        jlvVar.m(g9e.b.a);
        jlvVar.n(sswVar, new b(new xc8(this, 0)));
        this.i = jlvVar;
        this.v = jlvVar;
        this.w = new ArrayList();
        ssw<List<wc8>> sswVar2 = new ssw<>();
        this.y = sswVar2;
        this.z = sswVar2;
        wwd0 wwd0VarA = xwd0.a(lk50.b.a);
        this.F = wwd0VarA;
        this.G = wwd0VarA;
    }

    public final void x1(boolean z) {
        if (this.H != null) {
            return;
        }
        if (z) {
            this.i.m(g9e.b.a);
        }
        this.H = kzh.d(new g1i(qq1.g(this.a), new a(null)), o8i0.d(this));
    }

    public final void y1() {
        ej5.c(o8i0.d(this), null, null, new bd8(this, null), 3);
    }

    public final void z1(wc8 wc8Var) {
        PaymentChannel paymentChannel;
        t5e bVar;
        wc8Var.getClass();
        this.A = wc8Var;
        int iX = CollectionsKt.X(this.w, wc8Var);
        wc8 wc8Var2 = this.A;
        boolean zG = Intrinsics.g(wc8Var2, wc8.a.b);
        ssw<Map<String, PayHintData>> sswVar = this.e;
        t5e t5eVar = null;
        PayHintData payHintData = null;
        t5eVar = null;
        PayHintData payHintData2 = null;
        t5eVar = null;
        if (zG) {
            PaymentChannel paymentChannel2 = this.D;
            if (paymentChannel2 != null) {
                Map<String, PayHintData> mapD = sswVar.d();
                if (mapD != null) {
                    String str = this.C;
                    if (str == null) {
                        Intrinsics.n("mobileMoneyMethodId");
                        throw null;
                    }
                    payHintData = mapD.get(str);
                }
                bVar = new t5e.a(payHintData, paymentChannel2);
                t5eVar = bVar;
            }
        } else if (Intrinsics.g(wc8Var2, wc8.b.b) && (paymentChannel = this.E) != null) {
            Map<String, PayHintData> mapD2 = sswVar.d();
            if (mapD2 != null) {
                String str2 = this.B;
                if (str2 == null) {
                    Intrinsics.n("paybillMethodId");
                    throw null;
                }
                payHintData2 = mapD2.get(str2);
            }
            bVar = new t5e.b(payHintData2, paymentChannel);
            t5eVar = bVar;
        }
        if (t5eVar == null) {
            return;
        }
        this.i.m(new g9e.c(iX, wc8Var, t5eVar));
    }
}
