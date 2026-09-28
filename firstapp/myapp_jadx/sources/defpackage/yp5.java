package defpackage;

import com.sportygames.newcms.d;
import java.io.Reader;
import java.util.LinkedHashMap;
import okhttp3.Response;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.newcms.CMSUseCase", f = "CMSUseCase.kt", l = {180}, m = "downloadPage", v = 1)
public final class yp5 extends x1b {
    public String a;
    public LinkedHashMap b;
    public Response c;
    public Reader d;
    public /* synthetic */ Object e;
    public final /* synthetic */ d f;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yp5(d dVar, x1b x1bVar) {
        super(x1bVar);
        this.f = dVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.i |= Integer.MIN_VALUE;
        return this.f.b(this, null, null);
    }
}
