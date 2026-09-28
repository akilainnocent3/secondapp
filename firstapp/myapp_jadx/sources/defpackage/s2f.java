package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.doubleornothing.component.DoubleOrNothingKickVisualContentKt$DoubleOrNothingKickVisualContent$1$1", f = "DoubleOrNothingKickVisualContent.kt", l = {52, 60, 70}, m = "invokeSuspend", v = 2)
public final class s2f extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ vb00 b;
    public final /* synthetic */ d2f c;
    public final /* synthetic */ fmt d;
    public final /* synthetic */ fmt e;
    public final /* synthetic */ Function0<Unit> f;
    public final /* synthetic */ fmt i;
    public final /* synthetic */ Function0<Unit> v;
    public final /* synthetic */ ytw<c850> w;
    public final /* synthetic */ ytw<xpp> y;

    @c0d(c = "com.sportybet.android.instantwin.presentation.doubleornothing.component.DoubleOrNothingKickVisualContentKt$DoubleOrNothingKickVisualContent$1$1$1", f = "DoubleOrNothingKickVisualContent.kt", l = {53}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Boolean>, Object> {
        public int a;
        public final /* synthetic */ vb00 b;

        /* JADX INFO: renamed from: s2f$a$a, reason: collision with other inner class name */
        @c0d(c = "com.sportybet.android.instantwin.presentation.doubleornothing.component.DoubleOrNothingKickVisualContentKt$DoubleOrNothingKickVisualContent$1$1$1$2", f = "DoubleOrNothingKickVisualContent.kt", l = {}, m = "invokeSuspend", v = 2)
        public static final class C1076a extends tje0 implements Function2<Boolean, v1b<? super Boolean>, Object> {
            public /* synthetic */ boolean a;

            @Override // defpackage.pz1
            public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
                C1076a c1076a = new C1076a(2, v1bVar);
                c1076a.a = ((Boolean) obj).booleanValue();
                return c1076a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Boolean bool, v1b<? super Boolean> v1bVar) {
                Boolean bool2 = bool;
                bool2.booleanValue();
                return ((C1076a) create(bool2, v1bVar)).invokeSuspend(Unit.a);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                boolean z = this.a;
                y5b y5bVar = y5b.a;
                uj50.b(obj);
                return Boolean.valueOf(z);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(vb00 vb00Var, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.b = vb00Var;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new a(this.b, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Boolean> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i != 0) {
                if (i == 1) {
                    uj50.b(obj);
                    return obj;
                }
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
            or60 or60VarC = n95.c(new d81(this.b, 1));
            C1076a c1076a = new C1076a(2, null);
            this.a = 1;
            Object objB = s0i.b(or60VarC, c1076a, this);
            return objB == y5bVar ? y5bVar : objB;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s2f(vb00 vb00Var, d2f d2fVar, fmt fmtVar, fmt fmtVar2, Function0<Unit> function0, fmt fmtVar3, Function0<Unit> function1, ytw<c850> ytwVar, ytw<xpp> ytwVar2, v1b<? super s2f> v1bVar) {
        super(2, v1bVar);
        this.b = vb00Var;
        this.c = d2fVar;
        this.d = fmtVar;
        this.e = fmtVar2;
        this.f = function0;
        this.i = fmtVar3;
        this.v = function1;
        this.w = ytwVar;
        this.y = ytwVar2;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new s2f(this.b, this.c, this.d, this.e, this.f, this.i, this.v, this.w, this.y, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((s2f) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00c2, code lost:
    
        if (r12 == r0) goto L32;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            Method dump skipped, instruction units count: 219
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s2f.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
