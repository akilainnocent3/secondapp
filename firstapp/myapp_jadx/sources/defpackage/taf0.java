package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.core.model.account.telegram.TelegramBindingActionType;
import com.sporty.android.core.model.account.telegram.TelegramBindingPreCheckResponse;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sporty.android.platform.features.account.telegram.TelegramBindingViewModel$preCheckTelegramBindingStatus$1", f = "TelegramBindingViewModel.kt", l = {84, 228}, m = "invokeSuspend", v = 2)
public final class taf0 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public lyz a;
    public TelegramBindingActionType b;
    public int c;
    public final /* synthetic */ vaf0 d;
    public final /* synthetic */ TelegramBindingActionType e;

    public static final class a implements lyh<Unit> {
        public final /* synthetic */ yzh a;
        public final /* synthetic */ TelegramBindingActionType b;
        public final /* synthetic */ vaf0 c;

        /* JADX INFO: renamed from: taf0$a$a, reason: collision with other inner class name */
        @c0d(c = "com.sporty.android.platform.features.account.telegram.TelegramBindingViewModel$preCheckTelegramBindingStatus$1$invokeSuspend$$inlined$collectApiResult$default$1", f = "TelegramBindingViewModel.kt", l = {109}, m = "collect", v = 2)
        public static final class C1123a extends x1b {
            public /* synthetic */ Object a;
            public int b;

            public C1123a(v1b v1bVar) {
                super(v1bVar);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                this.a = obj;
                this.b |= Integer.MIN_VALUE;
                return a.this.collect(null, this);
            }
        }

        public static final class b<T> implements myh {
            public final /* synthetic */ myh a;
            public final /* synthetic */ TelegramBindingActionType b;
            public final /* synthetic */ vaf0 c;

            /* JADX INFO: renamed from: taf0$a$b$a, reason: collision with other inner class name */
            @c0d(c = "com.sporty.android.platform.features.account.telegram.TelegramBindingViewModel$preCheckTelegramBindingStatus$1$invokeSuspend$$inlined$collectApiResult$default$1$2", f = "TelegramBindingViewModel.kt", l = {50}, m = "emit", v = 2)
            public static final class C1124a extends x1b {
                public /* synthetic */ Object a;
                public int b;

                public C1124a(v1b v1bVar) {
                    super(v1bVar);
                }

                @Override // defpackage.pz1
                public final Object invokeSuspend(Object obj) {
                    this.a = obj;
                    this.b |= Integer.MIN_VALUE;
                    return b.this.emit(null, this);
                }
            }

            public b(myh myhVar, TelegramBindingActionType telegramBindingActionType, vaf0 vaf0Var) {
                this.a = myhVar;
                this.b = telegramBindingActionType;
                this.c = vaf0Var;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0019  */
            /* JADX WARN: Multi-variable type inference failed */
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
                C1124a c1124a;
                Object value;
                Object value2;
                Object value3;
                ResourceUiText resourceUiText;
                Object value4;
                Object value5;
                String str;
                Object aVar;
                Object value6;
                Object value7;
                vaf0 vaf0Var = this.c;
                wwd0 wwd0Var = vaf0Var.w;
                wwd0 wwd0Var2 = vaf0Var.i;
                if (v1bVar instanceof C1124a) {
                    c1124a = (C1124a) v1bVar;
                    int i = c1124a.b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c1124a.b = i - Integer.MIN_VALUE;
                    } else {
                        c1124a = new C1124a(v1bVar);
                    }
                } else {
                    c1124a = new C1124a(v1bVar);
                }
                Object obj2 = c1124a.a;
                y5b y5bVar = y5b.a;
                int i2 = c1124a.b;
                if (i2 == 0) {
                    uj50.b(obj2);
                    lk50 lk50Var = (lk50) obj;
                    if (lk50Var instanceof lk50.c) {
                        TelegramBindingPreCheckResponse telegramBindingPreCheckResponse = (TelegramBindingPreCheckResponse) ((lk50.c) lk50Var).a;
                        if (this.b == TelegramBindingActionType.Bind) {
                            if (Intrinsics.g(telegramBindingPreCheckResponse.getAllowToBind(), Boolean.TRUE)) {
                                StringUiText stringUiText = vch0.a;
                                aVar = new oaf0.c(new ResourceUiText(R.string.telegram__bind_title), new ResourceUiText(R.string.telegram__bind_description), paf0.b.a, paf0.d.a);
                            } else {
                                String suspendedUntil = telegramBindingPreCheckResponse.getSuspendedUntil();
                                str = suspendedUntil != null ? suspendedUntil : "";
                                StringUiText stringUiText2 = vch0.a;
                                aVar = new oaf0.a(new ResourceUiText(R.string.telegram__bind_account_again_after, ay0.S(new Object[]{str})));
                            }
                            do {
                                value6 = wwd0Var.getValue();
                            } while (!wwd0Var.g(value6, aVar));
                            do {
                                value7 = wwd0Var2.getValue();
                            } while (!wwd0Var2.g(value7, qaf0.a((qaf0) value7, uxs.ENABLE, false, 2)));
                        } else {
                            if (Intrinsics.g(telegramBindingPreCheckResponse.getReachThreshold(), Boolean.TRUE)) {
                                Integer waitTimeInDays = telegramBindingPreCheckResponse.getWaitTimeInDays();
                                str = waitTimeInDays != null ? waitTimeInDays : "";
                                StringUiText stringUiText3 = vch0.a;
                                resourceUiText = new ResourceUiText(R.string.telegram__unbind_description_within_time, ay0.S(new Object[]{str}));
                            } else {
                                StringUiText stringUiText4 = vch0.a;
                                resourceUiText = new ResourceUiText(R.string.telegram__unbind_description);
                            }
                            do {
                                value4 = wwd0Var2.getValue();
                            } while (!wwd0Var2.g(value4, qaf0.a((qaf0) value4, uxs.ENABLE, false, 2)));
                            do {
                                value5 = wwd0Var.getValue();
                                StringUiText stringUiText5 = vch0.a;
                            } while (!wwd0Var.g(value5, new oaf0.c(new ResourceUiText(R.string.telegram__unbind_title), resourceUiText, paf0.c.a, paf0.d.a)));
                        }
                    } else if (lk50Var instanceof lk50.a) {
                        lk50.a aVar2 = (lk50.a) lk50Var;
                        do {
                            value2 = wwd0Var2.getValue();
                        } while (!wwd0Var2.g(value2, qaf0.a((qaf0) value2, uxs.ENABLE, false, 2)));
                        do {
                            value3 = wwd0Var.getValue();
                        } while (!wwd0Var.g(value3, new oaf0.a(aVar2.b)));
                    } else {
                        if (!(lk50Var instanceof lk50.b)) {
                            uhc.a();
                            return null;
                        }
                        do {
                            value = wwd0Var2.getValue();
                        } while (!wwd0Var2.g(value, qaf0.a((qaf0) value, uxs.LOADING, false, 2)));
                    }
                    Unit unit = Unit.a;
                    c1124a.b = 1;
                    if (this.a.emit(unit, c1124a) == y5bVar) {
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

        public a(yzh yzhVar, TelegramBindingActionType telegramBindingActionType, vaf0 vaf0Var) {
            this.a = yzhVar;
            this.b = telegramBindingActionType;
            this.c = vaf0Var;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // defpackage.lyh
        public final Object collect(myh<? super Unit> myhVar, v1b v1bVar) {
            C1123a c1123a;
            if (v1bVar instanceof C1123a) {
                c1123a = (C1123a) v1bVar;
                int i = c1123a.b;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c1123a.b = i - Integer.MIN_VALUE;
                } else {
                    c1123a = new C1123a(v1bVar);
                }
            } else {
                c1123a = new C1123a(v1bVar);
            }
            Object obj = c1123a.a;
            y5b y5bVar = y5b.a;
            int i2 = c1123a.b;
            if (i2 == 0) {
                uj50.b(obj);
                b bVar = new b(myhVar, this.b, this.c);
                c1123a.b = 1;
                if (this.a.collect(bVar, c1123a) == y5bVar) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public taf0(vaf0 vaf0Var, TelegramBindingActionType telegramBindingActionType, v1b<? super taf0> v1bVar) {
        super(2, v1bVar);
        this.d = vaf0Var;
        this.e = telegramBindingActionType;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new taf0(this.d, this.e, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((taf0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0069, code lost:
    
        if (defpackage.kzh.a(r1, r7) == r0) goto L19;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            y5b r0 = defpackage.y5b.a
            int r1 = r7.c
            com.sporty.android.core.model.account.telegram.TelegramBindingActionType r2 = r7.e
            vaf0 r3 = r7.d
            r4 = 0
            r5 = 2
            r6 = 1
            if (r1 == 0) goto L2b
            if (r1 == r6) goto L23
            if (r1 != r5) goto L1d
            com.sporty.android.core.model.account.telegram.TelegramBindingActionType r0 = r7.b
            com.sporty.android.common_ui.uitext.UiText r0 = (com.sporty.android.common_ui.uitext.UiText) r0
            lyz r7 = r7.a
            lyh r7 = (defpackage.lyh) r7
            defpackage.uj50.b(r8)
            goto L6c
        L1d:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r7)
            return r4
        L23:
            com.sporty.android.core.model.account.telegram.TelegramBindingActionType r1 = r7.b
            lyz r6 = r7.a
            defpackage.uj50.b(r8)
            goto L42
        L2b:
            defpackage.uj50.b(r8)
            lyz r8 = r3.a
            mgb0 r1 = r3.e
            r7.a = r8
            r7.b = r2
            r7.c = r6
            java.lang.Object r1 = r1.getUserId(r7)
            if (r1 != r0) goto L3f
            goto L6b
        L3f:
            r6 = r8
            r8 = r1
            r1 = r2
        L42:
            java.lang.String r8 = (java.lang.String) r8
            if (r8 != 0) goto L48
            java.lang.String r8 = ""
        L48:
            lyh r8 = r6.m0(r1, r8)
            com.sporty.android.common_ui.uitext.StringUiText r1 = defpackage.vch0.a
            com.sporty.android.common_ui.uitext.ResourceUiText r1 = new com.sporty.android.common_ui.uitext.ResourceUiText
            r6 = 2132018156(0x7f1403ec, float:1.967461E38)
            r1.<init>(r6)
            yzh r8 = defpackage.bm50.b(r8, r1)
            taf0$a r1 = new taf0$a
            r1.<init>(r8, r2, r3)
            r7.a = r4
            r7.b = r4
            r7.c = r5
            java.lang.Object r7 = defpackage.kzh.a(r1, r7)
            if (r7 != r0) goto L6c
        L6b:
            return r0
        L6c:
            kotlin.Unit r7 = kotlin.Unit.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.taf0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
