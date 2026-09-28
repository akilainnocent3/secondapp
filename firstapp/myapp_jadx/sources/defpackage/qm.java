package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.luckynumber.placebet.presentation.AdvancedSequentialBottomSheetKt$AdvancedSequentialBottomSheet$2$1", f = "AdvancedSequentialBottomSheet.kt", l = {68}, m = "invokeSuspend", v = 2)
public final class qm extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ z2q b;
    public final /* synthetic */ i20<i590> c;

    @c0d(c = "com.sportybet.feature.luckynumber.placebet.presentation.AdvancedSequentialBottomSheetKt$AdvancedSequentialBottomSheet$2$1$1", f = "AdvancedSequentialBottomSheet.kt", l = {70, 72}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<Boolean, v1b<? super Unit>, Object> {
        public int a;
        public /* synthetic */ boolean b;
        public final /* synthetic */ i20<i590> c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(i20<i590> i20Var, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.c = i20Var;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            a aVar = new a(this.c, v1bVar);
            aVar.b = ((Boolean) obj).booleanValue();
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Boolean bool, v1b<? super Unit> v1bVar) {
            Boolean bool2 = bool;
            bool2.booleanValue();
            return ((a) create(bool2, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x002b, code lost:
        
            if (androidx.compose.foundation.gestures.a.e(r6, r2, r5) == r1) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0038, code lost:
        
            if (androidx.compose.foundation.gestures.a.e(r6, r2, r5) == r1) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x003a, code lost:
        
            return r1;
         */
        @Override // defpackage.pz1
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                boolean r0 = r5.b
                y5b r1 = defpackage.y5b.a
                int r2 = r5.a
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L1a
                if (r2 == r4) goto L16
                if (r2 != r3) goto Lf
                goto L16
            Lf:
                java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                defpackage.ib5.a(r5)
                r5 = 0
                return r5
            L16:
                defpackage.uj50.b(r6)
                goto L3b
            L1a:
                defpackage.uj50.b(r6)
                i20<i590> r6 = r5.c
                if (r0 == 0) goto L2e
                i590 r2 = defpackage.i590.b
                r5.b = r0
                r5.a = r4
                java.lang.Object r5 = androidx.compose.foundation.gestures.a.e(r6, r2, r5)
                if (r5 != r1) goto L3b
                goto L3a
            L2e:
                i590 r2 = defpackage.i590.a
                r5.b = r0
                r5.a = r3
                java.lang.Object r5 = androidx.compose.foundation.gestures.a.e(r6, r2, r5)
                if (r5 != r1) goto L3b
            L3a:
                return r1
            L3b:
                kotlin.Unit r5 = kotlin.Unit.a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: qm.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qm(z2q z2qVar, i20<i590> i20Var, v1b<? super qm> v1bVar) {
        super(2, v1bVar);
        this.b = z2qVar;
        this.c = i20Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new qm(this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((qm) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            t340 t340Var = this.b.b;
            a aVar = new a(this.c, null);
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
