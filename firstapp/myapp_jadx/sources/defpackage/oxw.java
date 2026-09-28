package defpackage;

import com.sportybet.android.data.SimpleResponseWrapper;
import com.sportybet.plugin.realsports.data.MyFavoriteMarket;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class oxw {
    public ssw<hqc> a;

    public class a extends SimpleResponseWrapper<List<MyFavoriteMarket>> {
        public a() {
        }

        @Override // com.sportybet.android.data.SimpleResponseWrapper
        public final void onFailure(Throwable th) {
            super.onFailure(th);
            oxw.this.a.m(new kqc());
        }

        @Override // com.sportybet.android.data.SimpleResponseWrapper
        public final void onSuccess(List<MyFavoriteMarket> list) {
            oxw.this.a.m(new nqc(list));
        }
    }

    public final void a(String str) {
        this.a.m(new lqc());
        ap0.b().P(str).G(new a());
    }
}
