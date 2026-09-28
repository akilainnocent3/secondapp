package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.core.model.loyalty.MissionData;
import com.sporty.android.core.model.loyalty.MissionProgressDto;
import com.sporty.android.core.model.loyalty.MissionPublishState;
import com.sporty.android.core.model.loyalty.MissionStatus;
import com.sporty.android.core.model.loyalty.WorldCupPassInfoDto;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class z1k0 implements y1k0, lit, fjt {
    public final w1k0 a;
    public final uti b;
    public final psm c;
    public final j1b d;
    public final wwd0 e;
    public MissionData f;
    public final v340 i;

    @c0d(c = "com.sportybet.feature.loyalty.impl.worldcuppass.data.repository.WorldCupPassBannerStateProviderImpl$applyMissionData$1", f = "WorldCupPassBannerStateProviderImpl.kt", l = {95}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public wwd0 a;
        public int b;
        public final /* synthetic */ MissionData d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(MissionData missionData, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.d = missionData;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return z1k0.this.new a(this.d, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            wwd0 wwd0Var;
            y5b y5bVar = y5b.a;
            int i = this.b;
            if (i == 0) {
                uj50.b(obj);
                z1k0 z1k0Var = z1k0.this;
                wwd0 wwd0Var2 = z1k0Var.e;
                this.a = wwd0Var2;
                this.b = 1;
                obj = z1k0Var.d(this.d, this);
                if (obj == y5bVar) {
                    return y5bVar;
                }
                wwd0Var = wwd0Var2;
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                wwd0Var = this.a;
                uj50.b(obj);
            }
            wwd0Var.setValue(obj);
            return Unit.a;
        }
    }

    public static final class b extends kotlin.coroutines.a implements l5b {
        @Override // defpackage.l5b
        public final void handleException(CoroutineContext coroutineContext, Throwable th) {
            itf0.a aVar = itf0.a;
            aVar.q("WCPassBannerProvider");
            aVar.f(th, "Uncaught error in WC Pass banner scope", new Object[0]);
        }
    }

    @c0d(c = "com.sportybet.feature.loyalty.impl.worldcuppass.data.repository.WorldCupPassBannerStateProviderImpl$triggerRefresh$1", f = "WorldCupPassBannerStateProviderImpl.kt", l = {77}, m = "invokeSuspend", v = 2)
    public static final class c extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;

        public c(v1b<? super c> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return z1k0.this.new c(v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((c) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                this.a = 1;
                if (z1k0.this.c(this) == y5bVar) {
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

    public z1k0(w1k0 w1k0Var, uti utiVar, psm psmVar, uqm uqmVar) {
        w1k0Var.getClass();
        psmVar.getClass();
        uqmVar.getClass();
        this.a = w1k0Var;
        this.b = utiVar;
        this.c = psmVar;
        kfe0 kfe0VarA = lfe0.a();
        pfd pfdVar = fse.a;
        this.d = w5b.a(CoroutineContext.Element.a.d(kfe0VarA, odd.b).plus(new b(l5b.a.a)));
        wwd0 wwd0VarA = xwd0.a(x1k0.a.a);
        this.e = wwd0VarA;
        this.i = e1i.b(wwd0VarA);
        uqmVar.addLoginEventListener(this);
        uqmVar.addLogoutEventListener(this);
    }

    @Override // defpackage.y1k0
    public final void a(MissionData missionData) {
        missionData.getClass();
        if (this.c.O()) {
            if (missionData.getMissionConfig() != null) {
                this.f = missionData;
                ej5.c(this.d, null, null, new a(missionData, null), 3);
            } else {
                itf0.a aVar = itf0.a;
                aVar.q("WCPassBannerProvider");
                aVar.n("Ignoring MissionData with null missionConfig (BE returned partial payload)", new Object[0]);
            }
        }
    }

    @Override // defpackage.y1k0
    public final void b() {
        ej5.c(this.d, null, null, new c(null), 3);
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(x1b x1bVar) {
        a2k0 a2k0Var;
        Object bVar;
        Throwable thA;
        z1k0 z1k0Var;
        MissionData missionData;
        if (x1bVar instanceof a2k0) {
            a2k0Var = (a2k0) x1bVar;
            int i = a2k0Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                a2k0Var.e = i - Integer.MIN_VALUE;
            } else {
                a2k0Var = new a2k0(this, x1bVar);
            }
        } else {
            a2k0Var = new a2k0(this, x1bVar);
        }
        Object objB = a2k0Var.c;
        y5b y5bVar = y5b.a;
        int i2 = a2k0Var.e;
        boolean z = true;
        try {
            if (i2 == 0) {
                uj50.b(objB);
                if (!this.c.O()) {
                    return Unit.a;
                }
                zi50.a aVar = zi50.b;
                w1k0 w1k0Var = this.a;
                a2k0Var.a = this;
                a2k0Var.e = 1;
                objB = w1k0Var.b(a2k0Var);
                if (objB == y5bVar) {
                }
                return y5bVar;
            }
            if (i2 == 1) {
                this = a2k0Var.a;
                uj50.b(objB);
            } else {
                if (i2 != 2) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                missionData = a2k0Var.b;
                z1k0Var = a2k0Var.a;
                uj50.b(objB);
            }
            z1k0Var.f = missionData;
            z1k0Var.e.setValue((x1k0) objB);
            bVar = Unit.a;
            zi50.a aVar2 = zi50.b;
            thA = zi50.a(bVar);
            if (thA != null) {
                itf0.a aVar3 = itf0.a;
                aVar3.q("WCPassBannerProvider");
                aVar3.p(thA, "Failed to refresh WC Pass banner state; keeping prior state", new Object[0]);
            }
            return Unit.a;
            MissionData missionData2 = (MissionData) n52.b((BaseResponse) objB);
            this.getClass();
            if (missionData2.getMissionConfig() == null) {
                z = false;
            }
            if (!z) {
                throw new IllegalArgumentException("WC Pass info response had null missionConfig (BE returned partial payload)");
            }
            a2k0Var.a = this;
            a2k0Var.b = missionData2;
            a2k0Var.e = 2;
            Object objD = this.d(missionData2, a2k0Var);
            if (objD != y5bVar) {
                z1k0Var = this;
                missionData = missionData2;
                objB = objD;
                z1k0Var.f = missionData;
                z1k0Var.e.setValue((x1k0) objB);
                bVar = Unit.a;
                zi50.a aVar4 = zi50.b;
                thA = zi50.a(bVar);
                if (thA != null) {
                    itf0.a aVar5 = itf0.a;
                    aVar5.q("WCPassBannerProvider");
                    aVar5.p(thA, "Failed to refresh WC Pass banner state; keeping prior state", new Object[0]);
                }
                return Unit.a;
            }
            return y5bVar;
        } catch (Throwable th) {
            zi50.a aVar6 = zi50.b;
            bVar = new zi50.b(th);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(MissionData missionData, x1b x1bVar) {
        b2k0 b2k0Var;
        if (x1bVar instanceof b2k0) {
            b2k0Var = (b2k0) x1bVar;
            int i = b2k0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                b2k0Var.c = i - Integer.MIN_VALUE;
            } else {
                b2k0Var = new b2k0(this, x1bVar);
            }
        } else {
            b2k0Var = new b2k0(this, x1bVar);
        }
        Object objF = b2k0Var.a;
        y5b y5bVar = y5b.a;
        int i2 = b2k0Var.c;
        if (i2 == 0) {
            uj50.b(objF);
            if (missionData.getMissionConfig().getStatus() == MissionPublishState.UNPUBLISHED) {
                return x1k0.a.a;
            }
            MissionProgressDto mission = missionData.getMission();
            WorldCupPassInfoDto worldCupPassInfo = mission != null ? mission.getWorldCupPassInfo() : null;
            if ((mission != null ? mission.getStatus() : null) == MissionStatus.COMPLETED) {
                if ((worldCupPassInfo != null ? worldCupPassInfo.getPocketReceiveTime() : null) != null && worldCupPassInfo.getPassStartTime() != null && worldCupPassInfo.getPassEndTime() != null) {
                    return x1k0.c.a;
                }
            }
            Long purchasePayTotal = missionData.getMissionConfig().getParameter().getPurchasePayTotal();
            b2k0Var.c = 1;
            String strE = s5y.e(purchasePayTotal);
            String strB = this.c.B();
            uti.a[] aVarArr = uti.a.a;
            objF = uti.f(this.b, strE, strB, b2k0Var);
            if (objF == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(objF);
        }
        return new x1k0.b((String) objF);
    }

    @Override // defpackage.y1k0
    public final uwd0<x1k0> getState() {
        return this.i;
    }

    @Override // defpackage.lit
    public final void onLogin() {
        b();
    }

    @Override // defpackage.fjt
    public final void p() {
        MissionData missionData = this.f;
        if (missionData == null) {
            return;
        }
        a(MissionData.copy$default(missionData, null, null, false, 5, null));
    }
}
