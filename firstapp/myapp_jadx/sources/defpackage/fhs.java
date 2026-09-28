package defpackage;

import android.content.Context;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.bookingcode.customCode.list.compose.ListCustomCodeBottomSheetKt$ListCustomCodeBottomSheet$2$1", f = "ListCustomCodeBottomSheet.kt", l = {89}, m = "invokeSuspend", v = 2)
public final class fhs extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ lhs b;
    public final /* synthetic */ v3a0 c;
    public final /* synthetic */ Context d;
    public final /* synthetic */ Function2<gdc, jz0, Unit> e;
    public final /* synthetic */ Function1<gdc, Unit> f;
    public final /* synthetic */ Function0<Unit> i;
    public final /* synthetic */ ytw<Integer> v;

    public static final class a<T> implements myh {
        public final /* synthetic */ v3a0 a;
        public final /* synthetic */ Context b;
        public final /* synthetic */ Function2<gdc, jz0, Unit> c;
        public final /* synthetic */ Function1<gdc, Unit> d;
        public final /* synthetic */ Function0<Unit> e;
        public final /* synthetic */ ytw<Integer> f;

        /* JADX INFO: renamed from: fhs$a$a, reason: collision with other inner class name */
        @c0d(c = "com.sportybet.android.bookingcode.customCode.list.compose.ListCustomCodeBottomSheetKt$ListCustomCodeBottomSheet$2$1$1", f = "ListCustomCodeBottomSheet.kt", l = {92}, m = "emit", v = 2)
        public static final class C0564a extends x1b {
            public /* synthetic */ Object a;
            public final /* synthetic */ a<T> b;
            public int c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0564a(a<? super T> aVar, v1b<? super C0564a> v1bVar) {
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
        public a(v3a0 v3a0Var, Context context, Function2<? super gdc, ? super jz0, Unit> function2, Function1<? super gdc, Unit> function1, Function0<Unit> function0, ytw<Integer> ytwVar) {
            this.a = v3a0Var;
            this.b = context;
            this.c = function2;
            this.d = function1;
            this.e = function0;
            this.f = ytwVar;
        }

        /* JADX WARN: Code duplicated, block: B:8:0x0014  */
        @Override // defpackage.myh
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Object emit(id90 id90Var, v1b<? super Unit> v1bVar) {
            C0564a c0564a;
            if (v1bVar instanceof C0564a) {
                c0564a = (C0564a) v1bVar;
                int i = c0564a.c;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c0564a.c = i - Integer.MIN_VALUE;
                } else {
                    c0564a = new C0564a(this, v1bVar);
                }
            } else {
                c0564a = new C0564a(this, v1bVar);
            }
            C0564a c0564a2 = c0564a;
            Object obj = c0564a2.a;
            y5b y5bVar = y5b.a;
            int i2 = c0564a2.c;
            if (i2 == 0) {
                uj50.b(obj);
                if (!(id90Var instanceof rb90)) {
                    if (id90Var instanceof ghs.a) {
                        ghs.a aVar = (ghs.a) id90Var;
                        this.c.invoke(aVar.a, aVar.b);
                    } else if (id90Var instanceof ghs.c) {
                        this.d.invoke(((ghs.c) id90Var).a);
                    } else if (id90Var instanceof ghs.b) {
                        this.e.invoke();
                    } else if (id90Var instanceof ghs.d) {
                        this.f.setValue(new Integer(R.string.component_assign_custom_code__create_new_code_max_lenght_reached));
                    }
                    return Unit.a;
                }
                String strG = ((rb90) id90Var).a.g(this.b);
                k3a0 k3a0Var = k3a0.a;
                c0564a2.c = 1;
                if (v3a0.b(this.a, strG, null, false, k3a0Var, c0564a2, 6) == y5bVar) {
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
    /* JADX WARN: Multi-variable type inference failed */
    public fhs(lhs lhsVar, v3a0 v3a0Var, Context context, Function2<? super gdc, ? super jz0, Unit> function2, Function1<? super gdc, Unit> function1, Function0<Unit> function0, ytw<Integer> ytwVar, v1b<? super fhs> v1bVar) {
        super(2, v1bVar);
        this.b = lhsVar;
        this.c = v3a0Var;
        this.d = context;
        this.e = function2;
        this.f = function1;
        this.i = function0;
        this.v = ytwVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new fhs(this.b, this.c, this.d, this.e, this.f, this.i, this.v, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        ((fhs) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        return y5b.a;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type v1b to fhs for r11v2 'this'  v1b
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
            lhs r12 = r11.b
            t340 r12 = r12.d
            fhs$a r4 = new fhs$a
            kotlin.jvm.functions.Function0<kotlin.Unit> r9 = r11.i
            ytw<java.lang.Integer> r10 = r11.v
            v3a0 r5 = r11.c
            android.content.Context r6 = r11.d
            kotlin.jvm.functions.Function2<gdc, jz0, kotlin.Unit> r7 = r11.e
            kotlin.jvm.functions.Function1<gdc, kotlin.Unit> r8 = r11.f
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fhs.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
