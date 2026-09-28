package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "com.sportybet.android.limits.edit.viewmodel.EditTimeLimitsViewModel$loadLimits$1", f = "EditTimeLimitsViewModel.kt", l = {43, 48}, m = "invokeSuspend", v = 2)
public final class kuf extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ muf b;

    public static final class a<T> implements myh {
        public final /* synthetic */ muf a;

        public a(muf mufVar) {
            this.a = mufVar;
        }

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
            juf cVar;
            lk50 lk50Var = (lk50) obj;
            muf mufVar = this.a;
            wwd0 wwd0Var = mufVar.a;
            if (lk50Var instanceof lk50.c) {
                int i = mufVar.z;
                fwf0 fwf0Var = (fwf0) ((lk50.c) lk50Var).a;
                Integer num = fwf0Var.a;
                Integer num2 = fwf0Var.c;
                ijf0 ijf0Var = new ijf0(nuf.a(num), 0L, 6);
                String strA = nuf.a(fwf0Var.a);
                ijf0 ijf0Var2 = new ijf0(nuf.a(num2), 0L, 6);
                String strA2 = nuf.a(num2);
                if ((200 & 1) != 0) {
                    i = 0;
                }
                String str = (200 & 2) != 0 ? "" : strA;
                if ((200 & 4) != 0) {
                    ijf0Var = new ijf0((String) null, 0L, 7);
                }
                String str2 = (200 & 16) != 0 ? "" : strA2;
                if ((200 & 32) != 0) {
                    ijf0Var2 = new ijf0((String) null, 0L, 7);
                }
                cVar = new juf.c(i, str, ijf0Var, null, str2, ijf0Var2, null, false);
            } else if (lk50Var instanceof lk50.a) {
                cVar = juf.a.a;
            } else {
                if (!(lk50Var instanceof lk50.b)) {
                    uhc.a();
                    return null;
                }
                cVar = juf.b.a;
            }
            wwd0Var.setValue(cVar);
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kuf(muf mufVar, v1b<? super kuf> v1bVar) {
        super(2, v1bVar);
        this.b = mufVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new kuf(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((kuf) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0058, code lost:
    
        if (r3.collect(r7, r6) == r0) goto L15;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            y5b r0 = defpackage.y5b.a
            int r1 = r6.a
            r2 = 2
            r3 = 1
            muf r4 = r6.b
            if (r1 == 0) goto L1d
            if (r1 == r3) goto L19
            if (r1 != r2) goto L12
            defpackage.uj50.b(r7)
            goto L5b
        L12:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r6)
            r6 = 0
            return r6
        L19:
            defpackage.uj50.b(r7)
            goto L2b
        L1d:
            defpackage.uj50.b(r7)
            w8k r7 = r4.f
            r6.a = r3
            java.lang.Object r7 = r7.a(r6)
            if (r7 != r0) goto L2b
            goto L5a
        L2b:
            w8k$a r7 = (w8k.a) r7
            int r7 = r7.a
            r4.z = r7
            r7 = 1440(0x5a0, float:2.018E-42)
            r4.A = r7
            r7 = 10080(0x2760, float:1.4125E-41)
            r4.B = r7
            qfk r7 = r4.e
            des r1 = r7.a
            or60 r1 = r1.c()
            com.sporty.android.common_ui.uitext.ResourceUiText r3 = defpackage.vch0.b
            yzh r1 = defpackage.bm50.b(r1, r3)
            pfk r3 = new pfk
            r5 = 0
            r3.<init>(r1, r5, r7)
            kuf$a r7 = new kuf$a
            r7.<init>(r4)
            r6.a = r2
            java.lang.Object r6 = r3.collect(r7, r6)
            if (r6 != r0) goto L5b
        L5a:
            return r0
        L5b:
            kotlin.Unit r6 = kotlin.Unit.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kuf.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
