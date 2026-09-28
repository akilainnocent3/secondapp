package defpackage;

import com.google.protobuf.DescriptorProtos;
import com.google.protobuf.RuntimeVersion;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.luckynumber.search.data.LNRecentSearchDao", f = "LNRecentSearchDao.kt", l = {RuntimeVersion.MINOR, DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER}, m = "cleanupTable$suspendImpl", v = 2)
public final class v5r extends x1b {
    public w5r a;
    public long b;
    public /* synthetic */ Object c;
    public final /* synthetic */ w5r d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v5r(w5r w5rVar, x1b x1bVar) {
        super(x1bVar);
        this.d = w5rVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return w5r.a(this.d, 0L, this);
    }
}
