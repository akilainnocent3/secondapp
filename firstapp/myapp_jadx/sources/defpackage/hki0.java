package defpackage;

import com.sporty.android.common_ui.uitext.UiText;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.android.virtual.domain.viewmodel.VirtualLobbyMissionStatusHandlerImpl$participateInMission$2", f = "VirtualLobbyMissionStatusHandlerImpl.kt", l = {}, m = "invokeSuspend", v = 2)
public final class hki0 extends tje0 implements Function2<lk50<? extends Unit>, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ gki0 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ et7 d;

    @c0d(c = "com.sportybet.android.virtual.domain.viewmodel.VirtualLobbyMissionStatusHandlerImpl$participateInMission$2$2", f = "VirtualLobbyMissionStatusHandlerImpl.kt", l = {296}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ gki0 b;
        public final /* synthetic */ lk50<Unit> c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(gki0 gki0Var, lk50<Unit> lk50Var, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.b = gki0Var;
            this.c = lk50Var;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new a(this.b, this.c, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                nli0 nli0Var = this.b.j;
                if (nli0Var == null) {
                    Intrinsics.n("onShowToast");
                    throw null;
                }
                UiText uiText = ((lk50.a) this.c).b;
                this.a = 1;
                if (nli0Var.invoke(uiText, this) == y5bVar) {
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

    @c0d(c = "com.sportybet.android.virtual.domain.viewmodel.VirtualLobbyMissionStatusHandlerImpl$participateInMission$2$4", f = "VirtualLobbyMissionStatusHandlerImpl.kt", l = {310}, m = "invokeSuspend", v = 2)
    public static final class b extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ gki0 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(v1b v1bVar, gki0 gki0Var) {
            super(2, v1bVar);
            this.b = gki0Var;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new b(v1bVar, this.b);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((b) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                this.a = 1;
                if (hkd.b(300L, this) == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            gki0 gki0Var = this.b;
            if (gki0Var.d.isLogin()) {
                gki0Var.i.a(Unit.a);
            }
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hki0(gki0 gki0Var, int i, et7 et7Var, v1b v1bVar) {
        super(2, v1bVar);
        this.b = gki0Var;
        this.c = i;
        this.d = et7Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        hki0 hki0Var = new hki0(this.b, this.c, this.d, v1bVar);
        hki0Var.a = obj;
        return hki0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(lk50<? extends Unit> lk50Var, v1b<? super Unit> v1bVar) {
        return ((hki0) create(lk50Var, v1bVar)).invokeSuspend(Unit.a);
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
    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object value;
        lk50 lk50Var = (lk50) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        boolean zG = Intrinsics.g(lk50Var, lk50.b.a);
        int i = this.c;
        gki0 gki0Var = this.b;
        if (zG) {
            gki0Var.c(i, uxs.LOADING);
            Unit unit = Unit.a;
        } else {
            boolean z = lk50Var instanceof lk50.a;
            et7 et7Var = this.d;
            if (z) {
                gki0Var.c(i, uxs.ENABLE);
                wwd0 wwd0Var = gki0Var.h;
                do {
                    value = wwd0Var.getValue();
                } while (!wwd0Var.g(value, yi80.c((Set) value, new Integer(i))));
                ej5.c(et7Var, null, null, new a(gki0Var, lk50Var, null), 3);
            } else {
                if (!(lk50Var instanceof lk50.c)) {
                    uhc.a();
                    return null;
                }
                gki0Var.c(i, uxs.ENABLE);
                wwd0 wwd0Var2 = gki0Var.g;
                Set setF = (Set) wwd0Var2.getValue();
                if (!setF.contains(new Integer(i))) {
                    setF = yi80.f(setF, new Integer(i));
                }
                wwd0Var2.getClass();
                wwd0Var2.k(null, setF);
                ej5.c(et7Var, null, null, new b(null, gki0Var), 3);
            }
        }
        return Unit.a;
    }
}
