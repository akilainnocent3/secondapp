package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.common_ui.uitext.UiText;
import com.sportybet.android.gp.tz.R;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.ranges.IntRange;
import kotlin.ranges.f;
import kotlin.text.StringsKt;
import kotlin.text.c;

/* JADX INFO: loaded from: classes5.dex */
public final class c4d0 implements lyh<u3d0> {
    public final /* synthetic */ k1i a;
    public final /* synthetic */ d4d0 b;

    @c0d(c = "com.sportybet.android.instantwin.presentation.penaltysettlement.viewmodel.SportyPenaltySettlementViewModel$special$$inlined$map$3", f = "SportyPenaltySettlementViewModel.kt", l = {109}, m = "collect", v = 2)
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
            return c4d0.this.collect(null, this);
        }
    }

    public static final class b<T> implements myh {
        public final /* synthetic */ myh a;
        public final /* synthetic */ d4d0 b;

        @c0d(c = "com.sportybet.android.instantwin.presentation.penaltysettlement.viewmodel.SportyPenaltySettlementViewModel$special$$inlined$map$3$2", f = "SportyPenaltySettlementViewModel.kt", l = {50}, m = "emit", v = 2)
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

        public b(myh myhVar, d4d0 d4d0Var) {
            this.a = myhVar;
            this.b = d4d0Var;
        }

        /* JADX WARN: Code duplicated, block: B:128:0x033b  */
        /* JADX WARN: Code duplicated, block: B:134:0x035c  */
        /* JADX WARN: Code duplicated, block: B:135:0x035f  */
        /* JADX WARN: Code duplicated, block: B:140:0x0370  */
        /* JADX WARN: Code duplicated, block: B:142:0x0374  */
        /* JADX WARN: Code duplicated, block: B:147:0x0391  */
        /* JADX WARN: Code duplicated, block: B:255:0x0529  */
        /* JADX WARN: Code duplicated, block: B:256:0x052b  */
        /* JADX WARN: Code duplicated, block: B:259:0x0544 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:268:0x033e A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:73:0x021a  */
        /* JADX WARN: Code duplicated, block: B:7:0x0017  */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.myh
        public final Object emit(Object obj, v1b v1bVar) {
            a aVar;
            int i;
            h3d0 h3d0VarA;
            h3d0 h3d0Var;
            boolean z;
            qcn qcnVarB;
            t1d0 t1d0Var;
            BigDecimal bigDecimal;
            String strL;
            x1d0 x1d0Var;
            boolean z2;
            u3d0 u3d0Var;
            x5d0 x5d0Var;
            Pair pair;
            String str;
            String str2;
            c2d0 c2d0Var;
            Pair pair2;
            BigDecimal bigDecimal2;
            g2d0 g2d0Var;
            BigDecimal bigDecimalB;
            t1d0 t1d0Var2;
            t1d0 t1d0Var3;
            Iterator<T> it;
            h3d0 h3d0Var2;
            T next;
            T next2;
            T next3;
            q3d0.a aVar2;
            UiText uiTextH;
            q3d0 q3d0Var;
            Object value;
            if (v1bVar instanceof a) {
                aVar = (a) v1bVar;
                int i2 = aVar.b;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    aVar.b = i2 - Integer.MIN_VALUE;
                } else {
                    aVar = new a(v1bVar);
                }
            } else {
                aVar = new a(v1bVar);
            }
            Object obj2 = aVar.a;
            y5b y5bVar = y5b.a;
            int i3 = aVar.b;
            if (i3 == 0) {
                uj50.b(obj2);
                bxg0 bxg0Var = (bxg0) obj;
                fqo fqoVar = (fqo) bxg0Var.a;
                r1d0 r1d0Var = (r1d0) bxg0Var.b;
                r2d0 r2d0Var = (r2d0) bxg0Var.c;
                d4d0 d4d0Var = this.b;
                u3d0 u3d0Var2 = (u3d0) d4d0Var.y.getValue();
                h3d0 h3d0VarA2 = u3d0Var2.b;
                r1d0Var.getClass();
                List<t1d0> list = r1d0Var.b;
                r2d0Var.getClass();
                d4d0Var.c.getClass();
                List<x5d0> list2 = r1d0Var.c;
                x5d0 x5d0Var2 = (x5d0) CollectionsKt.firstOrNull(list2);
                if (x5d0Var2 == null) {
                    wwd0 wwd0Var = d4d0Var.w;
                    do {
                        value = wwd0Var.getValue();
                        r2d0.a.getClass();
                        i = 2;
                    } while (!wwd0Var.g(value, r2d0.a.b));
                    Unit unit = Unit.a;
                    h3d0VarA = null;
                } else {
                    i = 2;
                    ArrayList arrayList = x5d0Var2.w;
                    if (r2d0Var instanceof r2d0.c) {
                        r2d0.c cVar = (r2d0.c) r2d0Var;
                        if (h3d0VarA2 == null) {
                            h3d0VarA2 = i3d0.a(x5d0Var2);
                        }
                        h3d0.a aVar3 = h3d0VarA2.d;
                        h3d0.a aVar4 = h3d0VarA2.c;
                        int i4 = cVar.b;
                        f2d0 f2d0Var = cVar.c;
                        nwc0 nwc0Var = (nwc0) arrayList.get(i4);
                        m5d0 m5d0Var = nwc0Var.a;
                        int iOrdinal = m5d0Var.ordinal();
                        if (iOrdinal == 0) {
                            int i5 = i4 / 2;
                            h3d0VarA = h3d0.a(f2d0Var, i3d0.d(m5d0Var), i3d0.e(aVar4, nwc0Var, f2d0Var, i5), h3d0.a.a(aVar3, 0, (i5 < 5 || f2d0Var != f2d0.a) ? aVar3.d : a4h.f(CollectionsKt.i0(kotlin.collections.a.c(new h3d0.a.AbstractC0619a.b(i5 + 1)), aVar3.d)), 7));
                        } else {
                            if (iOrdinal != 1) {
                                uhc.a();
                                return null;
                            }
                            h3d0VarA = h3d0.a(f2d0Var, i3d0.d(m5d0Var), aVar4, i3d0.e(aVar3, nwc0Var, f2d0Var, (i4 - 1) / 2));
                        }
                    } else {
                        fqoVar = fqoVar;
                        if (!r2d0Var.equals(r2d0.b.b)) {
                            uhc.a();
                            return null;
                        }
                        h3d0 h3d0VarA3 = i3d0.a(x5d0Var2);
                        ArrayList arrayList2 = new ArrayList();
                        int size = arrayList.size();
                        int i6 = 0;
                        while (i6 < size) {
                            Object obj3 = arrayList.get(i6);
                            int i7 = i6 + 1;
                            int i8 = size;
                            if (((nwc0) obj3).a == m5d0.a) {
                                arrayList2.add(obj3);
                            }
                            size = i8;
                            i6 = i7;
                        }
                        ArrayList arrayList3 = new ArrayList(l48.r(arrayList2, 10));
                        int size2 = arrayList2.size();
                        int i9 = 0;
                        int i10 = 0;
                        while (i10 < size2) {
                            Object obj4 = arrayList2.get(i10);
                            i10++;
                            int i11 = i9 + 1;
                            if (i9 < 0) {
                                kotlin.collections.b.q();
                                throw null;
                            }
                            arrayList3.add(i3d0.c((nwc0) obj4, i9));
                            i9 = i11;
                            arrayList2 = arrayList2;
                        }
                        qcn qcnVarB2 = a4h.b(arrayList3);
                        ArrayList arrayList4 = new ArrayList();
                        int size3 = arrayList.size();
                        int i12 = 0;
                        while (i12 < size3) {
                            Object obj5 = arrayList.get(i12);
                            int i13 = i12 + 1;
                            int i14 = size3;
                            if (((nwc0) obj5).a == m5d0.b) {
                                arrayList4.add(obj5);
                            }
                            size3 = i14;
                            i12 = i13;
                        }
                        ArrayList arrayList5 = new ArrayList(l48.r(arrayList4, 10));
                        int size4 = arrayList4.size();
                        int i15 = 0;
                        int i16 = 0;
                        while (i15 < size4) {
                            Object obj6 = arrayList4.get(i15);
                            i15++;
                            int i17 = i16 + 1;
                            if (i16 < 0) {
                                kotlin.collections.b.q();
                                throw null;
                            }
                            arrayList5.add(i3d0.c((nwc0) obj6, i16));
                            i16 = i17;
                            arrayList4 = arrayList4;
                        }
                        h3d0VarA = h3d0.a(f2d0.b, i3d0.d(((nwc0) CollectionsKt.b0(arrayList)).a), h3d0.a.a(h3d0VarA3.c, Integer.parseInt(x5d0Var2.f), qcnVarB2, 3), h3d0.a.a(h3d0VarA3.d, Integer.parseInt(x5d0Var2.v), a4h.b(arrayList5), 3));
                    }
                    if (list != 0 || (t1d0Var2 = (t1d0) CollectionsKt.firstOrNull(list)) == null) {
                        h3d0Var = h3d0VarA;
                        z = false;
                        qcnVarB = n1a0.c;
                    } else {
                        List<o5d0> list3 = t1d0Var2.e;
                        ArrayList arrayList6 = new ArrayList();
                        Iterator<T> it2 = list3.iterator();
                        int i18 = 0;
                        while (it2.hasNext()) {
                            o5d0 o5d0Var = (o5d0) it2.next();
                            p5d0 p5d0Var = (p5d0) CollectionsKt.firstOrNull(o5d0Var.v);
                            if (p5d0Var == null) {
                                t1d0Var3 = t1d0Var2;
                                it = it2;
                                h3d0Var2 = h3d0VarA;
                            } else {
                                Iterator<T> it3 = cd3.f.iterator();
                                while (true) {
                                    if (!it3.hasNext()) {
                                        t1d0Var3 = t1d0Var2;
                                        it = it2;
                                        h3d0Var2 = h3d0VarA;
                                        next = (T) null;
                                        break;
                                    }
                                    next = it3.next();
                                    it = it2;
                                    h3d0Var2 = h3d0VarA;
                                    t1d0Var3 = t1d0Var2;
                                    if (c.l(((cd3) next).name(), t1d0Var2.b, true)) {
                                        break;
                                    }
                                    h3d0VarA = h3d0Var2;
                                    it2 = it;
                                    t1d0Var2 = t1d0Var3;
                                }
                                cd3 cd3Var = next;
                                if (cd3Var != null) {
                                    Iterator<T> it4 = r1d0Var.d.iterator();
                                    do {
                                        if (!it4.hasNext()) {
                                            next2 = (T) null;
                                            break;
                                        }
                                        next2 = it4.next();
                                    } while (!((z5d0) next2).a.equals(p5d0Var.b));
                                    z5d0 z5d0Var = next2;
                                    if (z5d0Var != null) {
                                        Iterator<T> it5 = r1d0Var.e.iterator();
                                        while (true) {
                                            if (!it5.hasNext()) {
                                                r1d0Var = r1d0Var;
                                                next3 = (T) null;
                                                break;
                                            }
                                            next3 = it5.next();
                                            r1d0Var = r1d0Var;
                                            if (((a6d0) next3).a.equals(p5d0Var.c)) {
                                                break;
                                            }
                                            r1d0Var = r1d0Var;
                                        }
                                        a6d0 a6d0Var = next3;
                                        if (a6d0Var == null) {
                                            q3d0Var = null;
                                        } else {
                                            if (r2d0Var instanceof r2d0.b) {
                                                aVar2 = o5d0Var.i ? q3d0.a.HIT : q3d0.a.MISSED;
                                            } else {
                                                aVar2 = null;
                                            }
                                            if (cd3Var == cd3.SINGLE) {
                                                StringUiText stringUiText = vch0.a;
                                                i18++;
                                                uiTextH = new ResourceUiText(R.string.component_betslip__single).h(vch0.d(StringsKt.Z(i, String.valueOf(i18))));
                                            } else {
                                                uiTextH = vch0.a;
                                            }
                                            UiText uiText = uiTextH;
                                            String str3 = z5d0Var.b;
                                            String string = a6d0Var.b.toString();
                                            string.getClass();
                                            q3d0Var = new q3d0(aVar2, uiText, str3, a6d0Var.c, gky.a.a(string, false));
                                        }
                                    }
                                    if (q3d0Var != null) {
                                        arrayList6.add(q3d0Var);
                                    }
                                    h3d0VarA = h3d0Var2;
                                    it2 = it;
                                    t1d0Var2 = t1d0Var3;
                                    r1d0Var = r1d0Var;
                                    i = 2;
                                }
                            }
                            q3d0Var = null;
                            if (q3d0Var != null) {
                                arrayList6.add(q3d0Var);
                            }
                            h3d0VarA = h3d0Var2;
                            it2 = it;
                            t1d0Var2 = t1d0Var3;
                            r1d0Var = r1d0Var;
                            i = 2;
                        }
                        h3d0Var = h3d0VarA;
                        z = false;
                        qcnVarB = a4h.b(arrayList6);
                    }
                    t1d0Var = (t1d0) CollectionsKt.firstOrNull(list);
                    if (t1d0Var != null) {
                        bigDecimal = t1d0Var.c;
                    } else {
                        bigDecimal = null;
                    }
                    if (bigDecimal != null || (bigDecimalB = p54.b(bigDecimal)) == null) {
                        strL = null;
                    } else {
                        strL = bjb0.L(bigDecimalB, Locale.US);
                    }
                    if (strL == null) {
                        strL = "";
                    }
                    String strA = yk10.a(d4d0Var.b.b(), strL);
                    x1d0 x1d0Var2 = u3d0Var2.e;
                    d4d0Var.d.getClass();
                    if (list2 != 0 || (x5d0Var = (x5d0) CollectionsKt.firstOrNull(list2)) == null) {
                        qcnVarB = qcnVarB;
                        x1d0Var = x1d0.d;
                    } else {
                        ArrayList arrayList7 = x5d0Var.w;
                        String str4 = "https://s.sporty.net/cms/PL_idle_39f33c3038.json";
                        if (r2d0Var.equals(r2d0.b.b)) {
                            t1d0 t1d0Var4 = (t1d0) CollectionsKt.firstOrNull(list);
                            if (t1d0Var4 == null || (bigDecimal2 = t1d0Var4.c) == null) {
                                bigDecimal2 = BigDecimal.ZERO;
                            }
                            boolean z3 = bigDecimal2.compareTo(BigDecimal.ZERO) > 0 ? true : z;
                            nwc0 nwc0Var2 = (nwc0) CollectionsKt.d0(arrayList7);
                            if (nwc0Var2 != null) {
                                int iOrdinal2 = nwc0Var2.a.ordinal();
                                if (iOrdinal2 != 0) {
                                    if (iOrdinal2 != 1) {
                                        uhc.a();
                                        return null;
                                    }
                                    str4 = "https://s.sporty.net/cms/PL_idle_2_b06c88c55f.json";
                                }
                                g2d0Var = new g2d0(str4);
                            } else {
                                g2d0Var = null;
                            }
                            x1d0Var = new x1d0(g2d0Var, null, z3 ? new d2d0.b(strA) : d2d0.a.a);
                            qcnVarB = qcnVarB;
                        } else {
                            if (!(r2d0Var instanceof r2d0.c)) {
                                uhc.a();
                                return null;
                            }
                            r2d0.c cVar2 = (r2d0.c) r2d0Var;
                            int i19 = cVar2.b;
                            if (i19 < 0 || i19 >= arrayList7.size()) {
                                qcnVarB = qcnVarB;
                                x1d0Var = x1d0.d;
                            } else {
                                nwc0 nwc0Var3 = (nwc0) arrayList7.get(i19);
                                int iOrdinal3 = cVar2.c.ordinal();
                                if (iOrdinal3 == 0) {
                                    int iOrdinal4 = nwc0Var3.a.ordinal();
                                    if (iOrdinal4 == 0) {
                                        pair = new Pair("https://s.sporty.net/cms/PL_idle_39f33c3038.json", "https://s.sporty.net/cms/PL_kick_ceb91b0891.json");
                                    } else {
                                        if (iOrdinal4 != 1) {
                                            uhc.a();
                                            return null;
                                        }
                                        pair = new Pair("https://s.sporty.net/cms/PL_idle_2_b06c88c55f.json", "https://s.sporty.net/cms/PL_kick_2_e25434e7bd.json");
                                    }
                                    String str5 = (String) pair.a;
                                    String str6 = (String) pair.b;
                                    boolean z4 = nwc0Var3.b;
                                    if (!z4) {
                                        int iK = f.k(new IntRange(1, 5, 1), lx30.INSTANCE);
                                        if (iK == 1) {
                                            pair2 = new Pair("https://s.sporty.net/cms/GK_1_290f181d28.json", "https://s.sporty.net/cms/ball_1_lose_bfed67bcaf.json");
                                        } else if (iK == 2) {
                                            pair2 = new Pair("https://s.sporty.net/cms/GK_2_8c9c35f167.json", "https://s.sporty.net/cms/ball_2_lose_924695b507.json");
                                        } else if (iK != 3) {
                                            pair2 = iK != 4 ? new Pair("https://s.sporty.net/cms/GK_5_eb2773faf2.json", "https://s.sporty.net/cms/ball_5_lose_c269076ff3.json") : new Pair("https://s.sporty.net/cms/GK_4_2a80708fb8.json", "https://s.sporty.net/cms/ball_4_lose_b30526811a.json");
                                        } else {
                                            pair2 = new Pair("https://s.sporty.net/cms/GK_3_ea4e0c654a.json", "https://s.sporty.net/cms/ball_3_lose_ecdc20622d.json");
                                        }
                                        c2d0Var = new c2d0((String) pair2.a, str5, str6, (String) pair2.b);
                                    } else {
                                        if (!z4) {
                                            uhc.a();
                                            return null;
                                        }
                                        IntRange intRange = new IntRange(1, 5, 1);
                                        lx30.Companion companion = lx30.INSTANCE;
                                        int iK2 = f.k(intRange, companion);
                                        if (iK2 == 1) {
                                            str = "https://s.sporty.net/cms/ball_1_win_5f0a8a9461.json";
                                        } else if (iK2 == 2) {
                                            str = "https://s.sporty.net/cms/ball_2_win_1ec63a08f3.json";
                                        } else if (iK2 != 3) {
                                            str = iK2 != 4 ? "https://s.sporty.net/cms/ball_5_win_8c6d1a08da.json" : "https://s.sporty.net/cms/ball_4_win_21a853c111.json";
                                        } else {
                                            str = "https://s.sporty.net/cms/ball_3_win_56a446e185.json";
                                        }
                                        if (iK2 == 1) {
                                            str2 = "https://s.sporty.net/cms/GK_2_8c9c35f167.json";
                                        } else if (iK2 == 2) {
                                            str2 = "https://s.sporty.net/cms/GK_1_290f181d28.json";
                                        } else if (iK2 != 3) {
                                            str2 = iK2 != 4 ? "https://s.sporty.net/cms/GK_4_2a80708fb8.json" : "https://s.sporty.net/cms/GK_5_eb2773faf2.json";
                                        } else {
                                            str2 = (String) CollectionsKt.k0(kotlin.collections.b.k("https://s.sporty.net/cms/GK_2_8c9c35f167.json", "https://s.sporty.net/cms/GK_4_2a80708fb8.json"), companion);
                                        }
                                        c2d0Var = new c2d0(str2, str5, str6, str);
                                    }
                                    x1d0Var = new x1d0(c2d0Var, null, null);
                                } else {
                                    if (iOrdinal3 != 1) {
                                        uhc.a();
                                        return null;
                                    }
                                    qcnVarB = qcnVarB;
                                    x1d0Var = new x1d0(x1d0Var2.a, nwc0Var3.b ? e2d0.a : e2d0.b, x1d0Var2.c);
                                }
                            }
                        }
                    }
                    if (r2d0Var instanceof r2d0.b) {
                        z2 = true;
                    } else {
                        z2 = u3d0Var2.d;
                    }
                    u3d0Var = new u3d0(fqoVar, h3d0Var, qcnVarB, z2, x1d0Var, r2d0Var, strA);
                    aVar.b = 1;
                    if (this.a.emit(u3d0Var, aVar) == y5bVar) {
                        return y5bVar;
                    }
                }
                fqoVar = fqoVar;
                if (list != 0) {
                    h3d0Var = h3d0VarA;
                    z = false;
                    qcnVarB = n1a0.c;
                } else {
                    h3d0Var = h3d0VarA;
                    z = false;
                    qcnVarB = n1a0.c;
                }
                t1d0Var = (t1d0) CollectionsKt.firstOrNull(list);
                if (t1d0Var != null) {
                    bigDecimal = t1d0Var.c;
                } else {
                    bigDecimal = null;
                }
                if (bigDecimal != null) {
                    strL = null;
                } else {
                    strL = null;
                }
                if (strL == null) {
                    strL = "";
                }
                String strA2 = yk10.a(d4d0Var.b.b(), strL);
                x1d0 x1d0Var3 = u3d0Var2.e;
                d4d0Var.d.getClass();
                if (list2 != 0) {
                    qcnVarB = qcnVarB;
                    x1d0Var = x1d0.d;
                } else {
                    qcnVarB = qcnVarB;
                    x1d0Var = x1d0.d;
                }
                if (r2d0Var instanceof r2d0.b) {
                    z2 = true;
                } else {
                    z2 = u3d0Var2.d;
                }
                u3d0Var = new u3d0(fqoVar, h3d0Var, qcnVarB, z2, x1d0Var, r2d0Var, strA2);
                aVar.b = 1;
                if (this.a.emit(u3d0Var, aVar) == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i3 != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj2);
            }
            return Unit.a;
        }
    }

    public c4d0(k1i k1iVar, d4d0 d4d0Var) {
        this.a = k1iVar;
        this.b = d4d0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.lyh
    public final Object collect(myh<? super u3d0> myhVar, v1b v1bVar) {
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
