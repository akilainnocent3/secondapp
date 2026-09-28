package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
public final class r370 implements lyh<zs> {
    public final /* synthetic */ wwd0 a;
    public final /* synthetic */ t370 b;
    public final /* synthetic */ String c;

    @c0d(c = "com.sportybet.android.instantwin.presentation.scheduledfootball.handler.ScheduledFootballCreateTicketErrorHandlerImpl$init$$inlined$map$1", f = "ScheduledFootballCreateTicketErrorHandlerImpl.kt", l = {109}, m = "collect", v = 2)
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
            return r370.this.collect(null, this);
        }
    }

    public static final class b<T> implements myh {
        public final /* synthetic */ myh a;
        public final /* synthetic */ t370 b;
        public final /* synthetic */ String c;

        @c0d(c = "com.sportybet.android.instantwin.presentation.scheduledfootball.handler.ScheduledFootballCreateTicketErrorHandlerImpl$init$$inlined$map$1$2", f = "ScheduledFootballCreateTicketErrorHandlerImpl.kt", l = {50}, m = "emit", v = 2)
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

        public b(myh myhVar, t370 t370Var, String str) {
            this.a = myhVar;
            this.b = t370Var;
            this.c = str;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
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
        @Override // defpackage.myh
        public final Object emit(Object obj, v1b v1bVar) {
            a aVar;
            zs bVar;
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
                q370 q370Var = (q370) obj;
                if (q370Var == null) {
                    bVar = zs.a.a;
                } else if (q370Var.equals(q370.e.a) || q370Var.equals(q370.c.a)) {
                    StringUiText stringUiText = vch0.a;
                    bVar = new zs.b(new ResourceUiText(R.string.page_instant_virtual__bet_fail), new ResourceUiText(R.string.common_feedback__something_went_wrong_tip), (ResourceUiText) null, 12);
                } else if (q370Var.equals(q370.b.a)) {
                    Integer numC = this.b.a.c(this.c);
                    int iIntValue = numC != null ? numC.intValue() : R.string.common_functions__unknown;
                    StringUiText stringUiText2 = vch0.a;
                    bVar = new zs.b(new ResourceUiText(R.string.page_instant_virtual__game_unavailable), new ResourceUiText(R.string.page_instant_virtual__game_is_unavailable_now_tip, ay0.S(new Object[]{new ResourceUiText(iIntValue)})), (ResourceUiText) null, 12);
                } else if (q370Var.equals(q370.d.a)) {
                    StringUiText stringUiText3 = vch0.a;
                    bVar = new zs.b(new ResourceUiText(R.string.page_instant_virtual__insufficient_balance), new ResourceUiText(R.string.page_instant_virtual__please_make_a_deposit_to_continue), new ResourceUiText(R.string.common_functions__deposit), new ResourceUiText(R.string.common_functions__cancel));
                } else {
                    if (!q370Var.equals(q370.a.a) && !q370Var.equals(q370.g.a) && !q370Var.equals(q370.f.a)) {
                        uhc.a();
                        return null;
                    }
                    StringUiText stringUiText4 = vch0.a;
                    bVar = new zs.b(new ResourceUiText(R.string.page_instant_virtual__bet_fail), new ResourceUiText(R.string.page_instant_virtual__please_contact_customer_service_for_assistance), (ResourceUiText) null, 12);
                }
                aVar.b = 1;
                if (this.a.emit(bVar, aVar) == y5bVar) {
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

    public r370(wwd0 wwd0Var, t370 t370Var, String str) {
        this.a = wwd0Var;
        this.b = t370Var;
        this.c = str;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.lyh
    public final Object collect(myh<? super zs> myhVar, v1b v1bVar) throws Throwable {
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
        b bVar = new b(myhVar, this.b, this.c);
        aVar.b = 1;
        this.a.collect(bVar, aVar);
        return y5bVar;
    }
}
