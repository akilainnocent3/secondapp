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
public final /* synthetic */ class yq extends pf implements jaj<vq.b, hug0, Set<? extends String>, String, v1b<? super bno>, Object> {
    /* JADX WARN: Code duplicated, block: B:100:0x025b  */
    /* JADX WARN: Code duplicated, block: B:101:0x025e  */
    /* JADX WARN: Code duplicated, block: B:104:0x0268  */
    /* JADX WARN: Code duplicated, block: B:110:0x027f  */
    /* JADX WARN: Code duplicated, block: B:115:0x02b3  */
    /* JADX WARN: Code duplicated, block: B:125:0x02d4  */
    /* JADX WARN: Code duplicated, block: B:131:0x02e9  */
    /* JADX WARN: Code duplicated, block: B:132:0x02ec  */
    /* JADX WARN: Code duplicated, block: B:135:0x02f6  */
    /* JADX WARN: Code duplicated, block: B:141:0x030c  */
    /* JADX WARN: Code duplicated, block: B:142:0x030f  */
    /* JADX WARN: Code duplicated, block: B:144:0x0312  */
    /* JADX WARN: Code duplicated, block: B:147:0x033c  */
    /* JADX WARN: Code duplicated, block: B:148:0x033e  */
    /* JADX WARN: Code duplicated, block: B:160:0x035d  */
    /* JADX WARN: Code duplicated, block: B:162:0x0360  */
    /* JADX WARN: Code duplicated, block: B:166:0x036f  */
    /* JADX WARN: Code duplicated, block: B:172:0x0385  */
    /* JADX WARN: Code duplicated, block: B:173:0x038a  */
    /* JADX WARN: Code duplicated, block: B:175:0x0395  */
    /* JADX WARN: Code duplicated, block: B:177:0x039a  */
    /* JADX WARN: Code duplicated, block: B:179:0x039d  */
    /* JADX WARN: Code duplicated, block: B:183:0x03a3  */
    /* JADX WARN: Code duplicated, block: B:186:0x03b2  */
    /* JADX WARN: Code duplicated, block: B:189:0x03e1  */
    /* JADX WARN: Code duplicated, block: B:191:0x03f0  */
    /* JADX WARN: Code duplicated, block: B:195:0x0402  */
    /* JADX WARN: Code duplicated, block: B:197:0x041f  */
    /* JADX WARN: Code duplicated, block: B:198:0x042c  */
    /* JADX WARN: Code duplicated, block: B:203:0x0451  */
    /* JADX WARN: Code duplicated, block: B:205:0x046a  */
    /* JADX WARN: Code duplicated, block: B:208:0x047f  */
    /* JADX WARN: Code duplicated, block: B:211:0x049a  */
    /* JADX WARN: Code duplicated, block: B:214:0x0507  */
    /* JADX WARN: Code duplicated, block: B:216:0x051b  */
    /* JADX WARN: Code duplicated, block: B:217:0x051e  */
    /* JADX WARN: Code duplicated, block: B:220:0x052c  */
    /* JADX WARN: Code duplicated, block: B:221:0x052f  */
    /* JADX WARN: Code duplicated, block: B:223:0x0532  */
    /* JADX WARN: Code duplicated, block: B:224:0x0535  */
    /* JADX WARN: Code duplicated, block: B:228:0x0546 A[LOOP:8: B:226:0x0540->B:228:0x0546, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:231:0x0568 A[EDGE_INSN: B:231:0x0568->B:239:0x058a BREAK  A[LOOP:16: B:233:0x0571->B:238:0x0587], PHI: r7
      0x0568: PHI (r7v36 int) = (r7v18 int), (r7v19 int) binds: [B:230:0x0566, B:431:0x0568] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:232:0x056d  */
    /* JADX WARN: Code duplicated, block: B:235:0x0577  */
    /* JADX WARN: Code duplicated, block: B:238:0x0587 A[LOOP:16: B:233:0x0571->B:238:0x0587, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:241:0x0592  */
    /* JADX WARN: Code duplicated, block: B:242:0x0595  */
    /* JADX WARN: Code duplicated, block: B:244:0x0598  */
    /* JADX WARN: Code duplicated, block: B:247:0x05a5  */
    /* JADX WARN: Code duplicated, block: B:249:0x05a8  */
    /* JADX WARN: Code duplicated, block: B:251:0x05ad  */
    /* JADX WARN: Code duplicated, block: B:253:0x05c3  */
    /* JADX WARN: Code duplicated, block: B:254:0x05cc  */
    /* JADX WARN: Code duplicated, block: B:255:0x05d7  */
    /* JADX WARN: Code duplicated, block: B:257:0x05e4  */
    /* JADX WARN: Code duplicated, block: B:258:0x05fb  */
    /* JADX WARN: Code duplicated, block: B:262:0x0609  */
    /* JADX WARN: Code duplicated, block: B:268:0x0626 A[LOOP:10: B:266:0x0620->B:268:0x0626, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:272:0x063f  */
    /* JADX WARN: Code duplicated, block: B:274:0x064f  */
    /* JADX WARN: Code duplicated, block: B:279:0x0669  */
    /* JADX WARN: Code duplicated, block: B:281:0x0679  */
    /* JADX WARN: Code duplicated, block: B:285:0x068e  */
    /* JADX WARN: Code duplicated, block: B:286:0x0691  */
    /* JADX WARN: Code duplicated, block: B:290:0x06d7  */
    /* JADX WARN: Code duplicated, block: B:292:0x06df  */
    /* JADX WARN: Code duplicated, block: B:294:0x06ed  */
    /* JADX WARN: Code duplicated, block: B:296:0x06f2  */
    /* JADX WARN: Code duplicated, block: B:303:0x071a  */
    /* JADX WARN: Code duplicated, block: B:305:0x071d  */
    /* JADX WARN: Code duplicated, block: B:308:0x0734  */
    /* JADX WARN: Code duplicated, block: B:310:0x073c A[LOOP:14: B:306:0x072e->B:310:0x073c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:316:0x0771 A[LOOP:15: B:314:0x076b->B:316:0x0771, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:318:0x0790  */
    /* JADX WARN: Code duplicated, block: B:325:0x07d7  */
    /* JADX WARN: Code duplicated, block: B:326:0x07da  */
    /* JADX WARN: Code duplicated, block: B:328:0x07dd  */
    /* JADX WARN: Code duplicated, block: B:329:0x07e0  */
    /* JADX WARN: Code duplicated, block: B:333:0x07f1 A[LOOP:17: B:331:0x07eb->B:333:0x07f1, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:337:0x081c  */
    /* JADX WARN: Code duplicated, block: B:339:0x0824  */
    /* JADX WARN: Code duplicated, block: B:33:0x010c  */
    /* JADX WARN: Code duplicated, block: B:341:0x0829  */
    /* JADX WARN: Code duplicated, block: B:343:0x0830  */
    /* JADX WARN: Code duplicated, block: B:350:0x0850  */
    /* JADX WARN: Code duplicated, block: B:352:0x0853  */
    /* JADX WARN: Code duplicated, block: B:355:0x086a  */
    /* JADX WARN: Code duplicated, block: B:357:0x0872 A[LOOP:19: B:353:0x0864->B:357:0x0872, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:363:0x08a4 A[LOOP:20: B:361:0x089e->B:363:0x08a4, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:365:0x08bd  */
    /* JADX WARN: Code duplicated, block: B:367:0x08cd  */
    /* JADX WARN: Code duplicated, block: B:370:0x08fe  */
    /* JADX WARN: Code duplicated, block: B:372:0x0906  */
    /* JADX WARN: Code duplicated, block: B:374:0x0911  */
    /* JADX WARN: Code duplicated, block: B:375:0x0913  */
    /* JADX WARN: Code duplicated, block: B:377:0x0916 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:378:0x0918  */
    /* JADX WARN: Code duplicated, block: B:380:0x0924  */
    /* JADX WARN: Code duplicated, block: B:383:0x0939  */
    /* JADX WARN: Code duplicated, block: B:394:0x011c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:397:0x01ba A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:39:0x0124  */
    /* JADX WARN: Code duplicated, block: B:400:0x0380 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:401:0x037e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:402:? A[LOOP:3: B:164:0x0369->B:402:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:405:0x03f3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:409:0x0705 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:40:0x0127  */
    /* JADX WARN: Code duplicated, block: B:410:0x0753 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:417:0x0613 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:419:0x0603 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:424:0x0656 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:427:0x067f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:42:0x012d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:431:0x0568 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:432:0x0585 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:435:0x083f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:437:0x0884 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:440:0x0971 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:441:0x02a1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:442:0x028f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:443:0x0292 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:446:0x0254 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:447:0x0257 A[EDGE_INSN: B:447:0x0257->B:98:0x0257 BREAK  A[LOOP:24: B:91:0x0236->B:96:0x0250], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:448:0x027a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:44:0x0130  */
    /* JADX WARN: Code duplicated, block: B:451:0x02e4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:454:0x0307 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:455:0x0305 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:456:? A[LOOP:27: B:133:0x02f0->B:456:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:0x0137 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:47:0x0139 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:48:0x013b  */
    /* JADX WARN: Code duplicated, block: B:49:0x013f  */
    /* JADX WARN: Code duplicated, block: B:50:0x0143  */
    /* JADX WARN: Code duplicated, block: B:51:0x0147  */
    /* JADX WARN: Code duplicated, block: B:54:0x0152  */
    /* JADX WARN: Code duplicated, block: B:57:0x015b  */
    /* JADX WARN: Code duplicated, block: B:61:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:67:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:69:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:71:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:73:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:75:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:77:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:79:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:81:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:83:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:84:0x0205  */
    /* JADX WARN: Code duplicated, block: B:87:0x0218  */
    /* JADX WARN: Code duplicated, block: B:90:0x022c  */
    /* JADX WARN: Code duplicated, block: B:93:0x023c  */
    /* JADX WARN: Code duplicated, block: B:96:0x0250 A[LOOP:24: B:91:0x0236->B:96:0x0250, LOOP_END] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v11 */
    /* JADX WARN: Type inference failed for: r16v12 */
    /* JADX WARN: Type inference failed for: r16v16 */
    /* JADX WARN: Type inference failed for: r16v17 */
    /* JADX WARN: Type inference failed for: r16v21 */
    /* JADX WARN: Type inference failed for: r16v24 */
    /* JADX WARN: Type inference failed for: r19v2 */
    /* JADX WARN: Type inference failed for: r19v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r19v4 */
    /* JADX WARN: Type inference failed for: r2v47, types: [er] */
    /* JADX WARN: Type inference failed for: r2v48, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r2v52 */
    /* JADX WARN: Type inference failed for: r2v83, types: [er] */
    /* JADX WARN: Type inference failed for: r2v95 */
    /* JADX WARN: Type inference failed for: r30v2 */
    /* JADX WARN: Type inference failed for: r30v3 */
    /* JADX WARN: Type inference failed for: r30v4 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v43 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6, types: [nno] */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v18, types: [ar] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.jaj
    public final Object l(vq.b bVar, hug0 hug0Var, Set<? extends String> set, String str, v1b<? super bno> v1bVar) {
        int i;
        int i2;
        int i3;
        Iterator it;
        Object next;
        cd3 cd3Var;
        int iOrdinal;
        oq oqVar;
        boo znoVar;
        boo booVar;
        int iOrdinal2;
        int i4;
        Iterator it2;
        Object next2;
        cd3 cd3Var2;
        int iOrdinal3;
        oq oqVar2;
        List<sq> list;
        sq sqVar;
        String str2;
        Iterator it3;
        Object next3;
        nr nrVar;
        Iterator it4;
        Object obj;
        pq pqVar;
        BigDecimal bigDecimal;
        Object next4;
        int i5;
        String strA;
        BigDecimal bigDecimalValueOf;
        Iterator it5;
        BigDecimal bigDecimalMultiply;
        Iterator it6;
        sq sqVar2;
        Iterator it7;
        Iterator it8;
        Object next5;
        nr nrVar2;
        Iterator it9;
        Object next6;
        pq pqVar2;
        BigDecimal bigDecimal2;
        String strA2;
        nq nqVar;
        zoo zooVar;
        Iterator it10;
        Object obj2;
        cd3 cd3Var3;
        ArrayList arrayList;
        int iOrdinal4;
        int i6;
        ngs ngsVar;
        ArrayList arrayList2;
        List<oq> list2;
        List<oq> list3;
        boolean z;
        List<ir> list4;
        List<lr> list5;
        List<nr> list6;
        List<pq> list7;
        ArrayList arrayList3;
        int i7;
        ?? r2;
        ngs ngsVar2;
        int i8;
        oq oqVar3;
        List<oq> list8;
        List<nr> list9;
        List<ir> list10;
        ngs ngsVar3;
        ?? r7;
        ?? r8;
        List listB;
        int i9;
        ngs ngsVar4;
        ?? r9;
        boolean z2;
        List<ir> list11;
        List<lr> list12;
        List<nr> list13;
        List<pq> list14;
        int size;
        oq oqVar4;
        String str3;
        String str4;
        ArrayList arrayList4;
        Iterator it11;
        List listA0;
        ArrayList arrayList5;
        int i10;
        Integer numValueOf;
        qcn qcnVarB;
        ArrayList arrayList6;
        int i11;
        Map mapK;
        ArrayList arrayList7;
        Iterator it12;
        int i12;
        int i13;
        ?? r19;
        fr frVar;
        er erVar;
        boolean z3;
        ArrayList arrayList8;
        List<ir> list15;
        List<nr> list16;
        List<lr> list17;
        List<pq> list18;
        ArrayList arrayList9;
        ArrayList arrayList10;
        LinkedHashMap linkedHashMap;
        int size2;
        int i14;
        ?? r16;
        boolean z4;
        List<nr> list19;
        Iterator it13;
        int i15;
        int iIntValue;
        List<oq> list20;
        boolean z5;
        Iterator it14;
        List<lr> list21;
        ngs ngsVar5;
        ArrayList arrayList11;
        ?? r30;
        boolean z6;
        List<pq> list22;
        fr frVar2;
        List<nr> list23;
        int i16;
        boolean z7;
        int size3;
        oq oqVar5;
        String str5;
        String str6;
        ArrayList arrayList12;
        Iterator it15;
        ngs ngsVar6;
        List listA1;
        Iterator it16;
        int i17;
        boolean z8;
        oq oqVar6;
        String str7;
        String str8;
        int size4;
        ArrayList arrayList13;
        ResourceUiText resourceUiText;
        ResourceUiText resourceUiText2;
        BigDecimal bigDecimalAdd;
        BigDecimal bigDecimalAdd2;
        Iterator it17;
        BigDecimal bigDecimalAdd3;
        Iterator it18;
        BigDecimal bigDecimalAdd4;
        Iterator it19;
        Integer num;
        ArrayList arrayList14;
        int i18;
        String str9;
        char c;
        Integer numValueOf2;
        qcn qcnVarB2;
        ArrayList arrayList15;
        Iterator it20;
        int i19;
        Map mapK2;
        ArrayList arrayList16;
        Iterator it21;
        Object next7;
        int i20;
        int i21;
        boolean z9;
        oq oqVar7;
        oq oqVar8;
        ArrayList arrayList17;
        char c2;
        ?? r17;
        Integer numValueOf3;
        Object obj3;
        Object next8;
        List<oq> list24;
        oq oqVar9;
        vq.b bVar2 = bVar;
        hug0 hug0Var2 = hug0Var;
        Set<? extends String> set2 = set;
        String str10 = str;
        vq vqVar = (vq) this.a;
        vqVar.getClass();
        if (bVar2 instanceof vq.b.C1221b) {
            return bno.b.a;
        }
        if (bVar2 instanceof vq.b.a) {
            return new bno.a(new wmo.a(((vq.b.a) bVar2).a.a));
        }
        if (!(bVar2 instanceof vq.b.c)) {
            uhc.a();
            return null;
        }
        nq nqVar2 = ((vq.b.c) bVar2).a;
        Integer numValueOf4 = Integer.valueOf(R.drawable.ic__feature__won);
        ngs ngsVarB = a.b();
        cmo cmoVar = vqVar.e.a;
        nqVar2.getClass();
        String str11 = nqVar2.b;
        String str12 = nqVar2.d;
        hug0Var2.getClass();
        List<pq> list25 = nqVar2.u;
        List<nr> list26 = nqVar2.t;
        BigDecimal bigDecimal3 = nqVar2.n;
        String str13 = nqVar2.c;
        boolean z10 = nqVar2.p;
        boolean z11 = nqVar2.o;
        String str14 = nqVar2.j;
        BigDecimal bigDecimal4 = nqVar2.k;
        List<oq> list27 = nqVar2.q;
        BigDecimal bigDecimal5 = BigDecimal.ZERO;
        Iterator it22 = list27.iterator();
        BigDecimal bigDecimalAdd5 = bigDecimal5;
        while (it22.hasNext()) {
            bigDecimalAdd5 = bigDecimalAdd5.add(((oq) it22.next()).f);
            list25 = list25;
        }
        List<pq> list28 = list25;
        Integer numValueOf5 = Integer.valueOf(R.string.page_instant_virtual__instant_african_cup_logo);
        Integer numC = cmoVar.c(str12);
        ResourceUiText resourceUiTextQ = rqf0.q(str11);
        BigDecimal bigDecimal6 = bigDecimalAdd5;
        String strD = bwf0.a.d(nqVar2.h, true);
        Integer numA = cmoVar.a(str12);
        UiText uiTextD = rqf0.d(list27.size(), str13);
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
            } while (!((cd3) next).a.equalsIgnoreCase(str13));
            cd3Var = (cd3) next;
            if (cd3Var != null) {
                iOrdinal = cd3Var.ordinal();
                if (iOrdinal != 3) {
                    oqVar = (oq) CollectionsKt.firstOrNull(list27);
                    if (oqVar == null) {
                        booVar = null;
                    } else {
                        znoVar = new zno(new ResourceUiText(R.string.component_wap_share_bet__flex_your_bet_vmintowin_of_vsize, ay0.S(new Object[]{String.valueOf(nqVar2.m), String.valueOf(oqVar.h.size())})));
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
            ColoredUiText coloredUiTextT = rqf0.t(R.color.text_inverse_brand_sub, nqVar2.f, z11, z10);
            String strP = rqf0.p(nqVar2.e);
            ResourceUiText resourceUiTextJ = rqf0.j(str14, bigDecimal4, new gr(nqVar2, 0));
            ResourceUiText resourceUiTextI = rqf0.i(bigDecimal4, str14);
            it2 = cd3.f.iterator();
            do {
                if (it2.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it2.next();
            } while (!((cd3) next2).a.equalsIgnoreCase(str13));
            cd3Var2 = (cd3) next2;
            if (cd3Var2 != null) {
                iOrdinal3 = cd3Var2.ordinal();
                if (iOrdinal3 != 0) {
                    oqVar2 = (oq) CollectionsKt.p0(list27);
                    if (oqVar2 != null && (list = oqVar2.h) != null && (sqVar = (sq) CollectionsKt.p0(list)) != null) {
                        str2 = sqVar.c;
                        it3 = list26.iterator();
                        do {
                            if (it3.hasNext()) {
                                next3 = null;
                                break;
                            }
                            next3 = it3.next();
                        } while (!((nr) next3).a.equals(str2));
                        nrVar = (nr) next3;
                        if (nrVar != null) {
                            bigDecimal = nrVar.b;
                        } else {
                            it4 = list28.iterator();
                            while (true) {
                                if (it4.hasNext()) {
                                    obj = null;
                                    break;
                                }
                                next4 = it4.next();
                                if (((pq) next4).a.equals(str2)) {
                                    obj = next4;
                                    break;
                                }
                            }
                            pqVar = (pq) obj;
                            if (pqVar != null) {
                                bigDecimal = pqVar.b;
                            } else {
                                bigDecimal = null;
                            }
                        }
                        if (bigDecimal != null) {
                            i5 = 0;
                            strA = gky.a.a(bjb0.L(bigDecimal, Locale.US), false);
                        }
                    }
                    i5 = 0;
                    strA = null;
                } else if (iOrdinal3 != 1) {
                    bigDecimalValueOf = BigDecimal.valueOf(0L);
                    bigDecimalValueOf.getClass();
                    it5 = list27.iterator();
                    while (true) {
                        if (it5.hasNext()) {
                            List<sq> list29 = ((oq) it5.next()).h;
                            bigDecimalMultiply = BigDecimal.ONE;
                            it6 = list29.iterator();
                            while (true) {
                                if (it6.hasNext()) {
                                    sqVar2 = (sq) it6.next();
                                    it7 = list26.iterator();
                                    while (true) {
                                        if (it7.hasNext()) {
                                            it8 = it5;
                                            next5 = null;
                                            break;
                                        }
                                        next5 = it7.next();
                                        it8 = it5;
                                        if (((nr) next5).a.equals(sqVar2.c)) {
                                            break;
                                        }
                                        it5 = it8;
                                    }
                                    nrVar2 = (nr) next5;
                                    if (nrVar2 != null) {
                                        bigDecimal2 = nrVar2.b;
                                    } else {
                                        it9 = list28.iterator();
                                        do {
                                            if (it9.hasNext()) {
                                                next6 = null;
                                                break;
                                            }
                                            next6 = it9.next();
                                        } while (!((pq) next6).a.equals(sqVar2.c));
                                        pqVar2 = (pq) next6;
                                        if (pqVar2 != null) {
                                            bigDecimal2 = pqVar2.b;
                                        } else {
                                            i5 = 0;
                                            strA = null;
                                        }
                                    }
                                    bigDecimalMultiply.getClass();
                                    bigDecimalMultiply = bigDecimalMultiply.multiply(bigDecimal2);
                                    bigDecimalMultiply.getClass();
                                    it5 = it8;
                                } else {
                                    bigDecimalMultiply.getClass();
                                    bigDecimalValueOf = bigDecimalValueOf.add(bigDecimalMultiply);
                                    bigDecimalValueOf.getClass();
                                }
                            }
                        } else {
                            strA = gky.a.a(bjb0.L(bigDecimalValueOf, Locale.US), false);
                            i5 = 0;
                        }
                    }
                } else if (iOrdinal3 != 2) {
                    if (iOrdinal3 != 3) {
                        strA2 = gky.a.a(bjb0.L(bigDecimal3.setScale(2, RoundingMode.HALF_UP), Locale.US), false);
                    } else {
                        if (iOrdinal3 == 4) {
                            uhc.a();
                            return null;
                        }
                        strA2 = gky.a.a(bjb0.L(bigDecimal3.setScale(2, RoundingMode.HALF_UP), Locale.US), false);
                    }
                    strA = strA2;
                    i5 = 0;
                } else {
                    i5 = 0;
                    strA = null;
                }
            } else {
                i5 = 0;
                strA = null;
            }
            bigDecimal6.getClass();
            ngsVarB.add(new epo(numValueOf5, numC, resourceUiTextQ, str11, strD, numA, uiTextD, aVar, coloredUiText, booVar, coloredUiTextT, strP, resourceUiTextJ, resourceUiTextI, strA, rqf0.f(bigDecimal6), rqf0.v(nqVar2.g)));
            if (z11) {
                nqVar = nqVar2;
            } else {
                nqVar = null;
            }
            if (nqVar != null || (list24 = nqVar.q) == null || (oqVar9 = (oq) CollectionsKt.p0(list24)) == null) {
                zooVar = null;
            } else {
                if (!oqVar9.g) {
                    oqVar9 = null;
                }
                if (oqVar9 != null) {
                    zooVar = new zoo(str12, nqVar2.a);
                } else {
                    zooVar = null;
                }
            }
            if (zooVar != null) {
                ngsVarB.add(zooVar);
            }
            it10 = cd3.f.iterator();
            while (true) {
                if (it10.hasNext()) {
                    obj2 = null;
                    break;
                }
                next8 = it10.next();
                if (((cd3) next8).a.equalsIgnoreCase(str13)) {
                    obj2 = next8;
                    break;
                }
            }
            cd3Var3 = (cd3) obj2;
            if (cd3Var3 == null) {
                listB = n1a0.c;
                ngsVar2 = ngsVarB;
            } else {
                arrayList = new ArrayList();
                iOrdinal4 = cd3Var3.ordinal();
                if (iOrdinal4 != 0) {
                    if (iOrdinal4 == 1) {
                        i9 = i5;
                        ngsVar4 = ngsVarB;
                        arrayList2 = arrayList;
                        r9 = vqVar.b;
                        z2 = nqVar2.o;
                        list11 = nqVar2.r;
                        list12 = nqVar2.s;
                        list13 = nqVar2.t;
                        list14 = nqVar2.u;
                        size = list27.size();
                        oqVar4 = (oq) CollectionsKt.firstOrNull(list27);
                        if (oqVar4 != null) {
                            str3 = oqVar4.b;
                        } else {
                            str3 = null;
                        }
                        if (str3 == null) {
                            str4 = "";
                        } else {
                            str4 = str3;
                        }
                        arrayList4 = new ArrayList();
                        it11 = list27.iterator();
                        while (it11.hasNext()) {
                            p48.w(((oq) it11.next()).h, arrayList4);
                        }
                        listA0 = CollectionsKt.A0(CollectionsKt.D0(arrayList4));
                        arrayList5 = new ArrayList(l48.r(listA0, 10));
                        i10 = i9;
                        for (Object obj4 : listA0) {
                            i13 = i10 + 1;
                            if (i10 >= 0) {
                                b.q();
                                throw null;
                            }
                            sq sqVar3 = (sq) obj4;
                            if (size > 1) {
                                r19 = 1;
                            } else {
                                r19 = i9;
                            }
                            String str15 = str10;
                            str10 = str15;
                            arrayList5.add(r9.a(str12, z2, list11, list12, list13, list14, str4, sqVar3, i10, r19, str15));
                            i10 = i13;
                        }
                        qcn qcnVarB3 = a4h.b(arrayList5);
                        numValueOf = Integer.valueOf(size);
                        if (size <= 1) {
                            numValueOf = null;
                        }
                        if (numValueOf != null) {
                            arrayList6 = new ArrayList(l48.r(listA0, 10));
                            i11 = i9;
                            for (Object obj5 : listA0) {
                                i12 = i11 + 1;
                                if (i11 >= 0) {
                                    b.q();
                                    throw null;
                                }
                                arrayList6.add(new Pair(((sq) obj5).c, String.valueOf(i12)));
                                i11 = i12;
                            }
                            mapK = kpu.k(arrayList6);
                            arrayList7 = new ArrayList(l48.r(list27, 10));
                            it12 = list27.iterator();
                            while (it12.hasNext()) {
                                arrayList7.add(r9.a.a(z2, list13, list14, (oq) it12.next(), mapK));
                            }
                            qcnVarB = a4h.b(arrayList7);
                        } else {
                            qcnVarB = null;
                        }
                        arrayList2.add(new nmo(null, qcnVarB3, rqf0.b(str4), qcnVarB));
                    } else if (iOrdinal4 != 2) {
                        if (iOrdinal4 != 3 && iOrdinal4 != 4) {
                            uhc.a();
                            return null;
                        }
                        i9 = i5;
                        ngsVar4 = ngsVarB;
                        arrayList2 = arrayList;
                        r9 = vqVar.b;
                        z2 = nqVar2.o;
                        list11 = nqVar2.r;
                        list12 = nqVar2.s;
                        list13 = nqVar2.t;
                        list14 = nqVar2.u;
                        size = list27.size();
                        oqVar4 = (oq) CollectionsKt.firstOrNull(list27);
                        if (oqVar4 != null) {
                            str3 = oqVar4.b;
                        } else {
                            str3 = null;
                        }
                        if (str3 == null) {
                            str4 = "";
                        } else {
                            str4 = str3;
                        }
                        arrayList4 = new ArrayList();
                        it11 = list27.iterator();
                        while (it11.hasNext()) {
                            p48.w(((oq) it11.next()).h, arrayList4);
                        }
                        listA0 = CollectionsKt.A0(CollectionsKt.D0(arrayList4));
                        arrayList5 = new ArrayList(l48.r(listA0, 10));
                        i10 = i9;
                        while (r4.hasNext()) {
                            i13 = i10 + 1;
                            if (i10 >= 0) {
                                b.q();
                                throw null;
                            }
                            sq sqVar4 = (sq) obj4;
                            if (size > 1) {
                                r19 = 1;
                            } else {
                                r19 = i9;
                            }
                            String str16 = str10;
                            str10 = str16;
                            arrayList5.add(r9.a(str12, z2, list11, list12, list13, list14, str4, sqVar4, i10, r19, str16));
                            i10 = i13;
                        }
                        qcn qcnVarB4 = a4h.b(arrayList5);
                        numValueOf = Integer.valueOf(size);
                        if (size <= 1) {
                            numValueOf = null;
                        }
                        if (numValueOf != null) {
                            arrayList6 = new ArrayList(l48.r(listA0, 10));
                            i11 = i9;
                            while (r2.hasNext()) {
                                i12 = i11 + 1;
                                if (i11 >= 0) {
                                    b.q();
                                    throw null;
                                }
                                arrayList6.add(new Pair(((sq) obj5).c, String.valueOf(i12)));
                                i11 = i12;
                            }
                            mapK = kpu.k(arrayList6);
                            arrayList7 = new ArrayList(l48.r(list27, 10));
                            it12 = list27.iterator();
                            while (it12.hasNext()) {
                                arrayList7.add(r9.a.a(z2, list13, list14, (oq) it12.next(), mapK));
                            }
                            qcnVarB = a4h.b(arrayList7);
                        } else {
                            qcnVarB = null;
                        }
                        arrayList2.add(new nmo(null, qcnVarB4, rqf0.b(str4), qcnVarB));
                    } else {
                        frVar = vqVar.d;
                        erVar = frVar.c;
                        set2.getClass();
                        z3 = nqVar2.o;
                        arrayList8 = arrayList;
                        list15 = nqVar2.r;
                        List<lr> list30 = nqVar2.s;
                        list16 = nqVar2.t;
                        list17 = list30;
                        list18 = nqVar2.u;
                        arrayList9 = new ArrayList();
                        arrayList10 = new ArrayList();
                        for (Object obj6 : list27) {
                            if (!((oq) obj6).h.isEmpty()) {
                                arrayList10.add(obj6);
                            }
                        }
                        linkedHashMap = new LinkedHashMap();
                        size2 = arrayList10.size();
                        i14 = 0;
                        while (i14 < size2) {
                            er erVar2 = erVar;
                            Object obj7 = arrayList10.get(i14);
                            i14++;
                            boolean z12 = z3;
                            numValueOf3 = Integer.valueOf(((oq) obj7).h.size());
                            obj3 = linkedHashMap.get(numValueOf3);
                            if (obj3 == null) {
                                ArrayList arrayList18 = new ArrayList();
                                linkedHashMap.put(numValueOf3, arrayList18);
                                obj3 = arrayList18;
                            }
                            ((List) obj3).add(obj7);
                            erVar = erVar2;
                            z3 = z12;
                            list16 = list16;
                        }
                        r16 = erVar;
                        z4 = z3;
                        list19 = list16;
                        it13 = linkedHashMap.entrySet().iterator();
                        i15 = 0;
                        while (it13.hasNext()) {
                            Map.Entry entry = (Map.Entry) it13.next();
                            iIntValue = ((Number) entry.getKey()).intValue();
                            list20 = (List) entry.getValue();
                            z5 = true;
                            if (iIntValue == 1) {
                                c2 = '\n';
                                arrayList17 = new ArrayList(l48.r(list20, 10));
                                r17 = r16;
                                for (oq oqVar10 : list20) {
                                    int i22 = i15 + 1;
                                    List<lr> list31 = list17;
                                    ?? r3 = r17;
                                    Iterator it23 = it13;
                                    if (i15 != 0) {
                                        z5 = false;
                                    }
                                    boolean z13 = z4;
                                    List<nr> list32 = list19;
                                    nno nnoVarA = r3.a(z13, list32, list18, oqVar10, z5, set2);
                                    ngs ngsVar7 = ngsVarB;
                                    String str17 = str12;
                                    ArrayList arrayList19 = arrayList17;
                                    ArrayList arrayList20 = arrayList8;
                                    List<pq> list33 = list18;
                                    arrayList19.add(new nmo(nnoVarA, a4h.a(r3.b(str17, z13, list15, list31, list32, list33, oqVar10, str10)), rqf0.b(oqVar10.b), null));
                                    it13 = it23;
                                    arrayList17 = arrayList19;
                                    z4 = z13;
                                    list19 = list32;
                                    list18 = list33;
                                    i15 = i22;
                                    r17 = r3;
                                    z5 = true;
                                    arrayList8 = arrayList20;
                                    frVar = frVar;
                                    str12 = str17;
                                    ngsVarB = ngsVar7;
                                    list17 = list31;
                                    c2 = '\n';
                                }
                                it14 = it13;
                                list21 = list17;
                                ngs ngsVar8 = ngsVarB;
                                str9 = str12;
                                fr frVar3 = frVar;
                                ArrayList arrayList21 = arrayList8;
                                r30 = r17;
                                z6 = z4;
                                list23 = list19;
                                list22 = list18;
                                arrayList9.addAll(arrayList17);
                                arrayList13 = arrayList21;
                                frVar2 = frVar3;
                                ngsVar6 = ngsVar8;
                                c = 2;
                            } else {
                                it14 = it13;
                                list21 = list17;
                                ngsVar5 = ngsVarB;
                                String str18 = str12;
                                arrayList11 = arrayList8;
                                r30 = r16;
                                z6 = z4;
                                list22 = list18;
                                frVar2 = frVar;
                                list23 = list19;
                                i16 = i15 + 1;
                                if (i15 == 0) {
                                    z7 = true;
                                } else {
                                    z7 = false;
                                }
                                size3 = list20.size();
                                oqVar5 = (oq) CollectionsKt.firstOrNull(list20);
                                if (oqVar5 != null) {
                                    str5 = oqVar5.b;
                                } else {
                                    str5 = null;
                                }
                                if (str5 == null) {
                                    str6 = "";
                                } else {
                                    str6 = str5;
                                }
                                arrayList12 = new ArrayList();
                                it15 = list20.iterator();
                                while (it15.hasNext()) {
                                    p48.w(((oq) it15.next()).h, arrayList12);
                                    ngsVar5 = ngsVar5;
                                }
                                ngsVar6 = ngsVar5;
                                listA1 = CollectionsKt.A0(CollectionsKt.D0(arrayList12));
                                if (list20.isEmpty()) {
                                    i17 = i16;
                                    z8 = false;
                                    break;
                                }
                                it16 = list20.iterator();
                                while (true) {
                                    if (it16.hasNext()) {
                                        i17 = i16;
                                        z8 = false;
                                        break;
                                    }
                                    i17 = i16;
                                    if (((oq) it16.next()).g) {
                                        z8 = true;
                                        break;
                                    }
                                    i16 = i17;
                                }
                                oqVar6 = (oq) CollectionsKt.firstOrNull(list20);
                                if (oqVar6 != null) {
                                    str7 = oqVar6.b;
                                } else {
                                    str7 = null;
                                }
                                if (str7 == null) {
                                    str7 = "";
                                }
                                str8 = str18;
                                size4 = list20.size();
                                List<ir> list34 = list15;
                                if (iIntValue != 1) {
                                    arrayList13 = arrayList11;
                                    resourceUiText = new ResourceUiText(R.string.component_betslip__single);
                                } else if (iIntValue != 2) {
                                    arrayList13 = arrayList11;
                                    if (iIntValue != 3) {
                                        resourceUiText = new ResourceUiText(R.string.component_betslip__veventsize_folds, ay0.S(new Object[]{String.valueOf(iIntValue)}));
                                    } else {
                                        resourceUiText = new ResourceUiText(R.string.component_betslip__trebles);
                                    }
                                } else {
                                    arrayList13 = arrayList11;
                                    resourceUiText = new ResourceUiText(R.string.component_betslip__doubles);
                                }
                                if (size4 > 1) {
                                    resourceUiText2 = new ResourceUiText(R.string.app_common__iwqk_folds_title, ay0.S(new Object[]{resourceUiText, String.valueOf(size4)}));
                                } else {
                                    resourceUiText2 = resourceUiText;
                                }
                                bigDecimalAdd = BigDecimal.ZERO;
                                for (oq oqVar11 : list20) {
                                    if (oqVar11.g) {
                                        bigDecimalAdd = bigDecimalAdd.add(oqVar11.d);
                                    }
                                }
                                bigDecimalAdd2 = BigDecimal.ZERO;
                                it17 = list20.iterator();
                                while (it17.hasNext()) {
                                    bigDecimalAdd2 = bigDecimalAdd2.add(((oq) it17.next()).c);
                                }
                                bigDecimalAdd3 = BigDecimal.ZERO;
                                it18 = list20.iterator();
                                while (it18.hasNext()) {
                                    BigDecimal bigDecimal7 = bigDecimalAdd2;
                                    oqVar8 = (oq) it18.next();
                                    Iterator it24 = it18;
                                    if (oqVar8.g) {
                                        bigDecimalAdd3 = bigDecimalAdd3.add(oqVar8.f);
                                    }
                                    it18 = it24;
                                    bigDecimalAdd2 = bigDecimal7;
                                }
                                BigDecimal bigDecimal8 = bigDecimalAdd2;
                                bigDecimalAdd4 = BigDecimal.ZERO;
                                it19 = list20.iterator();
                                while (it19.hasNext()) {
                                    BigDecimal bigDecimal9 = bigDecimalAdd3;
                                    oqVar7 = (oq) it19.next();
                                    Iterator it25 = it19;
                                    if (oqVar7.g) {
                                        bigDecimalAdd4 = bigDecimalAdd4.add(oqVar7.e);
                                    }
                                    it19 = it25;
                                    bigDecimalAdd3 = bigDecimal9;
                                }
                                BigDecimal bigDecimal10 = bigDecimalAdd3;
                                boolean zContains = set2.contains(str7);
                                if (z8) {
                                    num = numValueOf4;
                                } else {
                                    num = null;
                                }
                                ColoredUiText coloredUiTextC = rqf0.c(z6, z8);
                                bigDecimalAdd.getClass();
                                String strM = rqf0.m(bigDecimalAdd, z6, z8);
                                bigDecimal8.getClass();
                                String strP2 = rqf0.p(bigDecimal8);
                                bigDecimal10.getClass();
                                String strF = rqf0.f(bigDecimal10);
                                bigDecimalAdd4.getClass();
                                nno nnoVar = new nno(str7, zContains, resourceUiText2, num, coloredUiTextC, strM, strP2, null, strF, rqf0.v(bigDecimalAdd4), z7, null);
                                arrayList14 = new ArrayList(l48.r(listA1, 10));
                                list15 = list34;
                                i18 = 0;
                                for (Object obj8 : listA1) {
                                    i21 = i18 + 1;
                                    if (i18 >= 0) {
                                        b.q();
                                        throw null;
                                    }
                                    sq sqVar5 = (sq) obj8;
                                    String str19 = str10;
                                    ar arVar = frVar2.b;
                                    if (size3 > 1) {
                                        z9 = true;
                                    } else {
                                        z9 = false;
                                    }
                                    String str20 = str8;
                                    str10 = str19;
                                    arrayList14.add(arVar.a(str20, z6, list15, list21, list23, list22, str6, sqVar5, i18, z9, str19));
                                    str8 = str20;
                                    i18 = i21;
                                }
                                str9 = str8;
                                c = 2;
                                qcn qcnVarB5 = a4h.b(arrayList14);
                                numValueOf2 = Integer.valueOf(size3);
                                if (size3 <= 1) {
                                    numValueOf2 = null;
                                }
                                if (numValueOf2 != null) {
                                    arrayList15 = new ArrayList(l48.r(listA1, 10));
                                    it20 = listA1.iterator();
                                    i19 = 0;
                                    while (it20.hasNext()) {
                                        next7 = it20.next();
                                        i20 = i19 + 1;
                                        if (i19 >= 0) {
                                            b.q();
                                            throw null;
                                        }
                                        arrayList15.add(new Pair(((sq) next7).c, String.valueOf(i20)));
                                        it20 = it20;
                                        i19 = i20;
                                    }
                                    mapK2 = kpu.k(arrayList15);
                                    arrayList16 = new ArrayList(l48.r(list20, 10));
                                    it21 = list20.iterator();
                                    while (it21.hasNext()) {
                                        arrayList16.add(frVar2.a.a(z6, list23, list22, (oq) it21.next(), mapK2));
                                    }
                                    qcnVarB2 = a4h.b(arrayList16);
                                } else {
                                    qcnVarB2 = null;
                                }
                                arrayList9.add(new nmo(nnoVar, qcnVarB5, rqf0.b(str6), qcnVarB2));
                                i15 = i17;
                            }
                            it13 = it14;
                            z4 = z6;
                            list17 = list21;
                            list19 = list23;
                            r16 = r30;
                            frVar = frVar2;
                            str12 = str9;
                            list18 = list22;
                            arrayList8 = arrayList13;
                            ngsVarB = ngsVar6;
                        }
                        ngsVar4 = ngsVarB;
                        arrayList2 = arrayList8;
                        arrayList2.addAll(arrayList9);
                    }
                    ngsVar2 = ngsVar4;
                } else {
                    i6 = i5;
                    ngsVar = ngsVarB;
                    arrayList2 = arrayList;
                    list2 = null;
                    list3 = list27;
                    er erVar3 = vqVar.c;
                    set2.getClass();
                    z = nqVar2.o;
                    list4 = nqVar2.r;
                    list5 = nqVar2.s;
                    list6 = nqVar2.t;
                    list7 = nqVar2.u;
                    arrayList3 = new ArrayList(l48.r(list3, 10));
                    i7 = i6;
                    r2 = erVar3;
                    for (Object obj9 : list3) {
                        i8 = i7 + 1;
                        if (i7 >= 0) {
                            ?? r4 = list2;
                            b.q();
                            throw r4;
                        }
                        oqVar3 = (oq) obj9;
                        if (list3.size() > 1) {
                            list8 = list3;
                        } else {
                            list8 = list2;
                        }
                        if (list8 != null) {
                            if (i7 == 0) {
                                r8 = 1;
                            } else {
                                r8 = i6;
                            }
                            boolean z14 = z;
                            list9 = list6;
                            ngs ngsVar9 = ngsVar;
                            List<pq> list35 = list7;
                            nno nnoVarA2 = r2.a(z14, list9, list35, oqVar3, r8, set2);
                            list10 = list4;
                            list7 = list35;
                            oqVar3 = oqVar3;
                            ngsVar3 = ngsVar9;
                            z = z14;
                            r7 = nnoVarA2;
                        } else {
                            list9 = list6;
                            list10 = list4;
                            ngsVar3 = ngsVar;
                            r7 = list2;
                        }
                        List<nr> list36 = list9;
                        arrayList3.add(new nmo(r7, a4h.a(r2.b(str12, z, list10, list5, list36, list7, oqVar3, str10)), rqf0.b(oqVar3.b), null));
                        list2 = null;
                        list6 = list36;
                        ngsVar = ngsVar3;
                        r2 = r2;
                        list4 = list10;
                        i7 = i8;
                        list3 = list3;
                    }
                    ngsVar2 = ngsVar;
                    arrayList2.addAll(arrayList3);
                }
                listB = a4h.b(arrayList2);
            }
            ngsVar2.addAll(listB);
            return new bno.c(a4h.b(a.a(ngsVar2)));
        }
        i = R.string.bet_history__waiting_to_kick_off;
        int i23 = i;
        i2 = R.color.text_inverse_primary;
        i3 = i23;
        ColoredUiText coloredUiText2 = new ColoredUiText(new ResourceUiText(i3), Integer.valueOf(i2), null);
        it = cd3.f.iterator();
        do {
            if (it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((cd3) next).a.equalsIgnoreCase(str13));
        cd3Var = (cd3) next;
        if (cd3Var != null) {
            iOrdinal = cd3Var.ordinal();
            if (iOrdinal != 3) {
                oqVar = (oq) CollectionsKt.firstOrNull(list27);
                if (oqVar == null) {
                    booVar = null;
                } else {
                    znoVar = new zno(new ResourceUiText(R.string.component_wap_share_bet__flex_your_bet_vmintowin_of_vsize, ay0.S(new Object[]{String.valueOf(nqVar2.m), String.valueOf(oqVar.h.size())})));
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
        ColoredUiText coloredUiTextT2 = rqf0.t(R.color.text_inverse_brand_sub, nqVar2.f, z11, z10);
        String strP3 = rqf0.p(nqVar2.e);
        ResourceUiText resourceUiTextJ2 = rqf0.j(str14, bigDecimal4, new gr(nqVar2, 0));
        ResourceUiText resourceUiTextI2 = rqf0.i(bigDecimal4, str14);
        it2 = cd3.f.iterator();
        do {
            if (it2.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it2.next();
        } while (!((cd3) next2).a.equalsIgnoreCase(str13));
        cd3Var2 = (cd3) next2;
        if (cd3Var2 != null) {
            iOrdinal3 = cd3Var2.ordinal();
            if (iOrdinal3 != 0) {
                oqVar2 = (oq) CollectionsKt.p0(list27);
                if (oqVar2 != null) {
                    str2 = sqVar.c;
                    it3 = list26.iterator();
                    do {
                        if (it3.hasNext()) {
                            next3 = null;
                            break;
                        }
                        next3 = it3.next();
                    } while (!((nr) next3).a.equals(str2));
                    nrVar = (nr) next3;
                    if (nrVar != null) {
                        bigDecimal = nrVar.b;
                    } else {
                        it4 = list28.iterator();
                        while (true) {
                            if (it4.hasNext()) {
                                obj = null;
                                break;
                            }
                            next4 = it4.next();
                            if (((pq) next4).a.equals(str2)) {
                                obj = next4;
                                break;
                            }
                        }
                        pqVar = (pq) obj;
                        if (pqVar != null) {
                            bigDecimal = pqVar.b;
                        } else {
                            bigDecimal = null;
                        }
                    }
                    if (bigDecimal != null) {
                        i5 = 0;
                        strA = gky.a.a(bjb0.L(bigDecimal, Locale.US), false);
                    }
                }
                i5 = 0;
                strA = null;
            } else if (iOrdinal3 != 1) {
                bigDecimalValueOf = BigDecimal.valueOf(0L);
                bigDecimalValueOf.getClass();
                it5 = list27.iterator();
                while (true) {
                    if (it5.hasNext()) {
                        List<sq> list210 = ((oq) it5.next()).h;
                        bigDecimalMultiply = BigDecimal.ONE;
                        it6 = list210.iterator();
                        while (true) {
                            if (it6.hasNext()) {
                                sqVar2 = (sq) it6.next();
                                it7 = list26.iterator();
                                while (true) {
                                    if (it7.hasNext()) {
                                        it8 = it5;
                                        next5 = null;
                                        break;
                                    }
                                    next5 = it7.next();
                                    it8 = it5;
                                    if (((nr) next5).a.equals(sqVar2.c)) {
                                        break;
                                        break;
                                    }
                                    it5 = it8;
                                }
                                nrVar2 = (nr) next5;
                                if (nrVar2 != null) {
                                    bigDecimal2 = nrVar2.b;
                                } else {
                                    it9 = list28.iterator();
                                    do {
                                        if (it9.hasNext()) {
                                            next6 = null;
                                            break;
                                        }
                                        next6 = it9.next();
                                    } while (!((pq) next6).a.equals(sqVar2.c));
                                    pqVar2 = (pq) next6;
                                    if (pqVar2 != null) {
                                        bigDecimal2 = pqVar2.b;
                                    } else {
                                        i5 = 0;
                                        strA = null;
                                    }
                                }
                                bigDecimalMultiply.getClass();
                                bigDecimalMultiply = bigDecimalMultiply.multiply(bigDecimal2);
                                bigDecimalMultiply.getClass();
                                it5 = it8;
                            } else {
                                bigDecimalMultiply.getClass();
                                bigDecimalValueOf = bigDecimalValueOf.add(bigDecimalMultiply);
                                bigDecimalValueOf.getClass();
                            }
                        }
                    } else {
                        strA = gky.a.a(bjb0.L(bigDecimalValueOf, Locale.US), false);
                        i5 = 0;
                    }
                }
            } else if (iOrdinal3 != 2) {
                if (iOrdinal3 != 3) {
                    strA2 = gky.a.a(bjb0.L(bigDecimal3.setScale(2, RoundingMode.HALF_UP), Locale.US), false);
                } else {
                    if (iOrdinal3 == 4) {
                        uhc.a();
                        return null;
                    }
                    strA2 = gky.a.a(bjb0.L(bigDecimal3.setScale(2, RoundingMode.HALF_UP), Locale.US), false);
                }
                strA = strA2;
                i5 = 0;
            } else {
                i5 = 0;
                strA = null;
            }
        } else {
            i5 = 0;
            strA = null;
        }
        bigDecimal6.getClass();
        ngsVarB.add(new epo(numValueOf5, numC, resourceUiTextQ, str11, strD, numA, uiTextD, aVar, coloredUiText2, booVar, coloredUiTextT2, strP3, resourceUiTextJ2, resourceUiTextI2, strA, rqf0.f(bigDecimal6), rqf0.v(nqVar2.g)));
        if (z11) {
            nqVar = nqVar2;
        } else {
            nqVar = null;
        }
        if (nqVar != null) {
            zooVar = null;
        } else {
            zooVar = null;
        }
        if (zooVar != null) {
            ngsVarB.add(zooVar);
        }
        it10 = cd3.f.iterator();
        while (true) {
            if (it10.hasNext()) {
                obj2 = null;
                break;
            }
            next8 = it10.next();
            if (((cd3) next8).a.equalsIgnoreCase(str13)) {
                obj2 = next8;
                break;
            }
        }
        cd3Var3 = (cd3) obj2;
        if (cd3Var3 == null) {
            listB = n1a0.c;
            ngsVar2 = ngsVarB;
        } else {
            arrayList = new ArrayList();
            iOrdinal4 = cd3Var3.ordinal();
            if (iOrdinal4 != 0) {
                if (iOrdinal4 == 1) {
                    i9 = i5;
                    ngsVar4 = ngsVarB;
                    arrayList2 = arrayList;
                    r9 = vqVar.b;
                    z2 = nqVar2.o;
                    list11 = nqVar2.r;
                    list12 = nqVar2.s;
                    list13 = nqVar2.t;
                    list14 = nqVar2.u;
                    size = list27.size();
                    oqVar4 = (oq) CollectionsKt.firstOrNull(list27);
                    if (oqVar4 != null) {
                        str3 = oqVar4.b;
                    } else {
                        str3 = null;
                    }
                    if (str3 == null) {
                        str4 = "";
                    } else {
                        str4 = str3;
                    }
                    arrayList4 = new ArrayList();
                    it11 = list27.iterator();
                    while (it11.hasNext()) {
                        p48.w(((oq) it11.next()).h, arrayList4);
                    }
                    listA0 = CollectionsKt.A0(CollectionsKt.D0(arrayList4));
                    arrayList5 = new ArrayList(l48.r(listA0, 10));
                    i10 = i9;
                    while (r4.hasNext()) {
                        i13 = i10 + 1;
                        if (i10 >= 0) {
                            b.q();
                            throw null;
                        }
                        sq sqVar6 = (sq) obj4;
                        if (size > 1) {
                            r19 = 1;
                        } else {
                            r19 = i9;
                        }
                        String str110 = str10;
                        str10 = str110;
                        arrayList5.add(r9.a(str12, z2, list11, list12, list13, list14, str4, sqVar6, i10, r19, str110));
                        i10 = i13;
                    }
                    qcn qcnVarB6 = a4h.b(arrayList5);
                    numValueOf = Integer.valueOf(size);
                    if (size <= 1) {
                        numValueOf = null;
                    }
                    if (numValueOf != null) {
                        arrayList6 = new ArrayList(l48.r(listA0, 10));
                        i11 = i9;
                        while (r2.hasNext()) {
                            i12 = i11 + 1;
                            if (i11 >= 0) {
                                b.q();
                                throw null;
                            }
                            arrayList6.add(new Pair(((sq) obj5).c, String.valueOf(i12)));
                            i11 = i12;
                        }
                        mapK = kpu.k(arrayList6);
                        arrayList7 = new ArrayList(l48.r(list27, 10));
                        it12 = list27.iterator();
                        while (it12.hasNext()) {
                            arrayList7.add(r9.a.a(z2, list13, list14, (oq) it12.next(), mapK));
                        }
                        qcnVarB = a4h.b(arrayList7);
                    } else {
                        qcnVarB = null;
                    }
                    arrayList2.add(new nmo(null, qcnVarB6, rqf0.b(str4), qcnVarB));
                } else if (iOrdinal4 != 2) {
                    if (iOrdinal4 != 3) {
                        uhc.a();
                        return null;
                    }
                    i9 = i5;
                    ngsVar4 = ngsVarB;
                    arrayList2 = arrayList;
                    r9 = vqVar.b;
                    z2 = nqVar2.o;
                    list11 = nqVar2.r;
                    list12 = nqVar2.s;
                    list13 = nqVar2.t;
                    list14 = nqVar2.u;
                    size = list27.size();
                    oqVar4 = (oq) CollectionsKt.firstOrNull(list27);
                    if (oqVar4 != null) {
                        str3 = oqVar4.b;
                    } else {
                        str3 = null;
                    }
                    if (str3 == null) {
                        str4 = "";
                    } else {
                        str4 = str3;
                    }
                    arrayList4 = new ArrayList();
                    it11 = list27.iterator();
                    while (it11.hasNext()) {
                        p48.w(((oq) it11.next()).h, arrayList4);
                    }
                    listA0 = CollectionsKt.A0(CollectionsKt.D0(arrayList4));
                    arrayList5 = new ArrayList(l48.r(listA0, 10));
                    i10 = i9;
                    while (r4.hasNext()) {
                        i13 = i10 + 1;
                        if (i10 >= 0) {
                            b.q();
                            throw null;
                        }
                        sq sqVar7 = (sq) obj4;
                        if (size > 1) {
                            r19 = 1;
                        } else {
                            r19 = i9;
                        }
                        String str111 = str10;
                        str10 = str111;
                        arrayList5.add(r9.a(str12, z2, list11, list12, list13, list14, str4, sqVar7, i10, r19, str111));
                        i10 = i13;
                    }
                    qcn qcnVarB7 = a4h.b(arrayList5);
                    numValueOf = Integer.valueOf(size);
                    if (size <= 1) {
                        numValueOf = null;
                    }
                    if (numValueOf != null) {
                        arrayList6 = new ArrayList(l48.r(listA0, 10));
                        i11 = i9;
                        while (r2.hasNext()) {
                            i12 = i11 + 1;
                            if (i11 >= 0) {
                                b.q();
                                throw null;
                            }
                            arrayList6.add(new Pair(((sq) obj5).c, String.valueOf(i12)));
                            i11 = i12;
                        }
                        mapK = kpu.k(arrayList6);
                        arrayList7 = new ArrayList(l48.r(list27, 10));
                        it12 = list27.iterator();
                        while (it12.hasNext()) {
                            arrayList7.add(r9.a.a(z2, list13, list14, (oq) it12.next(), mapK));
                        }
                        qcnVarB = a4h.b(arrayList7);
                    } else {
                        qcnVarB = null;
                    }
                    arrayList2.add(new nmo(null, qcnVarB7, rqf0.b(str4), qcnVarB));
                } else {
                    frVar = vqVar.d;
                    erVar = frVar.c;
                    set2.getClass();
                    z3 = nqVar2.o;
                    arrayList8 = arrayList;
                    list15 = nqVar2.r;
                    List<lr> list37 = nqVar2.s;
                    list16 = nqVar2.t;
                    list17 = list37;
                    list18 = nqVar2.u;
                    arrayList9 = new ArrayList();
                    arrayList10 = new ArrayList();
                    while (r16.hasNext()) {
                        if (!((oq) obj6).h.isEmpty()) {
                            arrayList10.add(obj6);
                        }
                    }
                    linkedHashMap = new LinkedHashMap();
                    size2 = arrayList10.size();
                    i14 = 0;
                    while (i14 < size2) {
                        er erVar4 = erVar;
                        Object obj10 = arrayList10.get(i14);
                        i14++;
                        boolean z15 = z3;
                        numValueOf3 = Integer.valueOf(((oq) obj10).h.size());
                        obj3 = linkedHashMap.get(numValueOf3);
                        if (obj3 == null) {
                            ArrayList arrayList110 = new ArrayList();
                            linkedHashMap.put(numValueOf3, arrayList110);
                            obj3 = arrayList110;
                        }
                        ((List) obj3).add(obj10);
                        erVar = erVar4;
                        z3 = z15;
                        list16 = list16;
                    }
                    r16 = erVar;
                    z4 = z3;
                    list19 = list16;
                    it13 = linkedHashMap.entrySet().iterator();
                    i15 = 0;
                    while (it13.hasNext()) {
                        Map.Entry entry2 = (Map.Entry) it13.next();
                        iIntValue = ((Number) entry2.getKey()).intValue();
                        list20 = (List) entry2.getValue();
                        z5 = true;
                        if (iIntValue == 1) {
                            c2 = '\n';
                            arrayList17 = new ArrayList(l48.r(list20, 10));
                            r17 = r16;
                            while (r19.hasNext()) {
                                int i24 = i15 + 1;
                                List<lr> list38 = list17;
                                ?? r5 = r17;
                                Iterator it26 = it13;
                                if (i15 != 0) {
                                    z5 = false;
                                }
                                boolean z16 = z4;
                                List<nr> list39 = list19;
                                nno nnoVarA3 = r5.a(z16, list39, list18, oqVar10, z5, set2);
                                ngs ngsVar10 = ngsVarB;
                                String str112 = str12;
                                ArrayList arrayList111 = arrayList17;
                                ArrayList arrayList22 = arrayList8;
                                List<pq> list310 = list18;
                                arrayList111.add(new nmo(nnoVarA3, a4h.a(r5.b(str112, z16, list15, list38, list39, list310, oqVar10, str10)), rqf0.b(oqVar10.b), null));
                                it13 = it26;
                                arrayList17 = arrayList111;
                                z4 = z16;
                                list19 = list39;
                                list18 = list310;
                                i15 = i24;
                                r17 = r5;
                                z5 = true;
                                arrayList8 = arrayList22;
                                frVar = frVar;
                                str12 = str112;
                                ngsVarB = ngsVar10;
                                list17 = list38;
                                c2 = '\n';
                            }
                            it14 = it13;
                            list21 = list17;
                            ngs ngsVar11 = ngsVarB;
                            str9 = str12;
                            fr frVar4 = frVar;
                            ArrayList arrayList23 = arrayList8;
                            r30 = r17;
                            z6 = z4;
                            list23 = list19;
                            list22 = list18;
                            arrayList9.addAll(arrayList17);
                            arrayList13 = arrayList23;
                            frVar2 = frVar4;
                            ngsVar6 = ngsVar11;
                            c = 2;
                        } else {
                            it14 = it13;
                            list21 = list17;
                            ngsVar5 = ngsVarB;
                            String str113 = str12;
                            arrayList11 = arrayList8;
                            r30 = r16;
                            z6 = z4;
                            list22 = list18;
                            frVar2 = frVar;
                            list23 = list19;
                            i16 = i15 + 1;
                            if (i15 == 0) {
                                z7 = true;
                            } else {
                                z7 = false;
                            }
                            size3 = list20.size();
                            oqVar5 = (oq) CollectionsKt.firstOrNull(list20);
                            if (oqVar5 != null) {
                                str5 = oqVar5.b;
                            } else {
                                str5 = null;
                            }
                            if (str5 == null) {
                                str6 = "";
                            } else {
                                str6 = str5;
                            }
                            arrayList12 = new ArrayList();
                            it15 = list20.iterator();
                            while (it15.hasNext()) {
                                p48.w(((oq) it15.next()).h, arrayList12);
                                ngsVar5 = ngsVar5;
                            }
                            ngsVar6 = ngsVar5;
                            listA1 = CollectionsKt.A0(CollectionsKt.D0(arrayList12));
                            if (list20.isEmpty()) {
                                i17 = i16;
                                z8 = false;
                                break;
                            }
                            it16 = list20.iterator();
                            while (true) {
                                if (it16.hasNext()) {
                                    i17 = i16;
                                    z8 = false;
                                    break;
                                }
                                i17 = i16;
                                if (((oq) it16.next()).g) {
                                    z8 = true;
                                    break;
                                }
                                i16 = i17;
                            }
                            oqVar6 = (oq) CollectionsKt.firstOrNull(list20);
                            if (oqVar6 != null) {
                                str7 = oqVar6.b;
                            } else {
                                str7 = null;
                            }
                            if (str7 == null) {
                                str7 = "";
                            }
                            str8 = str113;
                            size4 = list20.size();
                            List<ir> list311 = list15;
                            if (iIntValue != 1) {
                                arrayList13 = arrayList11;
                                resourceUiText = new ResourceUiText(R.string.component_betslip__single);
                            } else if (iIntValue != 2) {
                                arrayList13 = arrayList11;
                                if (iIntValue != 3) {
                                    resourceUiText = new ResourceUiText(R.string.component_betslip__veventsize_folds, ay0.S(new Object[]{String.valueOf(iIntValue)}));
                                } else {
                                    resourceUiText = new ResourceUiText(R.string.component_betslip__trebles);
                                }
                            } else {
                                arrayList13 = arrayList11;
                                resourceUiText = new ResourceUiText(R.string.component_betslip__doubles);
                            }
                            if (size4 > 1) {
                                resourceUiText2 = new ResourceUiText(R.string.app_common__iwqk_folds_title, ay0.S(new Object[]{resourceUiText, String.valueOf(size4)}));
                            } else {
                                resourceUiText2 = resourceUiText;
                            }
                            bigDecimalAdd = BigDecimal.ZERO;
                            while (r3.hasNext()) {
                                if (oqVar11.g) {
                                    bigDecimalAdd = bigDecimalAdd.add(oqVar11.d);
                                }
                            }
                            bigDecimalAdd2 = BigDecimal.ZERO;
                            it17 = list20.iterator();
                            while (it17.hasNext()) {
                                bigDecimalAdd2 = bigDecimalAdd2.add(((oq) it17.next()).c);
                            }
                            bigDecimalAdd3 = BigDecimal.ZERO;
                            it18 = list20.iterator();
                            while (it18.hasNext()) {
                                BigDecimal bigDecimal11 = bigDecimalAdd2;
                                oqVar8 = (oq) it18.next();
                                Iterator it27 = it18;
                                if (oqVar8.g) {
                                    bigDecimalAdd3 = bigDecimalAdd3.add(oqVar8.f);
                                }
                                it18 = it27;
                                bigDecimalAdd2 = bigDecimal11;
                            }
                            BigDecimal bigDecimal12 = bigDecimalAdd2;
                            bigDecimalAdd4 = BigDecimal.ZERO;
                            it19 = list20.iterator();
                            while (it19.hasNext()) {
                                BigDecimal bigDecimal13 = bigDecimalAdd3;
                                oqVar7 = (oq) it19.next();
                                Iterator it28 = it19;
                                if (oqVar7.g) {
                                    bigDecimalAdd4 = bigDecimalAdd4.add(oqVar7.e);
                                }
                                it19 = it28;
                                bigDecimalAdd3 = bigDecimal13;
                            }
                            BigDecimal bigDecimal14 = bigDecimalAdd3;
                            boolean zContains2 = set2.contains(str7);
                            if (z8) {
                                num = numValueOf4;
                            } else {
                                num = null;
                            }
                            ColoredUiText coloredUiTextC2 = rqf0.c(z6, z8);
                            bigDecimalAdd.getClass();
                            String strM2 = rqf0.m(bigDecimalAdd, z6, z8);
                            bigDecimal12.getClass();
                            String strP4 = rqf0.p(bigDecimal12);
                            bigDecimal14.getClass();
                            String strF2 = rqf0.f(bigDecimal14);
                            bigDecimalAdd4.getClass();
                            nno nnoVar2 = new nno(str7, zContains2, resourceUiText2, num, coloredUiTextC2, strM2, strP4, null, strF2, rqf0.v(bigDecimalAdd4), z7, null);
                            arrayList14 = new ArrayList(l48.r(listA1, 10));
                            list15 = list311;
                            i18 = 0;
                            while (r23.hasNext()) {
                                i21 = i18 + 1;
                                if (i18 >= 0) {
                                    b.q();
                                    throw null;
                                }
                                sq sqVar8 = (sq) obj8;
                                String str114 = str10;
                                ar arVar2 = frVar2.b;
                                if (size3 > 1) {
                                    z9 = true;
                                } else {
                                    z9 = false;
                                }
                                String str21 = str8;
                                str10 = str114;
                                arrayList14.add(arVar2.a(str21, z6, list15, list21, list23, list22, str6, sqVar8, i18, z9, str114));
                                str8 = str21;
                                i18 = i21;
                            }
                            str9 = str8;
                            c = 2;
                            qcn qcnVarB8 = a4h.b(arrayList14);
                            numValueOf2 = Integer.valueOf(size3);
                            if (size3 <= 1) {
                                numValueOf2 = null;
                            }
                            if (numValueOf2 != null) {
                                arrayList15 = new ArrayList(l48.r(listA1, 10));
                                it20 = listA1.iterator();
                                i19 = 0;
                                while (it20.hasNext()) {
                                    next7 = it20.next();
                                    i20 = i19 + 1;
                                    if (i19 >= 0) {
                                        b.q();
                                        throw null;
                                    }
                                    arrayList15.add(new Pair(((sq) next7).c, String.valueOf(i20)));
                                    it20 = it20;
                                    i19 = i20;
                                }
                                mapK2 = kpu.k(arrayList15);
                                arrayList16 = new ArrayList(l48.r(list20, 10));
                                it21 = list20.iterator();
                                while (it21.hasNext()) {
                                    arrayList16.add(frVar2.a.a(z6, list23, list22, (oq) it21.next(), mapK2));
                                }
                                qcnVarB2 = a4h.b(arrayList16);
                            } else {
                                qcnVarB2 = null;
                            }
                            arrayList9.add(new nmo(nnoVar2, qcnVarB8, rqf0.b(str6), qcnVarB2));
                            i15 = i17;
                        }
                        it13 = it14;
                        z4 = z6;
                        list17 = list21;
                        list19 = list23;
                        r16 = r30;
                        frVar = frVar2;
                        str12 = str9;
                        list18 = list22;
                        arrayList8 = arrayList13;
                        ngsVarB = ngsVar6;
                    }
                    ngsVar4 = ngsVarB;
                    arrayList2 = arrayList8;
                    arrayList2.addAll(arrayList9);
                }
                ngsVar2 = ngsVar4;
            } else {
                i6 = i5;
                ngsVar = ngsVarB;
                arrayList2 = arrayList;
                list2 = null;
                list3 = list27;
                er erVar5 = vqVar.c;
                set2.getClass();
                z = nqVar2.o;
                list4 = nqVar2.r;
                list5 = nqVar2.s;
                list6 = nqVar2.t;
                list7 = nqVar2.u;
                arrayList3 = new ArrayList(l48.r(list3, 10));
                i7 = i6;
                r2 = erVar5;
                while (r18.hasNext()) {
                    i8 = i7 + 1;
                    if (i7 >= 0) {
                        ?? r6 = list2;
                        b.q();
                        throw r6;
                    }
                    oqVar3 = (oq) obj9;
                    if (list3.size() > 1) {
                        list8 = list3;
                    } else {
                        list8 = list2;
                    }
                    if (list8 != null) {
                        if (i7 == 0) {
                            r8 = 1;
                        } else {
                            r8 = i6;
                        }
                        boolean z17 = z;
                        list9 = list6;
                        ngs ngsVar12 = ngsVar;
                        List<pq> list312 = list7;
                        nno nnoVarA4 = r2.a(z17, list9, list312, oqVar3, r8, set2);
                        list10 = list4;
                        list7 = list312;
                        oqVar3 = oqVar3;
                        ngsVar3 = ngsVar12;
                        z = z17;
                        r7 = nnoVarA4;
                    } else {
                        list9 = list6;
                        list10 = list4;
                        ngsVar3 = ngsVar;
                        r7 = list2;
                    }
                    List<nr> list313 = list9;
                    arrayList3.add(new nmo(r7, a4h.a(r2.b(str12, z, list10, list5, list313, list7, oqVar3, str10)), rqf0.b(oqVar3.b), null));
                    list2 = null;
                    list6 = list313;
                    ngsVar = ngsVar3;
                    r2 = r2;
                    list4 = list10;
                    i7 = i8;
                    list3 = list3;
                }
                ngsVar2 = ngsVar;
                arrayList2.addAll(arrayList3);
            }
            listB = a4h.b(arrayList2);
        }
        ngsVar2.addAll(listB);
        return new bno.c(a4h.b(a.a(ngsVar2)));
    }
}
