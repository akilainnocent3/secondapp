package defpackage;

import com.sporty.android.core.model.pocket.globalpay.AvailableChannel;
import com.sporty.android.core.model.pocket.globalpay.ChannelData;
import com.sporty.android.core.model.pocket.globalpay.TypeData;
import com.sporty.android.core.model.service.CountryCodeName;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class abk {
    public final psm a;
    public final sr10 b;

    public abk(psm psmVar, sr10 sr10Var) {
        psmVar.getClass();
        sr10Var.getClass();
        this.a = psmVar;
        this.b = sr10Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object a(f600 f600Var, x1b x1bVar) {
        zak zakVar;
        Object next;
        List<ChannelData> channels;
        psm psmVar = this.a;
        if (x1bVar instanceof zak) {
            zakVar = (zak) x1bVar;
            int i = zakVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                zakVar.c = i - Integer.MIN_VALUE;
            } else {
                zakVar = new zak(this, x1bVar);
            }
        } else {
            zakVar = new zak(this, x1bVar);
        }
        Object objP = zakVar.a;
        y5b y5bVar = y5b.a;
        int i2 = zakVar.c;
        ChannelData channelData = null;
        try {
            if (i2 == 0) {
                uj50.b(objP);
                zi50.a aVar = zi50.b;
                sr10 sr10Var = this.b;
                String strF = psmVar.f();
                CountryCodeName countryCode = psmVar.getCountryCode();
                String str = f600Var.a;
                zakVar.c = 1;
                objP = sr10Var.P(strF, countryCode, str, zakVar);
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
            Iterator<T> it = fdv.b((AvailableChannel) objP).getTypes().iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!Intrinsics.g(((TypeData) next).getType(), "Pix"));
            TypeData typeData = (TypeData) next;
            if (typeData != null && (channels = typeData.getChannels()) != null) {
                channelData = (ChannelData) CollectionsKt.firstOrNull(channels);
            }
            if (channelData == null) {
                throw new ud10();
            }
            zi50.a aVar2 = zi50.b;
            return channelData;
        } catch (Throwable th) {
            zi50.a aVar3 = zi50.b;
            return new zi50.b(th);
        }
    }
}
