package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.luckynumber.shared.presentation.LuckyNumberViewModel$4", f = "LuckyNumberViewModel.kt", l = {76}, m = "invokeSuspend", v = 2)
public final class c8u extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ f8u b;

    @c0d(c = "com.sportybet.feature.luckynumber.shared.presentation.LuckyNumberViewModel$4$1", f = "LuckyNumberViewModel.kt", l = {83, 85}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<j7q.a, v1b<? super Unit>, Object> {
        public int a;
        public /* synthetic */ Object b;
        public final /* synthetic */ f8u c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(f8u f8uVar, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.c = f8uVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            a aVar = new a(this.c, v1bVar);
            aVar.b = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(j7q.a aVar, v1b<? super Unit> v1bVar) {
            return ((a) create(aVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x004f, code lost:
        
            if (r0.a.emit(r1, r7) == r2) goto L21;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x006b, code lost:
        
            if (r0.a.emit(r8, r7) == r2) goto L21;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x006d, code lost:
        
            return r2;
         */
        @Override // defpackage.pz1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                f8u r0 = r7.c
                ku90<f7q> r0 = r0.z
                java.lang.Object r1 = r7.b
                j7q$a r1 = (j7q.a) r1
                y5b r2 = defpackage.y5b.a
                int r3 = r7.a
                r4 = 1
                r5 = 2
                r6 = 0
                if (r3 == 0) goto L20
                if (r3 == r4) goto L1c
                if (r3 != r5) goto L16
                goto L1c
            L16:
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.ib5.a(r7)
                return r6
            L1c:
                defpackage.uj50.b(r8)
                goto L6e
            L20:
                defpackage.uj50.b(r8)
                boolean r8 = r1.b
                if (r8 == 0) goto L52
                boolean r8 = r1.a
                if (r8 == 0) goto L36
                com.sporty.android.common_ui.uitext.StringUiText r8 = defpackage.vch0.a
                com.sporty.android.common_ui.uitext.ResourceUiText r8 = new com.sporty.android.common_ui.uitext.ResourceUiText
                r1 = 2132022363(0x7f14145b, float:1.9683144E38)
                r8.<init>(r1)
                goto L40
            L36:
                com.sporty.android.common_ui.uitext.StringUiText r8 = defpackage.vch0.a
                com.sporty.android.common_ui.uitext.ResourceUiText r8 = new com.sporty.android.common_ui.uitext.ResourceUiText
                r1 = 2132022474(0x7f1414ca, float:1.9683369E38)
                r8.<init>(r1)
            L40:
                f7q$i r1 = new f7q$i
                r1.<init>(r8, r4)
                r7.b = r6
                r7.a = r4
                b390 r8 = r0.a
                java.lang.Object r7 = r8.emit(r1, r7)
                if (r7 != r2) goto L6e
                goto L6d
            L52:
                f7q$i r8 = new f7q$i
                com.sporty.android.common_ui.uitext.StringUiText r1 = defpackage.vch0.a
                com.sporty.android.common_ui.uitext.ResourceUiText r1 = new com.sporty.android.common_ui.uitext.ResourceUiText
                r3 = 2132018157(0x7f1403ed, float:1.9674613E38)
                r1.<init>(r3)
                r8.<init>(r1, r4)
                r7.b = r6
                r7.a = r5
                b390 r0 = r0.a
                java.lang.Object r7 = r0.emit(r8, r7)
                if (r7 != r2) goto L6e
            L6d:
                return r2
            L6e:
                kotlin.Unit r7 = kotlin.Unit.a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: c8u.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c8u(f8u f8uVar, v1b<? super c8u> v1bVar) {
        super(2, v1bVar);
        this.b = f8uVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new c8u(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((c8u) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            f8u f8uVar = this.b;
            t340 t340Var = f8uVar.i.e;
            a aVar = new a(f8uVar, null);
            this.a = 1;
            if (kzh.b(t340Var, aVar, this) == y5bVar) {
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
