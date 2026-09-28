package defpackage;

import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes8.dex */
@c0d(c = "com.sportygames.stacker.presentation.StackerViewModel$observeStackerDialogs$1", f = "StackerViewModel.kt", l = {192, 192}, m = "invokeSuspend", v = 1)
public final class lqd0 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ tqd0 b;

    public static final class a<T> implements myh {
        public final /* synthetic */ tqd0 a;

        public a(tqd0 tqd0Var) {
            this.a = tqd0Var;
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
            Object obj2;
            Object lmxVar;
            Object nsf0Var;
            kni0 xl2Var;
            wld0 wld0Var = (wld0) obj;
            tqd0 tqd0Var = this.a;
            wwd0 wwd0Var = tqd0Var.H;
            String str = tqd0Var.D;
            wld0Var.getClass();
            str.getClass();
            if (wld0Var.equals(evx.a)) {
                obj2 = xxx.a;
            } else {
                if (wld0Var.equals(zv.a)) {
                    lmxVar = new xv(str);
                } else if (wld0Var.equals(emj.a)) {
                    lmxVar = new cmj(str);
                } else {
                    if (wld0Var instanceof imj) {
                        imj imjVar = (imj) wld0Var;
                        nsf0Var = new gmj(imjVar.a, str, imjVar.b);
                    } else if (wld0Var.equals(dmm.a)) {
                        obj2 = tlm.a;
                    } else if (wld0Var.equals(jg80.a)) {
                        lmxVar = new hg80(str);
                    } else if (wld0Var instanceof rsf0) {
                        rsf0 rsf0Var = (rsf0) wld0Var;
                        psf0 psf0Var = rsf0Var.a;
                        int i = 0;
                        if (psf0Var instanceof krd0) {
                            krd0 krd0Var = (krd0) psf0Var;
                            String str2 = krd0Var.a;
                            String str3 = krd0Var.b;
                            ArrayList arrayList = krd0Var.c;
                            ArrayList arrayList2 = new ArrayList(l48.r(arrayList, 10));
                            int size = arrayList.size();
                            while (i < size) {
                                Object obj3 = arrayList.get(i);
                                i++;
                                arrayList2.add(gp20.a((xmd0) obj3));
                            }
                            xl2Var = new mrd0(a4h.f(arrayList2), str2, str3);
                        } else if (psf0Var instanceof vl2) {
                            vl2 vl2Var = (vl2) psf0Var;
                            String str4 = vl2Var.a;
                            String str5 = vl2Var.b;
                            String str6 = vl2Var.c;
                            ArrayList arrayList3 = vl2Var.d;
                            ArrayList arrayList4 = new ArrayList(l48.r(arrayList3, 10));
                            int size2 = arrayList3.size();
                            while (i < size2) {
                                Object obj4 = arrayList3.get(i);
                                i++;
                                arrayList4.add(gp20.a((xmd0) obj4));
                            }
                            xl2Var = new xl2(str4, str5, str6, a4h.f(arrayList4));
                        } else {
                            xl2Var = mrf0.b;
                        }
                        nsf0Var = new nsf0(str, xl2Var, rsf0Var.b);
                    } else if (wld0Var.equals(nmx.a)) {
                        lmxVar = new lmx(str);
                    } else if (wld0Var.equals(dzs.a)) {
                        obj2 = bzs.a;
                    } else {
                        if (!wld0Var.equals(zzi.a)) {
                            uhc.a();
                            return null;
                        }
                        obj2 = xzi.a;
                    }
                    obj2 = nsf0Var;
                }
                obj2 = lmxVar;
            }
            wwd0Var.setValue(obj2);
            Unit unit = Unit.a;
            y5b y5bVar = y5b.a;
            return unit;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lqd0(tqd0 tqd0Var, v1b<? super lqd0> v1bVar) {
        super(2, v1bVar);
        this.b = tqd0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new lqd0(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        ((lqd0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        return y5b.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0038, code lost:
    
        if (((defpackage.a390) r7).collect(r1, r6) == r0) goto L15;
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
            r2 = 0
            tqd0 r3 = r6.b
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L1d
            if (r1 == r5) goto L19
            if (r1 == r4) goto L15
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r6)
            return r2
        L15:
            defpackage.uj50.b(r7)
            goto L3b
        L19:
            defpackage.uj50.b(r7)
            goto L2b
        L1d:
            defpackage.uj50.b(r7)
            wtm r7 = r3.v
            r6.a = r5
            b390 r7 = r7.invoke()
            if (r7 != r0) goto L2b
            goto L3a
        L2b:
            a390 r7 = (defpackage.a390) r7
            lqd0$a r1 = new lqd0$a
            r1.<init>(r3)
            r6.a = r4
            java.lang.Object r6 = r7.collect(r1, r6)
            if (r6 != r0) goto L3b
        L3a:
            return r0
        L3b:
            defpackage.fkd.a()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lqd0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
