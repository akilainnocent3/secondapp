package defpackage;

import com.sporty.android.common_ui.uitext.ColoredUiText;
import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.UiText;
import com.sportybet.android.gp.tz.R;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.a;
import kotlin.collections.b;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class lon extends pf implements jaj<hon.b, hug0, Set<? extends String>, String, v1b<? super bno>, Object> {
    /* JADX WARN: Code duplicated, block: B:101:0x025a A[LOOP:23: B:89:0x022b->B:101:0x025a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:105:0x0288  */
    /* JADX WARN: Code duplicated, block: B:115:0x02a7  */
    /* JADX WARN: Code duplicated, block: B:121:0x02be  */
    /* JADX WARN: Code duplicated, block: B:125:0x02f4  */
    /* JADX WARN: Code duplicated, block: B:131:0x0309  */
    /* JADX WARN: Code duplicated, block: B:132:0x030e  */
    /* JADX WARN: Code duplicated, block: B:134:0x0319  */
    /* JADX WARN: Code duplicated, block: B:136:0x031e  */
    /* JADX WARN: Code duplicated, block: B:138:0x0321  */
    /* JADX WARN: Code duplicated, block: B:142:0x0327  */
    /* JADX WARN: Code duplicated, block: B:144:0x0333  */
    /* JADX WARN: Code duplicated, block: B:147:0x035c  */
    /* JADX WARN: Code duplicated, block: B:149:0x036b  */
    /* JADX WARN: Code duplicated, block: B:153:0x037d  */
    /* JADX WARN: Code duplicated, block: B:155:0x0398  */
    /* JADX WARN: Code duplicated, block: B:156:0x03a5  */
    /* JADX WARN: Code duplicated, block: B:161:0x03c6  */
    /* JADX WARN: Code duplicated, block: B:163:0x03e0  */
    /* JADX WARN: Code duplicated, block: B:166:0x03f5  */
    /* JADX WARN: Code duplicated, block: B:168:0x0400  */
    /* JADX WARN: Code duplicated, block: B:170:0x040d  */
    /* JADX WARN: Code duplicated, block: B:173:0x0473  */
    /* JADX WARN: Code duplicated, block: B:175:0x0483  */
    /* JADX WARN: Code duplicated, block: B:176:0x0486  */
    /* JADX WARN: Code duplicated, block: B:179:0x0494  */
    /* JADX WARN: Code duplicated, block: B:180:0x0497  */
    /* JADX WARN: Code duplicated, block: B:182:0x049a  */
    /* JADX WARN: Code duplicated, block: B:186:0x04ab A[LOOP:8: B:184:0x04a5->B:186:0x04ab, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:189:0x04cd A[EDGE_INSN: B:189:0x04cd->B:196:0x04e4 BREAK  A[LOOP:16: B:191:0x04d3->B:385:?]] */
    /* JADX WARN: Code duplicated, block: B:190:0x04cf  */
    /* JADX WARN: Code duplicated, block: B:193:0x04d9  */
    /* JADX WARN: Code duplicated, block: B:198:0x04ec  */
    /* JADX WARN: Code duplicated, block: B:199:0x04ef  */
    /* JADX WARN: Code duplicated, block: B:201:0x04f2  */
    /* JADX WARN: Code duplicated, block: B:204:0x04ff  */
    /* JADX WARN: Code duplicated, block: B:206:0x0502  */
    /* JADX WARN: Code duplicated, block: B:208:0x0507  */
    /* JADX WARN: Code duplicated, block: B:210:0x051d  */
    /* JADX WARN: Code duplicated, block: B:211:0x0526  */
    /* JADX WARN: Code duplicated, block: B:212:0x0531  */
    /* JADX WARN: Code duplicated, block: B:214:0x053e  */
    /* JADX WARN: Code duplicated, block: B:218:0x0560  */
    /* JADX WARN: Code duplicated, block: B:224:0x057d A[LOOP:10: B:222:0x0577->B:224:0x057d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:228:0x0596  */
    /* JADX WARN: Code duplicated, block: B:230:0x05a6  */
    /* JADX WARN: Code duplicated, block: B:235:0x05c2  */
    /* JADX WARN: Code duplicated, block: B:237:0x05ce  */
    /* JADX WARN: Code duplicated, block: B:241:0x05df  */
    /* JADX WARN: Code duplicated, block: B:242:0x05e2  */
    /* JADX WARN: Code duplicated, block: B:246:0x0628  */
    /* JADX WARN: Code duplicated, block: B:248:0x0630  */
    /* JADX WARN: Code duplicated, block: B:250:0x063c  */
    /* JADX WARN: Code duplicated, block: B:252:0x0650  */
    /* JADX WARN: Code duplicated, block: B:259:0x0694  */
    /* JADX WARN: Code duplicated, block: B:261:0x0697  */
    /* JADX WARN: Code duplicated, block: B:264:0x06ad  */
    /* JADX WARN: Code duplicated, block: B:266:0x06b5 A[LOOP:14: B:262:0x06a7->B:266:0x06b5, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:272:0x06e8 A[LOOP:15: B:270:0x06e2->B:272:0x06e8, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:274:0x06fd  */
    /* JADX WARN: Code duplicated, block: B:280:0x073f  */
    /* JADX WARN: Code duplicated, block: B:281:0x0742  */
    /* JADX WARN: Code duplicated, block: B:283:0x0745  */
    /* JADX WARN: Code duplicated, block: B:284:0x0748  */
    /* JADX WARN: Code duplicated, block: B:288:0x0758 A[LOOP:17: B:286:0x0752->B:288:0x0758, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:292:0x0782  */
    /* JADX WARN: Code duplicated, block: B:294:0x078a  */
    /* JADX WARN: Code duplicated, block: B:296:0x0792  */
    /* JADX WARN: Code duplicated, block: B:297:0x0796  */
    /* JADX WARN: Code duplicated, block: B:304:0x07b8  */
    /* JADX WARN: Code duplicated, block: B:306:0x07bb  */
    /* JADX WARN: Code duplicated, block: B:309:0x07d1  */
    /* JADX WARN: Code duplicated, block: B:311:0x07d9 A[LOOP:19: B:307:0x07cb->B:311:0x07d9, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:317:0x080c A[LOOP:20: B:315:0x0806->B:317:0x080c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:319:0x0821  */
    /* JADX WARN: Code duplicated, block: B:321:0x0831  */
    /* JADX WARN: Code duplicated, block: B:324:0x085e  */
    /* JADX WARN: Code duplicated, block: B:326:0x0866  */
    /* JADX WARN: Code duplicated, block: B:328:0x086f  */
    /* JADX WARN: Code duplicated, block: B:329:0x0871  */
    /* JADX WARN: Code duplicated, block: B:331:0x0874 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:332:0x0876  */
    /* JADX WARN: Code duplicated, block: B:334:0x0883  */
    /* JADX WARN: Code duplicated, block: B:336:0x0899  */
    /* JADX WARN: Code duplicated, block: B:33:0x0110  */
    /* JADX WARN: Code duplicated, block: B:346:0x0120 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:349:0x01be A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:352:0x0304 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:357:0x036e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:361:0x06c7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:363:0x066f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:369:0x056a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:371:0x055a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:376:0x05ad A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:379:0x05d4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:383:0x04cd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:384:0x04e3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:385:? A[LOOP:16: B:191:0x04d3->B:385:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:388:0x07a6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:392:0x07eb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:395:0x08be A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:398:0x0268 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:399:0x0277 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:39:0x0128  */
    /* JADX WARN: Code duplicated, block: B:400:0x026b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:401:0x0255 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:403:0x02b9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:40:0x012b  */
    /* JADX WARN: Code duplicated, block: B:42:0x0131 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:44:0x0134  */
    /* JADX WARN: Code duplicated, block: B:46:0x013b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:47:0x013d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:48:0x013f  */
    /* JADX WARN: Code duplicated, block: B:49:0x0143  */
    /* JADX WARN: Code duplicated, block: B:50:0x0147  */
    /* JADX WARN: Code duplicated, block: B:51:0x014b  */
    /* JADX WARN: Code duplicated, block: B:54:0x0156  */
    /* JADX WARN: Code duplicated, block: B:57:0x015f  */
    /* JADX WARN: Code duplicated, block: B:61:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:67:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:69:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:71:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:73:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:75:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:77:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:79:0x01da  */
    /* JADX WARN: Code duplicated, block: B:81:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:84:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:85:0x020a  */
    /* JADX WARN: Code duplicated, block: B:88:0x021d  */
    /* JADX WARN: Code duplicated, block: B:91:0x0231  */
    /* JADX WARN: Code duplicated, block: B:94:0x0241  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r20v3 */
    /* JADX WARN: Type inference failed for: r20v4 */
    /* JADX WARN: Type inference failed for: r20v7 */
    /* JADX WARN: Type inference failed for: r39v3, types: [qon] */
    /* JADX WARN: Type inference failed for: r39v8, types: [qon] */
    /* JADX WARN: Type inference failed for: r3v35 */
    /* JADX WARN: Type inference failed for: r3v36, types: [qon] */
    /* JADX WARN: Type inference failed for: r3v39 */
    /* JADX WARN: Type inference failed for: r3v92 */
    /* JADX WARN: Type inference failed for: r3v93 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v19 */
    @Override // defpackage.jaj
    public final Object l(hon.b bVar, hug0 hug0Var, Set<? extends String> set, String str, v1b<? super bno> v1bVar) {
        int i;
        int i2;
        int i3;
        Iterator it;
        Object next;
        cd3 cd3Var;
        int iOrdinal;
        fon fonVar;
        boo znoVar;
        boo booVar;
        int iOrdinal2;
        int i4;
        Iterator it2;
        Object next2;
        cd3 cd3Var2;
        int iOrdinal3;
        fon fonVar2;
        List<gon> list;
        gon gonVar;
        Iterator it3;
        Object next3;
        xon xonVar;
        String strA;
        BigDecimal bigDecimalValueOf;
        Iterator it4;
        BigDecimal bigDecimalMultiply;
        Iterator it5;
        gon gonVar2;
        Iterator it6;
        Object next4;
        xon xonVar2;
        String strA2;
        Iterator it7;
        Object next5;
        cd3 cd3Var3;
        ArrayList arrayList;
        int iOrdinal4;
        Set<? extends String> set2;
        String str2;
        ngs ngsVar;
        boolean z;
        List<uon> list2;
        List<won> list3;
        List<xon> list4;
        ArrayList arrayList2;
        Iterator it8;
        int i5;
        ?? r3;
        Object next6;
        int i6;
        fon fonVar3;
        List<fon> list5;
        fon fonVar4;
        String str3;
        nno nnoVarA;
        boolean z2;
        List listB;
        ngs ngsVar2;
        non nonVar;
        boolean z3;
        List<uon> list6;
        List<won> list7;
        List<xon> list8;
        int size;
        fon fonVar5;
        String str4;
        String str5;
        ArrayList arrayList3;
        Iterator it9;
        List listA0;
        ArrayList arrayList4;
        Iterator it10;
        int i7;
        Integer numValueOf;
        qcn qcnVarB;
        ArrayList arrayList5;
        int i8;
        Map mapK;
        ArrayList arrayList6;
        Iterator it11;
        int i9;
        Object next7;
        int i10;
        boolean z4;
        ron ronVar;
        boolean z5;
        String str6;
        List<uon> list9;
        ?? r8;
        List<won> list10;
        List<xon> list11;
        ArrayList arrayList7;
        ArrayList arrayList8;
        LinkedHashMap linkedHashMap;
        int size2;
        int i11;
        List<xon> list12;
        String str7;
        Iterator it12;
        int i12;
        int iIntValue;
        List<fon> list13;
        Set<? extends String> set3;
        Iterator it13;
        String str8;
        ?? r20;
        List<xon> list14;
        ArrayList arrayList9;
        int i13;
        boolean z6;
        int size3;
        fon fonVar6;
        String str9;
        ArrayList arrayList10;
        Iterator it14;
        List listA1;
        Iterator it15;
        boolean z7;
        fon fonVar7;
        String str10;
        String str11;
        int size4;
        List<uon> list15;
        List<fon> list16;
        ResourceUiText resourceUiText;
        BigDecimal bigDecimalAdd;
        BigDecimal bigDecimalAdd2;
        Iterator it16;
        BigDecimal bigDecimalAdd3;
        List<won> list17;
        BigDecimal bigDecimalAdd4;
        Iterator it17;
        Integer num;
        nno nnoVar;
        ArrayList arrayList11;
        ngs ngsVar3;
        int i14;
        Set<? extends String> set4;
        ngs ngsVar4;
        String str12;
        Integer numValueOf2;
        qcn qcnVarB2;
        ArrayList arrayList12;
        ArrayList arrayList13;
        int i15;
        Map mapK2;
        ArrayList arrayList14;
        Iterator it18;
        int i16;
        int i17;
        boolean z8;
        fon fonVar8;
        ArrayList arrayList15;
        ?? r9;
        boolean z9;
        Integer numValueOf3;
        Object obj;
        hon.b bVar2 = bVar;
        hug0 hug0Var2 = hug0Var;
        Set<? extends String> set5 = set;
        String str13 = str;
        hon honVar = (hon) this.a;
        honVar.getClass();
        if (bVar2 instanceof hon.b.C0651b) {
            return bno.b.a;
        }
        if (bVar2 instanceof hon.b.a) {
            return new bno.a(new wmo.a(((hon.b.a) bVar2).a.a));
        }
        if (!(bVar2 instanceof hon.b.c)) {
            uhc.a();
            return null;
        }
        eon eonVar = ((hon.b.c) bVar2).a;
        Integer numValueOf4 = Integer.valueOf(R.drawable.ic__feature__won);
        ngs ngsVarB = a.b();
        cmo cmoVar = honVar.e.a;
        eonVar.getClass();
        String str14 = eonVar.b;
        String str15 = eonVar.d;
        hug0Var2.getClass();
        List<xon> list18 = eonVar.t;
        BigDecimal bigDecimal = eonVar.n;
        String str16 = eonVar.c;
        boolean z10 = eonVar.p;
        boolean z11 = eonVar.o;
        String str17 = eonVar.j;
        BigDecimal bigDecimal2 = eonVar.k;
        Set<? extends String> set6 = set5;
        List<fon> list19 = eonVar.q;
        BigDecimal bigDecimal3 = BigDecimal.ZERO;
        Iterator it19 = list19.iterator();
        BigDecimal bigDecimalAdd5 = bigDecimal3;
        while (it19.hasNext()) {
            bigDecimalAdd5 = bigDecimalAdd5.add(((fon) it19.next()).f);
            list18 = list18;
        }
        List<xon> list20 = list18;
        Integer numValueOf5 = Integer.valueOf(R.string.page_instant_virtual__ib_logo);
        Integer numC = cmoVar.c(str15);
        ResourceUiText resourceUiTextQ = rqf0.q(str14);
        BigDecimal bigDecimal4 = bigDecimalAdd5;
        String strD = bwf0.a.d(eonVar.h, true);
        Integer numA = cmoVar.a(str15);
        UiText uiTextD = rqf0.d(list19.size(), str16);
        Integer num2 = z10 ? numValueOf4 : null;
        epo.a aVar = num2 != null ? new epo.a(num2.intValue(), R.color.icon_brand_sub_secondary) : null;
        if (z11) {
            if (z10) {
                i3 = R.string.bet_history__won;
                i2 = R.color.text_inverse_brand_sub;
            } else {
                i = R.string.bet_history__lost;
            }
            ColoredUiText coloredUiText = new ColoredUiText(new ResourceUiText(i3), Integer.valueOf(i2), null);
            it = cd3.f.iterator();
            do {
                if (it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!((cd3) next).a.equalsIgnoreCase(str16));
            cd3Var = (cd3) next;
            if (cd3Var != null) {
                iOrdinal = cd3Var.ordinal();
                if (iOrdinal != 3) {
                    fonVar = (fon) CollectionsKt.firstOrNull(list19);
                    if (fonVar == null) {
                        booVar = null;
                    } else {
                        znoVar = new zno(new ResourceUiText(R.string.component_wap_share_bet__flex_your_bet_vmintowin_of_vsize, ay0.S(new Object[]{String.valueOf(eonVar.m), String.valueOf(fonVar.h.size())})));
                        booVar = znoVar;
                    }
                } else if (iOrdinal != 4) {
                    booVar = null;
                } else {
                    iOrdinal2 = hug0Var2.ordinal();
                    if (iOrdinal2 != 1) {
                        i4 = R.drawable.ic_one_bet_cut_sw;
                    } else if (iOrdinal2 != 2) {
                        i4 = R.drawable.ic_one_bet_cut_es_mx;
                    } else if (iOrdinal2 != 3) {
                        i4 = R.drawable.ic_one_bet_cut;
                    } else {
                        i4 = R.drawable.ic_one_bet_cut_pt_br;
                    }
                    znoVar = new aoo(i4);
                    booVar = znoVar;
                }
            } else {
                booVar = null;
            }
            ColoredUiText coloredUiTextT = rqf0.t(R.color.text_inverse_brand_sub, eonVar.f, z11, z10);
            String strP = rqf0.p(eonVar.e);
            ResourceUiText resourceUiTextJ = rqf0.j(str17, bigDecimal2, new son(eonVar, 0));
            ResourceUiText resourceUiTextI = rqf0.i(bigDecimal2, str17);
            it2 = cd3.f.iterator();
            do {
                if (it2.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it2.next();
            } while (!((cd3) next2).a.equalsIgnoreCase(str16));
            cd3Var2 = (cd3) next2;
            if (cd3Var2 != null) {
                iOrdinal3 = cd3Var2.ordinal();
                if (iOrdinal3 != 0) {
                    fonVar2 = (fon) CollectionsKt.p0(list19);
                    if (fonVar2 != null && (list = fonVar2.h) != null && (gonVar = (gon) CollectionsKt.p0(list)) != null) {
                        it3 = list20.iterator();
                        do {
                            if (it3.hasNext()) {
                                next3 = null;
                                break;
                            }
                            next3 = it3.next();
                        } while (!((xon) next3).a.equals(gonVar.c));
                        xonVar = (xon) next3;
                        if (xonVar != null) {
                            strA = gky.a.a(bjb0.L(xonVar.b, Locale.US), false);
                        }
                    }
                    strA = null;
                } else if (iOrdinal3 != 1) {
                    bigDecimalValueOf = BigDecimal.valueOf(0L);
                    bigDecimalValueOf.getClass();
                    it4 = list19.iterator();
                    while (true) {
                        if (it4.hasNext()) {
                            List<gon> list21 = ((fon) it4.next()).h;
                            bigDecimalMultiply = BigDecimal.ONE;
                            it5 = list21.iterator();
                            while (true) {
                                if (it5.hasNext()) {
                                    gonVar2 = (gon) it5.next();
                                    it6 = list20.iterator();
                                    do {
                                        if (it6.hasNext()) {
                                            next4 = null;
                                            break;
                                        }
                                        next4 = it6.next();
                                    } while (!((xon) next4).a.equals(gonVar2.c));
                                    xonVar2 = (xon) next4;
                                    if (xonVar2 != null) {
                                        BigDecimal bigDecimal5 = xonVar2.b;
                                        bigDecimalMultiply.getClass();
                                        bigDecimalMultiply = bigDecimalMultiply.multiply(bigDecimal5);
                                        bigDecimalMultiply.getClass();
                                    } else {
                                        strA = null;
                                    }
                                } else {
                                    bigDecimalMultiply.getClass();
                                    bigDecimalValueOf = bigDecimalValueOf.add(bigDecimalMultiply);
                                    bigDecimalValueOf.getClass();
                                }
                            }
                        } else {
                            strA = gky.a.a(bjb0.L(bigDecimalValueOf, Locale.US), false);
                        }
                    }
                } else if (iOrdinal3 != 2) {
                    if (iOrdinal3 != 3) {
                        strA2 = gky.a.a(bjb0.L(bigDecimal.setScale(2, RoundingMode.HALF_UP), Locale.US), false);
                    } else {
                        if (iOrdinal3 == 4) {
                            uhc.a();
                            return null;
                        }
                        strA2 = gky.a.a(bjb0.L(bigDecimal.setScale(2, RoundingMode.HALF_UP), Locale.US), false);
                    }
                    strA = strA2;
                } else {
                    strA = null;
                }
            } else {
                strA = null;
            }
            bigDecimal4.getClass();
            ngsVarB.add(new epo(numValueOf5, numC, resourceUiTextQ, str14, strD, numA, uiTextD, aVar, coloredUiText, booVar, coloredUiTextT, strP, resourceUiTextJ, resourceUiTextI, strA, rqf0.f(bigDecimal4), rqf0.v(eonVar.g)));
            it7 = cd3.f.iterator();
            do {
                if (it7.hasNext()) {
                    next5 = null;
                    break;
                }
                next5 = it7.next();
            } while (!((cd3) next5).a.equalsIgnoreCase(str16));
            cd3Var3 = (cd3) next5;
            if (cd3Var3 == null) {
                listB = n1a0.c;
                ngsVar2 = ngsVarB;
            } else {
                arrayList = new ArrayList();
                iOrdinal4 = cd3Var3.ordinal();
                if (iOrdinal4 != 0) {
                    set2 = set6;
                    str2 = str13;
                    ngsVar = ngsVarB;
                    qon qonVar = honVar.c;
                    set2.getClass();
                    z = eonVar.o;
                    list2 = eonVar.r;
                    list3 = eonVar.s;
                    list4 = eonVar.t;
                    arrayList2 = new ArrayList(l48.r(list19, 10));
                    it8 = list19.iterator();
                    i5 = 0;
                    r3 = qonVar;
                    while (it8.hasNext()) {
                        next6 = it8.next();
                        i6 = i5 + 1;
                        if (i5 >= 0) {
                            b.q();
                            throw null;
                        }
                        fonVar3 = (fon) next6;
                        if (list19.size() > 1) {
                            list5 = list19;
                        } else {
                            list5 = null;
                        }
                        if (list5 != null) {
                            if (i5 == 0) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            ?? r39 = r3;
                            boolean z12 = z;
                            List<xon> list22 = list4;
                            Set<? extends String> set7 = set2;
                            set2 = set7;
                            String str18 = str2;
                            nnoVarA = r39.a(z12, list22, fonVar3, z2, set7);
                            str3 = str18;
                            r3 = r39;
                            z = z12;
                            list4 = list22;
                            fonVar4 = fonVar3;
                        } else {
                            fonVar4 = fonVar3;
                            str3 = str2;
                            nnoVarA = null;
                        }
                        arrayList2.add(new nmo(nnoVarA, a4h.a(r3.b(str15, z, list2, list3, list4, fonVar4, str3)), rqf0.b(fonVar4.b), null));
                        it8 = it8;
                        str2 = str3;
                        i5 = i6;
                        r3 = r3;
                    }
                    arrayList.addAll(arrayList2);
                } else if (iOrdinal4 == 1) {
                    ngsVar = ngsVarB;
                    nonVar = honVar.b;
                    z3 = eonVar.o;
                    list6 = eonVar.r;
                    list7 = eonVar.s;
                    list8 = eonVar.t;
                    size = list19.size();
                    fonVar5 = (fon) CollectionsKt.firstOrNull(list19);
                    if (fonVar5 != null) {
                        str4 = fonVar5.b;
                    } else {
                        str4 = null;
                    }
                    if (str4 == null) {
                        str5 = "";
                    } else {
                        str5 = str4;
                    }
                    arrayList3 = new ArrayList();
                    it9 = list19.iterator();
                    while (it9.hasNext()) {
                        p48.w(((fon) it9.next()).h, arrayList3);
                    }
                    listA0 = CollectionsKt.A0(CollectionsKt.D0(arrayList3));
                    arrayList4 = new ArrayList(l48.r(listA0, 10));
                    it10 = listA0.iterator();
                    i7 = 0;
                    while (it10.hasNext()) {
                        next7 = it10.next();
                        i10 = i7 + 1;
                        if (i7 >= 0) {
                            b.q();
                            throw null;
                        }
                        gon gonVar3 = (gon) next7;
                        Iterator it20 = it10;
                        if (size > 1) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        arrayList4.add(nonVar.a(str15, z3, list6, list7, list8, str5, gonVar3, i7, z4, str13));
                        it10 = it20;
                        str13 = str13;
                        i7 = i10;
                    }
                    qcn qcnVarB3 = a4h.b(arrayList4);
                    numValueOf = Integer.valueOf(size);
                    if (size <= 1) {
                        numValueOf = null;
                    }
                    if (numValueOf != null) {
                        arrayList5 = new ArrayList(l48.r(listA0, 10));
                        i8 = 0;
                        for (Object obj2 : listA0) {
                            i9 = i8 + 1;
                            if (i8 >= 0) {
                                b.q();
                                throw null;
                            }
                            arrayList5.add(new Pair(((gon) obj2).c, String.valueOf(i9)));
                            i8 = i9;
                        }
                        mapK = kpu.k(arrayList5);
                        arrayList6 = new ArrayList(l48.r(list19, 10));
                        it11 = list19.iterator();
                        while (it11.hasNext()) {
                            arrayList6.add(nonVar.a.c(z3, list8, (fon) it11.next(), mapK));
                        }
                        qcnVarB = a4h.b(arrayList6);
                    } else {
                        qcnVarB = null;
                    }
                    arrayList.add(new nmo(null, qcnVarB3, rqf0.b(str5), qcnVarB));
                } else if (iOrdinal4 != 2) {
                    if (iOrdinal4 != 3 && iOrdinal4 != 4) {
                        uhc.a();
                        return null;
                    }
                    ngsVar = ngsVarB;
                    nonVar = honVar.b;
                    z3 = eonVar.o;
                    list6 = eonVar.r;
                    list7 = eonVar.s;
                    list8 = eonVar.t;
                    size = list19.size();
                    fonVar5 = (fon) CollectionsKt.firstOrNull(list19);
                    if (fonVar5 != null) {
                        str4 = fonVar5.b;
                    } else {
                        str4 = null;
                    }
                    if (str4 == null) {
                        str5 = "";
                    } else {
                        str5 = str4;
                    }
                    arrayList3 = new ArrayList();
                    it9 = list19.iterator();
                    while (it9.hasNext()) {
                        p48.w(((fon) it9.next()).h, arrayList3);
                    }
                    listA0 = CollectionsKt.A0(CollectionsKt.D0(arrayList3));
                    arrayList4 = new ArrayList(l48.r(listA0, 10));
                    it10 = listA0.iterator();
                    i7 = 0;
                    while (it10.hasNext()) {
                        next7 = it10.next();
                        i10 = i7 + 1;
                        if (i7 >= 0) {
                            b.q();
                            throw null;
                        }
                        gon gonVar4 = (gon) next7;
                        Iterator it21 = it10;
                        if (size > 1) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        arrayList4.add(nonVar.a(str15, z3, list6, list7, list8, str5, gonVar4, i7, z4, str13));
                        it10 = it21;
                        str13 = str13;
                        i7 = i10;
                    }
                    qcn qcnVarB4 = a4h.b(arrayList4);
                    numValueOf = Integer.valueOf(size);
                    if (size <= 1) {
                        numValueOf = null;
                    }
                    if (numValueOf != null) {
                        arrayList5 = new ArrayList(l48.r(listA0, 10));
                        i8 = 0;
                        while (r2.hasNext()) {
                            i9 = i8 + 1;
                            if (i8 >= 0) {
                                b.q();
                                throw null;
                            }
                            arrayList5.add(new Pair(((gon) obj2).c, String.valueOf(i9)));
                            i8 = i9;
                        }
                        mapK = kpu.k(arrayList5);
                        arrayList6 = new ArrayList(l48.r(list19, 10));
                        it11 = list19.iterator();
                        while (it11.hasNext()) {
                            arrayList6.add(nonVar.a.c(z3, list8, (fon) it11.next(), mapK));
                        }
                        qcnVarB = a4h.b(arrayList6);
                    } else {
                        qcnVarB = null;
                    }
                    arrayList.add(new nmo(null, qcnVarB4, rqf0.b(str5), qcnVarB));
                } else {
                    ronVar = honVar.d;
                    qon qonVar2 = ronVar.c;
                    set6.getClass();
                    z5 = eonVar.o;
                    str6 = str15;
                    list9 = eonVar.r;
                    r8 = qonVar2;
                    list10 = eonVar.s;
                    list11 = eonVar.t;
                    arrayList7 = new ArrayList();
                    arrayList8 = new ArrayList();
                    for (Object obj3 : list19) {
                        if (!((fon) obj3).h.isEmpty()) {
                            arrayList8.add(obj3);
                        }
                    }
                    linkedHashMap = new LinkedHashMap();
                    size2 = arrayList8.size();
                    i11 = 0;
                    while (i11 < size2) {
                        Object obj4 = arrayList8.get(i11);
                        i11++;
                        List<xon> list23 = list11;
                        numValueOf3 = Integer.valueOf(((fon) obj4).h.size());
                        obj = linkedHashMap.get(numValueOf3);
                        if (obj == null) {
                            ArrayList arrayList16 = new ArrayList();
                            linkedHashMap.put(numValueOf3, arrayList16);
                            obj = arrayList16;
                        }
                        ((List) obj).add(obj4);
                        list11 = list23;
                        str6 = str6;
                    }
                    list12 = list11;
                    str7 = str6;
                    it12 = linkedHashMap.entrySet().iterator();
                    i12 = 0;
                    while (it12.hasNext()) {
                        Map.Entry entry = (Map.Entry) it12.next();
                        iIntValue = ((Number) entry.getKey()).intValue();
                        list13 = (List) entry.getValue();
                        if (iIntValue == 1) {
                            arrayList15 = new ArrayList(l48.r(list13, 10));
                            r9 = r8;
                            for (fon fonVar9 : list13) {
                                int i18 = i12 + 1;
                                if (i12 == 0) {
                                    z9 = true;
                                } else {
                                    z9 = false;
                                }
                                Set<? extends String> set8 = set6;
                                boolean z13 = z5;
                                ?? r310 = r9;
                                List<xon> list24 = list12;
                                z5 = z13;
                                String str19 = str7;
                                arrayList15.add(new nmo(r310.a(z13, list24, fonVar9, z9, set8), a4h.a(r310.b(str19, z5, list9, list10, list24, fonVar9, str13)), rqf0.b(fonVar9.b), null));
                                it12 = it12;
                                i12 = i18;
                                set6 = set8;
                                arrayList = arrayList;
                                list12 = list24;
                                r9 = r310;
                                str7 = str19;
                            }
                            it13 = it12;
                            String str20 = str7;
                            r20 = r9;
                            list14 = list12;
                            arrayList9 = arrayList;
                            arrayList7.addAll(arrayList15);
                            str12 = str20;
                            ngsVar4 = ngsVarB;
                            arrayList12 = arrayList7;
                            set4 = set6;
                        } else {
                            set3 = set6;
                            it13 = it12;
                            str8 = str7;
                            r20 = r8;
                            list14 = list12;
                            arrayList9 = arrayList;
                            i13 = i12 + 1;
                            if (i12 == 0) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                            size3 = list13.size();
                            fonVar6 = (fon) CollectionsKt.firstOrNull(list13);
                            if (fonVar6 != null) {
                                str9 = fonVar6.b;
                            } else {
                                str9 = null;
                            }
                            if (str9 == null) {
                                str9 = "";
                            }
                            arrayList10 = new ArrayList();
                            it14 = list13.iterator();
                            while (it14.hasNext()) {
                                p48.w(((fon) it14.next()).h, arrayList10);
                                i13 = i13;
                            }
                            int i19 = i13;
                            listA1 = CollectionsKt.A0(CollectionsKt.D0(arrayList10));
                            if (list13.isEmpty()) {
                                z7 = false;
                                break;
                            }
                            it15 = list13.iterator();
                            while (true) {
                                if (it15.hasNext()) {
                                    z7 = false;
                                    break;
                                }
                                if (((fon) it15.next()).g) {
                                    z7 = true;
                                    break;
                                }
                            }
                            fonVar7 = (fon) CollectionsKt.firstOrNull(list13);
                            if (fonVar7 != null) {
                                str10 = fonVar7.b;
                            } else {
                                str10 = null;
                            }
                            if (str10 == null) {
                                str10 = "";
                            }
                            str11 = str9;
                            size4 = list13.size();
                            list15 = list9;
                            if (iIntValue != 1) {
                                list16 = list13;
                                resourceUiText = new ResourceUiText(R.string.component_betslip__single);
                            } else if (iIntValue != 2) {
                                list16 = list13;
                                if (iIntValue != 3) {
                                    resourceUiText = new ResourceUiText(R.string.component_betslip__veventsize_folds, ay0.S(new Object[]{String.valueOf(iIntValue)}));
                                } else {
                                    resourceUiText = new ResourceUiText(R.string.component_betslip__trebles);
                                }
                            } else {
                                list16 = list13;
                                resourceUiText = new ResourceUiText(R.string.component_betslip__doubles);
                            }
                            if (size4 > 1) {
                                resourceUiText = new ResourceUiText(R.string.app_common__iwqk_folds_title, ay0.S(new Object[]{resourceUiText, String.valueOf(size4)}));
                            }
                            ResourceUiText resourceUiText2 = resourceUiText;
                            bigDecimalAdd = BigDecimal.ZERO;
                            for (fon fonVar10 : list16) {
                                if (fonVar10.g) {
                                    bigDecimalAdd = bigDecimalAdd.add(fonVar10.d);
                                }
                            }
                            bigDecimalAdd2 = BigDecimal.ZERO;
                            it16 = list16.iterator();
                            while (it16.hasNext()) {
                                bigDecimalAdd2 = bigDecimalAdd2.add(((fon) it16.next()).c);
                            }
                            bigDecimalAdd3 = BigDecimal.ZERO;
                            for (fon fonVar11 : list16) {
                                BigDecimal bigDecimal6 = bigDecimalAdd2;
                                List<won> list25 = list10;
                                if (fonVar11.g) {
                                    bigDecimalAdd3 = bigDecimalAdd3.add(fonVar11.f);
                                }
                                list10 = list25;
                                bigDecimalAdd2 = bigDecimal6;
                            }
                            BigDecimal bigDecimal7 = bigDecimalAdd2;
                            list17 = list10;
                            bigDecimalAdd4 = BigDecimal.ZERO;
                            it17 = list16.iterator();
                            while (it17.hasNext()) {
                                fonVar8 = (fon) it17.next();
                                Iterator it22 = it17;
                                if (fonVar8.g) {
                                    bigDecimalAdd4 = bigDecimalAdd4.add(fonVar8.e);
                                }
                                it17 = it22;
                            }
                            boolean zContains = set3.contains(str10);
                            if (z7) {
                                num = numValueOf4;
                            } else {
                                num = null;
                            }
                            ColoredUiText coloredUiTextC = rqf0.c(z5, z7);
                            bigDecimalAdd.getClass();
                            String strM = rqf0.m(bigDecimalAdd, z5, z7);
                            bigDecimal7.getClass();
                            String strP2 = rqf0.p(bigDecimal7);
                            bigDecimalAdd3.getClass();
                            String strF = rqf0.f(bigDecimalAdd3);
                            bigDecimalAdd4.getClass();
                            nnoVar = new nno(str10, zContains, resourceUiText2, num, coloredUiTextC, strM, strP2, null, strF, rqf0.v(bigDecimalAdd4), z6, null);
                            arrayList11 = new ArrayList(l48.r(listA1, 10));
                            ngsVar3 = ngsVarB;
                            i14 = 0;
                            for (Object obj5 : listA1) {
                                i17 = i14 + 1;
                                if (i14 >= 0) {
                                    b.q();
                                    throw null;
                                }
                                gon gonVar5 = (gon) obj5;
                                ArrayList arrayList17 = arrayList11;
                                non nonVar2 = ronVar.b;
                                ArrayList arrayList18 = arrayList7;
                                nno nnoVar2 = nnoVar;
                                if (size3 > 1) {
                                    z8 = true;
                                } else {
                                    z8 = false;
                                }
                                String str21 = str13;
                                Set<? extends String> set9 = set3;
                                List<won> list26 = list17;
                                String str22 = str11;
                                List<uon> list27 = list15;
                                ngs ngsVar5 = ngsVar3;
                                String str23 = str8;
                                str13 = str21;
                                arrayList17.add(nonVar2.a(str23, z5, list27, list26, list14, str22, gonVar5, i14, z8, str21));
                                str8 = str23;
                                list15 = list27;
                                str11 = str22;
                                arrayList11 = arrayList17;
                                ngsVar3 = ngsVar5;
                                i14 = i17;
                                set3 = set9;
                                arrayList7 = arrayList18;
                                nnoVar = nnoVar2;
                                list17 = list26;
                            }
                            String str24 = str11;
                            list9 = list15;
                            ArrayList arrayList19 = arrayList7;
                            nno nnoVar3 = nnoVar;
                            set4 = set3;
                            list10 = list17;
                            ngsVar4 = ngsVar3;
                            str12 = str8;
                            qcn qcnVarB5 = a4h.b(arrayList11);
                            numValueOf2 = Integer.valueOf(size3);
                            if (size3 <= 1) {
                                numValueOf2 = null;
                            }
                            if (numValueOf2 != null) {
                                arrayList13 = new ArrayList(l48.r(listA1, 10));
                                i15 = 0;
                                for (Object obj6 : listA1) {
                                    i16 = i15 + 1;
                                    if (i15 >= 0) {
                                        b.q();
                                        throw null;
                                    }
                                    arrayList13.add(new Pair(((gon) obj6).c, String.valueOf(i16)));
                                    i15 = i16;
                                }
                                mapK2 = kpu.k(arrayList13);
                                List list28 = list16;
                                arrayList14 = new ArrayList(l48.r(list28, 10));
                                it18 = list28.iterator();
                                while (it18.hasNext()) {
                                    arrayList14.add(ronVar.a.c(z5, list14, (fon) it18.next(), mapK2));
                                }
                                qcnVarB2 = a4h.b(arrayList14);
                            } else {
                                qcnVarB2 = null;
                            }
                            nmo nmoVar = new nmo(nnoVar3, qcnVarB5, rqf0.b(str24), qcnVarB2);
                            arrayList12 = arrayList19;
                            arrayList12.add(nmoVar);
                            i12 = i19;
                        }
                        arrayList7 = arrayList12;
                        arrayList = arrayList9;
                        ngsVarB = ngsVar4;
                        set6 = set4;
                        it12 = it13;
                        list12 = list14;
                        r8 = r20;
                        str7 = str12;
                    }
                    ngsVar = ngsVarB;
                    arrayList.addAll(arrayList7);
                }
                listB = a4h.b(arrayList);
                ngsVar2 = ngsVar;
            }
            ngsVar2.addAll(listB);
            return new bno.c(a4h.b(a.a(ngsVar2)));
        }
        i = R.string.bet_history__waiting_to_start_game;
        int i20 = i;
        i2 = R.color.text_inverse_primary;
        i3 = i20;
        ColoredUiText coloredUiText2 = new ColoredUiText(new ResourceUiText(i3), Integer.valueOf(i2), null);
        it = cd3.f.iterator();
        do {
            if (it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((cd3) next).a.equalsIgnoreCase(str16));
        cd3Var = (cd3) next;
        if (cd3Var != null) {
            iOrdinal = cd3Var.ordinal();
            if (iOrdinal != 3) {
                fonVar = (fon) CollectionsKt.firstOrNull(list19);
                if (fonVar == null) {
                    booVar = null;
                } else {
                    znoVar = new zno(new ResourceUiText(R.string.component_wap_share_bet__flex_your_bet_vmintowin_of_vsize, ay0.S(new Object[]{String.valueOf(eonVar.m), String.valueOf(fonVar.h.size())})));
                    booVar = znoVar;
                }
            } else if (iOrdinal != 4) {
                booVar = null;
            } else {
                iOrdinal2 = hug0Var2.ordinal();
                if (iOrdinal2 != 1) {
                    i4 = R.drawable.ic_one_bet_cut_sw;
                } else if (iOrdinal2 != 2) {
                    i4 = R.drawable.ic_one_bet_cut_es_mx;
                } else if (iOrdinal2 != 3) {
                    i4 = R.drawable.ic_one_bet_cut;
                } else {
                    i4 = R.drawable.ic_one_bet_cut_pt_br;
                }
                znoVar = new aoo(i4);
                booVar = znoVar;
            }
        } else {
            booVar = null;
        }
        ColoredUiText coloredUiTextT2 = rqf0.t(R.color.text_inverse_brand_sub, eonVar.f, z11, z10);
        String strP3 = rqf0.p(eonVar.e);
        ResourceUiText resourceUiTextJ2 = rqf0.j(str17, bigDecimal2, new son(eonVar, 0));
        ResourceUiText resourceUiTextI2 = rqf0.i(bigDecimal2, str17);
        it2 = cd3.f.iterator();
        do {
            if (it2.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it2.next();
        } while (!((cd3) next2).a.equalsIgnoreCase(str16));
        cd3Var2 = (cd3) next2;
        if (cd3Var2 != null) {
            iOrdinal3 = cd3Var2.ordinal();
            if (iOrdinal3 != 0) {
                fonVar2 = (fon) CollectionsKt.p0(list19);
                if (fonVar2 != null) {
                    it3 = list20.iterator();
                    do {
                        if (it3.hasNext()) {
                            next3 = null;
                            break;
                        }
                        next3 = it3.next();
                    } while (!((xon) next3).a.equals(gonVar.c));
                    xonVar = (xon) next3;
                    if (xonVar != null) {
                        strA = gky.a.a(bjb0.L(xonVar.b, Locale.US), false);
                    }
                }
                strA = null;
            } else if (iOrdinal3 != 1) {
                bigDecimalValueOf = BigDecimal.valueOf(0L);
                bigDecimalValueOf.getClass();
                it4 = list19.iterator();
                while (true) {
                    if (it4.hasNext()) {
                        List<gon> list29 = ((fon) it4.next()).h;
                        bigDecimalMultiply = BigDecimal.ONE;
                        it5 = list29.iterator();
                        while (true) {
                            if (it5.hasNext()) {
                                gonVar2 = (gon) it5.next();
                                it6 = list20.iterator();
                                do {
                                    if (it6.hasNext()) {
                                        next4 = null;
                                        break;
                                    }
                                    next4 = it6.next();
                                } while (!((xon) next4).a.equals(gonVar2.c));
                                xonVar2 = (xon) next4;
                                if (xonVar2 != null) {
                                    BigDecimal bigDecimal8 = xonVar2.b;
                                    bigDecimalMultiply.getClass();
                                    bigDecimalMultiply = bigDecimalMultiply.multiply(bigDecimal8);
                                    bigDecimalMultiply.getClass();
                                } else {
                                    strA = null;
                                }
                            } else {
                                bigDecimalMultiply.getClass();
                                bigDecimalValueOf = bigDecimalValueOf.add(bigDecimalMultiply);
                                bigDecimalValueOf.getClass();
                            }
                        }
                    } else {
                        strA = gky.a.a(bjb0.L(bigDecimalValueOf, Locale.US), false);
                    }
                }
            } else if (iOrdinal3 != 2) {
                if (iOrdinal3 != 3) {
                    strA2 = gky.a.a(bjb0.L(bigDecimal.setScale(2, RoundingMode.HALF_UP), Locale.US), false);
                } else {
                    if (iOrdinal3 == 4) {
                        uhc.a();
                        return null;
                    }
                    strA2 = gky.a.a(bjb0.L(bigDecimal.setScale(2, RoundingMode.HALF_UP), Locale.US), false);
                }
                strA = strA2;
            } else {
                strA = null;
            }
        } else {
            strA = null;
        }
        bigDecimal4.getClass();
        ngsVarB.add(new epo(numValueOf5, numC, resourceUiTextQ, str14, strD, numA, uiTextD, aVar, coloredUiText2, booVar, coloredUiTextT2, strP3, resourceUiTextJ2, resourceUiTextI2, strA, rqf0.f(bigDecimal4), rqf0.v(eonVar.g)));
        it7 = cd3.f.iterator();
        do {
            if (it7.hasNext()) {
                next5 = null;
                break;
            }
            next5 = it7.next();
        } while (!((cd3) next5).a.equalsIgnoreCase(str16));
        cd3Var3 = (cd3) next5;
        if (cd3Var3 == null) {
            listB = n1a0.c;
            ngsVar2 = ngsVarB;
        } else {
            arrayList = new ArrayList();
            iOrdinal4 = cd3Var3.ordinal();
            if (iOrdinal4 != 0) {
                set2 = set6;
                str2 = str13;
                ngsVar = ngsVarB;
                qon qonVar3 = honVar.c;
                set2.getClass();
                z = eonVar.o;
                list2 = eonVar.r;
                list3 = eonVar.s;
                list4 = eonVar.t;
                arrayList2 = new ArrayList(l48.r(list19, 10));
                it8 = list19.iterator();
                i5 = 0;
                r3 = qonVar3;
                while (it8.hasNext()) {
                    next6 = it8.next();
                    i6 = i5 + 1;
                    if (i5 >= 0) {
                        b.q();
                        throw null;
                    }
                    fonVar3 = (fon) next6;
                    if (list19.size() > 1) {
                        list5 = list19;
                    } else {
                        list5 = null;
                    }
                    if (list5 != null) {
                        if (i5 == 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        ?? r311 = r3;
                        boolean z14 = z;
                        List<xon> list210 = list4;
                        Set<? extends String> set10 = set2;
                        set2 = set10;
                        String str110 = str2;
                        nnoVarA = r311.a(z14, list210, fonVar3, z2, set10);
                        str3 = str110;
                        r3 = r311;
                        z = z14;
                        list4 = list210;
                        fonVar4 = fonVar3;
                    } else {
                        fonVar4 = fonVar3;
                        str3 = str2;
                        nnoVarA = null;
                    }
                    arrayList2.add(new nmo(nnoVarA, a4h.a(r3.b(str15, z, list2, list3, list4, fonVar4, str3)), rqf0.b(fonVar4.b), null));
                    it8 = it8;
                    str2 = str3;
                    i5 = i6;
                    r3 = r3;
                }
                arrayList.addAll(arrayList2);
            } else if (iOrdinal4 == 1) {
                ngsVar = ngsVarB;
                nonVar = honVar.b;
                z3 = eonVar.o;
                list6 = eonVar.r;
                list7 = eonVar.s;
                list8 = eonVar.t;
                size = list19.size();
                fonVar5 = (fon) CollectionsKt.firstOrNull(list19);
                if (fonVar5 != null) {
                    str4 = fonVar5.b;
                } else {
                    str4 = null;
                }
                if (str4 == null) {
                    str5 = "";
                } else {
                    str5 = str4;
                }
                arrayList3 = new ArrayList();
                it9 = list19.iterator();
                while (it9.hasNext()) {
                    p48.w(((fon) it9.next()).h, arrayList3);
                }
                listA0 = CollectionsKt.A0(CollectionsKt.D0(arrayList3));
                arrayList4 = new ArrayList(l48.r(listA0, 10));
                it10 = listA0.iterator();
                i7 = 0;
                while (it10.hasNext()) {
                    next7 = it10.next();
                    i10 = i7 + 1;
                    if (i7 >= 0) {
                        b.q();
                        throw null;
                    }
                    gon gonVar6 = (gon) next7;
                    Iterator it23 = it10;
                    if (size > 1) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    arrayList4.add(nonVar.a(str15, z3, list6, list7, list8, str5, gonVar6, i7, z4, str13));
                    it10 = it23;
                    str13 = str13;
                    i7 = i10;
                }
                qcn qcnVarB6 = a4h.b(arrayList4);
                numValueOf = Integer.valueOf(size);
                if (size <= 1) {
                    numValueOf = null;
                }
                if (numValueOf != null) {
                    arrayList5 = new ArrayList(l48.r(listA0, 10));
                    i8 = 0;
                    while (r2.hasNext()) {
                        i9 = i8 + 1;
                        if (i8 >= 0) {
                            b.q();
                            throw null;
                        }
                        arrayList5.add(new Pair(((gon) obj2).c, String.valueOf(i9)));
                        i8 = i9;
                    }
                    mapK = kpu.k(arrayList5);
                    arrayList6 = new ArrayList(l48.r(list19, 10));
                    it11 = list19.iterator();
                    while (it11.hasNext()) {
                        arrayList6.add(nonVar.a.c(z3, list8, (fon) it11.next(), mapK));
                    }
                    qcnVarB = a4h.b(arrayList6);
                } else {
                    qcnVarB = null;
                }
                arrayList.add(new nmo(null, qcnVarB6, rqf0.b(str5), qcnVarB));
            } else if (iOrdinal4 != 2) {
                if (iOrdinal4 != 3) {
                    uhc.a();
                    return null;
                }
                ngsVar = ngsVarB;
                nonVar = honVar.b;
                z3 = eonVar.o;
                list6 = eonVar.r;
                list7 = eonVar.s;
                list8 = eonVar.t;
                size = list19.size();
                fonVar5 = (fon) CollectionsKt.firstOrNull(list19);
                if (fonVar5 != null) {
                    str4 = fonVar5.b;
                } else {
                    str4 = null;
                }
                if (str4 == null) {
                    str5 = "";
                } else {
                    str5 = str4;
                }
                arrayList3 = new ArrayList();
                it9 = list19.iterator();
                while (it9.hasNext()) {
                    p48.w(((fon) it9.next()).h, arrayList3);
                }
                listA0 = CollectionsKt.A0(CollectionsKt.D0(arrayList3));
                arrayList4 = new ArrayList(l48.r(listA0, 10));
                it10 = listA0.iterator();
                i7 = 0;
                while (it10.hasNext()) {
                    next7 = it10.next();
                    i10 = i7 + 1;
                    if (i7 >= 0) {
                        b.q();
                        throw null;
                    }
                    gon gonVar7 = (gon) next7;
                    Iterator it24 = it10;
                    if (size > 1) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    arrayList4.add(nonVar.a(str15, z3, list6, list7, list8, str5, gonVar7, i7, z4, str13));
                    it10 = it24;
                    str13 = str13;
                    i7 = i10;
                }
                qcn qcnVarB7 = a4h.b(arrayList4);
                numValueOf = Integer.valueOf(size);
                if (size <= 1) {
                    numValueOf = null;
                }
                if (numValueOf != null) {
                    arrayList5 = new ArrayList(l48.r(listA0, 10));
                    i8 = 0;
                    while (r2.hasNext()) {
                        i9 = i8 + 1;
                        if (i8 >= 0) {
                            b.q();
                            throw null;
                        }
                        arrayList5.add(new Pair(((gon) obj2).c, String.valueOf(i9)));
                        i8 = i9;
                    }
                    mapK = kpu.k(arrayList5);
                    arrayList6 = new ArrayList(l48.r(list19, 10));
                    it11 = list19.iterator();
                    while (it11.hasNext()) {
                        arrayList6.add(nonVar.a.c(z3, list8, (fon) it11.next(), mapK));
                    }
                    qcnVarB = a4h.b(arrayList6);
                } else {
                    qcnVarB = null;
                }
                arrayList.add(new nmo(null, qcnVarB7, rqf0.b(str5), qcnVarB));
            } else {
                ronVar = honVar.d;
                qon qonVar4 = ronVar.c;
                set6.getClass();
                z5 = eonVar.o;
                str6 = str15;
                list9 = eonVar.r;
                r8 = qonVar4;
                list10 = eonVar.s;
                list11 = eonVar.t;
                arrayList7 = new ArrayList();
                arrayList8 = new ArrayList();
                while (r13.hasNext()) {
                    if (!((fon) obj3).h.isEmpty()) {
                        arrayList8.add(obj3);
                    }
                }
                linkedHashMap = new LinkedHashMap();
                size2 = arrayList8.size();
                i11 = 0;
                while (i11 < size2) {
                    Object obj7 = arrayList8.get(i11);
                    i11++;
                    List<xon> list211 = list11;
                    numValueOf3 = Integer.valueOf(((fon) obj7).h.size());
                    obj = linkedHashMap.get(numValueOf3);
                    if (obj == null) {
                        ArrayList arrayList110 = new ArrayList();
                        linkedHashMap.put(numValueOf3, arrayList110);
                        obj = arrayList110;
                    }
                    ((List) obj).add(obj7);
                    list11 = list211;
                    str6 = str6;
                }
                list12 = list11;
                str7 = str6;
                it12 = linkedHashMap.entrySet().iterator();
                i12 = 0;
                while (it12.hasNext()) {
                    Map.Entry entry2 = (Map.Entry) it12.next();
                    iIntValue = ((Number) entry2.getKey()).intValue();
                    list13 = (List) entry2.getValue();
                    if (iIntValue == 1) {
                        arrayList15 = new ArrayList(l48.r(list13, 10));
                        r9 = r8;
                        while (r14.hasNext()) {
                            int i110 = i12 + 1;
                            if (i12 == 0) {
                                z9 = true;
                            } else {
                                z9 = false;
                            }
                            Set<? extends String> set11 = set6;
                            boolean z15 = z5;
                            ?? r312 = r9;
                            List<xon> list212 = list12;
                            z5 = z15;
                            String str111 = str7;
                            arrayList15.add(new nmo(r312.a(z15, list212, fonVar9, z9, set11), a4h.a(r312.b(str111, z5, list9, list10, list212, fonVar9, str13)), rqf0.b(fonVar9.b), null));
                            it12 = it12;
                            i12 = i110;
                            set6 = set11;
                            arrayList = arrayList;
                            list12 = list212;
                            r9 = r312;
                            str7 = str111;
                        }
                        it13 = it12;
                        String str25 = str7;
                        r20 = r9;
                        list14 = list12;
                        arrayList9 = arrayList;
                        arrayList7.addAll(arrayList15);
                        str12 = str25;
                        ngsVar4 = ngsVarB;
                        arrayList12 = arrayList7;
                        set4 = set6;
                    } else {
                        set3 = set6;
                        it13 = it12;
                        str8 = str7;
                        r20 = r8;
                        list14 = list12;
                        arrayList9 = arrayList;
                        i13 = i12 + 1;
                        if (i12 == 0) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        size3 = list13.size();
                        fonVar6 = (fon) CollectionsKt.firstOrNull(list13);
                        if (fonVar6 != null) {
                            str9 = fonVar6.b;
                        } else {
                            str9 = null;
                        }
                        if (str9 == null) {
                            str9 = "";
                        }
                        arrayList10 = new ArrayList();
                        it14 = list13.iterator();
                        while (it14.hasNext()) {
                            p48.w(((fon) it14.next()).h, arrayList10);
                            i13 = i13;
                        }
                        int i111 = i13;
                        listA1 = CollectionsKt.A0(CollectionsKt.D0(arrayList10));
                        if (list13.isEmpty()) {
                            z7 = false;
                            break;
                        }
                        it15 = list13.iterator();
                        while (true) {
                            if (it15.hasNext()) {
                                z7 = false;
                                break;
                            }
                            if (((fon) it15.next()).g) {
                                z7 = true;
                                break;
                            }
                        }
                        fonVar7 = (fon) CollectionsKt.firstOrNull(list13);
                        if (fonVar7 != null) {
                            str10 = fonVar7.b;
                        } else {
                            str10 = null;
                        }
                        if (str10 == null) {
                            str10 = "";
                        }
                        str11 = str9;
                        size4 = list13.size();
                        list15 = list9;
                        if (iIntValue != 1) {
                            list16 = list13;
                            resourceUiText = new ResourceUiText(R.string.component_betslip__single);
                        } else if (iIntValue != 2) {
                            list16 = list13;
                            if (iIntValue != 3) {
                                resourceUiText = new ResourceUiText(R.string.component_betslip__veventsize_folds, ay0.S(new Object[]{String.valueOf(iIntValue)}));
                            } else {
                                resourceUiText = new ResourceUiText(R.string.component_betslip__trebles);
                            }
                        } else {
                            list16 = list13;
                            resourceUiText = new ResourceUiText(R.string.component_betslip__doubles);
                        }
                        if (size4 > 1) {
                            resourceUiText = new ResourceUiText(R.string.app_common__iwqk_folds_title, ay0.S(new Object[]{resourceUiText, String.valueOf(size4)}));
                        }
                        ResourceUiText resourceUiText3 = resourceUiText;
                        bigDecimalAdd = BigDecimal.ZERO;
                        while (r6.hasNext()) {
                            if (fonVar10.g) {
                                bigDecimalAdd = bigDecimalAdd.add(fonVar10.d);
                            }
                        }
                        bigDecimalAdd2 = BigDecimal.ZERO;
                        it16 = list16.iterator();
                        while (it16.hasNext()) {
                            bigDecimalAdd2 = bigDecimalAdd2.add(((fon) it16.next()).c);
                        }
                        bigDecimalAdd3 = BigDecimal.ZERO;
                        while (r14.hasNext()) {
                            BigDecimal bigDecimal9 = bigDecimalAdd2;
                            List<won> list213 = list10;
                            if (fonVar11.g) {
                                bigDecimalAdd3 = bigDecimalAdd3.add(fonVar11.f);
                            }
                            list10 = list213;
                            bigDecimalAdd2 = bigDecimal9;
                        }
                        BigDecimal bigDecimal10 = bigDecimalAdd2;
                        list17 = list10;
                        bigDecimalAdd4 = BigDecimal.ZERO;
                        it17 = list16.iterator();
                        while (it17.hasNext()) {
                            fonVar8 = (fon) it17.next();
                            Iterator it25 = it17;
                            if (fonVar8.g) {
                                bigDecimalAdd4 = bigDecimalAdd4.add(fonVar8.e);
                            }
                            it17 = it25;
                        }
                        boolean zContains2 = set3.contains(str10);
                        if (z7) {
                            num = numValueOf4;
                        } else {
                            num = null;
                        }
                        ColoredUiText coloredUiTextC2 = rqf0.c(z5, z7);
                        bigDecimalAdd.getClass();
                        String strM2 = rqf0.m(bigDecimalAdd, z5, z7);
                        bigDecimal10.getClass();
                        String strP4 = rqf0.p(bigDecimal10);
                        bigDecimalAdd3.getClass();
                        String strF2 = rqf0.f(bigDecimalAdd3);
                        bigDecimalAdd4.getClass();
                        nnoVar = new nno(str10, zContains2, resourceUiText3, num, coloredUiTextC2, strM2, strP4, null, strF2, rqf0.v(bigDecimalAdd4), z6, null);
                        arrayList11 = new ArrayList(l48.r(listA1, 10));
                        ngsVar3 = ngsVarB;
                        i14 = 0;
                        while (r21.hasNext()) {
                            i17 = i14 + 1;
                            if (i14 >= 0) {
                                b.q();
                                throw null;
                            }
                            gon gonVar8 = (gon) obj5;
                            ArrayList arrayList111 = arrayList11;
                            non nonVar3 = ronVar.b;
                            ArrayList arrayList112 = arrayList7;
                            nno nnoVar4 = nnoVar;
                            if (size3 > 1) {
                                z8 = true;
                            } else {
                                z8 = false;
                            }
                            String str26 = str13;
                            Set<? extends String> set12 = set3;
                            List<won> list214 = list17;
                            String str27 = str11;
                            List<uon> list215 = list15;
                            ngs ngsVar6 = ngsVar3;
                            String str28 = str8;
                            str13 = str26;
                            arrayList111.add(nonVar3.a(str28, z5, list215, list214, list14, str27, gonVar8, i14, z8, str26));
                            str8 = str28;
                            list15 = list215;
                            str11 = str27;
                            arrayList11 = arrayList111;
                            ngsVar3 = ngsVar6;
                            i14 = i17;
                            set3 = set12;
                            arrayList7 = arrayList112;
                            nnoVar = nnoVar4;
                            list17 = list214;
                        }
                        String str29 = str11;
                        list9 = list15;
                        ArrayList arrayList113 = arrayList7;
                        nno nnoVar5 = nnoVar;
                        set4 = set3;
                        list10 = list17;
                        ngsVar4 = ngsVar3;
                        str12 = str8;
                        qcn qcnVarB8 = a4h.b(arrayList11);
                        numValueOf2 = Integer.valueOf(size3);
                        if (size3 <= 1) {
                            numValueOf2 = null;
                        }
                        if (numValueOf2 != null) {
                            arrayList13 = new ArrayList(l48.r(listA1, 10));
                            i15 = 0;
                            while (r0.hasNext()) {
                                i16 = i15 + 1;
                                if (i15 >= 0) {
                                    b.q();
                                    throw null;
                                }
                                arrayList13.add(new Pair(((gon) obj6).c, String.valueOf(i16)));
                                i15 = i16;
                            }
                            mapK2 = kpu.k(arrayList13);
                            List list216 = list16;
                            arrayList14 = new ArrayList(l48.r(list216, 10));
                            it18 = list216.iterator();
                            while (it18.hasNext()) {
                                arrayList14.add(ronVar.a.c(z5, list14, (fon) it18.next(), mapK2));
                            }
                            qcnVarB2 = a4h.b(arrayList14);
                        } else {
                            qcnVarB2 = null;
                        }
                        nmo nmoVar2 = new nmo(nnoVar5, qcnVarB8, rqf0.b(str29), qcnVarB2);
                        arrayList12 = arrayList113;
                        arrayList12.add(nmoVar2);
                        i12 = i111;
                    }
                    arrayList7 = arrayList12;
                    arrayList = arrayList9;
                    ngsVarB = ngsVar4;
                    set6 = set4;
                    it12 = it13;
                    list12 = list14;
                    r8 = r20;
                    str7 = str12;
                }
                ngsVar = ngsVarB;
                arrayList.addAll(arrayList7);
            }
            listB = a4h.b(arrayList);
            ngsVar2 = ngsVar;
        }
        ngsVar2.addAll(listB);
        return new bno.c(a4h.b(a.a(ngsVar2)));
    }
}
