package defpackage;

import com.sportybet.repository.limits.model.SaveLimitsRequest;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "com.sportybet.android.limits.edit.viewmodel.EditTimeLimitsViewModel$saveLimits$1", f = "EditTimeLimitsViewModel.kt", l = {125}, m = "invokeSuspend", v = 2)
public final class luf extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ muf b;

    public static final class a<T> implements myh {
        public final /* synthetic */ muf a;

        /* JADX INFO: renamed from: luf$a$a, reason: collision with other inner class name */
        @c0d(c = "com.sportybet.android.limits.edit.viewmodel.EditTimeLimitsViewModel$saveLimits$1$1", f = "EditTimeLimitsViewModel.kt", l = {133, 141}, m = "emit", v = 2)
        public static final class C0838a extends x1b {
            public /* synthetic */ Object a;
            public final /* synthetic */ a<T> b;
            public int c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0838a(a<? super T> aVar, v1b<? super C0838a> v1bVar) {
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

        public a(muf mufVar) {
            this.a = mufVar;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0074, code lost:
        
            if (r14.emit(r15, r0) == r1) goto L33;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x009f, code lost:
        
            if (r14.emit(r15, r0) == r1) goto L33;
         */
        @Override // defpackage.myh
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(defpackage.lk50<com.sportybet.repository.limits.model.SaveLimitsResponse> r14, defpackage.v1b<? super kotlin.Unit> r15) {
            /*
                r13 = this;
                boolean r0 = r15 instanceof luf.a.C0838a
                if (r0 == 0) goto L13
                r0 = r15
                luf$a$a r0 = (luf.a.C0838a) r0
                int r1 = r0.c
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.c = r1
                goto L18
            L13:
                luf$a$a r0 = new luf$a$a
                r0.<init>(r13, r15)
            L18:
                java.lang.Object r15 = r0.a
                y5b r1 = defpackage.y5b.a
                int r2 = r0.c
                r3 = 2
                r4 = 1
                r5 = 0
                muf r13 = r13.a
                if (r2 == 0) goto L38
                if (r2 == r4) goto L34
                if (r2 != r3) goto L2e
                defpackage.uj50.b(r15)
                goto La2
            L2e:
                java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.ib5.a(r13)
                return r5
            L34:
                defpackage.uj50.b(r15)
                goto L77
            L38:
                defpackage.uj50.b(r15)
                boolean r15 = r14 instanceof lk50.b
                if (r15 == 0) goto L59
                juf$c r6 = r13.z1()
                if (r6 == 0) goto Lbb
                wwd0 r13 = r13.a
                r11 = 1
                r12 = 127(0x7f, float:1.78E-43)
                r7 = 0
                r8 = 0
                r9 = 0
                r10 = 0
                juf$c r14 = juf.c.a(r6, r7, r8, r9, r10, r11, r12)
                r13.getClass()
                r13.k(r5, r14)
                goto Lbb
            L59:
                boolean r15 = r14 instanceof lk50.a
                if (r15 == 0) goto L91
                b390 r14 = r13.c
                o990 r15 = new o990
                com.sporty.android.common_ui.uitext.StringUiText r2 = defpackage.vch0.a
                com.sporty.android.common_ui.uitext.ResourceUiText r2 = new com.sporty.android.common_ui.uitext.ResourceUiText
                r3 = 2132018156(0x7f1403ec, float:1.967461E38)
                r2.<init>(r3)
                r15.<init>(r2)
                r0.c = r4
                java.lang.Object r14 = r14.emit(r15, r0)
                if (r14 != r1) goto L77
                goto La1
            L77:
                juf$c r6 = r13.z1()
                if (r6 == 0) goto Lbb
                wwd0 r13 = r13.a
                r11 = 0
                r12 = 127(0x7f, float:1.78E-43)
                r7 = 0
                r8 = 0
                r9 = 0
                r10 = 0
                juf$c r14 = juf.c.a(r6, r7, r8, r9, r10, r11, r12)
                r13.getClass()
                r13.k(r5, r14)
                goto Lbb
            L91:
                boolean r14 = r14 instanceof lk50.c
                if (r14 == 0) goto Lbe
                b390 r14 = r13.c
                ssf$a r15 = ssf.a.a
                r0.c = r3
                java.lang.Object r14 = r14.emit(r15, r0)
                if (r14 != r1) goto La2
            La1:
                return r1
            La2:
                juf$c r6 = r13.z1()
                if (r6 == 0) goto Lbb
                wwd0 r13 = r13.a
                r11 = 0
                r12 = 127(0x7f, float:1.78E-43)
                r7 = 0
                r8 = 0
                r9 = 0
                r10 = 0
                juf$c r14 = juf.c.a(r6, r7, r8, r9, r10, r11, r12)
                r13.getClass()
                r13.k(r5, r14)
            Lbb:
                kotlin.Unit r13 = kotlin.Unit.a
                return r13
            Lbe:
                defpackage.uhc.a()
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: luf.a.emit(lk50, v1b):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public luf(muf mufVar, v1b<? super luf> v1bVar) {
        super(2, v1bVar);
        this.b = mufVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new luf(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((luf) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Integer num;
        Integer num2;
        ijf0 ijf0Var;
        String str;
        Integer numValueOf;
        ijf0 ijf0Var2;
        String str2;
        Integer numValueOf2;
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            muf mufVar = this.b;
            bt60 bt60Var = mufVar.i;
            juf.c cVarZ1 = mufVar.z1();
            if (cVarZ1 == null || (ijf0Var2 = cVarZ1.c) == null || (str2 = ijf0Var2.a.b) == null) {
                num = null;
            } else {
                try {
                    numValueOf2 = Integer.valueOf(Integer.parseInt(str2));
                } catch (NumberFormatException unused) {
                    numValueOf2 = null;
                }
                num = numValueOf2;
            }
            juf.c cVarZ2 = mufVar.z1();
            if (cVarZ2 == null || (ijf0Var = cVarZ2.f) == null || (str = ijf0Var.a.b) == null) {
                num2 = null;
            } else {
                try {
                    numValueOf = Integer.valueOf(Integer.parseInt(str));
                } catch (NumberFormatException unused2) {
                    numValueOf = null;
                }
                num2 = numValueOf;
            }
            des desVar = bt60Var.a;
            rcs.a aVar = rcs.b;
            sl50 sl50Var = new sl50(bm50.b(desVar.q(new SaveLimitsRequest(Integer.parseInt("4"), null, num, num2, null, 18, null)), vch0.b));
            at60 at60Var = new at60(bt60Var, null);
            a aVar2 = new a(mufVar);
            this.a = 1;
            Object objCollect = sl50Var.collect(new g1i.a(aVar2, at60Var), this);
            if (objCollect != y5b.a) {
                objCollect = Unit.a;
            }
            if (objCollect == y5bVar) {
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
