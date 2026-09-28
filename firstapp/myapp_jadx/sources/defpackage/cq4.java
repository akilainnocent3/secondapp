package defpackage;

import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.bonuscup.presentation.BonusCupViewModel$observeDialogs$1", f = "BonusCupViewModel.kt", l = {167, 167}, m = "invokeSuspend", v = 1)
public final class cq4 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ qq4 b;

    public static final class a<T> implements myh {
        public final /* synthetic */ qq4 a;

        public a(qq4 qq4Var) {
            this.a = qq4Var;
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
            Object ulmVar;
            Object mmxVar;
            Object lsf0Var;
            b3 yl2Var;
            bj4 bj4Var = (bj4) obj;
            qq4 qq4Var = this.a;
            wwd0 wwd0Var = qq4Var.H;
            String str = qq4Var.B;
            bj4Var.getClass();
            str.getClass();
            if (bj4Var.equals(fvx.a)) {
                ulmVar = yxx.a;
            } else {
                if (bj4Var.equals(aw.a)) {
                    mmxVar = new vv(str);
                } else if (bj4Var.equals(fmj.a)) {
                    mmxVar = new dmj(str);
                } else {
                    if (bj4Var instanceof jmj) {
                        jmj jmjVar = (jmj) bj4Var;
                        lsf0Var = new hmj(jmjVar.a, str, jmjVar.b);
                    } else {
                        int i = 0;
                        if (bj4Var.equals(emm.a)) {
                            ulmVar = new ulm(false);
                        } else if (bj4Var.equals(kg80.a)) {
                            mmxVar = new ig80(str);
                        } else if (bj4Var instanceof ssf0) {
                            ssf0 ssf0Var = (ssf0) bj4Var;
                            qsf0 qsf0Var = ssf0Var.a;
                            if (qsf0Var instanceof lrd0) {
                                lrd0 lrd0Var = (lrd0) qsf0Var;
                                String str2 = lrd0Var.a;
                                String str3 = lrd0Var.b;
                                ArrayList arrayList = lrd0Var.c;
                                ArrayList arrayList2 = new ArrayList(l48.r(arrayList, 10));
                                int size = arrayList.size();
                                while (i < size) {
                                    Object obj2 = arrayList.get(i);
                                    i++;
                                    arrayList2.add(u57.a((nk4) obj2));
                                }
                                yl2Var = new nrd0(a4h.f(arrayList2), str2, str3);
                            } else if (qsf0Var instanceof wl2) {
                                wl2 wl2Var = (wl2) qsf0Var;
                                String str4 = wl2Var.a;
                                String str5 = wl2Var.b;
                                String str6 = wl2Var.c;
                                ArrayList arrayList3 = wl2Var.d;
                                ArrayList arrayList4 = new ArrayList(l48.r(arrayList3, 10));
                                int size2 = arrayList3.size();
                                while (i < size2) {
                                    Object obj3 = arrayList3.get(i);
                                    i++;
                                    arrayList4.add(u57.a((nk4) obj3));
                                }
                                yl2Var = new yl2(str4, str5, str6, a4h.f(arrayList4));
                            } else {
                                yl2Var = nrf0.c;
                            }
                            lsf0Var = new lsf0(str, yl2Var, ssf0Var.b);
                        } else if (bj4Var.equals(omx.a)) {
                            mmxVar = new mmx(str);
                        } else if (bj4Var.equals(ezs.a)) {
                            ulmVar = czs.a;
                        } else if (bj4Var.equals(a0j.a)) {
                            ulmVar = yzi.a;
                        } else {
                            if (!bj4Var.equals(fn50.a)) {
                                uhc.a();
                                return null;
                            }
                            ulmVar = cn50.a;
                        }
                    }
                    ulmVar = lsf0Var;
                }
                ulmVar = mmxVar;
            }
            wwd0Var.setValue(ulmVar);
            Unit unit = Unit.a;
            y5b y5bVar = y5b.a;
            return unit;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cq4(qq4 qq4Var, v1b<? super cq4> v1bVar) {
        super(2, v1bVar);
        this.b = qq4Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new cq4(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        ((cq4) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
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
            qq4 r3 = r6.b
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
            ntm r7 = r3.v
            r6.a = r5
            b390 r7 = r7.invoke()
            if (r7 != r0) goto L2b
            goto L3a
        L2b:
            a390 r7 = (defpackage.a390) r7
            cq4$a r1 = new cq4$a
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cq4.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
