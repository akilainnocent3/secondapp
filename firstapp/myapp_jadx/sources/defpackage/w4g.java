package defpackage;

import com.sportybet.feature.debugscreen.impl.encrypt.data.EncryptedRequest;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class w4g extends xbs<EncryptedRequest> {
    public final /* synthetic */ v4g e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w4g(bw50 bw50Var, v4g v4gVar, lv50 lv50Var, String[] strArr) {
        super(bw50Var, lv50Var, strArr);
        this.e = v4gVar;
    }

    @Override // defpackage.xbs
    public final Object e(bw50 bw50Var, int i, v1b<? super List<? extends EncryptedRequest>> v1bVar) {
        return qlc.c(v1bVar, this.e.a, new aj7(bw50Var, 1), true, false);
    }
}
