package defpackage;

import android.content.res.Configuration;
import com.google.protobuf.DescriptorProtos;

/* JADX INFO: loaded from: classes4.dex */
@c0d(c = "com.sportybet.android.share.domain.ShowOffShareImagesResolver", f = "ShowOffShareImagesResolver.kt", l = {DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER, DescriptorProtos.FileOptions.CC_ENABLE_ARENAS_FIELD_NUMBER, 32}, m = "resolve", v = 2)
public final class cb90 extends x1b {
    public String a;
    public Configuration b;
    public lyh c;
    public /* synthetic */ Object d;
    public final /* synthetic */ eb90 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cb90(eb90 eb90Var, x1b x1bVar) {
        super(x1bVar);
        this.e = eb90Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.a(null, null, this);
    }
}
