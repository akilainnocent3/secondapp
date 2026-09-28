package defpackage;

import com.sporty.android.core.model.service.CountryCodeName;
import com.sportybet.android.social.data.remote.entity.AliasCodeList;
import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
public final class qcc implements lyh<jdc> {
    public final /* synthetic */ o0i a;
    public final /* synthetic */ bdc b;

    @c0d(c = "com.sportybet.android.social.domain.viewmodel.CustomCodeViewModel$createCustomCode$$inlined$map$1", f = "CustomCodeViewModel.kt", l = {109}, m = "collect", v = 2)
    public static final class a extends x1b {
        public /* synthetic */ Object a;
        public int b;

        public a(v1b v1bVar) {
            super(v1bVar);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            this.a = obj;
            this.b |= Integer.MIN_VALUE;
            return qcc.this.collect(null, this);
        }
    }

    public static final class b<T> implements myh {
        public final /* synthetic */ myh a;
        public final /* synthetic */ bdc b;

        @c0d(c = "com.sportybet.android.social.domain.viewmodel.CustomCodeViewModel$createCustomCode$$inlined$map$1$2", f = "CustomCodeViewModel.kt", l = {50}, m = "emit", v = 2)
        public static final class a extends x1b {
            public /* synthetic */ Object a;
            public int b;

            public a(v1b v1bVar) {
                super(v1bVar);
            }

            @Override // defpackage.pz1
            public final Object invokeSuspend(Object obj) {
                this.a = obj;
                this.b |= Integer.MIN_VALUE;
                return b.this.emit(null, this);
            }
        }

        public b(myh myhVar, bdc bdcVar) {
            this.a = myhVar;
            this.b = bdcVar;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
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
            a aVar;
            Object cVar;
            Object bVar;
            if (v1bVar instanceof a) {
                aVar = (a) v1bVar;
                int i = aVar.b;
                if ((i & Integer.MIN_VALUE) != 0) {
                    aVar.b = i - Integer.MIN_VALUE;
                } else {
                    aVar = new a(v1bVar);
                }
            } else {
                aVar = new a(v1bVar);
            }
            Object obj2 = aVar.a;
            y5b y5bVar = y5b.a;
            int i2 = aVar.b;
            if (i2 == 0) {
                uj50.b(obj2);
                lk50 lk50Var = (lk50) obj;
                boolean z = lk50Var instanceof lk50.c;
                bdc bdcVar = this.b;
                if (z) {
                    wwd0 wwd0Var = bdcVar.y;
                    psm psmVar = bdcVar.v;
                    cVar = (jdc) wwd0Var.getValue();
                    if (cVar instanceof jdc.a) {
                        AliasCodeList aliasCodeList = (AliasCodeList) ((lk50.c) lk50Var).a;
                        CountryCodeName countryCode = psmVar.getCountryCode();
                        jdc.a aVar2 = (jdc.a) cVar;
                        hdc hdcVar = aVar2.a;
                        hdc hdcVarB = k9c.b(aliasCodeList, countryCode, hdcVar.c, hdcVar.d);
                        ngs ngsVarB = kotlin.collections.a.b();
                        ngsVarB.addAll(hdcVar.a);
                        ngsVarB.addAll(hdcVarB.a);
                        bVar = new jdc.a(hdc.a(hdcVarB, i8c.c(kotlin.collections.a.a(ngsVarB)), false, 14), aVar2.b);
                    } else if (cVar instanceof jdc.d) {
                        AliasCodeList aliasCodeList2 = (AliasCodeList) ((lk50.c) lk50Var).a;
                        CountryCodeName countryCode2 = psmVar.getCountryCode();
                        jdc.d dVar = (jdc.d) cVar;
                        hdc hdcVar2 = dVar.a;
                        hdc hdcVarB2 = k9c.b(aliasCodeList2, countryCode2, hdcVar2.c, hdcVar2.d);
                        ngs ngsVarB2 = kotlin.collections.a.b();
                        ngsVarB2.addAll(hdcVar2.a);
                        ngsVarB2.addAll(hdcVarB2.a);
                        bVar = new jdc.d(hdc.a(hdcVarB2, i8c.c(kotlin.collections.a.a(ngsVarB2)), false, 14), dVar.b);
                    } else if (cVar instanceof jdc.b) {
                        AliasCodeList aliasCodeList3 = (AliasCodeList) ((lk50.c) lk50Var).a;
                        CountryCodeName countryCode3 = psmVar.getCountryCode();
                        jdc.b bVar2 = (jdc.b) cVar;
                        hdc hdcVar3 = bVar2.a;
                        hdc hdcVarB3 = k9c.b(aliasCodeList3, countryCode3, hdcVar3.c, hdcVar3.d);
                        ngs ngsVarB3 = kotlin.collections.a.b();
                        ngsVarB3.addAll(hdcVar3.a);
                        ngsVarB3.addAll(hdcVarB3.a);
                        bVar = new jdc.d(hdc.a(hdcVarB3, i8c.c(kotlin.collections.a.a(ngsVarB3)), false, 14), bVar2.b);
                    }
                    cVar = bVar;
                } else if (lk50Var instanceof lk50.a) {
                    lk50.a aVar3 = (lk50.a) lk50Var;
                    cVar = new jdc.c(aVar3.a, aVar3.b);
                } else {
                    if (!(lk50Var instanceof lk50.b)) {
                        uhc.a();
                        return null;
                    }
                    cVar = (jdc) bdcVar.y.getValue();
                    if (cVar instanceof jdc.a) {
                        jdc.a aVar4 = (jdc.a) cVar;
                        bVar = new jdc.a(hdc.a(aVar4.a, null, true, 15), aVar4.b);
                    } else if (cVar instanceof jdc.d) {
                        jdc.d dVar2 = (jdc.d) cVar;
                        bVar = new jdc.d(hdc.a(dVar2.a, null, true, 15), dVar2.b);
                    } else if (cVar instanceof jdc.b) {
                        jdc.b bVar3 = (jdc.b) cVar;
                        bVar = new jdc.b(hdc.a(bVar3.a, null, true, 15), bVar3.b);
                    }
                    cVar = bVar;
                }
                aVar.b = 1;
                if (this.a.emit(cVar, aVar) == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i2 != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj2);
            }
            return Unit.a;
        }
    }

    public qcc(o0i o0iVar, bdc bdcVar) {
        this.a = o0iVar;
        this.b = bdcVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.lyh
    public final Object collect(myh<? super jdc> myhVar, v1b v1bVar) {
        a aVar;
        if (v1bVar instanceof a) {
            aVar = (a) v1bVar;
            int i = aVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                aVar.b = i - Integer.MIN_VALUE;
            } else {
                aVar = new a(v1bVar);
            }
        } else {
            aVar = new a(v1bVar);
        }
        Object obj = aVar.a;
        y5b y5bVar = y5b.a;
        int i2 = aVar.b;
        if (i2 == 0) {
            uj50.b(obj);
            b bVar = new b(myhVar, this.b);
            aVar.b = 1;
            if (this.a.collect(bVar, aVar) == y5bVar) {
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
