package defpackage;

import com.google.protobuf.DescriptorProtos;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.android.social.data.repository.SocialShareCodeMediator", f = "SocialShareCodeMediator.kt", l = {DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER, 52, 57, 63}, m = "loadMore", v = 2)
public final class rha0 extends x1b {
    public xqz a;
    public String b;
    public List c;
    public boolean d;
    public int e;
    public int f;
    public /* synthetic */ Object i;
    public final /* synthetic */ tha0 v;
    public int w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rha0(tha0 tha0Var, x1b x1bVar) {
        super(x1bVar);
        this.v = tha0Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.w |= Integer.MIN_VALUE;
        return this.v.c(null, false, this);
    }
}
