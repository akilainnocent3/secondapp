package defpackage;

import android.content.Context;
import com.sportybet.feature.loyalty.impl.challenge.domain.model.ChallengeType;
import com.sportybet.feature.loyalty.impl.challenge.presentation.model.ChallengeCardStatus;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http.HttpStatusCodesKt;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.loyalty.impl.challenge.presentation.ChallengeLobbyScreenKt$ChallengeLobbyRoute$1$1", f = "ChallengeLobbyScreen.kt", l = {HttpStatusCodesKt.HTTP_SWITCHING_PROTOCOLS}, m = "invokeSuspend", v = 2)
public final class p17 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ o37 b;
    public final /* synthetic */ Function0<Unit> c;
    public final /* synthetic */ Function1<String, Unit> d;
    public final /* synthetic */ naj<Long, String, Integer, Long, Long, Integer, ChallengeCardStatus, ChallengeType, Integer, Unit> e;
    public final /* synthetic */ Context f;
    public final /* synthetic */ v3a0 i;
    public final /* synthetic */ Function0<Unit> v;

    public static final class a<T> implements myh {
        public final /* synthetic */ Function0<Unit> a;
        public final /* synthetic */ Function1<String, Unit> b;
        public final /* synthetic */ naj<Long, String, Integer, Long, Long, Integer, ChallengeCardStatus, ChallengeType, Integer, Unit> c;
        public final /* synthetic */ Context d;
        public final /* synthetic */ v3a0 e;
        public final /* synthetic */ Function0<Unit> f;

        /* JADX INFO: renamed from: p17$a$a, reason: collision with other inner class name */
        @c0d(c = "com.sportybet.feature.loyalty.impl.challenge.presentation.ChallengeLobbyScreenKt$ChallengeLobbyRoute$1$1$1", f = "ChallengeLobbyScreen.kt", l = {WebSocketProtocol.PAYLOAD_SHORT}, m = "emit", v = 2)
        public static final class C0957a extends x1b {
            public /* synthetic */ Object a;
            public final /* synthetic */ a<T> b;
            public int c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0957a(a<? super T> aVar, v1b<? super C0957a> v1bVar) {
                super(v1bVar);
                this.b = aVar;
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                this.a = obj;
                this.c |= Integer.MIN_VALUE;
                return this.b.emit(null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public a(Function0<Unit> function0, Function1<? super String, Unit> function1, naj<? super Long, ? super String, ? super Integer, ? super Long, ? super Long, ? super Integer, ? super ChallengeCardStatus, ? super ChallengeType, ? super Integer, Unit> najVar, Context context, v3a0 v3a0Var, Function0<Unit> function2) {
            this.a = function0;
            this.b = function1;
            this.c = najVar;
            this.d = context;
            this.e = v3a0Var;
            this.f = function2;
        }

        /* JADX WARN: Code duplicated, block: B:8:0x0014  */
        @Override // defpackage.myh
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Object emit(xz6 xz6Var, v1b<? super Unit> v1bVar) {
            C0957a c0957a;
            if (v1bVar instanceof C0957a) {
                c0957a = (C0957a) v1bVar;
                int i = c0957a.c;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c0957a.c = i - Integer.MIN_VALUE;
                } else {
                    c0957a = new C0957a(this, v1bVar);
                }
            } else {
                c0957a = new C0957a(this, v1bVar);
            }
            C0957a c0957a2 = c0957a;
            Object obj = c0957a2.a;
            y5b y5bVar = y5b.a;
            int i2 = c0957a2.c;
            if (i2 == 0) {
                uj50.b(obj);
                if (Intrinsics.g(xz6Var, xz6.a.a)) {
                    this.a.invoke();
                } else if (xz6Var instanceof xz6.c) {
                    this.b.invoke(((xz6.c) xz6Var).a);
                } else if (xz6Var instanceof xz6.d) {
                    xz6.d dVar = (xz6.d) xz6Var;
                    this.c.e(new Long(dVar.a), dVar.b, new Integer(dVar.c), new Long(dVar.d), new Long(dVar.e), new Integer(dVar.f), dVar.g, dVar.h, new Integer(dVar.i));
                } else if (xz6Var instanceof xz6.e) {
                    xz6.e eVar = (xz6.e) xz6Var;
                    int i3 = eVar.a;
                    Integer num = eVar.b;
                    Context context = this.d;
                    String strB = num != null ? sn5.b(context, i3, sn5.b(context, num.intValue(), new Object[0])) : sn5.b(context, i3, new Object[0]);
                    c0957a2.c = 1;
                    if (v3a0.b(this.e, strB, null, true, null, c0957a2, 10) == y5bVar) {
                        return y5bVar;
                    }
                } else {
                    if (!Intrinsics.g(xz6Var, xz6.b.a)) {
                        uhc.a();
                        return null;
                    }
                    this.f.invoke();
                }
                return Unit.a;
            }
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public p17(o37 o37Var, Function0<Unit> function0, Function1<? super String, Unit> function1, naj<? super Long, ? super String, ? super Integer, ? super Long, ? super Long, ? super Integer, ? super ChallengeCardStatus, ? super ChallengeType, ? super Integer, Unit> najVar, Context context, v3a0 v3a0Var, Function0<Unit> function2, v1b<? super p17> v1bVar) {
        super(2, v1bVar);
        this.b = o37Var;
        this.c = function0;
        this.d = function1;
        this.e = najVar;
        this.f = context;
        this.i = v3a0Var;
        this.v = function2;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new p17(this.b, this.c, this.d, this.e, this.f, this.i, this.v, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        ((p17) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        return y5b.a;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type v1b to p17 for r11v2 'this'  v1b
        	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
        	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
        	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
        	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    @Override // defpackage.pz1
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            y5b r0 = defpackage.y5b.a
            int r1 = r11.a
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L14
            if (r1 == r3) goto L10
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r11)
            return r2
        L10:
            defpackage.uj50.b(r12)
            goto L37
        L14:
            defpackage.uj50.b(r12)
            o37 r12 = r11.b
            t340 r12 = r12.B
            p17$a r4 = new p17$a
            v3a0 r9 = r11.i
            kotlin.jvm.functions.Function0<kotlin.Unit> r10 = r11.v
            kotlin.jvm.functions.Function0<kotlin.Unit> r5 = r11.c
            kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> r6 = r11.d
            naj<java.lang.Long, java.lang.String, java.lang.Integer, java.lang.Long, java.lang.Long, java.lang.Integer, com.sportybet.feature.loyalty.impl.challenge.presentation.model.ChallengeCardStatus, com.sportybet.feature.loyalty.impl.challenge.domain.model.ChallengeType, java.lang.Integer, kotlin.Unit> r7 = r11.e
            android.content.Context r8 = r11.f
            r4.<init>(r5, r6, r7, r8, r9, r10)
            r11.a = r3
            a390<T> r12 = r12.a
            java.lang.Object r11 = r12.collect(r4, r11)
            if (r11 != r0) goto L37
            return r0
        L37:
            defpackage.fkd.a()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p17.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
