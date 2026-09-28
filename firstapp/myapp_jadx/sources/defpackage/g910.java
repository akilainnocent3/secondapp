package defpackage;

import com.sporty.android.core.model.pocket.deposit.DepositHistoryStatusData;
import com.sporty.android.core.model.pocket.globalpay.ChannelData;
import com.sportybet.android.globalpay.pixBtg.deposit.g;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import okhttp3.internal.http.HttpStatusCodesKt;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.globalpay.pixBtg.deposit.PixBtgDepositViewModel$loadRequiredData$1", f = "PixBtgDepositViewModel.kt", l = {427, 436, 438, 440, 444, 453}, m = "invokeSuspend", v = 2)
public final class g910 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public final /* synthetic */ g A;
    public pjd a;
    public ojd b;
    public ojd c;
    public Object d;
    public Object e;
    public Object f;
    public g i;
    public g v;
    public boolean w;
    public int y;
    public /* synthetic */ Object z;

    @c0d(c = "com.sportybet.android.globalpay.pixBtg.deposit.PixBtgDepositViewModel$loadRequiredData$1$bankAccountsDeferred$1", f = "PixBtgDepositViewModel.kt", l = {HttpStatusCodesKt.HTTP_MISDIRECTED_REQUEST}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super zi50<? extends List<? extends p610>>>, Object> {
        public int a;
        public final /* synthetic */ g b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(g gVar, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.b = gVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new a(this.b, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super zi50<? extends List<? extends p610>>> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            Object objA;
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                yak yakVar = this.b.A;
                this.a = 1;
                objA = yakVar.a(false, this);
                if (objA == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
                objA = ((zi50) obj).a;
            }
            return new zi50(objA);
        }
    }

    @c0d(c = "com.sportybet.android.globalpay.pixBtg.deposit.PixBtgDepositViewModel$loadRequiredData$1$channelDeferred$1", f = "PixBtgDepositViewModel.kt", l = {418}, m = "invokeSuspend", v = 2)
    public static final class b extends tje0 implements Function2<v5b, v1b<? super zi50<? extends ChannelData>>, Object> {
        public int a;
        public final /* synthetic */ g b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(g gVar, v1b<? super b> v1bVar) {
            super(2, v1bVar);
            this.b = gVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new b(this.b, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super zi50<? extends ChannelData>> v1bVar) {
            return ((b) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            Object objA;
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                abk abkVar = this.b.a;
                f600 f600Var = f600.DEPOSIT;
                this.a = 1;
                objA = abkVar.a(f600Var, this);
                if (objA == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
                objA = ((zi50) obj).a;
            }
            return new zi50(objA);
        }
    }

    @c0d(c = "com.sportybet.android.globalpay.pixBtg.deposit.PixBtgDepositViewModel$loadRequiredData$1$cpfDeferred$1", f = "PixBtgDepositViewModel.kt", l = {419}, m = "invokeSuspend", v = 2)
    public static final class c extends tje0 implements Function2<v5b, v1b<? super zi50<? extends String>>, Object> {
        public int a;
        public final /* synthetic */ g b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(g gVar, v1b<? super c> v1bVar) {
            super(2, v1bVar);
            this.b = gVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new c(this.b, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super zi50<? extends String>> v1bVar) {
            return ((c) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            Object objA;
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                mgk mgkVar = this.b.b;
                this.a = 1;
                objA = mgkVar.a(this);
                if (objA == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
                objA = ((zi50) obj).a;
            }
            return new zi50(objA);
        }
    }

    @c0d(c = "com.sportybet.android.globalpay.pixBtg.deposit.PixBtgDepositViewModel$loadRequiredData$1$getDepositHistoryStatusDeferred$1", f = "PixBtgDepositViewModel.kt", l = {424}, m = "invokeSuspend", v = 2)
    public static final class d extends tje0 implements Function2<v5b, v1b<? super zi50<? extends DepositHistoryStatusData>>, Object> {
        public int a;
        public final /* synthetic */ g b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(g gVar, v1b<? super d> v1bVar) {
            super(2, v1bVar);
            this.b = gVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new d(this.b, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super zi50<? extends DepositHistoryStatusData>> v1bVar) {
            return ((d) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            Object objA;
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                k5k k5kVar = this.b.D;
                this.a = 1;
                objA = k5kVar.a(this);
                if (objA == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
                objA = ((zi50) obj).a;
            }
            return new zi50(objA);
        }
    }

    @c0d(c = "com.sportybet.android.globalpay.pixBtg.deposit.PixBtgDepositViewModel$loadRequiredData$1$pendingDepositsDeferred$1", f = "PixBtgDepositViewModel.kt", l = {430}, m = "invokeSuspend", v = 2)
    public static final class e extends tje0 implements Function2<v5b, v1b<? super zi50<? extends ebk.a>>, Object> {
        public int a;
        public final /* synthetic */ g b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(g gVar, v1b<? super e> v1bVar) {
            super(2, v1bVar);
            this.b = gVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new e(this.b, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super zi50<? extends ebk.a>> v1bVar) {
            return ((e) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            Object objA;
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                g gVar = this.b;
                qe10 qe10VarA1 = gVar.A1();
                int i2 = gVar.O;
                this.a = 1;
                objA = qe10VarA1.a(i2, this);
                if (objA == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
                objA = ((zi50) obj).a;
            }
            return new zi50(objA);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g910(g gVar, v1b<? super g910> v1bVar) {
        super(2, v1bVar);
        this.A = gVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        g910 g910Var = new g910(this.A, v1bVar);
        g910Var.z = obj;
        return g910Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((g910) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0334  */
    /* JADX WARN: Code duplicated, block: B:19:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:22:0x0158  */
    /* JADX WARN: Code duplicated, block: B:25:0x0168  */
    /* JADX WARN: Code duplicated, block: B:27:0x016b  */
    /* JADX WARN: Code duplicated, block: B:30:0x0183  */
    /* JADX WARN: Code duplicated, block: B:33:0x0193  */
    /* JADX WARN: Code duplicated, block: B:35:0x0196  */
    /* JADX WARN: Code duplicated, block: B:38:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:41:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:43:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:45:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:49:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:53:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:56:0x0207  */
    /* JADX WARN: Code duplicated, block: B:58:0x020a  */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0236, code lost:
    
        if (r0 == r2) goto L60;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 842
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g910.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
