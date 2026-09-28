package defpackage;

import androidx.fragment.app.e;
import com.sporty.android.core.model.dispatcher.ApplicationScope;
import com.sporty.android.core.model.tracking.AnalyticsEvent;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportybet.feature.payment.impl.tradeadditional.domain.model.Phv.dqvOSm;
import java.lang.ref.WeakReference;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import xta.b;

/* JADX INFO: loaded from: classes2.dex */
public final class xta implements tta {
    public final psm a;
    public final uqm b;
    public final iym c;
    public final hhk d;
    public final v5b e;

    /* JADX INFO: loaded from: classes6.dex */
    @c0d(c = "com.sportybet.feature.kyc.confirmAccountInfo.ConfirmNameDialogLauncherImpl", f = "ConfirmNameDialogLauncherImpl.kt", l = {52}, m = "showDialogWithCommonInfo", v = 2)
    public static final class a extends x1b {
        public e a;
        public vtp b;
        public /* synthetic */ Object c;
        public int e;

        public a(v1b<? super a> v1bVar) {
            super(v1bVar);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            this.c = obj;
            this.e |= Integer.MIN_VALUE;
            return xta.this.c(null, null, this);
        }
    }

    /* JADX INFO: loaded from: classes6.dex */
    @c0d(c = "com.sportybet.feature.kyc.confirmAccountInfo.ConfirmNameDialogLauncherImpl$showDialogWithCommonInfo$3$1", f = "ConfirmNameDialogLauncherImpl.kt", l = {72}, m = "invokeSuspend", v = 2)
    public static final class b extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;

        public b(v1b<? super b> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return xta.this.new b(v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((b) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            Object objC;
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                hhk hhkVar = xta.this.d;
                this.a = 1;
                if (hhkVar.a.x()) {
                    yqm yqmVar = hhkVar.b;
                    x66<xcj> x66Var = z76.z;
                    objC = yqmVar.c(x66Var.a, (String) CollectionsKt.T(x66Var.b), null, this);
                } else {
                    objC = Unit.a;
                }
                if (objC == y5bVar) {
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

    public xta(psm psmVar, uqm uqmVar, iym iymVar, hhk hhkVar, @ApplicationScope v5b v5bVar) {
        psmVar.getClass();
        uqmVar.getClass();
        iymVar.getClass();
        v5bVar.getClass();
        this.a = psmVar;
        this.b = uqmVar;
        this.c = iymVar;
        this.d = hhkVar;
        this.e = v5bVar;
    }

    @Override // defpackage.tta
    public final void a() {
        rqa rqaVar;
        WeakReference<rqa> weakReference = sta.b;
        if (weakReference != null && (rqaVar = weakReference.get()) != null && rqaVar.isAdded() && !rqaVar.requireActivity().isFinishing()) {
            rqaVar.dismissAllowingStateLoss();
        }
        sta.c = false;
        sta.b = null;
    }

    @Override // defpackage.tta
    public final void b(e eVar, Function0 function0) {
        if (this.b.isLogin()) {
            sta.a.a(eVar, null, null, function0, null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0, types: [wta] */
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
    @Override // defpackage.tta
    public final Object c(e eVar, final vtp vtpVar, v1b<? super Unit> v1bVar) {
        a aVar;
        if (v1bVar instanceof a) {
            aVar = (a) v1bVar;
            int i = aVar.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                aVar.e = i - Integer.MIN_VALUE;
            } else {
                aVar = new a(v1bVar);
            }
        } else {
            aVar = new a(v1bVar);
        }
        Object objA = aVar.c;
        Object obj = y5b.a;
        int i2 = aVar.e;
        if (i2 == 0) {
            uj50.b(objA);
            if (!this.b.isLogin()) {
                return Unit.a;
            }
            if (sta.c) {
                return Unit.a;
            }
            hhk hhkVar = this.d;
            aVar.a = eVar;
            aVar.b = vtpVar;
            aVar.e = 1;
            objA = hhkVar.a(aVar);
            if (objA == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                ib5.a(dqvOSm.KTRzsPite);
                return null;
            }
            vtpVar = aVar.b;
            eVar = aVar.a;
            uj50.b(objA);
        }
        final e eVar2 = eVar;
        xcj xcjVar = (xcj) objA;
        if (eVar2.isFinishing() || eVar2.isDestroyed()) {
            return Unit.a;
        }
        final boolean z = vtpVar != vtp.NONE;
        sta.a.a(eVar2, xcjVar, new uta(z, this, vtpVar), new Function0() { // from class: vta
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                xta xtaVar = this.a;
                ej5.c(xtaVar.e, null, null, xtaVar.new b(null), 3);
                e eVar3 = eVar2;
                if (eVar3.isFinishing()) {
                    return Unit.a;
                }
                if (z) {
                    gym.a(xtaVar.c, new osp.c(vtpVar));
                }
                f00 f00Var = vgb0.a;
                vgb0.c(AnalyticsEvent.DEPOSIT_CONFIRM_NAME, jpu.b(new Pair(AnalyticsParam.EVENT_PARAM_STEP, "complete_account_info_click")), true);
                ble.a(eVar3, xtaVar.a, 2000);
                return Unit.a;
            }
        }, new Function0() { // from class: wta
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                gym.a(this.a.c, new osp.d(vtpVar));
                return Unit.a;
            }
        });
        return Unit.a;
    }
}
