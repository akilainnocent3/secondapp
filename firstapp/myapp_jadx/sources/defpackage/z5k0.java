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
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class z5k0 extends pf implements jaj<v5k0.b, hug0, Set<? extends String>, String, v1b<? super bno>, Object> {
    /* JADX WARN: Code duplicated, block: B:100:0x0260  */
    /* JADX WARN: Code duplicated, block: B:101:0x0263  */
    /* JADX WARN: Code duplicated, block: B:104:0x026d  */
    /* JADX WARN: Code duplicated, block: B:110:0x0285  */
    /* JADX WARN: Code duplicated, block: B:115:0x02bb  */
    /* JADX WARN: Code duplicated, block: B:125:0x02de  */
    /* JADX WARN: Code duplicated, block: B:131:0x02f3  */
    /* JADX WARN: Code duplicated, block: B:132:0x02f6  */
    /* JADX WARN: Code duplicated, block: B:135:0x0300  */
    /* JADX WARN: Code duplicated, block: B:141:0x0316  */
    /* JADX WARN: Code duplicated, block: B:142:0x0319  */
    /* JADX WARN: Code duplicated, block: B:144:0x031c  */
    /* JADX WARN: Code duplicated, block: B:147:0x0344  */
    /* JADX WARN: Code duplicated, block: B:148:0x0346  */
    /* JADX WARN: Code duplicated, block: B:160:0x0365  */
    /* JADX WARN: Code duplicated, block: B:162:0x0368  */
    /* JADX WARN: Code duplicated, block: B:166:0x0377  */
    /* JADX WARN: Code duplicated, block: B:172:0x038d  */
    /* JADX WARN: Code duplicated, block: B:173:0x0392  */
    /* JADX WARN: Code duplicated, block: B:175:0x039d  */
    /* JADX WARN: Code duplicated, block: B:177:0x03a2  */
    /* JADX WARN: Code duplicated, block: B:179:0x03a5  */
    /* JADX WARN: Code duplicated, block: B:183:0x03ab  */
    /* JADX WARN: Code duplicated, block: B:186:0x03ba  */
    /* JADX WARN: Code duplicated, block: B:189:0x03e8  */
    /* JADX WARN: Code duplicated, block: B:191:0x03f7  */
    /* JADX WARN: Code duplicated, block: B:195:0x0409  */
    /* JADX WARN: Code duplicated, block: B:197:0x0426  */
    /* JADX WARN: Code duplicated, block: B:198:0x0433  */
    /* JADX WARN: Code duplicated, block: B:203:0x0458  */
    /* JADX WARN: Code duplicated, block: B:205:0x0471  */
    /* JADX WARN: Code duplicated, block: B:208:0x0486  */
    /* JADX WARN: Code duplicated, block: B:211:0x04a1  */
    /* JADX WARN: Code duplicated, block: B:214:0x0511  */
    /* JADX WARN: Code duplicated, block: B:216:0x0525  */
    /* JADX WARN: Code duplicated, block: B:217:0x0528  */
    /* JADX WARN: Code duplicated, block: B:220:0x0536  */
    /* JADX WARN: Code duplicated, block: B:221:0x0539  */
    /* JADX WARN: Code duplicated, block: B:223:0x053c  */
    /* JADX WARN: Code duplicated, block: B:224:0x053f  */
    /* JADX WARN: Code duplicated, block: B:228:0x0550 A[LOOP:8: B:226:0x054a->B:228:0x0550, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:231:0x0572 A[EDGE_INSN: B:231:0x0572->B:239:0x0594 BREAK  A[LOOP:16: B:233:0x057b->B:238:0x0591], PHI: r7
      0x0572: PHI (r7v36 int) = (r7v18 int), (r7v19 int) binds: [B:230:0x0570, B:431:0x0572] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:232:0x0577  */
    /* JADX WARN: Code duplicated, block: B:235:0x0581  */
    /* JADX WARN: Code duplicated, block: B:238:0x0591 A[LOOP:16: B:233:0x057b->B:238:0x0591, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:241:0x059c  */
    /* JADX WARN: Code duplicated, block: B:242:0x059f  */
    /* JADX WARN: Code duplicated, block: B:244:0x05a2  */
    /* JADX WARN: Code duplicated, block: B:247:0x05af  */
    /* JADX WARN: Code duplicated, block: B:249:0x05b2  */
    /* JADX WARN: Code duplicated, block: B:251:0x05b7  */
    /* JADX WARN: Code duplicated, block: B:253:0x05cd  */
    /* JADX WARN: Code duplicated, block: B:254:0x05d6  */
    /* JADX WARN: Code duplicated, block: B:255:0x05e1  */
    /* JADX WARN: Code duplicated, block: B:257:0x05ee  */
    /* JADX WARN: Code duplicated, block: B:258:0x0605  */
    /* JADX WARN: Code duplicated, block: B:262:0x0613  */
    /* JADX WARN: Code duplicated, block: B:268:0x0630 A[LOOP:10: B:266:0x062a->B:268:0x0630, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:272:0x0649  */
    /* JADX WARN: Code duplicated, block: B:274:0x0659  */
    /* JADX WARN: Code duplicated, block: B:279:0x0673  */
    /* JADX WARN: Code duplicated, block: B:281:0x0683  */
    /* JADX WARN: Code duplicated, block: B:285:0x0698  */
    /* JADX WARN: Code duplicated, block: B:286:0x069b  */
    /* JADX WARN: Code duplicated, block: B:290:0x06e1  */
    /* JADX WARN: Code duplicated, block: B:292:0x06e9  */
    /* JADX WARN: Code duplicated, block: B:294:0x06f7  */
    /* JADX WARN: Code duplicated, block: B:296:0x06fc  */
    /* JADX WARN: Code duplicated, block: B:303:0x0724  */
    /* JADX WARN: Code duplicated, block: B:305:0x0727  */
    /* JADX WARN: Code duplicated, block: B:308:0x073e  */
    /* JADX WARN: Code duplicated, block: B:310:0x0746 A[LOOP:14: B:306:0x0738->B:310:0x0746, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:316:0x077b A[LOOP:15: B:314:0x0775->B:316:0x077b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:318:0x079a  */
    /* JADX WARN: Code duplicated, block: B:325:0x07e1  */
    /* JADX WARN: Code duplicated, block: B:326:0x07e4  */
    /* JADX WARN: Code duplicated, block: B:328:0x07e7  */
    /* JADX WARN: Code duplicated, block: B:329:0x07ea  */
    /* JADX WARN: Code duplicated, block: B:333:0x07fb A[LOOP:17: B:331:0x07f5->B:333:0x07fb, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:337:0x0826  */
    /* JADX WARN: Code duplicated, block: B:339:0x082e  */
    /* JADX WARN: Code duplicated, block: B:33:0x010c  */
    /* JADX WARN: Code duplicated, block: B:341:0x0833  */
    /* JADX WARN: Code duplicated, block: B:343:0x083a  */
    /* JADX WARN: Code duplicated, block: B:350:0x085a  */
    /* JADX WARN: Code duplicated, block: B:352:0x085d  */
    /* JADX WARN: Code duplicated, block: B:355:0x0872  */
    /* JADX WARN: Code duplicated, block: B:357:0x087a A[LOOP:19: B:353:0x086c->B:357:0x087a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:363:0x08ad A[LOOP:20: B:361:0x08a7->B:363:0x08ad, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:365:0x08c6  */
    /* JADX WARN: Code duplicated, block: B:367:0x08d6  */
    /* JADX WARN: Code duplicated, block: B:370:0x0907  */
    /* JADX WARN: Code duplicated, block: B:372:0x090f  */
    /* JADX WARN: Code duplicated, block: B:374:0x091a  */
    /* JADX WARN: Code duplicated, block: B:375:0x091c  */
    /* JADX WARN: Code duplicated, block: B:377:0x091f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:378:0x0921  */
    /* JADX WARN: Code duplicated, block: B:380:0x092d  */
    /* JADX WARN: Code duplicated, block: B:383:0x0942  */
    /* JADX WARN: Code duplicated, block: B:394:0x011c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:397:0x01b9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:39:0x0124  */
    /* JADX WARN: Code duplicated, block: B:400:0x0388 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:401:0x0386 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:402:? A[LOOP:3: B:164:0x0371->B:402:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:405:0x03fa A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:409:0x070f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:40:0x0127  */
    /* JADX WARN: Code duplicated, block: B:410:0x075d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:417:0x061d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:419:0x060d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:424:0x0660 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:427:0x0689 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:42:0x012d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:431:0x0572 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:432:0x058f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:435:0x0849 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:437:0x088d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:440:0x097a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:441:0x02a7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:442:0x0295 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:443:0x0298 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:446:0x0259 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:447:0x0253 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:448:0x0280 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:449:0x027e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:44:0x0130  */
    /* JADX WARN: Code duplicated, block: B:450:? A[LOOP:25: B:102:0x0267->B:450:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:451:0x02ee A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:454:0x0311 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:455:0x030f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:456:? A[LOOP:27: B:133:0x02fa->B:456:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:0x0137 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:47:0x0139 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:48:0x013b  */
    /* JADX WARN: Code duplicated, block: B:49:0x013f  */
    /* JADX WARN: Code duplicated, block: B:50:0x0143  */
    /* JADX WARN: Code duplicated, block: B:51:0x0147  */
    /* JADX WARN: Code duplicated, block: B:54:0x0152  */
    /* JADX WARN: Code duplicated, block: B:57:0x015b  */
    /* JADX WARN: Code duplicated, block: B:61:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:67:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:69:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:71:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:73:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:75:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:77:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:79:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:81:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:83:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:84:0x0209  */
    /* JADX WARN: Code duplicated, block: B:87:0x021c  */
    /* JADX WARN: Code duplicated, block: B:90:0x0230  */
    /* JADX WARN: Code duplicated, block: B:93:0x0240  */
    /* JADX WARN: Code duplicated, block: B:96:0x0255 A[LOOP:24: B:91:0x023a->B:96:0x0255, LOOP_END] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v11 */
    /* JADX WARN: Type inference failed for: r16v12 */
    /* JADX WARN: Type inference failed for: r16v16 */
    /* JADX WARN: Type inference failed for: r16v17 */
    /* JADX WARN: Type inference failed for: r16v22 */
    /* JADX WARN: Type inference failed for: r16v25 */
    /* JADX WARN: Type inference failed for: r19v2 */
    /* JADX WARN: Type inference failed for: r19v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r19v4 */
    /* JADX WARN: Type inference failed for: r2v44, types: [f6k0] */
    /* JADX WARN: Type inference failed for: r2v45, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r2v49 */
    /* JADX WARN: Type inference failed for: r2v80, types: [f6k0] */
    /* JADX WARN: Type inference failed for: r2v92 */
    /* JADX WARN: Type inference failed for: r30v2 */
    /* JADX WARN: Type inference failed for: r30v3 */
    /* JADX WARN: Type inference failed for: r30v4 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v43 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6, types: [nno] */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v15, types: [b6k0] */
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
    public final Object l(v5k0.b bVar, hug0 hug0Var, Set<? extends String> set, String str, v1b<? super bno> v1bVar) {
        int i;
        int i2;
        int i3;
        ColoredUiText coloredUiText;
        Iterator it;
        Object next;
        cd3 cd3Var;
        int iOrdinal;
        q5k0 q5k0Var;
        boo znoVar;
        boo booVar;
        int iOrdinal2;
        int i4;
        Iterator it2;
        Object next2;
        cd3 cd3Var2;
        int iOrdinal3;
        ColoredUiText coloredUiText2;
        q5k0 q5k0Var2;
        List<u5k0> list;
        u5k0 u5k0Var;
        String str2;
        Iterator it3;
        Object next3;
        n6k0 n6k0Var;
        Iterator it4;
        Object obj;
        r5k0 r5k0Var;
        BigDecimal bigDecimal;
        Object next4;
        int i5;
        String strA;
        BigDecimal bigDecimalValueOf;
        Iterator it5;
        BigDecimal bigDecimalMultiply;
        Iterator it6;
        u5k0 u5k0Var2;
        Iterator it7;
        Object obj2;
        n6k0 n6k0Var2;
        Iterator it8;
        Object obj3;
        r5k0 r5k0Var2;
        BigDecimal bigDecimal2;
        Object next5;
        Object next6;
        String strA2;
        p5k0 p5k0Var;
        zoo zooVar;
        Iterator it9;
        Object obj4;
        cd3 cd3Var3;
        ArrayList arrayList;
        int iOrdinal4;
        int i6;
        ngs ngsVar;
        ArrayList arrayList2;
        List<q5k0> list2;
        List<q5k0> list3;
        boolean z;
        List<j6k0> list4;
        List<l6k0> list5;
        List<n6k0> list6;
        List<r5k0> list7;
        ArrayList arrayList3;
        int i7;
        ?? r2;
        ngs ngsVar2;
        int i8;
        q5k0 q5k0Var3;
        List<q5k0> list8;
        List<n6k0> list9;
        List<j6k0> list10;
        ngs ngsVar3;
        ?? r7;
        ?? r8;
        List listB;
        int i9;
        ngs ngsVar4;
        ?? r9;
        boolean z2;
        List<j6k0> list11;
        List<l6k0> list12;
        List<n6k0> list13;
        List<r5k0> list14;
        int size;
        q5k0 q5k0Var4;
        String str3;
        String str4;
        ArrayList arrayList4;
        Iterator it10;
        List listA0;
        ArrayList arrayList5;
        int i10;
        Integer numValueOf;
        qcn qcnVarB;
        ArrayList arrayList6;
        Map mapK;
        ArrayList arrayList7;
        Iterator it11;
        int i11;
        int i12;
        ?? r19;
        g6k0 g6k0Var;
        f6k0 f6k0Var;
        boolean z3;
        ArrayList arrayList8;
        List<j6k0> list15;
        List<l6k0> list16;
        List<n6k0> list17;
        List<r5k0> list18;
        ArrayList arrayList9;
        ArrayList arrayList10;
        LinkedHashMap linkedHashMap;
        int size2;
        int i13;
        ?? r16;
        boolean z4;
        List<n6k0> list19;
        Iterator it12;
        int i14;
        int iIntValue;
        List<q5k0> list20;
        boolean z5;
        Iterator it13;
        List<l6k0> list21;
        ngs ngsVar5;
        ArrayList arrayList11;
        ?? r30;
        boolean z6;
        List<r5k0> list22;
        g6k0 g6k0Var2;
        List<n6k0> list23;
        int i15;
        boolean z7;
        int size3;
        q5k0 q5k0Var5;
        String str5;
        String str6;
        ArrayList arrayList12;
        Iterator it14;
        ngs ngsVar6;
        List listA1;
        Iterator it15;
        int i16;
        boolean z8;
        q5k0 q5k0Var6;
        String str7;
        String str8;
        int size4;
        ArrayList arrayList13;
        ResourceUiText resourceUiText;
        ResourceUiText resourceUiText2;
        BigDecimal bigDecimalAdd;
        BigDecimal bigDecimalAdd2;
        Iterator it16;
        BigDecimal bigDecimalAdd3;
        Iterator it17;
        BigDecimal bigDecimalAdd4;
        Iterator it18;
        Integer num;
        ArrayList arrayList14;
        int i17;
        String str9;
        char c;
        Integer numValueOf2;
        qcn qcnVarB2;
        ArrayList arrayList15;
        Iterator it19;
        int i18;
        Map mapK2;
        ArrayList arrayList16;
        Iterator it20;
        Object next7;
        int i19;
        int i20;
        boolean z9;
        q5k0 q5k0Var7;
        q5k0 q5k0Var8;
        ArrayList arrayList17;
        char c2;
        ?? r17;
        Integer numValueOf3;
        Object obj5;
        Object next8;
        List<q5k0> list24;
        q5k0 q5k0Var9;
        v5k0.b bVar2 = bVar;
        hug0 hug0Var2 = hug0Var;
        Set<? extends String> set2 = set;
        String str10 = str;
        v5k0 v5k0Var = (v5k0) this.a;
        v5k0Var.getClass();
        if (bVar2 instanceof v5k0.b.C1206b) {
            return bno.b.a;
        }
        if (bVar2 instanceof v5k0.b.a) {
            return new bno.a(new wmo.a(((v5k0.b.a) bVar2).a.a));
        }
        if (!(bVar2 instanceof v5k0.b.c)) {
            uhc.a();
            return null;
        }
        final p5k0 p5k0Var2 = ((v5k0.b.c) bVar2).a;
        Integer numValueOf4 = Integer.valueOf(R.drawable.ic__feature__won);
        ngs ngsVarB = a.b();
        cmo cmoVar = v5k0Var.e.a;
        p5k0Var2.getClass();
        String str11 = p5k0Var2.b;
        String str12 = p5k0Var2.d;
        hug0Var2.getClass();
        List<r5k0> list25 = p5k0Var2.u;
        List<n6k0> list26 = p5k0Var2.t;
        BigDecimal bigDecimal3 = p5k0Var2.n;
        String str13 = p5k0Var2.c;
        boolean z10 = p5k0Var2.p;
        boolean z11 = p5k0Var2.o;
        String str14 = p5k0Var2.j;
        BigDecimal bigDecimal4 = p5k0Var2.k;
        List<q5k0> list27 = p5k0Var2.q;
        BigDecimal bigDecimal5 = BigDecimal.ZERO;
        Iterator it21 = list27.iterator();
        BigDecimal bigDecimalAdd5 = bigDecimal5;
        while (it21.hasNext()) {
            bigDecimalAdd5 = bigDecimalAdd5.add(((q5k0) it21.next()).f);
            list25 = list25;
        }
        List<r5k0> list28 = list25;
        Integer numValueOf5 = Integer.valueOf(R.string.page_instant_virtual__instant_world_cup_logo);
        Integer numC = cmoVar.c(str12);
        ResourceUiText resourceUiTextQ = rqf0.q(str11);
        BigDecimal bigDecimal6 = bigDecimalAdd5;
        String strD = bwf0.a.d(p5k0Var2.h, true);
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
            coloredUiText = new ColoredUiText(new ResourceUiText(i3), Integer.valueOf(i2), null);
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
                    q5k0Var = (q5k0) CollectionsKt.firstOrNull(list27);
                    if (q5k0Var == null) {
                        booVar = null;
                    } else {
                        znoVar = new zno(new ResourceUiText(R.string.component_wap_share_bet__flex_your_bet_vmintowin_of_vsize, ay0.S(new Object[]{String.valueOf(p5k0Var2.m), String.valueOf(q5k0Var.h.size())})));
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
            ColoredUiText coloredUiTextT = rqf0.t(R.color.text_inverse_brand_sub, p5k0Var2.f, z11, z10);
            String strP = rqf0.p(p5k0Var2.e);
            ResourceUiText resourceUiTextJ = rqf0.j(str14, bigDecimal4, new Function0() { // from class: h6k0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    int i21 = p5k0Var2.l;
                    if (i21 == 1) {
                        return Integer.valueOf(R.string.common_functions__cash_gift);
                    }
                    if (i21 == 2) {
                        return Integer.valueOf(R.string.common_functions__discount_gift);
                    }
                    if (i21 == 3) {
                        return Integer.valueOf(R.string.common_functions__free_bet_gift);
                    }
                    return null;
                }
            });
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
                    coloredUiText2 = coloredUiText;
                    q5k0Var2 = (q5k0) CollectionsKt.p0(list27);
                    if (q5k0Var2 != null && (list = q5k0Var2.h) != null && (u5k0Var = (u5k0) CollectionsKt.p0(list)) != null) {
                        str2 = u5k0Var.c;
                        it3 = list26.iterator();
                        do {
                            if (it3.hasNext()) {
                                next3 = null;
                                break;
                            }
                            next3 = it3.next();
                        } while (!((n6k0) next3).a.equals(str2));
                        n6k0Var = (n6k0) next3;
                        if (n6k0Var != null) {
                            bigDecimal = n6k0Var.b;
                        } else {
                            it4 = list28.iterator();
                            while (true) {
                                if (it4.hasNext()) {
                                    obj = null;
                                    break;
                                }
                                next4 = it4.next();
                                if (((r5k0) next4).a.equals(str2)) {
                                    obj = next4;
                                    break;
                                }
                            }
                            r5k0Var = (r5k0) obj;
                            if (r5k0Var != null) {
                                bigDecimal = r5k0Var.b;
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
                            List<u5k0> list29 = ((q5k0) it5.next()).h;
                            bigDecimalMultiply = BigDecimal.ONE;
                            it6 = list29.iterator();
                            while (true) {
                                if (it6.hasNext()) {
                                    u5k0Var2 = (u5k0) it6.next();
                                    it7 = list26.iterator();
                                    while (true) {
                                        if (it7.hasNext()) {
                                            coloredUiText2 = coloredUiText;
                                            obj2 = null;
                                            break;
                                        }
                                        next6 = it7.next();
                                        coloredUiText2 = coloredUiText;
                                        if (((n6k0) next6).a.equals(u5k0Var2.c)) {
                                            obj2 = next6;
                                            break;
                                        }
                                        coloredUiText = coloredUiText2;
                                    }
                                    n6k0Var2 = (n6k0) obj2;
                                    if (n6k0Var2 != null) {
                                        bigDecimal2 = n6k0Var2.b;
                                    } else {
                                        it8 = list28.iterator();
                                        while (true) {
                                            if (it8.hasNext()) {
                                                obj3 = null;
                                                break;
                                            }
                                            next5 = it8.next();
                                            if (((r5k0) next5).a.equals(u5k0Var2.c)) {
                                                obj3 = next5;
                                                break;
                                            }
                                        }
                                        r5k0Var2 = (r5k0) obj3;
                                        if (r5k0Var2 != null) {
                                            bigDecimal2 = r5k0Var2.b;
                                        } else {
                                            i5 = 0;
                                            strA = null;
                                        }
                                    }
                                    bigDecimalMultiply.getClass();
                                    bigDecimalMultiply = bigDecimalMultiply.multiply(bigDecimal2);
                                    bigDecimalMultiply.getClass();
                                    coloredUiText = coloredUiText2;
                                } else {
                                    bigDecimalMultiply.getClass();
                                    bigDecimalValueOf = bigDecimalValueOf.add(bigDecimalMultiply);
                                    bigDecimalValueOf.getClass();
                                }
                            }
                        } else {
                            coloredUiText2 = coloredUiText;
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
                    i5 = 0;
                    strA = strA2;
                    coloredUiText2 = coloredUiText;
                } else {
                    i5 = 0;
                    coloredUiText2 = coloredUiText;
                    strA = null;
                }
            } else {
                i5 = 0;
                coloredUiText2 = coloredUiText;
                strA = null;
            }
            bigDecimal6.getClass();
            ngsVarB.add(new epo(numValueOf5, numC, resourceUiTextQ, str11, strD, numA, uiTextD, aVar, coloredUiText2, booVar, coloredUiTextT, strP, resourceUiTextJ, resourceUiTextI, strA, rqf0.f(bigDecimal6), rqf0.v(p5k0Var2.g)));
            if (z11) {
                p5k0Var = p5k0Var2;
            } else {
                p5k0Var = null;
            }
            if (p5k0Var != null || (list24 = p5k0Var.q) == null || (q5k0Var9 = (q5k0) CollectionsKt.p0(list24)) == null) {
                zooVar = null;
            } else {
                if (!q5k0Var9.g) {
                    q5k0Var9 = null;
                }
                if (q5k0Var9 != null) {
                    zooVar = new zoo(str12, p5k0Var2.a);
                } else {
                    zooVar = null;
                }
            }
            if (zooVar != null) {
                ngsVarB.add(zooVar);
            }
            it9 = cd3.f.iterator();
            while (true) {
                if (it9.hasNext()) {
                    obj4 = null;
                    break;
                }
                next8 = it9.next();
                if (((cd3) next8).a.equalsIgnoreCase(str13)) {
                    obj4 = next8;
                    break;
                }
            }
            cd3Var3 = (cd3) obj4;
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
                        r9 = v5k0Var.b;
                        z2 = p5k0Var2.o;
                        list11 = p5k0Var2.r;
                        list12 = p5k0Var2.s;
                        list13 = p5k0Var2.t;
                        list14 = p5k0Var2.u;
                        size = list27.size();
                        q5k0Var4 = (q5k0) CollectionsKt.firstOrNull(list27);
                        if (q5k0Var4 != null) {
                            str3 = q5k0Var4.b;
                        } else {
                            str3 = null;
                        }
                        if (str3 == null) {
                            str4 = "";
                        } else {
                            str4 = str3;
                        }
                        arrayList4 = new ArrayList();
                        it10 = list27.iterator();
                        while (it10.hasNext()) {
                            p48.w(((q5k0) it10.next()).h, arrayList4);
                        }
                        listA0 = CollectionsKt.A0(CollectionsKt.D0(arrayList4));
                        arrayList5 = new ArrayList(l48.r(listA0, 10));
                        i10 = i9;
                        for (Object obj6 : listA0) {
                            i12 = i10 + 1;
                            if (i10 >= 0) {
                                b.q();
                                throw null;
                            }
                            u5k0 u5k0Var3 = (u5k0) obj6;
                            if (size > 1) {
                                r19 = 1;
                            } else {
                                r19 = i9;
                            }
                            String str15 = str10;
                            str10 = str15;
                            arrayList5.add(r9.a(str12, z2, list11, list12, list13, list14, str4, u5k0Var3, i10, r19, str15));
                            i10 = i12;
                        }
                        qcn qcnVarB3 = a4h.b(arrayList5);
                        numValueOf = Integer.valueOf(size);
                        if (size <= 1) {
                            numValueOf = null;
                        }
                        if (numValueOf != null) {
                            arrayList6 = new ArrayList(l48.r(listA0, 10));
                            for (Object obj7 : listA0) {
                                i11 = i9 + 1;
                                if (i9 >= 0) {
                                    b.q();
                                    throw null;
                                }
                                arrayList6.add(new Pair(((u5k0) obj7).c, String.valueOf(i11)));
                                i9 = i11;
                            }
                            mapK = kpu.k(arrayList6);
                            arrayList7 = new ArrayList(l48.r(list27, 10));
                            it11 = list27.iterator();
                            while (it11.hasNext()) {
                                arrayList7.add(r9.a.a(z2, list13, list14, (q5k0) it11.next(), mapK));
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
                        r9 = v5k0Var.b;
                        z2 = p5k0Var2.o;
                        list11 = p5k0Var2.r;
                        list12 = p5k0Var2.s;
                        list13 = p5k0Var2.t;
                        list14 = p5k0Var2.u;
                        size = list27.size();
                        q5k0Var4 = (q5k0) CollectionsKt.firstOrNull(list27);
                        if (q5k0Var4 != null) {
                            str3 = q5k0Var4.b;
                        } else {
                            str3 = null;
                        }
                        if (str3 == null) {
                            str4 = "";
                        } else {
                            str4 = str3;
                        }
                        arrayList4 = new ArrayList();
                        it10 = list27.iterator();
                        while (it10.hasNext()) {
                            p48.w(((q5k0) it10.next()).h, arrayList4);
                        }
                        listA0 = CollectionsKt.A0(CollectionsKt.D0(arrayList4));
                        arrayList5 = new ArrayList(l48.r(listA0, 10));
                        i10 = i9;
                        while (r4.hasNext()) {
                            i12 = i10 + 1;
                            if (i10 >= 0) {
                                b.q();
                                throw null;
                            }
                            u5k0 u5k0Var4 = (u5k0) obj6;
                            if (size > 1) {
                                r19 = 1;
                            } else {
                                r19 = i9;
                            }
                            String str16 = str10;
                            str10 = str16;
                            arrayList5.add(r9.a(str12, z2, list11, list12, list13, list14, str4, u5k0Var4, i10, r19, str16));
                            i10 = i12;
                        }
                        qcn qcnVarB4 = a4h.b(arrayList5);
                        numValueOf = Integer.valueOf(size);
                        if (size <= 1) {
                            numValueOf = null;
                        }
                        if (numValueOf != null) {
                            arrayList6 = new ArrayList(l48.r(listA0, 10));
                            while (r2.hasNext()) {
                                i11 = i9 + 1;
                                if (i9 >= 0) {
                                    b.q();
                                    throw null;
                                }
                                arrayList6.add(new Pair(((u5k0) obj7).c, String.valueOf(i11)));
                                i9 = i11;
                            }
                            mapK = kpu.k(arrayList6);
                            arrayList7 = new ArrayList(l48.r(list27, 10));
                            it11 = list27.iterator();
                            while (it11.hasNext()) {
                                arrayList7.add(r9.a.a(z2, list13, list14, (q5k0) it11.next(), mapK));
                            }
                            qcnVarB = a4h.b(arrayList7);
                        } else {
                            qcnVarB = null;
                        }
                        arrayList2.add(new nmo(null, qcnVarB4, rqf0.b(str4), qcnVarB));
                    } else {
                        g6k0Var = v5k0Var.d;
                        f6k0Var = g6k0Var.c;
                        set2.getClass();
                        z3 = p5k0Var2.o;
                        arrayList8 = arrayList;
                        list15 = p5k0Var2.r;
                        list16 = p5k0Var2.s;
                        list17 = p5k0Var2.t;
                        list18 = p5k0Var2.u;
                        arrayList9 = new ArrayList();
                        arrayList10 = new ArrayList();
                        for (Object obj8 : list27) {
                            if (!((q5k0) obj8).h.isEmpty()) {
                                arrayList10.add(obj8);
                            }
                        }
                        linkedHashMap = new LinkedHashMap();
                        size2 = arrayList10.size();
                        i13 = 0;
                        while (i13 < size2) {
                            f6k0 f6k0Var2 = f6k0Var;
                            Object obj9 = arrayList10.get(i13);
                            i13++;
                            boolean z12 = z3;
                            numValueOf3 = Integer.valueOf(((q5k0) obj9).h.size());
                            obj5 = linkedHashMap.get(numValueOf3);
                            if (obj5 == null) {
                                ArrayList arrayList18 = new ArrayList();
                                linkedHashMap.put(numValueOf3, arrayList18);
                                obj5 = arrayList18;
                            }
                            ((List) obj5).add(obj9);
                            f6k0Var = f6k0Var2;
                            z3 = z12;
                            list17 = list17;
                        }
                        r16 = f6k0Var;
                        z4 = z3;
                        list19 = list17;
                        it12 = linkedHashMap.entrySet().iterator();
                        i14 = 0;
                        while (it12.hasNext()) {
                            Map.Entry entry = (Map.Entry) it12.next();
                            iIntValue = ((Number) entry.getKey()).intValue();
                            list20 = (List) entry.getValue();
                            z5 = true;
                            if (iIntValue == 1) {
                                c2 = '\n';
                                arrayList17 = new ArrayList(l48.r(list20, 10));
                                r17 = r16;
                                for (q5k0 q5k0Var10 : list20) {
                                    int i21 = i14 + 1;
                                    List<l6k0> list30 = list16;
                                    ?? r3 = r17;
                                    Iterator it22 = it12;
                                    if (i14 != 0) {
                                        z5 = false;
                                    }
                                    boolean z13 = z4;
                                    List<n6k0> list31 = list19;
                                    nno nnoVarA = r3.a(z13, list31, list18, q5k0Var10, z5, set2);
                                    ngs ngsVar7 = ngsVarB;
                                    String str17 = str12;
                                    ArrayList arrayList19 = arrayList17;
                                    ArrayList arrayList20 = arrayList8;
                                    List<r5k0> list32 = list18;
                                    arrayList19.add(new nmo(nnoVarA, a4h.a(r3.b(str17, z13, list15, list30, list31, list32, q5k0Var10, str10)), rqf0.b(q5k0Var10.b), null));
                                    it12 = it22;
                                    arrayList17 = arrayList19;
                                    z4 = z13;
                                    list19 = list31;
                                    list18 = list32;
                                    i14 = i21;
                                    r17 = r3;
                                    z5 = true;
                                    arrayList8 = arrayList20;
                                    g6k0Var = g6k0Var;
                                    str12 = str17;
                                    ngsVarB = ngsVar7;
                                    list16 = list30;
                                    c2 = '\n';
                                }
                                it13 = it12;
                                list21 = list16;
                                ngs ngsVar8 = ngsVarB;
                                str9 = str12;
                                g6k0 g6k0Var3 = g6k0Var;
                                ArrayList arrayList21 = arrayList8;
                                r30 = r17;
                                z6 = z4;
                                list23 = list19;
                                list22 = list18;
                                arrayList9.addAll(arrayList17);
                                arrayList13 = arrayList21;
                                g6k0Var2 = g6k0Var3;
                                ngsVar6 = ngsVar8;
                                c = 2;
                            } else {
                                it13 = it12;
                                list21 = list16;
                                ngsVar5 = ngsVarB;
                                String str18 = str12;
                                arrayList11 = arrayList8;
                                r30 = r16;
                                z6 = z4;
                                list22 = list18;
                                g6k0Var2 = g6k0Var;
                                list23 = list19;
                                i15 = i14 + 1;
                                if (i14 == 0) {
                                    z7 = true;
                                } else {
                                    z7 = false;
                                }
                                size3 = list20.size();
                                q5k0Var5 = (q5k0) CollectionsKt.firstOrNull(list20);
                                if (q5k0Var5 != null) {
                                    str5 = q5k0Var5.b;
                                } else {
                                    str5 = null;
                                }
                                if (str5 == null) {
                                    str6 = "";
                                } else {
                                    str6 = str5;
                                }
                                arrayList12 = new ArrayList();
                                it14 = list20.iterator();
                                while (it14.hasNext()) {
                                    p48.w(((q5k0) it14.next()).h, arrayList12);
                                    ngsVar5 = ngsVar5;
                                }
                                ngsVar6 = ngsVar5;
                                listA1 = CollectionsKt.A0(CollectionsKt.D0(arrayList12));
                                if (list20.isEmpty()) {
                                    i16 = i15;
                                    z8 = false;
                                    break;
                                }
                                it15 = list20.iterator();
                                while (true) {
                                    if (it15.hasNext()) {
                                        i16 = i15;
                                        z8 = false;
                                        break;
                                    }
                                    i16 = i15;
                                    if (((q5k0) it15.next()).g) {
                                        z8 = true;
                                        break;
                                    }
                                    i15 = i16;
                                }
                                q5k0Var6 = (q5k0) CollectionsKt.firstOrNull(list20);
                                if (q5k0Var6 != null) {
                                    str7 = q5k0Var6.b;
                                } else {
                                    str7 = null;
                                }
                                if (str7 == null) {
                                    str7 = "";
                                }
                                str8 = str18;
                                size4 = list20.size();
                                List<j6k0> list33 = list15;
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
                                for (q5k0 q5k0Var11 : list20) {
                                    if (q5k0Var11.g) {
                                        bigDecimalAdd = bigDecimalAdd.add(q5k0Var11.d);
                                    }
                                }
                                bigDecimalAdd2 = BigDecimal.ZERO;
                                it16 = list20.iterator();
                                while (it16.hasNext()) {
                                    bigDecimalAdd2 = bigDecimalAdd2.add(((q5k0) it16.next()).c);
                                }
                                bigDecimalAdd3 = BigDecimal.ZERO;
                                it17 = list20.iterator();
                                while (it17.hasNext()) {
                                    BigDecimal bigDecimal7 = bigDecimalAdd2;
                                    q5k0Var8 = (q5k0) it17.next();
                                    Iterator it23 = it17;
                                    if (q5k0Var8.g) {
                                        bigDecimalAdd3 = bigDecimalAdd3.add(q5k0Var8.f);
                                    }
                                    it17 = it23;
                                    bigDecimalAdd2 = bigDecimal7;
                                }
                                BigDecimal bigDecimal8 = bigDecimalAdd2;
                                bigDecimalAdd4 = BigDecimal.ZERO;
                                it18 = list20.iterator();
                                while (it18.hasNext()) {
                                    BigDecimal bigDecimal9 = bigDecimalAdd3;
                                    q5k0Var7 = (q5k0) it18.next();
                                    Iterator it24 = it18;
                                    if (q5k0Var7.g) {
                                        bigDecimalAdd4 = bigDecimalAdd4.add(q5k0Var7.e);
                                    }
                                    it18 = it24;
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
                                list15 = list33;
                                i17 = 0;
                                for (Object obj10 : listA1) {
                                    i20 = i17 + 1;
                                    if (i17 >= 0) {
                                        b.q();
                                        throw null;
                                    }
                                    u5k0 u5k0Var5 = (u5k0) obj10;
                                    String str19 = str10;
                                    b6k0 b6k0Var = g6k0Var2.b;
                                    if (size3 > 1) {
                                        z9 = true;
                                    } else {
                                        z9 = false;
                                    }
                                    String str20 = str8;
                                    str10 = str19;
                                    arrayList14.add(b6k0Var.a(str20, z6, list15, list21, list23, list22, str6, u5k0Var5, i17, z9, str19));
                                    str8 = str20;
                                    i17 = i20;
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
                                    it19 = listA1.iterator();
                                    i18 = 0;
                                    while (it19.hasNext()) {
                                        next7 = it19.next();
                                        i19 = i18 + 1;
                                        if (i18 >= 0) {
                                            b.q();
                                            throw null;
                                        }
                                        arrayList15.add(new Pair(((u5k0) next7).c, String.valueOf(i19)));
                                        it19 = it19;
                                        i18 = i19;
                                    }
                                    mapK2 = kpu.k(arrayList15);
                                    arrayList16 = new ArrayList(l48.r(list20, 10));
                                    it20 = list20.iterator();
                                    while (it20.hasNext()) {
                                        arrayList16.add(g6k0Var2.a.a(z6, list23, list22, (q5k0) it20.next(), mapK2));
                                    }
                                    qcnVarB2 = a4h.b(arrayList16);
                                } else {
                                    qcnVarB2 = null;
                                }
                                arrayList9.add(new nmo(nnoVar, qcnVarB5, rqf0.b(str6), qcnVarB2));
                                i14 = i16;
                            }
                            it12 = it13;
                            z4 = z6;
                            list16 = list21;
                            list19 = list23;
                            r16 = r30;
                            g6k0Var = g6k0Var2;
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
                    f6k0 f6k0Var3 = v5k0Var.c;
                    set2.getClass();
                    z = p5k0Var2.o;
                    list4 = p5k0Var2.r;
                    list5 = p5k0Var2.s;
                    list6 = p5k0Var2.t;
                    list7 = p5k0Var2.u;
                    arrayList3 = new ArrayList(l48.r(list3, 10));
                    i7 = i6;
                    r2 = f6k0Var3;
                    for (Object obj11 : list3) {
                        i8 = i7 + 1;
                        if (i7 >= 0) {
                            ?? r4 = list2;
                            b.q();
                            throw r4;
                        }
                        q5k0Var3 = (q5k0) obj11;
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
                            List<r5k0> list34 = list7;
                            nno nnoVarA2 = r2.a(z14, list9, list34, q5k0Var3, r8, set2);
                            list10 = list4;
                            list7 = list34;
                            q5k0Var3 = q5k0Var3;
                            ngsVar3 = ngsVar9;
                            z = z14;
                            r7 = nnoVarA2;
                        } else {
                            list9 = list6;
                            list10 = list4;
                            ngsVar3 = ngsVar;
                            r7 = list2;
                        }
                        List<n6k0> list35 = list9;
                        arrayList3.add(new nmo(r7, a4h.a(r2.b(str12, z, list10, list5, list35, list7, q5k0Var3, str10)), rqf0.b(q5k0Var3.b), null));
                        list2 = null;
                        list6 = list35;
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
        int i22 = i;
        i2 = R.color.text_inverse_primary;
        i3 = i22;
        coloredUiText = new ColoredUiText(new ResourceUiText(i3), Integer.valueOf(i2), null);
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
                q5k0Var = (q5k0) CollectionsKt.firstOrNull(list27);
                if (q5k0Var == null) {
                    booVar = null;
                } else {
                    znoVar = new zno(new ResourceUiText(R.string.component_wap_share_bet__flex_your_bet_vmintowin_of_vsize, ay0.S(new Object[]{String.valueOf(p5k0Var2.m), String.valueOf(q5k0Var.h.size())})));
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
        ColoredUiText coloredUiTextT2 = rqf0.t(R.color.text_inverse_brand_sub, p5k0Var2.f, z11, z10);
        String strP3 = rqf0.p(p5k0Var2.e);
        ResourceUiText resourceUiTextJ2 = rqf0.j(str14, bigDecimal4, new Function0() { // from class: h6k0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i23 = p5k0Var2.l;
                if (i23 == 1) {
                    return Integer.valueOf(R.string.common_functions__cash_gift);
                }
                if (i23 == 2) {
                    return Integer.valueOf(R.string.common_functions__discount_gift);
                }
                if (i23 == 3) {
                    return Integer.valueOf(R.string.common_functions__free_bet_gift);
                }
                return null;
            }
        });
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
                coloredUiText2 = coloredUiText;
                q5k0Var2 = (q5k0) CollectionsKt.p0(list27);
                if (q5k0Var2 != null) {
                    str2 = u5k0Var.c;
                    it3 = list26.iterator();
                    do {
                        if (it3.hasNext()) {
                            next3 = null;
                            break;
                        }
                        next3 = it3.next();
                    } while (!((n6k0) next3).a.equals(str2));
                    n6k0Var = (n6k0) next3;
                    if (n6k0Var != null) {
                        bigDecimal = n6k0Var.b;
                    } else {
                        it4 = list28.iterator();
                        while (true) {
                            if (it4.hasNext()) {
                                obj = null;
                                break;
                            }
                            next4 = it4.next();
                            if (((r5k0) next4).a.equals(str2)) {
                                obj = next4;
                                break;
                            }
                        }
                        r5k0Var = (r5k0) obj;
                        if (r5k0Var != null) {
                            bigDecimal = r5k0Var.b;
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
                        List<u5k0> list210 = ((q5k0) it5.next()).h;
                        bigDecimalMultiply = BigDecimal.ONE;
                        it6 = list210.iterator();
                        while (true) {
                            if (it6.hasNext()) {
                                u5k0Var2 = (u5k0) it6.next();
                                it7 = list26.iterator();
                                while (true) {
                                    if (it7.hasNext()) {
                                        coloredUiText2 = coloredUiText;
                                        obj2 = null;
                                        break;
                                    }
                                    next6 = it7.next();
                                    coloredUiText2 = coloredUiText;
                                    if (((n6k0) next6).a.equals(u5k0Var2.c)) {
                                        obj2 = next6;
                                        break;
                                    }
                                    coloredUiText = coloredUiText2;
                                }
                                n6k0Var2 = (n6k0) obj2;
                                if (n6k0Var2 != null) {
                                    bigDecimal2 = n6k0Var2.b;
                                } else {
                                    it8 = list28.iterator();
                                    while (true) {
                                        if (it8.hasNext()) {
                                            obj3 = null;
                                            break;
                                        }
                                        next5 = it8.next();
                                        if (((r5k0) next5).a.equals(u5k0Var2.c)) {
                                            obj3 = next5;
                                            break;
                                        }
                                    }
                                    r5k0Var2 = (r5k0) obj3;
                                    if (r5k0Var2 != null) {
                                        bigDecimal2 = r5k0Var2.b;
                                    } else {
                                        i5 = 0;
                                        strA = null;
                                    }
                                }
                                bigDecimalMultiply.getClass();
                                bigDecimalMultiply = bigDecimalMultiply.multiply(bigDecimal2);
                                bigDecimalMultiply.getClass();
                                coloredUiText = coloredUiText2;
                            } else {
                                bigDecimalMultiply.getClass();
                                bigDecimalValueOf = bigDecimalValueOf.add(bigDecimalMultiply);
                                bigDecimalValueOf.getClass();
                            }
                        }
                    } else {
                        coloredUiText2 = coloredUiText;
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
                i5 = 0;
                strA = strA2;
                coloredUiText2 = coloredUiText;
            } else {
                i5 = 0;
                coloredUiText2 = coloredUiText;
                strA = null;
            }
        } else {
            i5 = 0;
            coloredUiText2 = coloredUiText;
            strA = null;
        }
        bigDecimal6.getClass();
        ngsVarB.add(new epo(numValueOf5, numC, resourceUiTextQ, str11, strD, numA, uiTextD, aVar, coloredUiText2, booVar, coloredUiTextT2, strP3, resourceUiTextJ2, resourceUiTextI2, strA, rqf0.f(bigDecimal6), rqf0.v(p5k0Var2.g)));
        if (z11) {
            p5k0Var = p5k0Var2;
        } else {
            p5k0Var = null;
        }
        if (p5k0Var != null) {
            zooVar = null;
        } else {
            zooVar = null;
        }
        if (zooVar != null) {
            ngsVarB.add(zooVar);
        }
        it9 = cd3.f.iterator();
        while (true) {
            if (it9.hasNext()) {
                obj4 = null;
                break;
            }
            next8 = it9.next();
            if (((cd3) next8).a.equalsIgnoreCase(str13)) {
                obj4 = next8;
                break;
            }
        }
        cd3Var3 = (cd3) obj4;
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
                    r9 = v5k0Var.b;
                    z2 = p5k0Var2.o;
                    list11 = p5k0Var2.r;
                    list12 = p5k0Var2.s;
                    list13 = p5k0Var2.t;
                    list14 = p5k0Var2.u;
                    size = list27.size();
                    q5k0Var4 = (q5k0) CollectionsKt.firstOrNull(list27);
                    if (q5k0Var4 != null) {
                        str3 = q5k0Var4.b;
                    } else {
                        str3 = null;
                    }
                    if (str3 == null) {
                        str4 = "";
                    } else {
                        str4 = str3;
                    }
                    arrayList4 = new ArrayList();
                    it10 = list27.iterator();
                    while (it10.hasNext()) {
                        p48.w(((q5k0) it10.next()).h, arrayList4);
                    }
                    listA0 = CollectionsKt.A0(CollectionsKt.D0(arrayList4));
                    arrayList5 = new ArrayList(l48.r(listA0, 10));
                    i10 = i9;
                    while (r4.hasNext()) {
                        i12 = i10 + 1;
                        if (i10 >= 0) {
                            b.q();
                            throw null;
                        }
                        u5k0 u5k0Var6 = (u5k0) obj6;
                        if (size > 1) {
                            r19 = 1;
                        } else {
                            r19 = i9;
                        }
                        String str110 = str10;
                        str10 = str110;
                        arrayList5.add(r9.a(str12, z2, list11, list12, list13, list14, str4, u5k0Var6, i10, r19, str110));
                        i10 = i12;
                    }
                    qcn qcnVarB6 = a4h.b(arrayList5);
                    numValueOf = Integer.valueOf(size);
                    if (size <= 1) {
                        numValueOf = null;
                    }
                    if (numValueOf != null) {
                        arrayList6 = new ArrayList(l48.r(listA0, 10));
                        while (r2.hasNext()) {
                            i11 = i9 + 1;
                            if (i9 >= 0) {
                                b.q();
                                throw null;
                            }
                            arrayList6.add(new Pair(((u5k0) obj7).c, String.valueOf(i11)));
                            i9 = i11;
                        }
                        mapK = kpu.k(arrayList6);
                        arrayList7 = new ArrayList(l48.r(list27, 10));
                        it11 = list27.iterator();
                        while (it11.hasNext()) {
                            arrayList7.add(r9.a.a(z2, list13, list14, (q5k0) it11.next(), mapK));
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
                    r9 = v5k0Var.b;
                    z2 = p5k0Var2.o;
                    list11 = p5k0Var2.r;
                    list12 = p5k0Var2.s;
                    list13 = p5k0Var2.t;
                    list14 = p5k0Var2.u;
                    size = list27.size();
                    q5k0Var4 = (q5k0) CollectionsKt.firstOrNull(list27);
                    if (q5k0Var4 != null) {
                        str3 = q5k0Var4.b;
                    } else {
                        str3 = null;
                    }
                    if (str3 == null) {
                        str4 = "";
                    } else {
                        str4 = str3;
                    }
                    arrayList4 = new ArrayList();
                    it10 = list27.iterator();
                    while (it10.hasNext()) {
                        p48.w(((q5k0) it10.next()).h, arrayList4);
                    }
                    listA0 = CollectionsKt.A0(CollectionsKt.D0(arrayList4));
                    arrayList5 = new ArrayList(l48.r(listA0, 10));
                    i10 = i9;
                    while (r4.hasNext()) {
                        i12 = i10 + 1;
                        if (i10 >= 0) {
                            b.q();
                            throw null;
                        }
                        u5k0 u5k0Var7 = (u5k0) obj6;
                        if (size > 1) {
                            r19 = 1;
                        } else {
                            r19 = i9;
                        }
                        String str111 = str10;
                        str10 = str111;
                        arrayList5.add(r9.a(str12, z2, list11, list12, list13, list14, str4, u5k0Var7, i10, r19, str111));
                        i10 = i12;
                    }
                    qcn qcnVarB7 = a4h.b(arrayList5);
                    numValueOf = Integer.valueOf(size);
                    if (size <= 1) {
                        numValueOf = null;
                    }
                    if (numValueOf != null) {
                        arrayList6 = new ArrayList(l48.r(listA0, 10));
                        while (r2.hasNext()) {
                            i11 = i9 + 1;
                            if (i9 >= 0) {
                                b.q();
                                throw null;
                            }
                            arrayList6.add(new Pair(((u5k0) obj7).c, String.valueOf(i11)));
                            i9 = i11;
                        }
                        mapK = kpu.k(arrayList6);
                        arrayList7 = new ArrayList(l48.r(list27, 10));
                        it11 = list27.iterator();
                        while (it11.hasNext()) {
                            arrayList7.add(r9.a.a(z2, list13, list14, (q5k0) it11.next(), mapK));
                        }
                        qcnVarB = a4h.b(arrayList7);
                    } else {
                        qcnVarB = null;
                    }
                    arrayList2.add(new nmo(null, qcnVarB7, rqf0.b(str4), qcnVarB));
                } else {
                    g6k0Var = v5k0Var.d;
                    f6k0Var = g6k0Var.c;
                    set2.getClass();
                    z3 = p5k0Var2.o;
                    arrayList8 = arrayList;
                    list15 = p5k0Var2.r;
                    list16 = p5k0Var2.s;
                    list17 = p5k0Var2.t;
                    list18 = p5k0Var2.u;
                    arrayList9 = new ArrayList();
                    arrayList10 = new ArrayList();
                    while (r16.hasNext()) {
                        if (!((q5k0) obj8).h.isEmpty()) {
                            arrayList10.add(obj8);
                        }
                    }
                    linkedHashMap = new LinkedHashMap();
                    size2 = arrayList10.size();
                    i13 = 0;
                    while (i13 < size2) {
                        f6k0 f6k0Var4 = f6k0Var;
                        Object obj12 = arrayList10.get(i13);
                        i13++;
                        boolean z15 = z3;
                        numValueOf3 = Integer.valueOf(((q5k0) obj12).h.size());
                        obj5 = linkedHashMap.get(numValueOf3);
                        if (obj5 == null) {
                            ArrayList arrayList110 = new ArrayList();
                            linkedHashMap.put(numValueOf3, arrayList110);
                            obj5 = arrayList110;
                        }
                        ((List) obj5).add(obj12);
                        f6k0Var = f6k0Var4;
                        z3 = z15;
                        list17 = list17;
                    }
                    r16 = f6k0Var;
                    z4 = z3;
                    list19 = list17;
                    it12 = linkedHashMap.entrySet().iterator();
                    i14 = 0;
                    while (it12.hasNext()) {
                        Map.Entry entry2 = (Map.Entry) it12.next();
                        iIntValue = ((Number) entry2.getKey()).intValue();
                        list20 = (List) entry2.getValue();
                        z5 = true;
                        if (iIntValue == 1) {
                            c2 = '\n';
                            arrayList17 = new ArrayList(l48.r(list20, 10));
                            r17 = r16;
                            while (r19.hasNext()) {
                                int i23 = i14 + 1;
                                List<l6k0> list36 = list16;
                                ?? r5 = r17;
                                Iterator it25 = it12;
                                if (i14 != 0) {
                                    z5 = false;
                                }
                                boolean z16 = z4;
                                List<n6k0> list37 = list19;
                                nno nnoVarA3 = r5.a(z16, list37, list18, q5k0Var10, z5, set2);
                                ngs ngsVar10 = ngsVarB;
                                String str112 = str12;
                                ArrayList arrayList111 = arrayList17;
                                ArrayList arrayList22 = arrayList8;
                                List<r5k0> list38 = list18;
                                arrayList111.add(new nmo(nnoVarA3, a4h.a(r5.b(str112, z16, list15, list36, list37, list38, q5k0Var10, str10)), rqf0.b(q5k0Var10.b), null));
                                it12 = it25;
                                arrayList17 = arrayList111;
                                z4 = z16;
                                list19 = list37;
                                list18 = list38;
                                i14 = i23;
                                r17 = r5;
                                z5 = true;
                                arrayList8 = arrayList22;
                                g6k0Var = g6k0Var;
                                str12 = str112;
                                ngsVarB = ngsVar10;
                                list16 = list36;
                                c2 = '\n';
                            }
                            it13 = it12;
                            list21 = list16;
                            ngs ngsVar11 = ngsVarB;
                            str9 = str12;
                            g6k0 g6k0Var4 = g6k0Var;
                            ArrayList arrayList23 = arrayList8;
                            r30 = r17;
                            z6 = z4;
                            list23 = list19;
                            list22 = list18;
                            arrayList9.addAll(arrayList17);
                            arrayList13 = arrayList23;
                            g6k0Var2 = g6k0Var4;
                            ngsVar6 = ngsVar11;
                            c = 2;
                        } else {
                            it13 = it12;
                            list21 = list16;
                            ngsVar5 = ngsVarB;
                            String str113 = str12;
                            arrayList11 = arrayList8;
                            r30 = r16;
                            z6 = z4;
                            list22 = list18;
                            g6k0Var2 = g6k0Var;
                            list23 = list19;
                            i15 = i14 + 1;
                            if (i14 == 0) {
                                z7 = true;
                            } else {
                                z7 = false;
                            }
                            size3 = list20.size();
                            q5k0Var5 = (q5k0) CollectionsKt.firstOrNull(list20);
                            if (q5k0Var5 != null) {
                                str5 = q5k0Var5.b;
                            } else {
                                str5 = null;
                            }
                            if (str5 == null) {
                                str6 = "";
                            } else {
                                str6 = str5;
                            }
                            arrayList12 = new ArrayList();
                            it14 = list20.iterator();
                            while (it14.hasNext()) {
                                p48.w(((q5k0) it14.next()).h, arrayList12);
                                ngsVar5 = ngsVar5;
                            }
                            ngsVar6 = ngsVar5;
                            listA1 = CollectionsKt.A0(CollectionsKt.D0(arrayList12));
                            if (list20.isEmpty()) {
                                i16 = i15;
                                z8 = false;
                                break;
                            }
                            it15 = list20.iterator();
                            while (true) {
                                if (it15.hasNext()) {
                                    i16 = i15;
                                    z8 = false;
                                    break;
                                }
                                i16 = i15;
                                if (((q5k0) it15.next()).g) {
                                    z8 = true;
                                    break;
                                }
                                i15 = i16;
                            }
                            q5k0Var6 = (q5k0) CollectionsKt.firstOrNull(list20);
                            if (q5k0Var6 != null) {
                                str7 = q5k0Var6.b;
                            } else {
                                str7 = null;
                            }
                            if (str7 == null) {
                                str7 = "";
                            }
                            str8 = str113;
                            size4 = list20.size();
                            List<j6k0> list39 = list15;
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
                            while (r4.hasNext()) {
                                if (q5k0Var11.g) {
                                    bigDecimalAdd = bigDecimalAdd.add(q5k0Var11.d);
                                }
                            }
                            bigDecimalAdd2 = BigDecimal.ZERO;
                            it16 = list20.iterator();
                            while (it16.hasNext()) {
                                bigDecimalAdd2 = bigDecimalAdd2.add(((q5k0) it16.next()).c);
                            }
                            bigDecimalAdd3 = BigDecimal.ZERO;
                            it17 = list20.iterator();
                            while (it17.hasNext()) {
                                BigDecimal bigDecimal11 = bigDecimalAdd2;
                                q5k0Var8 = (q5k0) it17.next();
                                Iterator it26 = it17;
                                if (q5k0Var8.g) {
                                    bigDecimalAdd3 = bigDecimalAdd3.add(q5k0Var8.f);
                                }
                                it17 = it26;
                                bigDecimalAdd2 = bigDecimal11;
                            }
                            BigDecimal bigDecimal12 = bigDecimalAdd2;
                            bigDecimalAdd4 = BigDecimal.ZERO;
                            it18 = list20.iterator();
                            while (it18.hasNext()) {
                                BigDecimal bigDecimal13 = bigDecimalAdd3;
                                q5k0Var7 = (q5k0) it18.next();
                                Iterator it27 = it18;
                                if (q5k0Var7.g) {
                                    bigDecimalAdd4 = bigDecimalAdd4.add(q5k0Var7.e);
                                }
                                it18 = it27;
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
                            list15 = list39;
                            i17 = 0;
                            while (r23.hasNext()) {
                                i20 = i17 + 1;
                                if (i17 >= 0) {
                                    b.q();
                                    throw null;
                                }
                                u5k0 u5k0Var8 = (u5k0) obj10;
                                String str114 = str10;
                                b6k0 b6k0Var2 = g6k0Var2.b;
                                if (size3 > 1) {
                                    z9 = true;
                                } else {
                                    z9 = false;
                                }
                                String str21 = str8;
                                str10 = str114;
                                arrayList14.add(b6k0Var2.a(str21, z6, list15, list21, list23, list22, str6, u5k0Var8, i17, z9, str114));
                                str8 = str21;
                                i17 = i20;
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
                                it19 = listA1.iterator();
                                i18 = 0;
                                while (it19.hasNext()) {
                                    next7 = it19.next();
                                    i19 = i18 + 1;
                                    if (i18 >= 0) {
                                        b.q();
                                        throw null;
                                    }
                                    arrayList15.add(new Pair(((u5k0) next7).c, String.valueOf(i19)));
                                    it19 = it19;
                                    i18 = i19;
                                }
                                mapK2 = kpu.k(arrayList15);
                                arrayList16 = new ArrayList(l48.r(list20, 10));
                                it20 = list20.iterator();
                                while (it20.hasNext()) {
                                    arrayList16.add(g6k0Var2.a.a(z6, list23, list22, (q5k0) it20.next(), mapK2));
                                }
                                qcnVarB2 = a4h.b(arrayList16);
                            } else {
                                qcnVarB2 = null;
                            }
                            arrayList9.add(new nmo(nnoVar2, qcnVarB8, rqf0.b(str6), qcnVarB2));
                            i14 = i16;
                        }
                        it12 = it13;
                        z4 = z6;
                        list16 = list21;
                        list19 = list23;
                        r16 = r30;
                        g6k0Var = g6k0Var2;
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
                f6k0 f6k0Var5 = v5k0Var.c;
                set2.getClass();
                z = p5k0Var2.o;
                list4 = p5k0Var2.r;
                list5 = p5k0Var2.s;
                list6 = p5k0Var2.t;
                list7 = p5k0Var2.u;
                arrayList3 = new ArrayList(l48.r(list3, 10));
                i7 = i6;
                r2 = f6k0Var5;
                while (r18.hasNext()) {
                    i8 = i7 + 1;
                    if (i7 >= 0) {
                        ?? r6 = list2;
                        b.q();
                        throw r6;
                    }
                    q5k0Var3 = (q5k0) obj11;
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
                        List<r5k0> list310 = list7;
                        nno nnoVarA4 = r2.a(z17, list9, list310, q5k0Var3, r8, set2);
                        list10 = list4;
                        list7 = list310;
                        q5k0Var3 = q5k0Var3;
                        ngsVar3 = ngsVar12;
                        z = z17;
                        r7 = nnoVarA4;
                    } else {
                        list9 = list6;
                        list10 = list4;
                        ngsVar3 = ngsVar;
                        r7 = list2;
                    }
                    List<n6k0> list311 = list9;
                    arrayList3.add(new nmo(r7, a4h.a(r2.b(str12, z, list10, list5, list311, list7, q5k0Var3, str10)), rqf0.b(q5k0Var3.b), null));
                    list2 = null;
                    list6 = list311;
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
