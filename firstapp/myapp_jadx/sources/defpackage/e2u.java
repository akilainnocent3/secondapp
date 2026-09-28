package defpackage;

import android.content.Context;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sporty.android.platform.features.loyalty.upgradedialog.LoyaltyUpgradeScreenKt$loadImage$1$1", f = "LoyaltyUpgradeScreen.kt", l = {394}, m = "invokeSuspend", v = 2)
public final class e2u extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public ytw a;
    public int b;
    public final /* synthetic */ ytw<llh0> c;
    public final /* synthetic */ krf0 d;
    public final /* synthetic */ Context e;

    @c0d(c = "com.sporty.android.platform.features.loyalty.upgradedialog.LoyaltyUpgradeScreenKt$loadImage$1$1$1", f = "LoyaltyUpgradeScreen.kt", l = {411}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super llh0>, Object> {
        public f2u a;
        public Context b;
        public Collection c;
        public Iterator d;
        public Collection e;
        public int f;
        public /* synthetic */ Object i;
        public final /* synthetic */ krf0 v;
        public final /* synthetic */ Context w;

        /* JADX INFO: renamed from: e2u$a$a, reason: collision with other inner class name */
        @c0d(c = "com.sporty.android.platform.features.loyalty.upgradedialog.LoyaltyUpgradeScreenKt$loadImage$1$1$1$2$1", f = "LoyaltyUpgradeScreen.kt", l = {409}, m = "invokeSuspend", v = 2)
        public static final class C0512a extends tje0 implements Function2<v5b, v1b<? super dbn>, Object> {
            public int a;
            public /* synthetic */ Object b;
            public final /* synthetic */ Context c;
            public final /* synthetic */ String d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0512a(v1b v1bVar, Context context, String str) {
                super(2, v1bVar);
                this.c = context;
                this.d = str;
            }

            @Override // defpackage.pz1
            public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                C0512a c0512a = new C0512a(v1bVar, this.c, this.d);
                c0512a.b = obj;
                return c0512a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(v5b v5bVar, v1b<? super dbn> v1bVar) {
                return ((C0512a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                Object bVar;
                y5b y5bVar = y5b.a;
                int i = this.a;
                try {
                    if (i == 0) {
                        uj50.b(obj);
                        Context context = this.c;
                        String str = this.d;
                        zi50.a aVar = zi50.b;
                        nan.a aVar2 = new nan.a(context);
                        aVar2.c = str;
                        nan nanVarA = aVar2.a();
                        m9n m9nVarA = qw90.a(context);
                        this.b = null;
                        this.a = 1;
                        obj = m9nVarA.b(nanVarA, this);
                        if (obj == y5bVar) {
                            return y5bVar;
                        }
                    } else {
                        if (i != 1) {
                            ib5.a("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        uj50.b(obj);
                    }
                    bVar = (dbn) obj;
                    zi50.a aVar3 = zi50.b;
                } catch (Throwable th) {
                    zi50.a aVar4 = zi50.b;
                    bVar = new zi50.b(th);
                }
                if (bVar instanceof zi50.b) {
                    return null;
                }
                return bVar;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(krf0 krf0Var, Context context, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.v = krf0Var;
            this.w = context;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            a aVar = new a(this.v, this.w, v1bVar);
            aVar.i = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super llh0> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code duplicated, block: B:21:0x0073  */
        /* JADX WARN: Code duplicated, block: B:23:0x009c A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:24:0x009d  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x009d -> B:25:0x009e). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // defpackage.pz1
        public final java.lang.Object invokeSuspend(java.lang.Object r14) {
            /*
                Method dump skipped, instruction units count: 213
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: e2u.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e2u(ytw<llh0> ytwVar, krf0 krf0Var, Context context, v1b<? super e2u> v1bVar) {
        super(2, v1bVar);
        this.c = ytwVar;
        this.d = krf0Var;
        this.e = context;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new e2u(this.c, this.d, this.e, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((e2u) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        ytw ytwVar;
        y5b y5bVar = y5b.a;
        int i = this.b;
        if (i == 0) {
            uj50.b(obj);
            odd oddVar = zu7.f;
            a aVar = new a(this.d, this.e, null);
            ytw<llh0> ytwVar2 = this.c;
            this.a = ytwVar2;
            this.b = 1;
            obj = ej5.d(oddVar, aVar, this);
            if (obj == y5bVar) {
                return y5bVar;
            }
            ytwVar = ytwVar2;
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ytwVar = this.a;
            uj50.b(obj);
        }
        ytwVar.setValue(obj);
        return Unit.a;
    }
}
