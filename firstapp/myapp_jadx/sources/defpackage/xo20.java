package defpackage;

import com.sportybet.plugin.realsports.data.Share;
import kotlin.text.c;

/* JADX INFO: loaded from: classes5.dex */
public final class xo20 {
    public final x4k a;
    public final s05 b;
    public final uqm c;
    public final lrm d;
    public final t090 e;

    public xo20(x4k x4kVar, s05 s05Var, uqm uqmVar, lrm lrmVar, t090 t090Var) {
        s05Var.getClass();
        uqmVar.getClass();
        lrmVar.getClass();
        t090Var.getClass();
        this.a = x4kVar;
        this.b = s05Var;
        this.c = uqmVar;
        this.d = lrmVar;
        this.e = t090Var;
    }

    public static /* synthetic */ Object b(xo20 xo20Var, String str, String str2, String str3, String str4, String str5, tje0 tje0Var, int i) {
        if ((i & 4) != 0) {
            str3 = null;
        }
        if ((i & 8) != 0) {
            str4 = null;
        }
        if ((i & 16) != 0) {
            str5 = null;
        }
        return xo20Var.a(str, str2, str3, str4, str5, true, tje0Var);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:31:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:35:0x0119  */
    /* JADX WARN: Code duplicated, block: B:38:0x0142  */
    /* JADX WARN: Code duplicated, block: B:40:0x0156  */
    /* JADX WARN: Code duplicated, block: B:43:0x016e  */
    /* JADX WARN: Code duplicated, block: B:45:0x0190  */
    /* JADX WARN: Code duplicated, block: B:47:0x019b  */
    /* JADX WARN: Code duplicated, block: B:48:0x019d  */
    /* JADX WARN: Code duplicated, block: B:50:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Instruction removed from duplicated block: B:43:0x016e, please report this as an issue */
    public final Object a(String str, String str2, String str3, String str4, String str5, boolean z, x1b x1bVar) throws fk50 {
        wo20 wo20Var;
        String str6;
        String str7;
        boolean z2;
        String str8;
        String str9;
        String str10;
        v4k v4kVar;
        boolean zX;
        String lastNickName;
        boolean z3;
        boolean z4;
        String str11;
        String str12;
        v4k v4kVar2;
        String str13;
        String str14;
        String str15;
        String str16;
        v4k v4kVar3;
        String str17;
        int i;
        String avatarUrl;
        String str18;
        boolean z5;
        String str19;
        String str20;
        String str21;
        String str22;
        c190 c190Var;
        String str23;
        String str24;
        Object objA;
        String str25;
        String str26;
        String str27;
        String str28;
        int i2;
        String str29;
        boolean z6;
        boolean z7;
        String strP;
        String str30;
        if (x1bVar instanceof wo20) {
            wo20Var = (wo20) x1bVar;
            int i3 = wo20Var.C;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                wo20Var.C = i3 - Integer.MIN_VALUE;
            } else {
                wo20Var = new wo20(this, x1bVar);
            }
        } else {
            wo20Var = new wo20(this, x1bVar);
        }
        Object obj = wo20Var.A;
        y5b y5bVar = y5b.a;
        int i4 = wo20Var.C;
        uqm uqmVar = this.c;
        if (i4 == 0) {
            uj50.b(obj);
            wo20Var.a = str;
            wo20Var.b = str2;
            wo20Var.c = str3;
            str6 = str4;
            wo20Var.d = str6;
            wo20Var.e = str5;
            wo20Var.w = z;
            wo20Var.C = 1;
            Object objA2 = this.a.a(str, wo20Var);
            if (objA2 != y5bVar) {
                str7 = str;
                z2 = z;
                str8 = str2;
                obj = objA2;
                str9 = str3;
                str10 = str5;
            }
            return y5bVar;
        }
        if (i4 == 1) {
            z2 = wo20Var.w;
            str10 = wo20Var.e;
            str6 = wo20Var.d;
            str9 = wo20Var.c;
            str8 = wo20Var.b;
            str7 = wo20Var.a;
            uj50.b(obj);
        } else {
            if (i4 == 2) {
                z4 = wo20Var.y;
                z3 = wo20Var.w;
                str13 = wo20Var.i;
                v4kVar2 = wo20Var.f;
                str16 = wo20Var.e;
                str11 = wo20Var.d;
                str14 = wo20Var.c;
                str12 = wo20Var.b;
                str15 = wo20Var.a;
                uj50.b(obj);
                if (((Boolean) obj).booleanValue()) {
                    str17 = str14;
                    lastNickName = str13;
                    v4kVar3 = v4kVar2;
                    str8 = str12;
                    str6 = str11;
                    zX = z4;
                    i = 1;
                } else {
                    v4kVar = v4kVar2;
                    str8 = str12;
                    str6 = str11;
                    zX = z4;
                    z2 = z3;
                    str10 = str16;
                    str7 = str15;
                    str9 = str14;
                    lastNickName = str13;
                    v4kVar3 = v4kVar;
                    str17 = str9;
                    str15 = str7;
                    str16 = str10;
                    z3 = z2;
                    i = 0;
                }
                avatarUrl = uqmVar.getAvatarUrl();
                this.d.w(new Share(str15, v4kVar3.a.shareURL));
                if (z3) {
                    b190 b190Var = new b190(v4kVar3.b, str17, lastNickName, str15);
                    wo20Var.a = str15;
                    wo20Var.b = str8;
                    wo20Var.c = str17;
                    wo20Var.d = str6;
                    wo20Var.e = str16;
                    wo20Var.f = v4kVar3;
                    wo20Var.i = lastNickName;
                    wo20Var.v = avatarUrl;
                    wo20Var.w = z3;
                    wo20Var.y = zX;
                    wo20Var.z = i;
                    wo20Var.C = 3;
                    objA = this.e.a(b190Var, wo20Var);
                    if (objA != y5bVar) {
                        str25 = str17;
                        str18 = str15;
                        str26 = avatarUrl;
                        str27 = str16;
                        str28 = lastNickName;
                        obj = objA;
                        i2 = i;
                        str29 = str6;
                        z6 = zX;
                    }
                    return y5bVar;
                }
                str18 = str15;
                z5 = zX;
                str19 = lastNickName;
                str20 = str17;
                str21 = str6;
                str22 = str16;
                c190Var = new c190((String) null, 3);
                str23 = str8;
                str24 = avatarUrl;
                String str31 = c190Var.a;
                String str32 = c190Var.b;
                if (str20 != null) {
                    String str33 = v4kVar3.a.shareURL;
                    str33.getClass();
                    z7 = false;
                    strP = c.p(str33, "shareCode=" + str18, "customCode=".concat(str20), false);
                } else {
                    z7 = false;
                    strP = v4kVar3.a.shareURL;
                    strP.getClass();
                }
                String str34 = strP;
                if (str20 == null) {
                    str30 = str18;
                } else {
                    str30 = str20;
                }
                if (i != 0) {
                    z7 = true;
                }
                return new wz80(str31, str32, str34, str30, str20, z7, z5, str19, str24, str23, str21, str22);
            }
            if (i4 != 3) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i2 = wo20Var.z;
            z6 = wo20Var.y;
            str26 = wo20Var.v;
            str28 = wo20Var.i;
            v4kVar3 = wo20Var.f;
            str27 = wo20Var.e;
            str29 = wo20Var.d;
            str25 = wo20Var.c;
            str8 = wo20Var.b;
            str18 = wo20Var.a;
            uj50.b(obj);
        }
        c190Var = (c190) obj;
        str19 = str28;
        str22 = str27;
        str21 = str29;
        str20 = str25;
        str23 = str8;
        z5 = z6;
        str24 = str26;
        i = i2;
        String str35 = c190Var.a;
        String str36 = c190Var.b;
        if (str20 != null) {
            String str37 = v4kVar3.a.shareURL;
            str37.getClass();
            z7 = false;
            strP = c.p(str37, "shareCode=" + str18, "customCode=".concat(str20), false);
        } else {
            z7 = false;
            strP = v4kVar3.a.shareURL;
            strP.getClass();
        }
        String str38 = strP;
        if (str20 == null) {
            str30 = str18;
        } else {
            str30 = str20;
        }
        if (i != 0) {
            z7 = true;
        }
        return new wz80(str35, str36, str38, str30, str20, z7, z5, str19, str24, str23, str21, str22);
        v4kVar = (v4k) obj;
        zX = g880.x(v4kVar.b);
        lastNickName = uqmVar.getLastNickName();
        if (!uqmVar.hasPersonalPage()) {
            v4kVar3 = v4kVar;
            str17 = str9;
            str15 = str7;
            str16 = str10;
            z3 = z2;
            i = 0;
            avatarUrl = uqmVar.getAvatarUrl();
            this.d.w(new Share(str15, v4kVar3.a.shareURL));
            if (z3) {
                b190 b190Var2 = new b190(v4kVar3.b, str17, lastNickName, str15);
                wo20Var.a = str15;
                wo20Var.b = str8;
                wo20Var.c = str17;
                wo20Var.d = str6;
                wo20Var.e = str16;
                wo20Var.f = v4kVar3;
                wo20Var.i = lastNickName;
                wo20Var.v = avatarUrl;
                wo20Var.w = z3;
                wo20Var.y = zX;
                wo20Var.z = i;
                wo20Var.C = 3;
                objA = this.e.a(b190Var2, wo20Var);
                if (objA != y5bVar) {
                    str25 = str17;
                    str18 = str15;
                    str26 = avatarUrl;
                    str27 = str16;
                    str28 = lastNickName;
                    obj = objA;
                    i2 = i;
                    str29 = str6;
                    z6 = zX;
                    c190Var = (c190) obj;
                    str19 = str28;
                    str22 = str27;
                    str21 = str29;
                    str20 = str25;
                    str23 = str8;
                    z5 = z6;
                    str24 = str26;
                    i = i2;
                }
            } else {
                str18 = str15;
                z5 = zX;
                str19 = lastNickName;
                str20 = str17;
                str21 = str6;
                str22 = str16;
                c190Var = new c190((String) null, 3);
                str23 = str8;
                str24 = avatarUrl;
            }
            String str39 = c190Var.a;
            String str310 = c190Var.b;
            if (str20 != null) {
                String str311 = v4kVar3.a.shareURL;
                str311.getClass();
                z7 = false;
                strP = c.p(str311, "shareCode=" + str18, "customCode=".concat(str20), false);
            } else {
                z7 = false;
                strP = v4kVar3.a.shareURL;
                strP.getClass();
            }
            String str312 = strP;
            if (str20 == null) {
                str30 = str18;
            } else {
                str30 = str20;
            }
            if (i != 0) {
                z7 = true;
            }
            return new wz80(str39, str310, str312, str30, str20, z7, z5, str19, str24, str23, str21, str22);
        }
        wo20Var.a = str7;
        wo20Var.b = str8;
        wo20Var.c = str9;
        wo20Var.d = str6;
        wo20Var.e = str10;
        wo20Var.f = v4kVar;
        wo20Var.i = lastNickName;
        wo20Var.w = z2;
        wo20Var.y = zX;
        wo20Var.C = 2;
        Object objM = this.b.m(str7, wo20Var);
        if (objM != y5bVar) {
            String str40 = str10;
            z3 = z2;
            z4 = zX;
            str11 = str6;
            str12 = str8;
            v4kVar2 = v4kVar;
            obj = objM;
            str13 = lastNickName;
            str14 = str9;
            str15 = str7;
            str16 = str40;
            if (((Boolean) obj).booleanValue()) {
                str17 = str14;
                lastNickName = str13;
                v4kVar3 = v4kVar2;
                str8 = str12;
                str6 = str11;
                zX = z4;
                i = 1;
            } else {
                v4kVar = v4kVar2;
                str8 = str12;
                str6 = str11;
                zX = z4;
                z2 = z3;
                str10 = str16;
                str7 = str15;
                str9 = str14;
                lastNickName = str13;
                v4kVar3 = v4kVar;
                str17 = str9;
                str15 = str7;
                str16 = str10;
                z3 = z2;
                i = 0;
            }
            avatarUrl = uqmVar.getAvatarUrl();
            this.d.w(new Share(str15, v4kVar3.a.shareURL));
            if (z3) {
                b190 b190Var3 = new b190(v4kVar3.b, str17, lastNickName, str15);
                wo20Var.a = str15;
                wo20Var.b = str8;
                wo20Var.c = str17;
                wo20Var.d = str6;
                wo20Var.e = str16;
                wo20Var.f = v4kVar3;
                wo20Var.i = lastNickName;
                wo20Var.v = avatarUrl;
                wo20Var.w = z3;
                wo20Var.y = zX;
                wo20Var.z = i;
                wo20Var.C = 3;
                objA = this.e.a(b190Var3, wo20Var);
                if (objA != y5bVar) {
                    str25 = str17;
                    str18 = str15;
                    str26 = avatarUrl;
                    str27 = str16;
                    str28 = lastNickName;
                    obj = objA;
                    i2 = i;
                    str29 = str6;
                    z6 = zX;
                    c190Var = (c190) obj;
                    str19 = str28;
                    str22 = str27;
                    str21 = str29;
                    str20 = str25;
                    str23 = str8;
                    z5 = z6;
                    str24 = str26;
                    i = i2;
                }
            } else {
                str18 = str15;
                z5 = zX;
                str19 = lastNickName;
                str20 = str17;
                str21 = str6;
                str22 = str16;
                c190Var = new c190((String) null, 3);
                str23 = str8;
                str24 = avatarUrl;
            }
            String str313 = c190Var.a;
            String str314 = c190Var.b;
            if (str20 != null) {
                String str315 = v4kVar3.a.shareURL;
                str315.getClass();
                z7 = false;
                strP = c.p(str315, "shareCode=" + str18, "customCode=".concat(str20), false);
            } else {
                z7 = false;
                strP = v4kVar3.a.shareURL;
                strP.getClass();
            }
            String str316 = strP;
            if (str20 == null) {
                str30 = str18;
            } else {
                str30 = str20;
            }
            if (i != 0) {
                z7 = true;
            }
            return new wz80(str313, str314, str316, str30, str20, z7, z5, str19, str24, str23, str21, str22);
        }
        return y5bVar;
    }
}
