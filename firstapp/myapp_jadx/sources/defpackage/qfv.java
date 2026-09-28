package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.core.model.patron.KYCReminder;
import com.sporty.android.core.model.patron.NameConfirmationStatus;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final class qfv {
    public final mgb0 a;
    public final cym b;
    public final psm c;
    public final fhb0 d;
    public final het e;
    public final k650 f;
    public final ib90 g;
    public final lyz h;
    public final yi5 i;
    public final rev j;
    public final bd40 k;
    public final rdd0 l;
    public final wwd0 m;
    public final wwd0 n;
    public final wwd0 o;

    public static final class a {
        public final aev.a.c a;
        public final boolean b;
        public final boolean c;

        public a(aev.a.c cVar, boolean z, boolean z2) {
            this.a = cVar;
            this.b = z;
            this.c = z2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a.equals(aVar.a) && this.b == aVar.b && this.c == aVar.c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.c) + mtg0.a(this.a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("KycRowState(trailingContent=");
            sb.append(this.a);
            sb.append(", showRedWarningDot=");
            sb.append(this.b);
            sb.append(", showArrow=");
            return mq0.a(sb, this.c, ")");
        }
    }

    public static final class b implements lyh<a> {
        public final /* synthetic */ sl50 a;
        public final /* synthetic */ qfv b;

        @c0d(c = "com.sportybet.feature.profile.me.providers.MeScreenRowsProvider$refreshKycReminder$$inlined$map$1", f = "MeScreenRowsProvider.kt", l = {109}, m = "collect", v = 2)
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
                return b.this.collect(null, this);
            }
        }

        /* JADX INFO: renamed from: qfv$b$b, reason: collision with other inner class name */
        public static final class C1012b<T> implements myh {
            public final /* synthetic */ myh a;

            /* JADX INFO: renamed from: qfv$b$b$a */
            @c0d(c = "com.sportybet.feature.profile.me.providers.MeScreenRowsProvider$refreshKycReminder$$inlined$map$1$2", f = "MeScreenRowsProvider.kt", l = {50}, m = "emit", v = 2)
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
                    return C1012b.this.emit(null, this);
                }
            }

            public C1012b(myh myhVar, qfv qfvVar) {
                this.a = myhVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0017  */
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
                a aVar2 = null;
                if (i2 == 0) {
                    uj50.b(obj2);
                    lk50 lk50Var = (lk50) obj;
                    if (!(lk50Var instanceof lk50.a) && !(lk50Var instanceof lk50.b)) {
                        lk50.c cVar = lk50Var instanceof lk50.c ? (lk50.c) lk50Var : null;
                        if (cVar != null) {
                            KYCReminder kYCReminder = (KYCReminder) cVar.a;
                            if (kYCReminder.getUserLevel() == 0) {
                                StringUiText stringUiText = vch0.a;
                                aVar2 = new a(new aev.a.c(new ResourceUiText(R.string.wap_me__identity_verification_unverified), null, null, null, null, null, Integer.valueOf(R.color.text_type2_primary), "unverified", new umz(8.0f, 8.0f, 8.0f, 8.0f), new g7f(2.0f), 1018), false, false);
                            } else {
                                Object[] objArr = {String.valueOf(kYCReminder.getUserLevel())};
                                StringUiText stringUiText2 = vch0.a;
                                aVar2 = new a(new aev.a.c(new ResourceUiText(R.string.identity_verification__tier_vtier, ay0.S(objArr)), Integer.valueOf(R.style.B1_M), null, null, null, null, Integer.valueOf(R.color.brand_quaternary), null, null, null, 15356), kYCReminder.getShowWarning() || kYCReminder.getReminder() != KYCReminder.Reminder.FIRST_USE, true);
                            }
                        }
                    }
                    aVar.b = 1;
                    if (this.a.emit(aVar2, aVar) == y5bVar) {
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

        public b(sl50 sl50Var, qfv qfvVar) {
            this.a = sl50Var;
            this.b = qfvVar;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // defpackage.lyh
        public final Object collect(myh<? super a> myhVar, v1b v1bVar) {
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
            if (i2 == 0) {
                uj50.b(obj);
                C1012b c1012b = new C1012b(myhVar, this.b);
                aVar.b = 1;
                if (this.a.collect(c1012b, aVar) == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i2 != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            return Unit.a;
        }
    }

    @c0d(c = "com.sportybet.feature.profile.me.providers.MeScreenRowsProvider", f = "MeScreenRowsProvider.kt", l = {244, 247}, m = "refreshKycReminder", v = 2)
    public static final class c extends x1b {
        public wwd0 a;
        public qfv b;
        public /* synthetic */ Object c;
        public final /* synthetic */ qfv d;
        public int e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(v1b v1bVar, qfv qfvVar) {
            super(v1bVar);
            this.d = qfvVar;
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            this.c = obj;
            this.e |= Integer.MIN_VALUE;
            return this.d.d(this);
        }
    }

    public static final /* synthetic */ class d extends saj implements Function1<v1b<? super Unit>, Object> {
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(v1b<? super Unit> v1bVar) {
            return ((qfv) this.receiver).d(v1bVar);
        }
    }

    public qfv(mgb0 mgb0Var, cym cymVar, psm psmVar, fhb0 fhb0Var, het hetVar, k650 k650Var, ib90 ib90Var, lyz lyzVar, yi5 yi5Var, rev revVar, bd40 bd40Var, rdd0 rdd0Var) {
        mgb0Var.getClass();
        cymVar.getClass();
        psmVar.getClass();
        k650Var.getClass();
        lyzVar.getClass();
        yi5Var.getClass();
        bd40Var.getClass();
        rdd0Var.getClass();
        this.a = mgb0Var;
        this.b = cymVar;
        this.c = psmVar;
        this.d = fhb0Var;
        this.e = hetVar;
        this.f = k650Var;
        this.g = ib90Var;
        this.h = lyzVar;
        this.i = yi5Var;
        this.j = revVar;
        this.k = bd40Var;
        this.l = rdd0Var;
        this.m = xwd0.a(null);
        this.n = xwd0.a(null);
        this.o = xwd0.a(null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(x1b x1bVar) {
        tfv tfvVar;
        wwd0 wwd0Var;
        dq40 dq40Var;
        if (x1bVar instanceof tfv) {
            tfvVar = (tfv) x1bVar;
            int i = tfvVar.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                tfvVar.e = i - Integer.MIN_VALUE;
            } else {
                tfvVar = new tfv(this, x1bVar);
            }
        } else {
            tfvVar = new tfv(this, x1bVar);
        }
        Object obj = tfvVar.c;
        y5b y5bVar = y5b.a;
        int i2 = tfvVar.e;
        if (i2 == 0) {
            dq40 dq40VarA = j6w.a(obj);
            sfv sfvVar = new sfv(bm50.f(this.j.a()), this, dq40VarA);
            tfvVar.a = dq40VarA;
            wwd0Var = this.n;
            tfvVar.b = wwd0Var;
            tfvVar.e = 1;
            Object objC = s0i.c(sfvVar, tfvVar);
            if (objC == y5bVar) {
                return y5bVar;
            }
            dq40Var = dq40VarA;
            obj = objC;
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            wwd0Var = tfvVar.b;
            dq40Var = tfvVar.a;
            uj50.b(obj);
        }
        wwd0Var.setValue(obj);
        return dq40Var.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(x1b x1bVar) {
        vfv vfvVar;
        wwd0 wwd0Var;
        if (x1bVar instanceof vfv) {
            vfvVar = (vfv) x1bVar;
            int i = vfvVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                vfvVar.d = i - Integer.MIN_VALUE;
            } else {
                vfvVar = new vfv(this, x1bVar);
            }
        } else {
            vfvVar = new vfv(this, x1bVar);
        }
        Object obj = vfvVar.b;
        y5b y5bVar = y5b.a;
        int i2 = vfvVar.d;
        aev aevVar = null;
        if (i2 == 0) {
            uj50.b(obj);
            wwd0 wwd0Var2 = this.o;
            vfvVar.a = wwd0Var2;
            vfvVar.d = 1;
            Object objA = this.k.a(vfvVar);
            if (objA == y5bVar) {
                return y5bVar;
            }
            wwd0Var = wwd0Var2;
            obj = objA;
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            wwd0Var = vfvVar.a;
            uj50.b(obj);
        }
        if (!((ad40) obj).a) {
            obj = null;
        }
        ad40 ad40Var = (ad40) obj;
        if (ad40Var != null) {
            this.l.a(kf40.e.a, k00.d);
            aev.b bVar = aev.b.RECAP;
            Integer num = new Integer(R.drawable.ic_sportyrecap);
            StringUiText stringUiText = vch0.a;
            aevVar = new aev(bVar, num, new ResourceUiText(R.string.wap_me__recap_entrance_text), ad40Var.c, null, false, false, null, 1008);
        }
        wwd0Var.setValue(aevVar);
        return Unit.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(x1b x1bVar) {
        wfv wfvVar;
        lyh lyhVar;
        wwd0 wwd0Var;
        if (x1bVar instanceof wfv) {
            wfvVar = (wfv) x1bVar;
            int i = wfvVar.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                wfvVar.e = i - Integer.MIN_VALUE;
            } else {
                wfvVar = new wfv(this, x1bVar);
            }
        } else {
            wfvVar = new wfv(this, x1bVar);
        }
        Object obj = wfvVar.c;
        Object obj2 = y5b.a;
        int i2 = wfvVar.e;
        if (i2 == 0) {
            uj50.b(obj);
            zed.h hVarA = this.b.a();
            wwd0 wwd0Var2 = this.m;
            wfvVar.a = wwd0Var2;
            wfvVar.b = hVarA;
            wfvVar.e = 1;
            if (d(wfvVar) == obj2) {
                return obj2;
            }
            lyhVar = hVarA;
            wwd0Var = wwd0Var2;
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            lyhVar = wfvVar.b;
            wwd0Var = wfvVar.a;
            uj50.b(obj);
        }
        return r1i.b(lyhVar, wwd0Var, this.n, this.o, new xfv(null, this));
    }

    /* JADX WARN: Code duplicated, block: B:105:0x021d  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object d(v1b<? super Unit> v1bVar) {
        c cVar;
        wwd0 wwd0Var;
        wwd0 wwd0Var2;
        qfv qfvVar;
        a aVar;
        lk50 lk50Var;
        NameConfirmationStatus nameConfirmationStatus;
        if (v1bVar instanceof c) {
            cVar = (c) v1bVar;
            int i = cVar.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                cVar.e = i - Integer.MIN_VALUE;
            } else {
                cVar = new c(v1bVar, this);
            }
        } else {
            cVar = new c(v1bVar, this);
        }
        Object objC = cVar.c;
        y5b y5bVar = y5b.a;
        int i2 = cVar.e;
        aev aevVar = null;
        if (i2 == 0) {
            uj50.b(objC);
            psm psmVar = this.c;
            boolean zM = psmVar.m();
            wwd0Var = this.m;
            if (zM) {
                boolean zR = psmVar.r();
                lyz lyzVar = this.h;
                if (zR || psmVar.v() || psmVar.z()) {
                    b bVar = new b(new sl50(bm50.b(lyzVar.D0(), vch0.b)), this);
                    cVar.a = wwd0Var;
                    cVar.e = 1;
                    objC = s0i.c(bVar, cVar);
                    if (objC != y5bVar) {
                        wwd0Var2 = wwd0Var;
                        aVar = (a) objC;
                        wwd0Var = wwd0Var2;
                    }
                } else if (psmVar.O()) {
                    lyh<lk50<NameConfirmationStatus>> lyhVarJ0 = lyzVar.j0(pu0.c.a);
                    cVar.a = wwd0Var;
                    cVar.b = this;
                    cVar.e = 2;
                    objC = bm50.p(lyhVarJ0, cVar);
                    if (objC != y5bVar) {
                        qfvVar = this;
                        wwd0Var2 = wwd0Var;
                        lk50Var = (lk50) objC;
                        qfvVar.getClass();
                        Integer numValueOf = Integer.valueOf(R.color.brand_quaternary);
                        Integer numValueOf2 = Integer.valueOf(R.style.B1_M);
                        Integer numValueOf3 = Integer.valueOf(R.color.text_type2_primary);
                        if (lk50Var instanceof lk50.a) {
                            aVar = null;
                        } else {
                            aVar = null;
                        }
                        wwd0Var = wwd0Var2;
                    }
                }
                return y5bVar;
            }
            aVar = null;
        } else if (i2 == 1) {
            wwd0Var2 = cVar.a;
            uj50.b(objC);
            aVar = (a) objC;
            wwd0Var = wwd0Var2;
        } else {
            if (i2 != 2) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            qfvVar = cVar.b;
            wwd0Var2 = cVar.a;
            uj50.b(objC);
            lk50Var = (lk50) objC;
            qfvVar.getClass();
            Integer numValueOf4 = Integer.valueOf(R.color.brand_quaternary);
            Integer numValueOf5 = Integer.valueOf(R.style.B1_M);
            Integer numValueOf6 = Integer.valueOf(R.color.text_type2_primary);
            if ((lk50Var instanceof lk50.a) || (lk50Var instanceof lk50.b)) {
                aVar = null;
            } else {
                lk50.c cVar2 = lk50Var instanceof lk50.c ? (lk50.c) lk50Var : null;
                Integer numValueOf7 = (cVar2 == null || (nameConfirmationStatus = (NameConfirmationStatus) cVar2.a) == null) ? null : Integer.valueOf(nameConfirmationStatus.status);
                if ((numValueOf7 != null && numValueOf7.intValue() == 350) || (numValueOf7 != null && numValueOf7.intValue() == 405)) {
                    aVar = null;
                } else if (numValueOf7 != null && numValueOf7.intValue() == 400) {
                    if (qfvVar.j.a.getSharedPreferences("sportybet", 0).getBoolean("PAYMENT_LIMIT_REACHED", false)) {
                        StringUiText stringUiText = vch0.a;
                        aVar = new a(new aev.a.c(new ResourceUiText(R.string.wap_me__identity_verification_unverified), null, null, null, null, null, numValueOf6, "unverified", new umz(8.0f, 8.0f, 8.0f, 8.0f), new g7f(2.0f), 1018), false, false);
                    } else {
                        StringUiText stringUiText2 = vch0.a;
                        aVar = new a(new aev.a.c(new ResourceUiText(R.string.wap_me__identity_verification_fica_verified), numValueOf5, null, null, null, null, numValueOf4, null, null, null, 15356), false, false);
                    }
                } else if ((numValueOf7 != null && numValueOf7.intValue() == 401) || (numValueOf7 != null && numValueOf7.intValue() == 409)) {
                    StringUiText stringUiText3 = vch0.a;
                    aVar = new a(new aev.a.c(new ResourceUiText(R.string.wap_me__identity_verification_unverified), null, null, null, null, null, numValueOf6, "unverified", new umz(8.0f, 8.0f, 8.0f, 8.0f), new g7f(2.0f), 1018), false, false);
                } else if (numValueOf7 != null && numValueOf7.intValue() == 408) {
                    StringUiText stringUiText4 = vch0.a;
                    aVar = new a(new aev.a.c(new ResourceUiText(R.string.wap_me__identity_verification_unverified), null, null, null, null, null, numValueOf6, "unverified", new umz(8.0f, 8.0f, 8.0f, 8.0f), new g7f(2.0f), 1018), true, false);
                } else if (numValueOf7 != null && numValueOf7.intValue() == 404) {
                    StringUiText stringUiText5 = vch0.a;
                    aVar = new a(new aev.a.c(new ResourceUiText(R.string.wap_me__identity_verification_unverified), null, null, null, null, null, numValueOf6, "unverified", new umz(8.0f, 8.0f, 8.0f, 8.0f), new g7f(2.0f), 1018), true, false);
                } else if ((numValueOf7 != null && numValueOf7.intValue() == 402) || ((numValueOf7 != null && numValueOf7.intValue() == 407) || (numValueOf7 != null && numValueOf7.intValue() == 410))) {
                    StringUiText stringUiText6 = vch0.a;
                    aVar = new a(new aev.a.c(new ResourceUiText(R.string.identity_verification__resubmit), numValueOf5, null, null, null, null, Integer.valueOf(R.color.brand_primary), null, null, null, 15356), true, true);
                } else if ((numValueOf7 != null && numValueOf7.intValue() == 403) || (numValueOf7 != null && numValueOf7.intValue() == 406)) {
                    StringUiText stringUiText7 = vch0.a;
                    aVar = new a(new aev.a.c(new ResourceUiText(R.string.identity_verification__under_review), numValueOf5, null, null, null, null, numValueOf4, null, null, null, 15356), true, true);
                } else {
                    aVar = null;
                }
            }
            wwd0Var = wwd0Var2;
        }
        if (aVar != null) {
            aev.b bVar2 = aev.b.IDENTITY_VERIFICATION;
            StringUiText stringUiText8 = vch0.a;
            ResourceUiText resourceUiText = new ResourceUiText(R.string.wap_me__identity_verification);
            aev.a.c cVar3 = aVar.a;
            boolean z = aVar.b;
            boolean z2 = aVar.c;
            d dVar = new d(1, this, qfv.class, "refreshKycReminder", "refreshKycReminder(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
            s9s.b bVar3 = s9s.b.a;
            aevVar = new aev(bVar2, new Integer(R.drawable.ic_me_id_verify), resourceUiText, false, cVar3, z, z2, dVar, 72);
        }
        wwd0Var.setValue(aevVar);
        return Unit.a;
    }
}
