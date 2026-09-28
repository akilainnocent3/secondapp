package defpackage;

import com.sporty.android.core.model.pocket.globalpay.AvailableChannel;
import com.sporty.android.core.model.pocket.globalpay.ChannelData;
import com.sporty.android.core.model.pocket.globalpay.TypeData;
import com.sporty.android.core.model.service.CountryCodeName;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class m4k {
    public final psm a;
    public final sr10 b;

    public m4k(psm psmVar, sr10 sr10Var) {
        psmVar.getClass();
        sr10Var.getClass();
        this.a = psmVar;
        this.b = sr10Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Serializable a(f600 f600Var, x1b x1bVar) {
        l4k l4kVar;
        psm psmVar = this.a;
        if (x1bVar instanceof l4k) {
            l4kVar = (l4k) x1bVar;
            int i = l4kVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                l4kVar.c = i - Integer.MIN_VALUE;
            } else {
                l4kVar = new l4k(this, x1bVar);
            }
        } else {
            l4kVar = new l4k(this, x1bVar);
        }
        Object objP = l4kVar.a;
        y5b y5bVar = y5b.a;
        int i2 = l4kVar.c;
        try {
            if (i2 == 0) {
                uj50.b(objP);
                zi50.a aVar = zi50.b;
                sr10 sr10Var = this.b;
                String strF = psmVar.f();
                CountryCodeName countryCode = psmVar.getCountryCode();
                String str = f600Var.a;
                l4kVar.c = 1;
                objP = sr10Var.P(strF, countryCode, str, l4kVar);
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
            List<TypeData> types = fdv.b((AvailableChannel) objP).getTypes();
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = types.iterator();
            while (it.hasNext()) {
                List<ChannelData> channels = ((TypeData) it.next()).getChannels();
                if (channels == null) {
                    channels = m2g.a;
                }
                p48.w(channels, arrayList);
            }
            ArrayList arrayList2 = new ArrayList();
            int size = arrayList.size();
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayList.get(i3);
                i3++;
                ChannelData channelData = (ChannelData) obj;
                Map<Integer, d800> map = r67.a;
                channelData.getClass();
                int id = channelData.getId();
                c100 c100Var = c100.e;
                if (id == 35001 || channelData.getId() == 35002 || channelData.getId() == 36001 || channelData.getId() == 36002) {
                    arrayList2.add(obj);
                }
            }
            if (arrayList2.isEmpty()) {
                throw new du7();
            }
            zi50.a aVar2 = zi50.b;
            return arrayList2;
        } catch (Throwable th) {
            zi50.a aVar3 = zi50.b;
            return new zi50.b(th);
        }
    }
}
