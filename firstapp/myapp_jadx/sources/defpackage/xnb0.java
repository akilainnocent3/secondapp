package defpackage;

import com.google.protobuf.DescriptorProtos;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.sportydesk.viewmodel.SportyDeskViewModel$login$1", f = "SportyDeskViewModel.kt", l = {DescriptorProtos.FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER, DescriptorProtos.FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER}, m = "invokeSuspend", v = 2)
public final class xnb0 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ ynb0 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;

    public static final class a<T> implements myh {
        public final /* synthetic */ ynb0 a;

        public a(ynb0 ynb0Var) {
            this.a = ynb0Var;
        }

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
            Object value;
            Object aVar;
            rit ritVar = (rit) obj;
            wwd0 wwd0Var = this.a.e;
            do {
                value = wwd0Var.getValue();
                if (ritVar instanceof rit.b) {
                    rit.b bVar = (rit.b) ritVar;
                    aVar = new mft.d(bVar.a, bVar.b);
                } else {
                    if (!(ritVar instanceof rit.a)) {
                        uhc.a();
                        return null;
                    }
                    rit.a aVar2 = (rit.a) ritVar;
                    aVar = new mft.a(aVar2.a, aVar2.b);
                }
            } while (!wwd0Var.g(value, aVar));
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xnb0(ynb0 ynb0Var, String str, String str2, v1b<? super xnb0> v1bVar) {
        super(2, v1bVar);
        this.b = ynb0Var;
        this.c = str;
        this.d = str2;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new xnb0(this.b, this.c, this.d, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((xnb0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0088, code lost:
    
        if (((defpackage.lyh) r8).collect(r1, r7) == r0) goto L23;
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
            int r1 = r7.a
            r2 = 0
            r3 = 2
            r4 = 1
            ynb0 r5 = r7.b
            if (r1 == 0) goto L1e
            if (r1 == r4) goto L1a
            if (r1 != r3) goto L14
            defpackage.uj50.b(r8)
            goto L8b
        L14:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r7)
            return r2
        L1a:
            defpackage.uj50.b(r8)
            goto L7b
        L1e:
            defpackage.uj50.b(r8)
            wwd0 r8 = r5.e
        L23:
            java.lang.Object r1 = r8.getValue()
            r6 = r1
            mft r6 = (defpackage.mft) r6
            mft$c r6 = mft.c.a
            boolean r1 = r8.g(r1, r6)
            if (r1 == 0) goto L23
            djt r8 = r5.a
            r7.a = r4
            r8.getClass()
            java.lang.String r1 = r7.c
            java.lang.CharSequence r1 = kotlin.text.StringsKt.t0(r1)
            java.lang.String r1 = r1.toString()
            java.lang.String r4 = r7.d
            java.lang.CharSequence r4 = kotlin.text.StringsKt.t0(r4)
            java.lang.String r4 = r4.toString()
            psm r6 = r8.c
            boolean r6 = r6.r()
            if (r6 == 0) goto L61
            lwm r6 = r8.a
            lyh r4 = r6.m(r1, r4)
            bjt r6 = new bjt
            r6.<init>(r4, r8)
            goto L67
        L61:
            lyz r6 = r8.b
            lyh r6 = r6.h(r1, r4)
        L67:
            zit r4 = new zit
            r4.<init>(r6, r8, r1)
            ajt r8 = new ajt
            r1 = 3
            r8.<init>(r1, r2)
            yzh r1 = new yzh
            r1.<init>(r4, r8)
            if (r1 != r0) goto L7a
            goto L8a
        L7a:
            r8 = r1
        L7b:
            lyh r8 = (defpackage.lyh) r8
            xnb0$a r1 = new xnb0$a
            r1.<init>(r5)
            r7.a = r3
            java.lang.Object r7 = r8.collect(r1, r7)
            if (r7 != r0) goto L8b
        L8a:
            return r0
        L8b:
            kotlin.Unit r7 = kotlin.Unit.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xnb0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
