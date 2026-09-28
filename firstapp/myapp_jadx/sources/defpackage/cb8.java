package defpackage;

import com.sporty.android.core.model.config.bo.BOConfigDeserializeOption;
import com.sporty.android.core.model.config.bo.BOConfigParamDto;
import com.sporty.android.core.model.config.bo.enums.BOConfigAppId;
import com.sporty.android.core.model.config.bo.enums.BOConfigNamespace;
import com.sporty.android.core.model.pay.bo.PhonePrefixData;
import com.sporty.android.core.model.pocket.common.AssetData;
import com.sporty.android.core.model.pocket.common.PaymentChannel;
import com.sporty.android.core.model.service.CountryCodeName;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.text.StringsKt;
import kotlin.text.c;

/* JADX INFO: loaded from: classes6.dex */
public final class cb8 implements g77 {
    public final psm a;
    public final pr10 b;
    public final x8 c;
    public final lq1 d;
    public List<PaymentChannel> e;
    public List<PhonePrefixData> f;

    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[CountryCodeName.values().length];
            try {
                iArr[CountryCodeName.TANZANIA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CountryCodeName.UGANDA.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CountryCodeName.ZAMBIA.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            a = iArr;
        }
    }

    public cb8(psm psmVar, pr10 pr10Var, x8 x8Var, rdt rdtVar, lq1 lq1Var) {
        this.a = psmVar;
        this.b = pr10Var;
        this.c = x8Var;
        this.d = lq1Var;
        this.e = rdt.a(psmVar.getCountryCode());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.g77
    public final Object a(x1b x1bVar) {
        gb8 gb8Var;
        String str;
        String channel;
        AssetData.MobileBean mobileBean;
        if (x1bVar instanceof gb8) {
            gb8Var = (gb8) x1bVar;
            int i = gb8Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                gb8Var.c = i - Integer.MIN_VALUE;
            } else {
                gb8Var = new gb8(this, x1bVar);
            }
        } else {
            gb8Var = new gb8(this, x1bVar);
        }
        Object objD = gb8Var.a;
        Serializable serializable = y5b.a;
        int i2 = gb8Var.c;
        if (i2 == 0) {
            uj50.b(objD);
            int i3 = a.a[this.a.getCountryCode().ordinal()];
            if (i3 == 1) {
                gb8Var.c = 1;
                pfd pfdVar = fse.a;
                objD = ej5.d(odd.b, new db8(this, null), gb8Var);
                if (objD != serializable) {
                }
            } else {
                if (i3 != 2 && i3 != 3) {
                    return m2g.a;
                }
                v8 accountInfo = this.c.getAccountInfo();
                if (accountInfo == null || (str = accountInfo.a) == null) {
                    return m2g.a;
                }
                gb8Var.c = 3;
                Serializable serializableC = c(str, gb8Var);
                if (serializableC != serializable) {
                    return serializableC;
                }
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                uj50.b(objD);
                return objD;
            }
            if (i2 == 3) {
                uj50.b(objD);
                return objD;
            }
            ib5.a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        uj50.b(objD);
        AssetData assetData = (AssetData) objD;
        if (assetData == null) {
            return m2g.a;
        }
        List<AssetData.MobileBean> mobileMoneys = assetData.getMobileMoneys();
        if (mobileMoneys == null || (mobileBean = (AssetData.MobileBean) CollectionsKt.firstOrNull(mobileMoneys)) == null || (channel = mobileBean.getChannel()) == null) {
            channel = "";
        }
        gb8Var.c = 2;
        Serializable serializableB = b(channel, gb8Var);
        return serializableB == serializable ? serializable : serializableB;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Serializable b(String str, x1b x1bVar) {
        eb8 eb8Var;
        if (x1bVar instanceof eb8) {
            eb8Var = (eb8) x1bVar;
            int i = eb8Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                eb8Var.d = i - Integer.MIN_VALUE;
            } else {
                eb8Var = new eb8(this, x1bVar);
            }
        } else {
            eb8Var = new eb8(this, x1bVar);
        }
        Object obj = eb8Var.b;
        y5b y5bVar = y5b.a;
        int i2 = eb8Var.d;
        if (i2 == 0) {
            uj50.b(obj);
            if (str.length() == 0) {
                return m2g.a;
            }
            eb8Var.a = str;
            eb8Var.d = 1;
            if (d(eb8Var) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str = eb8Var.a;
            uj50.b(obj);
        }
        List<PaymentChannel> list = this.e;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            String channelShowName = ((PaymentChannel) obj2).getChannelShowName();
            if (channelShowName.length() > 0 && StringsKt.M(str, channelShowName, true)) {
                arrayList.add(obj2);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Serializable c(String str, x1b x1bVar) {
        fb8 fb8Var;
        Object next;
        if (x1bVar instanceof fb8) {
            fb8Var = (fb8) x1bVar;
            int i = fb8Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                fb8Var.d = i - Integer.MIN_VALUE;
            } else {
                fb8Var = new fb8(this, x1bVar);
            }
        } else {
            fb8Var = new fb8(this, x1bVar);
        }
        Object obj = fb8Var.b;
        y5b y5bVar = y5b.a;
        int i2 = fb8Var.d;
        if (i2 == 0) {
            uj50.b(obj);
            if (str.length() == 0 || this.e.isEmpty()) {
                return m2g.a;
            }
            fb8Var.a = str;
            fb8Var.d = 1;
            if (d(fb8Var) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str = fb8Var.a;
            uj50.b(obj);
        }
        if (str.length() < 10) {
            str = String.format(Locale.getDefault(), "%010d", Arrays.copyOf(new Object[]{new Integer(Integer.parseInt(str))}, 1));
        }
        List<PaymentChannel> list = this.e;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            Iterator<T> it = ((PaymentChannel) obj2).getSignificantNumbers().iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!c.u(str, (String) next, false));
            if (next != null) {
                arrayList.add(obj2);
            }
        }
        return arrayList;
    }

    public final Object d(x1b x1bVar) {
        if (this.f != null) {
            return Unit.a;
        }
        BOConfigParamDto bOConfigParamDto = new BOConfigParamDto(BOConfigAppId.COMMON, BOConfigNamespace.CONFIG, "phone_number_prefix", new BOConfigDeserializeOption.WithKClass(jq40.a(PhonePrefixData[].class)));
        return kzh.b(new wl50(this.d.c(kotlin.collections.a.c(bOConfigParamDto)), new oq1(bOConfigParamDto)), new hb8(this, null), x1bVar);
    }
}
