package defpackage;

import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import okhttp3.Request;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class k4z implements BiFunction {
    public final /* synthetic */ apm a;

    @Override // java.util.function.BiFunction
    public final Object apply(Object obj, Object obj2) throws Exception {
        ktu ktuVar = (ktu) obj;
        int iIntValue = ((Integer) obj2).intValue();
        apm apmVar = this.a;
        if (apmVar.b.get()) {
            return rm8.f;
        }
        w0h.a aVar = new w0h.a(apmVar.e.a.a(iIntValue));
        rm8 rm8Var = new rm8();
        xpm xpmVar = apmVar.d;
        int iA = ktuVar.a();
        final yom yomVar = new yom(apmVar, rm8Var, aVar);
        final zom zomVar = new zom(apmVar, rm8Var, aVar);
        final lmy lmyVar = (lmy) xpmVar;
        rna rnaVar = lmyVar.d;
        final Request.Builder builderUrl = new Request.Builder().url(lmyVar.c);
        Map<String, List<String>> map = lmyVar.f.get();
        if (map != null) {
            map.forEach(new BiConsumer() { // from class: hmy
                @Override // java.util.function.BiConsumer
                public final void accept(Object obj3, Object obj4) {
                    final String str = (String) obj3;
                    final Request.Builder builder = builderUrl;
                    ((List) obj4).forEach(new Consumer() { // from class: jmy
                        @Override // java.util.function.Consumer
                        public final void accept(Object obj5) {
                            builder.addHeader(str, (String) obj5);
                        }
                    });
                }
            });
        }
        lmy.b bVar = new lmy.b(ktuVar, lmyVar.e, iA, lmyVar.g);
        if (rnaVar != null) {
            builderUrl.addHeader("Content-Encoding", rnaVar.getEncoding());
            builderUrl.post(new lmy.a(rnaVar, bVar));
        } else {
            builderUrl.post(bVar);
        }
        Runnable runnable = new Runnable() { // from class: imy
            @Override // java.lang.Runnable
            public final void run() {
                FirebasePerfOkHttpClient.enqueue(lmyVar.b.newCall(builderUrl.build()), new kmy(zomVar, yomVar));
            }
        };
        rn70 rn70VarD = m0b.current().a(xhj.b, Boolean.TRUE).d();
        try {
            runnable.run();
            if (rn70VarD != null) {
                rn70VarD.close();
            }
            return rm8Var;
        } catch (Throwable th) {
            if (rn70VarD != null) {
                try {
                    rn70VarD.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }
}
