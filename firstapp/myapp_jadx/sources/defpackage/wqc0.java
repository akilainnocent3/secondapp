package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.common_ui.uitext.UiText;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.instantwin.newtork.model.response.BetBuilderConfig;
import com.sportybet.android.instantwin.presentation.legends.d;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes5.dex */
public final class wqc0 implements lyh<lqc0> {
    public final /* synthetic */ lyh[] a;
    public final /* synthetic */ d b;

    @c0d(c = "com.sportybet.android.instantwin.presentation.legends.SportyLegendsViewModel$special$$inlined$combine$1", f = "SportyLegendsViewModel.kt", l = {109}, m = "collect", v = 2)
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
            return wqc0.this.collect(null, this);
        }
    }

    public static final class b implements Function0<Object[]> {
        public final /* synthetic */ lyh[] a;

        public b(lyh[] lyhVarArr) {
            this.a = lyhVarArr;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object[] invoke() {
            return new Object[this.a.length];
        }
    }

    @c0d(c = "com.sportybet.android.instantwin.presentation.legends.SportyLegendsViewModel$special$$inlined$combine$1$3", f = "SportyLegendsViewModel.kt", l = {234}, m = "invokeSuspend", v = 2)
    public static final class c extends tje0 implements gaj<myh<? super lqc0>, Object[], v1b<? super Unit>, Object> {
        public int a;
        public /* synthetic */ myh b;
        public /* synthetic */ Object[] c;
        public final /* synthetic */ d d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(v1b v1bVar, d dVar) {
            super(3, v1bVar);
            this.d = dVar;
        }

        @Override // defpackage.gaj
        public final Object invoke(myh<? super lqc0> myhVar, Object[] objArr, v1b<? super Unit> v1bVar) {
            c cVar = new c(v1bVar, this.d);
            cVar.b = myhVar;
            cVar.c = objArr;
            return cVar.invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code duplicated, block: B:101:0x02ce  */
        /* JADX WARN: Code duplicated, block: B:102:0x02d1  */
        /* JADX WARN: Code duplicated, block: B:105:0x02d7  */
        /* JADX WARN: Code duplicated, block: B:106:0x02da  */
        /* JADX WARN: Code duplicated, block: B:109:0x0312 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:48:0x0216 A[PHI: r49
          0x0216: PHI (r49v2 fqo) = (r49v0 fqo), (r49v0 fqo), (r49v3 fqo) binds: [B:76:0x0266, B:77:0x0268, B:47:0x0214] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:98:0x02c7  */
        /* JADX WARN: Code duplicated, block: B:99:0x02ca  */
        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            ResourceUiText resourceUiText;
            fqo fqoVar;
            boolean z;
            gcc0.a aVar;
            List<ncc0> list;
            BetBuilderConfig betBuilderConfig;
            qac0 qac0Var;
            gcc0 cVar;
            List<icc0> list2;
            boolean z2;
            gcc0 gcc0Var;
            bkc0.c cVar2;
            uhc0 uhc0Var;
            UiText uiText;
            lqc0 lqc0Var;
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                myh myhVar = this.b;
                Object[] objArr = this.c;
                Object obj2 = objArr[0];
                obj2.getClass();
                fqo.c cVar3 = (fqo.c) obj2;
                Object obj3 = objArr[1];
                obj3.getClass();
                bkc0 bkc0Var = (bkc0) obj3;
                bnc0 bnc0Var = (bnc0) objArr[2];
                Object obj4 = objArr[3];
                obj4.getClass();
                String str = (String) obj4;
                Object obj5 = objArr[4];
                obj5.getClass();
                qcn qcnVar = (qcn) obj5;
                Object obj6 = objArr[5];
                obj6.getClass();
                qcn qcnVar2 = (qcn) obj6;
                Object obj7 = objArr[6];
                obj7.getClass();
                String str2 = (String) obj7;
                Object obj8 = objArr[7];
                obj8.getClass();
                qcn qcnVar3 = (qcn) obj8;
                Object obj9 = objArr[8];
                obj9.getClass();
                qcn qcnVar4 = (qcn) obj9;
                ufo ufoVar = (ufo) objArr[9];
                Object obj10 = objArr[10];
                obj10.getClass();
                hm3 hm3Var = (hm3) obj10;
                yc30 yc30Var = (yc30) objArr[11];
                cw3 cw3Var = (cw3) objArr[12];
                ysa ysaVar = (ysa) objArr[13];
                Object obj11 = objArr[14];
                obj11.getClass();
                lni0 lni0Var = (lni0) obj11;
                Object obj12 = objArr[15];
                obj12.getClass();
                zs zsVar = (zs) obj12;
                Object obj13 = objArr[16];
                obj13.getClass();
                zs zsVar2 = (zs) obj13;
                Object obj14 = objArr[17];
                obj14.getClass();
                zs zsVar3 = (zs) obj14;
                Object obj15 = objArr[18];
                obj15.getClass();
                zs zsVar4 = (zs) obj15;
                Object obj16 = objArr[19];
                obj16.getClass();
                zs zsVar5 = (zs) obj16;
                Object obj17 = objArr[20];
                obj17.getClass();
                zs zsVar6 = (zs) obj17;
                Object obj18 = objArr[21];
                obj18.getClass();
                zs zsVar7 = (zs) obj18;
                Object obj19 = objArr[22];
                obj19.getClass();
                boolean zBooleanValue = ((Boolean) obj19).booleanValue();
                Object obj20 = objArr[23];
                obj20.getClass();
                ink inkVar = (ink) obj20;
                Object obj21 = objArr[24];
                obj21.getClass();
                xnc0 xnc0Var = (xnc0) obj21;
                Object obj22 = objArr[25];
                obj22.getClass();
                jqc0 jqc0Var = (jqc0) obj22;
                Object obj23 = objArr[26];
                obj23.getClass();
                boolean zBooleanValue2 = ((Boolean) obj23).booleanValue();
                Object obj24 = objArr[27];
                obj24.getClass();
                qcn qcnVar5 = (qcn) obj24;
                Object obj25 = objArr[28];
                obj25.getClass();
                boolean zBooleanValue3 = ((Boolean) obj25).booleanValue();
                Object obj26 = objArr[29];
                obj26.getClass();
                ii2 ii2Var = (ii2) obj26;
                Object obj27 = objArr[30];
                obj27.getClass();
                ei2 ei2Var = (ei2) obj27;
                xnc0 xnc0Var2 = (xnc0) objArr[31];
                Object obj28 = objArr[32];
                obj28.getClass();
                boolean zBooleanValue4 = ((Boolean) obj28).booleanValue();
                Object obj29 = objArr[33];
                obj29.getClass();
                boolean zBooleanValue5 = ((Boolean) obj29).booleanValue();
                UiText uiText2 = (UiText) objArr[34];
                fqo.a.C0579a c0579a = fqo.a.C0579a.a;
                d dVar = this.d;
                Integer numC = dVar.a.c(dVar.z1());
                if (numC != null) {
                    int iIntValue = numC.intValue();
                    StringUiText stringUiText = vch0.a;
                    resourceUiText = new ResourceUiText(iIntValue);
                } else {
                    resourceUiText = null;
                }
                fqo fqoVar2 = new fqo(R.color.bg_brand_main_primary, c0579a, resourceUiText, cVar3);
                if (zBooleanValue5) {
                    gcc0Var = gcc0.a.a;
                } else if (bkc0Var instanceof bkc0.b) {
                    gcc0Var = gcc0.b.a;
                } else {
                    if (bkc0Var instanceof bkc0.a) {
                        gcc0Var = gcc0.a.a;
                    } else {
                        if (!(bkc0Var instanceof bkc0.c)) {
                            uhc.a();
                            return null;
                        }
                        bkc0.c cVar4 = (bkc0.c) bkc0Var;
                        pjc0 pjc0Var = cVar4.a;
                        uhc0 uhc0Var2 = cVar4.b;
                        int iOrdinal = uhc0Var2.ordinal();
                        if (iOrdinal != 0) {
                            fqoVar = fqoVar2;
                            if (iOrdinal != 1) {
                                uhc.a();
                                return null;
                            }
                            hcc0 hcc0Var = pjc0Var.c;
                            List<icc0> list3 = hcc0Var != null ? hcc0Var.b : null;
                            if (list3 == null) {
                                list3 = m2g.a;
                            }
                            if (list3 != null && list3.isEmpty()) {
                                list2 = list3;
                                z2 = false;
                                break;
                            }
                            Iterator<T> it = list3.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    list2 = list3;
                                    z2 = false;
                                    break;
                                }
                                list2 = list3;
                                if (!((icc0) it.next()).d.isEmpty()) {
                                    z2 = true;
                                    break;
                                }
                                list3 = list2;
                            }
                            if (list2.isEmpty() || !z2) {
                                aVar = gcc0.a.a;
                            } else {
                                aVar = null;
                            }
                        } else {
                            fqoVar = fqoVar2;
                            kdc0 kdc0Var = pjc0Var.e;
                            List<lgc0> list4 = kdc0Var != null ? kdc0Var.b : null;
                            boolean z3 = list4 == null || list4.isEmpty();
                            if (kdc0Var != null && (list = kdc0Var.a) != null && !list.isEmpty()) {
                                Iterator it2 = list.iterator();
                                while (true) {
                                    if (!it2.hasNext()) {
                                        z = false;
                                        break;
                                    }
                                    Iterator it3 = it2;
                                    if (!((ncc0) it2.next()).d.isEmpty()) {
                                        z = true;
                                        break;
                                    }
                                    it2 = it3;
                                }
                            } else {
                                z = false;
                                break;
                            }
                            if (!z3 || z) {
                                aVar = null;
                            } else {
                                aVar = gcc0.a.a;
                            }
                        }
                        if (aVar != null) {
                            cVar = gcc0.a.a;
                        } else {
                            if (uhc0Var2 == uhc0.b && (betBuilderConfig = pjc0Var.d) != null && betBuilderConfig.active) {
                                int i2 = zBooleanValue3 ? R.color.background_type2_secondary : R.color.bg_primary_d_base;
                                StringUiText stringUiText2 = vch0.a;
                                qac0Var = new qac0(new bh2(zBooleanValue3, true, new ResourceUiText(R.string.page_instant_virtual__toggle_off_to_return_regular_betting_mode), i2, R.color.text_inverse_secondary), ii2Var);
                            } else {
                                qac0Var = null;
                            }
                            cVar = new gcc0.c(new fcc0(bnc0Var, str, str2, xnc0Var, qcnVar, qcnVar2, qcnVar3, qcnVar4, jqc0Var, qac0Var, zBooleanValue2, qcnVar5, hm3Var, yc30Var, cw3Var, cVar4.b));
                        }
                    }
                    if (bkc0Var instanceof bkc0.c) {
                        cVar2 = (bkc0.c) bkc0Var;
                    } else {
                        cVar2 = null;
                    }
                    if (cVar2 != null) {
                        uhc0Var = cVar2.b;
                    } else {
                        uhc0Var = null;
                    }
                    if (uhc0Var == uhc0.a) {
                        uiText = uiText2;
                    } else {
                        uiText = null;
                    }
                    lqc0Var = new lqc0(fqoVar, cVar, uiText, ufoVar, ysaVar, lni0Var, zsVar, zsVar2, zsVar3, zsVar4, zsVar5, zsVar6, zsVar7, zBooleanValue, inkVar, ei2Var, xnc0Var2, zBooleanValue4);
                    this.b = null;
                    this.c = null;
                    this.a = 1;
                    if (myhVar.emit(lqc0Var, this) == y5bVar) {
                        return y5bVar;
                    }
                }
                cVar = gcc0Var;
                fqoVar = fqoVar2;
                if (bkc0Var instanceof bkc0.c) {
                    cVar2 = (bkc0.c) bkc0Var;
                } else {
                    cVar2 = null;
                }
                if (cVar2 != null) {
                    uhc0Var = cVar2.b;
                } else {
                    uhc0Var = null;
                }
                if (uhc0Var == uhc0.a) {
                    uiText = uiText2;
                } else {
                    uiText = null;
                }
                lqc0Var = new lqc0(fqoVar, cVar, uiText, ufoVar, ysaVar, lni0Var, zsVar, zsVar2, zsVar3, zsVar4, zsVar5, zsVar6, zsVar7, zBooleanValue, inkVar, ei2Var, xnc0Var2, zBooleanValue4);
                this.b = null;
                this.c = null;
                this.a = 1;
                if (myhVar.emit(lqc0Var, this) == y5bVar) {
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

    public wqc0(lyh[] lyhVarArr, d dVar) {
        this.a = lyhVarArr;
        this.b = dVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.lyh
    public final Object collect(myh<? super lqc0> myhVar, v1b v1bVar) {
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
            lyh[] lyhVarArr = this.a;
            b bVar = new b(lyhVarArr);
            c cVar = new c(null, this.b);
            aVar.b = 1;
            if (r78.a(aVar, myhVar, cVar, bVar, lyhVarArr) == y5bVar) {
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
