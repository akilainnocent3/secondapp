package defpackage;

import com.sportybet.android.social.domain.entity.SocialProfileState;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.android.social.domain.viewmodel.PersonalSocialViewModel$getSocialProfileState$1", f = "PersonalSocialViewModel.kt", l = {120, 122, 147, 152}, m = "invokeSuspend", v = 2)
public final class dq00 extends tje0 implements Function2<lk50<? extends SocialProfileState>, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ kq00 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dq00(kq00 kq00Var, v1b v1bVar) {
        super(2, v1bVar);
        this.c = kq00Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        dq00 dq00Var = new dq00(this.c, v1bVar);
        dq00Var.b = obj;
        return dq00Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(lk50<? extends SocialProfileState> lk50Var, v1b<? super Unit> v1bVar) {
        return ((dq00) create(lk50Var, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0176  */
    /* JADX WARN: Code duplicated, block: B:103:0x017a  */
    /* JADX WARN: Code duplicated, block: B:105:0x017e  */
    /* JADX WARN: Code duplicated, block: B:107:0x0183  */
    /* JADX WARN: Code duplicated, block: B:109:0x0187  */
    /* JADX WARN: Code duplicated, block: B:110:0x018d  */
    /* JADX WARN: Code duplicated, block: B:112:0x0197  */
    /* JADX WARN: Code duplicated, block: B:114:0x019b  */
    /* JADX WARN: Code duplicated, block: B:117:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:119:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:120:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:122:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:124:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:127:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:129:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:130:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:132:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:134:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:137:0x01da  */
    /* JADX WARN: Code duplicated, block: B:139:0x01de  */
    /* JADX WARN: Code duplicated, block: B:140:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:142:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:144:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:145:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:147:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:150:0x0203  */
    /* JADX WARN: Code duplicated, block: B:152:0x020d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:153:0x020f  */
    /* JADX WARN: Code duplicated, block: B:154:0x0215 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:155:0x0217  */
    /* JADX WARN: Code duplicated, block: B:159:0x021f  */
    /* JADX WARN: Code duplicated, block: B:160:0x0224  */
    /* JADX WARN: Code duplicated, block: B:163:0x0235  */
    /* JADX WARN: Code duplicated, block: B:164:0x023a  */
    /* JADX WARN: Code duplicated, block: B:166:0x0240  */
    /* JADX WARN: Code duplicated, block: B:168:0x0245  */
    /* JADX WARN: Code duplicated, block: B:172:0x0251  */
    /* JADX WARN: Code duplicated, block: B:173:0x0256  */
    /* JADX WARN: Code duplicated, block: B:176:0x0267  */
    /* JADX WARN: Code duplicated, block: B:178:0x026b  */
    /* JADX WARN: Code duplicated, block: B:180:0x026f  */
    /* JADX WARN: Code duplicated, block: B:182:0x0275  */
    /* JADX WARN: Code duplicated, block: B:184:0x0279  */
    /* JADX WARN: Code duplicated, block: B:185:0x027f  */
    /* JADX WARN: Code duplicated, block: B:187:0x0289  */
    /* JADX WARN: Code duplicated, block: B:189:0x028d  */
    /* JADX WARN: Code duplicated, block: B:192:0x0292  */
    /* JADX WARN: Code duplicated, block: B:194:0x0296  */
    /* JADX WARN: Code duplicated, block: B:195:0x029c  */
    /* JADX WARN: Code duplicated, block: B:197:0x02a6  */
    /* JADX WARN: Code duplicated, block: B:199:0x02aa  */
    /* JADX WARN: Code duplicated, block: B:202:0x02af  */
    /* JADX WARN: Code duplicated, block: B:204:0x02b3  */
    /* JADX WARN: Code duplicated, block: B:205:0x02b9  */
    /* JADX WARN: Code duplicated, block: B:207:0x02c3  */
    /* JADX WARN: Code duplicated, block: B:209:0x02c7  */
    /* JADX WARN: Code duplicated, block: B:212:0x02cc  */
    /* JADX WARN: Code duplicated, block: B:214:0x02d0  */
    /* JADX WARN: Code duplicated, block: B:215:0x02d7  */
    /* JADX WARN: Code duplicated, block: B:217:0x02e1  */
    /* JADX WARN: Code duplicated, block: B:219:0x02e5  */
    /* JADX WARN: Code duplicated, block: B:220:0x02e9  */
    /* JADX WARN: Code duplicated, block: B:222:0x02ed  */
    /* JADX WARN: Code duplicated, block: B:225:0x02f6  */
    /* JADX WARN: Code duplicated, block: B:227:0x0300 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:228:0x0302  */
    /* JADX WARN: Code duplicated, block: B:229:0x0308 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:230:0x030a  */
    /* JADX WARN: Code duplicated, block: B:234:0x0312  */
    /* JADX WARN: Code duplicated, block: B:235:0x0317  */
    /* JADX WARN: Code duplicated, block: B:238:0x037c  */
    /* JADX WARN: Code duplicated, block: B:241:0x038c  */
    /* JADX WARN: Code duplicated, block: B:242:0x038e  */
    /* JADX WARN: Code duplicated, block: B:245:0x039d  */
    /* JADX WARN: Code duplicated, block: B:248:0x03ae  */
    /* JADX WARN: Code duplicated, block: B:250:0x03de  */
    /* JADX WARN: Code duplicated, block: B:251:0x03e1  */
    /* JADX WARN: Code duplicated, block: B:254:0x03e7  */
    /* JADX WARN: Code duplicated, block: B:255:0x03ea  */
    /* JADX WARN: Code duplicated, block: B:258:0x03f0  */
    /* JADX WARN: Code duplicated, block: B:259:0x03f3  */
    /* JADX WARN: Code duplicated, block: B:262:0x03f9  */
    /* JADX WARN: Code duplicated, block: B:263:0x03fc  */
    /* JADX WARN: Code duplicated, block: B:266:0x0402  */
    /* JADX WARN: Code duplicated, block: B:267:0x0405  */
    /* JADX WARN: Code duplicated, block: B:269:0x0409  */
    /* JADX WARN: Code duplicated, block: B:271:0x040e  */
    /* JADX WARN: Code duplicated, block: B:30:0x0081  */
    /* JADX WARN: Code duplicated, block: B:84:0x0122  */
    /* JADX WARN: Code duplicated, block: B:89:0x0140  */
    /* JADX WARN: Code duplicated, block: B:92:0x0153  */
    /* JADX WARN: Code duplicated, block: B:93:0x0156  */
    /* JADX WARN: Code duplicated, block: B:97:0x0162  */
    /* JADX WARN: Code duplicated, block: B:98:0x0167  */
    /* JADX WARN: Code restructure failed: missing block: B:246:0x03aa, code lost:
    
        if (kotlin.Unit.a == r5) goto L280;
     */
    /* JADX WARN: Code restructure failed: missing block: B:273:0x0424, code lost:
    
        if (kotlin.Unit.a == r5) goto L280;
     */
    /* JADX WARN: Code restructure failed: missing block: B:279:0x044f, code lost:
    
        if (kotlin.Unit.a == r5) goto L280;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r41) {
        /*
            Method dump skipped, instruction units count: 1119
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dq00.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
