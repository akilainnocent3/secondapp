package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sportybet.plugin.realsports.data.MyFavoriteSport;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class cyw implements ayw {
    public final z7h a;
    public final wwd0 b;
    public ArrayList c;
    public long d;
    public final LinkedHashMap e;
    public su5<BaseResponse<List<MyFavoriteSport>>> f;

    public cyw(z7h z7hVar) {
        z7hVar.getClass();
        this.a = z7hVar;
        this.b = xwd0.a(new jqc());
        ArrayList arrayListC = lfb0.d().c();
        int iA = jpu.a(l48.r(arrayListC, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(iA < 16 ? 16 : iA);
        int size = arrayListC.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayListC.get(i);
            i++;
            String id = ((mfb0) obj).getId();
            id.getClass();
            linkedHashMap.put(id, obj);
        }
        this.e = linkedHashMap;
    }

    @Override // defpackage.ayw
    public final r5b b() {
        return i2i.c(this.b, null, 3);
    }

    @Override // defpackage.ayw
    public final void getAll() {
        ArrayList arrayList;
        long jCurrentTimeMillis = System.currentTimeMillis() - this.d;
        wwd0 wwd0Var = this.b;
        if (jCurrentTimeMillis <= 3600000 && (arrayList = this.c) != null) {
            wwd0Var.k(null, new nqc(arrayList));
            return;
        }
        wwd0Var.k(null, new lqc());
        su5<BaseResponse<List<MyFavoriteSport>>> su5Var = this.f;
        if (su5Var != null) {
            su5Var.cancel();
        }
        su5<BaseResponse<List<MyFavoriteSport>>> su5VarE = this.a.E();
        this.f = su5VarE;
        if (su5VarE != null) {
            su5VarE.G(new byw(this));
        }
    }

    @Override // defpackage.ayw
    public final void a(ve20 ve20Var) {
    }
}
