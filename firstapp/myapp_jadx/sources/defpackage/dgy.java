package defpackage;

import com.sportybet.android.data.SimpleResponseWrapper;

/* JADX INFO: loaded from: classes5.dex */
public final class dgy {
    public bcp a;

    public class a extends SimpleResponseWrapper<bcp> {
        public final /* synthetic */ lsm a;

        public a(lsm lsmVar) {
            this.a = lsmVar;
        }

        @Override // com.sportybet.android.data.SimpleResponseWrapper
        public final void onFailure(Throwable th) {
            dgy.this.a = new bcp();
        }

        @Override // com.sportybet.android.data.CallbackWrapper
        public final void onResponseComplete() {
            super.onResponseComplete();
            lsm lsmVar = this.a;
            if (lsmVar != null) {
                lsmVar.a(dgy.this.a);
            }
        }

        @Override // com.sportybet.android.data.SimpleResponseWrapper
        public final void onSuccess(bcp bcpVar) {
            dgy.this.a = bcpVar;
        }
    }

    /* JADX INFO: loaded from: classes7.dex */
    public static class b {
        public static final dgy a;

        static {
            dgy dgyVar = new dgy();
            dgyVar.a = new bcp();
            a = dgyVar;
        }
    }

    public final void a(lsm<bcp> lsmVar) {
        ap0.e().d().G(new a(lsmVar));
    }
}
