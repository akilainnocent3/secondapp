package defpackage;

import com.sporty.android.core.model.pocket.common.ChannelAsset;
import com.sporty.android.core.model.service.CountryCodeName;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class l5k {
    public final sr10 a;
    public final d100 b;
    public final psm c;

    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[CountryCodeName.values().length];
            try {
                iArr[CountryCodeName.GHANA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CountryCodeName.TANZANIA.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CountryCodeName.ZAMBIA.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            a = iArr;
        }
    }

    public l5k(sr10 sr10Var, d100 d100Var, psm psmVar) {
        sr10Var.getClass();
        d100Var.getClass();
        psmVar.getClass();
        this.a = sr10Var;
        this.b = d100Var;
        this.c = psmVar;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0078  */
    /* JADX WARN: Code duplicated, block: B:34:0x007b  */
    /* JADX WARN: Code duplicated, block: B:39:0x0085  */
    /* JADX WARN: Code duplicated, block: B:43:0x009a  */
    /* JADX WARN: Code duplicated, block: B:45:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:46:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:53:0x00b9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:0x0094 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Serializable a(x1b x1bVar) {
        m5k m5kVar;
        ChannelAsset channelAsset;
        ChannelAsset channelAsset2;
        lk50.c cVar;
        String str;
        ArrayList arrayList;
        ihk.b bVarC;
        p400 p400Var;
        if (x1bVar instanceof m5k) {
            m5kVar = (m5k) x1bVar;
            int i = m5kVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                m5kVar.d = i - Integer.MIN_VALUE;
            } else {
                m5kVar = new m5k(this, x1bVar);
            }
        } else {
            m5kVar = new m5k(this, x1bVar);
        }
        Object objP = m5kVar.b;
        y5b y5bVar = y5b.a;
        int i2 = m5kVar.d;
        if (i2 == 0) {
            uj50.b(objP);
            g1i g1iVarR = this.a.R(new pu0.a(0));
            m5kVar.d = 1;
            objP = bm50.p(g1iVarR, m5kVar);
            if (objP != y5bVar) {
            }
            return y5bVar;
        }
        if (i2 == 1) {
            uj50.b(objP);
        } else {
            if (i2 != 2) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            channelAsset2 = m5kVar.a;
            uj50.b(objP);
        }
        if (objP instanceof lk50.c) {
            cVar = (lk50.c) objP;
        } else {
            cVar = null;
        }
        if (cVar != null || (str = (String) cVar.a) == null) {
            str = "Hubtel";
        }
        List<ChannelAsset.Channel> entityList = channelAsset2.getEntityList();
        arrayList = new ArrayList();
        for (ChannelAsset.Channel channel : entityList) {
            bVarC = w3w.c(channel, str);
            if (bVarC != null) {
                p400Var = new p400(channel.getChannelShowName(), bVarC.d, null, channel.getChannelIconUrl());
            } else {
                p400Var = null;
            }
            if (p400Var != null) {
                arrayList.add(p400Var);
            }
        }
        return arrayList;
        lk50.c cVar2 = objP instanceof lk50.c ? (lk50.c) objP : null;
        if (cVar2 == null || (channelAsset = (ChannelAsset) cVar2.a) == null) {
            return m2g.a;
        }
        wl50 wl50VarJ = this.b.j();
        m5kVar.a = channelAsset;
        m5kVar.d = 2;
        Object objP2 = bm50.p(wl50VarJ, m5kVar);
        if (objP2 != y5bVar) {
            objP = objP2;
            channelAsset2 = channelAsset;
            if (objP instanceof lk50.c) {
                cVar = (lk50.c) objP;
            } else {
                cVar = null;
            }
            if (cVar != null) {
                str = "Hubtel";
            } else {
                str = "Hubtel";
            }
            List<ChannelAsset.Channel> entityList2 = channelAsset2.getEntityList();
            arrayList = new ArrayList();
            while (r7.hasNext()) {
                bVarC = w3w.c(channel, str);
                if (bVarC != null) {
                    p400Var = new p400(channel.getChannelShowName(), bVarC.d, null, channel.getChannelIconUrl());
                } else {
                    p400Var = null;
                }
                if (p400Var != null) {
                    arrayList.add(p400Var);
                }
            }
            return arrayList;
        }
        return y5bVar;
    }

    /* JADX WARN: Code duplicated, block: B:57:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:59:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:62:0x0115  */
    /* JADX WARN: Code duplicated, block: B:65:0x011a  */
    /* JADX WARN: Code duplicated, block: B:66:0x011d  */
    /* JADX WARN: Code duplicated, block: B:68:0x0120  */
    /* JADX WARN: Code duplicated, block: B:69:0x0125  */
    /* JADX WARN: Code duplicated, block: B:71:0x0128  */
    /* JADX WARN: Code duplicated, block: B:74:0x0135  */
    /* JADX WARN: Code duplicated, block: B:76:0x0138  */
    /* JADX WARN: Code duplicated, block: B:78:0x013e  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code duplicated, block: B:80:0x0142  */
    /* JADX WARN: Code duplicated, block: B:81:0x0147  */
    /* JADX WARN: Code duplicated, block: B:83:0x014e  */
    /* JADX WARN: Code duplicated, block: B:85:0x0159  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:62:0x0115 -> B:63:0x0116). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:83:0x014e -> B:84:0x0154). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object b(defpackage.x1b r11) {
        /*
            Method dump skipped, instruction units count: 348
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l5k.b(x1b):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object c(x1b x1bVar) {
        o5k o5kVar;
        List listC;
        if (x1bVar instanceof o5k) {
            o5kVar = (o5k) x1bVar;
            int i = o5kVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                o5kVar.c = i - Integer.MIN_VALUE;
            } else {
                o5kVar = new o5k(this, x1bVar);
            }
        } else {
            o5kVar = new o5k(this, x1bVar);
        }
        Object objP = o5kVar.a;
        y5b y5bVar = y5b.a;
        int i2 = o5kVar.c;
        if (i2 == 0) {
            uj50.b(objP);
            g1i g1iVarG = this.a.g(pu0.b.a);
            o5kVar.c = 1;
            objP = bm50.p(g1iVarG, o5kVar);
            if (objP == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(objP);
        }
        lk50.c cVar = objP instanceof lk50.c ? (lk50.c) objP : null;
        if (cVar == null) {
            return m2g.a;
        }
        ChannelAsset.Channel channel = (ChannelAsset.Channel) cVar.a;
        if (!channel.isSupportPayBill()) {
            return m2g.a;
        }
        jck0.b bVarD = w3w.d(channel);
        return (bVarD == null || (listC = kotlin.collections.a.c(y000.b(bVarD, null, null, 7))) == null) ? m2g.a : listC;
    }
}
