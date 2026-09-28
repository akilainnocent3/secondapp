package defpackage;

import com.sporty.android.common_ui.uitext.ColoredUiText;
import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.common_ui.uitext.UiText;
import com.sportybet.android.gp.tz.R;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
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
public final /* synthetic */ class lk70 extends pf implements iaj<jk70.b, Set<? extends String>, String, v1b<? super bno>, Object> {
    /* JADX WARN: Code duplicated, block: B:100:0x0254  */
    /* JADX WARN: Code duplicated, block: B:103:0x0268  */
    /* JADX WARN: Code duplicated, block: B:106:0x027f A[LOOP:27: B:101:0x0262->B:106:0x027f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:110:0x0290 A[LOOP:26: B:98:0x024e->B:110:0x0290, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:114:0x02d7  */
    /* JADX WARN: Code duplicated, block: B:127:0x0309  */
    /* JADX WARN: Code duplicated, block: B:133:0x031e  */
    /* JADX WARN: Code duplicated, block: B:137:0x036c  */
    /* JADX WARN: Code duplicated, block: B:143:0x0381  */
    /* JADX WARN: Code duplicated, block: B:144:0x0385  */
    /* JADX WARN: Code duplicated, block: B:146:0x0392  */
    /* JADX WARN: Code duplicated, block: B:148:0x0395  */
    /* JADX WARN: Code duplicated, block: B:156:0x03a5  */
    /* JADX WARN: Code duplicated, block: B:158:0x03af  */
    /* JADX WARN: Code duplicated, block: B:159:0x03b2  */
    /* JADX WARN: Code duplicated, block: B:162:0x03b7  */
    /* JADX WARN: Code duplicated, block: B:166:0x03c7 A[LOOP:4: B:164:0x03c1->B:166:0x03c7, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:169:0x03e3 A[LOOP:5: B:168:0x03e1->B:169:0x03e3, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:173:0x040d  */
    /* JADX WARN: Code duplicated, block: B:175:0x0415  */
    /* JADX WARN: Code duplicated, block: B:177:0x041a  */
    /* JADX WARN: Code duplicated, block: B:178:0x041c  */
    /* JADX WARN: Code duplicated, block: B:182:0x0435  */
    /* JADX WARN: Code duplicated, block: B:185:0x044c A[LOOP:7: B:180:0x042f->B:185:0x044c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:189:0x0467  */
    /* JADX WARN: Code duplicated, block: B:190:0x046e  */
    /* JADX WARN: Code duplicated, block: B:193:0x0482  */
    /* JADX WARN: Code duplicated, block: B:202:0x0495  */
    /* JADX WARN: Code duplicated, block: B:203:0x0498  */
    /* JADX WARN: Code duplicated, block: B:205:0x04a0  */
    /* JADX WARN: Code duplicated, block: B:209:0x04ae  */
    /* JADX WARN: Code duplicated, block: B:212:0x04c2 A[LOOP:8: B:207:0x04a8->B:212:0x04c2, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:216:0x04ca  */
    /* JADX WARN: Code duplicated, block: B:219:0x04d7  */
    /* JADX WARN: Code duplicated, block: B:222:0x04ed A[LOOP:9: B:217:0x04d1->B:222:0x04ed, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:225:0x050b  */
    /* JADX WARN: Code duplicated, block: B:232:0x0542  */
    /* JADX WARN: Code duplicated, block: B:234:0x0545  */
    /* JADX WARN: Code duplicated, block: B:237:0x055b  */
    /* JADX WARN: Code duplicated, block: B:239:0x0563 A[LOOP:10: B:235:0x0555->B:239:0x0563, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:244:0x0590  */
    /* JADX WARN: Code duplicated, block: B:246:0x05b8  */
    /* JADX WARN: Code duplicated, block: B:248:0x05bb  */
    /* JADX WARN: Code duplicated, block: B:250:0x05be  */
    /* JADX WARN: Code duplicated, block: B:254:0x05c7  */
    /* JADX WARN: Code duplicated, block: B:256:0x05cd  */
    /* JADX WARN: Code duplicated, block: B:257:0x05d1  */
    /* JADX WARN: Code duplicated, block: B:260:0x05db  */
    /* JADX WARN: Code duplicated, block: B:269:0x05ed  */
    /* JADX WARN: Code duplicated, block: B:273:0x0609  */
    /* JADX WARN: Code duplicated, block: B:275:0x0619  */
    /* JADX WARN: Code duplicated, block: B:279:0x0645  */
    /* JADX WARN: Code duplicated, block: B:280:0x0648  */
    /* JADX WARN: Code duplicated, block: B:283:0x0650  */
    /* JADX WARN: Code duplicated, block: B:285:0x0653  */
    /* JADX WARN: Code duplicated, block: B:287:0x0656  */
    /* JADX WARN: Code duplicated, block: B:289:0x0659  */
    /* JADX WARN: Code duplicated, block: B:28:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:293:0x0672  */
    /* JADX WARN: Code duplicated, block: B:295:0x0686  */
    /* JADX WARN: Code duplicated, block: B:296:0x0698  */
    /* JADX WARN: Code duplicated, block: B:300:0x06bd  */
    /* JADX WARN: Code duplicated, block: B:303:0x06cd  */
    /* JADX WARN: Code duplicated, block: B:310:0x06eb  */
    /* JADX WARN: Code duplicated, block: B:314:0x0730  */
    /* JADX WARN: Code duplicated, block: B:316:0x0742  */
    /* JADX WARN: Code duplicated, block: B:319:0x0761 A[LOOP:15: B:317:0x075b->B:319:0x0761, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:322:0x0780  */
    /* JADX WARN: Code duplicated, block: B:325:0x07a6  */
    /* JADX WARN: Code duplicated, block: B:327:0x07ae  */
    /* JADX WARN: Code duplicated, block: B:329:0x07bb  */
    /* JADX WARN: Code duplicated, block: B:330:0x07be  */
    /* JADX WARN: Code duplicated, block: B:332:0x07c1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:333:0x07c3  */
    /* JADX WARN: Code duplicated, block: B:334:0x07c6  */
    /* JADX WARN: Code duplicated, block: B:337:0x07ce  */
    /* JADX WARN: Code duplicated, block: B:338:0x07d1  */
    /* JADX WARN: Code duplicated, block: B:341:0x07d9  */
    /* JADX WARN: Code duplicated, block: B:343:0x07dc  */
    /* JADX WARN: Code duplicated, block: B:345:0x07df  */
    /* JADX WARN: Code duplicated, block: B:347:0x07e2  */
    /* JADX WARN: Code duplicated, block: B:350:0x07ea  */
    /* JADX WARN: Code duplicated, block: B:351:0x07f6  */
    /* JADX WARN: Code duplicated, block: B:356:0x082a  */
    /* JADX WARN: Code duplicated, block: B:357:0x082d  */
    /* JADX WARN: Code duplicated, block: B:361:0x0838  */
    /* JADX WARN: Code duplicated, block: B:367:0x084d  */
    /* JADX WARN: Code duplicated, block: B:368:0x0850  */
    /* JADX WARN: Code duplicated, block: B:370:0x0883  */
    /* JADX WARN: Code duplicated, block: B:374:0x089a A[LOOP:19: B:372:0x0894->B:374:0x089a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:377:0x08b8  */
    /* JADX WARN: Code duplicated, block: B:380:0x08cc  */
    /* JADX WARN: Code duplicated, block: B:383:0x08e3 A[LOOP:21: B:378:0x08c6->B:383:0x08e3, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:387:0x0914  */
    /* JADX WARN: Code duplicated, block: B:38:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:395:0x0925  */
    /* JADX WARN: Code duplicated, block: B:397:0x0928  */
    /* JADX WARN: Code duplicated, block: B:398:0x092b  */
    /* JADX WARN: Code duplicated, block: B:400:0x0933  */
    /* JADX WARN: Code duplicated, block: B:404:0x0942  */
    /* JADX WARN: Code duplicated, block: B:407:0x0956 A[LOOP:22: B:402:0x093c->B:407:0x0956, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:411:0x095f  */
    /* JADX WARN: Code duplicated, block: B:414:0x096c  */
    /* JADX WARN: Code duplicated, block: B:417:0x0982 A[LOOP:23: B:412:0x0966->B:417:0x0982, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:41:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:420:0x09a3  */
    /* JADX WARN: Code duplicated, block: B:433:0x01d1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:434:0x01d5 A[EDGE_INSN: B:434:0x01d5->B:75:0x01d5 BREAK  A[LOOP:2: B:68:0x01b5->B:73:0x01ce], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:435:0x037c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:43:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:441:0x052e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:445:0x0451 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:446:0x0457 A[EDGE_INSN: B:446:0x0457->B:187:0x0457 BREAK  A[LOOP:7: B:180:0x042f->B:185:0x044c], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:447:0x04c5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:448:0x04c6 A[EDGE_INSN: B:448:0x04c6->B:214:0x04c6 BREAK  A[LOOP:8: B:207:0x04a8->B:212:0x04c2], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:449:0x04f2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:450:0x04f7 A[EDGE_INSN: B:450:0x04f7->B:224:0x04f7 BREAK  A[LOOP:9: B:217:0x04d1->B:222:0x04ed], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:452:0x0575 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:454:0x066d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:456:0x05c2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:459:0x061a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:462:0x06f7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:464:0x06e6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:468:0x09f5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:469:0x07e5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:471:0x0848 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:478:0x08e8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:479:0x08ee A[EDGE_INSN: B:479:0x08ee->B:385:0x08ee BREAK  A[LOOP:21: B:378:0x08c6->B:383:0x08e3], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:47:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:480:0x095a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:481:0x095b A[EDGE_INSN: B:481:0x095b->B:409:0x095b BREAK  A[LOOP:22: B:402:0x093c->B:407:0x0956], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:482:0x0987 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:483:0x098c A[EDGE_INSN: B:483:0x098c->B:419:0x098c BREAK  A[LOOP:23: B:412:0x0966->B:417:0x0982], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:485:0x02bb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:486:0x01df A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:487:0x02a5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:488:0x0284 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:489:0x028a A[EDGE_INSN: B:489:0x028a->B:108:0x028a BREAK  A[LOOP:27: B:101:0x0262->B:106:0x027f], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:491:0x0319 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:51:0x0101  */
    /* JADX WARN: Code duplicated, block: B:56:0x0124 A[LOOP:0: B:54:0x011e->B:56:0x0124, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:59:0x013b A[LOOP:1: B:58:0x0139->B:59:0x013b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:62:0x0181  */
    /* JADX WARN: Code duplicated, block: B:63:0x0184  */
    /* JADX WARN: Code duplicated, block: B:65:0x0187  */
    /* JADX WARN: Code duplicated, block: B:66:0x0198  */
    /* JADX WARN: Code duplicated, block: B:70:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:73:0x01ce A[LOOP:2: B:68:0x01b5->B:73:0x01ce, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:77:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:79:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:81:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:83:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:91:0x0203  */
    /* JADX WARN: Code duplicated, block: B:94:0x0212 A[LOOP:24: B:92:0x020c->B:94:0x0212, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:97:0x0238  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.iaj
    public final Object d(jk70.b bVar, Set<? extends String> set, String str, v1b<? super bno> v1bVar) {
        List<tk70> list;
        ResourceUiText resourceUiText;
        int i;
        int iOrdinal;
        String strL;
        int iOrdinal2;
        Integer num;
        ArrayList arrayList;
        Iterator<T> it;
        BigDecimal bigDecimalAdd;
        int size;
        int i2;
        Integer numC;
        String strD;
        Integer numA;
        Integer num2;
        epo.a aVar;
        ResourceUiText resourceUiTextI;
        Iterator<T> it2;
        String str2;
        Object next;
        cd3 cd3Var;
        int iOrdinal3;
        List<vk70> list2;
        ResourceUiText resourceUiText2;
        Integer num3;
        gk70 gk70Var;
        List<yk70> list3;
        yk70 yk70Var;
        List<xk70> list4;
        xk70 xk70Var;
        String str3;
        Iterator<T> it3;
        Object next2;
        wk70 wk70Var;
        String strA;
        String str4;
        Integer num4;
        ArrayList arrayList2;
        Iterator<T> it4;
        BigDecimal bigDecimalValueOf;
        int size2;
        int i3;
        int i4;
        ArrayList arrayList3;
        Iterator it5;
        BigDecimal bigDecimalMultiply;
        Iterator it6;
        xk70 xk70Var2;
        Iterator<T> it7;
        int i5;
        Object next3;
        wk70 wk70Var2;
        String str5;
        List<tk70> list5;
        List<wk70> list6;
        List<gk70> list7;
        List<vk70> list8;
        Iterator<T> it8;
        Object next4;
        cd3 cd3Var2;
        ArrayList arrayList4;
        int iOrdinal4;
        qk70 qk70Var;
        ArrayList arrayList5;
        ArrayList arrayList6;
        int size3;
        int i6;
        String str6;
        List list9;
        ArrayList arrayList7;
        int i7;
        int i8;
        yk70 yk70Var2;
        List<gk70> list10;
        List<gk70> list11;
        Set<? extends String> set2;
        String str7;
        nno nnoVar;
        ArrayList arrayList8;
        Iterator it9;
        ArrayList arrayList9;
        int size4;
        int i9;
        xk70 xk70Var3;
        Iterator<T> it10;
        Set<? extends String> set3;
        int i10;
        Object next5;
        tk70 tk70Var;
        sj70 sj70Var;
        int iOrdinal5;
        qeo qeoVarB;
        Iterator it11;
        Object next6;
        wk70 wk70Var3;
        qk70 qk70Var2;
        ArrayList arrayList10;
        vmo vmoVarA;
        ArrayList arrayList11;
        Iterator<T> it12;
        ArrayList arrayList12;
        Object next7;
        Iterator it13;
        String str8;
        boolean z;
        sj70 sj70Var2;
        Integer num5;
        int iOrdinal6;
        ColoredUiText coloredUiText;
        xk70 xk70Var4;
        String str9;
        Iterator<T> it14;
        Object next8;
        wk70 wk70Var4;
        BigDecimal bigDecimal;
        ResourceUiText resourceUiText3;
        int i11;
        List listB;
        nk70 nk70Var;
        gk70 gk70Var2;
        String str10;
        ArrayList arrayList13;
        Iterator<T> it15;
        int size5;
        ArrayList arrayList14;
        int size6;
        int i12;
        List listA0;
        ArrayList arrayList15;
        int i13;
        List<wk70> list12;
        Integer numValueOf;
        String str11;
        qcn qcnVarB;
        ArrayList arrayList16;
        int i14;
        Map mapK;
        ArrayList arrayList17;
        int size7;
        int i15;
        Integer numValueOf2;
        Integer numValueOf3;
        sj70 sj70Var3;
        int iOrdinal7;
        int i16;
        int iOrdinal8;
        int i17;
        ArrayList arrayList18;
        Iterator<T> it16;
        Integer num6;
        int iOrdinal9;
        ColoredUiText coloredUiText2;
        BigDecimal bigDecimalMultiply2;
        Iterator<T> it17;
        Object next9;
        wk70 wk70Var5;
        ColoredUiText coloredUiText3;
        String str12;
        int i18;
        int i19;
        xk70 xk70Var5;
        boolean z2;
        sj70 sj70Var4;
        Iterator<T> it18;
        List<vk70> list13;
        String str13;
        Object next10;
        tk70 tk70Var2;
        String strValueOf;
        int iOrdinal10;
        qeo qeoVarB2;
        Iterator it19;
        Object next11;
        wk70 wk70Var6;
        nk70 nk70Var2;
        ArrayList arrayList19;
        String str14;
        List<wk70> list14;
        vmo vmoVarA2;
        ArrayList arrayList20;
        Iterator<T> it20;
        ArrayList arrayList21;
        Object next12;
        Iterator it21;
        String str15;
        jk70.b bVar2 = bVar;
        Set<? extends String> set4 = set;
        String str16 = str;
        jk70 jk70Var = (jk70) this.a;
        jk70Var.getClass();
        if (bVar2 instanceof jk70.b.C0726b) {
            return bno.b.a;
        }
        if (bVar2 instanceof jk70.b.a) {
            return new bno.a(new wmo.a(((jk70.b.a) bVar2).a.a));
        }
        if (!(bVar2 instanceof jk70.b.c)) {
            uhc.a();
            return null;
        }
        final fk70 fk70Var = ((jk70.b.c) bVar2).a;
        Integer numValueOf4 = Integer.valueOf(R.drawable.ic__feature__won);
        ngs ngsVarB = a.b();
        cmo cmoVar = jk70Var.d.a;
        fk70Var.getClass();
        String str17 = fk70Var.c;
        String str18 = fk70Var.e;
        List<vk70> list15 = fk70Var.p;
        List<tk70> list16 = fk70Var.o;
        List<wk70> list17 = fk70Var.q;
        String str19 = fk70Var.d;
        List<gk70> list18 = fk70Var.n;
        String str20 = fk70Var.j;
        BigDecimal bigDecimal2 = fk70Var.k;
        sj70 sj70Var5 = fk70Var.b;
        List<vk70> list19 = list15;
        int iOrdinal11 = sj70Var5.ordinal();
        Set<? extends String> set5 = set4;
        int i20 = R.color.text_inverse_brand_sub;
        if (iOrdinal11 != 0) {
            list = list16;
            if (iOrdinal11 == 1) {
                StringUiText stringUiText = vch0.a;
                resourceUiText = new ResourceUiText(R.string.bet_history__won);
                i = R.color.text_inverse_brand_sub;
            } else if (iOrdinal11 == 2) {
                StringUiText stringUiText2 = vch0.a;
                resourceUiText = new ResourceUiText(R.string.bet_history__lost);
            } else {
                if (iOrdinal11 != 3) {
                    uhc.a();
                    return null;
                }
                StringUiText stringUiText3 = vch0.a;
                resourceUiText = new ResourceUiText(R.string.bet_history__void);
            }
            ColoredUiText coloredUiText4 = new ColoredUiText(resourceUiText, Integer.valueOf(i), null);
            iOrdinal = sj70Var5.ordinal();
            if (iOrdinal == 0) {
                strL = "--";
            } else {
                if (iOrdinal == 1 && iOrdinal != 2 && iOrdinal != 3) {
                    uhc.a();
                    return null;
                }
                strL = bjb0.L(p54.b(fk70Var.g), Locale.US);
            }
            iOrdinal2 = sj70Var5.ordinal();
            if (iOrdinal2 == 0) {
                num = null;
                i20 = R.color.text_secondary;
            } else if (iOrdinal2 != 1) {
                if (iOrdinal2 != 2 && iOrdinal2 != 3) {
                    uhc.a();
                    return null;
                }
                num = null;
                i20 = R.color.text_secondary;
            } else {
                num = null;
            }
            ColoredUiText coloredUiText5 = new ColoredUiText(new StringUiText(strL), Integer.valueOf(i20), num);
            arrayList = new ArrayList();
            it = list18.iterator();
            while (it.hasNext()) {
                p48.w(((gk70) it.next()).d, arrayList);
            }
            bigDecimalAdd = BigDecimal.ZERO;
            size = arrayList.size();
            for (i2 = 0; i2 < size; i2++) {
                bigDecimalAdd = bigDecimalAdd.add(((yk70) arrayList.get(i2)).f);
            }
            Integer numValueOf5 = Integer.valueOf(R.string.page_instant_virtual__scheduled_football_logo);
            BigDecimal bigDecimal3 = bigDecimalAdd;
            numC = cmoVar.c(str18);
            ResourceUiText resourceUiTextQ = rqf0.q(str17);
            strD = bwf0.a.d(fk70Var.i, true);
            numA = cmoVar.a(str18);
            UiText uiTextD = rqf0.d(list18.size(), str19);
            if (sj70Var5 == sj70.WON) {
                num2 = null;
            }
            if (num2 != null) {
                num2 = numValueOf4;
                aVar = new epo.a(num2.intValue(), R.color.icon_brand_sub_secondary);
            } else {
                num2 = numValueOf4;
                aVar = null;
            }
            String strP = rqf0.p(fk70Var.f);
            ResourceUiText resourceUiTextJ = rqf0.j(str20, bigDecimal2, new Function0() { // from class: rk70
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    int i21 = fk70Var.l;
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
            resourceUiTextI = rqf0.i(bigDecimal2, str20);
            it2 = cd3.f.iterator();
            while (true) {
                if (it2.hasNext()) {
                    str2 = strD;
                    next = null;
                    break;
                }
                next = it2.next();
                str2 = strD;
                if (((cd3) next).a.equalsIgnoreCase(str19)) {
                    break;
                }
                strD = str2;
            }
            cd3Var = (cd3) next;
            if (cd3Var != null) {
                iOrdinal3 = cd3Var.ordinal();
                if (iOrdinal3 != 0) {
                    if (iOrdinal3 != 1) {
                        if (iOrdinal3 != 2 && iOrdinal3 != 3 && iOrdinal3 != 4) {
                            uhc.a();
                            return null;
                        }
                        list2 = list19;
                        resourceUiText2 = resourceUiTextI;
                        num3 = numA;
                    } else {
                        arrayList2 = new ArrayList();
                        it4 = list18.iterator();
                        while (it4.hasNext()) {
                            p48.w(((gk70) it4.next()).d, arrayList2);
                            list19 = list19;
                        }
                        list2 = list19;
                        bigDecimalValueOf = BigDecimal.valueOf(0L);
                        bigDecimalValueOf.getClass();
                        size2 = arrayList2.size();
                        resourceUiText2 = resourceUiTextI;
                        i3 = 0;
                        while (true) {
                            if (i3 < size2) {
                                Object obj = arrayList2.get(i3);
                                i4 = i3 + 1;
                                arrayList3 = arrayList2;
                                List<xk70> list20 = ((yk70) obj).g;
                                BigDecimal bigDecimal4 = BigDecimal.ONE;
                                it5 = list20.iterator();
                                bigDecimalMultiply = bigDecimal4;
                                while (true) {
                                    if (it5.hasNext()) {
                                        it6 = it5;
                                        xk70Var2 = (xk70) it5.next();
                                        it7 = list17.iterator();
                                        while (true) {
                                            if (it7.hasNext()) {
                                                i5 = i4;
                                                num3 = numA;
                                                next3 = null;
                                                break;
                                            }
                                            next3 = it7.next();
                                            i5 = i4;
                                            num3 = numA;
                                            if (((wk70) next3).a.equals(xk70Var2.e)) {
                                                break;
                                            }
                                            i4 = i5;
                                            numA = num3;
                                        }
                                        wk70Var2 = (wk70) next3;
                                        if (wk70Var2 != null) {
                                            BigDecimal bigDecimal5 = wk70Var2.b;
                                            bigDecimalMultiply.getClass();
                                            bigDecimalMultiply = bigDecimalMultiply.multiply(bigDecimal5);
                                            bigDecimalMultiply.getClass();
                                            it5 = it6;
                                            i4 = i5;
                                            numA = num3;
                                        }
                                    } else {
                                        int i21 = i4;
                                        BigDecimal bigDecimal6 = bigDecimalMultiply;
                                        bigDecimal6.getClass();
                                        bigDecimalValueOf = bigDecimalValueOf.add(bigDecimal6);
                                        bigDecimalValueOf.getClass();
                                        arrayList2 = arrayList3;
                                        i3 = i21;
                                    }
                                }
                            } else {
                                num3 = numA;
                                strA = gky.a.a(bjb0.L(bigDecimalValueOf, Locale.US), false);
                                str4 = strA;
                                num4 = numC;
                            }
                        }
                    }
                    num4 = numC;
                    str4 = null;
                } else {
                    list2 = list19;
                    resourceUiText2 = resourceUiTextI;
                    num3 = numA;
                    gk70Var = (gk70) CollectionsKt.p0(list18);
                    if (gk70Var != null && (list3 = gk70Var.d) != null && (yk70Var = (yk70) CollectionsKt.p0(list3)) != null && (list4 = yk70Var.g) != null && (xk70Var = (xk70) CollectionsKt.p0(list4)) != null) {
                        str3 = xk70Var.e;
                        it3 = list17.iterator();
                        do {
                            if (it3.hasNext()) {
                                next2 = null;
                                break;
                            }
                            next2 = it3.next();
                        } while (!((wk70) next2).a.equals(str3));
                        wk70Var = (wk70) next2;
                        if (wk70Var != null) {
                            strA = gky.a.a(bjb0.L(wk70Var.b, Locale.US), false);
                            str4 = strA;
                            num4 = numC;
                        }
                    }
                    num4 = numC;
                    str4 = null;
                }
            } else {
                list2 = list19;
                resourceUiText2 = resourceUiTextI;
                num3 = numA;
                num4 = numC;
                str4 = null;
            }
            bigDecimal3.getClass();
            String strF = rqf0.f(bigDecimal3);
            ResourceUiText resourceUiTextV = rqf0.v(fk70Var.h);
            str5 = str18;
            list5 = list;
            String str21 = str2;
            list6 = list17;
            list7 = list18;
            list8 = list2;
            ngsVarB.add(new epo(numValueOf5, num4, resourceUiTextQ, str17, str21, num3, uiTextD, aVar, coloredUiText4, null, coloredUiText5, strP, resourceUiTextJ, resourceUiText2, str4, strF, resourceUiTextV));
            it8 = cd3.f.iterator();
            do {
                if (it8.hasNext()) {
                    next4 = null;
                    break;
                }
                next4 = it8.next();
            } while (!((cd3) next4).a.equalsIgnoreCase(str19));
            cd3Var2 = (cd3) next4;
            if (cd3Var2 == null) {
                listB = n1a0.c;
            } else {
                arrayList4 = new ArrayList();
                iOrdinal4 = cd3Var2.ordinal();
                if (iOrdinal4 != 0) {
                    qk70Var = jk70Var.c;
                    set5.getClass();
                    arrayList5 = new ArrayList(l48.r(list7, 10));
                    for (gk70 gk70Var3 : list7) {
                        arrayList5.add(new Pair(gk70Var3.a, gk70Var3.d));
                    }
                    arrayList6 = new ArrayList();
                    size3 = arrayList5.size();
                    i6 = 0;
                    while (i6 < size3) {
                        Object obj2 = arrayList5.get(i6);
                        i6++;
                        Pair pair = (Pair) obj2;
                        str6 = (String) pair.a;
                        list9 = (List) pair.b;
                        arrayList7 = new ArrayList(l48.r(list9, 10));
                        i7 = 0;
                        for (Object obj3 : list9) {
                            i8 = i7 + 1;
                            if (i7 >= 0) {
                                b.q();
                                throw null;
                            }
                            yk70Var2 = (yk70) obj3;
                            list10 = list7;
                            ArrayList arrayList22 = arrayList5;
                            if (list10.size() > 1) {
                                list11 = list10;
                            } else {
                                list11 = null;
                            }
                            if (list11 != null) {
                                if (i7 == 0) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                sj70Var2 = yk70Var2.b;
                                if (sj70Var2 == sj70.WON) {
                                    num5 = numValueOf4;
                                } else {
                                    num5 = null;
                                }
                                iOrdinal6 = sj70Var2.ordinal();
                                if (iOrdinal6 == 0) {
                                    coloredUiText = null;
                                } else {
                                    if (iOrdinal6 != 1) {
                                        resourceUiText3 = new ResourceUiText(R.string.bet_history__won);
                                        i11 = R.color.bg_brand_sub_primary_d_lighter;
                                    } else if (iOrdinal6 != 2) {
                                        if (iOrdinal6 != 3) {
                                            uhc.a();
                                            return null;
                                        }
                                        coloredUiText = null;
                                    } else {
                                        resourceUiText3 = new ResourceUiText(R.string.bet_history__lost);
                                        i11 = R.color.text_secondary;
                                    }
                                    coloredUiText = new ColoredUiText(resourceUiText3, Integer.valueOf(i11), null);
                                }
                                String strA2 = ik70.a(yk70Var2);
                                String strP2 = rqf0.p(yk70Var2.c);
                                xk70Var4 = (xk70) CollectionsKt.firstOrNull(yk70Var2.g);
                                if (xk70Var4 != null) {
                                    str9 = xk70Var4.e;
                                } else {
                                    str9 = null;
                                }
                                it14 = list6.iterator();
                                do {
                                    if (it14.hasNext()) {
                                        next8 = null;
                                        break;
                                    }
                                    next8 = it14.next();
                                } while (!((wk70) next8).a.equals(str9));
                                wk70Var4 = (wk70) next8;
                                if (wk70Var4 != null) {
                                    bigDecimal = wk70Var4.b;
                                } else {
                                    bigDecimal = BigDecimal.ZERO;
                                }
                                set2 = set5;
                                str7 = str6;
                                nnoVar = new nno(str7, set2.contains(str6), new ResourceUiText(R.string.component_betslip__single), num5, coloredUiText, strA2, strP2, gky.a.a(bjb0.L(bigDecimal, Locale.US), false), null, rqf0.v(yk70Var2.e), z, null);
                            } else {
                                set2 = set5;
                                list5 = list5;
                                str7 = str6;
                                nnoVar = null;
                            }
                            arrayList8 = new ArrayList();
                            it9 = list9.iterator();
                            while (it9.hasNext()) {
                                p48.w(((yk70) it9.next()).g, arrayList8);
                            }
                            arrayList9 = new ArrayList(l48.r(arrayList8, 10));
                            size4 = arrayList8.size();
                            i9 = 0;
                            while (i9 < size4) {
                                int i22 = i9 + 1;
                                xk70Var3 = (xk70) arrayList8.get(i9);
                                it10 = list5.iterator();
                                while (true) {
                                    if (it10.hasNext()) {
                                        set3 = set2;
                                        i10 = size4;
                                        next5 = null;
                                        break;
                                    }
                                    next5 = it10.next();
                                    set3 = set2;
                                    i10 = size4;
                                    if (((tk70) next5).a.equals(xk70Var3.c)) {
                                        break;
                                    }
                                    set2 = set3;
                                    size4 = i10;
                                }
                                tk70Var = (tk70) next5;
                                String str22 = xk70Var3.a;
                                sj70Var = xk70Var3.b;
                                uoo uooVarD = ik70.d(xk70Var3);
                                ResourceUiText resourceUiTextE = ik70.e(xk70Var3, str16);
                                UiText uiTextB = ik70.b(tk70Var);
                                UiText uiTextF = ik70.f(tk70Var);
                                UiText uiTextC = ik70.c(tk70Var);
                                String str23 = str16;
                                iOrdinal5 = sj70Var.ordinal();
                                if (iOrdinal5 != 0) {
                                    if (iOrdinal5 == 1 && iOrdinal5 != 2) {
                                        if (iOrdinal5 != 3) {
                                            uhc.a();
                                            return null;
                                        }
                                    }
                                    if (tk70Var != null) {
                                        str8 = tk70Var.j;
                                    } else {
                                        str8 = null;
                                    }
                                    qeoVarB = reo.b(str8);
                                } else {
                                    qeoVarB = null;
                                }
                                it11 = list6.iterator();
                                while (true) {
                                    if (it11.hasNext()) {
                                        next6 = null;
                                        break;
                                    }
                                    next6 = it11.next();
                                    it13 = it11;
                                    if (((wk70) next6).a.equals(xk70Var3.e)) {
                                        break;
                                    }
                                    it11 = it13;
                                }
                                wk70Var3 = (wk70) next6;
                                if (wk70Var3 != null) {
                                    arrayList11 = arrayList9;
                                    pk70 pk70Var = qk70Var.a;
                                    it12 = list8.iterator();
                                    while (true) {
                                        if (it12.hasNext()) {
                                            arrayList12 = arrayList11;
                                            qk70Var2 = qk70Var;
                                            next7 = null;
                                            break;
                                        }
                                        next7 = it12.next();
                                        arrayList12 = arrayList11;
                                        qk70Var2 = qk70Var;
                                        if (((vk70) next7).a.equals(wk70Var3.d)) {
                                            break;
                                        }
                                        arrayList11 = arrayList12;
                                        qk70Var = qk70Var2;
                                    }
                                    arrayList10 = arrayList12;
                                    vmoVarA = pk70Var.a(str5, sj70Var, list6, (vk70) next7, wk70Var3);
                                } else {
                                    qk70Var2 = qk70Var;
                                    arrayList10 = arrayList9;
                                    vmoVarA = null;
                                }
                                arrayList10.add(new voo(str22, uooVarD, resourceUiTextE, null, uiTextB, null, uiTextF, uiTextC, qeoVarB, vmoVarA));
                                arrayList9 = arrayList10;
                                i9 = i22;
                                size4 = i10;
                                str16 = str23;
                                qk70Var = qk70Var2;
                                set2 = set3;
                            }
                            set5 = set2;
                            arrayList7.add(new nmo(nnoVar, a4h.b(arrayList9), rqf0.b(str7), null));
                            list7 = list10;
                            i7 = i8;
                            arrayList5 = arrayList22;
                            list5 = list5;
                            str16 = str16;
                            qk70Var = qk70Var;
                            str6 = str7;
                        }
                        p48.w(arrayList7, arrayList6);
                    }
                    arrayList4.addAll(arrayList6);
                } else if (iOrdinal4 != 1) {
                    nk70Var = jk70Var.b;
                    gk70Var2 = (gk70) CollectionsKt.firstOrNull(list7);
                    if (gk70Var2 != null) {
                        str10 = gk70Var2.a;
                    } else {
                        str10 = null;
                    }
                    if (str10 == null) {
                        str10 = "";
                    }
                    arrayList13 = new ArrayList();
                    it15 = list7.iterator();
                    while (it15.hasNext()) {
                        p48.w(((gk70) it15.next()).d, arrayList13);
                    }
                    size5 = arrayList13.size();
                    arrayList14 = new ArrayList();
                    size6 = arrayList13.size();
                    i12 = 0;
                    while (i12 < size6) {
                        Object obj4 = arrayList13.get(i12);
                        i12++;
                        p48.w(((yk70) obj4).g, arrayList14);
                    }
                    listA0 = CollectionsKt.A0(CollectionsKt.D0(arrayList14));
                    arrayList15 = new ArrayList(l48.r(listA0, 10));
                    i13 = 0;
                    for (Object obj5 : listA0) {
                        i19 = i13 + 1;
                        if (i13 >= 0) {
                            b.q();
                            throw null;
                        }
                        xk70Var5 = (xk70) obj5;
                        if (size5 > 1) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        list5.getClass();
                        list8.getClass();
                        list6.getClass();
                        xk70Var5.getClass();
                        sj70Var4 = xk70Var5.b;
                        it18 = list5.iterator();
                        while (true) {
                            if (it18.hasNext()) {
                                list13 = list8;
                                str13 = str5;
                                next10 = null;
                                break;
                            }
                            next10 = it18.next();
                            list13 = list8;
                            str13 = str5;
                            if (((tk70) next10).a.equals(xk70Var5.c)) {
                                break;
                            }
                            str5 = str13;
                            list8 = list13;
                        }
                        tk70Var2 = (tk70) next10;
                        String str24 = xk70Var5.a;
                        uoo uooVarD2 = ik70.d(xk70Var5);
                        ResourceUiText resourceUiTextE2 = ik70.e(xk70Var5, str16);
                        if (z2) {
                            strValueOf = String.valueOf(i19);
                        } else {
                            strValueOf = null;
                        }
                        UiText uiTextB2 = ik70.b(tk70Var2);
                        UiText uiTextF2 = ik70.f(tk70Var2);
                        UiText uiTextC2 = ik70.c(tk70Var2);
                        iOrdinal10 = sj70Var4.ordinal();
                        if (iOrdinal10 == 0) {
                            qeoVarB2 = null;
                        } else {
                            if (iOrdinal10 == 1 && iOrdinal10 != 2 && iOrdinal10 != 3) {
                                uhc.a();
                                return null;
                            }
                            if (tk70Var2 != null) {
                                str15 = tk70Var2.j;
                            } else {
                                str15 = null;
                            }
                            qeoVarB2 = reo.b(str15);
                        }
                        it19 = list6.iterator();
                        while (true) {
                            if (it19.hasNext()) {
                                next11 = null;
                                break;
                            }
                            next11 = it19.next();
                            it21 = it19;
                            if (((wk70) next11).a.equals(xk70Var5.e)) {
                                break;
                            }
                            it19 = it21;
                        }
                        wk70Var6 = (wk70) next11;
                        if (wk70Var6 != null) {
                            arrayList20 = arrayList15;
                            pk70 pk70Var2 = nk70Var.a;
                            it20 = list13.iterator();
                            while (true) {
                                if (it20.hasNext()) {
                                    nk70Var2 = nk70Var;
                                    arrayList21 = arrayList20;
                                    next12 = null;
                                    break;
                                }
                                next12 = it20.next();
                                nk70Var2 = nk70Var;
                                arrayList21 = arrayList20;
                                if (((vk70) next12).a.equals(wk70Var6.d)) {
                                    break;
                                }
                                arrayList20 = arrayList21;
                                nk70Var = nk70Var2;
                            }
                            arrayList19 = arrayList21;
                            str14 = str13;
                            list14 = list6;
                            vmoVarA2 = pk70Var2.a(str14, sj70Var4, list14, (vk70) next12, wk70Var6);
                        } else {
                            nk70Var2 = nk70Var;
                            arrayList19 = arrayList15;
                            str14 = str13;
                            list14 = list6;
                            vmoVarA2 = null;
                        }
                        arrayList19.add(new voo(str24, uooVarD2, resourceUiTextE2, strValueOf, uiTextB2, null, uiTextF2, uiTextC2, qeoVarB2, vmoVarA2));
                        arrayList15 = arrayList19;
                        str5 = str14;
                        list6 = list14;
                        i13 = i19;
                        nk70Var = nk70Var2;
                        list8 = list13;
                    }
                    list12 = list6;
                    qcn qcnVarB2 = a4h.b(arrayList15);
                    numValueOf = Integer.valueOf(size5);
                    if (size5 <= 1) {
                        numValueOf = null;
                    }
                    if (numValueOf != null) {
                        arrayList16 = new ArrayList(l48.r(listA0, 10));
                        i14 = 0;
                        for (Object obj6 : listA0) {
                            i18 = i14 + 1;
                            if (i14 >= 0) {
                                b.q();
                                throw null;
                            }
                            arrayList16.add(new Pair(((xk70) obj6).e, String.valueOf(i18)));
                            i14 = i18;
                        }
                        mapK = kpu.k(arrayList16);
                        arrayList17 = new ArrayList(l48.r(arrayList13, 10));
                        size7 = arrayList13.size();
                        i15 = 0;
                        while (i15 < size7) {
                            Object obj7 = arrayList13.get(i15);
                            int i23 = i15 + 1;
                            yk70 yk70Var3 = (yk70) obj7;
                            numValueOf2 = Integer.valueOf(R.color.text_inverse_primary);
                            numValueOf3 = Integer.valueOf(R.color.bg_secondary_d_black);
                            list12.getClass();
                            yk70Var3.getClass();
                            mapK.getClass();
                            sj70Var3 = yk70Var3.b;
                            List<xk70> list21 = yk70Var3.g;
                            iOrdinal7 = sj70Var3.ordinal();
                            int i24 = size7;
                            if (iOrdinal7 == 0) {
                                i16 = R.color.text_tertiary;
                            } else if (iOrdinal7 != 1) {
                                i16 = R.color.bg_brand_sub_primary_d_base;
                            } else if (iOrdinal7 != 2) {
                                if (iOrdinal7 != 3) {
                                    uhc.a();
                                    return null;
                                }
                                i16 = R.color.text_tertiary;
                            } else {
                                i16 = R.color.border_secondary;
                            }
                            int i25 = i16;
                            iOrdinal8 = sj70Var3.ordinal();
                            if (iOrdinal8 == 0) {
                                i17 = R.color.bg_secondary_d_black;
                            } else if (iOrdinal8 != 1 || iOrdinal8 == 2) {
                                i17 = R.color.text_inverse_primary;
                            } else {
                                if (iOrdinal8 != 3) {
                                    uhc.a();
                                    return null;
                                }
                                i17 = R.color.bg_secondary_d_black;
                            }
                            String str25 = str10;
                            arrayList18 = new ArrayList(l48.r(list21, 10));
                            it16 = list21.iterator();
                            while (it16.hasNext()) {
                                str12 = (String) mapK.get(((xk70) it16.next()).e);
                                if (str12 == null) {
                                    str12 = "";
                                }
                                arrayList18.add(str12);
                            }
                            String strA0 = CollectionsKt.a0(CollectionsKt.q0(arrayList18), "/", null, null, null, 62);
                            StringUiText stringUiText4 = vch0.a;
                            ColoredUiText coloredUiText6 = new ColoredUiText(new StringUiText(strA0), Integer.valueOf(i17), null);
                            if (sj70Var3 == sj70.WON) {
                                num6 = numValueOf4;
                            } else {
                                num6 = null;
                            }
                            iOrdinal9 = sj70Var3.ordinal();
                            if (iOrdinal9 != 0) {
                                if (iOrdinal9 != 1) {
                                    coloredUiText3 = new ColoredUiText(new ResourceUiText(R.string.bet_history__won), numValueOf2, null);
                                } else if (iOrdinal9 != 2) {
                                    coloredUiText3 = new ColoredUiText(new ResourceUiText(R.string.bet_history__lost), numValueOf2, null);
                                } else {
                                    if (iOrdinal9 == 3) {
                                        uhc.a();
                                        return null;
                                    }
                                    coloredUiText2 = new ColoredUiText(new ResourceUiText(R.string.bet_history__void), numValueOf3, null);
                                }
                                coloredUiText2 = coloredUiText3;
                            } else {
                                coloredUiText2 = new ColoredUiText(new ResourceUiText(R.string.bet_history__waiting_for_result), numValueOf3, null);
                            }
                            String strP3 = rqf0.p(yk70Var3.c);
                            bigDecimalMultiply2 = BigDecimal.ONE;
                            for (xk70 xk70Var6 : list21) {
                                it17 = list12.iterator();
                                do {
                                    if (it17.hasNext()) {
                                        next9 = null;
                                        break;
                                    }
                                    next9 = it17.next();
                                } while (!((wk70) next9).a.equals(xk70Var6.e));
                                wk70Var5 = (wk70) next9;
                                if (wk70Var5 != null) {
                                    BigDecimal bigDecimal7 = wk70Var5.b;
                                    bigDecimalMultiply2.getClass();
                                    bigDecimalMultiply2 = bigDecimalMultiply2.multiply(bigDecimal7);
                                    bigDecimalMultiply2.getClass();
                                }
                            }
                            arrayList17.add(new rmo(i25, coloredUiText6, num6, coloredUiText2, strP3, gky.a.a(bjb0.L(bigDecimalMultiply2, Locale.US), false), ik70.a(yk70Var3), rqf0.v(yk70Var3.e)));
                            i15 = i23;
                            size7 = i24;
                            str10 = str25;
                        }
                        str11 = str10;
                        qcnVarB = a4h.b(arrayList17);
                    } else {
                        str11 = str10;
                        qcnVarB = null;
                    }
                    arrayList4.add(new nmo(null, qcnVarB2, rqf0.b(str11), qcnVarB));
                } else if (iOrdinal4 != 2 && iOrdinal4 != 3 && iOrdinal4 != 4) {
                    uhc.a();
                    return null;
                }
                listB = a4h.b(arrayList4);
            }
            ngsVarB.addAll(listB);
            return new bno.c(a4h.b(a.a(ngsVarB)));
        }
        list = list16;
        StringUiText stringUiText5 = vch0.a;
        resourceUiText = new ResourceUiText(R.string.bet_history__waiting_for_result);
        i = R.color.text_inverse_primary;
        ColoredUiText coloredUiText7 = new ColoredUiText(resourceUiText, Integer.valueOf(i), null);
        iOrdinal = sj70Var5.ordinal();
        if (iOrdinal == 0) {
            if (iOrdinal == 1) {
            }
            strL = bjb0.L(p54.b(fk70Var.g), Locale.US);
        } else {
            strL = "--";
        }
        iOrdinal2 = sj70Var5.ordinal();
        if (iOrdinal2 == 0) {
            num = null;
            i20 = R.color.text_secondary;
        } else if (iOrdinal2 != 1) {
            if (iOrdinal2 != 2) {
                uhc.a();
                return null;
            }
            num = null;
            i20 = R.color.text_secondary;
        } else {
            num = null;
        }
        ColoredUiText coloredUiText8 = new ColoredUiText(new StringUiText(strL), Integer.valueOf(i20), num);
        arrayList = new ArrayList();
        it = list18.iterator();
        while (it.hasNext()) {
            p48.w(((gk70) it.next()).d, arrayList);
        }
        bigDecimalAdd = BigDecimal.ZERO;
        size = arrayList.size();
        while (i2 < size) {
            bigDecimalAdd = bigDecimalAdd.add(((yk70) arrayList.get(i2)).f);
        }
        Integer numValueOf6 = Integer.valueOf(R.string.page_instant_virtual__scheduled_football_logo);
        BigDecimal bigDecimal8 = bigDecimalAdd;
        numC = cmoVar.c(str18);
        ResourceUiText resourceUiTextQ2 = rqf0.q(str17);
        strD = bwf0.a.d(fk70Var.i, true);
        numA = cmoVar.a(str18);
        UiText uiTextD2 = rqf0.d(list18.size(), str19);
        if (sj70Var5 == sj70.WON) {
            num2 = null;
        }
        if (num2 != null) {
            num2 = numValueOf4;
            aVar = new epo.a(num2.intValue(), R.color.icon_brand_sub_secondary);
        } else {
            num2 = numValueOf4;
            aVar = null;
        }
        String strP4 = rqf0.p(fk70Var.f);
        ResourceUiText resourceUiTextJ2 = rqf0.j(str20, bigDecimal2, new Function0() { // from class: rk70
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i26 = fk70Var.l;
                if (i26 == 1) {
                    return Integer.valueOf(R.string.common_functions__cash_gift);
                }
                if (i26 == 2) {
                    return Integer.valueOf(R.string.common_functions__discount_gift);
                }
                if (i26 == 3) {
                    return Integer.valueOf(R.string.common_functions__free_bet_gift);
                }
                return null;
            }
        });
        resourceUiTextI = rqf0.i(bigDecimal2, str20);
        it2 = cd3.f.iterator();
        while (true) {
            if (it2.hasNext()) {
                str2 = strD;
                next = null;
                break;
            }
            next = it2.next();
            str2 = strD;
            if (((cd3) next).a.equalsIgnoreCase(str19)) {
                break;
                break;
            }
            strD = str2;
        }
        cd3Var = (cd3) next;
        if (cd3Var != null) {
            iOrdinal3 = cd3Var.ordinal();
            if (iOrdinal3 != 0) {
                if (iOrdinal3 != 1) {
                    if (iOrdinal3 != 2) {
                        uhc.a();
                        return null;
                    }
                    list2 = list19;
                    resourceUiText2 = resourceUiTextI;
                    num3 = numA;
                } else {
                    arrayList2 = new ArrayList();
                    it4 = list18.iterator();
                    while (it4.hasNext()) {
                        p48.w(((gk70) it4.next()).d, arrayList2);
                        list19 = list19;
                    }
                    list2 = list19;
                    bigDecimalValueOf = BigDecimal.valueOf(0L);
                    bigDecimalValueOf.getClass();
                    size2 = arrayList2.size();
                    resourceUiText2 = resourceUiTextI;
                    i3 = 0;
                    while (true) {
                        if (i3 < size2) {
                            Object obj8 = arrayList2.get(i3);
                            i4 = i3 + 1;
                            arrayList3 = arrayList2;
                            List<xk70> list22 = ((yk70) obj8).g;
                            BigDecimal bigDecimal9 = BigDecimal.ONE;
                            it5 = list22.iterator();
                            bigDecimalMultiply = bigDecimal9;
                            while (true) {
                                if (it5.hasNext()) {
                                    it6 = it5;
                                    xk70Var2 = (xk70) it5.next();
                                    it7 = list17.iterator();
                                    while (true) {
                                        if (it7.hasNext()) {
                                            i5 = i4;
                                            num3 = numA;
                                            next3 = null;
                                            break;
                                        }
                                        next3 = it7.next();
                                        i5 = i4;
                                        num3 = numA;
                                        if (((wk70) next3).a.equals(xk70Var2.e)) {
                                            break;
                                            break;
                                        }
                                        i4 = i5;
                                        numA = num3;
                                    }
                                    wk70Var2 = (wk70) next3;
                                    if (wk70Var2 != null) {
                                        BigDecimal bigDecimal10 = wk70Var2.b;
                                        bigDecimalMultiply.getClass();
                                        bigDecimalMultiply = bigDecimalMultiply.multiply(bigDecimal10);
                                        bigDecimalMultiply.getClass();
                                        it5 = it6;
                                        i4 = i5;
                                        numA = num3;
                                    }
                                } else {
                                    int i26 = i4;
                                    BigDecimal bigDecimal11 = bigDecimalMultiply;
                                    bigDecimal11.getClass();
                                    bigDecimalValueOf = bigDecimalValueOf.add(bigDecimal11);
                                    bigDecimalValueOf.getClass();
                                    arrayList2 = arrayList3;
                                    i3 = i26;
                                }
                            }
                        } else {
                            num3 = numA;
                            strA = gky.a.a(bjb0.L(bigDecimalValueOf, Locale.US), false);
                            str4 = strA;
                            num4 = numC;
                        }
                    }
                }
                num4 = numC;
                str4 = null;
            } else {
                list2 = list19;
                resourceUiText2 = resourceUiTextI;
                num3 = numA;
                gk70Var = (gk70) CollectionsKt.p0(list18);
                if (gk70Var != null) {
                    str3 = xk70Var.e;
                    it3 = list17.iterator();
                    do {
                        if (it3.hasNext()) {
                            next2 = null;
                            break;
                        }
                        next2 = it3.next();
                    } while (!((wk70) next2).a.equals(str3));
                    wk70Var = (wk70) next2;
                    if (wk70Var != null) {
                        strA = gky.a.a(bjb0.L(wk70Var.b, Locale.US), false);
                        str4 = strA;
                        num4 = numC;
                    }
                }
                num4 = numC;
                str4 = null;
            }
        } else {
            list2 = list19;
            resourceUiText2 = resourceUiTextI;
            num3 = numA;
            num4 = numC;
            str4 = null;
        }
        bigDecimal8.getClass();
        String strF2 = rqf0.f(bigDecimal8);
        ResourceUiText resourceUiTextV2 = rqf0.v(fk70Var.h);
        str5 = str18;
        list5 = list;
        String str26 = str2;
        list6 = list17;
        list7 = list18;
        list8 = list2;
        ngsVarB.add(new epo(numValueOf6, num4, resourceUiTextQ2, str17, str26, num3, uiTextD2, aVar, coloredUiText7, null, coloredUiText8, strP4, resourceUiTextJ2, resourceUiText2, str4, strF2, resourceUiTextV2));
        it8 = cd3.f.iterator();
        do {
            if (it8.hasNext()) {
                next4 = null;
                break;
            }
            next4 = it8.next();
        } while (!((cd3) next4).a.equalsIgnoreCase(str19));
        cd3Var2 = (cd3) next4;
        if (cd3Var2 == null) {
            listB = n1a0.c;
        } else {
            arrayList4 = new ArrayList();
            iOrdinal4 = cd3Var2.ordinal();
            if (iOrdinal4 != 0) {
                qk70Var = jk70Var.c;
                set5.getClass();
                arrayList5 = new ArrayList(l48.r(list7, 10));
                while (r5.hasNext()) {
                    arrayList5.add(new Pair(gk70Var3.a, gk70Var3.d));
                }
                arrayList6 = new ArrayList();
                size3 = arrayList5.size();
                i6 = 0;
                while (i6 < size3) {
                    Object obj9 = arrayList5.get(i6);
                    i6++;
                    Pair pair2 = (Pair) obj9;
                    str6 = (String) pair2.a;
                    list9 = (List) pair2.b;
                    arrayList7 = new ArrayList(l48.r(list9, 10));
                    i7 = 0;
                    while (r19.hasNext()) {
                        i8 = i7 + 1;
                        if (i7 >= 0) {
                            b.q();
                            throw null;
                        }
                        yk70Var2 = (yk70) obj3;
                        list10 = list7;
                        ArrayList arrayList23 = arrayList5;
                        if (list10.size() > 1) {
                            list11 = list10;
                        } else {
                            list11 = null;
                        }
                        if (list11 != null) {
                            if (i7 == 0) {
                                z = true;
                            } else {
                                z = false;
                            }
                            sj70Var2 = yk70Var2.b;
                            if (sj70Var2 == sj70.WON) {
                                num5 = numValueOf4;
                            } else {
                                num5 = null;
                            }
                            iOrdinal6 = sj70Var2.ordinal();
                            if (iOrdinal6 == 0) {
                                coloredUiText = null;
                            } else {
                                if (iOrdinal6 != 1) {
                                    resourceUiText3 = new ResourceUiText(R.string.bet_history__won);
                                    i11 = R.color.bg_brand_sub_primary_d_lighter;
                                } else if (iOrdinal6 != 2) {
                                    if (iOrdinal6 != 3) {
                                        uhc.a();
                                        return null;
                                    }
                                    coloredUiText = null;
                                } else {
                                    resourceUiText3 = new ResourceUiText(R.string.bet_history__lost);
                                    i11 = R.color.text_secondary;
                                }
                                coloredUiText = new ColoredUiText(resourceUiText3, Integer.valueOf(i11), null);
                            }
                            String strA3 = ik70.a(yk70Var2);
                            String strP5 = rqf0.p(yk70Var2.c);
                            xk70Var4 = (xk70) CollectionsKt.firstOrNull(yk70Var2.g);
                            if (xk70Var4 != null) {
                                str9 = xk70Var4.e;
                            } else {
                                str9 = null;
                            }
                            it14 = list6.iterator();
                            do {
                                if (it14.hasNext()) {
                                    next8 = null;
                                    break;
                                }
                                next8 = it14.next();
                            } while (!((wk70) next8).a.equals(str9));
                            wk70Var4 = (wk70) next8;
                            if (wk70Var4 != null) {
                                bigDecimal = wk70Var4.b;
                            } else {
                                bigDecimal = BigDecimal.ZERO;
                            }
                            set2 = set5;
                            str7 = str6;
                            nnoVar = new nno(str7, set2.contains(str6), new ResourceUiText(R.string.component_betslip__single), num5, coloredUiText, strA3, strP5, gky.a.a(bjb0.L(bigDecimal, Locale.US), false), null, rqf0.v(yk70Var2.e), z, null);
                        } else {
                            set2 = set5;
                            list5 = list5;
                            str7 = str6;
                            nnoVar = null;
                        }
                        arrayList8 = new ArrayList();
                        it9 = list9.iterator();
                        while (it9.hasNext()) {
                            p48.w(((yk70) it9.next()).g, arrayList8);
                        }
                        arrayList9 = new ArrayList(l48.r(arrayList8, 10));
                        size4 = arrayList8.size();
                        i9 = 0;
                        while (i9 < size4) {
                            int i27 = i9 + 1;
                            xk70Var3 = (xk70) arrayList8.get(i9);
                            it10 = list5.iterator();
                            while (true) {
                                if (it10.hasNext()) {
                                    set3 = set2;
                                    i10 = size4;
                                    next5 = null;
                                    break;
                                }
                                next5 = it10.next();
                                set3 = set2;
                                i10 = size4;
                                if (((tk70) next5).a.equals(xk70Var3.c)) {
                                    break;
                                    break;
                                }
                                set2 = set3;
                                size4 = i10;
                            }
                            tk70Var = (tk70) next5;
                            String str27 = xk70Var3.a;
                            sj70Var = xk70Var3.b;
                            uoo uooVarD3 = ik70.d(xk70Var3);
                            ResourceUiText resourceUiTextE3 = ik70.e(xk70Var3, str16);
                            UiText uiTextB3 = ik70.b(tk70Var);
                            UiText uiTextF3 = ik70.f(tk70Var);
                            UiText uiTextC3 = ik70.c(tk70Var);
                            String str28 = str16;
                            iOrdinal5 = sj70Var.ordinal();
                            if (iOrdinal5 != 0) {
                                if (iOrdinal5 == 1) {
                                }
                                if (tk70Var != null) {
                                    str8 = tk70Var.j;
                                } else {
                                    str8 = null;
                                }
                                qeoVarB = reo.b(str8);
                            } else {
                                qeoVarB = null;
                            }
                            it11 = list6.iterator();
                            while (true) {
                                if (it11.hasNext()) {
                                    next6 = null;
                                    break;
                                }
                                next6 = it11.next();
                                it13 = it11;
                                if (((wk70) next6).a.equals(xk70Var3.e)) {
                                    break;
                                    break;
                                }
                                it11 = it13;
                            }
                            wk70Var3 = (wk70) next6;
                            if (wk70Var3 != null) {
                                arrayList11 = arrayList9;
                                pk70 pk70Var3 = qk70Var.a;
                                it12 = list8.iterator();
                                while (true) {
                                    if (it12.hasNext()) {
                                        arrayList12 = arrayList11;
                                        qk70Var2 = qk70Var;
                                        next7 = null;
                                        break;
                                    }
                                    next7 = it12.next();
                                    arrayList12 = arrayList11;
                                    qk70Var2 = qk70Var;
                                    if (((vk70) next7).a.equals(wk70Var3.d)) {
                                        break;
                                        break;
                                    }
                                    arrayList11 = arrayList12;
                                    qk70Var = qk70Var2;
                                }
                                arrayList10 = arrayList12;
                                vmoVarA = pk70Var3.a(str5, sj70Var, list6, (vk70) next7, wk70Var3);
                            } else {
                                qk70Var2 = qk70Var;
                                arrayList10 = arrayList9;
                                vmoVarA = null;
                            }
                            arrayList10.add(new voo(str27, uooVarD3, resourceUiTextE3, null, uiTextB3, null, uiTextF3, uiTextC3, qeoVarB, vmoVarA));
                            arrayList9 = arrayList10;
                            i9 = i27;
                            size4 = i10;
                            str16 = str28;
                            qk70Var = qk70Var2;
                            set2 = set3;
                        }
                        set5 = set2;
                        arrayList7.add(new nmo(nnoVar, a4h.b(arrayList9), rqf0.b(str7), null));
                        list7 = list10;
                        i7 = i8;
                        arrayList5 = arrayList23;
                        list5 = list5;
                        str16 = str16;
                        qk70Var = qk70Var;
                        str6 = str7;
                    }
                    p48.w(arrayList7, arrayList6);
                }
                arrayList4.addAll(arrayList6);
            } else if (iOrdinal4 != 1) {
                nk70Var = jk70Var.b;
                gk70Var2 = (gk70) CollectionsKt.firstOrNull(list7);
                if (gk70Var2 != null) {
                    str10 = gk70Var2.a;
                } else {
                    str10 = null;
                }
                if (str10 == null) {
                    str10 = "";
                }
                arrayList13 = new ArrayList();
                it15 = list7.iterator();
                while (it15.hasNext()) {
                    p48.w(((gk70) it15.next()).d, arrayList13);
                }
                size5 = arrayList13.size();
                arrayList14 = new ArrayList();
                size6 = arrayList13.size();
                i12 = 0;
                while (i12 < size6) {
                    Object obj10 = arrayList13.get(i12);
                    i12++;
                    p48.w(((yk70) obj10).g, arrayList14);
                }
                listA0 = CollectionsKt.A0(CollectionsKt.D0(arrayList14));
                arrayList15 = new ArrayList(l48.r(listA0, 10));
                i13 = 0;
                while (r19.hasNext()) {
                    i19 = i13 + 1;
                    if (i13 >= 0) {
                        b.q();
                        throw null;
                    }
                    xk70Var5 = (xk70) obj5;
                    if (size5 > 1) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    list5.getClass();
                    list8.getClass();
                    list6.getClass();
                    xk70Var5.getClass();
                    sj70Var4 = xk70Var5.b;
                    it18 = list5.iterator();
                    while (true) {
                        if (it18.hasNext()) {
                            list13 = list8;
                            str13 = str5;
                            next10 = null;
                            break;
                        }
                        next10 = it18.next();
                        list13 = list8;
                        str13 = str5;
                        if (((tk70) next10).a.equals(xk70Var5.c)) {
                            break;
                            break;
                        }
                        str5 = str13;
                        list8 = list13;
                    }
                    tk70Var2 = (tk70) next10;
                    String str29 = xk70Var5.a;
                    uoo uooVarD4 = ik70.d(xk70Var5);
                    ResourceUiText resourceUiTextE4 = ik70.e(xk70Var5, str16);
                    if (z2) {
                        strValueOf = String.valueOf(i19);
                    } else {
                        strValueOf = null;
                    }
                    UiText uiTextB4 = ik70.b(tk70Var2);
                    UiText uiTextF4 = ik70.f(tk70Var2);
                    UiText uiTextC4 = ik70.c(tk70Var2);
                    iOrdinal10 = sj70Var4.ordinal();
                    if (iOrdinal10 == 0) {
                        if (iOrdinal10 == 1) {
                        }
                        if (tk70Var2 != null) {
                            str15 = tk70Var2.j;
                        } else {
                            str15 = null;
                        }
                        qeoVarB2 = reo.b(str15);
                    } else {
                        qeoVarB2 = null;
                    }
                    it19 = list6.iterator();
                    while (true) {
                        if (it19.hasNext()) {
                            next11 = null;
                            break;
                        }
                        next11 = it19.next();
                        it21 = it19;
                        if (((wk70) next11).a.equals(xk70Var5.e)) {
                            break;
                            break;
                        }
                        it19 = it21;
                    }
                    wk70Var6 = (wk70) next11;
                    if (wk70Var6 != null) {
                        arrayList20 = arrayList15;
                        pk70 pk70Var4 = nk70Var.a;
                        it20 = list13.iterator();
                        while (true) {
                            if (it20.hasNext()) {
                                nk70Var2 = nk70Var;
                                arrayList21 = arrayList20;
                                next12 = null;
                                break;
                            }
                            next12 = it20.next();
                            nk70Var2 = nk70Var;
                            arrayList21 = arrayList20;
                            if (((vk70) next12).a.equals(wk70Var6.d)) {
                                break;
                                break;
                            }
                            arrayList20 = arrayList21;
                            nk70Var = nk70Var2;
                        }
                        arrayList19 = arrayList21;
                        str14 = str13;
                        list14 = list6;
                        vmoVarA2 = pk70Var4.a(str14, sj70Var4, list14, (vk70) next12, wk70Var6);
                    } else {
                        nk70Var2 = nk70Var;
                        arrayList19 = arrayList15;
                        str14 = str13;
                        list14 = list6;
                        vmoVarA2 = null;
                    }
                    arrayList19.add(new voo(str29, uooVarD4, resourceUiTextE4, strValueOf, uiTextB4, null, uiTextF4, uiTextC4, qeoVarB2, vmoVarA2));
                    arrayList15 = arrayList19;
                    str5 = str14;
                    list6 = list14;
                    i13 = i19;
                    nk70Var = nk70Var2;
                    list8 = list13;
                }
                list12 = list6;
                qcn qcnVarB3 = a4h.b(arrayList15);
                numValueOf = Integer.valueOf(size5);
                if (size5 <= 1) {
                    numValueOf = null;
                }
                if (numValueOf != null) {
                    arrayList16 = new ArrayList(l48.r(listA0, 10));
                    i14 = 0;
                    while (r3.hasNext()) {
                        i18 = i14 + 1;
                        if (i14 >= 0) {
                            b.q();
                            throw null;
                        }
                        arrayList16.add(new Pair(((xk70) obj6).e, String.valueOf(i18)));
                        i14 = i18;
                    }
                    mapK = kpu.k(arrayList16);
                    arrayList17 = new ArrayList(l48.r(arrayList13, 10));
                    size7 = arrayList13.size();
                    i15 = 0;
                    while (i15 < size7) {
                        Object obj11 = arrayList13.get(i15);
                        int i28 = i15 + 1;
                        yk70 yk70Var4 = (yk70) obj11;
                        numValueOf2 = Integer.valueOf(R.color.text_inverse_primary);
                        numValueOf3 = Integer.valueOf(R.color.bg_secondary_d_black);
                        list12.getClass();
                        yk70Var4.getClass();
                        mapK.getClass();
                        sj70Var3 = yk70Var4.b;
                        List<xk70> list23 = yk70Var4.g;
                        iOrdinal7 = sj70Var3.ordinal();
                        int i29 = size7;
                        if (iOrdinal7 == 0) {
                            i16 = R.color.text_tertiary;
                        } else if (iOrdinal7 != 1) {
                            i16 = R.color.bg_brand_sub_primary_d_base;
                        } else if (iOrdinal7 != 2) {
                            if (iOrdinal7 != 3) {
                                uhc.a();
                                return null;
                            }
                            i16 = R.color.text_tertiary;
                        } else {
                            i16 = R.color.border_secondary;
                        }
                        int i210 = i16;
                        iOrdinal8 = sj70Var3.ordinal();
                        if (iOrdinal8 == 0) {
                            i17 = R.color.bg_secondary_d_black;
                        } else {
                            if (iOrdinal8 != 1) {
                            }
                            i17 = R.color.text_inverse_primary;
                        }
                        String str210 = str10;
                        arrayList18 = new ArrayList(l48.r(list23, 10));
                        it16 = list23.iterator();
                        while (it16.hasNext()) {
                            str12 = (String) mapK.get(((xk70) it16.next()).e);
                            if (str12 == null) {
                                str12 = "";
                            }
                            arrayList18.add(str12);
                        }
                        String strA1 = CollectionsKt.a0(CollectionsKt.q0(arrayList18), "/", null, null, null, 62);
                        StringUiText stringUiText6 = vch0.a;
                        ColoredUiText coloredUiText9 = new ColoredUiText(new StringUiText(strA1), Integer.valueOf(i17), null);
                        if (sj70Var3 == sj70.WON) {
                            num6 = numValueOf4;
                        } else {
                            num6 = null;
                        }
                        iOrdinal9 = sj70Var3.ordinal();
                        if (iOrdinal9 != 0) {
                            if (iOrdinal9 != 1) {
                                coloredUiText3 = new ColoredUiText(new ResourceUiText(R.string.bet_history__won), numValueOf2, null);
                            } else if (iOrdinal9 != 2) {
                                coloredUiText3 = new ColoredUiText(new ResourceUiText(R.string.bet_history__lost), numValueOf2, null);
                            } else {
                                if (iOrdinal9 == 3) {
                                    uhc.a();
                                    return null;
                                }
                                coloredUiText2 = new ColoredUiText(new ResourceUiText(R.string.bet_history__void), numValueOf3, null);
                            }
                            coloredUiText2 = coloredUiText3;
                        } else {
                            coloredUiText2 = new ColoredUiText(new ResourceUiText(R.string.bet_history__waiting_for_result), numValueOf3, null);
                        }
                        String strP6 = rqf0.p(yk70Var4.c);
                        bigDecimalMultiply2 = BigDecimal.ONE;
                        while (r12.hasNext()) {
                            it17 = list12.iterator();
                            do {
                                if (it17.hasNext()) {
                                    next9 = null;
                                    break;
                                }
                                next9 = it17.next();
                            } while (!((wk70) next9).a.equals(xk70Var6.e));
                            wk70Var5 = (wk70) next9;
                            if (wk70Var5 != null) {
                                BigDecimal bigDecimal12 = wk70Var5.b;
                                bigDecimalMultiply2.getClass();
                                bigDecimalMultiply2 = bigDecimalMultiply2.multiply(bigDecimal12);
                                bigDecimalMultiply2.getClass();
                            }
                        }
                        arrayList17.add(new rmo(i210, coloredUiText9, num6, coloredUiText2, strP6, gky.a.a(bjb0.L(bigDecimalMultiply2, Locale.US), false), ik70.a(yk70Var4), rqf0.v(yk70Var4.e)));
                        i15 = i28;
                        size7 = i29;
                        str10 = str210;
                    }
                    str11 = str10;
                    qcnVarB = a4h.b(arrayList17);
                } else {
                    str11 = str10;
                    qcnVarB = null;
                }
                arrayList4.add(new nmo(null, qcnVarB3, rqf0.b(str11), qcnVarB));
            } else if (iOrdinal4 != 2) {
                uhc.a();
                return null;
            }
            listB = a4h.b(arrayList4);
        }
        ngsVarB.addAll(listB);
        return new bno.c(a4h.b(a.a(ngsVarB)));
    }
}
