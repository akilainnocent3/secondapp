package defpackage;

import com.google.protobuf.DescriptorProtos;
import com.sportygames.newcms.CMSRes;
import java.io.File;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.newcms.loader.music.CMSMusicLoader", f = "CMSMusicLoader.kt", l = {DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER, 40, 75, 76}, m = "load", v = 1)
public final class lo5 extends x1b {
    public CMSRes.Data a;
    public String b;
    public xrw c;
    public File d;
    public String e;
    public String f;
    public String i;
    public /* synthetic */ Object v;
    public final /* synthetic */ mo5 w;
    public int y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lo5(mo5 mo5Var, x1b x1bVar) {
        super(x1bVar);
        this.w = mo5Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.v = obj;
        this.y |= Integer.MIN_VALUE;
        return this.w.a(null, null, null, this);
    }
}
